package X;

import com.instagram.model.reels.ReelType;

public final class EJY extends ExY {
    public final 1Xj A00;
    public final C255773uh A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final ReelType A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EJY) {
                EJY ejy = (EJY) obj;
                if (!0qQ.A0K(this.A02, ejy.A02) || !0qQ.A0K(this.A03, ejy.A03) || this.A06 != ejy.A06 || !0qQ.A0K(this.A01, ejy.A01) || !0qQ.A0K(this.A04, ejy.A04) || !0qQ.A0K(this.A00, ejy.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r5 == com.instagram.model.reels.ReelType.A05) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EJY(X.1Xj r3, X.C255773uh r4, com.instagram.model.reels.ReelType r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r2 = this;
            X.2FW r0 = X.2FW.A1e
            r2.<init>(r0, r6)
            r2.A02 = r6
            r2.A03 = r7
            r2.A06 = r5
            r2.A01 = r4
            r2.A04 = r8
            r2.A00 = r3
            com.instagram.model.reels.ReelType r0 = com.instagram.model.reels.ReelType.A06
            if (r5 == r0) goto L_0x001a
            com.instagram.model.reels.ReelType r1 = com.instagram.model.reels.ReelType.A05
            r0 = 0
            if (r5 != r1) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EJY.<init>(X.1Xj, X.3uh, com.instagram.model.reels.ReelType, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
