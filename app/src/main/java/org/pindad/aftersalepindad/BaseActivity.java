package org.pindad.aftersalepindad;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;



public class BaseActivity extends AppCompatActivity {

    private ProgressDialog mProgressDialog;

    public void showProgressDialog(String message) {
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setCancelable(false);
            mProgressDialog.setMessage(message);
        }
        mProgressDialog.show();
    }

    public void hideProgressDialog() {
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.dismiss();
        }
    }

}