package X;

/* renamed from: X.GQn  reason: case insensitive filesystem */
public final class C52388GQn extends GRC {
    public final int A00;
    public final C52389GQo A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52388GQn(X.C52389GQo r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.5Gi r0 = r3.A01
            java.lang.String r1 = r0.A09
            X.0qQ.A07(r1)
            java.lang.String r0 = "content_type_newsfeed_story"
            r2.<init>(r1, r0)
            r2.A01 = r3
            r2.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52388GQn.<init>(X.GQo, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52388GQn) {
                C52388GQn gQn = (C52388GQn) obj;
                if (!0qQ.A0K(this.A01, gQn.A01) || this.A00 != gQn.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A01) + this.A00;
    }
}
