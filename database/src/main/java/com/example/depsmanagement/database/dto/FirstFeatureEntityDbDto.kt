package com.example.depsmanagement.database.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "first_feature_entity")
data class FirstFeatureEntityDbDto(
    @PrimaryKey
    val id: String,
    val value1: String,
    val value2: String,
)