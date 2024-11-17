# 🚀 Real-Time-Chat-App with Kafka & Redis 💬
Welcome to my project where I built a real-time chat application using Apache Kafka and Redis! This application showcases a bidirectional communication system that dynamically switches between Producer and Consumer roles, enabling seamless message exchange between users.

🛠️ Technologies Used

🔑 Kafka: Reliable, distributed message queue for asynchronous messaging.
⚡ Redis: In-memory data store used as a cache for message storage and retrieval.
💻 Spring Boot: Framework for building RESTful APIs and backend logic.
💬 Postman: For testing and demonstrating API endpoints.
✨ Features

📨 Asynchronous Messaging: Utilizes Kafka for real-time messaging between users.
⚡ High-Speed Message Retrieval: Redis ensures fast caching and message retrieval.
🔄 Dynamic Role Switching: Users switch roles between Producer and Consumer for bidirectional messaging.
🚀 Real-Time Communication: Experience how Kafka and Redis can deliver seamless, low-latency communication.
🔑 Easy Setup: Simple API integration with Spring Boot, Postman, and Redis.
💡 What I Learned

Mastered integrating Kafka and Redis to build scalable, real-time applications.
Gained hands-on experience with event-driven architecture and message-driven systems.
Improved backend development skills with Spring Boot for API design and management.
Learned how to optimize data flow and message caching for real-time systems.
🚀 How to Run the Project

1️⃣ Clone the Repository
git clone https://github.com/yourusername/chat-app-kafka-redis.git
cd chat-app-kafka-redis
2️⃣ Set Up Docker for Redis
Ensure you have Docker installed, then run the Redis container:

docker run -d -p 6379:6379 redis:latest
3️⃣ Run Spring Boot Application
Run the Spring Boot application:

./mvnw spring-boot:run
4️⃣ Test Using Postman
Use the following API endpoints for testing:

POST /cache/send: Send messages between users.
GET /cache/retrieve: Retrieve messages between users.
🔧 API Endpoints

POST /cache/send
Description: Sends a message from one user to another.
Parameters: key, message
GET /cache/retrieve
Description: Retrieves messages sent between users.
Parameters: key

🤝 Contributing

Feel free to open an issue or submit a pull request if you have suggestions or improvements for this project! I’m always open to feedback and contributions.

📩 Contact

Feel free to reach out for collaboration or if you want to chat about this project!

LinkedIn: https://www.linkedin.com/in/vaibhav-shekhar-028325228
🚀 Future Improvements

💡 Message Persistence: Add persistent storage for messages.
🔔 Real-Time Notifications: Implement notifications for new messages.
🔐 Enhanced Security: Integrate basic security features like JWT.
