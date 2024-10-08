package X;

public abstract class A1P {
    /* JADX WARNING: type inference failed for: r0v13, types: [X.0v6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        r0 = X.0v6.A03;
        r0 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r0 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r1 = X.ABK.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        r0 = new java.lang.Object();
        r0.A02 = r3;
        r0.A00 = r4;
        r0.A01 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0065, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0v6 A00(com.instagram.ui.text.TextColorScheme r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            java.util.List r0 = r5.A07
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            android.graphics.drawable.GradientDrawable$Orientation r0 = r5.A03
            if (r0 != 0) goto L_0x0041
            r2 = -1
        L_0x000f:
            r4 = 3
            r1 = 2
            r0 = 1
            if (r2 == r0) goto L_0x0039
            if (r2 == r1) goto L_0x0039
            if (r2 == r4) goto L_0x0039
            r0 = 4
            if (r2 == r0) goto L_0x0039
        L_0x001b:
            android.graphics.drawable.GradientDrawable$Orientation r2 = r5.A03
            if (r2 == 0) goto L_0x002a
            int[] r1 = X.VKJ.A00
            int r0 = r2.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x004e;
                case 2: goto L_0x004c;
                case 3: goto L_0x004f;
                case 4: goto L_0x004a;
                case 5: goto L_0x004e;
                case 6: goto L_0x004c;
                case 7: goto L_0x004f;
                case 8: goto L_0x004a;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unknown drawable orientation "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0039:
            java.util.ArrayList r0 = X.00k.A0U(r3)
            X.00v.A10(r0)
            goto L_0x001b
        L_0x0041:
            int[] r1 = X.VKJ.A00
            int r0 = r0.ordinal()
            r2 = r1[r0]
            goto L_0x000f
        L_0x004a:
            r4 = 2
            goto L_0x004f
        L_0x004c:
            r4 = 1
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            java.util.List r0 = X.0v6.A03
            java.lang.Integer r0 = r5.A05
            if (r0 == 0) goto L_0x0065
            java.lang.String r1 = X.ABK.A01(r0)
        L_0x0059:
            X.0v6 r0 = new X.0v6
            r0.<init>()
            r0.A02 = r3
            r0.A00 = r4
            r0.A01 = r1
            return r0
        L_0x0065:
            r1 = 0
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1P.A00(com.instagram.ui.text.TextColorScheme):X.0v6");
    }
}
