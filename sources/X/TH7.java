package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

public final class TH7 implements Runnable {
    public final C10465Rsg A00;
    public final /* synthetic */ C3023963c A01;

    public TH7(C10465Rsg rsg, C3023963c r2) {
        this.A01 = r2;
        this.A00 = rsg;
    }

    public final void run() {
        PendingIntent pendingIntent;
        C3023963c r6 = this.A01;
        if (r6.A03) {
            C10465Rsg rsg = this.A00;
            ConnectionResult connectionResult = rsg.A01;
            int i = connectionResult.A01;
            if (i == 0 || (pendingIntent = connectionResult.A02) == null) {
                C13806ThV thV = r6.A00;
                Activity BMU = thV.BMU();
                AnonymousClass3Qk.A02(BMU);
                GoogleApiAvailability googleApiAvailability = r6.A00;
                if (googleApiAvailability.A04(BMU, (String) null, i) != null) {
                    Activity BMU2 = thV.BMU();
                    AnonymousClass3Qk.A02(BMU2);
                    AlertDialog A002 = GoogleApiAvailability.A00(BMU2, r6, new C8406QtE(googleApiAvailability.A04(BMU2, "d", i), thV), i);
                    if (A002 != null) {
                        GoogleApiAvailability.A01(BMU2, A002, r6, "GooglePlayServicesErrorDialog");
                    }
                } else if (i == 18) {
                    Activity BMU3 = thV.BMU();
                    AnonymousClass3Qk.A02(BMU3);
                    ProgressBar progressBar = new ProgressBar(BMU3, (AttributeSet) null, 16842874);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(BMU3);
                    builder.setView(progressBar);
                    builder.setMessage(SS0.A01(BMU3, 18));
                    builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                    AlertDialog create = builder.create();
                    GoogleApiAvailability.A01(BMU3, create, r6, "GooglePlayServicesUpdatingDialog");
                    Activity BMU4 = thV.BMU();
                    AnonymousClass3Qk.A02(BMU4);
                    googleApiAvailability.A05(BMU4.getApplicationContext(), new C8379Qpk(create, this));
                } else {
                    int i2 = rsg.A00;
                    r6.A01.set((Object) null);
                    r6.A0A(connectionResult, i2);
                }
            } else {
                C13806ThV thV2 = r6.A00;
                Activity BMU5 = thV2.BMU();
                AnonymousClass3Qk.A02(BMU5);
                int i3 = rsg.A00;
                Intent A0A = C66580MXl.A0A(BMU5, GoogleApiActivity.class);
                A0A.putExtra("pending_intent", pendingIntent);
                A0A.putExtra("failing_client_id", i3);
                A0A.putExtra("notify_manager", false);
                thV2.startActivityForResult(A0A, 1);
            }
        }
    }
}
