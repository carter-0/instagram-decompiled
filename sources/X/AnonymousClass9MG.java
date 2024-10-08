package X;

/* renamed from: X.9MG  reason: invalid class name */
public final class AnonymousClass9MG extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MG(int i, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:0x051c, code lost:
        if (X.0qQ.A0K(r12, r3) == false) goto L_0x051e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0613, code lost:
        if (r4.A05.A00() >= 3) goto L_0x0615;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
        /*
            r26 = this;
            r2 = r26
            r0 = r28
            r1 = r27
            int r3 = r2.A00
            switch(r3) {
                case 0: goto L_0x078d;
                case 1: goto L_0x075c;
                case 2: goto L_0x0481;
                case 3: goto L_0x0462;
                case 4: goto L_0x043d;
                case 5: goto L_0x041f;
                case 6: goto L_0x03e6;
                case 7: goto L_0x037c;
                case 8: goto L_0x02fd;
                case 9: goto L_0x02ac;
                case 10: goto L_0x0286;
                case 11: goto L_0x0267;
                case 12: goto L_0x0234;
                case 13: goto L_0x0203;
                case 14: goto L_0x01dd;
                case 15: goto L_0x0171;
                case 16: goto L_0x0132;
                case 17: goto L_0x0105;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.5u7 r1 = (X.C298835u7) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            X.0qQ.A0B(r1, r5)
            r4 = 1
            if (r0 == 0) goto L_0x006d
            java.util.List r0 = r1.Ao4()
            java.util.Iterator r6 = r0.iterator()
        L_0x0022:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r3 = r6.next()
            r0 = r3
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0022
        L_0x0033:
            X.4bN r3 = (X.C267324bN) r3
            if (r3 == 0) goto L_0x005c
            X.1Xj r9 = r3.A02
            if (r9 == 0) goto L_0x005c
            java.lang.Object r8 = r2.A02
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            X.1Gd r3 = X.1Gc.A00(r8)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r9.A19()
            long r6 = r0.toMillis(r6)
            r3.A01(r6)
            X.4hI r0 = X.C270774hH.A00(r8)
            r0.A01 = r9
            long r6 = android.os.SystemClock.elapsedRealtime()
            r0.A00 = r6
        L_0x005c:
            java.lang.Object r0 = r2.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.5o6 r6 = X.C295395o5.A00(r0)
            java.util.List r3 = X.C270734hD.A00(r1)
            X.5o7 r0 = X.C295415o7.PREFETCH_CACHE
            r6.A01(r0, r3)
        L_0x006d:
            java.lang.Object r8 = r2.A02
            X.0lg r8 = (X.0lg) r8
            X.0qQ.A0B(r8, r5)
            X.0Tu r3 = X.0Tu.A05
            r6 = 36328250729381000(0x81105a00093c88, double:3.037470271160256E-306)
            boolean r0 = X.182.A06(r3, r8, r6)
            if (r0 != 0) goto L_0x07a3
            r6 = 36323174077967321(0x810bbc00082bd9, double:3.034259776364211E-306)
            boolean r9 = X.182.A06(r3, r8, r6)
            java.lang.Object r6 = r2.A01
            X.93F r6 = (X.AnonymousClass93F) r6
            X.93C r3 = X.AnonymousClass93C.A04
            java.util.List r0 = r1.Ao4()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x009d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b3
            java.lang.Object r0 = r1.next()
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x009d
            r2.add(r0)
            goto L_0x009d
        L_0x00b1:
            r3 = 0
            goto L_0x0033
        L_0x00b3:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r2.iterator()
        L_0x00bc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r2 = r8.next()
            r1 = r2
            X.1Xj r1 = (X.1Xj) r1
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x00bc
            boolean r0 = r1.CcK()
            if (r0 != 0) goto L_0x00bc
            java.util.List r0 = r1.A3b()
            if (r0 == 0) goto L_0x00e4
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r4) goto L_0x00e4
            goto L_0x00bc
        L_0x00e4:
            if (r9 == 0) goto L_0x00fc
            X.1Xy r0 = r1.A0C
            X.1sQ r0 = r0.getClipsMetadata()
            if (r0 == 0) goto L_0x00fc
            java.lang.Boolean r1 = r0.Axb()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00bc
        L_0x00fc:
            r7.add(r2)
            goto L_0x00bc
        L_0x0100:
            r6.A9J(r3, r7, r5)
            goto L_0x07a3
        L_0x0105:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r0 = r2.A03
            X.1Xu r0 = (X.1Xu) r0
            X.0sP r0 = r0.A00
            java.lang.Object r4 = r0.invoke(r1)
            X.6EB r4 = (X.AnonymousClass6EB) r4
            java.lang.Object r3 = r2.A02
            X.5HJ r3 = (X.AnonymousClass5HJ) r3
            java.lang.Object r0 = r2.A01
            X.0xI r0 = (X.0xI) r0
            X.0xF r1 = r0.A06
            java.lang.String r0 = "reason"
            java.lang.String r1 = r1.A05(r0)
            java.lang.String r0 = "ARMADILLO_NOTIFICATIONS_CLIENT_NOTIFICATION_REVOKED"
            r4.A03(r3, r0, r1, r5)
            goto L_0x07a3
        L_0x0132:
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r5 = r1.invoke(r0)
            X.3ey r5 = (X.C246663ey) r5
            java.lang.Object r4 = r2.A02
            X.3eg r4 = (X.C246483eg) r4
            if (r4 == 0) goto L_0x0163
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0163
            r3 = 1
            X.3yi r1 = r5.A04
            if (r1 == 0) goto L_0x0165
            java.lang.Object r0 = r2.A03
            android.widget.SeekBar$OnSeekBarChangeListener r0 = (android.widget.SeekBar.OnSeekBarChangeListener) r0
            X.C247803gw.A01(r0, r4, r1)
        L_0x0156:
            r1 = 32
            X.GA1 r0 = new X.GA1
            r0.<init>(r1, r5, r3)
            X.3eI r3 = new X.3eI
            r3.<init>(r0)
            return r3
        L_0x0163:
            r3 = 0
            goto L_0x0156
        L_0x0165:
            r0 = 1920(0x780, float:2.69E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0171:
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A02
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r6 = r1.invoke(r0)
            X.3ey r6 = (X.C246663ey) r6
            X.3TS r5 = r6.A01
            if (r5 == 0) goto L_0x01d1
            java.lang.Object r4 = r2.A03
            X.3et r4 = (X.C246613et) r4
            X.3W1 r3 = r4.A0E
            r1 = 0
            X.4Fz r0 = X.C262784Fz.A00
            r0.A00(r1, r5, r3)
            X.3TS r0 = r6.A01
            if (r0 == 0) goto L_0x01c5
            android.widget.FrameLayout r0 = r0.A00()
            boolean r0 = r0.hasOnClickListeners()
            if (r0 != 0) goto L_0x01ac
            java.lang.Object r1 = r2.A01
            X.2uK r1 = (X.C232722uK) r1
            X.3TS r0 = r6.A01
            if (r0 == 0) goto L_0x01b9
            android.widget.FrameLayout r0 = r0.A00()
            r1.A0P(r0, r3)
        L_0x01ac:
            r1 = 42
            X.Inq r0 = new X.Inq
            r0.<init>(r1, r6, r4)
            X.3eI r3 = new X.3eI
            r3.<init>(r0)
            return r3
        L_0x01b9:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d1:
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01dd:
            java.lang.Number r1 = (java.lang.Number) r1
            int r8 = r1.intValue()
            X.4EA r0 = (X.AnonymousClass4EA) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A03
            X.3dW r1 = (X.C245813dW) r1
            X.3Xd r1 = r1.A01
            X.4JX r3 = r1.BQG()
            java.lang.Object r4 = r2.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r5 = 0
            r7 = r1
            r6 = r0
            r3.Dl3(r4, r5, r6, r7, r8)
            goto L_0x07a3
        L_0x0203:
            java.lang.Number r1 = (java.lang.Number) r1
            int r11 = r1.intValue()
            X.4EA r0 = (X.AnonymousClass4EA) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            com.instagram.feed.widget.IgProgressImageView r1 = r0.A0N
            android.content.Context r6 = r1.getContext()
            X.0qQ.A07(r6)
            java.lang.Object r1 = r2.A03
            X.3dW r1 = (X.C245813dW) r1
            X.3Xd r1 = r1.A01
            X.4JX r8 = r1.BQG()
            java.lang.Object r4 = r2.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            X.4JZ r3 = new X.4JZ
            r5 = r3
            r7 = r4
            r9 = r0
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r3
        L_0x0234:
            android.view.View r1 = (android.view.View) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.content.Context r3 = r1.getContext()
            X.0qQ.A07(r3)
            java.lang.Object r0 = r2.A03
            X.3dW r0 = (X.C245813dW) r0
            com.instagram.common.session.UserSession r6 = r0.A00
            java.lang.Object r7 = r2.A02
            X.1Xj r7 = (X.1Xj) r7
            android.content.res.Resources r4 = r1.getResources()
            X.0qQ.A07(r4)
            X.0Pl r8 = r0.A02
            java.lang.Object r5 = r2.A01
            X.0iw r5 = (X.AnonymousClass0iw) r5
            java.lang.StringBuilder r0 = X.C246673ez.A01(r3, r4, r5, r6, r7, r8, r9)
            r1.setContentDescription(r0)
            goto L_0x07a3
        L_0x0267:
            java.lang.Number r1 = (java.lang.Number) r1
            int r5 = r1.intValue()
            X.4EA r0 = (X.AnonymousClass4EA) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A03
            X.3dW r1 = (X.C245813dW) r1
            X.3Xd r4 = r1.A01
            java.lang.Object r3 = r2.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r4.DWW(r3, r0, r1, r5)
            goto L_0x07a3
        L_0x0286:
            java.lang.Number r1 = (java.lang.Number) r1
            int r8 = r1.intValue()
            X.3ey r0 = (X.C246663ey) r0
            r1 = 1
            X.0qQ.A0B(r0, r1)
            java.lang.Object r1 = r2.A03
            X.3dW r1 = (X.C245813dW) r1
            X.3Xd r1 = r1.A01
            X.3rX r3 = r1.BNF()
            java.lang.Object r4 = r2.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r1 = r2.A02
            X.3W1 r1 = (X.AnonymousClass3W1) r1
            r5 = 0
            r7 = r1
            r6 = r0
            r3.Dl9(r4, r5, r6, r7, r8)
            goto L_0x07a3
        L_0x02ac:
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r4 = r2.A01
            X.3ZE r4 = (X.AnonymousClass3ZE) r4
            boolean r3 = X.AnonymousClass9IU.A00(r3, r4)
            if (r3 == 0) goto L_0x02fb
            java.lang.Object r2 = r2.A02
            X.1Xj r2 = (X.1Xj) r2
            X.1Xy r2 = r2.A0C
            X.DUG r2 = r2.AoE()
            if (r2 == 0) goto L_0x02fb
            java.util.List r2 = r2.AoF()
            if (r2 == 0) goto L_0x02fb
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x02fb
            X.9IU r4 = (X.AnonymousClass9IU) r4
            java.lang.Object r2 = r4.A01
            X.N4R r2 = (X.N4R) r2
            java.lang.Object r4 = r2.A00
            java.util.List r4 = (java.util.List) r4
            r2 = 2131238719(0x7f081f3f, float:1.8093725E38)
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r2)
            r2 = 2131099939(0x7f060123, float:1.7812245E38)
            int r2 = r1.getColor(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.3b0 r3 = X.0Pl.A03(r1, r3, r2, r0, r4)
            return r3
        L_0x02fb:
            r3 = 0
            return r3
        L_0x02fd:
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = (java.lang.String) r0
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r3 = r2.A02
            X.1Xj r3 = (X.1Xj) r3
            java.lang.String r6 = r3.getId()
            r3 = 0
            if (r6 == 0) goto L_0x07a5
            java.lang.Object r7 = r2.A01
            X.3ZE r7 = (X.AnonymousClass3ZE) r7
            java.lang.Object r4 = r2.A03
            X.3Ws r4 = (X.C242923Ws) r4
            boolean r2 = r7 instanceof X.C243793a7
            if (r2 == 0) goto L_0x07a5
            X.0Pl r5 = r4.A02
            X.3a7 r7 = (X.C243793a7) r7
            X.Jw5 r2 = r7.A01
            java.lang.Object r7 = r2.A02
            java.util.List r7 = (java.util.List) r7
            r2 = 2
            X.0qQ.A0B(r7, r2)
            r4 = 3
            int r2 = r7.size()
            if (r2 >= r4) goto L_0x034e
            android.content.res.Resources r4 = r1.getResources()
            r2 = 2131165266(0x7f070052, float:1.7944744E38)
            int r15 = r4.getDimensionPixelSize(r2)
            r14 = 1058642330(0x3f19999a, float:0.6)
            r8 = r1
            r9 = r5
            r10 = r3
            r11 = r6
            r12 = r0
            r13 = r7
            android.graphics.drawable.Drawable r3 = X.0Pl.A01(r8, r9, r10, r11, r12, r13, r14, r15)
            return r3
        L_0x034e:
            android.util.LruCache r5 = r5.A0F
            java.lang.Object r3 = r5.get(r6)
            if (r3 != 0) goto L_0x07a5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r7.iterator()
        L_0x035f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0373
            java.lang.Object r0 = r2.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            r4.add(r0)
            goto L_0x035f
        L_0x0373:
            X.9Wm r3 = new X.9Wm
            r3.<init>(r1, r4)
            r5.put(r6, r3)
            return r3
        L_0x037c:
            android.view.View r1 = (android.view.View) r1
            android.view.MotionEvent r0 = (android.view.MotionEvent) r0
            r5 = 1
            X.0qQ.A0B(r0, r5)
            java.lang.Object r3 = r2.A03
            X.3Ye r3 = (X.C243293Ye) r3
            java.lang.Object r8 = r2.A01
            X.1Xj r8 = (X.1Xj) r8
            java.lang.Object r7 = r2.A02
            X.3W1 r7 = (X.AnonymousClass3W1) r7
            java.util.List r2 = r8.A3P()
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.model.androidlink.AndroidLink r2 = (com.instagram.model.androidlink.AndroidLink) r2
            if (r2 == 0) goto L_0x03e4
            X.47L r6 = X.C271714jT.A01(r2)
        L_0x03a0:
            com.instagram.common.session.UserSession r2 = r3.A00
            X.0qQ.A0B(r7, r5)
            if (r1 == 0) goto L_0x07a3
            r4 = 0
            int r0 = r0.getActionMasked()
            if (r0 != r5) goto L_0x07a3
            X.3Dp r3 = X.C238833Dp.A00(r2)
            X.0qQ.A07(r3)
            boolean r0 = r8.A5D()
            if (r0 == 0) goto L_0x03d5
            X.3Ds r0 = X.C238863Ds.CTA_MARGIN_AREA
            X.HqF r2 = new X.HqF
            r2.<init>(r0)
            int r0 = r7.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
        L_0x03ca:
            X.3Dt r2 = r2.A00()
            java.lang.String[] r0 = new java.lang.String[r4]
            r3.A09(r1, r2, r0, r5)
            goto L_0x07a3
        L_0x03d5:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_AR_CAMERA
            if (r6 != r0) goto L_0x03e1
            X.3Ds r0 = X.C238863Ds.AR_ADS_OPEN_CAMERA
        L_0x03db:
            X.HqF r2 = new X.HqF
            r2.<init>(r0)
            goto L_0x03ca
        L_0x03e1:
            X.3Ds r0 = X.C238863Ds.CTA_MARGIN_AREA
            goto L_0x03db
        L_0x03e4:
            r6 = 0
            goto L_0x03a0
        L_0x03e6:
            X.2xS r1 = (X.AnonymousClass2xS) r1
            X.3V3 r0 = (X.AnonymousClass3V3) r0
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r5 = 1
            X.0qQ.A0B(r0, r5)
            java.lang.Object r4 = r2.A01
            X.1Xj r4 = (X.1Xj) r4
            java.lang.Object r3 = r2.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            r1.A07(r4, r0, r3)
            java.lang.Object r1 = r2.A03
            X.33W r1 = (X.AnonymousClass33W) r1
            com.instagram.common.session.UserSession r0 = r1.A02
            X.C250783m3.A00(r0)
            java.lang.String r0 = r4.A2n()
            if (r0 == 0) goto L_0x0417
            X.4DU r0 = r1.A08
            java.lang.String r0 = r0.getModuleName()
            X.0qQ.A0B(r0, r5)
            goto L_0x07a3
        L_0x0417:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x041f:
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r6 = r2.A03
            java.lang.Object r4 = r2.A01
            java.lang.Object r5 = r2.A02
            r3 = 26
            X.IoM r2 = new X.IoM
            r7 = r1
            r8 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = "setupAutomatedLogging"
            X.C243273Yc.A00(r0, r2)
            goto L_0x07a3
        L_0x043d:
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r3 = r2.A03
            X.3Yc r3 = (X.C243273Yc) r3
            X.3Yb r3 = r3.A01
            X.41G r4 = r3.BRE()
            java.lang.Object r3 = r2.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r2.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            int r2 = r2.A03
            r4.Djn(r1, r0, r3, r2)
            goto L_0x07a3
        L_0x0462:
            X.3Nk r1 = (X.C240983Nk) r1
            X.4y1 r0 = (X.C279064y1) r0
            r3 = 0
            X.0qQ.A0B(r1, r3)
            r3 = 1
            X.0qQ.A0B(r0, r3)
            java.lang.Object r3 = r2.A03
            X.4y4 r3 = (X.C279094y4) r3
            X.4GD r4 = r3.A01
            java.lang.Object r3 = r2.A01
            X.1Xj r3 = (X.1Xj) r3
            java.lang.Object r2 = r2.A02
            X.3W1 r2 = (X.AnonymousClass3W1) r2
            r4.DKF(r1, r0, r3, r2)
            goto L_0x07a3
        L_0x0481:
            X.7et r1 = (X.C336607et) r1
            X.7aD r0 = (X.C333827aD) r0
            r9 = 0
            X.0qQ.A0B(r1, r9)
            r11 = 1
            X.0qQ.A0B(r0, r11)
            java.lang.Object r3 = r2.A03
            X.7cB r3 = (X.C334977cB) r3
            java.lang.Object r5 = r2.A01
            X.7c8 r5 = (X.C334947c8) r5
            X.7a7 r8 = r5.A03
            java.lang.Object r4 = r2.A02
            X.7cG r4 = (X.C335027cG) r4
            java.util.List r2 = r5.A0A
            boolean r2 = r2.isEmpty()
            r17 = r2 ^ 1
            boolean r2 = r5.A0F
            r18 = r2
            boolean r2 = r5.A0C
            r19 = r2
            boolean r2 = r5.A0D
            r20 = r2
            boolean r2 = r5.A0H
            r21 = r2
            java.lang.String r13 = r5.A08
            java.lang.String r12 = r5.A07
            boolean r15 = r5.A0B
            boolean r5 = r0 instanceof X.C335907dj
            r2 = 0
            if (r5 == 0) goto L_0x0534
            android.app.Activity r10 = r3.A00
            X.7dj r0 = (X.C335907dj) r0
            com.instagram.common.session.UserSession r7 = r3.A04
            X.GgO r6 = r3.A02
            X.7b2 r5 = r3.A01
            X.7aa r3 = r3.A03
            boolean r1 = r3 instanceof X.C334947c8
            if (r1 == 0) goto L_0x050a
            X.7c8 r3 = (X.C334947c8) r3
            X.JwI r1 = r3.A01
            if (r1 == 0) goto L_0x050a
            java.lang.Object r14 = r1.A00
            java.util.AbstractMap r14 = (java.util.AbstractMap) r14
            if (r14 == 0) goto L_0x050a
            java.util.List r1 = r0.A0P
            r4 = 0
            if (r1 == 0) goto L_0x0500
            java.util.Iterator r16 = r1.iterator()
        L_0x04e3:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0532
            java.lang.Object r3 = r16.next()
            r1 = r3
            X.DT9 r1 = (X.DT9) r1
            boolean r1 = r1.CQ7()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x04e3
        L_0x04f8:
            X.DT9 r3 = (X.DT9) r3
            if (r3 == 0) goto L_0x0500
            java.lang.String r4 = r3.BRi()
        L_0x0500:
            java.lang.Object r1 = r14.get(r4)
            X.9bn r1 = (X.C381459bn) r1
            if (r1 == 0) goto L_0x050a
            java.lang.String r2 = r1.A02
        L_0x050a:
            java.lang.String r3 = r0.A0K
            boolean r23 = X.0qQ.A0K(r13, r3)
            if (r8 == 0) goto L_0x051e
            boolean r1 = r8.A0X
            if (r1 != r11) goto L_0x051e
            boolean r1 = X.0qQ.A0K(r12, r3)
            r24 = 1
            if (r1 != 0) goto L_0x0520
        L_0x051e:
            r24 = 0
        L_0x0520:
            X.7hK r3 = new X.7hK
            r22 = r9
            r25 = r15
            r12 = r8
            r13 = r5
            r14 = r6
            r15 = r7
            r16 = r2
            r9 = r3
            r11 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r3
        L_0x0532:
            r3 = r4
            goto L_0x04f8
        L_0x0534:
            boolean r5 = r0 instanceof X.C333817aC
            if (r5 == 0) goto L_0x0544
            X.7aC r0 = (X.C333817aC) r0
            X.MfE r2 = new X.MfE
            r2.<init>((int) r9, (boolean) r9, (int) r11)
            X.3mp r3 = X.C334977cB.A00(r2, r1, r0)
            return r3
        L_0x0544:
            boolean r5 = r0 instanceof X.C333847aF
            if (r5 == 0) goto L_0x0567
            X.7aF r0 = (X.C333847aF) r0
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x071b
            X.2V1 r3 = r1.A00
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r0 = new X.2Wb
            r0.<init>(r3, r1)
            java.util.List r0 = r0.A01
            X.2Tp r3 = new X.2Tp
            r4 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x0567:
            boolean r5 = r0 instanceof X.C336617eu
            if (r5 == 0) goto L_0x0575
            X.7eu r0 = (X.C336617eu) r0
            X.GgO r1 = r3.A02
            X.Grx r3 = new X.Grx
            r3.<init>(r0, r1)
            return r3
        L_0x0575:
            boolean r5 = r0 instanceof X.C336627ev
            if (r5 == 0) goto L_0x0581
            X.7ev r0 = (X.C336627ev) r0
            X.Grk r3 = new X.Grk
            r3.<init>(r0)
            return r3
        L_0x0581:
            boolean r5 = r0 instanceof X.C336637ew
            if (r5 == 0) goto L_0x0591
            X.GgO r2 = r3.A02
            X.7ew r0 = (X.C336637ew) r0
            com.instagram.common.session.UserSession r1 = r3.A04
            X.GsZ r3 = new X.GsZ
            r3.<init>(r0, r2, r1)
            return r3
        L_0x0591:
            boolean r5 = r0 instanceof X.C336647ex
            if (r5 == 0) goto L_0x059b
            X.9d5 r3 = new X.9d5
            r3.<init>()
            return r3
        L_0x059b:
            boolean r5 = r0 instanceof X.C336657ey
            if (r5 == 0) goto L_0x05a5
            X.9d6 r3 = new X.9d6
            r3.<init>()
            return r3
        L_0x05a5:
            boolean r5 = r0 instanceof X.C336667ez
            if (r5 == 0) goto L_0x0617
            X.7ez r0 = (X.C336667ez) r0
            java.lang.String r6 = r0.A00
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36315859749178985(0x81051500100e69, double:3.029634165386029E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x060b
            X.2CE r3 = r4.A04
            X.2DQ r2 = X.2DQ.A0a
            java.util.Map r0 = r3.A03
            java.lang.Object r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0615
            X.9I7 r1 = X.2CE.A00(r3, r2)
            int r0 = r1.A01
            if (r0 >= r11) goto L_0x05dc
            r0 = 12
            X.9I7 r1 = new X.9I7
            r1.<init>(r11, r9, r0)
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r0 = r3.A01
            r0.A03(r1, r2)
        L_0x05dc:
            int r2 = r1.A00
            r1 = 3
            r0 = 0
            if (r2 < r1) goto L_0x05e3
            r0 = 1
        L_0x05e3:
            r5 = r0 ^ 1
        L_0x05e5:
            X.0gF r2 = X.C60340gF.A00
            X.0qQ.A0B(r2, r9)
            r0 = 49
            X.9LT r3 = new X.9LT
            r3.<init>(r4, r0)
            r0 = 10
            X.9Mt r1 = new X.9Mt
            r1.<init>(r4, r2, r6, r0)
            r0 = 34
            X.9IV r2 = new X.9IV
            r2.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r3)
            r1 = 4
            X.9IQ r0 = new X.9IQ
            r0.<init>(r2, r1, r5, r11)
            X.7g3 r3 = new X.7g3
            r3.<init>(r0)
            return r3
        L_0x060b:
            X.2D6 r0 = r4.A05
            int r1 = r0.A00()
            r0 = 3
            r5 = 1
            if (r1 < r0) goto L_0x05e5
        L_0x0615:
            r5 = 0
            goto L_0x05e5
        L_0x0617:
            boolean r4 = r0 instanceof X.C54212H3h
            if (r4 == 0) goto L_0x062b
            X.GgO r4 = r3.A02
            X.H3h r0 = (X.C54212H3h) r0
            com.instagram.common.session.UserSession r2 = r3.A04
            X.7b2 r1 = r3.A01
            X.4DU r1 = r1.A05
            X.Gwm r3 = new X.Gwm
            r3.<init>(r0, r4, r1, r2)
            return r3
        L_0x062b:
            boolean r4 = r0 instanceof X.C54217H3m
            if (r4 == 0) goto L_0x063f
            X.GgO r4 = r3.A02
            X.H3m r0 = (X.C54217H3m) r0
            com.instagram.common.session.UserSession r2 = r3.A04
            X.7b2 r1 = r3.A01
            X.4DU r1 = r1.A05
            X.Gwn r3 = new X.Gwn
            r3.<init>(r0, r4, r1, r2)
            return r3
        L_0x063f:
            boolean r4 = r0 instanceof X.C385159iU
            if (r4 == 0) goto L_0x0651
            X.9iU r0 = (X.C385159iU) r0
            boolean r2 = r0.A02
            java.lang.String r1 = r0.A01
            X.3QO r0 = r0.A00
            X.GsY r3 = new X.GsY
            r3.<init>(r0, r1, r2)
            return r3
        L_0x0651:
            boolean r4 = r0 instanceof X.C54214H3j
            if (r4 == 0) goto L_0x0661
            X.H3j r0 = (X.C54214H3j) r0
            X.GgO r2 = r3.A02
            com.instagram.common.session.UserSession r1 = r3.A04
            X.Gsa r3 = new X.Gsa
            r3.<init>(r0, r2, r1)
            return r3
        L_0x0661:
            boolean r4 = r0 instanceof X.C385149iT
            if (r4 == 0) goto L_0x0679
            X.9iT r0 = (X.C385149iT) r0
            com.instagram.common.session.UserSession r4 = r3.A04
            X.GgO r2 = r3.A02
            X.7b2 r1 = r3.A01
            X.9d8 r3 = new X.9d8
            r5 = r3
            r6 = r0
            r7 = r8
            r8 = r1
            r9 = r2
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r3
        L_0x0679:
            boolean r4 = r0 instanceof X.C385139iS
            if (r4 == 0) goto L_0x0691
            X.9iS r0 = (X.C385139iS) r0
            com.instagram.common.session.UserSession r4 = r3.A04
            X.GgO r2 = r3.A02
            X.7b2 r1 = r3.A01
            X.9d9 r3 = new X.9d9
            r5 = r3
            r6 = r0
            r7 = r8
            r8 = r1
            r9 = r2
            r10 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            return r3
        L_0x0691:
            boolean r4 = r0 instanceof X.K8x
            if (r4 == 0) goto L_0x06aa
            X.2V1 r0 = r1.A00
            android.content.Context r0 = r0.A0C
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165354(0x7f0700aa, float:1.7944923E38)
            int r0 = r1.getDimensionPixelSize(r0)
            X.Grj r3 = new X.Grj
            r3.<init>(r0)
            return r3
        L_0x06aa:
            boolean r4 = r0 instanceof X.C54213H3i
            if (r4 == 0) goto L_0x06b8
            X.H3i r0 = (X.C54213H3i) r0
            X.GgO r1 = r3.A02
            X.Gvp r3 = new X.Gvp
            r3.<init>(r0, r1)
            return r3
        L_0x06b8:
            boolean r4 = r0 instanceof X.C54216H3l
            if (r4 == 0) goto L_0x06d2
            com.instagram.common.session.UserSession r4 = r3.A04
            X.H3l r0 = (X.C54216H3l) r0
            X.GgO r2 = r3.A02
            X.7b2 r1 = r3.A01
            X.4DU r1 = r1.A05
            X.Gwq r3 = new X.Gwq
            r5 = r3
            r6 = r0
            r7 = r8
            r8 = r2
            r9 = r4
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return r3
        L_0x06d2:
            boolean r4 = r0 instanceof X.C54215H3k
            if (r4 == 0) goto L_0x0705
            X.3XV r4 = X.2WX.A02
            r6 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.9JQ r4 = new X.9JQ
            r4.<init>(r5, r6, r9)
            X.2WX r5 = new X.2WX
            r5.<init>(r2, r4)
            X.2V1 r4 = r1.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r4, r2)
            X.H3k r0 = (X.C54215H3k) r0
            X.7b2 r2 = r3.A01
            X.4DU r2 = r2.A05
            X.Gwd r3 = new X.Gwd
            r3.<init>(r0, r2)
        L_0x06fd:
            r6.A00(r3)
            X.2Tp r3 = X.C243563Zg.A0F(r6, r1, r5)
            return r3
        L_0x0705:
            boolean r4 = r0 instanceof X.K8y
            if (r4 == 0) goto L_0x0711
            X.GgO r0 = r3.A02
            X.Grl r3 = new X.Grl
            r3.<init>(r0)
            return r3
        L_0x0711:
            boolean r0 = r0 instanceof X.C333857aG
            if (r0 != 0) goto L_0x071b
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x071b:
            X.3XV r0 = X.2WX.A02
            r3 = 1120403456(0x42c80000, float:100.0)
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.9JQ r0 = new X.9JQ
            r0.<init>(r7, r3, r9)
            X.2WX r5 = new X.2WX
            r5.<init>(r2, r0)
            X.2V1 r3 = r1.A00
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r6 = new X.2Wb
            r6.<init>(r3, r0)
            r3 = 4632233691727265792(0x4049000000000000, double:50.0)
            long r3 = java.lang.Double.doubleToRawLongBits(r3)
            X.9JR r0 = new X.9JR
            r0.<init>(r7, r9, r3)
            X.2WX r7 = new X.2WX
            r7.<init>(r2, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.9JR r0 = new X.9JR
            r0.<init>(r2, r9, r3)
            X.2WX r2 = new X.2WX
            r2.<init>(r7, r0)
            r0 = 2131239961(0x7f082419, float:1.8096244E38)
            X.Gx6 r3 = new X.Gx6
            r3.<init>(r2, r0)
            goto L_0x06fd
        L_0x075c:
            X.5kB r1 = (X.C293125kB) r1
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            if (r0 == 0) goto L_0x0772
            java.lang.String r1 = "Error checkHasAvatar -> "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "AvatarStore"
            X.0wb.A03(r0, r1)
            goto L_0x07a3
        L_0x0772:
            java.lang.Object r5 = r2.A02
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.Object r4 = r2.A01
            X.0sP r4 = (X.0sP) r4
            if (r1 == 0) goto L_0x078a
            X.5vi r3 = X.C299715vi.A00
        L_0x077e:
            com.instagram.avatars.store.AvatarStore r2 = X.25x.A00(r5)
            r0 = 0
            com.instagram.avatars.store.AvatarStore.A00(r1, r3, r2, r5, r0)
            r4.invoke(r3)
            goto L_0x07a3
        L_0x078a:
            X.5rf r3 = X.C297385rf.A00
            goto L_0x077e
        L_0x078d:
            X.5Wy r1 = (X.C286575Wy) r1
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3 = r0 & 3
            r0 = 2
            if (r3 != r0) goto L_0x07a6
            boolean r0 = r1.Bwn()
            if (r0 == 0) goto L_0x07a6
            r1.Evl()
        L_0x07a3:
            X.0gF r3 = X.C60340gF.A00
        L_0x07a5:
            return r3
        L_0x07a6:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x07b4
            r3 = -1475426542(0xffffffffa80ec712, float:-7.92575E-15)
            java.lang.String r0 = "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)"
            X.0fL.A01(r3, r0)
        L_0x07b4:
            java.lang.Object r4 = r2.A02
            androidx.compose.ui.platform.AndroidComposeView r4 = (androidx.compose.ui.platform.AndroidComposeView) r4
            java.lang.Object r3 = r2.A03
            X.5Xy r3 = (X.C286825Xy) r3
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.0sL) r2
            r0 = 0
            X.AnonymousClass5YA.A00(r1, r4, r3, r2, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x07a3
            r0 = 1667863541(0x636993f5, float:4.3087528E21)
            X.0fL.A00(r0)
            goto L_0x07a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9MG.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
