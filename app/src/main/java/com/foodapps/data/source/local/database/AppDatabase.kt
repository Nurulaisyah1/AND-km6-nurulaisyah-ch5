package com.foodapps.data.source.local.database


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.foodapps.data.source.local.database.dao.CartDao
import com.foodapps.data.source.local.database.entity.CartEntity

@Database(
    entities = [CartEntity::class],
    version = 1,
    exportSchema = true
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun cartDao(): CartDao

    companion object {
        private const val DB_NAME = "FoodApps.db"

        /*        @Volatile
                private var INSTANCE: AppDatabase? = null*/
        fun createInstance(context: Context): AppDatabase {
            // return INSTANCE ?: synchronized(this){
            //    val instance = Room.databaseBuilder(
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DB_NAME,
            ).fallbackToDestructiveMigration().build()
            //    INSTANCE = instance
            //    instance
            // }
        }
    }

}