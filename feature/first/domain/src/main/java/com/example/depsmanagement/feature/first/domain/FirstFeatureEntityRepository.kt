package com.example.depsmanagement.feature.first.domain

import com.example.depsmanagement.model.FirstFeatureEntity

interface FirstFeatureEntityRepository {

    suspend fun insertEntity(entity: FirstFeatureEntity)

    suspend fun queryAllEntities(): List<FirstFeatureEntity>

}