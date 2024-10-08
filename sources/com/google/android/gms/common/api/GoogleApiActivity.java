package com.google.android.gms.common.api;

import X.002;
import X.AnonymousClass0fD;
import X.AnonymousClass63T;
import X.AnonymousClass7TE;
import X.C298495tW;
import X.DbU;
import X.Pxf;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                AnonymousClass63T A01 = AnonymousClass63T.A01(this);
                if (i2 == -1) {
                    Handler handler = A01.A06;
                    handler.sendMessage(handler.obtainMessage(3));
                } else if (i2 == 0) {
                    A01.A06(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        int A02 = Pxf.A02(this, 717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle A06 = DbU.A06(this);
            if (A06 == null) {
                str = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) A06.get("pending_intent");
                Object obj = A06.get(TraceFieldType.ErrorCode);
                if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                    } catch (ActivityNotFoundException e) {
                        if (A06.getBoolean("notify_manager", true)) {
                            AnonymousClass63T.A01(this).A06(new ConnectionResult(22, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                        } else {
                            String A0g = 002.A0g("Activity not found while launching ", pendingIntent.toString(), ".");
                            if (Build.FINGERPRINT.contains("generic")) {
                                A0g = A0g.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                            }
                            Log.e("GoogleApiActivity", A0g, e);
                        }
                        this.A00 = 1;
                    } catch (IntentSender.SendIntentException e2) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                        finish();
                    }
                } else if (obj != null) {
                    int A0M = AnonymousClass7TE.A0M(obj);
                    AlertDialog A002 = GoogleApiAvailability.A00(this, this, new C298495tW(this, GoogleApiAvailability.A00.A04(this, "d", A0M), 2), A0M);
                    if (A002 != null) {
                        GoogleApiAvailability.A01(this, A002, this, "GooglePlayServicesErrorDialog");
                    }
                    this.A00 = 1;
                } else {
                    str = "Activity started without resolution";
                }
                i = 1256905274;
            }
            Log.e("GoogleApiActivity", str);
            finish();
            i = 1256905274;
        } else {
            i = -695541485;
        }
        AnonymousClass0fD.A07(i, A02);
    }
}
