package com.example.junit_course.di;

import com.example.junit_course.ui.note.NoteActivity;
import com.example.junit_course.ui.noteslist.NotesListActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract NotesListActivity contributeNotesListActivity();

    @ContributesAndroidInjector
    abstract NoteActivity contributeNoteActivity();
}