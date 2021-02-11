package com.example.junit_course;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;

import com.example.junit_course.persistence.NoteDao;
import com.example.junit_course.persistence.NoteDatabase;

import org.junit.After;
import org.junit.Before;

public abstract class NoteDatabaseTest {

    // System under test
    private NoteDatabase noteDatabase;

    public NoteDao getNoteDao(){
        return noteDatabase.getNoteDao();
    }

    // gets called at the beginning
    @Before
    public void init(){
        // when the app dies also the database
        noteDatabase = Room.inMemoryDatabaseBuilder(
                ApplicationProvider.getApplicationContext(),
                NoteDatabase.class
        ).build();
    }

    @After
    public void finish(){
        noteDatabase.close();
    }

}
