package com.google.android.play.core.common;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C66581MXm;
import X.DbS;
import X.DbU;
import X.Pxf;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;

public class PlayCoreDialogWrapperActivity extends Activity {
    public ResultReceiver A00;

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.A00);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.A00) != null) {
            if (i2 == -1) {
                i3 = 1;
            } else if (i2 == 0) {
                i3 = 2;
            }
            resultReceiver.send(i3, AnonymousClass7TE.A0a());
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        int i;
        int A02 = Pxf.A02(this, -924004523);
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            C66581MXm.A0A(this).setSystemUiVisibility(intExtra);
            intent = DbS.A09();
            intent.putExtra("window_flags", intExtra);
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.A00 = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            Bundle A06 = DbU.A06(this);
            if (A06 == null) {
                ResultReceiver resultReceiver = this.A00;
                if (resultReceiver != null) {
                    resultReceiver.send(3, AnonymousClass7TE.A0a());
                }
                finish();
                i = -1123026840;
            } else {
                try {
                    startIntentSenderForResult(((PendingIntent) A06.get("confirmation_intent")).getIntentSender(), 0, intent, 0, 0, 0);
                    i = -1465725522;
                } catch (IntentSender.SendIntentException unused) {
                    ResultReceiver resultReceiver2 = this.A00;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(3, AnonymousClass7TE.A0a());
                    }
                    finish();
                    i = -384836722;
                }
            }
        } else {
            this.A00 = (ResultReceiver) bundle.getParcelable("result_receiver");
            i = -458680952;
        }
        AnonymousClass0fD.A07(i, A02);
    }
}
