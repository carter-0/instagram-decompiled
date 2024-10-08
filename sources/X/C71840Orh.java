package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.Orh  reason: case insensitive filesystem */
public final class C71840Orh implements C74379Ptu {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r3.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object AWX(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            r0 = 0
            if (r1 != 0) goto L_0x0015
            X.16F r1 = X.16P.A00(r3)     // Catch:{ IOException -> 0x0015 }
            X.NI1 r0 = X.C69763Nrm.parseFromJson(r1)     // Catch:{ IOException -> 0x0015 }
        L_0x0015:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71840Orh.AWX(java.lang.String):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ String FHB(Object obj) {
        NI1 ni1 = (NI1) obj;
        if (ni1 == null) {
            return null;
        }
        try {
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            String str = ni1.A00;
            if (str != null) {
                A0K.A0R("recovery_key", str);
            }
            return AnonymousClass7TG.A0k(A0K, A0v);
        } catch (IOException unused) {
            return null;
        }
    }
}
