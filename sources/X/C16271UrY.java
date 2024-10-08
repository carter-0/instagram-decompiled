package X;

/* renamed from: X.UrY  reason: case insensitive filesystem */
public final class C16271UrY extends C18001Vjd {
    public final 1Xj A00;
    public final String A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16271UrY(X.1Xj r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 1
            r3 = r8
            X.0qQ.A0B(r8, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            float r5 = r7.A0l()
            X.Vux r1 = new X.Vux
            r1.<init>((X.1Xj) r7)
            java.lang.String r4 = "catalog_video"
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A01 = r8
            r6.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16271UrY.<init>(X.1Xj, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16271UrY) {
                C16271UrY urY = (C16271UrY) obj;
                if (!0qQ.A0K(this.A01, urY.A01) || !0qQ.A0K(this.A00, urY.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }
}
