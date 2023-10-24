package com.example.depsmanagement.feature.second.view

import androidx.lifecycle.ViewModel
import com.example.depsmanagement.feature.second.domain.usecase.InsertSecondFeatureEntityUseCase
import com.example.depsmanagement.feature.second.domain.usecase.QueryAllSecondFeatureEntitiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondFeatureViewModel @Inject constructor(
    private val insertSecondFeatureEntity: InsertSecondFeatureEntityUseCase,
    private val queryAllSecondFeatureEntities: QueryAllSecondFeatureEntitiesUseCase,
) : ViewModel()