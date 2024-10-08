package X;

import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import com.android.billingclient.api.ProxyBillingActivityV2;

/* renamed from: X.Sbw  reason: case insensitive filesystem */
public final /* synthetic */ class C11535Sbw implements 00W {
    public final /* synthetic */ ProxyBillingActivityV2 A00;

    public /* synthetic */ C11535Sbw(ProxyBillingActivityV2 proxyBillingActivityV2) {
        this.A00 = proxyBillingActivityV2;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.android.billingclient.api.ProxyBillingActivityV2, android.app.Activity] */
    public final void Cti(Object obj) {
        Bundle extras;
        ? r5 = this.A00;
        ActivityResult activityResult = (ActivityResult) obj;
        Intent intent = activityResult.A01;
        int i = SUN.A04(intent, "ProxyBillingActivityV2").A00;
        ResultReceiver resultReceiver = r5.A01;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i, extras);
        }
        int i2 = activityResult.A00;
        if (!(i2 == -1 && i == 0)) {
            SUN.A0A("ProxyBillingActivityV2", String.format("External offer dialog finished with resultCode: %s and billing's responseCode: %s", C51968G9o.A1Z(Integer.valueOf(i2), i)));
        }
        r5.finish();
    }
}
