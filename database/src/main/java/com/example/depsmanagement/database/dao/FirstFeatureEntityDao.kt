package com.example.depsmanagement.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.depsmanagement.database.dto.FirstFeatureEntityDbDto

@Dao
abstract class FirstFeatureEntityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertEntity(entity: FirstFeatureEntityDbDto)

    @Query("SELECT * from first_feature_entity")
    abstract fun queryAllEntities(): List<FirstFeatureEntityDbDto>
}