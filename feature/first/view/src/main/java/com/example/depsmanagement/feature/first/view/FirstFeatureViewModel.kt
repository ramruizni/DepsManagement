package com.example.depsmanagement.feature.first.view

import androidx.lifecycle.ViewModel
import com.example.depsmanagement.feature.first.domain.usecase.InsertFirstFeatureEntityUseCase
import com.example.depsmanagement.feature.first.domain.usecase.QueryAllFirstFeatureEntitiesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FirstFeatureViewModel @Inject constructor(
    private val insertFirstFeatureEntity: InsertFirstFeatureEntityUseCase,
    private val queryAllFirstFeatureEntities: QueryAllFirstFeatureEntitiesUseCase,
): ViewModel()