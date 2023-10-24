package com.example.depsmanagement.model

import java.util.UUID

data class SecondFeatureEntity(
    val id: String = UUID.randomUUID().toString(),
    val value1: String = "fakeValue1",
    val value2: String = "fakeValue2",
)