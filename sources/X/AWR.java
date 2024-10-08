package X;

public final class AWR implements 1UV {
    public final int A00;
    public final Object A01;

    public AWR(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008c, code lost:
        if (r4.CZ7(r0) != r2) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b6, code lost:
        if (r1.CZ7(r0) != r2) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b8, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00bd, code lost:
        if ((r4 instanceof X.C354798Nk) == false) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bf, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010b, code lost:
        return !r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0005 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0007;
                case 2: goto L_0x0042;
                case 3: goto L_0x00e8;
                case 4: goto L_0x0079;
                case 5: goto L_0x00a2;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0069;
                case 8: goto L_0x008f;
                case 9: goto L_0x0005;
                case 10: goto L_0x00c0;
                case 11: goto L_0x00f9;
                case 12: goto L_0x010c;
                case 13: goto L_0x00d5;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = 0
        L_0x0006:
            return r2
        L_0x0007:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x0005
            java.lang.Object r2 = r3.A01
            X.3xW r2 = (X.C257513xW) r2
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r0 = r4.getValue()
            boolean r0 = r2.AJa(r1, r0)
            if (r0 != 0) goto L_0x0005
            goto L_0x0040
        L_0x001e:
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r2 = r3.A01
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r1 = r4.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = "id"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            java.lang.String r0 = "ent_id"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            boolean r0 = X.C11368SPm.A03(r1, r2)
            if (r0 == 0) goto L_0x0005
        L_0x0040:
            r2 = 1
            return r2
        L_0x0042:
            com.instagram.ui.widget.mediapicker.Folder r4 = (com.instagram.ui.widget.mediapicker.Folder) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            int r1 = r4.A02
            r2 = 1
            r0 = -1
            if (r1 == r0) goto L_0x0006
            r0 = -5
            if (r1 != r0) goto L_0x005c
            java.lang.Object r0 = r3.A01
            X.JW8 r0 = (X.JW8) r0
            X.JWM r0 = r0.A0F
            boolean r0 = r0.A07
            r2 = r0 ^ 1
            return r2
        L_0x005c:
            r0 = -10
            if (r1 == r0) goto L_0x0005
            java.util.Set r0 = r4.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0005
            return r2
        L_0x0069:
            boolean r0 = r4 instanceof X.C321026tS
            if (r0 == 0) goto L_0x0005
            X.6tS r4 = (X.C321026tS) r4
            r2 = 1
            if (r4 == 0) goto L_0x0005
            java.lang.Object r0 = r3.A01
            X.Agh r0 = (X.C40667Agh) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            goto L_0x0088
        L_0x0079:
            boolean r0 = r4 instanceof X.C321026tS
            if (r0 == 0) goto L_0x0005
            X.6tS r4 = (X.C321026tS) r4
            r2 = 1
            if (r4 == 0) goto L_0x0005
            java.lang.Object r0 = r3.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            com.instagram.common.session.UserSession r0 = r0.A0B
        L_0x0088:
            boolean r0 = r4.CZ7(r0)
            if (r0 != r2) goto L_0x0005
            return r2
        L_0x008f:
            boolean r0 = r4 instanceof X.C321026tS
            if (r0 == 0) goto L_0x00a0
            r1 = r4
            X.6tS r1 = (X.C321026tS) r1
        L_0x0096:
            r2 = 1
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r0 = r3.A01
            X.Agh r0 = (X.C40667Agh) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            goto L_0x00b2
        L_0x00a0:
            r1 = 0
            goto L_0x0096
        L_0x00a2:
            boolean r0 = r4 instanceof X.C321026tS
            if (r0 == 0) goto L_0x00b9
            r1 = r4
            X.6tS r1 = (X.C321026tS) r1
        L_0x00a9:
            r2 = 1
            if (r1 == 0) goto L_0x00bb
            java.lang.Object r0 = r3.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            com.instagram.common.session.UserSession r0 = r0.A0B
        L_0x00b2:
            boolean r0 = r1.CZ7(r0)
            if (r0 != r2) goto L_0x00bb
            return r2
        L_0x00b9:
            r1 = 0
            goto L_0x00a9
        L_0x00bb:
            boolean r0 = r4 instanceof X.C354798Nk
            if (r0 == 0) goto L_0x0005
            return r2
        L_0x00c0:
            X.3su r4 = (X.C254703su) r4
            if (r4 == 0) goto L_0x0005
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r3.A01
            X.OLj r0 = (X.C70789OLj) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r2 = r4.A1l(r0)
            return r2
        L_0x00d5:
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            com.instagram.model.direct.DirectShareTarget r4 = (com.instagram.model.direct.DirectShareTarget) r4
            java.util.ArrayList r0 = r4.A0B()
            java.lang.Object r0 = X.AnonymousClass7TE.A12(r0)
            boolean r0 = r1.contains(r0)
            goto L_0x0109
        L_0x00e8:
            java.lang.Object r0 = r3.A01
            X.9mO r0 = (X.C387549mO) r0
            com.instagram.common.session.UserSession r1 = r0.A09
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r1)
            boolean r0 = r4.equals(r0)
            goto L_0x0109
        L_0x00f9:
            X.0eE r1 = X.AnonymousClass0t1.A01
            java.lang.Object r0 = r3.A01
            X.Lwp r0 = (X.C65614Lwp) r0
            com.instagram.common.session.UserSession r0 = r0.A03
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = X.0qQ.A0K(r0, r4)
        L_0x0109:
            r2 = r0 ^ 1
            return r2
        L_0x010c:
            java.lang.Object r0 = r3.A01
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r0 = r0.invoke(r4)
            boolean r2 = X.AnonymousClass7TE.A1a(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AWR.apply(java.lang.Object):boolean");
    }
}
