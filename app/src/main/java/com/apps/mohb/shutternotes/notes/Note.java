/*
 *  Copyright (c) 2024 Haraldo Albergaria - All Rights Reserved
 *
 *  Project       : ShutterNotes
 *  Developer     : Haraldo Albergaria
 *
 *  File          : Note.java
 *  Last modified : 6/13/24, 3:52 PM
 *
 *  -----------------------------------------------------------
 */

package com.apps.mohb.shutternotes.notes;


public class Note {

    private String text;

    protected String getText() {
        return text;
    }

    protected void setText(String text) {
        this.text = text;
    }
}
