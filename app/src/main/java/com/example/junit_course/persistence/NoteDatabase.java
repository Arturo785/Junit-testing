package com.example.junit_course.persistence;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.junit_course.models.Note;


@Database(entities = {Note.class}, version = 1)
public abstract class NoteDatabase extends RoomDatabase {

    public static final String DATABASE_NAME = "notes_db";

    public abstract NoteDao getNoteDao();
}