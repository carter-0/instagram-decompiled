package X;

/* renamed from: X.UrZ  reason: case insensitive filesystem */
public final class C16272UrZ extends C18001Vjd {
    public final 1Xj A00;
    public final 1Xj A01;
    public final String A02;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16272UrZ(X.1Xj r7, X.1Xj r8, java.lang.String r9) {
        /*
            r6 = this;
            r0 = 1
            r3 = r9
            X.0qQ.A0B(r9, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.1Xy r0 = r8.A0C
            java.util.List r0 = r0.B4w()
            if (r0 == 0) goto L_0x0034
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0034
            boolean r0 = r8.CeS()
            if (r0 == 0) goto L_0x0031
            java.lang.String r4 = "featured_product_video"
        L_0x001d:
            float r5 = r8.A0l()
            X.Vux r1 = new X.Vux
            r1.<init>((X.1Xj) r8)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.A02 = r9
            r6.A01 = r7
            r6.A00 = r8
            return
        L_0x0031:
            java.lang.String r4 = "featured_product_photo"
            goto L_0x001d
        L_0x0034:
            boolean r0 = r8.CeS()
            if (r0 == 0) goto L_0x003d
            java.lang.String r4 = "feed_video"
            goto L_0x001d
        L_0x003d:
            java.lang.String r4 = "feed_photo"
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16272UrZ.<init>(X.1Xj, X.1Xj, java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C16272UrZ) {
                C16272UrZ urZ = (C16272UrZ) obj;
                if (!0qQ.A0K(this.A02, urZ.A02) || !0qQ.A0K(this.A01, urZ.A01) || !0qQ.A0K(this.A00, urZ.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }
}
