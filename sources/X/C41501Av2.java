package X;

/* renamed from: X.Av2  reason: case insensitive filesystem */
public final class C41501Av2 implements 02o {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C41501Av2(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v9, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0174, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0198, code lost:
        if (r0 != r5) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object emit(java.lang.Object r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0149;
                case 1: goto L_0x0107;
                case 2: goto L_0x005f;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.util.List r10 = (java.util.List) r10
            java.lang.String r1 = r9.A02
            if (r1 == 0) goto L_0x0014
            java.lang.Object r0 = r9.A01
            X.7Uz r0 = (X.C332427Uz) r0
            X.7Us r0 = r0.A01
            r0.A03(r1)
        L_0x0014:
            java.lang.Object r0 = r9.A01
            X.7Uz r0 = (X.C332427Uz) r0
            X.7Us r0 = r0.A01
            r0.A04(r10)
        L_0x001d:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0020:
            r4 = 37
            boolean r0 = X.ME6.A02(r4, r11)
            if (r0 == 0) goto L_0x0046
            r3 = r11
            X.ME6 r3 = (X.ME6) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0046
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0036:
            java.lang.Object r4 = r3.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x004c
            if (r0 == r1) goto L_0x0174
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0046:
            X.ME6 r3 = new X.ME6
            r3.<init>(r9, r11, r4)
            goto L_0x0036
        L_0x004c:
            X.0eS.A00(r4)
            java.lang.Object r0 = r9.A01
            X.02o r0 = (X.02o) r0
            if (r10 != 0) goto L_0x0057
            java.lang.String r10 = r9.A02
        L_0x0057:
            r3.A00 = r1
            java.lang.Object r0 = r0.emit(r10, r3)
            goto L_0x0198
        L_0x005f:
            X.9IP r10 = (X.AnonymousClass9IP) r10
            java.lang.Object r0 = r10.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r2 = 1
            if (r1 == r2) goto L_0x0078
            r0 = 2
            if (r1 == r0) goto L_0x00a8
            r0 = 3
            if (r1 == r0) goto L_0x00a8
            r0 = 0
            if (r1 == r0) goto L_0x00af
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0078:
            java.lang.Object r3 = r9.A01
            X.7Sq r3 = (X.C331857Sq) r3
            X.7ZW r1 = r3.A0D
            java.lang.String r0 = r9.A02
            r1.A01(r0, r2)
            r3.A06 = r2
            X.C331857Sq.A02(r3)
            X.0sa r0 = r3.A0K
            java.lang.Object r1 = r0.invoke()
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            X.7Zv r0 = r3.A0C
            r1.A15(r0)
            X.7TP r2 = r3.A0E
            X.7Zu r1 = r3.A0A
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.List r0 = r2.A01
            r0.add(r1)
            X.0sa r0 = r3.A0M
            r0.invoke()
            goto L_0x00af
        L_0x00a8:
            java.lang.Object r0 = r9.A01
            X.7Sq r0 = (X.C331857Sq) r0
            X.C331857Sq.A00(r0)
        L_0x00af:
            java.lang.Object r4 = r9.A01
            X.7Sq r4 = (X.C331857Sq) r4
            boolean r0 = r4.A04
            boolean r5 = r10.A02
            if (r0 == r5) goto L_0x00d7
            java.lang.Integer r1 = r4.A03
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == 0) goto L_0x00db
            if (r1 != r0) goto L_0x00ca
            X.Nh3 r1 = r4.A01
            if (r1 == 0) goto L_0x00ca
            X.AxR r0 = X.C41613AxR.A00
            r1.A05(r0)
        L_0x00ca:
            X.0sa r0 = r4.A0K
            java.lang.Object r1 = r0.invoke()
            android.view.View r1 = (android.view.View) r1
            X.7Zt r0 = r4.A0B
            r1.removeOnLayoutChangeListener(r0)
        L_0x00d7:
            r4.A04 = r5
            goto L_0x001d
        L_0x00db:
            if (r1 != r0) goto L_0x00e4
            X.Nh3 r0 = r4.A01
            if (r0 == 0) goto L_0x00e4
            r0.A03()
        L_0x00e4:
            X.Nh3 r0 = r4.A01
            if (r0 == 0) goto L_0x00d7
            X.7Rs r0 = r4.A00
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319398803414247(0x81084d00221ce7, double:3.0318722775350364E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00d7
            X.0sa r0 = r4.A0K
            java.lang.Object r1 = r0.invoke()
            android.view.View r1 = (android.view.View) r1
            X.7Zt r0 = r4.A0B
            r1.addOnLayoutChangeListener(r0)
            goto L_0x00d7
        L_0x0107:
            X.8ve r10 = (X.C369988ve) r10
            if (r10 == 0) goto L_0x001d
            java.lang.Object r7 = r9.A01
            com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel r7 = (com.instagram.creation.capture.quickcapture.storydrafts.StoryDraftsCreationViewModel) r7
            java.lang.String r8 = r9.A02
            com.instagram.common.session.UserSession r0 = r7.A03
            X.27r r6 = X.27p.A01(r0)
            X.8ka r0 = r10.A00()
            if (r0 == 0) goto L_0x0147
            X.8nd r0 = r0.A02
        L_0x011f:
            X.28t r5 = X.C59895JbK.A06(r0)
            java.lang.String r4 = r10.A05
            X.0iw r0 = r7.A02
            java.lang.String r3 = r0.getModuleName()
            r0 = 1
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r6.A0r(r0, r5, r4, r3)
            java.util.List r0 = X.AnonymousClass7TE.A1I(r8)
            r7.A04(r0)
            goto L_0x001d
        L_0x0147:
            r0 = 0
            goto L_0x011f
        L_0x0149:
            r4 = 0
            boolean r0 = X.ME8.A03(r4, r11)
            if (r0 == 0) goto L_0x016e
            r3 = r11
            X.ME8 r3 = (X.ME8) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x016e
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x015e:
            java.lang.Object r4 = r3.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L_0x0179
            if (r0 == r2) goto L_0x0174
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x016e:
            X.ME8 r3 = new X.ME8
            r3.<init>(r9, r11, r4)
            goto L_0x015e
        L_0x0174:
            X.0eS.A00(r4)
            goto L_0x001d
        L_0x0179:
            X.0eS.A00(r4)
            java.lang.Object r1 = r9.A01
            X.02o r1 = (X.02o) r1
            java.util.Map r10 = (java.util.Map) r10
            java.lang.String r0 = r9.A02
            java.lang.Object r0 = r10.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r3)
        L_0x0198:
            if (r0 != r5) goto L_0x001d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41501Av2.emit(java.lang.Object, X.4D7):java.lang.Object");
    }
}
