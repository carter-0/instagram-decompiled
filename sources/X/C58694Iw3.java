package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Iw3  reason: case insensitive filesystem */
public final class C58694Iw3 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58694Iw3(String str, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public static void A00(1Ln r3, String str) {
        String A002 = AnonymousClass000.A00(1175);
        r3.A0a(C279294yP.CLIPS_SPIN);
        r3.A0V(3);
        r3.A0R("camera_session_id", str);
        0sn r1 = 0sn.A00;
        r3.A0S(AnonymousClass000.A00(2755), r1);
        r3.A0S(AnonymousClass000.A00(4552), r1);
        r3.A0M(C360948fP.NORMAL, "capture_type");
        r3.A0M(28D.A1a, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        r3.A0T();
        r3.A0M(C59793JYm.OTHER, "media_source");
        r3.A0c(28t.A04);
        r3.A0n(A002);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0066, code lost:
        r2[0] = r1;
        X.C65329LrS.A00(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r3 = r13.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r2.invoke(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0319, code lost:
        if (r0 == null) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x031b, code lost:
        r0.invoke(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        r3.A00 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            int r0 = r13.A00
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x002b;
                case 2: goto L_0x0339;
                case 3: goto L_0x0345;
                case 4: goto L_0x0049;
                case 5: goto L_0x0058;
                case 6: goto L_0x006d;
                case 7: goto L_0x0351;
                case 8: goto L_0x0077;
                case 9: goto L_0x0087;
                case 10: goto L_0x0087;
                case 11: goto L_0x009d;
                case 12: goto L_0x035c;
                case 13: goto L_0x00ae;
                case 14: goto L_0x00cb;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x0005;
                case 19: goto L_0x00d6;
                case 20: goto L_0x00e1;
                case 21: goto L_0x00ec;
                case 22: goto L_0x00f7;
                case 23: goto L_0x0102;
                case 24: goto L_0x010d;
                case 25: goto L_0x0118;
                case 26: goto L_0x011e;
                case 27: goto L_0x012e;
                case 28: goto L_0x012e;
                case 29: goto L_0x0144;
                case 30: goto L_0x0216;
                case 31: goto L_0x0371;
                case 32: goto L_0x02cf;
                case 33: goto L_0x0389;
                case 34: goto L_0x02ed;
                case 35: goto L_0x0300;
                case 36: goto L_0x030d;
                case 37: goto L_0x0118;
                case 38: goto L_0x0320;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            X.W1O r0 = (X.W1O) r0
            X.0sP r2 = r0.A03
        L_0x000b:
            java.lang.String r3 = r13.A02
        L_0x000d:
            r2.invoke(r3)
        L_0x0010:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0013:
            java.lang.Object r3 = r13.A01
            X.A6K r3 = (X.A6K) r3
            X.29E r6 = r3.A01
            long r4 = r3.A00
            java.lang.String r1 = r13.A02
            java.lang.String r0 = "exit_reason"
            r6.A09(r4, r0, r1)
            long r1 = r3.A00
            r0 = 17637859(0x10d21e3, float:2.5921922E-38)
            r6.A02(r0, r1)
            goto L_0x0044
        L_0x002b:
            java.lang.Object r3 = r13.A01
            X.A6K r3 = (X.A6K) r3
            X.29E r4 = r3.A01
            long r1 = r3.A00
            java.lang.String r5 = r13.A02
            java.lang.String r0 = "exit_reason"
            r4.A09(r1, r0, r5)
            long r8 = r3.A00
            r7 = 17637859(0x10d21e3, float:2.5921922E-38)
            java.lang.String r6 = ""
            r4.A07(r5, r6, r7, r8)
        L_0x0044:
            r0 = -1
            r3.A00 = r0
            goto L_0x0010
        L_0x0049:
            java.lang.Object r3 = r13.A01
            X.LrS r3 = (X.C65329LrS) r3
            r0 = 1
            X.MQn[] r2 = new X.C66407MQn[r0]
            java.lang.String r0 = r13.A02
            X.Ltj r1 = new X.Ltj
            r1.<init>(r0)
            goto L_0x0066
        L_0x0058:
            java.lang.Object r3 = r13.A01
            X.LrS r3 = (X.C65329LrS) r3
            r0 = 1
            X.MQn[] r2 = new X.C66407MQn[r0]
            java.lang.String r0 = r13.A02
            X.Ltg r1 = new X.Ltg
            r1.<init>(r0)
        L_0x0066:
            r0 = 0
            r2[r0] = r1
            X.C65329LrS.A00(r3, r2)
            goto L_0x0010
        L_0x006d:
            java.lang.String r2 = r13.A02
            if (r2 == 0) goto L_0x0010
            java.lang.Object r0 = r13.A01
            X.0sP r0 = (X.0sP) r0
            goto L_0x031b
        L_0x0077:
            java.lang.Object r0 = r13.A01
            X.4A0 r0 = (X.AnonymousClass4A0) r0
            java.util.Map r2 = r0.A09
            java.lang.String r1 = r13.A02
            java.lang.Long r0 = X.C51971G9r.A0m()
            r2.put(r1, r0)
            goto L_0x0010
        L_0x0087:
            java.lang.Object r0 = r13.A01
            X.0lg r0 = (X.0lg) r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.String r2 = r13.A02
            X.5m9 r1 = X.C294255m9.A04
            X.6uk r0 = new X.6uk
            r0.<init>(r1, r2)
            r3.A00(r0)
            goto L_0x0010
        L_0x009d:
            java.lang.Object r0 = r13.A01
            X.Nel r0 = (X.C69106Nel) r0
            java.lang.String r4 = r13.A02
            r3 = 1
            com.instagram.common.session.UserSession r2 = r0.A0B
            android.app.Activity r1 = r0.A09
            r0 = 0
            X.C70906OQy.A00(r1, r2, r0, r4, r3)
            goto L_0x0010
        L_0x00ae:
            java.lang.Object r2 = r13.A01
            X.GhG r2 = (X.C53025GhG) r2
            java.lang.String r1 = r13.A02
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Map r0 = r2.A04
            java.lang.Object r0 = r0.get(r1)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0010
            com.instagram.user.model.FollowStatus r0 = r0.B6o()
            X.C53025GhG.A00(r2, r0, r1)
            goto L_0x0010
        L_0x00cb:
            java.lang.Object r1 = r13.A01
            X.ESH r1 = (X.ESH) r1
            java.lang.String r0 = r13.A02
            X.ESH.A07(r1, r0)
            goto L_0x0010
        L_0x00d6:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0g(r0)
            goto L_0x0010
        L_0x00e1:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0h(r0)
            goto L_0x0010
        L_0x00ec:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0i(r0)
            goto L_0x0010
        L_0x00f7:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0j(r0)
            goto L_0x0010
        L_0x0102:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0k(r0)
            goto L_0x0010
        L_0x010d:
            java.lang.Object r1 = r13.A01
            X.RBs r1 = (X.C8834RBs) r1
            java.lang.String r0 = r13.A02
            X.C58694Iw3.super.A0l(r0)
            goto L_0x0010
        L_0x0118:
            java.lang.Object r2 = r13.A01
            X.0sP r2 = (X.0sP) r2
            goto L_0x000b
        L_0x011e:
            java.lang.Object r0 = r13.A01
            X.Gw8 r0 = (X.C53902Gw8) r0
            X.0sP r2 = r0.A04
            java.lang.String r1 = r13.A02
            r0 = 0
            X.HHx r3 = new X.HHx
            r3.<init>(r0, r1, r0)
            goto L_0x000d
        L_0x012e:
            java.lang.Object r1 = r13.A01
            X.Hmp r1 = (X.C55754Hmp) r1
            java.lang.String r2 = r13.A02
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.3ju r1 = r1.A00
            X.Gqg r0 = new X.Gqg
            r0.<init>(r2)
            r1.FIG(r0)
            goto L_0x0010
        L_0x0144:
            java.lang.Object r0 = r13.A01
            X.LmK r0 = (X.C65041LmK) r0
            boolean r1 = r0.A06
            if (r1 == 0) goto L_0x0200
            com.instagram.common.session.UserSession r9 = r0.A02
            X.0Tu r5 = X.0Tu.A05
            r1 = 36326459727492884(0x810eb900013714, double:3.0363376343544256E-306)
            boolean r1 = X.182.A06(r5, r9, r1)
            if (r1 == 0) goto L_0x018e
            java.lang.String r1 = r13.A02
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            X.OOC r1 = new X.OOC     // Catch:{ IOException -> 0x0209 }
            r1.<init>()     // Catch:{ IOException -> 0x0209 }
            r1.A03 = r2     // Catch:{ IOException -> 0x0209 }
            X.Ni4 r3 = r1.A00()     // Catch:{ IOException -> 0x0209 }
            X.NEI r2 = new X.NEI     // Catch:{ IOException -> 0x0209 }
            r2.<init>()     // Catch:{ IOException -> 0x0209 }
            android.content.Context r1 = r0.A00     // Catch:{ IOException -> 0x0209 }
            android.net.Uri r7 = r2.A01(r1, r3)     // Catch:{ IOException -> 0x0209 }
            X.0qQ.A07(r7)     // Catch:{ IOException -> 0x0209 }
            android.content.Context r6 = r1.getApplicationContext()     // Catch:{ IOException -> 0x0209 }
            X.0hq r8 = r0.A01     // Catch:{ IOException -> 0x0209 }
            X.LEF r1 = r0.A05     // Catch:{ IOException -> 0x0209 }
            X.1Xj r10 = r1.A07     // Catch:{ IOException -> 0x0209 }
            X.3W1 r12 = r0.A04     // Catch:{ IOException -> 0x0209 }
            X.4DU r11 = r0.A03     // Catch:{ IOException -> 0x0209 }
            X.LTW.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0209 }
            goto L_0x0211
        L_0x018e:
            android.content.Context r6 = r0.A00
            X.0hq r8 = r0.A01
            X.LEF r1 = r0.A05
            X.1Xj r10 = r1.A07
            X.3W1 r12 = r0.A04
            X.4DU r11 = r0.A03
            java.lang.String r3 = r13.A02
            r1 = 6
            X.0qQ.A0B(r3, r1)
            X.6ap r4 = X.DbV.A0W()
            X.C51970G9q.A1L(r10, r4)
            android.content.res.Resources r2 = r6.getResources()
            r1 = 2131955159(0x7f130dd7, float:1.9546838E38)
            X.DbT.A1D(r2, r4, r1)
            r4.A06()
            r1 = 36326459727427347(0x810eb900003713, double:3.03633763431298E-306)
            boolean r1 = X.182.A06(r5, r9, r1)
            if (r1 == 0) goto L_0x01fc
            java.io.File r2 = new java.io.File
            r2.<init>(r3)
            X.OOC r1 = new X.OOC     // Catch:{ IOException -> 0x01f4 }
            r1.<init>()     // Catch:{ IOException -> 0x01f4 }
            r1.A03 = r2     // Catch:{ IOException -> 0x01f4 }
            X.Ni4 r2 = r1.A00()     // Catch:{ IOException -> 0x01f4 }
            X.NEI r1 = new X.NEI     // Catch:{ IOException -> 0x01f4 }
            r1.<init>()     // Catch:{ IOException -> 0x01f4 }
            android.net.Uri r7 = r1.A01(r6, r2)     // Catch:{ IOException -> 0x01f4 }
            X.0qQ.A07(r7)     // Catch:{ IOException -> 0x01f4 }
            r1 = 1
            r4.A0L = r1     // Catch:{ IOException -> 0x01f4 }
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ IOException -> 0x01f4 }
            r1 = 2131973447(0x7f135547, float:1.958393E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r2, r1)     // Catch:{ IOException -> 0x01f4 }
            r4.A0G = r1     // Catch:{ IOException -> 0x01f4 }
            X.IVh r5 = new X.IVh     // Catch:{ IOException -> 0x01f4 }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x01f4 }
            r4.A0A(r5)     // Catch:{ IOException -> 0x01f4 }
            goto L_0x01fc
        L_0x01f4:
            java.lang.String r3 = "ClipsDownloadUtil"
            java.lang.String r2 = "Failed to get secure uri for downloaded file"
            r1 = 0
            X.0kD.A0D(r3, r2, r1)
        L_0x01fc:
            X.Dbb.A1Q(r4)
            goto L_0x0211
        L_0x0200:
            android.content.Context r2 = r0.A00
            r1 = 2131972636(0x7f13521c, float:1.9582285E38)
            X.C59689JTv.A07(r2, r1)
            goto L_0x0211
        L_0x0209:
            java.lang.String r3 = "ClipsWatermarkRenderCallback"
            java.lang.String r2 = "Failed to get secure uri for downloaded file"
            r1 = 0
            X.0kD.A0D(r3, r2, r1)
        L_0x0211:
            X.C65041LmK.A00(r0)
            goto L_0x0010
        L_0x0216:
            java.lang.Object r6 = r13.A01
            X.H1e r6 = (X.C54160H1e) r6
            X.0eM r0 = r6.A02
            java.lang.Object r4 = r0.getValue()
            X.H2b r4 = (X.C54181H2b) r4
            X.6oS r3 = X.C318116oQ.A00(r4)
            r2 = 0
            r1 = 15
            X.ImE r0 = new X.ImE
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.05G r5 = r4.A05
        L_0x0233:
            java.lang.Object r4 = r5.getValue()
            r0 = r4
            X.Jvk r0 = (X.C61046Jvk) r0
            java.lang.String r3 = r0.A00
            r2 = 1
            r1 = 20
            X.Jvk r0 = new X.Jvk
            r0.<init>((java.lang.String) r3, (boolean) r2, (int) r1)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0233
            X.0eM r0 = r6.A03
            java.lang.Object r1 = r0.getValue()
            X.Hzn r1 = (X.C56516Hzn) r1
            java.lang.String r3 = r13.A02
            X.0eM r0 = r6.A01
            java.lang.Object r4 = X.AnonymousClass7TE.A14(r0)
            java.lang.String r4 = (java.lang.String) r4
            X.0qQ.A0B(r4, r2)
            X.0wc r5 = r1.A00
            r0 = 3288(0xcd8, float:4.607E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r5, r0)
            r0 = 200(0xc8, float:2.8E-43)
            X.1Ln r2 = X.C51965G9l.A0U(r1, r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x029f
            A00(r2, r4)
            X.KkU r0 = X.C62668KkU.CLIPS
            java.util.List r1 = X.AnonymousClass7TE.A1I(r0)
            r0 = 3968(0xf80, float:5.56E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0S(r0, r1)
            X.JVj r1 = X.C59725JVj.NONE
            java.lang.String r0 = "surface"
            r2.A0M(r1, r0)
            X.AnonymousClass7TF.A18(r2)
            java.lang.Long r1 = X.C56516Hzn.A00(r3)
            java.lang.String r0 = "media_id"
            r2.A0Q(r0, r1)
            r2.Cgf()
        L_0x029f:
            X.1Ln r2 = X.1Ln.A09(r5)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x0010
            A00(r2, r4)
            X.KkU r1 = X.C62668KkU.CLIPS
            r0 = 1806(0x70e, float:2.531E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0M(r1, r0)
            X.JVj r1 = X.C59725JVj.NONE
            java.lang.String r0 = "surface"
            r2.A0M(r1, r0)
            X.AnonymousClass7TF.A18(r2)
            java.lang.Long r1 = X.C56516Hzn.A00(r3)
            java.lang.String r0 = "media_id"
            r2.A0Q(r0, r1)
            r2.Cgf()
            goto L_0x0010
        L_0x02cf:
            java.lang.Object r2 = r13.A01
            X.H03 r2 = (X.H03) r2
            X.0eM r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.GIY r1 = (X.GIY) r1
            java.lang.String r0 = r13.A02
            r1.A00(r0)
            X.JOl r1 = r2.A01
            if (r1 == 0) goto L_0x02e8
            r0 = 0
            r1.Cwh(r0)
        L_0x02e8:
            X.DbZ.A15(r2)
            goto L_0x0010
        L_0x02ed:
            java.lang.Object r0 = r13.A01
            X.GaS r0 = (X.C52654GaS) r0
            java.lang.String r2 = r13.A02
            X.Hjo r1 = r0.A09
            if (r2 == 0) goto L_0x0010
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0010
            X.0sP r0 = r1.A00
            goto L_0x0319
        L_0x0300:
            java.lang.Object r1 = r13.A01
            X.GaS r1 = (X.C52654GaS) r1
            java.lang.String r2 = r13.A02
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0sP r0 = r1.A01
            goto L_0x0319
        L_0x030d:
            java.lang.Object r1 = r13.A01
            X.GaS r1 = (X.C52654GaS) r1
            java.lang.String r2 = r13.A02
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0sP r0 = r1.A02
        L_0x0319:
            if (r0 == 0) goto L_0x0010
        L_0x031b:
            r0.invoke(r2)
            goto L_0x0010
        L_0x0320:
            java.lang.Object r0 = r13.A01
            X.GE0 r0 = (X.GE0) r0
            X.GIQ r2 = r0.A05
            java.lang.String r1 = r13.A02
            X.34p r0 = r2.A00
            if (r0 == 0) goto L_0x032f
            r0.A01()
        L_0x032f:
            r0 = 0
            r2.A00 = r0
            X.Dc1 r0 = r2.A03
            r0.A02(r1)
            goto L_0x0010
        L_0x0339:
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r13.A02
            com.facebook.graphql.query.JSONPersistedQueryProvider r4 = new com.facebook.graphql.query.JSONPersistedQueryProvider
            r4.<init>(r1, r0)
            return r4
        L_0x0345:
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r13.A02
            X.AYi r4 = new X.AYi
            r4.<init>(r1, r0)
            return r4
        L_0x0351:
            java.lang.Object r1 = r13.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = r13.A02
            java.io.File r4 = X.AnonymousClass5Kf.A00(r1, r0)
            return r4
        L_0x035c:
            java.lang.Object r3 = r13.A01
            X.KWw r3 = (X.C62037KWw) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            X.LJo r1 = r3.A03
            java.lang.String r0 = r13.A02
            com.instagram.save.repository.SavedAudioPagingSource r4 = new com.instagram.save.repository.SavedAudioPagingSource
            r4.<init>(r2, r1, r0)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A04
            r0.add(r4)
            return r4
        L_0x0371:
            java.lang.Object r0 = r13.A01
            X.GhE r0 = (X.C53023GhE) r0
            X.HoN r4 = r0.A03
            java.lang.String r3 = r13.A02
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.common.session.UserSession r2 = r4.A03
            java.util.Map r1 = r4.A05
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r0 = r4.A02
            X.Jjw r4 = new X.Jjw
            r4.<init>(r0, r2, r3, r1)
            return r4
        L_0x0389:
            java.lang.String r5 = X.C51972G9s.A0n()
            java.lang.Object r0 = r13.A01
            X.2Wa r0 = (X.2Wa) r0
            java.lang.Object r0 = r0.A03
            com.instagram.model.showreel.IgShowreelComposition r0 = (com.instagram.model.showreel.IgShowreelComposition) r0
            java.lang.String r6 = r0.Anf()
            java.lang.String r7 = r0.C4b()
            java.lang.String r8 = r13.A02
            if (r8 != 0) goto L_0x03a3
            java.lang.String r8 = ""
        L_0x03a3:
            java.lang.String r0 = r0.AqT()
            int r9 = r0.length()
            X.6Q8 r4 = new X.6Q8
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58694Iw3.invoke():java.lang.Object");
    }
}
