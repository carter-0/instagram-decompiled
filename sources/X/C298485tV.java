package X;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* renamed from: X.5tV  reason: invalid class name and case insensitive filesystem */
public abstract class C298485tV implements DialogInterface.OnClickListener {
    public void A00() {
        C298495tW r0 = (C298495tW) this;
        Intent intent = r0.A02;
        if (intent != null) {
            r0.A01.startActivityForResult(intent, r0.A00);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            A00();
        } catch (ActivityNotFoundException e) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e);
        } catch (Throwable th) {
            dialogInterface.dismiss();
            throw th;
        }
        dialogInterface.dismiss();
    }
}
