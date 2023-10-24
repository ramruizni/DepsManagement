package com.example.depsmanagement.di

import com.example.depsmanagement.feature.first.domain.FirstFeatureEntityRepository
import com.example.depsmanagement.feature.first.domain.usecase.InsertFirstFeatureEntityUseCase
import com.example.depsmanagement.feature.first.domain.usecase.QueryAllFirstFeatureEntitiesUseCase
import com.example.depsmanagement.feature.second.domain.SecondFeatureEntityRepository
import com.example.depsmanagement.feature.second.domain.usecase.InsertSecondFeatureEntityUseCase
import com.example.depsmanagement.feature.second.domain.usecase.QueryAllSecondFeatureEntitiesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Singleton
    @Provides
    fun provideInsertFirstFeatureEntityUseCase(
        repository: FirstFeatureEntityRepository
    ): InsertFirstFeatureEntityUseCase = InsertFirstFeatureEntityUseCase(
        repository = repository
    )

    @Singleton
    @Provides
    fun provideQueryAllFirstFeatureEntitiesUseCase(
        repository: FirstFeatureEntityRepository
    ): QueryAllFirstFeatureEntitiesUseCase = QueryAllFirstFeatureEntitiesUseCase(
        repository = repository
    )

    @Singleton
    @Provides
    fun provideInsertSecondFeatureEntityUseCase(
        repository: SecondFeatureEntityRepository
    ): InsertSecondFeatureEntityUseCase = InsertSecondFeatureEntityUseCase(
        repository = repository
    )

    @Singleton
    @Provides
    fun provideQueryAllSecondFeatureEntitiesUseCase(
        repository: SecondFeatureEntityRepository
    ): QueryAllSecondFeatureEntitiesUseCase = QueryAllSecondFeatureEntitiesUseCase(
        repository = repository
    )
}