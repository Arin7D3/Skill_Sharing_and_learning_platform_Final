# User Management, Authentication, and Comment Module

This module handles user registration, OAuth2.0 authentication, profile management, follow/unfollow functionality, and user comments on posts and learning plans.

## 🔐 Features

- **OAuth 2.0 Login** with secure token storage
- **User Profile**: View, update, and manage profile details
- **Follow/Unfollow**: Connect with other users and see their activities
- **Commenting**: Post, update, and delete comments on skills or learning plans

## 🧾 Technologies Used

- Spring Boot Security with OAuth2.0
- JWT for session management
- JPA/Hibernate for database operations
- PostgreSQL/MySQL (configurable)

## 🔐 Authentication & Authorization

- OAuth2.0 provider: Google/GitHub
- All protected routes require a valid bearer token.

## 🚧 Future Enhancements

- Email verification on signup
- Comment reply threads
