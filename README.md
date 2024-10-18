# Mail Using Spring Boot Application

This is a simple Spring Boot application that sends emails using JavaMailSender. It allows users to specify the recipient, subject, and body of the email. The application is configured to use Gmail’s SMTP server for sending emails.

## Features

- Sends emails through Gmail's SMTP server.
- Users can input the recipient’s email address, subject, and body of the email at runtime using the `Scanner` class.
- Demonstrates Spring Boot’s email-sending functionality via `JavaMailSender`.

## Prerequisites

Before you begin, ensure you have the following installed:

- **Java Development Kit (JDK)** 8 or later
- **Maven** 3.6.3 or later
- **Spring Boot** 2.5.x or later
- A **Gmail** account (for email sending)

## Project Setup

### 1. Clone the repository

```bash
git clone https://github.com/lamagokulakrishnan/mail-spring-boot.git
cd mail-spring-boot
```

### 2. Configure Gmail Credentials

Edit the `MailConfig.java` file located in `src/main/java/com/example/SpringMail/config` and update the following lines with your Gmail credentials:

```java
mailSender.setUsername("your-gmail id");
mailSender.setPassword("your-gmail-password");
```

### 3. Enable Less Secure Apps in Gmail

To send emails through Gmail’s SMTP server, you need to allow less secure apps to access your Gmail account:

1. Go to [Less secure app access](https://myaccount.google.com/lesssecureapps).
2. Enable access for less secure apps.

> **Note:** For better security, it’s recommended to use [App Passwords](https://support.google.com/accounts/answer/185833) for Gmail instead of your actual account password.

### 4. Build the project

Use Maven to build the project. Run the following command from the project root:

```bash
mvn clean install
```

### 5. Run the application

Once the build is complete, run the application using Maven:

```bash
mvn spring-boot:run
```

Alternatively, you can run the `SpringMailApplication.java` directly from your IDE.

## How to Use

When you run the application, you will be prompted to enter the following information in the terminal/console:

1. **Recipient Email** – The email address to send the mail to.
2. **Subject** – The subject of the email.
3. **Message** – The content of the email body.


## Project Structure

```
src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           └── SpringMail
│   │               ├── SpringMailApplication.java  
│   │               ├── config
│   │               │   └── MailConfig.java         
│   │               └── service
│   │                   └── EmailSenderService.java 
│   └── resources
│       └── application.properties                  
```
## Contributing

Feel free to submit pull requests or open issues if you find any bugs or have suggestions for improvements.

## License

This project is licensed under the MIT License.
