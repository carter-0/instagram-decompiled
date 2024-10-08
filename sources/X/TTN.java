package X;

public final class TTN extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.RVr, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01fa, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A07) == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (X.C66580MXl.A1a("com.facebook.fds.core.debug.adoptionplayground", 1, r2) == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b2, code lost:
        if (X.C66580MXl.A1a("MIG", 1, r3) != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01cb, code lost:
        if (X.C66580MXl.A1a("com.facebook.mig", 1, r2) != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cf, code lost:
        return X.RFM.MDS;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x007e;
                case 1: goto L_0x0088;
                case 2: goto L_0x00a5;
                case 3: goto L_0x00c2;
                case 4: goto L_0x00cb;
                case 5: goto L_0x00df;
                case 6: goto L_0x00ea;
                case 7: goto L_0x000f;
                case 8: goto L_0x004e;
                case 9: goto L_0x0105;
                case 10: goto L_0x01d9;
                case 11: goto L_0x0203;
                case 12: goto L_0x0210;
                case 13: goto L_0x021d;
                case 14: goto L_0x0227;
                case 15: goto L_0x0232;
                case 16: goto L_0x023e;
                case 17: goto L_0x024c;
                case 18: goto L_0x0075;
                case 19: goto L_0x025b;
                case 20: goto L_0x036a;
                case 21: goto L_0x0264;
                case 22: goto L_0x026e;
                case 23: goto L_0x0277;
                case 24: goto L_0x0280;
                case 25: goto L_0x0289;
                case 26: goto L_0x02a3;
                case 27: goto L_0x02ac;
                case 28: goto L_0x02be;
                case 29: goto L_0x02c8;
                case 30: goto L_0x02d5;
                case 31: goto L_0x02de;
                case 32: goto L_0x02ec;
                case 33: goto L_0x0326;
                case 34: goto L_0x0067;
                case 35: goto L_0x0336;
                case 36: goto L_0x033f;
                case 37: goto L_0x0348;
                case 38: goto L_0x0361;
                case 39: goto L_0x036d;
                case 40: goto L_0x037a;
                case 41: goto L_0x0389;
                case 42: goto L_0x0005;
                case 43: goto L_0x0005;
                case 44: goto L_0x0398;
                case 45: goto L_0x03ac;
                case 46: goto L_0x03c0;
                case 47: goto L_0x03cc;
                case 48: goto L_0x03d6;
                case 49: goto L_0x03e8;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.RxE r2 = new X.RxE
            r2.<init>(r0)
        L_0x000e:
            return r2
        L_0x000f:
            java.lang.Object r1 = r7.A01
            X.I4U r1 = (X.I4U) r1
            X.0eM r0 = r1.A06
            java.lang.Object r2 = r0.getValue()
            X.RFM r2 = (X.RFM) r2
            int r5 = r2.ordinal()
            r0 = 1
            r4 = 1
            if (r5 > r0) goto L_0x000e
            X.I4U r1 = r1.A01()
            if (r1 == 0) goto L_0x000e
            X.0eM r0 = r1.A04
            java.lang.Object r3 = r0.getValue()
            X.RFM r3 = (X.RFM) r3
            if (r3 == 0) goto L_0x000e
            int r0 = r3.ordinal()
            if (r0 <= r5) goto L_0x000e
            if (r0 > r4) goto L_0x004b
            X.0eM r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            X.I4U r0 = (X.I4U) r0
            if (r0 == 0) goto L_0x004c
            java.lang.Integer r1 = r0.A01
        L_0x0047:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x000e
        L_0x004b:
            return r3
        L_0x004c:
            r1 = 0
            goto L_0x0047
        L_0x004e:
            java.lang.Object r1 = r7.A01
            X.I4U r1 = (X.I4U) r1
            X.0eM r0 = r1.A04
            java.lang.Object r0 = r0.getValue()
            X.RFM r0 = (X.RFM) r0
            X.I4U r2 = X.I4U.A00(r0, r1)
            if (r2 != 0) goto L_0x000e
            java.lang.String r0 = "Unable to find system?"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0067:
            java.lang.Object r0 = r7.A01
            X.Gx8 r0 = (X.C53964Gx8) r0
            X.TpD r2 = r0.A00
            if (r2 != 0) goto L_0x000e
            X.TpD r2 = new X.TpD
            r2.<init>()
            return r2
        L_0x0075:
            java.lang.Object r0 = r7.A01
            X.0Ud r0 = (X.AnonymousClass0Ud) r0
            java.lang.Object r2 = r0.getValue()
            return r2
        L_0x007e:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.6ez r2 = new X.6ez
            r2.<init>(r0)
            return r2
        L_0x0088:
            java.lang.Object r0 = r7.A01
            X.7uD r0 = (X.C345867uD) r0
            X.0eM r1 = r0.A06
            java.lang.Object r0 = r1.getValue()
            android.view.OrientationEventListener r0 = (android.view.OrientationEventListener) r0
            boolean r0 = r0.canDetectOrientation()
            if (r0 == 0) goto L_0x036a
            java.lang.Object r0 = r1.getValue()
            android.view.OrientationEventListener r0 = (android.view.OrientationEventListener) r0
            r0.enable()
            goto L_0x036a
        L_0x00a5:
            java.lang.Object r0 = r7.A01
            X.7uD r0 = (X.C345867uD) r0
            X.0eM r1 = r0.A06
            java.lang.Object r0 = r1.getValue()
            android.view.OrientationEventListener r0 = (android.view.OrientationEventListener) r0
            boolean r0 = r0.canDetectOrientation()
            if (r0 == 0) goto L_0x036a
            java.lang.Object r0 = r1.getValue()
            android.view.OrientationEventListener r0 = (android.view.OrientationEventListener) r0
            r0.disable()
            goto L_0x036a
        L_0x00c2:
            java.lang.Object r1 = r7.A01
            r0 = 0
            X.AU4 r2 = new X.AU4
            r2.<init>(r1, r0)
            return r2
        L_0x00cb:
            java.lang.Object r0 = r7.A01
            X.7uD r0 = (X.C345867uD) r0
            java.lang.ref.WeakReference r1 = X.C51965G9l.A0v(r0)
            android.content.Context r0 = r0.A03
            android.content.Context r0 = X.DbT.A05(r0)
            X.9Xo r2 = new X.9Xo
            r2.<init>(r0, r1)
            return r2
        L_0x00df:
            java.lang.Object r0 = r7.A01
            X.OTq r0 = (X.C70969OTq) r0
            X.0sa r0 = r0.A06
            java.lang.Object r2 = r0.invoke()
            return r2
        L_0x00ea:
            java.lang.Object r0 = r7.A01
            X.L7X r0 = (X.L7X) r0
            android.content.Context r0 = r0.A00
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131625435(0x7f0e05db, float:1.8878078E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r1, r0)
            r0 = 2
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r2, r0)
            return r2
        L_0x0105:
            java.lang.Object r0 = r7.A01
            X.I4U r0 = (X.I4U) r0
            java.lang.Object r3 = r0.A02
            r2 = r3
            android.view.View r2 = (android.view.View) r2
            r0 = 2131428763(0x7f0b059b, float:1.847918E38)
            java.lang.Object r1 = r2.getTag(r0)
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 == 0) goto L_0x012b
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x012b
            int r1 = r1.intValue()
            r0 = 1
            if (r0 > r1) goto L_0x012b
            r0 = 14
            if (r1 >= r0) goto L_0x012b
        L_0x0128:
            X.RFM r2 = X.RFM.FDS
            return r2
        L_0x012b:
            java.lang.Class r3 = r3.getClass()
            r0 = 2131443848(0x7f0b4088, float:1.8509776E38)
            java.lang.Object r4 = r2.getTag(r0)
            java.lang.String r4 = (java.lang.String) r4
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Package r0 = r3.getPackage()
            if (r0 == 0) goto L_0x0177
            java.lang.String r2 = r0.getName()
            if (r2 == 0) goto L_0x0177
            java.lang.String r0 = "com.facebook.fds"
            r1 = 1
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 == 0) goto L_0x0164
            java.lang.String r0 = "com.facebook.fds.core.theme."
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = "com.facebook.fds.core.debug.adoptionplayground"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 == 0) goto L_0x0128
        L_0x0161:
            X.RFM r2 = X.RFM.CUSTOM
            return r2
        L_0x0164:
            java.lang.String r0 = "com.facebook.fig"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "com.facebook.fbui"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 == 0) goto L_0x01b5
            X.RFM r2 = X.RFM.FBUI
            return r2
        L_0x0177:
            java.lang.String r0 = r3.getSimpleName()
            X.0qQ.A07(r0)
            java.lang.String r3 = X.DbY.A0k(r0)
            java.lang.String r2 = "FDS"
            r1 = 1
            boolean r0 = X.C66580MXl.A1a(r2, r1, r3)
            if (r0 != 0) goto L_0x0128
            if (r4 == 0) goto L_0x0194
            boolean r0 = X.C66580MXl.A1a(r2, r1, r4)
            if (r0 != r1) goto L_0x0194
            goto L_0x0128
        L_0x0194:
            java.lang.String r0 = "FIG"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 != 0) goto L_0x01d6
            java.lang.String r0 = "GEO"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = "IGDS"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "MIG"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r3)
            if (r0 == 0) goto L_0x0161
            goto L_0x01cd
        L_0x01b5:
            java.lang.String r0 = "com.facebook.geodesic"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = "com.instagram.igds"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "com.facebook.mig"
            boolean r0 = X.C66580MXl.A1a(r0, r1, r2)
            if (r0 == 0) goto L_0x0177
        L_0x01cd:
            X.RFM r2 = X.RFM.MDS
            return r2
        L_0x01d0:
            X.RFM r2 = X.RFM.IGDS
            return r2
        L_0x01d3:
            X.RFM r2 = X.RFM.GEO
            return r2
        L_0x01d6:
            X.RFM r2 = X.RFM.FIG
            return r2
        L_0x01d9:
            java.lang.Object r2 = r7.A01
            X.I4U r2 = (X.I4U) r2
            java.lang.Object r1 = r2.A02
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x0201
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x0201
            r1 = 1
            X.I4U r0 = r2.A01()
            if (r0 == 0) goto L_0x01fc
            X.0eM r0 = r0.A07
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0201
        L_0x01fc:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L_0x0201:
            r1 = 0
            goto L_0x01fc
        L_0x0203:
            java.lang.Object r0 = r7.A01
            X.WGg r0 = (X.C19005WGg) r0
            X.V4B r1 = r0.A03
            X.Vb1 r0 = r0.A00
            X.WGX r2 = r1.A00(r0)
            return r2
        L_0x0210:
            java.lang.Object r0 = r7.A01
            X.WGg r0 = (X.C19005WGg) r0
            X.V4B r1 = r0.A03
            X.Vb1 r0 = r0.A01
            X.WGX r2 = r1.A00(r0)
            return r2
        L_0x021d:
            java.lang.Object r0 = r7.A01
            X.WGg r0 = (X.C19005WGg) r0
            X.Ho8 r2 = new X.Ho8
            r2.<init>(r0)
            return r2
        L_0x0227:
            java.lang.Object r0 = r7.A01
            X.HtO r0 = (X.C56136HtO) r0
            X.IIO r1 = r0.A02
            r0 = 0
            r1.A00 = r0
            goto L_0x036a
        L_0x0232:
            java.lang.Object r1 = r7.A01
            X.4Co r1 = (X.C262204Co) r1
            if (r1 == 0) goto L_0x036a
            r0 = 0
            r1.AG7(r0)
            goto L_0x036a
        L_0x023e:
            java.lang.Object r0 = r7.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r1 = r0.A03
            X.4Cq r1 = (X.C262224Cq) r1
            r0 = 0
            X.19E.A05(r0, r1)
            goto L_0x036a
        L_0x024c:
            java.lang.Object r2 = r7.A01
            r1 = 16
            X.TTN r0 = new X.TTN
            r0.<init>(r2, r1)
            X.3dj r2 = new X.3dj
            r2.<init>(r0)
            return r2
        L_0x025b:
            java.lang.Object r1 = r7.A01
            com.facebook.litho.widget.LithoScrollView r1 = (com.facebook.litho.widget.LithoScrollView) r1
            r0 = 0
            r1.A01 = r0
            goto L_0x036a
        L_0x0264:
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            r1.setVerticalScrollBarEnabled(r0)
            goto L_0x036a
        L_0x026e:
            java.lang.Object r1 = r7.A01
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            r0 = 0
            r1.A0B = r0
            goto L_0x036a
        L_0x0277:
            java.lang.Object r1 = r7.A01
            X.Hql r1 = (X.C55980Hql) r1
            r0 = 0
            r1.A02 = r0
            goto L_0x036a
        L_0x0280:
            java.lang.Object r1 = r7.A01
            X.Hql r1 = (X.C55980Hql) r1
            r0 = 0
            r1.A01 = r0
            goto L_0x036a
        L_0x0289:
            java.lang.Object r1 = r7.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            android.app.Activity r2 = X.C70782Va.A00(r1)
            boolean r0 = r2 instanceof androidx.activity.ComponentActivity
            if (r0 == 0) goto L_0x029c
            if (r2 == 0) goto L_0x029c
            return r2
        L_0x029c:
            java.lang.String r0 = "Permissions should be called in the context of an Activity"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x02a3:
            java.lang.Object r1 = r7.A01
            r0 = 2
            X.IHG r2 = new X.IHG
            r2.<init>(r1, r0)
            return r2
        L_0x02ac:
            java.lang.Object r0 = r7.A01
            X.Hql r0 = (X.C55980Hql) r0
            androidx.activity.ComponentActivity r1 = r0.A03
            java.lang.String r0 = r0.A04
            int r0 = X.C56190HuJ.A00(r1, r0)
            X.Hs3 r2 = new X.Hs3
            r2.<init>(r0)
            return r2
        L_0x02be:
            java.lang.Object r0 = r7.A01
            X.0sa r0 = (X.C62320sa) r0
            X.Spj r2 = new X.Spj
            r2.<init>(r0)
            return r2
        L_0x02c8:
            java.lang.Object r1 = r7.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r1.resetPivot()
            goto L_0x036a
        L_0x02d5:
            java.lang.Object r0 = r7.A01
            X.2Ul r0 = (X.2Ul) r0
            r0.A01()
            goto L_0x036a
        L_0x02de:
            java.lang.Object r0 = r7.A01
            X.Gwp r0 = (X.C53945Gwp) r0
            int r1 = r0.A00
            int r0 = r0.A01
            X.I13 r2 = new X.I13
            r2.<init>(r1, r0)
            return r2
        L_0x02ec:
            java.lang.Object r6 = r7.A01
            X.WJn r6 = (X.WJn) r6
            java.lang.String r0 = "ZoomableViewBaseController.init() must be called on the main thread"
            X.C245983dn.A02(r0)
            X.2cp r5 = X.2cp.A00()
            X.2cs r4 = r5.A02()
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            r0 = 4621819117588971520(0x4024000000000000, double:10.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            r4.A09(r0)
            r4.A02()
            r6.A0G = r4
            X.2cs r4 = r5.A02()
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            X.2co r0 = X.C71392co.A04(r2, r0)
            r4.A09(r0)
            r0 = 1
            r4.A06 = r0
            r6.A0F = r4
            r2 = 0
            return r2
        L_0x0326:
            int r0 = X.WJn.A0U
            java.lang.Object r0 = r7.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            android.content.Context r0 = X.C243803a8.A00(r0)
            X.WJn r2 = new X.WJn
            r2.<init>(r0)
            return r2
        L_0x0336:
            java.lang.Object r1 = r7.A01
            r0 = 0
            X.WKt r2 = new X.WKt
            r2.<init>(r1, r0)
            return r2
        L_0x033f:
            java.lang.Object r1 = r7.A01
            r0 = 1
            X.WKt r2 = new X.WKt
            r2.<init>(r1, r0)
            return r2
        L_0x0348:
            X.MYo r1 = X.C66601MYn.A00()
            java.lang.Object r0 = r7.A01
            X.MYp r0 = (X.C66603MYp) r0
            X.MYm r2 = r0.A03
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.List r1 = r1.A03
            monitor-enter(r1)
            r1.add(r2)     // Catch:{ all -> 0x035e }
            monitor-exit(r1)
            goto L_0x036a
        L_0x035e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0361:
            java.lang.Object r1 = r7.A01
            com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController r1 = (com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController) r1
            r0 = 0
            r1.A00 = r0
            r1.A01 = r0
        L_0x036a:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x036d:
            X.26N r0 = com.facebook.mqtt.service.XplatServiceDelegate.A01
            com.facebook.mqtt.service.XplatNativeClientWrapper r2 = new com.facebook.mqtt.service.XplatNativeClientWrapper
            r2.<init>()
            X.0sn r0 = X.0sn.A00
            r2.addObservers(r0)
            return r2
        L_0x037a:
            java.lang.Object r1 = r7.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.RoX r0 = new X.RoX
            r0.<init>(r1)
            X.Rw5 r2 = new X.Rw5
            r2.<init>(r0, r1)
            return r2
        L_0x0389:
            java.lang.Object r1 = r7.A01
            X.3zZ r1 = (X.C258743zZ) r1
            X.RVr r0 = new X.RVr
            r0.<init>()
            X.ADv r2 = new X.ADv
            r2.<init>(r1, r0)
            return r2
        L_0x0398:
            java.lang.Object r2 = r7.A01
            X.RxE r2 = (X.C10735RxE) r2
            X.0eM r0 = r2.A04
            java.lang.Object r1 = r0.getValue()
            X.94z r1 = (X.C3733494z) r1
            X.45u r0 = r2.A00
            X.Rrg r2 = new X.Rrg
            r2.<init>(r1, r0)
            return r2
        L_0x03ac:
            java.lang.Object r2 = r7.A01
            X.RxE r2 = (X.C10735RxE) r2
            X.0eM r0 = r2.A04
            java.lang.Object r1 = r0.getValue()
            X.94z r1 = (X.C3733494z) r1
            X.45u r0 = r2.A00
            X.S4A r2 = new X.S4A
            r2.<init>(r1, r0)
            return r2
        L_0x03c0:
            java.lang.Object r0 = r7.A01
            X.RxE r0 = (X.C10735RxE) r0
            com.instagram.common.session.UserSession r0 = r0.A01
            X.94z r2 = new X.94z
            r2.<init>(r0)
            return r2
        L_0x03cc:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zY r2 = new X.3zY
            r2.<init>(r0)
            return r2
        L_0x03d6:
            java.lang.Object r0 = r7.A01
            X.RzJ r0 = (X.C10858RzJ) r0
            X.0eM r0 = r0.A0D
            java.lang.Object r0 = r0.getValue()
            X.3zt r0 = (X.C258943zt) r0
            X.400 r2 = new X.400
            r2.<init>(r0)
            return r2
        L_0x03e8:
            java.lang.Object r0 = r7.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.3zu r2 = X.AnonymousClass4Ix.A00(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TTN.invoke():java.lang.Object");
    }
}
