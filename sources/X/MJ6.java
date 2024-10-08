package X;

public final class MJ6 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ6(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.Prw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (X.C51971G9r.A1b((X.C62320sa) r15.A02) != false) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 4: goto L_0x02b3;
                case 6: goto L_0x029f;
                case 9: goto L_0x0288;
                case 10: goto L_0x024a;
                case 19: goto L_0x01e7;
                case 20: goto L_0x0122;
                case 22: goto L_0x010b;
                case 34: goto L_0x0024;
                case 36: goto L_0x00e9;
                case 37: goto L_0x0044;
                case 38: goto L_0x00d2;
                case 39: goto L_0x00d2;
                case 40: goto L_0x00a4;
                case 41: goto L_0x0095;
                case 42: goto L_0x0086;
                case 43: goto L_0x0044;
                case 44: goto L_0x0077;
                case 45: goto L_0x005c;
                case 46: goto L_0x004f;
                case 47: goto L_0x0044;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x0011
            java.lang.Object r5 = r0.invoke()
            if (r5 != 0) goto L_0x0023
        L_0x0011:
            java.lang.Object r0 = r15.A02
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0041
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0041
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0023:
            return r5
        L_0x0024:
            java.lang.Object r0 = r15.A01
            X.07g r1 = X.C51969G9p.A0c(r0)
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0038
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0038
            X.2YM r5 = r1.getDefaultViewModelProviderFactory()
            if (r5 != 0) goto L_0x0023
        L_0x0038:
            java.lang.Object r0 = r15.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.2YM r5 = r0.getDefaultViewModelProviderFactory()
            return r5
        L_0x0041:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x0044:
            java.lang.Object r1 = r15.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r15.A02
            r1.invoke(r0)
            goto L_0x0247
        L_0x004f:
            java.lang.Object r1 = r15.A01
            X.Ghe r1 = (X.C53046Ghe) r1
            java.lang.Object r0 = r15.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            r1.Dzv(r0)
            goto L_0x0247
        L_0x005c:
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            boolean r0 = X.C51971G9r.A1b(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r15.A02
            X.0sa r0 = (X.C62320sa) r0
            boolean r1 = X.C51971G9r.A1b(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x0077:
            java.lang.Object r1 = r15.A01
            X.MVg r1 = (X.C66528MVg) r1
            if (r1 == 0) goto L_0x0247
            java.lang.Object r0 = r15.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            r1.E00(r0)
            goto L_0x0247
        L_0x0086:
            java.lang.Object r1 = r15.A01
            X.MVg r1 = (X.C66528MVg) r1
            if (r1 == 0) goto L_0x0247
            java.lang.Object r0 = r15.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            r1.Dzv(r0)
            goto L_0x0247
        L_0x0095:
            java.lang.Object r1 = r15.A01
            X.MVg r1 = (X.C66528MVg) r1
            if (r1 == 0) goto L_0x0247
            java.lang.Object r0 = r15.A02
            com.instagram.wonderwall.model.WallPostItem r0 = (com.instagram.wonderwall.model.WallPostItem) r0
            r1.Dzw(r0)
            goto L_0x0247
        L_0x00a4:
            java.lang.Object r4 = r15.A01
            X.LR8 r4 = (X.LR8) r4
            java.lang.Object r3 = r15.A02
            com.instagram.music.common.model.AudioOverlayTrack r3 = (com.instagram.music.common.model.AudioOverlayTrack) r3
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.2xy r1 = r4.A01
            boolean r0 = r1.isPlaying()
            if (r0 == 0) goto L_0x00c2
            r1.pause()
            X.5Oz r0 = r4.A00
            X.C51967G9n.A16(r0, r2)
            goto L_0x0247
        L_0x00c2:
            boolean r0 = r1.CKF()
            if (r0 == 0) goto L_0x00cd
            r1.E2p()
            goto L_0x0247
        L_0x00cd:
            X.LR8.A01(r3, r4)
            goto L_0x0247
        L_0x00d2:
            java.lang.Object r3 = r15.A01
            X.Ghf r3 = (X.C53047Ghf) r3
            java.lang.Object r2 = r15.A02
            com.instagram.wonderwall.model.WallInfo r2 = (com.instagram.wonderwall.model.WallInfo) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r1 = 0
            X.M19 r0 = new X.M19
            r0.<init>(r2, r1)
            X.C53047Ghf.A00(r0, r3)
            goto L_0x0247
        L_0x00e9:
            java.lang.Object r3 = r15.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            X.1ud r1 = X.1ua.A0G
            java.lang.Object r0 = r15.A01
            android.content.Context r0 = (android.content.Context) r0
            X.1ua r0 = r1.A01(r0, r3)
            X.L8f r1 = new X.L8f
            r1.<init>(r3, r0)
            com.instagram.wonderwall.api.WallApiGraphQLImpl r0 = new com.instagram.wonderwall.api.WallApiGraphQLImpl
            r0.<init>(r3)
            com.instagram.wonderwall.repository.WallPendingPostManager r5 = new com.instagram.wonderwall.repository.WallPendingPostManager
            r5.<init>(r2, r0, r1)
            return r5
        L_0x010b:
            java.lang.Object r3 = r15.A02
            java.lang.Object r2 = r15.A01
            android.view.SurfaceHolder r2 = (android.view.SurfaceHolder) r2
            r2.getSurface()
            r0 = 38
            X.9M1 r1 = new X.9M1
            r1.<init>(r0, r2, r3)
            java.lang.String r0 = "SurfaceVideoViewController.onSurfaceAvailable()"
            X.AnonymousClass4X9.A00(r0, r1)
            goto L_0x0247
        L_0x0122:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.lang.Object r1 = r15.A01
            X.XaB r1 = (X.C21403XaB) r1
            r13 = 1
            com.facebook.mediastreaming.opt.mediastreamingtimer.MediaStreamingTimerProviderHolder r0 = new com.facebook.mediastreaming.opt.mediastreamingtimer.MediaStreamingTimerProviderHolder
            r0.<init>(r13)
            r5.add(r0)
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r9 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r11 = 4621819117588971520(0x4024000000000000, double:10.0)
            X.KhS r14 = X.C62536KhS.SOURCE
            com.facebook.mediastreaming.opt.stalldetector.StallDetectorServiceProviderHolder r6 = new com.facebook.mediastreaming.opt.stalldetector.StallDetectorServiceProviderHolder
            r6.<init>(r7, r9, r11, r13, r14)
            r5.add(r6)
            X.KhS r14 = X.C62536KhS.TRANSPORT
            com.facebook.mediastreaming.opt.stalldetector.StallDetectorServiceProviderHolder r6 = new com.facebook.mediastreaming.opt.stalldetector.StallDetectorServiceProviderHolder
            r6.<init>(r7, r9, r11, r13, r14)
            r5.add(r6)
            com.instagram.common.session.UserSession r1 = r1.A00
            X.0Tu r0 = X.0Tu.A05
            r2 = 2342155690686416086(0x20810231000604d6, double:4.059380389918999E-152)
            boolean r2 = X.182.A06(r0, r1, r2)
            if (r2 == 0) goto L_0x018c
            X.Kpe r2 = com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder.Companion
            r2 = 37157106402787368(0x84023100050028, double:3.56164193655635E-306)
            double r7 = X.182.A00(r0, r1, r2)
            r2 = 37157106402983977(0x84023100080029, double:3.5616419366806863E-306)
            double r9 = X.182.A00(r0, r1, r2)
            r2 = 37157106402590758(0x84023100020026, double:3.561641936432013E-306)
            double r11 = X.182.A00(r0, r1, r2)
            r2 = 36594156449236567(0x82023100030657, double:3.2056301191133084E-306)
            int r13 = X.DbS.A04(r0, r1, r2)
            X.KhT r14 = X.C62537KhT.AUDIO
            com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder r6 = new com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder
            r6.<init>(r7, r9, r11, r13, r14)
            r5.add(r6)
        L_0x018c:
            r2 = 2342155690686481623(0x20810231000704d7, double:4.0593803899745685E-152)
            boolean r2 = X.182.A06(r0, r1, r2)
            if (r2 == 0) goto L_0x01c7
            X.Kpe r2 = com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder.Companion
            r2 = 37157106402787368(0x84023100050028, double:3.56164193655635E-306)
            double r7 = X.182.A00(r0, r1, r2)
            r2 = 37157106402721831(0x84023100040027, double:3.561641936514904E-306)
            double r9 = X.182.A00(r0, r1, r2)
            r2 = 37157106402590758(0x84023100020026, double:3.561641936432013E-306)
            double r11 = X.182.A00(r0, r1, r2)
            r2 = 36594156449236567(0x82023100030657, double:3.2056301191133084E-306)
            int r13 = X.DbS.A04(r0, r1, r2)
            X.KhT r14 = X.C62537KhT.VIDEO
            com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder r6 = new com.facebook.mediastreaming.opt.timestampchecker.TimestampCheckerServiceProviderHolder
            r6.<init>(r7, r9, r11, r13, r14)
            r5.add(r6)
        L_0x01c7:
            X.Kpa r2 = com.facebook.mediastreaming.client.livestreaming.tslog.LiveStreamingTsLogServiceProviderHolder.Companion
            java.lang.Object r2 = r15.A02
            X.Y0z r2 = (X.C22371Y0z) r2
            android.content.Context r2 = r2.A0A
            com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf.BatteryMonitor r4 = new com.facebook.mediastreaming.client.livestreaming.tslog.pipeline_perf.BatteryMonitor
            r4.<init>(r2)
            r2 = 36310624183714005(0x810052000b00d5, double:3.026323172704046E-306)
            boolean r2 = X.182.A06(r0, r1, r2)
            r1 = 0
            com.facebook.mediastreaming.client.livestreaming.tslog.LiveStreamingTsLogServiceProviderHolder r0 = new com.facebook.mediastreaming.client.livestreaming.tslog.LiveStreamingTsLogServiceProviderHolder
            r0.<init>(r4, r1, r1, r2)
            r5.add(r0)
            return r5
        L_0x01e7:
            java.lang.Object r0 = r15.A01
            X.XcN r0 = (X.C21478XcN) r0
            X.C65819M0l.A0K = r0
            java.lang.Object r3 = r15.A02
            X.M0l r3 = (X.C65819M0l) r3
            X.OyC r2 = r3.A08
            X.PLL r1 = r2.A0A
            r5 = 0
            X.PPA r0 = new X.PPA
            r0.<init>()
            r1.A7I(r0)
            java.lang.String r8 = r3.A0E
            X.L5Y r0 = r3.A0D
            int r10 = r0.A01
            int r9 = r0.A00
            X.7l3 r6 = r3.A07
            X.Vjq r4 = r3.A09
            X.OAP r3 = r3.A02
            r0 = 5
            X.0qQ.A0B(r3, r0)
            X.OVd r0 = r2.A09
            X.Odx r7 = r0.A0Z
            X.OWb r2 = X.C71004OWb.A00
            java.lang.String r1 = "startLiveSwap() in RtcRsysInteractor streamVideoWidth = "
            java.lang.String r0 = ", streamVideoHeight "
            java.lang.String r1 = X.002.A02(r10, r9, r1, r0)
            java.lang.String r0 = "RtcRsysInteractor"
            r2.A00(r0, r1)
            r7.A04 = r6
            r7.A08 = r3
            r7.A07 = r4
            com.instagram.common.session.UserSession r3 = r7.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36600646144626624(0x82081800000fc0, double:3.209734228609886E-306)
            long r3 = X.182.A01(r2, r3, r0)
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r11 = 1
            X.Pma r6 = new X.Pma
            r6.<init>(r7, r8, r9, r10, r11)
            X.C71143Odx.A06(r7, r6, r0, r5)
        L_0x0247:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x024a:
            java.lang.Object r6 = r15.A01
            android.view.View r6 = (android.view.View) r6
            java.lang.Object r1 = r15.A02
            X.LlW r1 = (X.C64993LlW) r1
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r8 = r1.A02
            if (r8 != 0) goto L_0x0260
            java.lang.String r0 = "interactiveDrawableContainer"
        L_0x0258:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0260:
            X.2eb r10 = r1.A01
            if (r10 != 0) goto L_0x0267
            java.lang.String r0 = "drawingViewStubHolder"
            goto L_0x0258
        L_0x0267:
            X.0eM r0 = r1.A08
            java.lang.Object r7 = X.AnonymousClass7TE.A14(r0)
            android.view.ViewStub r7 = (android.view.ViewStub) r7
            X.0eM r0 = r1.A09
            java.lang.Object r11 = X.AnonymousClass7TE.A14(r0)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r11 = (com.instagram.ui.widget.drawing.EyedropperColorPickerTool) r11
            r0 = 11
            X.Sd0 r9 = new X.Sd0
            r9.<init>((java.lang.Object) r1, (int) r0)
            r12 = 0
            X.88K r5 = new X.88K
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r5.A06(r1)
            return r5
        L_0x0288:
            java.lang.Object r3 = r15.A01
            android.view.View r3 = (android.view.View) r3
            java.lang.Object r2 = r15.A02
            X.LlW r2 = (X.C64993LlW) r2
            X.4DH r0 = r2.A03
            X.0h9 r1 = r0.mLifecycleRegistry
            X.0qQ.A07(r1)
            com.instagram.common.session.UserSession r0 = r2.A04
            X.8BQ r5 = new X.8BQ
            r5.<init>(r3, r1, r0, r2)
            return r5
        L_0x029f:
            java.lang.Object r3 = r15.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r15.A01
            X.4DH r2 = (X.AnonymousClass4DH) r2
            android.content.Context r1 = r2.requireContext()
            X.6go r0 = X.C313666go.BROADCASTER
            X.KEA r5 = new X.KEA
            r5.<init>(r1, r2, r3, r0)
            return r5
        L_0x02b3:
            java.lang.Object r3 = r15.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r2 = r15.A01
            X.4DH r2 = (X.AnonymousClass4DH) r2
            android.content.Context r1 = r2.requireContext()
            X.6go r0 = X.C313666go.GUEST
            X.KEA r5 = new X.KEA
            r5.<init>(r1, r2, r3, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MJ6.invoke():java.lang.Object");
    }
}
