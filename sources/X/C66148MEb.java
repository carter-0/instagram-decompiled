package X;

/* renamed from: X.MEb  reason: case insensitive filesystem */
public final class C66148MEb extends AnonymousClass1Ek implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66148MEb(Object obj, Object obj2, Object obj3, Object obj4, String str, AnonymousClass4D7 r7, int i) {
        super(2, r7);
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.MEb, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        Object obj2;
        String str;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        AnonymousClass4D7 r6 = r10;
        switch (this.A00) {
            case 0:
                obj5 = this.A02;
                obj4 = this.A03;
                str = this.A05;
                obj2 = this.A04;
                obj3 = this.A01;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                obj4 = this.A03;
                str = this.A05;
                obj3 = this.A01;
                obj5 = this.A02;
                i = 1;
                break;
            case 2:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 2;
                break;
            case 3:
                obj2 = this.A04;
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj5 = this.A02;
                i = 3;
                break;
            default:
                str = this.A05;
                obj3 = this.A01;
                obj4 = this.A03;
                obj2 = this.A04;
                obj5 = this.A02;
                i = 4;
                break;
        }
        return new C66148MEb(obj2, obj4, obj3, obj5, str, r6, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x0166;
                case 1: goto L_0x012f;
                case 2: goto L_0x00e7;
                case 3: goto L_0x0099;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0eS.A00(r9)
            X.KhH r1 = X.C62525KhH.DETAILS
            java.lang.String r0 = r8.A05
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r0)
            r6 = 0
            X.KhH r1 = X.C62525KhH.INITIATOR
            java.lang.Object r5 = r8.A01
            X.M0V r5 = (X.M0V) r5
            com.instagram.user.model.User r0 = r5.A08
            r3 = 0
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = r0.B8Q()
        L_0x0020:
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = ""
        L_0x0024:
            X.0eP[] r0 = X.JTQ.A1b(r1, r0, r2)
            java.util.LinkedHashMap r4 = X.0Yt.A07(r0)
            goto L_0x002f
        L_0x002d:
            r0 = r3
            goto L_0x0020
        L_0x002f:
            com.instagram.user.model.User r0 = r5.A08     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0083
            com.instagram.common.typedurl.ImageUrl r2 = r0.Bh3()     // Catch:{ Exception -> 0x0077 }
            java.lang.Object r0 = r8.A04     // Catch:{ Exception -> 0x0077 }
            X.KdH r0 = (X.C62283KdH) r0     // Catch:{ Exception -> 0x0077 }
            X.1NK r1 = X.1NK.A00()     // Catch:{ Exception -> 0x0077 }
            com.instagram.common.session.UserSession r0 = r0.A04     // Catch:{ Exception -> 0x0077 }
            X.3LX r0 = r1.A0K(r0, r2, r3)     // Catch:{ Exception -> 0x0077 }
            if (r0 == 0) goto L_0x0083
            android.graphics.Bitmap r1 = r0.A01     // Catch:{ Exception -> 0x0077 }
            if (r1 == 0) goto L_0x0083
            r0 = 45
            X.0fO.A03(r1)     // Catch:{ Exception -> 0x0077 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r1, r0, r0, r6)     // Catch:{ Exception -> 0x0077 }
            X.0qQ.A07(r3)     // Catch:{ Exception -> 0x0077 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x0077 }
            r2.<init>()     // Catch:{ Exception -> 0x0077 }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x0077 }
            r0 = 50
            X.0fO.A02(r1, r3, r2, r0)     // Catch:{ Exception -> 0x0077 }
            X.KhH r1 = X.C62525KhH.PROFILE_PIC     // Catch:{ all -> 0x0070 }
            byte[] r0 = r2.toByteArray()     // Catch:{ all -> 0x0070 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0070 }
            r2.close()     // Catch:{ Exception -> 0x0077 }
            goto L_0x0083
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x0077 }
            throw r0     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            r2 = move-exception
            java.lang.String r0 = "sup: IgLiveCommentsViewModel Unable to fetch profile pic bitmap "
            java.lang.String r1 = X.AnonymousClass7TF.A0m(r0, r2)
            java.lang.String r0 = "sup: IgLiveCommentsViewModel"
            X.0KC.A0F(r0, r1, r2)
        L_0x0083:
            java.lang.Object r3 = r8.A03
            X.LR1 r3 = (X.LR1) r3
            java.lang.Object r2 = r8.A02
            r1 = 39
            X.J6m r0 = new X.J6m
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r2)
            X.MTN r0 = X.C62998Kpo.A00(r0)
            r3.A01(r0)
            goto L_0x018f
        L_0x0099:
            X.0eS.A00(r9)
            java.lang.Object r0 = r8.A04
            X.Ly4 r0 = (X.C65689Ly4) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 9
            X.WxR r1 = new X.WxR
            r1.<init>(r2, r0)
            java.lang.Class<X.Lil> r0 = X.C64825Lil.class
            java.lang.Object r5 = r2.A01(r0, r1)
            X.Lil r5 = (X.C64825Lil) r5
            java.lang.String r4 = r8.A05
            java.lang.Object r0 = r8.A01
            java.lang.String r3 = r0.toString()
            java.lang.Object r0 = r8.A03
            java.lang.String r2 = r0.toString()
            java.lang.Object r0 = r8.A02
            java.lang.String r1 = r0.toString()
            X.AnonymousClass7TG.A1U(r3, r2, r1)
            if (r4 == 0) goto L_0x018f
            r0 = 95
            java.lang.String r3 = X.002.A0j(r3, r2, r1, r0, r0)
            X.0xa r2 = r5.A00
            X.0sl r1 = X.0sl.A00
            java.util.Set r0 = r2.getStringSet(r3, r1)
            if (r0 != 0) goto L_0x00db
            r0 = r1
        L_0x00db:
            java.util.Set r0 = X.00k.A0j(r0)
            r0.add(r4)
            X.JTU.A1E(r2, r3, r0)
            goto L_0x018f
        L_0x00e7:
            X.0eS.A00(r9)
            java.lang.Object r5 = r8.A04
            X.KWs r5 = (X.C62036KWs) r5
            com.instagram.common.session.UserSession r1 = r5.A00
            java.lang.String r0 = r8.A05
            java.lang.Object r4 = r8.A01
            java.util.Collection r4 = (java.util.Collection) r4
            r3 = 0
            X.AnonymousClass7TG.A1O(r0, r4)
            r6 = 0
            X.1NY r2 = X.AnonymousClass7TG.A0a(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/threads/%s/detect_thread_languages/"
            r2.A0K(r0, r1)
            java.lang.String r1 = X.C51970G9q.A0k(r4)
            java.lang.String r0 = "sender_bulk_messages"
            r2.A9m(r0, r1)
            java.lang.Class<X.K1N> r1 = X.K1N.class
            java.lang.Class<X.LIr> r0 = X.LIr.class
            X.1OC r1 = X.DbT.A0R(r6, r2, r1, r0, r3)
            r0 = 1790817603(0x6abdb543, float:1.1467148E26)
            X.032 r0 = r1.A03(r0)
            java.lang.Object r3 = r8.A03
            java.lang.Object r4 = r8.A02
            r7 = 20
            X.MGj r2 = new X.MGj
            r2.<init>(r3, r4, r5, r6, r7)
            X.JUM.A04(r2, r0)
            goto L_0x018f
        L_0x012f:
            X.0eS.A00(r9)
            java.lang.Object r4 = r8.A04
            X.Jgt r4 = (X.C60174Jgt) r4
            java.lang.Object r0 = r8.A03
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r3 = r8.A05
            java.lang.Object r2 = r8.A01
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.0qQ.A0A(r2)
            java.io.File r1 = X.0mb.A04(r0)
            X.0qQ.A07(r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0164
            X.1MF.A0M(r2, r1)
            java.util.Map r0 = r4.A00
            r0.put(r3, r1)
            java.lang.String r1 = r1.getCanonicalPath()
        L_0x015c:
            if (r1 == 0) goto L_0x018f
            java.lang.Object r0 = r8.A02
            X.C51965G9l.A1W(r0, r1)
            goto L_0x018f
        L_0x0164:
            r1 = 0
            goto L_0x015c
        L_0x0166:
            X.0eS.A00(r9)
            java.lang.Object r3 = r8.A02
            X.4tV r3 = (X.C276544tV) r3
            java.lang.Object r2 = r8.A03
            X.4uI r2 = (X.C277014uI) r2
            X.6Tl r1 = new X.6Tl
            r1.<init>()
            java.lang.String r0 = r8.A05
            r1.A01(r0)
            java.lang.Object r0 = r8.A04
            java.lang.String r0 = X.DbX.A0t(r0)
            r1.A02(r0)
            X.6Tm r1 = r1.A00()
            java.lang.Object r0 = r8.A01
            X.6Rm r0 = (X.C307786Rm) r0
            X.C307886Rw.A03(r0, r3, r1, r2)
        L_0x018f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66148MEb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66148MEb) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
