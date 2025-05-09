package com.example.demo.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.events.DynamodbEvent;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.models.dynamodb.AttributeValue;
import com.example.demo.model.User;

import java.util.Map;

public class DynamoDBStreamHandler implements RequestHandler<DynamodbEvent, Void> {

    @Override
    public Void handleRequest(DynamodbEvent event, Context context) {
        for (DynamodbEvent.DynamodbStreamRecord record : event.getRecords()) {
            if ("INSERT".equals(record.getEventName())) {
                Map<String, AttributeValue> newImage = record.getDynamodb().getNewImage();
                String userId = newImage.get("userId").getS();
                String email = newImage.get("email").getS();

                // Convert message to model
                User newUser = new User(userId, email);
                context.getLogger().log("Inserted user: " + newUser);

                // Mock notification: log to CloudWatch
                context.getLogger().log("New user registered: " + userId + ", sending email to: " + email);

                // Optional: send to SNS, SES, or 3rd party API here
            }
        }
        return null;
    }
}
