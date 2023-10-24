package com.example.depsmanagement.feature.first.infrastructure

import com.example.depsmanagement.database.dao.FirstFeatureEntityDao
import com.example.depsmanagement.feature.first.domain.FirstFeatureEntityRepository
import com.example.depsmanagement.feature.first.infrastructure.converters.convertToFirstFeatureEntity
import com.example.depsmanagement.feature.first.infrastructure.converters.convertToFirstFeatureEntityDbDto
import com.example.depsmanagement.model.FirstFeatureEntity

class FirstFeatureEntityRepositoryImpl(
    private val dao: FirstFeatureEntityDao
) : FirstFeatureEntityRepository {

    override suspend fun insertEntity(entity: FirstFeatureEntity) {
        dao.insertEntity(entity.convertToFirstFeatureEntityDbDto())
    }

    override suspend fun queryAllEntities(): List<FirstFeatureEntity> {
        return dao.queryAllEntities().map { it.convertToFirstFeatureEntity() }
    }
}