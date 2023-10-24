package com.example.depsmanagement.feature.second.infrastructure

import com.example.depsmanagement.database.dao.SecondFeatureEntityDao
import com.example.depsmanagement.feature.second.domain.SecondFeatureEntityRepository
import com.example.depsmanagement.feature.second.infrastructure.converters.convertToSecondFeatureEntity
import com.example.depsmanagement.feature.second.infrastructure.converters.convertToSecondFeatureEntityDbDto
import com.example.depsmanagement.model.SecondFeatureEntity

class SecondFeatureEntityRepositoryImpl(
    private val dao: SecondFeatureEntityDao
) : SecondFeatureEntityRepository {

    override suspend fun insertEntity(entity: SecondFeatureEntity) {
        dao.insertEntity(entity.convertToSecondFeatureEntityDbDto())
    }

    override suspend fun queryAllEntities(): List<SecondFeatureEntity> {
        return dao.queryAllEntities().map { it.convertToSecondFeatureEntity() }
    }
}