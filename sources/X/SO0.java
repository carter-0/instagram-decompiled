package X;

import com.google.common.collect.ImmutableList;

public final class SO0 {
    public final SRP A00;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        if (r0.length() == 0) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.view.View r13) {
        /*
            r12 = this;
            r5 = r13
            android.content.Context r4 = r13.getContext()
            X.SRP r3 = r12.A00
            java.lang.Integer r0 = r3.A03
            if (r0 == 0) goto L_0x0012
            int r0 = r0.intValue()
            r13.setAccessibilityTraversalAfter(r0)
        L_0x0012:
            boolean r0 = r3.A04
            r9 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.Integer r6 = r3.A02
            X.Tj6 r0 = r3.A00
            if (r0 == 0) goto L_0x0057
            X.0qQ.A0A(r4)
            java.lang.CharSequence r0 = r0.C1h(r4)
            if (r0 == 0) goto L_0x0057
            java.lang.String r7 = r0.toString()
        L_0x002a:
            X.Tj6 r0 = r3.A00
            if (r0 == 0) goto L_0x003e
            X.0qQ.A0A(r4)
            java.lang.CharSequence r0 = r0.C1h(r4)
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            r10 = 0
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r10 = 1
        L_0x003f:
            X.Tj6 r0 = r3.A01
            if (r0 == 0) goto L_0x0050
            X.0qQ.A0A(r4)
            java.lang.CharSequence r0 = r0.C1h(r4)
            if (r0 == 0) goto L_0x0050
            java.lang.String r9 = r0.toString()
        L_0x0050:
            boolean r11 = r3.A06
            r8 = 0
            X.C18674VwX.A02(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0057:
            r7 = r9
            goto L_0x002a
        L_0x0059:
            java.lang.Integer r2 = r3.A02
            r1 = 0
            X.Tj6 r0 = r3.A01
            if (r0 == 0) goto L_0x006d
            X.0qQ.A0A(r4)
            java.lang.CharSequence r0 = r0.C1h(r4)
            if (r0 == 0) goto L_0x006d
            java.lang.String r9 = r0.toString()
        L_0x006d:
            boolean r0 = r3.A05
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C18674VwX.A00(r13, r0, r2, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SO0.A02(android.view.View):void");
    }

    public static void A00(SRP srp, C10693RwX rwX) {
        rwX.A01 = new SO0(srp);
    }

    public static void A01(SRP srp, C8092Qgk qgk, ImmutableList.Builder builder) {
        qgk.A02 = new SO0(srp);
        builder.add(new C8098Qgq(qgk));
    }

    public SO0(SRP srp) {
        this.A00 = srp;
    }
}
