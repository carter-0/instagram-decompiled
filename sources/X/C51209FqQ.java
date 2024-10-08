package X;

/* renamed from: X.FqQ  reason: case insensitive filesystem */
public final class C51209FqQ implements Runnable {
    public final /* synthetic */ EN0 A00;

    public C51209FqQ(EN0 en0) {
        this.A00 = en0;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0075, code lost:
        if (r5 == -602962448) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0079, code lost:
        if (r5 != 2591) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007b, code lost:
        r0 = r8.equals("QP");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007f, code lost:
        if (r0 != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        r6.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r6.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0087, code lost:
        r0 = r8.equals("MONETIZATION_INBOX");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        r0 = r8.equals("NOTIFICATION");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        r0 = r8.equals("SETTINGS");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ab, code lost:
        if (r0 != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        if (r8.equals("MONETIZATION_INBOX") != false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b4, code lost:
        r7.A0y(r8, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c1, code lost:
        if (r8.equals(r0) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c3, code lost:
        r6.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x005e, code lost:
        r7.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0061, code lost:
        r6 = X.DbU.A0Q(r6, r11);
        r6.A0D(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x006b, code lost:
        if (r5 == -2077709277) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0070, code lost:
        if (r5 == -1382453013) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            X.EN0 r3 = r13.A00
            X.0eM r5 = r3.A0C
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r5)
            r12 = 1
            X.0eM r4 = r3.A05
            java.lang.String r0 = X.DbS.A0t(r4)
            java.lang.String r1 = X.DbY.A0j(r0)
            java.lang.String r0 = "entry_point"
            X.0eP r0 = X.AnonymousClass7TE.A1L(r0, r1)
            r10 = 0
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.HashMap r1 = X.0Yt.A02(r0)
            java.lang.String r0 = "com.bloks.www.ig.bonus.bonus-settings"
            X.DiU r2 = X.C46649DiU.A04(r0, r1)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r0)
            r0 = 2131964326(0x7f1331a6, float:1.956543E38)
            X.DbZ.A19(r3, r1, r0)
            X.3M3 r9 = X.C49891FBs.A02(r1, r2)
            java.lang.String r8 = X.DbS.A0t(r4)
            X.AnonymousClass7TF.A1C(r11, r10, r8)
            X.0hq r7 = r3.getParentFragmentManager()
            boolean r0 = r7.A12()
            if (r0 != 0) goto L_0x0086
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            int r5 = r8.hashCode()
            java.lang.String r4 = "QP"
            java.lang.String r3 = "MONETIZATION_INBOX"
            java.lang.String r2 = "NOTIFICATION"
            java.lang.String r1 = "SETTINGS"
            switch(r5) {
                case -2077709277: goto L_0x0096;
                case -1382453013: goto L_0x00a2;
                case -602962448: goto L_0x00ae;
                case 2591: goto L_0x00a7;
                case 523908395: goto L_0x00b8;
                case 1915236889: goto L_0x00bb;
                default: goto L_0x005e;
            }
        L_0x005e:
            r7.A0c()
        L_0x0061:
            X.6Yo r6 = X.DbU.A0Q(r6, r11)
            r6.A0D(r9)
            r0 = -2077709277(0xffffffff8428ac23, float:-1.9827346E-36)
            if (r5 == r0) goto L_0x0091
            r0 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r5 == r0) goto L_0x008c
            r0 = -602962448(0xffffffffdc0f85f0, float:-1.6159275E17)
            if (r5 == r0) goto L_0x0087
            r0 = 2591(0xa1f, float:3.631E-42)
            if (r5 != r0) goto L_0x0081
            boolean r0 = r8.equals(r4)
        L_0x007f:
            if (r0 != 0) goto L_0x0083
        L_0x0081:
            r6.A0D = r10
        L_0x0083:
            r6.A04()
        L_0x0086:
            return
        L_0x0087:
            boolean r0 = r8.equals(r3)
            goto L_0x007f
        L_0x008c:
            boolean r0 = r8.equals(r2)
            goto L_0x007f
        L_0x0091:
            boolean r0 = r8.equals(r1)
            goto L_0x007f
        L_0x0096:
            boolean r0 = r8.equals(r1)
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = X.FRY.A09
            r7.A0y(r0, r12)
            goto L_0x0061
        L_0x00a2:
            boolean r0 = r8.equals(r2)
            goto L_0x00ab
        L_0x00a7:
            boolean r0 = r8.equals(r4)
        L_0x00ab:
            if (r0 != 0) goto L_0x00b4
            goto L_0x005e
        L_0x00ae:
            boolean r0 = r8.equals(r3)
            if (r0 == 0) goto L_0x005e
        L_0x00b4:
            r7.A0y(r8, r12)
            goto L_0x0061
        L_0x00b8:
            java.lang.String r0 = "POST_LIVE"
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r0 = "LIVE_SCHEDULE_AUDIENCE"
        L_0x00bd:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x005e
            r6.finish()
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51209FqQ.run():void");
    }
}
