# swiftly-user-service
Manage user-related data and operations such as registration, authentication, and profile management.

## APIs
Note: base endpoint: /api/users

### POST /register
* Purpose: Register a new user in the system. 
* Description: Creates a user profile with essential details like name, email, password, and role.

### POST /login
* Purpose: Authenticate a user. 
* Description: Verifies the user's credentials and returns a session token if successful.

### POST /logout
* Purpose: Logout a user. 
* Description: Ends the user's session and invalidates the session token.

### GET /{userId}
* Purpose: Retrieve user details.
* Description: Fetches information for a specific user by their user ID.

### PUT /{userId}
* Purpose: Update user information.
* Description: Modifies the details of an existing user (e.g., updating email or contact information).

### DELETE /{userId}
* Purpose: Delete a user account.
* Description: Removes the user profile from the system.

### GET /{userId}/roles
* Purpose: Get the roles of a specific user. 
* Description: Retrieves the list of roles assigned to the user (e.g., admin, customer).

### PUT {userId}/roles
* Purpose: Update the roles of a specific user.
* Description: Assigns or updates roles for the user.
