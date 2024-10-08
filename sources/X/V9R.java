package X;

public abstract class V9R {
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        r0 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007d, code lost:
        r0.Eqr(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r0 == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r3 = r3.equals("show_captions");
        r2 = r2.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ba, code lost:
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        if (r0 == null) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00be, code lost:
        r1 = r0.A03.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r2.A04.A0E() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cc, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r1.setVisibility(X.DbW.A01(r3 ? 1 : 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x002c, code lost:
        X.1Kn.A02(X.C273654mx.A00(575), X.002.A0R("Received unknown action: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.AnonymousClass6Tm r4) {
        /*
            X.6Rm r2 = X.Dbb.A0L(r4)
            java.lang.Object r3 = X.DbW.A0d(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r4.A00()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel"
            X.0qQ.A0C(r1, r0)
            X.4tV r1 = (X.C276544tV) r1
            java.lang.String r4 = r1.A0D()
            if (r4 == 0) goto L_0x00e3
            X.2nJ r0 = r2.A02
            X.2nI r0 = (X.C229382nI) r0
            X.6gL r2 = X.C313366gK.A00(r0)
            int r0 = r3.hashCode()
            java.lang.String r1 = "show_captions"
            switch(r0) {
                case -1714437718: goto L_0x003d;
                case -840405966: goto L_0x0044;
                case 3363353: goto L_0x005f;
                case 3443508: goto L_0x0081;
                case 3540994: goto L_0x008d;
                case 1690109519: goto L_0x00aa;
                default: goto L_0x002c;
            }
        L_0x002c:
            java.lang.String r0 = "Received unknown action: "
            java.lang.String r1 = X.002.A0R(r0, r3)
            r0 = 575(0x23f, float:8.06E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.1Kn.A02(r0, r1)
        L_0x003b:
            r0 = 0
            return r0
        L_0x003d:
            java.lang.String r0 = "hide_captions"
            boolean r0 = r3.equals(r0)
            goto L_0x00ae
        L_0x0044:
            java.lang.String r0 = "unmute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002c
            X.6Jw r1 = r2.A00(r4)
            if (r1 == 0) goto L_0x003b
            java.util.HashMap r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00d9
            X.Uu3 r0 = (X.C16386Uu3) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0078
        L_0x005f:
            java.lang.String r0 = "mute"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002c
            X.6Jw r1 = r2.A00(r4)
            if (r1 == 0) goto L_0x003b
            java.util.HashMap r0 = r2.A03
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x00de
            X.Uu3 r0 = (X.C16386Uu3) r0
            r2 = 0
        L_0x0078:
            r1 = 0
            X.4M3 r0 = r0.A02
            if (r0 == 0) goto L_0x003b
            r0.Eqr(r2, r1)
            goto L_0x003b
        L_0x0081:
            java.lang.String r0 = "play"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002c
            r2.A03(r4)
            goto L_0x003b
        L_0x008d:
            java.lang.String r0 = "stop"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002c
            X.6Jw r1 = r2.A00(r4)
            if (r1 == 0) goto L_0x003b
            java.util.HashMap r0 = r2.A03
            java.lang.Object r1 = r0.get(r1)
            X.Uu3 r1 = (X.C16386Uu3) r1
            if (r1 == 0) goto L_0x003b
            r0 = 1
            r1.A00(r0)
            goto L_0x003b
        L_0x00aa:
            boolean r0 = r3.equals(r1)
        L_0x00ae:
            if (r0 == 0) goto L_0x002c
            boolean r3 = r3.equals(r1)
            X.6Jw r2 = r2.A00(r4)
            if (r2 == 0) goto L_0x003b
            X.3v4 r0 = r2.A00
            if (r0 == 0) goto L_0x00d7
            X.2eb r0 = r0.A03
            android.view.View r1 = r0.A01()
        L_0x00c4:
            X.4tV r0 = r2.A04
            java.lang.String r0 = r0.A0E()
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r0 = X.DbW.A01(r3)
            r1.setVisibility(r0)
            goto L_0x003b
        L_0x00d7:
            r1 = 0
            goto L_0x00c4
        L_0x00d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00e3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V9R.A00(X.6Tm):java.lang.Object");
    }
}
