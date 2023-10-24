package com.example.depsmanagement.feature.second.domain

import com.example.depsmanagement.model.SecondFeatureEntity

interface SecondFeatureEntityRepository {

    suspend fun insertEntity(entity: SecondFeatureEntity)

    suspend fun queryAllEntities(): List<SecondFeatureEntity>

}