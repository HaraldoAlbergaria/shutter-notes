/*
 *  Copyright (c) 2024 Haraldo Albergaria - All Rights Reserved
 *
 *  Project       : ShutterNotes
 *  Developer     : Haraldo Albergaria
 *
 *  File          : RestoreBackupAlertFragment.java
 *  Last modified : 6/26/24, 10:14 AM
 *
 *  -----------------------------------------------------------
 */

package com.apps.mohb.shutternotes.fragments.dialogs;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.apps.mohb.shutternotes.R;


public class RestoreBackupAlertFragment extends DialogFragment {

    public interface RestoreBackupAlertDialogListener {
        void onRestoreBackupDialogPositiveClick();

        void onRestoreBackupDialogNegativeClick(DialogFragment dialog);
    }

    private RestoreBackupAlertDialogListener mListener;


    @NonNull
    @Override
    public AlertDialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(R.string.alert_title_import_file).setMessage(R.string.alert_message_import_file)
                .setPositiveButton(R.string.alert_button_yes, (dialog, id) -> mListener.onRestoreBackupDialogPositiveClick())
                .setNegativeButton(R.string.alert_button_no, (dialog, id) -> mListener.onRestoreBackupDialogNegativeClick(RestoreBackupAlertFragment.this));

        return builder.create();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        // Verify that the host context implements the callback interface
        try {
            // Instantiate the RestoreDialogListener so we can send events to the host
            mListener = (RestoreBackupAlertDialogListener) context;
        } catch (ClassCastException e) {
            // The context doesn't implement the interface, throw exception
            throw new ClassCastException(context
                    + " must implement RestoreDialogListener");
        }
    }

}