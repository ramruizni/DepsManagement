package com.example.depsmanagement.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.depsmanagement.database.dao.FirstFeatureEntityDao
import com.example.depsmanagement.database.dao.SecondFeatureEntityDao
import com.example.depsmanagement.database.dto.FirstFeatureEntityDbDto
import com.example.depsmanagement.database.dto.SecondFeatureEntityDbDto

@Database(
    entities = [
        FirstFeatureEntityDbDto::class,
        SecondFeatureEntityDbDto::class,
    ],
    version = 1,
    exportSchema = true
)
abstract class MainDatabase : RoomDatabase() {

    abstract fun firstFeatureEntityDao(): FirstFeatureEntityDao

    abstract fun secondFeatureEntityDao(): SecondFeatureEntityDao

}