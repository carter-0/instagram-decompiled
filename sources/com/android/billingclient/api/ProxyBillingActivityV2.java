package com.android.billingclient.api;

import X.00Y;
import X.0qQ;
import X.AnonymousClass0fD;
import X.C11534Sbv;
import X.C11535Sbw;
import X.SUN;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;

public class ProxyBillingActivityV2 extends ComponentActivity {
    public ResultReceiver A00;
    public ResultReceiver A01;
    public 00Y A02;
    public 00Y A03;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.00i] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.00i] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(1286759594);
        ProxyBillingActivityV2.super.onCreate(bundle);
        this.A02 = registerForActivityResult(new Object(), new C11534Sbv(this));
        this.A03 = registerForActivityResult(new Object(), new C11535Sbw(this));
        if (bundle == null) {
            SUN.A09("ProxyBillingActivityV2", "Launching Play Store billing dialog");
            boolean hasExtra = getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            Intent intent = getIntent();
            if (hasExtra) {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
                this.A00 = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
                00Y r4 = this.A02;
                0qQ.A0B(pendingIntent, 1);
                IntentSender intentSender = pendingIntent.getIntentSender();
                0qQ.A07(intentSender);
                r4.A02(new IntentSenderRequest((Intent) null, intentSender, 0, 0));
                i = -863450788;
            } else {
                if (intent.hasExtra("external_payment_dialog_pending_intent")) {
                    PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("external_payment_dialog_pending_intent");
                    this.A01 = (ResultReceiver) getIntent().getParcelableExtra("external_payment_dialog_result_receiver");
                    00Y r42 = this.A03;
                    0qQ.A0B(pendingIntent2, 1);
                    IntentSender intentSender2 = pendingIntent2.getIntentSender();
                    0qQ.A07(intentSender2);
                    r42.A02(new IntentSenderRequest((Intent) null, intentSender2, 0, 0));
                    i = -1290233678;
                }
                i = 1305111881;
            }
        } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
            this.A00 = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            i = 963749339;
        } else {
            if (bundle.containsKey("external_payment_dialog_result_receiver")) {
                this.A01 = (ResultReceiver) bundle.getParcelable("external_payment_dialog_result_receiver");
                i = -2097673036;
            }
            i = 1305111881;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        ProxyBillingActivityV2.super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.A00;
        if (resultReceiver != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.A01;
        if (resultReceiver2 != null) {
            bundle.putParcelable("external_payment_dialog_result_receiver", resultReceiver2);
        }
    }
}
