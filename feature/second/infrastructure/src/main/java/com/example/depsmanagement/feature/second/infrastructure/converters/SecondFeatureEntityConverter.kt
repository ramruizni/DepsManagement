package com.example.depsmanagement.feature.second.infrastructure.converters

import com.example.depsmanagement.database.dto.SecondFeatureEntityDbDto
import com.example.depsmanagement.model.SecondFeatureEntity

fun SecondFeatureEntityDbDto.convertToSecondFeatureEntity(): SecondFeatureEntity {
    return SecondFeatureEntity(
        value1 = this.value1,
        value2 = this.value2,
    )
}

fun SecondFeatureEntity.convertToSecondFeatureEntityDbDto(): SecondFeatureEntityDbDto {
    return SecondFeatureEntityDbDto(
        id = this.id,
        value1 = this.value1,
        value2 = this.value2,
    )
}