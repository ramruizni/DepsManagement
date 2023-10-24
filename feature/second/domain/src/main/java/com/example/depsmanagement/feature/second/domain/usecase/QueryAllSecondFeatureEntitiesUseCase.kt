package com.example.depsmanagement.feature.second.domain.usecase

import com.example.depsmanagement.feature.second.domain.SecondFeatureEntityRepository
import com.example.depsmanagement.model.SecondFeatureEntity

class QueryAllSecondFeatureEntitiesUseCase(
    private val repository: SecondFeatureEntityRepository
) {

    suspend operator fun invoke(): List<SecondFeatureEntity> {
        return repository.queryAllEntities()
    }
}