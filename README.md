<h1>🔗 Serverless (FaaS) Architecture:</h1>

<h2>🔹1. Kiến trúc tổng thể Serverless Architecture (FaaS)</h2>

Serverless Architecture là mô hình trong đó bạn không cần quản lý máy chủ (server). Thay vào đó, bạn viết các function xử lý từng tác vụ cụ thể, và các nền tảng như AWS Lambda, Azure Functions, Google Cloud Functions sẽ chịu trách nhiệm triển khai, mở rộng, và vận hành:
Kiến trúc tổng thể gồm các thành phần:

- API Gateway: Tiếp nhận HTTP request.

- Function (Lambda): Logic nghiệp vụ chia thành các đơn vị độc lập.

- Event Sources: Trigger như HTTP, message queue (SQS), DB change (DynamoDB stream), file upload (S3).

- Storage: S3, DynamoDB, RDS.

- Queue/Event Bus: SNS, SQS, Kafka, EventBridge để phối hợp giữa các function.


Ví dụ: Khi một người dùng tải lên một tệp vào S3, sự kiện này có thể kích hoạt một hàm Lambda để xử lý tệp đó.

Flow: [Client] → [API Gateway] → [Lambda Function] → [DynamoDB/S3/SQS/...]

<h2>🔹2. Cấu trúc thư mục dự án Serverless Architecture (FaaS) 📁</h2>

![image](https://github.com/user-attachments/assets/86087f01-d351-46f6-8a4c-3898ae9883e6)

<h2>🔹3. Mã nguồn mẫu</h2>

```https://github.com/thinhotwp1/Serverless-Architecture```

<h2>🔹4. Ưu điểm của Serverless Architecture (FaaS) ✅</h2>

![image](https://github.com/user-attachments/assets/fb41f6a7-9003-4a3a-a480-ef3b125ba589)

<h2>🔹5. Một số dự án thực tế sử dụng Serverless Architecture (FaaS) 🛠</h2>

![image](https://github.com/user-attachments/assets/4018f168-5f32-4812-a406-bbc970ec24b3)

<h2>🔹6. Khi nào nên dùng Serverless Architecture (FaaS)</h2>

![image](https://github.com/user-attachments/assets/b7a050c9-0e60-479c-921b-4b2a37a5d57f)
