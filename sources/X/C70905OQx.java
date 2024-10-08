package X;

import java.util.List;

/* renamed from: X.OQx  reason: case insensitive filesystem */
public abstract class C70905OQx {
    public static final C68294N9h A00() {
        List list = 0sn.A00;
        return new C68294N9h((C59721JVf) null, (N3V) null, list, list, 0Yt.A0E(), 0, 0, 0, false, false, false, false, false, true, false, false, false);
    }

    public static final String A01(N9E n9e, String str, String str2) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(n9e.A03);
        if (!n9e.A04) {
            A1A.append(" ");
            A1A.append(str);
        }
        if (!n9e.A07 && !n9e.A06) {
            A1A.append(" ");
            A1A.append(str2);
        }
        return DbT.A10(A1A);
    }
}
