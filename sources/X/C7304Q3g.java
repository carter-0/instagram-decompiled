package X;

import java.io.IOException;

/* renamed from: X.Q3g  reason: case insensitive filesystem */
public final class C7304Q3g {
    public C276544tV A00;
    public C277014uI A01;
    public C277014uI A02;
    public String A03;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Q3g, java.lang.Object] */
    public static C276544tV A00(C276424tJ r6) {
        String valueOf;
        C7304Q3g q3g;
        ? obj = new Object();
        if (r6.E2K() != AnonymousClass05K.A0C) {
            r6.Evn();
            q3g = null;
        } else {
            while (r6.Crg() != AnonymousClass05K.A0N) {
                int A002 = C276474tO.A00(r6.E2H());
                r6.Crg();
                if (35 == A002) {
                    obj.A00 = (C276544tV) C276524tT.A01((C276484tP) null, r6);
                } else if (33 == A002) {
                    C276444tL E2L = r6.E2L();
                    Integer E2K = r6.E2K();
                    int intValue = E2K.intValue();
                    if (intValue == 7) {
                        valueOf = String.valueOf(E2L.ClN());
                    } else if (intValue == 5) {
                        valueOf = E2L.Eyf();
                    } else {
                        throw new IOException(002.A0R("Bloks id only supports long and String types but got: ", C9817Rhf.A00(E2K)));
                    }
                    obj.A03 = valueOf;
                } else if (38 == A002) {
                    obj.A02 = C7294Q2t.A00((C276634te) null, r6.E2L());
                } else if (43 == A002) {
                    obj.A01 = C7294Q2t.A00((C276634te) null, r6.E2L());
                }
                r6.Evn();
            }
            q3g = obj;
        }
        C276544tV r1 = q3g.A00;
        if (r1 != null) {
            C276544tV r0 = new C276544tV(r1, q3g);
            q3g.A00 = null;
            return r0;
        }
        throw new IOException("Shadow component should never be a leaf node");
    }
}
