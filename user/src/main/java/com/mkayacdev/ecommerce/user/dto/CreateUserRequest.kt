package com.mkayacdev.ecommerce.user.dto

data class CreateUserRequest(
    val mail: String?,
    val firstName: String?,
    val surname: String?,
    val middleName: String?,
)
