package com.example.depsmanagement.feature.first.domain.usecase

import com.example.depsmanagement.feature.first.domain.FirstFeatureEntityRepository
import com.example.depsmanagement.model.FirstFeatureEntity

class QueryAllFirstFeatureEntitiesUseCase(
    private val repository: FirstFeatureEntityRepository
) {

    suspend operator fun invoke(): List<FirstFeatureEntity> {
        return repository.queryAllEntities()
    }
}