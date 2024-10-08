package X;

/* renamed from: X.9M1  reason: invalid class name */
public final class AnonymousClass9M1 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9M1(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v38, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0212, code lost:
        if (X.AnonymousClass5Ea.A00(r0) != X.AnonymousClass05K.A00) goto L_0x0214;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0510;
                case 1: goto L_0x04ca;
                case 2: goto L_0x04bc;
                case 3: goto L_0x0007;
                case 4: goto L_0x0007;
                case 5: goto L_0x049c;
                case 6: goto L_0x0480;
                case 7: goto L_0x0453;
                case 8: goto L_0x0444;
                case 9: goto L_0x0425;
                case 10: goto L_0x0413;
                case 11: goto L_0x0407;
                case 12: goto L_0x0043;
                case 13: goto L_0x03f0;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x03bb;
                case 17: goto L_0x035e;
                case 18: goto L_0x0340;
                case 19: goto L_0x032e;
                case 20: goto L_0x031e;
                case 21: goto L_0x02fc;
                case 22: goto L_0x02a6;
                case 23: goto L_0x025f;
                case 24: goto L_0x0245;
                case 25: goto L_0x0230;
                case 26: goto L_0x021b;
                case 27: goto L_0x01f1;
                case 28: goto L_0x01da;
                case 29: goto L_0x01cc;
                case 30: goto L_0x01ba;
                case 31: goto L_0x01ac;
                case 32: goto L_0x019e;
                case 33: goto L_0x0190;
                case 34: goto L_0x0177;
                case 35: goto L_0x0152;
                case 36: goto L_0x0144;
                case 37: goto L_0x0132;
                case 38: goto L_0x00ee;
                case 39: goto L_0x00b1;
                case 40: goto L_0x007a;
                case 41: goto L_0x0007;
                case 42: goto L_0x0007;
                case 43: goto L_0x002a;
                case 44: goto L_0x002a;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0053;
                case 48: goto L_0x002a;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x0013
            java.lang.Object r5 = r1.invoke()
            if (r5 != 0) goto L_0x0029
        L_0x0013:
            java.lang.Object r0 = r0.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x0050
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x0050
            X.2YQ r5 = r1.getDefaultViewModelCreationExtras()
        L_0x0029:
            return r5
        L_0x002a:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x0036
            java.lang.Object r5 = r1.invoke()
            if (r5 != 0) goto L_0x0029
        L_0x0036:
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YQ r5 = r0.getDefaultViewModelCreationExtras()
            return r5
        L_0x0043:
            java.lang.Object r5 = r0.A01
            if (r5 != 0) goto L_0x0029
            java.lang.Object r0 = r0.A02
            X.2YL r0 = (X.2YL) r0
            X.6oS r5 = X.C318116oQ.A00(r0)
            return r5
        L_0x0050:
            X.2YP r5 = X.AnonymousClass2YP.A00
            return r5
        L_0x0053:
            java.lang.Object r1 = r0.A01
            X.1GU r1 = (X.AnonymousClass1GU) r1
            X.1FS r4 = r1.A00
            java.util.Map r1 = r4.A0D
            java.util.LinkedHashMap r3 = X.0Yt.A03(r1)
            r1 = 3456(0xd80, float:4.843E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            java.lang.String r1 = "1"
            r3.put(r2, r1)
            java.lang.Object r2 = r0.A02
            X.2lj r2 = (X.C228472lj) r2
            X.1FI r1 = r4.A04
            java.lang.String r0 = r4.A08
            r2.A0A(r1, r0, r3)
            r0 = 0
            r2.A0L = r0
            goto L_0x0410
        L_0x007a:
            java.lang.String r3 = ""
            java.lang.Object r1 = r0.A02     // Catch:{ IllegalStateException -> 0x009b }
            X.78q r1 = (X.C3269178q) r1     // Catch:{ IllegalStateException -> 0x009b }
            X.0sa r1 = r1.A01     // Catch:{ IllegalStateException -> 0x009b }
            java.lang.Object r1 = r1.invoke()     // Catch:{ IllegalStateException -> 0x009b }
            X.7Zg r1 = (X.C333517Zg) r1     // Catch:{ IllegalStateException -> 0x009b }
            X.7S7 r1 = r1.C6l()     // Catch:{ IllegalStateException -> 0x009b }
            X.3sy r1 = r1.B8S()     // Catch:{ IllegalStateException -> 0x009b }
            X.0qQ.A07(r1)     // Catch:{ IllegalStateException -> 0x009b }
            java.lang.String r1 = X.C66647MaG.A0B(r1)     // Catch:{ IllegalStateException -> 0x009b }
            if (r1 == 0) goto L_0x00a5
            r3 = r1
            goto L_0x00a5
        L_0x009b:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()
            if (r1 == 0) goto L_0x00a5
            r2.getMessage()
        L_0x00a5:
            java.lang.Object r0 = r0.A01
            X.7Rs r0 = (X.C331627Rs) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.H6B r5 = new X.H6B
            r5.<init>(r0, r3)
            return r5
        L_0x00b1:
            java.lang.Object r4 = r0.A02
            X.4Yt r4 = (X.C266404Yt) r4
            java.lang.Object r3 = r0.A01
            android.view.SurfaceHolder r3 = (android.view.SurfaceHolder) r3
            r3.getSurface()
            android.view.Surface r0 = r3.getSurface()
            if (r0 != 0) goto L_0x00d6
            r0 = 1033(0x409, float:1.448E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "holder.getSurface() null on surfaceDestroyed()."
            X.0wb.A03(r1, r0)
        L_0x00cd:
            boolean r0 = r4.A06
            if (r0 != 0) goto L_0x0410
            r3.removeCallback(r4)
            goto L_0x0410
        L_0x00d6:
            X.4M1 r2 = r4.A00
            r1 = 1
            android.view.Surface r0 = r3.getSurface()
            X.0qQ.A07(r0)
            boolean r0 = r2.A0N(r4, r0)
            if (r0 != r1) goto L_0x00cd
            android.view.Surface r0 = r3.getSurface()
            r0.release()
            goto L_0x00cd
        L_0x00ee:
            java.lang.Object r3 = r0.A01
            android.view.SurfaceHolder r3 = (android.view.SurfaceHolder) r3
            android.view.Surface r1 = r3.getSurface()
            if (r1 != 0) goto L_0x0105
            r0 = 1033(0x409, float:1.448E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "holder.getSurface() null on surfaceCreated()."
            X.0wb.A03(r1, r0)
            goto L_0x0410
        L_0x0105:
            java.lang.Object r0 = r0.A02
            X.4Yt r0 = (X.C266404Yt) r0
            X.4M1 r2 = r0.A00
            android.view.Surface r1 = r3.getSurface()
            X.0qQ.A07(r1)
            android.view.SurfaceView r0 = r0.A02
            r0.getWidth()
            r0.getHeight()
            X.4Nl r0 = r2.A0O
            if (r0 == 0) goto L_0x0129
            X.4Lx r0 = r0.A03
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0129
            X.AnonymousClass4M1.A0G(r2)
            goto L_0x0410
        L_0x0129:
            X.4MM r0 = r2.A0K
            if (r0 == 0) goto L_0x0410
            r0.setSurface(r1)
            goto L_0x0410
        L_0x0132:
            java.lang.Object r3 = r0.A02
            X.4Yt r3 = (X.C266404Yt) r3
            java.lang.Object r2 = r0.A01
            r1 = 22
            X.MJ6 r0 = new X.MJ6
            r0.<init>(r1, r2, r3)
            X.C266404Yt.A00(r3, r0)
            goto L_0x0410
        L_0x0144:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.3Gj r5 = new X.3Gj
            r5.<init>(r1, r0)
            return r5
        L_0x0152:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            boolean r0 = X.C362988ir.A01(r2, r1)
            if (r0 == 0) goto L_0x0171
            X.C362988ir.A00()
            X.Urh r5 = new X.Urh
            r5.<init>(r2, r1)
            return r5
        L_0x0171:
            X.9qJ r5 = new X.9qJ
            r5.<init>()
            return r5
        L_0x0177:
            java.lang.Object r3 = r0.A01
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r0 = r0.A02
            X.6gz r0 = (X.C313776gz) r0
            X.6h4 r2 = r0.A03
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r1 = r0.A01()
            com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi r0 = new com.instagram.video.live.mvvm.model.datasource.api.IgLiveWaveApi
            r0.<init>(r3)
            X.LAo r5 = new X.LAo
            r5.<init>(r3, r0, r1, r2)
            return r5
        L_0x0190:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.6gv r5 = new X.6gv
            r5.<init>(r0, r1)
            return r5
        L_0x019e:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.6gt r5 = new X.6gt
            r5.<init>(r0, r1)
            return r5
        L_0x01ac:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.L5O r5 = new X.L5O
            r5.<init>(r0, r1)
            return r5
        L_0x01ba:
            java.lang.Object r2 = r0.A02
            X.0lg r2 = (X.0lg) r2
            java.lang.Object r1 = r0.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            X.0wc r0 = X.AnonymousClass0kN.A01(r1, r2)
            X.LAn r5 = new X.LAn
            r5.<init>(r0, r1)
            return r5
        L_0x01cc:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.LAV r5 = new X.LAV
            r5.<init>(r0, r1)
            return r5
        L_0x01da:
            java.lang.Object r1 = r0.A02
            X.3YK r1 = (X.AnonymousClass3YK) r1
            java.lang.Object r0 = r0.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r1 = r1.A00
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r1, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L_0x01f1:
            java.lang.Object r4 = r0.A02
            X.8XW r4 = (X.AnonymousClass8XW) r4
            X.8XU r1 = r4.A0A
            X.8XT r3 = r1.A0D
            r2 = 1
            if (r3 == 0) goto L_0x0219
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            com.instagram.ui.widget.mediapicker.Folder r0 = r4.A02
            boolean r0 = r3.AFR(r0, r1)
            if (r0 != r2) goto L_0x0219
            com.instagram.common.session.UserSession r0 = r4.A09
            if (r0 == 0) goto L_0x0219
            java.lang.Integer r1 = X.AnonymousClass5Ea.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0219
        L_0x0214:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            return r5
        L_0x0219:
            r2 = 0
            goto L_0x0214
        L_0x021b:
            java.lang.Object r1 = r0.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.1Am r2 = X.1Al.A01(r1)
            X.1An r1 = X.1An.A3R
            java.lang.Object r0 = r0.A02
            java.lang.Class r0 = r0.getClass()
            X.0xa r5 = r2.A04(r1, r0)
            return r5
        L_0x0230:
            X.3YF r2 = X.C271604jI.A00
            java.lang.Object r1 = r0.A02
            X.3fg r1 = (X.C247043fg) r1
            com.instagram.common.session.UserSession r1 = r1.A00
            java.lang.Object r0 = r0.A01
            X.1Xj r0 = (X.1Xj) r0
            long r0 = r2.A01(r1, r0)
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L_0x0245:
            java.lang.Object r3 = r0.A02
            X.3W1 r3 = (X.AnonymousClass3W1) r3
            java.lang.Object r2 = r0.A01
            X.2xU r2 = (X.AnonymousClass2xU) r2
            r1 = 0
            r0 = 1
            r3.A0L(r2, r1, r0)
            r1 = 19
            X.Wvv r0 = new X.Wvv
            r0.<init>(r1, r2, r3)
            X.3dj r5 = new X.3dj
            r5.<init>(r0)
            return r5
        L_0x025f:
            java.lang.Object r13 = r0.A02
            com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController r13 = (com.instagram.sharetofriendsstory.v2.drawer.ShareToFriendsStoryDrawerController) r13
            android.view.View r6 = r13.postCaptureVideoContainer
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.0hq r10 = r0.getSupportFragmentManager()
            X.3oV r0 = r13.drawerContainerViewStubber
            android.view.View r7 = r0.getView()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            X.3oV r0 = r13.drawerContainerViewStubber
            android.view.View r1 = r0.getView()
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            android.view.View r8 = r1.requireViewById(r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            com.instagram.common.session.UserSession r11 = r13.A00
            X.80x r0 = r13.A02
            com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec r2 = r0.A00()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = r2.A02
            float r15 = (float) r0
            float r15 = r15 * r1
            int r0 = r2.A03
            float r0 = (float) r0
            float r15 = r15 / r0
            r9 = 0
            r14 = 1056964608(0x3f000000, float:0.5)
            r16 = 1
            X.WMw r5 = new X.WMw
            r12 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
        L_0x02a6:
            java.lang.Object r6 = r0.A01
            android.content.Context r6 = (android.content.Context) r6
            X.0qQ.A0A(r6)
            java.lang.Object r10 = r0.A02
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            X.1xC r8 = X.1xC.A01
            X.0eM r0 = X.C2376338m.A01
            java.lang.Object r0 = r0.getValue()
            X.38m r0 = (X.C2376338m) r0
            X.0xa r12 = r0.A00
            X.0nE r11 = X.C61410nE.A00
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r7 = new android.os.Handler
            r7.<init>(r0)
            X.39A r14 = new X.39A
            r14.<init>(r10)
            com.instagram.release.lockout.DogfoodingEligibilityApi r13 = new com.instagram.release.lockout.DogfoodingEligibilityApi
            r13.<init>(r10)
            boolean r16 = X.1CI.A00(r10)
            X.0lZ r0 = X.0la.A02
            X.0la r9 = r0.A00()
            boolean r17 = X.C61120lW.A05()
            X.0qQ.A0A(r6)
            long r2 = X.C61120lW.A01(r6)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r0 = r0 - r2
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 / r2
            int r15 = (int) r0
            X.38k r5 = new X.38k
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r5
        L_0x02fc:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            X.0qQ.A0A(r3)
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            boolean r2 = X.1CI.A00(r0)
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            X.0qQ.A07(r1)
            X.0lZ r0 = X.0la.A02
            X.0la r0 = r0.A00()
            X.6U7 r5 = new X.6U7
            r5.<init>(r3, r1, r0, r2)
            return r5
        L_0x031e:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            com.instagram.reels.viewer.common.ReelViewGroup r0 = (com.instagram.reels.viewer.common.ReelViewGroup) r0
            X.6nO r0 = r0.A06
            android.view.GestureDetector r5 = new android.view.GestureDetector
            r5.<init>(r1, r0)
            return r5
        L_0x032e:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            com.instagram.reels.viewer.common.ReelViewGroup r0 = (com.instagram.reels.viewer.common.ReelViewGroup) r0
            X.6YR r0 = r0.getOrchestratorListener()
            X.GYE r5 = new X.GYE
            r5.<init>(r1, r0)
            return r5
        L_0x0340:
            java.lang.Object r1 = r0.A02
            X.6Wz r1 = (X.C309116Wz) r1
            com.instagram.model.reels.Reel r1 = r1.A01
            java.lang.Object r0 = r0.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            java.util.List r0 = r1.A0O(r0)
            X.0qQ.A07(r0)
            java.lang.Object r0 = X.00k.A0L(r0)
            X.3uh r0 = (X.C255773uh) r0
            if (r0 == 0) goto L_0x035c
            java.lang.String r5 = r0.A0j
            return r5
        L_0x035c:
            r5 = 0
            return r5
        L_0x035e:
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r4 = r0.A01
            X.3N9 r4 = (X.AnonymousClass3N9) r4
            r3 = 0
            X.0qQ.A0B(r2, r3)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r4.A0L
            X.3BK r0 = X.AnonymousClass3BJ.A00(r2)
            boolean r0 = r0.A01()
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x039e
            r0 = 1059816735(0x3f2b851f, float:0.67)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r0)
            r4.A00()
            com.instagram.ui.widget.emitter.PulseEmitter r0 = r4.A0A
            if (r0 == 0) goto L_0x0398
            r0.setVisibility(r3)
            r0.A01()
            goto L_0x0410
        L_0x0398:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x039e:
            com.instagram.ui.widget.emitter.PulseEmitter r0 = r4.A0A
            if (r0 == 0) goto L_0x0410
            r0.A02()
            r1 = 8
            r0.setVisibility(r1)
            com.instagram.ui.widget.imageview.PulsingMultiImageView r0 = r4.A0B
            if (r0 == 0) goto L_0x03b5
            r0.A0I()
            r0.setVisibility(r1)
            goto L_0x0410
        L_0x03b5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x03bb:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView r2 = (com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView) r2
            boolean r0 = com.instagram.reels.ui.views.reelavatar.RecyclerReelAvatarView.A05
            android.util.AttributeSet r1 = r2.A02
            int r0 = r2.A01
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r3, r1, r0)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r3.getColor(r0)
            r5.setTextColor(r0)
            r0 = 2131099926(0x7f060116, float:1.781222E38)
            int r0 = r3.getColor(r0)
            r5.setBackgroundColor(r0)
            r0 = -2
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r0, r0)
            r0 = 17
            r1.gravity = r0
            r5.setLayoutParams(r1)
            return r5
        L_0x03f0:
            java.lang.Object r1 = r0.A01
            X.6kx r1 = (X.C316006kx) r1
            com.instagram.feed.widget.IgProgressImageView r2 = r1.BGP()
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r1)
            java.lang.Object r0 = r0.A02
            X.6ZO r0 = (X.AnonymousClass6ZO) r0
            X.4mU r0 = r0.A06
            r0.EHd()
            goto L_0x0410
        L_0x0407:
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            r1.invoke(r0)
        L_0x0410:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x0413:
            java.lang.Object r3 = r0.A02
            X.6iR r3 = (X.C314546iR) r3
            com.instagram.common.session.UserSession r2 = r3.A02
            java.lang.Object r1 = r0.A01
            X.6nA r1 = (X.C317376nA) r1
            X.0iw r0 = r3.A01
            X.6kF r5 = new X.6kF
            r5.<init>(r0, r2, r1)
            return r5
        L_0x0425:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            X.1L5 r3 = (X.1L5) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318140376029075(0x81072800041793, double:3.031076442989373E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x043d
            X.4LQ r5 = X.AnonymousClass4LQ.A00
            return r5
        L_0x043d:
            r0 = 4
            X.IXy r5 = new X.IXy
            r5.<init>(r4, r3, r0)
            return r5
        L_0x0444:
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A01
            X.1L5 r1 = (X.1L5) r1
            r0 = 5
            X.IXy r5 = new X.IXy
            r5.<init>(r2, r1, r0)
            return r5
        L_0x0453:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r3 = r0.A01
            X.4DU r3 = (X.AnonymousClass4DU) r3
            X.0Tu r2 = X.0Tu.A06
            r0 = 2342160827467109947(0x208106dd0003163b, double:4.0637359442065146E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x047a
            X.Hl9 r2 = new X.Hl9
            r2.<init>(r4, r3)
            X.2pc r1 = X.C230432pc.STORIES
            X.HnO r0 = new X.HnO
            r0.<init>(r4, r2, r1)
            X.IYW r5 = new X.IYW
            r5.<init>(r0)
            return r5
        L_0x047a:
            X.4LP r5 = new X.4LP
            r5.<init>()
            return r5
        L_0x0480:
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            com.instagram.quicksnap.data.api.QuickSnapApi r2 = new com.instagram.quicksnap.data.api.QuickSnapApi
            r2.<init>(r3)
            java.lang.Object r0 = r0.A01
            X.1ua r0 = (X.1ua) r0
            X.8bx r1 = new X.8bx
            r1.<init>(r3, r0)
            X.8c0 r0 = X.C359088bz.A00(r3)
            com.instagram.quicksnap.data.repository.QuickSnapRepository r5 = new com.instagram.quicksnap.data.repository.QuickSnapRepository
            r5.<init>(r3, r0, r2, r1)
            return r5
        L_0x049c:
            java.lang.Object r9 = r0.A01
            X.80D r9 = (X.AnonymousClass80D) r9
            java.lang.Object r12 = r0.A02
            X.8Fe r12 = (X.C352828Fe) r12
            android.view.ViewGroup r6 = r12.A02
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r7 = r12.A07
            X.0eM r0 = r12.A0D
            java.lang.Object r13 = r0.getValue()
            X.8br r13 = (X.C359028br) r13
            X.81m r11 = r12.A0B
            X.81i r10 = r12.A0A
            X.872 r8 = r12.A08
            X.LSq r5 = new X.LSq
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            return r5
        L_0x04bc:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler r5 = new com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler
            r5.<init>(r1, r0)
            return r5
        L_0x04ca:
            java.lang.Object r3 = r0.A02
            X.19Y r3 = (X.19Y) r3
            X.1AV r2 = r3.A01()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.quickexperiment.impl.QuickExperimentManagerImpl"
            X.0qQ.A0C(r2, r1)
            java.lang.Object r6 = r0.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.String r8 = r6.A06
            android.content.Context r4 = r3.A00
            r10 = 0
            com.facebook.quicklog.LightweightQuickPerformanceLogger r5 = r3.A01
            r11 = 2
            java.lang.String r9 = ""
            X.0qv r1 = X.0qv.A02
            android.content.Context r0 = X.C60960kU.A00
            java.lang.String r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x04f0
            r9 = r0
        L_0x04f0:
            if (r2 == 0) goto L_0x050e
            X.1AU r7 = r2.A01
        L_0x04f4:
            r12 = 0
            r0 = 36317676519429566(0x8106bc000215be, double:3.030783098208043E-306)
            X.0tM r0 = X.AnonymousClass0yP.A00(r0)
            boolean r13 = X.0yU.A07(r0)
            X.1AU r0 = X.19j.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.19Y.A03 = r0
            X.1AV r5 = new X.1AV
            r5.<init>(r4, r6, r0, r8)
            return r5
        L_0x050e:
            r7 = 0
            goto L_0x04f4
        L_0x0510:
            java.lang.Object r13 = r0.A02
            X.6x7 r13 = (X.C323206x7) r13
            X.Dc6 r15 = r13.A0H
            com.instagram.common.session.UserSession r8 = r13.A05
            androidx.fragment.app.FragmentActivity r6 = r13.A01
            X.DcA r12 = r13.A00
            X.6xC r11 = r13.A0C
            com.instagram.profile.fragment.UserDetailFragment r14 = r13.A0E
            java.lang.String r2 = r13.A0Q
            java.lang.String r1 = r13.A0S
            X.6pf r10 = r13.A0A
            X.0wc r7 = r13.A04
            X.4DU r9 = r13.A06
            java.lang.Object r0 = r0.A01
            X.6xK r0 = (X.C323336xK) r0
            X.6xL r5 = new X.6xL
            r16 = r0
            r17 = r2
            r18 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9M1.invoke():java.lang.Object");
    }
}
