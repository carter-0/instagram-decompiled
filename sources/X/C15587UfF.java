package X;

/* renamed from: X.UfF  reason: case insensitive filesystem */
public final class C15587UfF extends 1P0 {
    public final /* synthetic */ AnonymousClass540 A00;
    public final /* synthetic */ C278784xW A01;

    public C15587UfF(AnonymousClass540 r1, C278784xW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r16) {
        /*
            r15 = this;
            r2 = r16
            r0 = 1921158544(0x72828d90, float:5.171736E30)
            int r6 = X.AnonymousClass0fD.A03(r0)
            X.5u7 r2 = (X.C298835u7) r2
            r0 = -1041921455(0xffffffffc1e58a51, float:-28.692537)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r2, r8)
            X.4xW r10 = r15.A01
            java.lang.String r9 = "XMAClipsDirectBackgroundPrefetcher"
            com.instagram.common.session.UserSession r11 = r10.A03
            android.content.Context r1 = r10.A01
            X.540 r12 = r15.A00
            X.4xV r13 = r10.A04
            r0 = 141(0x8d, float:1.98E-43)
            java.lang.String r7 = X.C273654mx.A00(r0)
            X.ViG r0 = new X.ViG
            r0.<init>(r1, r12, r11, r13)
            r10.A00 = r0
            boolean r0 = r2 instanceof X.C298825u6
            if (r0 == 0) goto L_0x006a
            X.5u6 r2 = (X.C298825u6) r2
            if (r2 == 0) goto L_0x006a
            X.5l1 r0 = r2.A01
            if (r0 != 0) goto L_0x0043
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0043:
            java.util.List r0 = r0.Ao0()
            if (r0 == 0) goto L_0x006a
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r1.next()
            X.4sM r0 = (X.C276024sM) r0
            X.4bN r0 = X.C295325ny.A02(r0)
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0052
            r4.add(r0)
            goto L_0x0052
        L_0x006a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x006f:
            int r14 = r4.size()
            boolean r0 = X.C278774xV.A00(r13)
            if (r0 == 0) goto L_0x0082
            X.1QP r3 = r13.A01
            long r1 = r13.A00
            java.lang.String r0 = "medias_to_prefetch"
            r3.flowAnnotate(r1, r0, r14)
        L_0x0082:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x00a9
            java.lang.String r4 = "No media found for fetched clips."
            boolean r0 = X.C278774xV.A00(r13)
            if (r0 == 0) goto L_0x0099
            X.1QP r3 = r13.A01
            long r0 = r13.A00
            java.lang.String r2 = "NO_MEDIAS"
            r3.flowEndCancel(r0, r2, r4)
        L_0x0099:
            r12.AVX(r7)
        L_0x009c:
            r0 = -409214706(0xffffffffe79be10e, float:-1.4722367E24)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 950512128(0x38a7aa00, float:7.9948455E-5)
            X.AnonymousClass0fD.A0A(r0, r6)
            return
        L_0x00a9:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36600839418548223(0x82084500060fff, double:3.209856455816157E-306)
            long r2 = X.182.A01(r2, r11, r0)
            X.ViG r11 = r10.A00
            if (r11 == 0) goto L_0x009c
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4.size()
            java.util.Iterator r14 = r4.iterator()
        L_0x00c4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0106
            X.1Xj r1 = X.C51966G9m.A0t(r14)
            boolean r0 = r1.A50()
            if (r0 != 0) goto L_0x00e1
            r1.getId()
            java.lang.String r0 = r1.getId()
            if (r0 == 0) goto L_0x016e
            r10.add(r0)
            goto L_0x00c4
        L_0x00e1:
            X.3WR r0 = r1.CEL()
            X.3vO r1 = new X.3vO
            r1.<init>(r0, r9)
            r13 = 1
            X.PRk r12 = new X.PRk
            r12.<init>(r11, r13)
            java.util.List r0 = r11.A08
            r0.add(r12)
            int r0 = r11.A01
            r1.A01(r12, r0)
            r1.A01 = r13
            com.instagram.common.session.UserSession r0 = r11.A05
            X.3uP r0 = X.C255593uO.A00(r0)
            r0.A01(r1)
            goto L_0x00c4
        L_0x0106:
            boolean r0 = X.DbT.A1b(r10)
            if (r0 == 0) goto L_0x0121
            X.4xV r1 = r11.A06
            java.lang.String r12 = X.DbT.A10(r10)
            boolean r0 = X.C278774xV.A00(r1)
            if (r0 == 0) goto L_0x0121
            X.1QP r10 = r1.A01
            long r0 = r1.A00
            java.lang.String r9 = "medias_with_no_video_source"
            r10.flowAnnotate(r0, r9, r12)
        L_0x0121:
            r4.size()
            java.util.Iterator r10 = r4.iterator()
        L_0x0128:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0160
            X.1Xj r9 = X.C51966G9m.A0t(r10)
            r0 = 4
            X.Lez r4 = new X.Lez
            r4.<init>(r11, r0)
            java.util.List r0 = r11.A07
            r0.add(r4)
            android.content.Context r0 = r11.A02
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r9.A1n(r0)
            if (r1 == 0) goto L_0x0128
            X.1NK r0 = X.1NK.A00()
            X.1OO r1 = r0.A0J(r1, r7)
            r0 = 1
            r1.A0I = r0
            com.instagram.common.session.UserSession r0 = r11.A05
            r1.A05 = r0
            r1.A02(r4)
            r9.A17()
            r1.A0F = r8
            r1.A01()
            goto L_0x0128
        L_0x0160:
            android.os.Handler r1 = r11.A03
            X.Wn6 r0 = new X.Wn6
            r0.<init>(r11, r2)
            r11.A00 = r0
            r1.postDelayed(r0, r2)
            goto L_0x009c
        L_0x016e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15587UfF.onSuccess(java.lang.Object):void");
    }

    public final void onFail(C268654dm r8) {
        String str;
        int A0D = AnonymousClass7TG.A0D(r8, 720008060);
        C278774xV r1 = this.A01.A04;
        Throwable A012 = r8.A01();
        if (C278774xV.A00(r1)) {
            1QP r4 = r1.A01;
            long j = r1.A00;
            if (A012 == null || (str = A012.getMessage()) == null) {
                str = "empty";
            }
            r4.flowEndFail(j, "DATA_FETCH_FAILURE", str);
        }
        this.A00.AVX(C273654mx.A00(141));
        AnonymousClass0fD.A0A(-1497289797, A0D);
    }
}
