package X;

import com.google.gson.Gson;
import java.util.Map;

/* renamed from: X.54V  reason: invalid class name */
public final class AnonymousClass54V implements C270014g3 {
    public final Map A00;
    public final Map A01;

    /* JADX WARNING: type inference failed for: r1v5, types: [com.facebook.logginginfra.falco.PrivacyContext, com.facebook.hyperthrift.HyperThriftBase, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r4 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.logginginfra.falco.PrivacyContext E4h(com.facebook.logginginfra.falco.PrivacyContext r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            r1 = 0
            java.util.Map r0 = r6.A00
            java.lang.Object r0 = r0.get(r9)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0016
            long r4 = r0.longValue()
            r2 = 0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
        L_0x0015:
            return r1
        L_0x0016:
            java.util.Map r0 = r6.A01
            java.lang.Object r0 = r0.get(r8)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0015
            long r4 = r0.longValue()
        L_0x0024:
            r1 = 43
            r0 = 7
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0 = 1
            r2[r0] = r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r0 = 6
            if (r1 != 0) goto L_0x0039
            java.lang.Object r1 = com.facebook.hyperthrift.HyperThriftBase.A02
        L_0x0039:
            r2[r0] = r1
            java.lang.Object[] r2 = com.facebook.hyperthrift.HyperThriftBase$Builder.A01(r2)
            com.facebook.logginginfra.falco.PrivacyContext r1 = new com.facebook.logginginfra.falco.PrivacyContext
            r1.<init>()
            java.lang.String r0 = "com.facebook.logginginfra.falco.PrivacyContext"
            r1.A02(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54V.E4h(com.facebook.logginginfra.falco.PrivacyContext, java.lang.String, java.lang.String):com.facebook.logginginfra.falco.PrivacyContext");
    }

    public static final Map A00(String str) {
        try {
            return (Map) new Gson().A09(str, new AnonymousClass54W().type);
        } catch (AnonymousClass1Aw e) {
            0KC.A0F("IgPrivacyContextProvider", "nkt_test Exception parsing json", e);
            return 0Yt.A0E();
        }
    }

    public AnonymousClass54V(String str, String str2) {
        String str3 = "{}";
        this.A00 = A00(str.length() == 0 ? str3 : str);
        this.A01 = A00(str2.length() != 0 ? str2 : str3);
    }
}
