package X;

/* renamed from: X.3qD  reason: invalid class name and case insensitive filesystem */
public abstract class C253103qD extends C252973q0 {
    public int A00;
    public String A01;
    public boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r1 != -1) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void updateDrawState(android.text.TextPaint r5) {
        /*
            r4 = this;
            r3 = 0
            X.0qQ.A0B(r5, r3)
            int r0 = r4.A00
            if (r0 != 0) goto L_0x003b
            int r1 = r5.linkColor
        L_0x000a:
            r5.setColor(r1)
        L_0x000d:
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0024
            android.graphics.Typeface r1 = r5.getTypeface()
            r0 = 1
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r1, r0)
            r5.setTypeface(r0)
        L_0x001d:
            int r0 = r5.getColor()
            r4.A00 = r0
            return
        L_0x0024:
            java.lang.String r1 = r4.A01
            java.lang.String r0 = ""
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x001d
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r1, r3)
            java.lang.Integer r1 = X.0oh.A05(r1, r3)
            r0 = 0
            X.0oh.A06(r0, r2, r5, r1)
            goto L_0x001d
        L_0x003b:
            int r1 = r4.A00
            r0 = -1
            if (r1 == r0) goto L_0x000d
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C253103qD.updateDrawState(android.text.TextPaint):void");
    }

    public C253103qD(String str, int i, boolean z) {
        this.A02 = z;
        this.A00 = i;
        this.A01 = str;
    }

    public C253103qD(boolean z, int i) {
        this("", i, z);
    }

    public C253103qD() {
        this.A01 = "";
    }
}
