package com.example.depsmanagement.feature.second.domain.usecase

import com.example.depsmanagement.feature.second.domain.SecondFeatureEntityRepository
import com.example.depsmanagement.model.SecondFeatureEntity

class InsertSecondFeatureEntityUseCase(
    private val repository: SecondFeatureEntityRepository
) {

    suspend operator fun invoke(entity: SecondFeatureEntity) {
        repository.insertEntity(entity)
    }
}