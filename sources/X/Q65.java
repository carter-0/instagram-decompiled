package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class Q65 extends BroadcastReceiver {
    public final C10933S1m A00;
    public final QYK A01;
    public final C60880jp A02;

    public Q65(C10933S1m s1m, QYK qyk, C60880jp r3) {
        this.A00 = s1m;
        this.A02 = r3;
        this.A01 = qyk;
    }

    public final void onReceive(Context context, Intent intent) {
        int A03 = C66580MXl.A03(this, context, intent, -1072907436);
        QYK qyk = this.A01;
        qyk.A00 = System.currentTimeMillis();
        if (getResultCode() == -1) {
            String resultData = getResultData();
            Bundle resultExtras = getResultExtras(true);
            qyk.A00 = new 19i(resultData, resultExtras.getLong("timestamp", Long.MAX_VALUE), resultExtras.getString("origin"));
            this.A00.A00(qyk);
        } else {
            qyk.A01 = AnonymousClass05K.A0C;
        }
        C60870jn r0 = this.A00.A01;
        if (r0 != null) {
            r0.A01();
        }
        C60880jp r02 = this.A02;
        if (r02 != null) {
            r02.A03(qyk);
        }
        AnonymousClass0fD.A0E(1383884498, A03, intent);
    }
}
