package X;

/* renamed from: X.34E  reason: invalid class name */
public final class AnonymousClass34E implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public AnonymousClass34E(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r17
            r0 = -1482367763(0xffffffffa7a4dced, float:-4.5758672E-15)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.3Jx r1 = (X.C240183Jx) r1
            r0 = 1781121101(0x6a29c04d, float:5.1304145E25)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.1Xj r9 = r1.A00
            r0 = r16
            X.348 r6 = r0.A00
            X.349 r7 = r6.A03
            X.2rN r0 = r6.A04
            X.3W1 r5 = r0.BQr(r9)
            X.3W9 r0 = r1.A01
            if (r0 != 0) goto L_0x0043
            X.348 r0 = r7.A00
            X.2rN r0 = r0.A04
            X.3W1 r0 = r0.BQr(r9)
            if (r0 == 0) goto L_0x0036
            X.3W8 r0 = r0.A3b
            java.lang.Object r0 = r0.A00
            X.3W9 r0 = (X.AnonymousClass3W9) r0
            if (r0 != 0) goto L_0x0043
        L_0x0036:
            r0 = -27849163(0xfffffffffe570e35, float:-7.1464447E37)
        L_0x0039:
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -676620130(0xffffffffd7ab989e, float:-3.77343948E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x0043:
            X.JOH r2 = r1.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0063
            r0 = 3
            if (r1 == r0) goto L_0x0056
            r0 = 1
            if (r1 == r0) goto L_0x0056
        L_0x0052:
            r0 = 741615035(0x2c3425bb, float:2.5600483E-12)
            goto L_0x0039
        L_0x0056:
            if (r2 == 0) goto L_0x005d
            X.3W9 r0 = X.AnonymousClass3W9.Original
            r2.Dty(r9, r0)
        L_0x005d:
            X.3W9 r0 = X.AnonymousClass3W9.Original
            r7.Dty(r9, r0)
            goto L_0x0052
        L_0x0063:
            if (r2 == 0) goto L_0x006a
            X.3W9 r0 = X.AnonymousClass3W9.Translated
            r2.Dty(r9, r0)
        L_0x006a:
            X.3gp r1 = r9.A1T()
            if (r1 == 0) goto L_0x00b3
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x00b3
            X.0MB r0 = r6.A05
            java.lang.String r1 = r1.A0G
            android.util.LruCache r0 = r0.A05
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x00b3
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.1i5 r1 = r9.A0d
            X.3gp r0 = r9.A1T()
            X.1i7 r0 = r1.A00(r0)
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0095:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = r2.next()
            X.3gp r1 = (X.C247733gp) r1
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r1.A0G
            boolean r0 = X.AnonymousClass3f0.A04(r0)
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r1.A0G
            r8.add(r0)
            goto L_0x0095
        L_0x00b3:
            X.3W9 r0 = X.AnonymousClass3W9.Translated
            r7.Dty(r9, r0)
            goto L_0x00d3
        L_0x00b9:
            androidx.fragment.app.Fragment r2 = r6.A00
            boolean r0 = r2.isResumed()
            if (r0 == 0) goto L_0x00d3
            X.4D6 r2 = (X.AnonymousClass4D6) r2
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1OC r1 = X.C56308HwL.A01(r0, r8)
            X.H4c r0 = new X.H4c
            r0.<init>(r9, r6, r5, r7)
            r1.A00 = r0
            r2.schedule(r1)
        L_0x00d3:
            com.instagram.common.session.UserSession r8 = r6.A01
            X.3kK r11 = r6.A06
            X.4DU r10 = r6.A02
            int r15 = r5.A03
            boolean r0 = r5.A0p()
            if (r0 == 0) goto L_0x00f1
            int r0 = r5.getPosition()
        L_0x00e5:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
            r13 = 0
            java.lang.String r14 = "see_translation"
            X.C233822wX.A0Q(r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x0052
        L_0x00f1:
            r0 = -1
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34E.onEvent(java.lang.Object):void");
    }
}
