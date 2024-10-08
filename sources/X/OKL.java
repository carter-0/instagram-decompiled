package X;

public final class OKL {
    public boolean A00;
    public final OCA A01;

    public final OCA A00() {
        OCA oca;
        if (this.A00) {
            oca = null;
        } else {
            oca = this.A01;
        }
        this.A00 = true;
        return oca;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OCA, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3.getBoolean("DirectThreadFragment.ARGUMENT_PRIVATE_REPLY_SENT") == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OKL(android.os.Bundle r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.<init>()
            X.OCA r0 = new X.OCA
            r0.<init>()
            r0.A01 = r4
            r0.A00 = r5
            r2.A01 = r0
            if (r3 == 0) goto L_0x0019
            java.lang.String r0 = "DirectThreadFragment.ARGUMENT_PRIVATE_REPLY_SENT"
            boolean r1 = r3.getBoolean(r0)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OKL.<init>(android.os.Bundle, java.lang.String, java.lang.String):void");
    }
}
