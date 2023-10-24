package com.example.depsmanagement.di

import com.example.depsmanagement.database.dao.FirstFeatureEntityDao
import com.example.depsmanagement.database.dao.SecondFeatureEntityDao
import com.example.depsmanagement.feature.first.domain.FirstFeatureEntityRepository
import com.example.depsmanagement.feature.first.infrastructure.FirstFeatureEntityRepositoryImpl
import com.example.depsmanagement.feature.second.domain.SecondFeatureEntityRepository
import com.example.depsmanagement.feature.second.infrastructure.SecondFeatureEntityRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object InfrastructureModule {

    @Singleton
    @Provides
    fun provideFirstFeatureEntityRepository(
        dao: FirstFeatureEntityDao
    ): FirstFeatureEntityRepository = FirstFeatureEntityRepositoryImpl(
        dao = dao
    )

    @Singleton
    @Provides
    fun provideSecondFeatureEntityRepository(
        dao: SecondFeatureEntityDao
    ): SecondFeatureEntityRepository = SecondFeatureEntityRepositoryImpl(
        dao = dao
    )
}