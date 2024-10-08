package X;

import android.net.Uri;

/* renamed from: X.ReT  reason: case insensitive filesystem */
public abstract class C9649ReT {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.0TC, java.lang.Object, X.0bY] */
    public static final String A00(String str) {
        if (str == null) {
            return str;
        }
        ? obj = new Object();
        Uri A00 = 0cp.A00(obj, str);
        if (A00 == null) {
            return null;
        }
        if (C11429STt.A05(A00)) {
            A00 = C11429STt.A00(A00, obj);
        }
        0qQ.A0A(A00);
        Uri.Builder A0I = Pxe.A0I();
        A0I.scheme(A00.getScheme());
        A0I.authority(A00.getAuthority());
        String A0b = Pxf.A0b(A0I);
        if (A0b != null) {
            return A0b;
        }
        return str;
    }
}
