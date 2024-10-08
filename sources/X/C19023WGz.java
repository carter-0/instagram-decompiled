package X;

/* renamed from: X.WGz  reason: case insensitive filesystem */
public abstract class C19023WGz implements C13848TiQ {
    public final int A00;
    public final long A01;
    public final S7E A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final X5t A06;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r0.intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19023WGz(X.S7E r4, X.X5t r5, X.C18494Vsp r6) {
        /*
            r3 = this;
            r1 = 1
            r3.<init>()
            java.lang.Integer r2 = r6.A02
            if (r2 == 0) goto L_0x0054
            int r0 = r2.intValue()
            if (r0 != r1) goto L_0x004c
            java.lang.Integer r0 = r6.A01
            if (r0 == 0) goto L_0x0049
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x0049
        L_0x0018:
            r3.A00 = r0
            java.lang.String r0 = r6.A05
            java.lang.String r1 = "unknown"
            if (r0 == 0) goto L_0x0046
            r3.A05 = r0
        L_0x0022:
            java.lang.String r0 = r6.A04
            if (r0 == 0) goto L_0x0043
            r3.A04 = r0
        L_0x0028:
            r3.A02 = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.A03
            r1.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            r3.A03 = r0
            long r0 = r6.A00
            r3.A01 = r0
            r3.A06 = r5
            return
        L_0x0043:
            r3.A04 = r1
            goto L_0x0028
        L_0x0046:
            r3.A05 = r1
            goto L_0x0022
        L_0x0049:
            r0 = 10
            goto L_0x0018
        L_0x004c:
            java.lang.String r1 = "Unsupported config version"
            X.V1q r0 = new X.V1q
            r0.<init>(r1)
            throw r0
        L_0x0054:
            java.lang.String r1 = "Bad config"
            X.V1q r0 = new X.V1q
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19023WGz.<init>(X.S7E, X.X5t, X.Vsp):void");
    }

    public final String BdS() {
        return this.A05;
    }

    public final S7E Bjd() {
        return this.A02;
    }

    public final long Bxy() {
        return this.A01;
    }

    public final String CDk() {
        return this.A03;
    }

    public final void EGM(String str, String str2) {
        this.A06.EAt(this, 002.A0u("PARAM ACCESS ERROR - ", str2, ": ", "min_bitrate"), this.A00);
    }

    public final String getName() {
        return this.A04;
    }
}
