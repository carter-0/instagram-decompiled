package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Arrays;

/* renamed from: X.Cwn  reason: case insensitive filesystem */
public final class C45456Cwn {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r7 = (X.C45456Cwn) r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C45456Cwn
            r5 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x0044
            X.Cwn r7 = (X.C45456Cwn) r7
            java.lang.String r0 = r7.A03
            if (r0 == 0) goto L_0x0044
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r6.A01
            java.lang.String r0 = r7.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x0041
            java.lang.String r0 = r7.A02
            if (r0 == 0) goto L_0x0041
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0040
            long r3 = r6.A00
            long r1 = r7.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = r6.A04
            java.lang.String r0 = r7.A04
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0040
            r5 = 1
        L_0x0040:
            return r5
        L_0x0041:
            java.lang.String r0 = "assetUrl"
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "id"
        L_0x0046:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45456Cwn.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str;
        String str2 = this.A03;
        if (str2 != null) {
            String str3 = this.A02;
            if (str3 != null) {
                return Arrays.hashCode(new Object[]{str2, str3, this.A01, Long.valueOf(this.A00), this.A04});
            }
            str = "assetUrl";
        } else {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
