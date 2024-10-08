package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Mqv  reason: case insensitive filesystem */
public final class C67623Mqv extends Handler {
    public final void handleMessage(Message message) {
        C67622Mqu mqu = (C67622Mqu) message.obj;
        int i = message.what;
        if (i == 1) {
            C67620Mqs mqs = mqu.A00;
            Object obj = mqu.A01[0];
            C67623Mqv mqv = C67620Mqs.A04;
            if (!mqs.A01.isCancelled()) {
                mqs.A05(obj);
            }
            mqs.A03 = AnonymousClass05K.A0C;
        } else if (i == 2) {
            C67623Mqv mqv2 = C67620Mqs.A04;
        }
    }
}
