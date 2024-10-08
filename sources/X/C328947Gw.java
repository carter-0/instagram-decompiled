package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.7Gw  reason: invalid class name and case insensitive filesystem */
public final class C328947Gw implements Handler.Callback {
    public final /* synthetic */ C328927Gu A00;

    public C328947Gw(C328927Gu r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        C328927Gu r1 = this.A00;
        11Z.A00();
        if (r1.A02 != null) {
            r1.A03.removeMessages(1);
            r1.A02 = null;
        }
        return true;
    }
}
