package X;

import java.util.Arrays;

/* renamed from: X.95e  reason: invalid class name and case insensitive filesystem */
public final class C3733995e {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3733995e)) {
            return false;
        }
        C3733995e r4 = (C3733995e) obj;
        if (!SA1.A01(this.A00, r4.A00) || !SA1.A01(this.A02, r4.A02) || !SA1.A01(this.A03, r4.A03) || !SA1.A01(this.A01, r4.A01) || !SA1.A01(this.A04, r4.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, null, this.A01, null, this.A04});
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(this.A00, "applicationId");
        s4o.A00(this.A02, "apiKey");
        s4o.A00(this.A03, "databaseUrl");
        s4o.A00(this.A01, "gcmSenderId");
        s4o.A00((Object) null, "storageBucket");
        s4o.A00(this.A04, "projectId");
        return s4o.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r3.trim().isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3733995e(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.trim()
            boolean r1 = r0.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0011
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = r0 ^ 1
            java.lang.String r0 = "ApplicationId must be set."
            X.AnonymousClass3Qk.A09(r1, r0)
            r2.A00 = r3
            r2.A02 = r4
            r2.A03 = r5
            r2.A01 = r6
            r2.A04 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3733995e.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
