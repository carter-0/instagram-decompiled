package X;

import com.instagram.model.reels.ReelType;

public final class EJW extends ExY {
    public final C255773uh A00;
    public final String A01;
    public final boolean A02;
    public final ReelType A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJW) {
                EJW ejw = (EJW) obj;
                if (!0qQ.A0K(this.A01, ejw.A01) || this.A03 != ejw.A03 || !0qQ.A0K(this.A00, ejw.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4 == com.instagram.model.reels.ReelType.A05) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EJW(X.C255773uh r3, com.instagram.model.reels.ReelType r4, java.lang.String r5) {
        /*
            r2 = this;
            X.2FW r0 = X.2FW.A19
            r2.<init>(r0, r5)
            r2.A01 = r5
            r2.A03 = r4
            r2.A00 = r3
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A06
            if (r4 == r0) goto L_0x0014
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A05
            r0 = 0
            if (r4 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r2.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EJW.<init>(X.3uh, com.instagram.model.reels.ReelType, java.lang.String):void");
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
