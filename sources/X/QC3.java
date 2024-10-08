package X;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

public final class QC3 extends 0SM {
    public final Dialog A0F(Bundle bundle) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ProgressDialog progressDialog = new ProgressDialog(activity);
            progressDialog.setTitle("Rage Shake");
            progressDialog.setMessage("Preparing debug information...");
            progressDialog.setIndeterminate(true);
            return progressDialog;
        }
        throw Pxe.A0i();
    }
}
