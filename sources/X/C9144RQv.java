package X;

import android.util.Base64;

/* renamed from: X.RQv  reason: case insensitive filesystem */
public abstract class C9144RQv {
    public final String toString() {
        String encodeToString;
        C8311Qnr qnr = (C8311Qnr) this;
        String str = qnr.A01;
        RE0 re0 = qnr.A00;
        byte[] bArr = qnr.A02;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return String.format("TransportContext(%s, %s, %s)", new Object[]{str, re0, encodeToString});
    }
}
