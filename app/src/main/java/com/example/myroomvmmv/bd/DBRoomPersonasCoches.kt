package com.example.myroomvmmv.bd

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myroomvmmv.dao.CocheDao
import com.example.myroomvmmv.dao.PersonaDao
import com.example.myroomvmmv.entity.Coche
import com.example.myroomvmmv.entity.Persona

@Database(entities = [Persona::class, Coche::class], version = 1)
abstract class DBRoomPersonasCoches : RoomDatabase() {
    abstract fun personaDao(): PersonaDao

    abstract fun cocheDao(): CocheDao
}