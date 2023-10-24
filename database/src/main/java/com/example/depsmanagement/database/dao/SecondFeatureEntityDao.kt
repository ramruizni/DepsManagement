package com.example.depsmanagement.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.depsmanagement.database.dto.SecondFeatureEntityDbDto

@Dao
abstract class SecondFeatureEntityDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertEntity(entity: SecondFeatureEntityDbDto)

    @Query("SELECT * from second_feature_entity")
    abstract fun queryAllEntities(): List<SecondFeatureEntityDbDto>
}