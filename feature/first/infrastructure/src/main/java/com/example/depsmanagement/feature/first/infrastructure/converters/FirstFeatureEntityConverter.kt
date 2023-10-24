package com.example.depsmanagement.feature.first.infrastructure.converters

import com.example.depsmanagement.database.dto.FirstFeatureEntityDbDto
import com.example.depsmanagement.model.FirstFeatureEntity

fun FirstFeatureEntityDbDto.convertToFirstFeatureEntity(): FirstFeatureEntity {
    return FirstFeatureEntity(
        value1 = this.value1,
        value2 = this.value2,
    )
}

fun FirstFeatureEntity.convertToFirstFeatureEntityDbDto(): FirstFeatureEntityDbDto {
    return FirstFeatureEntityDbDto(
        id = this.id,
        value1 = this.value1,
        value2 = this.value2,
    )
}