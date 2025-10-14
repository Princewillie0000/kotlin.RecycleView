package com.example.recyclerviewexample

data class EmployeeUIModel(
    val name: String,
    val biography: String,
    val role: EmployeeRole,
    val gender: Gender,
    val imageUrl: String
) {
}