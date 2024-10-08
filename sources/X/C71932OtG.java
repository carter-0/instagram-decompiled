package X;

import go.Seq;

/* renamed from: X.OtG  reason: case insensitive filesystem */
public final class C71932OtG implements 1wn {
    public final int A00;
    public final Object A01;

    public C71932OtG(C71153OeR oeR, int i) {
        this.A00 = i;
        switch (i) {
            case 40:
            case Seq.NULL_REFNUM:
                this.A01 = oeR;
                return;
            default:
                this.A01 = oeR;
                return;
        }
    }

    public static C71932OtG A00(Object obj, int i) {
        return new C71932OtG(obj, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v46, resolved type: X.Ner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v47, resolved type: X.Ner} */
    /* JADX WARNING: type inference failed for: r1v213, types: [X.Prw, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x043c, code lost:
        X.AnonymousClass0fD.A0A(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x043f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x066a, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x066d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0b0c, code lost:
        X.AnonymousClass0fD.A0A(r0, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0b0f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0c2e, code lost:
        if (r4 != false) goto L_0x0c1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0d76, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0d7d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:433:0x0fc1, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0fc4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0fdc, code lost:
        X.AnonymousClass0fD.A0A(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0fdf, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r83) {
        /*
            r82 = this;
            r3 = r82
            r1 = r83
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x0f92;
                case 1: goto L_0x0f5e;
                case 2: goto L_0x0f31;
                case 3: goto L_0x0f11;
                case 4: goto L_0x0ef1;
                case 5: goto L_0x0e90;
                case 6: goto L_0x0e62;
                case 7: goto L_0x0dc8;
                case 8: goto L_0x0d5a;
                case 9: goto L_0x0d15;
                case 10: goto L_0x0ce4;
                case 11: goto L_0x0cbc;
                case 12: goto L_0x0c9c;
                case 13: goto L_0x0c7a;
                case 14: goto L_0x0c51;
                case 15: goto L_0x0c31;
                case 16: goto L_0x0bca;
                case 17: goto L_0x0b86;
                case 18: goto L_0x0b40;
                case 19: goto L_0x0b12;
                case 20: goto L_0x09aa;
                case 21: goto L_0x0819;
                case 22: goto L_0x07de;
                case 23: goto L_0x0734;
                case 24: goto L_0x06fc;
                case 25: goto L_0x06d8;
                case 26: goto L_0x06b8;
                case 27: goto L_0x0683;
                case 28: goto L_0x0611;
                case 29: goto L_0x0fc5;
                case 30: goto L_0x05b9;
                case 31: goto L_0x055b;
                case 32: goto L_0x053b;
                case 33: goto L_0x04f2;
                case 34: goto L_0x04bc;
                case 35: goto L_0x0488;
                case 36: goto L_0x0464;
                case 37: goto L_0x0440;
                case 38: goto L_0x03bb;
                case 39: goto L_0x030b;
                case 40: goto L_0x0303;
                case 41: goto L_0x02fb;
                case 42: goto L_0x02b1;
                case 43: goto L_0x0283;
                case 44: goto L_0x0210;
                case 45: goto L_0x00e3;
                case 46: goto L_0x0059;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -1451476054(0xffffffffa97c3baa, float:-5.600699E-14)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Mba r1 = (X.C66729Mba) r1
            r0 = 1810429389(0x6be8f5cd, float:5.632631E26)
            int r8 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.Object r7 = r3.A01
            X.Nhv r7 = (X.C69241Nhv) r7
            com.instagram.common.session.UserSession r0 = r7.A03
            r7.updateExtras(r0)
            X.OO8 r6 = r7.A08
            long r12 = r1.A00
            monitor-enter(r6)
            r6.A01 = r12     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)
            java.lang.String r10 = "seqId="
            java.lang.String r11 = ", delta="
            monitor-enter(r6)
            r2 = 0
            long r0 = r6.A00     // Catch:{ all -> 0x0056 }
            long r4 = r6.A01     // Catch:{ all -> 0x0056 }
            long r0 = r0 - r4
            long r14 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0056 }
            monitor-exit(r6)
            java.lang.String r2 = X.002.A0f(r10, r11, r12, r14)
            X.2Hw r1 = r7.A09
            java.lang.String r0 = "iris_message_sync"
            r7.A0G(r1, r0, r2)
            java.lang.String r0 = "iris_sync"
            r7.maybeEndFlowSuccess(r0)
            r0 = 590731235(0x2335d7e3, float:9.8577455E-18)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = -468528109(0xffffffffe412d413, float:-1.0834025E22)
            goto L_0x0fdc
        L_0x0056:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0059:
            r0 = -1727775981(0xffffffff99043b13, float:-6.83617E-24)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Oss r1 = (X.C71910Oss) r1
            r0 = 1767439138(0x6958fb22, float:1.639462E25)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r6 = r3.A01
            X.NKT r6 = (X.NKT) r6
            X.NL2 r0 = r6.A01
            r5 = 0
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = "loginHistoryAdapter"
            goto L_0x0d76
        L_0x007a:
            r0.A06()
            X.OTt r7 = r1.A00
            X.NKT.A02(r6, r2)
            android.content.Context r3 = r6.getContext()
            if (r3 == 0) goto L_0x00d8
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x00d8
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()
            r2 = 2131965567(0x7f13367f, float:1.9567948E38)
            java.lang.String r1 = r7.A07
            if (r1 != 0) goto L_0x0099
            java.lang.String r1 = ""
        L_0x0099:
            java.lang.String r0 = r7.A05
            if (r0 != 0) goto L_0x009f
            java.lang.String r0 = ""
        L_0x009f:
            java.lang.String r0 = X.DbV.A0u(r3, r1, r0, r2)
            r8.append(r0)
            java.lang.String r0 = "\n\n"
            r8.append(r0)
            r0 = 2131965568(0x7f133680, float:1.956795E38)
            java.lang.String r0 = r3.getString(r0)
            r8.append(r0)
            X.8ab r3 = X.DbS.A0Y(r3)
            r0 = 2131965570(0x7f133682, float:1.9567954E38)
            r3.A09(r0)
            r3.A0q(r8)
            r2 = 2131954977(0x7f130d21, float:1.9546468E38)
            r1 = 30
            X.Of1 r0 = new X.Of1
            r0.<init>(r1, r7, r6)
            r3.A0I(r0, r2)
            r0 = 2131965569(0x7f133681, float:1.9567952E38)
            r3.A0H(r5, r0)
            X.DbT.A1V(r3)
        L_0x00d8:
            r0 = 749091525(0x2ca63ac5, float:4.7245285E-12)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1599724166(0xffffffffa0a6257a, float:-2.8146294E-19)
            goto L_0x0fdc
        L_0x00e3:
            r0 = 1597782342(0x5f3c3946, float:1.3562949E19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.OsT r1 = (X.C71885OsT) r1
            r2 = 1110014784(0x42297b40, float:42.37036)
            int r4 = X.AnonymousClass0fD.A03(r2)
            r7 = 0
            X.0qQ.A0B(r1, r7)
            boolean r2 = r1 instanceof X.C69045Ndh
            if (r2 == 0) goto L_0x0126
            java.lang.Object r2 = r3.A01
            X.NeT r2 = (X.NeT) r2
            X.Ocu r5 = r2.A04
            X.POH r2 = X.POH.A00
            r5.A05(r2)
            X.Ndh r1 = (X.C69045Ndh) r1
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r3 = r1.A00
            java.lang.String r2 = r1.A01
            X.PP3 r1 = new X.PP3
            r1.<init>(r3, r2)
            r5.A03(r1)
        L_0x0114:
            X.PNs r3 = X.C72882PNs.A00
        L_0x0116:
            X.Ps0 r3 = (X.C74272Ps0) r3
        L_0x0118:
            r5.A05(r3)
        L_0x011b:
            r1 = -749582552(0xffffffffd3524728, float:-9.0313694E11)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 406464864(0x183a2960, float:2.4060826E-24)
            goto L_0x0fc1
        L_0x0126:
            boolean r2 = r1 instanceof X.C69043Ndf
            if (r2 == 0) goto L_0x014c
            java.lang.Object r5 = r3.A01
            X.NeT r5 = (X.NeT) r5
            X.Ocu r3 = r5.A04
            X.PNs r2 = X.C72882PNs.A00
            r3.A05(r2)
            X.14C r2 = X.AnonymousClass14B.A03
            X.14B r2 = r2.A00()
            android.app.Activity r3 = r5.A00
            android.content.Intent r2 = r2.A01(r3)
            X.Ndf r1 = (X.C69043Ndf) r1
            android.net.Uri r1 = r1.A00
            r2.setData(r1)
            X.0kR.A0B(r3, r2)
            goto L_0x011b
        L_0x014c:
            boolean r2 = r1 instanceof X.C69044Ndg
            if (r2 == 0) goto L_0x01ae
            java.lang.Object r2 = r3.A01
            X.NeT r2 = (X.NeT) r2
            X.Ocu r5 = r2.A04
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.PM1 r8 = r2.A05
            X.Ndg r1 = (X.C69044Ndg) r1
            java.lang.String r3 = r1.A00
            X.0qQ.A0B(r3, r7)
            android.content.Context r1 = r8.A00
            androidx.fragment.app.FragmentContainerView r7 = new androidx.fragment.app.FragmentContainerView
            r7.<init>(r1)
            int r1 = android.view.View.generateViewId()
            r7.setId(r1)
            android.content.Context r2 = r7.getContext()
            r1 = 2130970211(0x7f040663, float:1.7549126E38)
            int r1 = X.2Yu.A0H(r2, r1)
            X.DbT.A16(r2, r7, r1)
            r1 = -1
            X.C51968G9o.A1D(r7, r1)
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            X.DiU r2 = X.C46649DiU.A04(r3, r1)
            com.instagram.common.session.UserSession r1 = r8.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = X.DbS.A0N(r1)
            X.Di2 r3 = X.C49891FBs.A01(r1, r2)
            X.0hq r1 = r8.A01
            X.0s1 r2 = new X.0s1
            r2.<init>(r1)
            int r1 = r7.getId()
            r2.A09(r3, r1)
            r2.A00()
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1
            X.PNb r3 = new X.PNb
            r3.<init>(r7, r6, r2, r1)
            goto L_0x0118
        L_0x01ae:
            X.Ndi r2 = X.C69046Ndi.A00
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c0
            java.lang.Object r1 = r3.A01
            X.NeT r1 = (X.NeT) r1
            X.Ocu r5 = r1.A04
            X.PNk r3 = X.C72874PNk.A00
            goto L_0x0116
        L_0x01c0:
            boolean r2 = r1 instanceof X.C69048Ndk
            if (r2 == 0) goto L_0x01dd
            java.lang.Object r2 = r3.A01
            X.NeT r2 = (X.NeT) r2
            X.Ocu r5 = r2.A04
            X.PO4 r1 = X.PO4.A00
            r5.A05(r1)
            X.OKY r3 = r2.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.PKk r1 = new X.PKk
            r1.<init>(r2)
        L_0x01d8:
            r3.A00(r1)
            goto L_0x0114
        L_0x01dd:
            boolean r2 = r1 instanceof X.C69049Ndl
            if (r2 == 0) goto L_0x01f4
            java.lang.Object r2 = r3.A01
            X.NeT r2 = (X.NeT) r2
            X.Ocu r5 = r2.A04
            X.PPG r1 = new X.PPG
            r1.<init>()
            r5.A03(r1)
            X.OKY r3 = r2.A03
            X.PKQ r1 = X.PKQ.A00
            goto L_0x01d8
        L_0x01f4:
            boolean r1 = r1 instanceof X.C69047Ndj
            if (r1 == 0) goto L_0x0207
            java.lang.Object r1 = r3.A01
            X.NeT r1 = (X.NeT) r1
            X.Ocu r5 = r1.A04
            X.PNs r1 = X.C72882PNs.A00
            r5.A05(r1)
            X.POC r3 = X.POC.A00
            goto L_0x0116
        L_0x0207:
            X.Wub r2 = X.AnonymousClass7TE.A1K()
            r0 = -1100627941(0xffffffffbe65c01b, float:-0.22436564)
            goto L_0x043c
        L_0x0210:
            r0 = 93784766(0x5970abe, float:1.4203918E-35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.8c9 r1 = (X.C359188c9) r1
            r2 = -1511926806(0xffffffffa5e1d3ea, float:-3.9174877E-16)
            int r6 = X.AnonymousClass0fD.A03(r2)
            r7 = 0
            X.0qQ.A0B(r1, r7)
            java.lang.Integer r2 = r1.A01
            int r2 = r2.intValue()
            if (r2 == r7) goto L_0x0270
            r4 = 1
            if (r2 == r4) goto L_0x0244
            r1 = 3
            if (r2 != r1) goto L_0x0239
            java.lang.Object r1 = r3.A01
            X.Ner r1 = (X.C69112Ner) r1
            X.C69112Ner.A02(r1)
        L_0x0239:
            r1 = 1692396697(0x64dfec99, float:3.304538E22)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 809139934(0x303a7ede, float:6.7846695E-10)
            goto L_0x0fc1
        L_0x0244:
            java.lang.String r2 = r1.A03
            if (r2 == 0) goto L_0x0239
            java.lang.Object r5 = r3.A01
            X.Ner r5 = (X.C69112Ner) r5
            X.N9P r1 = r5.A03
            com.instagram.camera.effect.models.CameraAREffect r1 = r1.A05
            if (r1 == 0) goto L_0x0269
            java.util.HashMap r1 = r1.A0F()
            java.lang.Object r1 = r1.get(r2)
            X.7ui r1 = (X.C346167ui) r1
            if (r1 == 0) goto L_0x0269
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x0269
            r1 = 0
            X.N9b r3 = new X.N9b
            r3.<init>(r1, r2, r4, r7)
            goto L_0x027f
        L_0x0269:
            r1 = 0
            X.N9b r3 = new X.N9b
            r3.<init>(r1, r1, r7, r7)
            goto L_0x027f
        L_0x0270:
            java.lang.String r4 = r1.A02
            if (r4 == 0) goto L_0x0239
            java.lang.Object r5 = r3.A01
            X.OdY r5 = (X.C71135OdY) r5
            r2 = 0
            r1 = 1
            X.N9b r3 = new X.N9b
            r3.<init>(r2, r4, r1, r1)
        L_0x027f:
            r5.A0J(r3)
            goto L_0x0239
        L_0x0283:
            r0 = 283862562(0x10eb6622, float:9.2848517E-29)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Osl r1 = (X.C71903Osl) r1
            r0 = -1819116522(0xffffffff93927c16, float:-3.697794E-27)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.Object r0 = r3.A01
            X.NJv r0 = (X.C68478NJv) r0
            X.36N r3 = X.C68478NJv.A03(r0)
            boolean r2 = r1.A00
            X.6oS r1 = X.C318116oQ.A00(r3)
            r0 = 43
            X.Dba.A1S(r3, r1, r0, r2)
            r0 = -1555345248(0xffffffffa34b50a0, float:-1.1021725E-17)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1140535780(0xffffffffbc04ce1c, float:-0.008105781)
            goto L_0x0fdc
        L_0x02b1:
            r0 = 1040671866(0x3e07647a, float:0.13221923)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kd r1 = (X.2Kd) r1
            r2 = 891173721(0x351e3b59, float:5.894595E-7)
            int r6 = X.AnonymousClass0fD.A03(r2)
            X.3t3 r5 = r1.A00
            boolean r1 = r5 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            if (r1 == 0) goto L_0x02d8
            com.instagram.model.direct.threadkey.impl.MsysThreadId r4 = X.C300965yF.A03(r5)
            java.lang.Object r1 = r3.A01
            X.OeR r1 = (X.C71153OeR) r1
            java.util.HashMap r2 = r1.A0u
            X.PwB r1 = X.C71153OeR.A01(r1, r4)
            r2.remove(r1)
        L_0x02d8:
            X.3sy r4 = X.C300965yF.A05(r5)
            java.lang.Object r2 = r3.A01
            X.OeR r2 = (X.C71153OeR) r2
            java.util.HashSet r1 = r2.A0v
            boolean r1 = r1.remove(r4)
            if (r1 == 0) goto L_0x02ed
            X.OMH r1 = r2.A0r
            r1.A01()
        L_0x02ed:
            X.C71153OeR.A0J(r2)
            r1 = -201586844(0xfffffffff3fc0764, float:-3.9935568E31)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -148980606(0xfffffffff71ebc82, float:-3.2195558E33)
            goto L_0x0fc1
        L_0x02fb:
            java.lang.Object r0 = r3.A01
            X.OeR r0 = (X.C71153OeR) r0
            X.C71153OeR.A0K(r0)
            return
        L_0x0303:
            java.lang.Object r0 = r3.A01
            X.OeR r0 = (X.C71153OeR) r0
            X.C71153OeR.A0J(r0)
            return
        L_0x030b:
            r0 = -1620863791(0xffffffff9f6394d1, float:-4.8192218E-20)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r1 = (X.2Kb) r1
            r0 = -2037655313(0xffffffff868bd8ef, float:-5.2604744E-35)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.lang.Object r7 = r3.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController r7 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r7
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            if (r2 != r0) goto L_0x03a9
            com.instagram.model.direct.DirectThreadKey r2 = r1.A00
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x03a9
            X.2Ep r3 = r7.A0n
            if (r3 == 0) goto L_0x03a9
            java.lang.String r0 = r3.C6C()
            if (r0 == 0) goto L_0x03a9
            X.OCM r0 = r7.A0J
            if (r0 == 0) goto L_0x03a9
            X.OW6 r0 = r7.A0G
            if (r0 == 0) goto L_0x03a9
            java.lang.String r2 = r2.A00
            java.lang.String r0 = r3.C6C()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x03a9
            java.util.List r3 = r1.A04
            if (r3 == 0) goto L_0x03a9
            java.lang.String r2 = "Required value was null."
            int r1 = r3.size()
            r0 = 1
            if (r1 != r0) goto L_0x03a9
            X.OW6 r1 = r7.A0G
            if (r1 == 0) goto L_0x03a9
            int r0 = r1.A00
            X.N3h r6 = r1.A01(r0)
            if (r6 == 0) goto L_0x03a9
            java.lang.String r1 = r6.A0K
            if (r1 == 0) goto L_0x03a9
            java.lang.Object r9 = r3.get(r8)
            X.3su r9 = (X.C254703su) r9
            java.lang.String r0 = r9.A0g()
            if (r0 == 0) goto L_0x03a9
            java.lang.String r0 = r9.A0g()
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 == 0) goto L_0x03a9
            X.OCM r0 = r7.A0J
            if (r0 == 0) goto L_0x03b6
            com.instagram.common.session.UserSession r2 = r7.A0m
            androidx.fragment.app.FragmentActivity r3 = r7.A0e
            java.lang.String r0 = r6.A0I
            X.76m r1 = new X.76m
            r1.<init>(r2, r9, r0)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r6.A00
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r3)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r1 = r1.A04(r0, r8)
            boolean r0 = X.C51966G9m.A1a(r2, r1)
            if (r0 == 0) goto L_0x03a1
            r6.A00 = r1
        L_0x03a1:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0H(r7)
            if (r0 == 0) goto L_0x03a9
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0E(r7)
        L_0x03a9:
            r0 = -1842855479(0xffffffff922841c9, float:-5.309254E-28)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 877443948(0x344cbb6c, float:1.9067164E-7)
            X.AnonymousClass0fD.A0A(r0, r4)
            return
        L_0x03b6:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r2)
            throw r2
        L_0x03bb:
            r0 = 693841619(0x295b2ed3, float:4.8668382E-14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.2Ke r1 = (X.2Ke) r1
            r0 = -1593577075(0xffffffffa103f18d, float:-4.4704216E-19)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r3 = r3.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController r3 = (com.instagram.direct.visual.DirectVisualMessageViewerController) r3
            X.3sy r0 = r3.A0x
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A03(r0)
            com.instagram.model.direct.DirectThreadKey r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x0428
            X.OW6 r9 = r3.A0G
            if (r9 == 0) goto L_0x040d
            androidx.fragment.app.FragmentActivity r8 = r3.A0e
            com.instagram.common.session.UserSession r7 = r3.A0m
            X.2Ep r2 = r3.A0n
            if (r2 == 0) goto L_0x0435
            java.util.List r0 = r1.A01
            java.util.ArrayList r7 = X.C271384il.A04(r8, r7, r2, r0)
            int r2 = r9.A01
            java.util.List r1 = r9.A03
            int r0 = r1.size()
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x040d
            int r0 = r7.size()
            int r0 = java.lang.Math.min(r2, r0)
            java.util.List r0 = r7.subList(r6, r0)
            r1.addAll(r0)
        L_0x040d:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0A(r3)
            X.OCJ r2 = r3.A0I
            if (r2 == 0) goto L_0x0423
            com.instagram.direct.visual.DirectVisualMessageViewerController r1 = r2.A00
            androidx.fragment.app.FragmentActivity r0 = r1.A0e
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0423
            boolean r0 = r2.A01
            com.instagram.direct.visual.DirectVisualMessageViewerController.A0O(r1, r0)
        L_0x0423:
            r0 = 0
            r3.A0I = r0
            r3.A0T = r6
        L_0x0428:
            r0 = -1628586805(0xffffffff9eedbccb, float:-2.5171434E-20)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -500386452(0xffffffffe22cb56c, float:-7.964782E20)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0435:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = -313150937(0xffffffffed55b227, float:-4.13348E27)
        L_0x043c:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r2
        L_0x0440:
            r0 = 1439765136(0x55d11290, float:2.87347069E13)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 482395568(0x1cc0c5b0, float:1.2756595E-21)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r3.A01
            X.OZR r1 = (X.OZR) r1
            java.util.List r0 = r1.A01
            if (r0 == 0) goto L_0x0459
            r1.A02(r0)
        L_0x0459:
            r0 = 1980765453(0x7610150d, float:7.305837E32)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -82199598(0xfffffffffb19bbd2, float:-7.982309E35)
            goto L_0x066a
        L_0x0464:
            r0 = -1259213832(0xffffffffb4f1ebf8, float:-4.5061438E-7)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Osh r1 = (X.C71899Osh) r1
            r0 = 1022209168(0x3cedac90, float:0.029012948)
            int r4 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.Object r2 = r3.A01
            X.PuZ r2 = (X.C74419PuZ) r2
            X.N4G r0 = r1.A00
            r2.DVU(r0)
            r0 = -258056742(0xfffffffff09e5dda, float:-3.9209673E29)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -578283840(0xffffffffdd8816c0, float:-1.22577954E18)
            goto L_0x0fdc
        L_0x0488:
            r0 = 14544655(0xddef0f, float:2.0381403E-38)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r1 = (X.2Kb) r1
            r0 = -1315225550(0xffffffffb19b4032, float:-4.518392E-9)
            int r6 = X.AnonymousClass0fD.A03(r0)
            if (r1 == 0) goto L_0x04b1
            java.lang.Object r5 = r3.A01
            X.Oyg r5 = (X.C72215Oyg) r5
            X.1NW r4 = r5.A00
            if (r4 != 0) goto L_0x04a6
            java.lang.String r0 = "handler"
            goto L_0x0d76
        L_0x04a6:
            r3 = 33735910(0x202c4e6, float:9.607399E-38)
            X.PZK r0 = new X.PZK
            r0.<init>(r5, r1)
            r4.A01(r3, r0)
        L_0x04b1:
            r0 = 259578299(0xf78d9bb, float:1.22692774E-29)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 17763601(0x10f0d11, float:2.6274327E-38)
            goto L_0x066a
        L_0x04bc:
            r0 = 285947148(0x110b350c, float:1.0981513E-28)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = -230564451(0xfffffffff241dd9d, float:-3.8399053E30)
            int r4 = X.AnonymousClass0fD.A03(r0)
            X.08y r0 = X.09i.A0A
            java.lang.Object r3 = r3.A01
            com.instagram.direct.stella.StellaDirectMessagingService r3 = (com.instagram.direct.stella.StellaDirectMessagingService) r3
            X.0wW r1 = r0.A05(r3)
            boolean r0 = r1 instanceof com.instagram.common.session.UserSession
            if (r0 == 0) goto L_0x04e7
            com.instagram.direct.stella.api.ISendDirectMessageCallback r0 = r3.A00
            if (r0 == 0) goto L_0x04e7
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.Oy8 r1 = X.O06.A00(r1)
            com.instagram.direct.stella.api.ISendDirectMessageCallback r0 = r3.A00
            r1.A00(r0)
        L_0x04e7:
            r0 = 2067629504(0x7b3d85c0, float:9.840569E35)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -537159370(0xffffffffdffb9936, float:-3.6259162E19)
            goto L_0x066a
        L_0x04f2:
            r0 = 204790623(0xc34db5f, float:1.393271E-31)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r1 = (X.2Kb) r1
            r0 = 1499138600(0x595b0a28, float:3.85338668E15)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 1
            if (r1 == 0) goto L_0x0530
            java.lang.Integer r1 = r1.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == r4) goto L_0x051f
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = r1.equals(r0)
            if (r0 == r4) goto L_0x051f
            java.lang.Integer r0 = X.AnonymousClass05K.A0F
            boolean r0 = r1.equals(r0)
            if (r0 != r4) goto L_0x0530
        L_0x051f:
            X.OVo r4 = X.C70993OVo.A00
            java.lang.Object r3 = r3.A01
            X.Oy1 r3 = (X.Oy1) r3
            android.content.Context r0 = r3.A00
            android.content.Context r1 = X.DbT.A05(r0)
            com.instagram.common.session.UserSession r0 = r3.A02
            r4.A00(r1, r0)
        L_0x0530:
            r0 = -1431837729(0xffffffffaaa7e3df, float:-2.9823277E-13)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -617852364(0xffffffffdb2c5234, float:-4.8504079E16)
            goto L_0x066a
        L_0x053b:
            r0 = 115457833(0x6e1bf29, float:8.491648E-35)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -593769418(0xffffffffdc9bcc36, float:-3.5082523E17)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.OyQ r0 = (X.C72201OyQ) r0
            X.C72201OyQ.A00(r0)
            r0 = -953398179(0xffffffffc72c4c5d, float:-44108.363)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 2074494571(0x7ba6466b, float:1.726699E36)
            goto L_0x0fdc
        L_0x055b:
            r0 = 1286471049(0x4cadfd89, float:9.1221064E7)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Osg r1 = (X.C71898Osg) r1
            r0 = 1706656620(0x65b9836c, float:1.0950776E23)
            int r8 = X.AnonymousClass0fD.A03(r0)
            if (r1 == 0) goto L_0x05ae
            java.lang.Object r0 = r3.A01
            X.NKp r0 = (X.C68496NKp) r0
            X.0eM r0 = r0.A0K
            java.lang.Object r0 = r0.getValue()
            X.Mtw r0 = (X.C67743Mtw) r0
            java.lang.String r9 = r1.A00
            com.instagram.direct.prompts.dailyprompts.repository.DirectDailyPromptsResponseListRepository r7 = r0.A03
            java.lang.String r6 = "daily_prompt"
            X.05G r5 = r7.A03
            java.util.ArrayList r0 = X.C66583MXo.A0k(r5)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x058d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x05ab
            java.lang.Object r1 = r3.next()
            X.N3F r1 = (X.N3F) r1
            java.lang.String r0 = r1.A05
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x05a7
            com.instagram.common.session.UserSession r0 = r7.A00
            X.N3F r1 = X.C71127OdQ.A01(r0, r1, r6)
        L_0x05a7:
            r4.add(r1)
            goto L_0x058d
        L_0x05ab:
            r5.Epw(r4)
        L_0x05ae:
            r0 = 1907351922(0x71afe172, float:1.7418375E30)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 1139828463(0x43f066ef, float:480.80417)
            goto L_0x066a
        L_0x05b9:
            r0 = -797358571(0xffffffffd0794615, float:-1.67284787E10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.7P2 r1 = (X.AnonymousClass7P2) r1
            r2 = -1821539960(0xffffffff936d8188, float:-2.997747E-27)
            int r4 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r5 = r3.A01
            X.NJL r5 = (X.NJL) r5
            r5.A0E = r6
            java.lang.String r3 = r1.A01
            X.0eM r2 = r5.A0O
            java.lang.Object r2 = r2.getValue()
            X.Mu0 r2 = (X.C67747Mu0) r2
            java.lang.String r2 = r2.A04
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0601
            boolean r1 = r1.A03
            if (r1 == 0) goto L_0x0601
            android.content.Context r2 = r5.getContext()
            r1 = 2131958881(0x7f131c61, float:1.9554387E38)
            X.C59689JTv.A07(r2, r1)
            X.DbX.A1I(r5)
        L_0x05f6:
            r1 = 275047542(0x1064e476, float:4.514107E-29)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 534172569(0x1fd6d399, float:9.0982584E-20)
            goto L_0x0fc1
        L_0x0601:
            android.content.Context r3 = r5.getContext()
            r2 = 2131963032(0x7f132c98, float:1.9562806E38)
            java.lang.String r1 = "daily_prompt_response_add_failed"
            X.C59689JTv.A01(r3, r1, r2, r6)
            X.Dbb.A0v(r5)
            goto L_0x05f6
        L_0x0611:
            r0 = 1416769659(0x5472307b, float:4.16078181E12)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r0 = 501284445(0x1de0fe5d, float:5.955531E-21)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r5 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r5
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x0661
            java.lang.String r0 = r5.A0C
            if (r0 == 0) goto L_0x0661
            com.instagram.model.direct.DirectShareTarget r0 = r5.A0A
            if (r0 == 0) goto L_0x0661
            X.OJj r3 = r5.A0N
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            X.0eM r0 = r5.A0Q
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r10 = r5.A0C
            java.lang.String r0 = "Required value was null."
            if (r10 == 0) goto L_0x0678
            X.7BY r8 = r5.A08
            X.OyY r7 = r5.A06
            com.instagram.model.direct.DirectShareTarget r9 = r5.A0A
            if (r9 == 0) goto L_0x0670
            X.OsH r0 = r5.A02()
            r11 = 1
            if (r0 == 0) goto L_0x066e
            java.lang.String r0 = r0.A03()
            if (r0 == 0) goto L_0x066e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x066e
        L_0x065e:
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x0661:
            r0 = -1277827798(0xffffffffb3d5e52a, float:-9.96027E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -387679719(0xffffffffe8e47a19, float:-8.631615E24)
        L_0x066a:
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x066e:
            r11 = 0
            goto L_0x065e
        L_0x0670:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = -588762761(0xffffffffdce83177, float:-5.22852654E17)
            goto L_0x067f
        L_0x0678:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1158030818(0xffffffffbaf9da1e, float:-0.0019062196)
        L_0x067f:
            X.AnonymousClass0fD.A0A(r0, r1)
            throw r2
        L_0x0683:
            r0 = 545251105(0x207fdf21, float:2.1673167E-19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1032221623(0xffffffffc2798c49, float:-62.386997)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r5 = r3.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment r5 = (com.instagram.direct.inbox.fragment.DirectSearchInboxEditHistoryFragment) r5
            android.app.Activity r4 = r5.A00
            if (r4 == 0) goto L_0x06ad
            java.lang.String r10 = r5.A05
            if (r10 == 0) goto L_0x06ad
            com.instagram.model.direct.DirectShareTarget r9 = r5.A04
            if (r9 == 0) goto L_0x06ad
            X.OJj r3 = r5.A0F
            com.instagram.common.session.UserSession r6 = r5.A01
            X.7BY r8 = r5.A03
            X.OyY r7 = r5.A02
            r11 = 1
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x06ad:
            r1 = -904810309(0xffffffffca11b0bb, float:-2386990.8)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -1851230531(0xffffffff91a876bd, float:-2.6578905E-28)
            goto L_0x0fc1
        L_0x06b8:
            r0 = 909909152(0x363c1ca0, float:2.8030845E-6)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1540220389(0xffffffffa4321a1b, float:-3.861971E-17)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.MeY r0 = (X.MeY) r0
            X.MeY.A01(r0)
            r0 = -1834331520(0xffffffff92aa5280, float:-1.0748846E-27)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -416150026(0xffffffffe7320df6, float:-8.408388E23)
            goto L_0x0fdc
        L_0x06d8:
            r0 = 1769109065(0x69727649, float:1.8319915E25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -1025280317(0xffffffffc2e376c3, float:-113.73196)
            int r2 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r3.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.DdD r1 = r1.A01
            if (r1 == 0) goto L_0x06f1
            r1.A00()
        L_0x06f1:
            r1 = 1063190906(0x3f5f017a, float:0.8711163)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = 2061027634(0x7ad8c932, float:5.6280842E35)
            goto L_0x0fc1
        L_0x06fc:
            r0 = -9329159(0xffffffffff71a5f9, float:-3.2120573E38)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kd r1 = (X.2Kd) r1
            r2 = -845394665(0xffffffffcd9c4d17, float:-3.27787232E8)
            int r4 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r3 = r3.A01
            X.Mfy r3 = (X.C66965Mfy) r3
            X.N4P r2 = r3.A00
            if (r2 == 0) goto L_0x0729
            X.3t3 r2 = r2.A0L
            X.3t3 r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0729
            X.PvQ r2 = r3.A03
            boolean r1 = r2.isResumed()
            if (r1 == 0) goto L_0x0729
            r2.Cfo()
        L_0x0729:
            r1 = -1395316335(0xffffffffacd52991, float:-6.058439E-12)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -210051693(0xfffffffff37add93, float:-1.9875615E31)
            goto L_0x0fc1
        L_0x0734:
            r0 = 1940144233(0x73a44069, float:2.6026705E31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Osj r1 = (X.C71901Osj) r1
            r2 = 1501884264(0x5984ef68, float:4.6772409E15)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r3 = r3.A01
            X.P30 r3 = (X.P30) r3
            X.7Zg r6 = r3.A01
            X.7S7 r8 = r6.C6l()
            X.3t3 r2 = r8.CBU()
            if (r2 == 0) goto L_0x078b
            X.3t0 r2 = X.C300965yF.A02(r2)
            if (r2 == 0) goto L_0x078b
            java.lang.String r11 = r2.A00
            if (r11 == 0) goto L_0x078b
            X.KWs r10 = r3.A02
            boolean r14 = r1.A00
            X.0qQ.A0B(r11, r4)
            X.4Cq r1 = r10.A01
            r12 = 0
            r13 = 6
            X.MEW r9 = new X.MEW
            r9.<init>(r10, r11, r12, r13, r14)
            X.AnonymousClass7TE.A1Z(r9, r1)
            X.7ZY r6 = r6.BSN()
            int r1 = r6.getItemCount()
            java.util.ArrayList r7 = r6.Bk1(r1)
            if (r14 == 0) goto L_0x0796
            X.7SD r2 = X.C66580MXl.A0Z(r8)
            r1 = 1
            r3.FHw(r2, r7, r1, r4)
        L_0x078b:
            r1 = 1308005793(0x4df695a1, float:5.17125152E8)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1235882361(0xffffffffb655ee87, float:-3.1878315E-6)
            goto L_0x0fc1
        L_0x0796:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x079e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x07bc
            java.lang.Object r7 = r8.next()
            r1 = r7
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            com.instagram.common.session.UserSession r2 = r3.A00
            X.3su r1 = r1.A0e
            X.0qQ.A07(r1)
            boolean r1 = X.C66839MdX.A00(r2, r1)
            if (r1 == 0) goto L_0x079e
            r9.add(r7)
            goto L_0x079e
        L_0x07bc:
            java.util.Iterator r3 = r9.iterator()
        L_0x07c0:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x078b
            java.lang.Object r1 = r3.next()
            X.7LQ r1 = (X.AnonymousClass7LQ) r1
            X.3su r1 = r1.A0e
            r1.A1H(r12)
            r1.A1G(r12)
            java.lang.String r2 = r1.A0h()
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r6.EdR(r1, r2, r4)
            goto L_0x07c0
        L_0x07de:
            r0 = 32122393(0x1ea2619, float:8.601269E-38)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.2Kd r1 = (X.2Kd) r1
            r0 = 2132928203(0x7f21e6cb, float:2.1520405E38)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r3 = r3.A01
            X.NJm r3 = (X.NJm) r3
            X.N4P r0 = r3.A04
            r2 = 0
            if (r0 == 0) goto L_0x0817
            X.3t3 r0 = r0.A0L
        L_0x07f9:
            if (r1 == 0) goto L_0x07fd
            X.3t3 r2 = r1.A00
        L_0x07fd:
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 == 0) goto L_0x080c
            boolean r0 = r3.isResumed()
            if (r0 == 0) goto L_0x080c
            X.DbX.A1I(r3)
        L_0x080c:
            r0 = -1231960037(0xffffffffb691c81b, float:-4.344632E-6)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1557141446(0xffffffffa32fe83a, float:-9.535945E-18)
            goto L_0x0b0c
        L_0x0817:
            r0 = r2
            goto L_0x07f9
        L_0x0819:
            r0 = 77592701(0x49ff87d, float:3.760892E-36)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.Osu r1 = (X.C71912Osu) r1
            r0 = 772392871(0x2e09c7a7, float:3.132752E-11)
            int r13 = X.AnonymousClass0fD.A03(r0)
            r12 = 0
            X.0qQ.A0B(r1, r12)
            java.lang.Object r11 = r3.A01
            X.NKR r11 = (X.NKR) r11
            X.N4P r0 = r11.A03
            if (r0 == 0) goto L_0x0839
            java.util.Map r10 = r0.A0V
            if (r10 != 0) goto L_0x083d
        L_0x0839:
            java.util.LinkedHashMap r10 = X.AnonymousClass7TE.A1H()
        L_0x083d:
            com.instagram.user.model.User r4 = r1.A00
            java.lang.String r0 = r4.getId()
            java.lang.Object r0 = r10.get(r0)
            java.lang.String r3 = r1.A01
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x085a
            r0 = -2098922872(0xffffffff82e4fa88, float:-3.3645387E-37)
        L_0x0852:
            X.AnonymousClass0fD.A0A(r0, r13)
            r0 = 308968080(0x126a7a90, float:7.398845E-28)
            goto L_0x0b0c
        L_0x085a:
            int r0 = r3.length()
            boolean r2 = X.AnonymousClass7TF.A1Q(r0)
            r0 = 0
            java.lang.String r1 = r4.getId()
            if (r2 == 0) goto L_0x099e
            r10.remove(r1)
            X.N4P r1 = r11.A03
            if (r1 == 0) goto L_0x0873
            r1.A0A(r4, r0)
        L_0x0873:
            X.N4P r14 = r11.A03
            if (r14 == 0) goto L_0x098f
            X.3t3 r9 = r14.A0L
            java.lang.String r0 = r14.A0Q
            r28 = r0
            int r0 = r14.A0A
            r40 = r0
            int r0 = r14.A08
            r41 = r0
            java.lang.String r0 = r14.A0P
            r29 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r14.A0C
            r80 = r0
            java.lang.String r0 = r14.A0N
            r30 = r0
            boolean r0 = r14.A12
            r51 = r0
            boolean r0 = r14.A10
            r52 = r0
            boolean r0 = r14.A0w
            r53 = r0
            int r0 = r14.A04
            r42 = r0
            int r0 = r14.A0B
            r43 = r0
            boolean r0 = r14.A0v
            r54 = r0
            boolean r0 = r14.A0o
            r55 = r0
            boolean r0 = r14.A0q
            r56 = r0
            boolean r0 = r14.A0n
            r57 = r0
            boolean r0 = r14.A0u
            r58 = r0
            boolean r0 = r14.A0z
            r59 = r0
            boolean r0 = r14.A0i
            r60 = r0
            boolean r0 = r14.A0k
            r61 = r0
            boolean r0 = r14.A13
            r62 = r0
            boolean r0 = r14.A0s
            r63 = r0
            boolean r0 = r14.A0r
            r64 = r0
            boolean r0 = r14.A0e
            r65 = r0
            boolean r0 = r14.A0d
            r66 = r0
            boolean r0 = r14.A0y
            r67 = r0
            java.util.Map r0 = r14.A0X
            r36 = r0
            com.instagram.direct.model.messaginguser.MessagingUser r8 = r14.A0F
            java.util.List r7 = r14.A0T
            java.util.List r6 = r14.A00
            java.util.List r5 = r14.A0S
            X.N3u r4 = r14.A0J
            java.util.List r0 = r14.A0R
            r35 = r0
            boolean r0 = r14.A0j
            r68 = r0
            java.lang.String r0 = r14.A0O
            r31 = r0
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r14.A0G
            r79 = r0
            boolean r0 = r14.A0l
            r69 = r0
            boolean r0 = r14.A0p
            r70 = r0
            boolean r0 = r14.A0g
            r71 = r0
            boolean r0 = r14.A0x
            r72 = r0
            boolean r0 = r14.A0m
            r73 = r0
            X.3t3 r0 = r14.A0K
            r26 = r0
            int r0 = r14.A09
            r44 = r0
            X.3Te r0 = r14.A0E
            r78 = r0
            int r0 = r14.A07
            r45 = r0
            int r0 = r14.A06
            r46 = r0
            X.7Cl r3 = r14.A0I
            X.4li r2 = r14.A0H
            boolean r0 = r14.A11
            r74 = r0
            java.lang.Long r0 = r14.A0M
            r27 = r0
            boolean r0 = r14.A0h
            r23 = r0
            int r0 = r14.A01
            r22 = r0
            java.util.Map r1 = r14.A0U
            boolean r0 = r14.A0f
            r21 = r0
            boolean r0 = r14.A0t
            r20 = r0
            X.3Tu r0 = r14.A0D
            r19 = r0
            int r0 = r14.A02
            r18 = r0
            int r0 = r14.A03
            r17 = r0
            int r0 = r14.A05
            r16 = r0
            java.util.Map r14 = r14.A0W
            X.0qQ.A0B(r9, r12)
            X.C66583MXo.A1N(r8, r7, r6, r5, r4)
            X.C66584MXp.A15(r3, r2, r1)
            X.N4P r0 = new X.N4P
            r24 = r4
            r25 = r9
            r32 = r7
            r33 = r6
            r34 = r5
            r37 = r1
            r38 = r10
            r39 = r14
            r47 = r22
            r48 = r18
            r49 = r17
            r50 = r16
            r75 = r23
            r76 = r21
            r77 = r20
            r16 = r0
            r17 = r80
            r18 = r19
            r19 = r78
            r20 = r8
            r21 = r79
            r22 = r2
            r23 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
        L_0x098f:
            r11.A03 = r0
            X.PVS r0 = new X.PVS
            r0.<init>(r11)
            X.11Z.A02(r0)
            r0 = -818064096(0xffffffffcf3d5520, float:-3.17647258E9)
            goto L_0x0852
        L_0x099e:
            r10.put(r1, r3)
            X.N4P r1 = r11.A03
            if (r1 == 0) goto L_0x0873
            r1.A0A(r4, r3)
            goto L_0x0873
        L_0x09aa:
            r0 = 126208287(0x785c91f, float:2.0129824E-34)
            int r15 = X.AnonymousClass0fD.A03(r0)
            X.Oso r1 = (X.C71906Oso) r1
            r0 = 1189327075(0x46e3b0e3, float:29144.443)
            int r14 = X.AnonymousClass0fD.A03(r0)
            r13 = 0
            X.0qQ.A0B(r1, r13)
            java.lang.Object r12 = r3.A01
            X.NKR r12 = (X.NKR) r12
            X.N4P r0 = r12.A03
            if (r0 == 0) goto L_0x09ca
            java.util.Map r11 = r0.A0W
            if (r11 != 0) goto L_0x09ce
        L_0x09ca:
            java.util.LinkedHashMap r11 = X.AnonymousClass7TE.A1H()
        L_0x09ce:
            X.0eE r2 = X.AnonymousClass0t1.A01
            X.0eM r0 = r12.A09
            com.instagram.user.model.User r0 = X.DbX.A0l(r2, r0)
            java.lang.String r2 = r0.getId()
            java.lang.String r0 = r1.A00
            r11.put(r2, r0)
            X.N4P r10 = r12.A03
            if (r10 == 0) goto L_0x0b10
            X.3t3 r9 = r10.A0L
            java.lang.String r0 = r10.A0Q
            r28 = r0
            int r0 = r10.A0A
            r40 = r0
            int r0 = r10.A08
            r41 = r0
            java.lang.String r0 = r10.A0P
            r29 = r0
            com.instagram.common.typedurl.ImageUrl r0 = r10.A0C
            r81 = r0
            java.lang.String r0 = r10.A0N
            r30 = r0
            boolean r0 = r10.A12
            r51 = r0
            boolean r0 = r10.A10
            r52 = r0
            boolean r0 = r10.A0w
            r53 = r0
            int r0 = r10.A04
            r42 = r0
            int r0 = r10.A0B
            r43 = r0
            boolean r0 = r10.A0v
            r54 = r0
            boolean r0 = r10.A0o
            r55 = r0
            boolean r0 = r10.A0q
            r56 = r0
            boolean r0 = r10.A0n
            r57 = r0
            boolean r0 = r10.A0u
            r58 = r0
            boolean r0 = r10.A0z
            r59 = r0
            boolean r0 = r10.A0i
            r60 = r0
            boolean r0 = r10.A0k
            r61 = r0
            boolean r0 = r10.A13
            r62 = r0
            boolean r0 = r10.A0s
            r63 = r0
            boolean r0 = r10.A0r
            r64 = r0
            boolean r0 = r10.A0e
            r65 = r0
            boolean r0 = r10.A0d
            r66 = r0
            boolean r0 = r10.A0y
            r67 = r0
            java.util.Map r0 = r10.A0X
            r36 = r0
            com.instagram.direct.model.messaginguser.MessagingUser r8 = r10.A0F
            java.util.List r7 = r10.A0T
            java.util.List r6 = r10.A00
            java.util.List r5 = r10.A0S
            X.N3u r4 = r10.A0J
            java.util.List r0 = r10.A0R
            r35 = r0
            boolean r0 = r10.A0j
            r68 = r0
            java.lang.String r0 = r10.A0O
            r31 = r0
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = r10.A0G
            r80 = r0
            boolean r0 = r10.A0l
            r69 = r0
            boolean r0 = r10.A0p
            r70 = r0
            boolean r0 = r10.A0g
            r71 = r0
            boolean r0 = r10.A0x
            r72 = r0
            boolean r0 = r10.A0m
            r73 = r0
            X.3t3 r0 = r10.A0K
            r79 = r0
            int r0 = r10.A09
            r44 = r0
            X.3Te r0 = r10.A0E
            r78 = r0
            int r0 = r10.A07
            r26 = r0
            int r0 = r10.A06
            r25 = r0
            X.7Cl r3 = r10.A0I
            X.4li r2 = r10.A0H
            boolean r0 = r10.A11
            r24 = r0
            java.lang.Long r0 = r10.A0M
            r23 = r0
            boolean r0 = r10.A0h
            r22 = r0
            int r0 = r10.A01
            r21 = r0
            java.util.Map r1 = r10.A0U
            boolean r0 = r10.A0f
            r20 = r0
            boolean r0 = r10.A0t
            r19 = r0
            X.3Tu r0 = r10.A0D
            r18 = r0
            int r0 = r10.A02
            r17 = r0
            int r0 = r10.A03
            r16 = r0
            int r0 = r10.A05
            java.util.Map r10 = r10.A0V
            X.0qQ.A0B(r9, r13)
            X.C66583MXo.A1N(r8, r7, r6, r5, r4)
            X.C66584MXp.A15(r3, r2, r1)
            X.N4P r13 = new X.N4P
            r27 = r23
            r32 = r7
            r33 = r6
            r34 = r5
            r37 = r1
            r38 = r10
            r39 = r11
            r45 = r26
            r46 = r25
            r47 = r21
            r48 = r17
            r49 = r16
            r50 = r0
            r74 = r24
            r75 = r22
            r76 = r20
            r77 = r19
            r16 = r13
            r17 = r81
            r19 = r78
            r20 = r8
            r21 = r80
            r22 = r2
            r23 = r3
            r24 = r4
            r25 = r9
            r26 = r79
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77)
        L_0x0b01:
            r12.A03 = r13
            r0 = 446436092(0x1a9c12fc, float:6.455076E-23)
            X.AnonymousClass0fD.A0A(r0, r14)
            r0 = -46312899(0xfffffffffd3d523d, float:-1.5728194E37)
        L_0x0b0c:
            X.AnonymousClass0fD.A0A(r0, r15)
            return
        L_0x0b10:
            r13 = 0
            goto L_0x0b01
        L_0x0b12:
            r0 = -1608728577(0xffffffffa01cbfff, float:-1.327724E-19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Osn r1 = (X.C71905Osn) r1
            r2 = 660771227(0x2762919b, float:3.1442733E-15)
            int r5 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r4 = r3.A01
            X.NJy r4 = (X.C68481NJy) r4
            X.3t3 r3 = r4.A02
            boolean r2 = r3 instanceof X.C254763t0
            if (r2 == 0) goto L_0x0b35
            if (r3 == 0) goto L_0x0b35
            java.lang.String r2 = r1.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r4.A01(r3, r1, r2)
        L_0x0b35:
            r1 = 1569413659(0x5d8b5a1b, float:1.255171E18)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1819001660(0xffffffff93943cc4, float:-3.7420372E-27)
            goto L_0x0fc1
        L_0x0b40:
            r0 = 1661096705(0x63025301, float:2.4040578E21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 441839661(0x1a55f02d, float:4.424138E-23)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r3.A01
            X.NJy r3 = (X.C68481NJy) r3
            X.3t3 r2 = r3.A02
            boolean r1 = r2 instanceof X.C254763t0
            if (r1 == 0) goto L_0x0b7b
            X.3t0 r2 = (X.C254763t0) r2
            if (r2 == 0) goto L_0x0b7b
            java.lang.String r1 = r2.A00
            if (r1 == 0) goto L_0x0b7b
            r8 = 0
            com.instagram.model.direct.DirectThreadKey r6 = new com.instagram.model.direct.DirectThreadKey
            r6.<init>(r1, r8)
            X.1Ng r1 = r3.A00
            if (r1 != 0) goto L_0x0b6e
            java.lang.String r0 = "igEventBus"
            goto L_0x0d76
        L_0x0b6e:
            java.lang.Integer r7 = X.AnonymousClass05K.A0D
            r11 = 1
            X.2Kb r5 = new X.2Kb
            r9 = r8
            r10 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.A00(r5)
        L_0x0b7b:
            r1 = 1825720774(0x6cd249c6, float:2.0337825E27)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 819731377(0x30dc1bb1, float:1.6014977E-9)
            goto L_0x0fc1
        L_0x0b86:
            r0 = -818525094(0xffffffffcf364c5a, float:-3.05845709E9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r1 = (X.2Kb) r1
            r2 = -376465603(0xffffffffe98f973d, float:-2.1698824E25)
            int r5 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Integer r4 = r1.A01
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            if (r4 != r2) goto L_0x0bbf
            com.instagram.model.direct.DirectThreadKey r4 = r1.A00
            java.lang.Object r2 = r3.A01
            X.NKG r2 = (X.NKG) r2
            X.0eM r3 = r2.A05
            java.lang.Object r1 = r3.getValue()
            boolean r1 = X.0qQ.A0K(r4, r1)
            if (r1 == 0) goto L_0x0bbf
            X.0eM r1 = r2.A06
            java.lang.Object r2 = r1.getValue()
            X.K8P r2 = (X.K8P) r2
            java.lang.Object r1 = r3.getValue()
            com.instagram.model.direct.DirectThreadKey r1 = (com.instagram.model.direct.DirectThreadKey) r1
            r2.A00(r1)
        L_0x0bbf:
            r1 = 1566831393(0x5d63f321, float:1.02659428E18)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1846173185(0x6e0a5e01, float:1.0705644E28)
            goto L_0x0fc1
        L_0x0bca:
            r0 = -890781665(0xffffffffcae7c01f, float:-7593999.5)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Osw r1 = (X.C71914Osw) r1
            r2 = 1279838772(0x4c48ca34, float:5.2635856E7)
            int r5 = X.AnonymousClass0fD.A03(r2)
            r7 = 0
            X.0qQ.A0B(r1, r7)
            java.lang.Object r6 = r3.A01
            X.NJ7 r6 = (X.NJ7) r6
            X.3t3 r2 = X.NJ7.A00(r6)
            X.3sy r3 = X.C300965yF.A05(r2)
            com.instagram.model.direct.DirectThreadKey r2 = r1.A00
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0c23
            r4 = 0
            boolean r3 = r1.A02
            boolean r2 = r6.A01
            if (r3 == r2) goto L_0x0bfc
            r6.A01 = r3
            r4 = 1
        L_0x0bfc:
            java.lang.String r2 = r1.A01
            java.lang.String r1 = r6.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0c2e
            r6.A00 = r2
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0F
            boolean r1 = r2.get()
            if (r1 == 0) goto L_0x0c1d
            r2.set(r7)
            android.content.Context r2 = r6.getContext()
            r1 = 2131963181(0x7f132d2d, float:1.9563108E38)
            X.C59689JTv.A07(r2, r1)
        L_0x0c1d:
            X.NJ7.A07(r6)
            X.Dbb.A0v(r6)
        L_0x0c23:
            r1 = -770822337(0xffffffffd20e2f3f, float:-1.52669503E11)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1565085885(0xffffffffa2b6af43, float:-4.9516764E-18)
            goto L_0x0fc1
        L_0x0c2e:
            if (r4 == 0) goto L_0x0c23
            goto L_0x0c1d
        L_0x0c31:
            r0 = -1437513143(0xffffffffaa514a49, float:-1.8588702E-13)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = 1950376585(0x74406289, float:6.096921E31)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.OLf r0 = (X.C70785OLf) r0
            r0.A00()
            r0 = 1517242410(0x5a6f482a, float:1.68379662E16)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 562014508(0x217fa92c, float:8.662126E-19)
            goto L_0x0fdc
        L_0x0c51:
            r0 = -1759915763(0xffffffff9719d10d, float:-4.9700825E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.MqH r1 = (X.C67583MqH) r1
            r2 = 1898143264(0x71235e20, float:8.0895755E29)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r3.A01
            X.OVX r2 = (X.OVX) r2
            X.OVX.A00(r2)
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0c6f
            r2.A01()
        L_0x0c6f:
            r1 = 1201507724(0x479d8d8c, float:80667.09)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 215728346(0xcdbc0da, float:3.385836E-31)
            goto L_0x0fc1
        L_0x0c7a:
            r0 = -1127988247(0xffffffffbcc443e9, float:-0.023958163)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -575056678(0xffffffffddb954da, float:-1.66931731E18)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.OVT r0 = (X.OVT) r0
            com.instagram.direct.fragment.icebreaker.DirectIceBreakerSettingFragment r0 = r0.A05
            r0.A08()
            r0 = 548926926(0x20b7f5ce, float:3.1164066E-19)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 995079993(0x3b4fb739, float:0.0031694903)
            goto L_0x0fdc
        L_0x0c9c:
            r0 = -769330930(0xffffffffd224f10e, float:-1.77104716E11)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = 2083248622(0x7c2bd9ee, float:3.5692116E36)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel r0 = (com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel) r0
            com.instagram.direct.fragment.channels.discovery.suggestions.ChannelDirectoryInboxViewModel.A06(r0)
            r0 = -1086597807(0xffffffffbf3bd551, float:-0.7337237)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 2010065859(0x77cf2bc3, float:8.403852E33)
            goto L_0x0fdc
        L_0x0cbc:
            r0 = 1984134242(0x76437c62, float:9.912311E32)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1009140996(0x3c264504, float:0.010148291)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r1 = r3.A01
            X.NKn r1 = (X.C68494NKn) r1
            java.lang.String r2 = r1.A01
            if (r2 == 0) goto L_0x0cd9
            com.instagram.direct.fragment.channels.discovery.base.ChannelDiscoveryViewModel r1 = r1.A0D()
            r1.A0E(r2)
        L_0x0cd9:
            r1 = -1377145496(0xffffffffadea6d68, float:-2.6651306E-11)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 2056576303(0x7a94dd2f, float:3.8647304E35)
            goto L_0x0fc1
        L_0x0ce4:
            r0 = 1651773162(0x62740eea, float:1.12552006E21)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Osg r1 = (X.C71898Osg) r1
            r2 = -414035853(0xffffffffe7525073, float:-9.93181E23)
            int r4 = X.AnonymousClass0fD.A03(r2)
            if (r1 == 0) goto L_0x0d0a
            java.lang.Object r2 = r3.A01
            X.NIh r2 = (X.C68444NIh) r2
            X.Mtz r2 = r2.A04
            if (r2 != 0) goto L_0x0d01
            java.lang.String r0 = "viewModel"
            goto L_0x0d76
        L_0x0d01:
            java.lang.String r3 = r1.A00
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = r2.A02
            java.lang.String r1 = "questions"
            r2.A0B(r3, r1)
        L_0x0d0a:
            r1 = 706696307(0x2a1f5473, float:1.4151336E-13)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1816814921(0x6c4a6549, float:9.787253E26)
            goto L_0x0fc1
        L_0x0d15:
            r0 = -149670867(0xfffffffff714342d, float:-3.0059304E33)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.7MH r1 = (X.AnonymousClass7MH) r1
            r2 = 84627536(0x50b5050, float:6.5505E-36)
            int r7 = X.AnonymousClass0fD.A03(r2)
            r6 = 0
            X.0qQ.A0B(r1, r6)
            com.instagram.model.direct.messageid.MessageIdentifier r2 = r1.A01
            java.lang.Object r5 = r3.A01
            X.NV6 r5 = (X.NV6) r5
            com.instagram.model.direct.messageid.MessageIdentifier r1 = r5.A01
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0d4f
            X.MuF r4 = r5.A0E()
            X.6oS r2 = X.C318116oQ.A00(r4)
            r3 = 0
            r1 = 36
            X.C66583MXo.A1O(r4, r2, r1)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131973635(0x7f135603, float:1.9584311E38)
            X.C59689JTv.A01(r2, r3, r1, r6)
        L_0x0d4f:
            r1 = 1152010639(0x44aa498f, float:1362.2987)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -912053744(0xffffffffc9a32a10, float:-1336642.0)
            goto L_0x0fc1
        L_0x0d5a:
            r0 = 2062987659(0x7af6b18b, float:6.40453E35)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.7P2 r1 = (X.AnonymousClass7P2) r1
            r0 = 200345549(0xbf107cd, float:9.284156E-32)
            int r5 = X.AnonymousClass7TG.A0D(r1, r0)
            java.lang.String r2 = r1.A01
            java.lang.Object r6 = r3.A01
            X.NJ4 r6 = (X.NJ4) r6
            java.lang.String r0 = r6.A06
            if (r0 != 0) goto L_0x0d7e
            java.lang.String r0 = "collectionId"
        L_0x0d76:
            X.0qQ.A0F(r0)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x0d7e:
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0dbe
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0dbe
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A04
            if (r1 == 0) goto L_0x0d91
            X.3uy r0 = X.C255943uy.SUCCESS
            r1.setLoadingStatus(r0)
        L_0x0d91:
            android.content.Context r1 = r6.getContext()
            r0 = 2131960090(0x7f13211a, float:1.9556839E38)
            X.C59689JTv.A07(r1, r0)
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()
            if (r4 == 0) goto L_0x0db0
            r3 = -1
            android.content.Intent r2 = X.DbS.A09()
            r1 = 1
            java.lang.String r0 = "extra_response_added"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r4.setResult(r3, r0)
        L_0x0db0:
            X.DbX.A1I(r6)
        L_0x0db3:
            r0 = 785142913(0x2ecc5481, float:9.291857E-11)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1628888201(0xffffffff9ee92377, float:-2.4684503E-20)
            goto L_0x0fdc
        L_0x0dbe:
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r6.A04
            if (r1 == 0) goto L_0x0db3
            X.3uy r0 = X.C255943uy.LOADED
            r1.setLoadingStatus(r0)
            goto L_0x0db3
        L_0x0dc8:
            r0 = -407769561(0xffffffffe7b1ee27, float:-1.680504E24)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.AY1 r1 = (X.AY1) r1
            r2 = 489428018(0x1d2c1432, float:2.2774451E-21)
            int r2 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r5 = r3.A01
            X.NV4 r5 = (X.NV4) r5
            X.MuF r7 = r5.A0E()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.direct.fragment.cardgallery.model.DirectChallengeWinnerViewModel"
            X.0qQ.A0C(r7, r3)
            X.NVF r7 = (X.NVF) r7
            java.util.List r4 = r1.A00
            r7.A00 = r4
            X.6oS r6 = X.C318116oQ.A00(r7)
            r14 = 0
            r3 = 24
            X.MHF r1 = new X.MHF
            r1.<init>(r4, r7, r14, r3)
            X.AnonymousClass7TE.A1Z(r1, r6)
            r7.A08()
            androidx.recyclerview.widget.RecyclerView r1 = r5.getRecyclerView()
            X.2Rw r1 = r1.A0A
            if (r1 == 0) goto L_0x0e08
            r1.notifyDataSetChanged()
        L_0x0e08:
            X.2Fk r1 = r7.A01
            java.lang.Object r3 = r1.A02()
            boolean r1 = r3 instanceof X.NVJ
            r7 = 0
            if (r1 == 0) goto L_0x0e57
            X.NVJ r3 = (X.NVJ) r3
            if (r3 == 0) goto L_0x0e57
            java.lang.String r3 = r3.A05
            java.lang.String r1 = "STORY_SHOUT_OUT"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 != 0) goto L_0x0e57
            X.0eM r1 = r5.A06
            X.OyR r6 = X.C66580MXl.A0T(r1)
            java.lang.String r8 = X.C66580MXl.A0w(r5)
            com.instagram.model.direct.DirectThreadKey r1 = r5.A0G()
            java.lang.String r9 = r1.A01
            X.3U9 r1 = X.C66584MXp.A0N(r5)
            if (r1 == 0) goto L_0x0e3f
            int r1 = r1.AdN()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        L_0x0e3f:
            java.lang.Object r3 = X.00k.A0J(r4)
            if (r3 == 0) goto L_0x0e4b
            java.lang.String r1 = "submission_id"
            java.util.Map r14 = X.AnonymousClass7TF.A0w(r1, r3)
        L_0x0e4b:
            r5 = 0
            java.lang.String r10 = "send_challenge_winner_message"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "send_button"
            java.lang.String r13 = "thread_view"
            X.C72202OyR.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0e57:
            r1 = -641436838(0xffffffffd9c4735a, float:-6.9119907E15)
            X.AnonymousClass0fD.A0A(r1, r2)
            r1 = -162433888(0xfffffffff65174a0, float:-1.0620659E33)
            goto L_0x0fc1
        L_0x0e62:
            r0 = -1331610145(0xffffffffb0a13ddf, float:-1.1731877E-9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Osg r1 = (X.C71898Osg) r1
            r2 = -1548738051(0xffffffffa3b021fd, float:-1.9096353E-17)
            int r5 = X.AnonymousClass0fD.A03(r2)
            if (r1 == 0) goto L_0x0e85
            java.lang.Object r2 = r3.A01
            X.NKo r2 = (X.C68495NKo) r2
            X.MuF r4 = r2.A0E()
            java.lang.String r3 = r1.A00
            com.instagram.direct.fragment.cardgallery.repository.DirectCardGalleryRepository r2 = r4.A06
            java.lang.String r1 = r4.A0D
            r2.A0B(r3, r1)
        L_0x0e85:
            r1 = 507648414(0x1e42199e, float:1.0275572E-20)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -415218813(0xffffffffe7404383, float:-9.0793974E23)
            goto L_0x0fc1
        L_0x0e90:
            r0 = 651231508(0x26d10114, float:1.450258E-15)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r1 = (X.2Kb) r1
            r2 = -551176417(0xffffffffdf25b71f, float:-1.1941047E19)
            int r4 = X.AnonymousClass0fD.A03(r2)
            java.lang.Object r2 = r3.A01
            X.OGm r2 = (X.C70691OGm) r2
            java.lang.String r3 = r2.A05
            com.instagram.model.direct.DirectThreadKey r1 = r1.A00
            java.lang.String r1 = r1.A00
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0ecc
            X.2Dm r1 = r2.A03
            X.3U9 r1 = X.C66580MXl.A0d(r1, r3)
            X.O8e r2 = r2.A04
            if (r1 == 0) goto L_0x0ed7
            r1 = 0
            X.OZR r2 = r2.A00
            r2.A02 = r1
            X.OZR.A00(r2)
            X.Ebf r1 = r2.A07
            r1.A00()
            X.7Vb r1 = r2.A05
            r1.Ewl(r3)
        L_0x0ecc:
            r1 = 473422465(0x1c37da81, float:6.083203E-22)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 708257989(0x2a3728c5, float:1.626781E-13)
            goto L_0x0fc1
        L_0x0ed7:
            X.OZR r3 = r2.A00
            r1 = 0
            r3.A02 = r1
            X.OZR.A00(r3)
            X.Ebf r1 = r3.A07
            r1.A00()
            android.content.Context r2 = r3.A03
            r1 = 2131976595(0x7f136193, float:1.9590315E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            X.OZR.A01(r3, r1)
            goto L_0x0ecc
        L_0x0ef1:
            r0 = -367177814(0xffffffffea1d4faa, float:-4.754439E25)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -778727146(0xffffffffd1959116, float:-8.0298033E10)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.OL4 r0 = (X.OL4) r0
            r0.A00()
            r0 = -1891582350(0xffffffff8f40be72, float:-9.503009E-30)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1590466781(0xffffffffa1336723, float:-6.078406E-19)
            goto L_0x0fdc
        L_0x0f11:
            r0 = 410458121(0x18771809, float:3.1936136E-24)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1108798576(0xffffffffbde91390, float:-0.113806844)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r3.A01
            X.OlK r0 = (X.C71476OlK) r0
            X.C71476OlK.A00(r0)
            r0 = -336955676(0xffffffffebea76e4, float:-5.6690017E26)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1690311252(0xffffffff9b3fe5ac, float:-1.5873361E-22)
            goto L_0x0fdc
        L_0x0f31:
            r0 = -1969825554(0xffffffff8a96d8ee, float:-1.4526074E-32)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Ka r1 = (X.2Ka) r1
            r2 = 2025812776(0x78bf7328, float:3.106451E34)
            int r4 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r3 = r3.A01
            X.OlK r3 = (X.C71476OlK) r3
            java.util.HashSet r2 = r3.A06
            com.instagram.model.direct.DirectThreadKey r1 = r1.A01
            java.lang.String r1 = r1.A00
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L_0x0f54
            X.C71476OlK.A00(r3)
        L_0x0f54:
            r1 = 95108642(0x5ab3e22, float:1.6103587E-35)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -3592376(0xffffffffffc92f48, float:NaN)
            goto L_0x0fc1
        L_0x0f5e:
            r0 = 1364810278(0x51595a26, float:5.8345021E10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kd r1 = (X.2Kd) r1
            r2 = -855756052(0xffffffffccfe32ec, float:-1.3327344E8)
            int r5 = X.AnonymousClass7TG.A0D(r1, r2)
            java.lang.Object r4 = r3.A01
            X.OlK r4 = (X.C71476OlK) r4
            java.util.HashSet r3 = r4.A06
            X.3t3 r2 = r1.A00
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadId"
            X.0qQ.A0C(r2, r1)
            X.3t0 r2 = (X.C254763t0) r2
            java.lang.String r1 = r2.A00
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L_0x0f88
            X.C71476OlK.A00(r4)
        L_0x0f88:
            r1 = -247034592(0xfffffffff1468d20, float:-9.831783E29)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 308472691(0x1262eb73, float:7.160324E-28)
            goto L_0x0fc1
        L_0x0f92:
            r0 = 212134289(0xca4e991, float:2.5408774E-31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 990358913(0x3b07ad81, float:0.0020702782)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r3 = r3.A01
            com.instagram.arp.api.AvatarEffectsApiController r3 = (com.instagram.arp.api.AvatarEffectsApiController) r3
            r3.A02()
            X.0sP r2 = r3.A02
            if (r2 == 0) goto L_0x0fb0
            com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.NO
            r2.invoke(r1)
        L_0x0fb0:
            X.0sP r2 = r3.A01
            if (r2 == 0) goto L_0x0fb8
            r1 = 0
            r2.invoke(r1)
        L_0x0fb8:
            r1 = 2065113633(0x7b172221, float:7.8472904E35)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1532582876(0x5b595bdc, float:6.118107E16)
        L_0x0fc1:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0fc5:
            r0 = 2134717512(0x7f3d3448, float:2.5149555E38)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -58814942(0xfffffffffc7e8e22, float:-5.2869048E36)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r0 = -888071112(0xffffffffcb111c38, float:-9509944.0)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 392493908(0x1764fb54, float:7.3987994E-25)
        L_0x0fdc:
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71932OtG.onEvent(java.lang.Object):void");
    }

    public C71932OtG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
