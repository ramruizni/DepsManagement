package com.example.depsmanagement.database.di

import android.content.Context
import androidx.room.Room
import com.example.depsmanagement.database.MainDatabase
import com.example.depsmanagement.database.dao.FirstFeatureEntityDao
import com.example.depsmanagement.database.dao.SecondFeatureEntityDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): MainDatabase = Room.databaseBuilder(
        context.applicationContext,
        MainDatabase::class.java,
        "main_database.db"
    ).build()

    @Singleton
    @Provides
    fun provideFirstFeatureEntityDao(
        database: MainDatabase
    ): FirstFeatureEntityDao = database.firstFeatureEntityDao()

    @Singleton
    @Provides
    fun provideSecondFeatureEntityDao(
        database: MainDatabase
    ): SecondFeatureEntityDao = database.secondFeatureEntityDao()
}