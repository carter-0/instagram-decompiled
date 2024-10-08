package X;

public final class J9J extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J9J(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        super(2);
        this.A00 = i;
        this.A04 = obj;
        this.A06 = obj2;
        this.A02 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A03 = obj6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: android.app.Activity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v24, resolved type: android.app.Activity} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04ac, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b1, code lost:
        r13.Evl();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0340  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r34, java.lang.Object r35) {
        /*
            r33 = this;
            r0 = r33
            r13 = r34
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0092;
                case 1: goto L_0x019a;
                case 2: goto L_0x0203;
                case 3: goto L_0x0251;
                case 4: goto L_0x0381;
                case 5: goto L_0x0470;
                default: goto L_0x0009;
            }
        L_0x0009:
            r6 = 0
            X.0qQ.A0B(r13, r6)
            java.lang.Object r2 = r0.A04
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = "type"
            java.lang.String r3 = r2.getQueryParameter(r1)
            if (r3 == 0) goto L_0x008a
            int r2 = r3.hashCode()
            r1 = 109329021(0x6843a7d, float:4.973882E-35)
            if (r2 == r1) goto L_0x0052
            r1 = 1097519758(0x416ad28e, float:14.676405)
            if (r2 != r1) goto L_0x008a
            java.lang.String r1 = "restore"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x008a
            java.lang.Object r5 = r0.A06
            com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity r5 = (com.instagram.urlhandlers.encryptedbackups.EncrypteddBackupsUrlHandlerActivity) r5
            java.lang.Object r4 = r0.A03
            X.OyT r4 = (X.C72203OyT) r4
            java.lang.Object r3 = r0.A02
            X.65E r3 = (X.AnonymousClass65E) r3
            java.lang.Object r1 = r0.A01
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.Nj3 r0 = X.C69302Nj3.DeviceNotOnboarded
            if (r13 != r0) goto L_0x008e
            X.Pbs r0 = new X.Pbs
            r0.<init>(r1, r2, r3, r4, r5)
            X.11Z.A03(r0)
        L_0x004f:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0052:
            java.lang.String r1 = "setup"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x008a
            X.Nj3 r1 = X.C69302Nj3.NoBackupsPresent
            if (r13 != r1) goto L_0x008a
            java.lang.Object r5 = r0.A06
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            java.lang.Object r4 = r0.A01
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.Object r3 = r0.A05
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.Njy r2 = X.C69358Njy.CREATE_PIN_NUX_V2
            java.lang.String r1 = "CREATE_PIN_NUX_V2"
            r0 = 205(0xcd, float:2.87E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r4.putString(r0, r1)
            X.NJT r1 = X.C71073Oas.A01(r4, r3, r2)
            if (r1 == 0) goto L_0x004f
            X.6Yo r0 = X.DbS.A0M(r5, r3)
            r0.A0D(r1)
            r0.A0D = r6
            r0.A04()
            goto L_0x004f
        L_0x008a:
            java.lang.Object r5 = r0.A06
            android.app.Activity r5 = (android.app.Activity) r5
        L_0x008e:
            r5.finish()
            goto L_0x004f
        L_0x0092:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0B(r35)
            r1 = 2
            if (r2 != r1) goto L_0x00a1
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x00a1:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x00af
            r2 = -1589826863(0xffffffffa13d2ad1, float:-6.409236E-19)
            java.lang.String r1 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:757)"
            X.0fL.A01(r2, r1)
        L_0x00af:
            java.lang.Object r2 = r0.A06
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r8 = r0.A03
            java.lang.Object r6 = r13.ECw()
            java.lang.Object r3 = X.AnonymousClass5XT.A00
            if (r6 != r3) goto L_0x00c6
            java.lang.Object r6 = r2.invoke(r8)
            X.Hzp r6 = (X.C56518Hzp) r6
            r13.FLL(r6)
        L_0x00c6:
            X.Hzp r6 = (X.C56518Hzp) r6
            java.lang.Object r12 = r0.A05
            X.I4f r12 = (X.C56606I4f) r12
            X.JQ8 r1 = r12.A03()
            java.lang.Object r1 = r1.C4Q()
            java.lang.Object r7 = r0.A04
            boolean r1 = X.0qQ.A0K(r1, r7)
            boolean r1 = r13.AGv(r1)
            java.lang.Object r11 = r13.ECw()
            if (r1 != 0) goto L_0x00e6
            if (r11 != r3) goto L_0x00f9
        L_0x00e6:
            X.JQ8 r1 = r12.A03()
            java.lang.Object r1 = r1.C4Q()
            boolean r1 = X.0qQ.A0K(r1, r7)
            if (r1 == 0) goto L_0x0190
            X.Hte r11 = X.C56152Hte.A00
        L_0x00f6:
            r13.FLL(r11)
        L_0x00f9:
            X.Hte r11 = (X.C56152Hte) r11
            java.lang.Object r5 = r13.ECw()
            if (r5 != r3) goto L_0x010f
            X.5Oz r1 = r12.A07
            boolean r1 = X.C51969G9p.A1U(r1, r7)
            X.IGY r5 = new X.IGY
            r5.<init>(r1)
            r13.FLL(r5)
        L_0x010f:
            X.IGY r5 = (X.IGY) r5
            X.Htd r10 = r6.A01
            X.5Qk r4 = androidx.compose.ui.Modifier.A00
            boolean r2 = r13.AGw(r6)
            java.lang.Object r1 = r13.ECw()
            if (r2 != 0) goto L_0x0121
            if (r1 != r3) goto L_0x0129
        L_0x0121:
            r1 = 0
            X.JJQ r1 = X.JJQ.A00(r6, r1)
            r13.FLL(r1)
        L_0x0129:
            X.0sK r1 = (X.0sK) r1
            androidx.compose.ui.Modifier r4 = X.HRW.A00(r4, r1)
            X.5Oz r1 = r12.A07
            boolean r2 = X.C51969G9p.A1U(r1, r7)
            X.5Oz r1 = r5.A00
            X.C51967G9n.A16(r1, r2)
            androidx.compose.ui.Modifier r14 = r4.Ezh(r5)
            boolean r1 = r13.AGw(r7)
            java.lang.Object r15 = r13.ECw()
            if (r1 != 0) goto L_0x014a
            if (r15 != r3) goto L_0x0152
        L_0x014a:
            r1 = 0
            X.J6G r15 = X.J6G.A00(r7, r1)
            r13.FLL(r15)
        L_0x0152:
            X.0sP r15 = (X.0sP) r15
            boolean r2 = r13.AGu(r11)
            java.lang.Object r1 = r13.ECw()
            if (r2 != 0) goto L_0x0160
            if (r1 != r3) goto L_0x0169
        L_0x0160:
            r2 = 0
            X.JFw r1 = new X.JFw
            r1.<init>(r11, r2)
            r13.FLL(r1)
        L_0x0169:
            X.0sL r1 = (X.0sL) r1
            r2 = -616195562(0xffffffffdb459a16, float:-5.561999E16)
            java.lang.Object r6 = r0.A02
            java.lang.Object r9 = r0.A01
            r5 = 0
            X.JJT r4 = new X.JJT
            r4.<init>(r5, r6, r7, r8, r9)
            X.5PJ r17 = X.AnonymousClass5PI.A01(r13, r4, r2)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = 64
            r16 = r1
            X.C56663I6s.A03(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004f
            r0 = -1987343211(0xffffffff898b8c95, float:-3.3595235E-33)
            goto L_0x04ac
        L_0x0190:
            java.lang.Object r1 = r2.invoke(r8)
            X.Hzp r1 = (X.C56518Hzp) r1
            X.Hte r11 = r1.A02
            goto L_0x00f6
        L_0x019a:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0C(r35)
            r1 = 2
            if (r2 != r1) goto L_0x01a9
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x01a9:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x01b7
            r2 = -1757887555(0xffffffff9738c3bd, float:-5.9700663E-25)
            java.lang.String r1 = "com.instagram.archive.ui.InvertedLazyGrid.<anonymous> (ArchiveReelComposeFragment.kt:741)"
            X.0fL.A01(r2, r1)
        L_0x01b7:
            java.lang.Object r11 = r0.A01
            X.JNR r11 = (X.JNR) r11
            java.lang.Object r14 = r0.A04
            androidx.compose.ui.Modifier r14 = (androidx.compose.ui.Modifier) r14
            java.lang.Object r12 = r0.A05
            androidx.compose.foundation.lazy.grid.LazyGridState r12 = (androidx.compose.foundation.lazy.grid.LazyGridState) r12
            r7 = 0
            r18 = 1
            java.lang.Object r9 = r0.A06
            X.5Zx r9 = (X.C287325Zx) r9
            java.lang.Object r8 = r0.A03
            X.5Zu r8 = (X.C287295Zu) r8
            r2 = 0
            r1 = 494530154(0x1d79ee6a, float:3.3078133E-21)
            r13.ExS(r1)
            java.lang.Object r1 = r0.A02
            boolean r0 = r13.AGu(r1)
            java.lang.Object r15 = r13.ECw()
            if (r0 != 0) goto L_0x01e5
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r15 != r0) goto L_0x01e9
        L_0x01e5:
            X.J6h r15 = X.C59099J6h.A00(r13, r1, r2)
        L_0x01e9:
            X.0sP r15 = (X.0sP) r15
            X.C51965G9l.A1X(r13, r2)
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 392(0x188, float:5.5E-43)
            r10 = r7
            r19 = r2
            X.HQz.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004f
            r0 = 694769197(0x2969562d, float:5.181114E-14)
            goto L_0x04ac
        L_0x0203:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0B(r35)
            r1 = 2
            if (r2 != r1) goto L_0x0212
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x0212:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x0220
            r2 = -2077313062(0xffffffff842eb7da, float:-2.0538022E-36)
            java.lang.String r1 = "com.instagram.compose.igds.components.contextmenu.IgdsContextMenu.<anonymous>.<anonymous> (IgdsContextMenu.kt:54)"
            X.0fL.A01(r2, r1)
        L_0x0220:
            java.lang.Object r11 = r0.A01
            X.GeI r11 = (X.C52882GeI) r11
            java.lang.Object r14 = r0.A06
            X.5Oz r14 = (X.C284945Oz) r14
            java.lang.Object r12 = r0.A05
            X.IEj r12 = (X.C56838IEj) r12
            java.lang.Object r2 = r0.A03
            X.HL4 r2 = (X.HL4) r2
            r15 = 0
            java.lang.Object r1 = r0.A04
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            X.0sL r0 = (X.0sL) r0
            r19 = 48
            r20 = 16
            r16 = r2
            r17 = r1
            r18 = r0
            X.HXK.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004f
            r0 = -939151421(0xffffffffc805afc3, float:-136895.05)
            goto L_0x04ac
        L_0x0251:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0B(r35)
            r1 = 2
            if (r2 != r1) goto L_0x0260
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x0260:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x026e
            r2 = -1913201986(0xffffffff8df6dabe, float:-1.5213581E-30)
            java.lang.String r1 = "com.instagram.creation.genai.contextualbackground.ui.ContextualBackgroundScreen.<anonymous>.<anonymous> (ContextualBackgroundScreen.kt:92)"
            X.0fL.A01(r2, r1)
        L_0x026e:
            X.5Qk r1 = androidx.compose.ui.Modifier.A00
            r10 = 1
            r6 = 0
            androidx.compose.ui.Modifier r14 = X.C51966G9m.A0U(r1)
            java.lang.Object r5 = r0.A06
            X.Jvo r5 = (X.C61050Jvo) r5
            java.lang.Object r9 = r0.A05
            X.IQK r9 = (X.IQK) r9
            java.lang.Object r8 = r0.A04
            X.0sP r8 = (X.0sP) r8
            java.lang.Object r4 = r0.A01
            X.5Oz r4 = (X.C284945Oz) r4
            java.lang.Object r3 = r0.A02
            java.lang.Object r7 = r0.A03
            X.5RD r1 = X.C51966G9m.A0a(r6)
            int r12 = X.C287425a7.A00(r13)
            r2 = r13
            X.5Wx r2 = (X.C286565Wx) r2
            X.5RM r0 = X.C286565Wx.A04(r2)
            androidx.compose.ui.Modifier r11 = X.C287435a8.A01(r13, r14)
            X.C51973G9u.A0y(r13, r2)
            X.C51971G9r.A12(r13, r1, r0)
            X.0sL r1 = X.C287485aD.A02
            boolean r0 = r2.A0K
            if (r0 != 0) goto L_0x02af
            boolean r0 = X.C51972G9s.A1Q(r13, r12)
            if (r0 != 0) goto L_0x02b2
        L_0x02af:
            X.C51971G9r.A13(r13, r1, r12)
        L_0x02b2:
            X.C51965G9l.A18(r13, r11)
            java.lang.Object r0 = r5.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            if (r1 == r6) goto L_0x0371
            r0 = 2
            if (r1 == r0) goto L_0x0364
            if (r1 != r10) goto L_0x04b6
            r0 = -890342831(0xffffffffcaee7251, float:-7813416.5)
            r13.ExS(r0)
            if (r9 == 0) goto L_0x0313
            r0 = -890309816(0xffffffffcaeef348, float:-7829924.0)
            r13.ExS(r0)
            X.I7I.A05(r13, r9, r8, r6)
        L_0x02d3:
            X.C286565Wx.A0L(r2, r6)
            boolean r0 = X.C51971G9r.A1W(r4)
            r9 = r0 ^ 1
            r1 = 1128625799(0x43457687, float:197.463)
            r0 = 45
            X.JJQ r0 = X.JJQ.A00(r5, r0)
            X.5PJ r0 = X.AnonymousClass5PI.A01(r13, r0, r1)
            r8 = 48
            X.I7I.A07(r13, r0, r8, r9)
        L_0x02ee:
            X.C286565Wx.A0L(r2, r6)
            boolean r0 = X.C51971G9r.A1W(r4)
            r4 = r0 ^ 1
            r2 = 107450439(0x6679047, float:4.355227E-35)
            r1 = 9
            X.JGn r0 = new X.JGn
            r0.<init>(r1, r7, r5, r3)
            X.5PJ r0 = X.AnonymousClass5PI.A01(r13, r0, r2)
            X.I7I.A07(r13, r0, r8, r4)
            boolean r0 = X.C51967G9n.A1R(r13)
            if (r0 == 0) goto L_0x004f
            r0 = 559393467(0x2157aabb, float:7.3070793E-19)
            goto L_0x04ac
        L_0x0313:
            r0 = -890187521(0xffffffffcaf0d0ff, float:-7891071.5)
            r13.ExS(r0)
            java.lang.String r8 = r5.A06
            r0 = 1720593841(0x668e2db1, float:3.3570945E23)
            boolean r0 = X.C51967G9n.A1U(r13, r0)
            if (r0 == 0) goto L_0x032c
            r1 = 503415491(0x1e0182c3, float:6.856244E-21)
            java.lang.String r0 = "com.instagram.creation.genai.contextualbackground.ui.rememberBitmapFromLocalPath (ContextualBackgroundScreen.kt:365)"
            X.0fL.A01(r1, r0)
        L_0x032c:
            r1 = 0
            if (r8 != 0) goto L_0x034f
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x033b
            r0 = -354246906(0xffffffffeae29f06, float:-1.369841E26)
        L_0x0338:
            X.0fL.A00(r0)
        L_0x033b:
            X.C286565Wx.A0L(r2, r6)
            if (r1 == 0) goto L_0x02d3
            X.5bM r17 = X.C288075bK.A00
            r15 = 0
            r19 = 25008(0x61b0, float:3.5044E-41)
            r20 = 232(0xe8, float:3.25E-43)
            r16 = r1
            r18 = r15
            X.AnonymousClass6G3.A01(r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x02d3
        L_0x034f:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r8)
            if (r0 == 0) goto L_0x035a
            X.60g r1 = new X.60g
            r1.<init>(r0)
        L_0x035a:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x033b
            r0 = -221547027(0xfffffffff2cb75ed, float:-8.0599066E30)
            goto L_0x0338
        L_0x0364:
            r0 = -890495041(0xffffffffcaec1fbf, float:-7737311.5)
            r13.ExS(r0)
            r8 = 48
            X.I7I.A01(r13, r5, r8, r6)
            goto L_0x02ee
        L_0x0371:
            r0 = -890658473(0xffffffffcae9a157, float:-7655595.5)
            r13.ExS(r0)
            r8 = 48
            X.I7I.A01(r13, r5, r8, r10)
            X.HYM.A00(r13, r6)
            goto L_0x02ee
        L_0x0381:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0C(r35)
            r1 = 2
            if (r2 != r1) goto L_0x0390
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x0390:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x039e
            r2 = -1360214209(0xffffffffaeecc73f, float:-1.0767431E-10)
            java.lang.String r1 = "com.instagram.discovery.hcm.viewbinder.ThreadsHcmViewBinder.bindThreadsHcm.<anonymous>.<anonymous> (ThreadsHcmViewBinder.kt:129)"
            X.0fL.A01(r2, r1)
        L_0x039e:
            java.lang.Object r1 = r0.A04
            java.lang.Object r2 = X.C51966G9m.A18(r1)
            X.5vX r2 = (X.AnonymousClass5vX) r2
            java.lang.Object r15 = r0.A03
            X.5vZ r15 = (X.AnonymousClass5vZ) r15
            java.lang.Object r14 = r0.A02
            X.5vc r14 = (X.C299655vc) r14
            java.lang.Object r6 = r0.A06
            java.lang.Object r4 = r0.A05
            java.lang.Object r1 = r0.A01
            r0 = 24
            X.Inz r8 = new X.Inz
            r8.<init>(r0, r1, r6, r4)
            r0 = 25
            X.Inz r3 = new X.Inz
            r3.<init>(r0, r1, r6, r4)
            r0 = 3
            X.J6S r21 = X.J6S.A00(r1, r6, r0)
            X.Ir9 r19 = X.C58390Ir9.A00
            r0 = 1323141870(0x4edd8aee, float:1.85843482E9)
            boolean r0 = X.C51967G9n.A1Y(r13, r6, r0)
            java.lang.Object r1 = r13.ECw()
            if (r0 != 0) goto L_0x03da
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x03e4
        L_0x03da:
            r0 = 37
            X.PmD r1 = new X.PmD
            r1.<init>(r6, r0)
            r13.FLL(r1)
        L_0x03e4:
            X.0sP r1 = (X.0sP) r1
            r7 = r13
            X.5Wx r7 = (X.C286565Wx) r7
            r0 = 0
            X.C286565Wx.A0L(r7, r0)
            X.J37 r23 = X.J37.A00
            r4 = 1323144605(0x4edd959d, float:1.8587849E9)
            boolean r5 = X.C51967G9n.A1Y(r13, r6, r4)
            java.lang.Object r4 = r13.ECw()
            if (r5 != 0) goto L_0x0400
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x0409
        L_0x0400:
            r4 = 29
            X.JGK r4 = X.JGK.A01(r6, r4)
            r13.FLL(r4)
        L_0x0409:
            X.0sL r25 = X.C51965G9l.A10(r7, r4)
            r4 = 1323148671(0x4edda57f, float:1.85930534E9)
            boolean r5 = X.C51967G9n.A1Y(r13, r6, r4)
            java.lang.Object r4 = r13.ECw()
            if (r5 != 0) goto L_0x041e
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x0428
        L_0x041e:
            r5 = 48
            X.Plp r4 = new X.Plp
            r4.<init>(r6, r5)
            r13.FLL(r4)
        L_0x0428:
            X.0sa r20 = X.C51965G9l.A0y(r7, r4, r0)
            r4 = 1323151349(0x4eddaff5, float:1.85964813E9)
            boolean r5 = X.C51967G9n.A1Y(r13, r6, r4)
            java.lang.Object r4 = r13.ECw()
            if (r5 != 0) goto L_0x043d
            java.lang.Object r5 = X.AnonymousClass5XT.A00
            if (r4 != r5) goto L_0x0447
        L_0x043d:
            r5 = 38
            X.PmD r4 = new X.PmD
            r4.<init>(r6, r5)
            r13.FLL(r4)
        L_0x0447:
            X.0sP r24 = X.C51965G9l.A0z(r7, r4)
            r29 = 1
            r26 = 102236544(0x6180180, float:2.8589125E-35)
            r27 = 224640(0x36d80, float:3.14788E-40)
            r16 = r2
            r17 = r8
            r18 = r3
            r22 = r1
            r28 = r0
            r30 = r0
            r31 = r0
            r32 = r0
            X.C304036Bx.A00(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004f
            r0 = -422108815(0xffffffffe6d72171, float:-5.0796284E23)
            goto L_0x04ac
        L_0x0470:
            X.5Wy r13 = (X.C286575Wy) r13
            int r2 = X.C51968G9o.A0C(r35)
            r1 = 2
            if (r2 != r1) goto L_0x047f
            boolean r1 = r13.Bwn()
            if (r1 != 0) goto L_0x04b1
        L_0x047f:
            boolean r1 = X.0fL.A02()
            if (r1 == 0) goto L_0x048d
            r2 = -712223539(0xffffffffd58c54cd, float:-1.92869806E13)
            java.lang.String r1 = "com.instagram.schools.channels.ui.InternalComposeSheet.<anonymous> (SchoolChannelsComponent.kt:71)"
            X.0fL.A01(r2, r1)
        L_0x048d:
            java.lang.Object r4 = r0.A04
            java.lang.Object r8 = r0.A06
            java.lang.Object r3 = r0.A01
            java.lang.Object r6 = r0.A05
            java.lang.Object r5 = r0.A03
            java.lang.Object r7 = r0.A02
            r2 = 7
            X.IoR r1 = new X.IoR
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            X.C55125HcY.A00(r1, r13, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x004f
            r0 = 23562564(0x1678944, float:4.2526482E-38)
        L_0x04ac:
            X.0fL.A00(r0)
            goto L_0x004f
        L_0x04b1:
            r13.Evl()
            goto L_0x004f
        L_0x04b6:
            r0 = 1633835828(0x61625b34, float:2.60971E20)
            X.Wub r0 = X.C51972G9s.A0v(r13, r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.J9J.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
