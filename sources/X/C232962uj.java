package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: X.2uj  reason: invalid class name and case insensitive filesystem */
public final class C232962uj extends Handler {
    public WeakReference A00;

    public final void handleMessage(Message message) {
        2cs r2;
        C232952ui r22 = (C232952ui) this.A00.get();
        if (r22 != null) {
            int i = message.what;
            if (i == 1) {
                int i2 = C232952ui.A0I;
                if (r22.A08.A0A(r22.A02)) {
                    r2 = r22.A05;
                } else {
                    return;
                }
            } else if (i == 2) {
                int i3 = C232952ui.A0I;
                if (r22.A08.A07(r22.A03)) {
                    r22.A0B = true;
                    r2 = r22.A04;
                    r2.A08(0.0d, true);
                } else {
                    return;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown message ");
                sb.append(message);
                throw new RuntimeException(sb.toString());
            }
            r2.A06(1.0d);
        }
    }
}
