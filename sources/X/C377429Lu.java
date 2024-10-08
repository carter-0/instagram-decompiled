package X;

/* renamed from: X.9Lu  reason: invalid class name and case insensitive filesystem */
public final class C377429Lu extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377429Lu(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.0sa, X.9Na] */
    /* JADX WARNING: type inference failed for: r0v33, types: [X.0sa, X.Pqw] */
    /* JADX WARNING: type inference failed for: r12v3, types: [X.0sa, X.7WW] */
    /* JADX WARNING: type inference failed for: r0v132, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r2v46, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r0v136, types: [java.lang.Object, X.2jE] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x05ef, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01ab, code lost:
        return java.lang.Boolean.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b4, code lost:
        X.C242633Vg.A01(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0113;
                case 1: goto L_0x0140;
                case 2: goto L_0x0155;
                case 3: goto L_0x0166;
                case 4: goto L_0x018f;
                case 5: goto L_0x01b8;
                case 6: goto L_0x01d3;
                case 7: goto L_0x0020;
                case 8: goto L_0x01ed;
                case 9: goto L_0x01fb;
                case 10: goto L_0x0043;
                case 11: goto L_0x0007;
                case 12: goto L_0x020b;
                case 13: goto L_0x00eb;
                case 14: goto L_0x0100;
                case 15: goto L_0x0020;
                case 16: goto L_0x0007;
                case 17: goto L_0x0258;
                case 18: goto L_0x0270;
                case 19: goto L_0x0270;
                case 20: goto L_0x0284;
                case 21: goto L_0x0291;
                case 22: goto L_0x029e;
                case 23: goto L_0x02c4;
                case 24: goto L_0x0319;
                case 25: goto L_0x0334;
                case 26: goto L_0x034e;
                case 27: goto L_0x0368;
                case 28: goto L_0x0382;
                case 29: goto L_0x039d;
                case 30: goto L_0x03c1;
                case 31: goto L_0x03cf;
                case 32: goto L_0x03e4;
                case 33: goto L_0x0443;
                case 34: goto L_0x0450;
                case 35: goto L_0x0487;
                case 36: goto L_0x04e5;
                case 37: goto L_0x0511;
                case 38: goto L_0x0534;
                case 39: goto L_0x0594;
                case 40: goto L_0x05ce;
                case 41: goto L_0x05f0;
                case 42: goto L_0x061a;
                case 43: goto L_0x0007;
                case 44: goto L_0x063b;
                case 45: goto L_0x0649;
                case 46: goto L_0x0659;
                case 47: goto L_0x066f;
                case 48: goto L_0x0683;
                case 49: goto L_0x0697;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x0013
            java.lang.Object r7 = r1.invoke()
            if (r7 != 0) goto L_0x001f
        L_0x0013:
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            X.2YQ r7 = r0.getDefaultViewModelCreationExtras()
        L_0x001f:
            return r7
        L_0x0020:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x002c
            java.lang.Object r7 = r1.invoke()
            if (r7 != 0) goto L_0x001f
        L_0x002c:
            java.lang.Object r0 = r0.A02
            X.0eM r0 = (X.AnonymousClass0eM) r0
            java.lang.Object r1 = r0.getValue()
            X.07g r1 = (X.AnonymousClass07g) r1
            boolean r0 = r1 instanceof X.AnonymousClass07P
            if (r0 == 0) goto L_0x06ad
            X.07P r1 = (X.AnonymousClass07P) r1
            if (r1 == 0) goto L_0x06ad
            X.2YQ r7 = r1.getDefaultViewModelCreationExtras()
            return r7
        L_0x0043:
            java.lang.Object r7 = r0.A01
            if (r7 != 0) goto L_0x001f
            java.lang.Object r4 = r0.A02
            X.8hT r4 = (X.C362178hT) r4
            X.4DH r0 = r4.A0H
            android.content.Context r6 = r4.A0G
            com.instagram.common.session.UserSession r7 = r4.A0J
            X.8Yz r1 = r4.A0K
            int r9 = X.AnonymousClass8XE.A01(r6)
            int r10 = X.AnonymousClass8XE.A00(r6)
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            r11 = 0
            X.8Qq r5 = new X.8Qq
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.0gy r0 = X.AnonymousClass07i.A00(r0)
            X.8XN r3 = new X.8XN
            r3.<init>(r0, r5)
            r3.A04 = r7
            X.Ags r0 = new X.Ags
            r0.<init>(r7, r1, r4)
            r3.A07 = r0
            X.2jA r2 = new X.2jA
            r2.<init>()
            r5 = 1
            r3.A09 = r5
            r3.A0B = r5
            r3.A0F = r5
            X.8XR r0 = new X.8XR
            r0.<init>(r6)
            r3.A05 = r0
            r3.A06 = r2
            X.2jE r0 = new X.2jE
            r0.<init>()
            boolean r0 = r0.A00(r7)
            r3.A0D = r0
            X.Agt r0 = new X.Agt
            r0.<init>(r4)
            r3.A08 = r0
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = r1.A06()
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00a8
            X.8XO r0 = X.AnonymousClass8XO.PHOTO_ONLY
            r3.A03 = r0
        L_0x00a8:
            X.80m r4 = r1.A08
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x00c4
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326116130043403(0x810e690000360b, double:3.036120341943818E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c4
            X.Lgo r0 = new X.Lgo
            r0.<init>(r5)
            r3.A02 = r0
        L_0x00c4:
            java.lang.Object r0 = r4.A00
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x00df
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323831207636530(0x810c5500032e32, double:3.0346753478130674E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00df
            r1 = 2
            X.Lgo r0 = new X.Lgo
            r0.<init>(r1)
            r3.A02 = r0
        L_0x00df:
            X.8XU r1 = new X.8XU
            r1.<init>(r3)
            r0 = 0
            X.8XW r7 = new X.8XW
            r7.<init>(r6, r0, r0, r1)
            return r7
        L_0x00eb:
            java.lang.Object r1 = r0.A01
            X.0sa r1 = (X.C62320sa) r1
            if (r1 == 0) goto L_0x00f7
            java.lang.Object r7 = r1.invoke()
            if (r7 != 0) goto L_0x001f
        L_0x00f7:
            java.lang.Object r0 = r0.A02
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            X.2YQ r7 = r0.getDefaultViewModelCreationExtras()
            return r7
        L_0x0100:
            java.lang.Object r7 = r0.A01
            if (r7 != 0) goto L_0x001f
            java.lang.Object r1 = r0.A02
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131627017(0x7f0e0c09, float:1.8881287E38)
            r1.setLayoutResource(r0)
            android.view.View r7 = r1.inflate()
            return r7
        L_0x0113:
            X.7fL r3 = X.C336887fL.A00
            java.lang.Object r1 = r0.A01
            X.3Y5 r1 = (X.AnonymousClass3Y5) r1
            android.content.Context r4 = X.C243803a8.A00(r1)
            android.content.Context r2 = X.C243803a8.A00(r1)
            r1 = 2130971404(0x7f040b0c, float:1.7551545E38)
            int r9 = X.2Yu.A0F(r2, r1)
            java.lang.Object r1 = r0.A02
            X.7fH r1 = (X.C336847fH) r1
            com.instagram.common.session.UserSession r6 = r1.A02
            X.7a7 r5 = r1.A00
            com.instagram.user.model.User r7 = r1.A04
            boolean r10 = r1.A0A
            r0 = 29
            X.Inh r8 = new X.Inh
            r8.<init>(r1, r0)
            android.text.SpannableStringBuilder r7 = r3.A01(r4, r5, r6, r7, r8, r9, r10)
            return r7
        L_0x0140:
            java.lang.Object r2 = r0.A01
            X.2Wa r2 = (X.2Wa) r2
            java.lang.Object r0 = r0.A02
            X.7fG r0 = (X.C336837fG) r0
            com.instagram.common.session.UserSession r1 = r0.A01
            com.instagram.user.model.User r0 = r0.A02
            com.instagram.model.reels.Reel r0 = X.1OP.A01(r1, r0)
            r2.A01(r0)
            goto L_0x05ed
        L_0x0155:
            java.lang.Object r1 = r0.A02
            X.0lg r1 = (X.0lg) r1
            java.lang.Object r0 = r0.A01
            android.content.Context r0 = (android.content.Context) r0
            X.0qQ.A0A(r0)
            X.3KG r7 = new X.3KG
            r7.<init>(r0, r1)
            return r7
        L_0x0166:
            java.lang.Object r4 = r0.A02
            X.3Vg r4 = (X.C242633Vg) r4
            java.util.Map r3 = r4.A02
            java.lang.Object r2 = r0.A01
            java.lang.Object r0 = r3.get(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 0
            if (r0 == 0) goto L_0x01a7
            int r0 = r0.decrementAndGet()
            if (r0 != 0) goto L_0x01a7
            r1 = 1
            r3.remove(r2)
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x01b4
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r4.A00 = r0
            goto L_0x01b4
        L_0x018f:
            java.lang.Object r4 = r0.A02
            X.3Vg r4 = (X.C242633Vg) r4
            r1 = 0
            r4.A00 = r1
            java.util.Map r3 = r4.A02
            java.lang.Object r2 = r0.A01
            java.lang.Object r0 = r3.get(r2)
            java.util.concurrent.atomic.AtomicInteger r0 = (java.util.concurrent.atomic.AtomicInteger) r0
            r1 = 1
            if (r0 == 0) goto L_0x01ac
            r0.incrementAndGet()
            r1 = 0
        L_0x01a7:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L_0x01ac:
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r1)
            r3.put(r2, r0)
        L_0x01b4:
            X.C242633Vg.A01(r4)
            goto L_0x01a7
        L_0x01b8:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            X.0lg r3 = (X.0lg) r3
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Class<com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository> r2 = com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository.class
            r1 = 7
            X.MJ9 r0 = new X.MJ9
            r0.<init>(r1, r4, r3)
            java.lang.Object r7 = r3.A01(r2, r0)
            return r7
        L_0x01d3:
            java.lang.Object r1 = r0.A02
            X.8ZA r1 = (X.AnonymousClass8ZA) r1
            java.lang.Object r4 = r0.A01
            X.8Z0 r0 = r1.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository> r2 = com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository.class
            r1 = 13
            X.MMT r0 = new X.MMT
            r0.<init>(r4, r1)
            X.3pa r7 = r3.A00(r2, r0)
            return r7
        L_0x01ed:
            java.lang.Object r1 = r0.A02
            X.29E r1 = (X.29E) r1
            java.lang.Object r0 = r0.A01
            X.8Yz r0 = (X.C357638Yz) r0
            X.8HT r7 = new X.8HT
            r7.<init>(r1, r0)
            return r7
        L_0x01fb:
            java.lang.Object r2 = r0.A02
            X.8WX r2 = (X.AnonymousClass8WX) r2
            r1 = 1
            r2.A01 = r1
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r7 = r0.invoke()
            return r7
        L_0x020b:
            java.lang.Object r1 = r0.A01
            X.0lg r1 = (X.0lg) r1
            X.7Pr r7 = new X.7Pr
            r7.<init>(r1)
            r5 = 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r7.A0a = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r7.A03 = r1
            java.lang.Object r4 = r0.A02
            X.8CY r4 = (X.AnonymousClass8CY) r4
            java.lang.ref.WeakReference r3 = r4.A01
            java.lang.Object r1 = r3.get()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 0
            if (r1 == 0) goto L_0x0256
            r0 = 2131969107(0x7f134453, float:1.9575128E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0235:
            r7.A0d = r0
            r0 = 0
            r7.A1J = r0
            java.lang.Object r1 = r3.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 == 0) goto L_0x0249
            r0 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0249:
            r7.A0g = r2
            r1 = 7
            X.AOX r0 = new X.AOX
            r0.<init>((java.lang.Object) r4, (int) r1)
            r7.A0K = r0
            r7.A17 = r5
            return r7
        L_0x0256:
            r0 = r2
            goto L_0x0235
        L_0x0258:
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0qQ.A0A(r2)
            X.0qQ.A0A(r2)
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.2Nn r0 = X.AnonymousClass830.A00(r2, r1)
            X.8A5 r7 = new X.8A5
            r7.<init>(r2, r1, r0)
            return r7
        L_0x0270:
            java.lang.Object r3 = r0.A01
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A02
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            X.2Nn r1 = X.AnonymousClass830.A00(r3, r2)
            X.12T r0 = X.AnonymousClass12T.A00
            X.82z r7 = new X.82z
            r7.<init>(r3, r0, r2, r1)
            return r7
        L_0x0284:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r0.A02
            X.7zv r0 = (X.C349307zv) r0
            X.1GK r7 = X.LI4.A01(r1, r0)
            return r7
        L_0x0291:
            java.lang.Object r1 = r0.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r7 = X.C361288fz.A00(r1, r0)
            return r7
        L_0x029e:
            java.lang.Object r1 = r0.A02
            X.87h r1 = (X.C3510287h) r1
            java.util.List r3 = r1.A00
            java.util.Iterator r2 = r3.iterator()
        L_0x02a8:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x02b8
            java.lang.Object r1 = r2.next()
            X.6id r1 = (X.C314656id) r1
            r1.D78()
            goto L_0x02a8
        L_0x02b8:
            r3.clear()
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r7 = r0.invoke()
            return r7
        L_0x02c4:
            java.lang.Object r4 = r0.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            boolean r1 = X.AnonymousClass1A9.A00()
            if (r1 == 0) goto L_0x02e5
            X.Lrc r3 = new X.Lrc
            r3.<init>()
        L_0x02d3:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            java.lang.Class<com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource> r2 = com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource.class
            r1 = 31
            X.Ivn r0 = new X.Ivn
            r0.<init>(r3, r1)
            java.lang.Object r7 = r4.A01(r2, r0)
            return r7
        L_0x02e5:
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319918495047421(0x8108c6002b1efd, double:3.032200932616486E-306)
            boolean r3 = X.182.A06(r2, r4, r0)
            r0 = 36601393469853853(0x8208c6000e109d, double:3.210206840092823E-306)
            long r0 = X.182.A01(r2, r4, r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r1 = 30
            X.JwK r0 = new X.JwK
            r0.<init>((int) r1, (java.lang.Object) r2, (boolean) r3)
            X.JwG r1 = new X.JwG
            r1.<init>((X.C61082JwK) r0)
            r0 = 8
            com.instagram.genai.imageservice.service.GenAIImageService r3 = new com.instagram.genai.imageservice.service.GenAIImageService
            r3.<init>(r5, r1, r4, r0)
            goto L_0x02d3
        L_0x0319:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            X.0lg r3 = (X.0lg) r3
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.HDk> r2 = X.C54435HDk.class
            r1 = 7
            X.IwQ r0 = new X.IwQ
            r0.<init>(r1, r4, r3)
            java.lang.Object r7 = r3.A01(r2, r0)
            return r7
        L_0x0334:
            java.lang.Object r1 = r0.A02
            X.8ZA r1 = (X.AnonymousClass8ZA) r1
            java.lang.Object r4 = r0.A01
            X.8Z0 r0 = r1.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource> r2 = com.instagram.creation.genai.magicmod.data.MagicModImageGenerationDataSource.class
            r1 = 40
            X.Ivn r0 = new X.Ivn
            r0.<init>(r4, r1)
            X.3pa r7 = r3.A00(r2, r0)
            return r7
        L_0x034e:
            java.lang.Object r1 = r0.A02
            X.8ZA r1 = (X.AnonymousClass8ZA) r1
            java.lang.Object r4 = r0.A01
            X.8Z0 r0 = r1.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.HDl> r2 = X.C54436HDl.class
            r1 = 41
            X.Ivn r0 = new X.Ivn
            r0.<init>(r4, r1)
            X.3pa r7 = r3.A00(r2, r0)
            return r7
        L_0x0368:
            java.lang.Object r1 = r0.A02
            X.8ZA r1 = (X.AnonymousClass8ZA) r1
            java.lang.Object r4 = r0.A01
            X.8Z0 r0 = r1.A00
            X.8Z1 r3 = r0.Bmt()
            java.lang.Class<X.HDk> r2 = X.C54435HDk.class
            r1 = 42
            X.Ivn r0 = new X.Ivn
            r0.<init>(r4, r1)
            X.3pa r7 = r3.A00(r2, r0)
            return r7
        L_0x0382:
            java.lang.Object r3 = r0.A01
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r2 = r3.getContext()
            X.0qQ.A07(r2)
            java.lang.Object r0 = r0.A02
            X.7NZ r0 = (X.AnonymousClass7NZ) r0
            float r1 = r0.A00
            X.NEm r0 = new X.NEm
            r0.<init>(r2, r1)
            r3.setImageDrawable(r0)
            goto L_0x05ed
        L_0x039d:
            java.lang.Object r0 = r0.A01
            X.A7s r0 = (X.C39752A7s) r0
            X.763 r0 = r0.A07
            r3 = 0
            if (r0 == 0) goto L_0x03a8
            android.graphics.drawable.Drawable r3 = r0.A00
        L_0x03a8:
            boolean r0 = r3 instanceof X.C381039b4
            if (r0 == 0) goto L_0x05ed
            X.9b4 r3 = (X.C381039b4) r3
            if (r3 == 0) goto L_0x05ed
            X.NEq r2 = r3.A01
            r0 = 1
            r2.setVisible(r0, r0)
            X.NEn r1 = r3.A00
            r0 = 0
            r1.setVisible(r0, r0)
            r3.A01(r2)
            goto L_0x05ed
        L_0x03c1:
            java.lang.Object r1 = r0.A02
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.7IQ r7 = new X.7IQ
            r7.<init>(r0, r1)
            return r7
        L_0x03cf:
            java.lang.Object r1 = r0.A01
            android.content.Context r1 = (android.content.Context) r1
            android.content.Context r1 = r1.getApplicationContext()
            X.0qQ.A07(r1)
            java.lang.Object r0 = r0.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.4ru r7 = new X.4ru
            r7.<init>(r1, r0)
            return r7
        L_0x03e4:
            java.lang.Object r2 = r0.A01
            java.util.HashMap r2 = (java.util.HashMap) r2
            r1 = 718(0x2ce, float:1.006E-42)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.DiU r1 = X.C46649DiU.A04(r1, r2)
            java.lang.Object r5 = r0.A02
            X.7Le r5 = (X.C330037Le) r5
            com.instagram.common.session.UserSession r2 = r5.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = new com.instagram.bloks.hosting.IgBloksScreenConfig
            r0.<init>((X.0lg) r2)
            X.Di2 r4 = X.C49891FBs.A01(r0, r1)
            X.0sa r0 = r5.A02
            java.lang.Object r3 = r0.invoke()
            X.7Uf r3 = (X.C332247Uf) r3
            X.7Pr r1 = new X.7Pr
            r1.<init>(r2)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0a = r0
            r0 = 1060320051(0x3f333333, float:0.7)
            r1.A03 = r0
            X.4mX r0 = r3.A01
            r1.A0U = r0
            X.7Pu r2 = r1.A00()
            X.4DH r1 = r5.A00
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0438
            androidx.fragment.app.FragmentActivity r1 = r1.requireActivity()
        L_0x042e:
            if (r1 == 0) goto L_0x05ed
            r2.A02(r1, r4)
            r3.Cyt()
            goto L_0x05ed
        L_0x0438:
            X.2ZQ r1 = X.C71172bH.A00()
            boolean r0 = r1 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x05ed
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x042e
        L_0x0443:
            java.lang.Object r1 = r0.A02
            X.7TI r1 = (X.AnonymousClass7TI) r1
            java.lang.Object r0 = r0.A01
            X.7S7 r0 = (X.AnonymousClass7S7) r0
            X.AnonymousClass7TI.A09(r1, r0)
            goto L_0x05ed
        L_0x0450:
            java.lang.Object r1 = r0.A02
            X.7Ue r1 = (X.C332237Ue) r1
            X.4DH r8 = r1.A0E
            com.instagram.common.session.UserSession r9 = r1.A0G
            X.7Tn r3 = r1.A0H
            X.0sa r15 = r3.A0I
            X.7SM r10 = r3.A06
            X.0sa r2 = r3.A0A
            java.lang.String r11 = r3.A09
            X.0sa r1 = r1.A0t
            X.7Um r12 = new X.7Um
            r12.<init>(r1)
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            X.7Um r13 = new X.7Um
            r13.<init>(r0)
            X.0sa r0 = r3.A0G
            X.7Um r14 = new X.7Um
            r14.<init>(r0)
            X.7Vn r7 = new X.7Vn
            r17 = r2
            r18 = r2
            r19 = r2
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r7
        L_0x0487:
            java.lang.Object r6 = r0.A02
            X.7Ue r6 = (X.C332237Ue) r6
            X.4DH r8 = r6.A0E
            com.instagram.common.session.UserSession r9 = r6.A0G
            X.7Tn r3 = r6.A0H
            X.3tH r2 = r3.A07
            X.3tH r1 = X.C254923tH.ACT
            r15 = 0
            if (r2 != r1) goto L_0x0499
            r15 = 1
        L_0x0499:
            X.4DU r1 = r3.A08
            java.lang.String r10 = r1.getModuleName()
            X.0sa r1 = r6.A0t
            X.7Um r5 = new X.7Um
            r5.<init>(r1)
            X.0sa r1 = r3.A0J
            X.7Um r4 = new X.7Um
            r4.<init>(r1)
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            X.7Um r3 = new X.7Um
            r3.<init>(r0)
            r2 = 3
            X.AtI r1 = new X.AtI
            r1.<init>((java.lang.Object) r6, (int) r2)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.0qQ.A0B(r10, r2)
            r0 = 35
            X.PlY r11 = new X.PlY
            r11.<init>(r5, r0)
            r0 = 36
            X.PlY r12 = new X.PlY
            r12.<init>(r4, r0)
            r0 = 37
            X.PlY r13 = new X.PlY
            r13.<init>(r3, r0)
            r0 = 38
            X.PlY r14 = new X.PlY
            r14.<init>(r1, r0)
            X.7VL r7 = new X.7VL
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L_0x04e5:
            java.lang.Object r2 = r0.A02
            X.7Ue r2 = (X.C332237Ue) r2
            X.4DH r8 = r2.A0E
            com.instagram.common.session.UserSession r11 = r2.A0G
            X.0eM r1 = r2.A0U
            java.lang.Object r12 = r1.getValue()
            X.7VS r12 = (X.AnonymousClass7VS) r12
            X.1a8 r9 = r2.A0F
            java.lang.Object r10 = r0.A01
            X.1a8 r10 = (X.1a8) r10
            X.0sa r13 = r2.A0t
            X.7Tw r0 = r2.A0I
            X.7Ty r1 = r0.A0O
            r0 = 5
            X.9NK r14 = new X.9NK
            r14.<init>(r1, r0)
            X.7Tn r0 = r2.A0H
            X.0sa r15 = r0.A0C
            X.7WH r7 = new X.7WH
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L_0x0511:
            java.lang.Object r1 = r0.A02
            X.7Ue r1 = (X.C332237Ue) r1
            com.instagram.common.session.UserSession r8 = r1.A0G
            java.lang.Object r9 = r0.A01
            X.0sa r9 = (X.C62320sa) r9
            X.7Tn r0 = r1.A0H
            X.0sa r10 = r0.A0G
            X.0sa r11 = r0.A0I
            X.7WW r12 = new X.7WW
            r12.<init>(r1)
            X.0sa r13 = r1.A0t
            r0 = 1
            X.PlY r14 = new X.PlY
            r14.<init>(r1, r0)
            X.7WX r7 = new X.7WX
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return r7
        L_0x0534:
            java.lang.Object r5 = r0.A02
            X.7Ue r5 = (X.C332237Ue) r5
            X.4DH r8 = r5.A0E
            com.instagram.common.session.UserSession r9 = r5.A0G
            X.7Tn r1 = r5.A0H
            X.0sa r2 = r1.A0A
            X.7Um r3 = new X.7Um
            r3.<init>(r2)
            X.7VL r16 = r5.A00()
            X.0eM r2 = r5.A0n
            java.lang.Object r13 = r2.getValue()
            X.7VD r13 = (X.AnonymousClass7VD) r13
            X.7Tw r2 = r5.A0I
            X.7UW r11 = r2.A0C
            java.lang.Object r12 = r0.A01
            X.7Sf r12 = (X.C331747Sf) r12
            X.7US r10 = r2.A0B
            X.0sa r0 = r5.A0t
            X.7Um r4 = new X.7Um
            r4.<init>(r0)
            X.0sa r0 = r1.A0E
            X.7Um r2 = new X.7Um
            r2.<init>(r0)
            X.0eM r0 = r5.A0O
            java.lang.Object r7 = r0.getValue()
            r6 = 3
            X.Pqw r0 = new X.Pqw
            r0.<init>(r7, r6)
            X.7Vw r14 = new X.7Vw
            r14.<init>(r0)
            X.7Vx r15 = new X.7Vx
            r15.<init>(r5)
            X.0sa r1 = r1.A0L
            X.7Un r0 = new X.7Un
            r0.<init>(r1)
            X.7Vy r7 = new X.7Vy
            r17 = r0
            r18 = r3
            r19 = r4
            r20 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r7
        L_0x0594:
            java.lang.Object r3 = r0.A02
            X.7Ue r3 = (X.C332237Ue) r3
            X.4DH r8 = r3.A0E
            com.instagram.common.session.UserSession r10 = r3.A0G
            X.7Tn r2 = r3.A0H
            X.4DU r9 = r2.A08
            r1 = 6
            X.AtI r13 = new X.AtI
            r13.<init>((java.lang.Object) r3, (int) r1)
            java.lang.Object r14 = r0.A01
            X.0sa r14 = (X.C62320sa) r14
            X.7SM r11 = r2.A06
            android.os.Bundle r1 = r2.A00
            java.lang.String r0 = "bundle_extra_is_thread_launched_via_fragment"
            boolean r15 = r1.getBoolean(r0)
            java.lang.String r0 = "DirectThreadFragment.DIRECT_THREAD_FRAGMENT_ARGUMENT_SOURCE_MEDIA_ID"
            java.lang.String r12 = r1.getString(r0)
            java.lang.String r0 = "bundle_extra_is_navigating_from_ctd_ad"
            boolean r16 = r1.getBoolean(r0)
            r0 = 0
            X.0qQ.A0B(r8, r0)
            r0 = 4
            X.0qQ.A0B(r14, r0)
            X.7VV r7 = new X.7VV
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r7
        L_0x05ce:
            java.lang.Object r1 = r0.A02
            X.7Tw r1 = (X.C332157Tw) r1
            X.7Tn r1 = r1.A0F
            X.0sa r1 = r1.A0E
            java.lang.Object r1 = r1.invoke()
            X.4oo r1 = (X.C274644oo) r1
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1.EXs(r0)
        L_0x05ed:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x05f0:
            java.lang.Object r2 = r0.A02
            X.9H7 r2 = (X.AnonymousClass9H7) r2
            com.instagram.common.session.UserSession r1 = r2.A10
            boolean r1 = X.AnonymousClass7S3.A00(r1)
            if (r1 == 0) goto L_0x060b
            java.lang.Object r1 = r0.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131431813(0x7f0b1185, float:1.8485366E38)
            android.view.View r7 = r1.requireViewById(r0)
            X.0qQ.A0A(r7)
            return r7
        L_0x060b:
            X.2dZ r0 = r2.A04
            if (r0 == 0) goto L_0x0612
            android.view.ViewGroup r7 = r0.A0P
            return r7
        L_0x0612:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x061a:
            java.lang.Object r1 = r0.A02
            X.9H7 r1 = (X.AnonymousClass9H7) r1
            X.2dZ r1 = r1.A04
            if (r1 == 0) goto L_0x062b
            int r0 = r1.AYI()
        L_0x0626:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            return r7
        L_0x062b:
            java.lang.Object r0 = r0.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2130968588(0x7f04000c, float:1.7545834E38)
            int r0 = X.2Yu.A0G(r1, r0)
            goto L_0x0626
        L_0x063b:
            java.lang.Object r1 = r0.A01
            X.0eK r1 = (X.AnonymousClass0eK) r1
            java.lang.Object r0 = r0.A02
            X.0sa r0 = (X.C62320sa) r0
            X.P8s r7 = new X.P8s
            r7.<init>(r1, r0)
            return r7
        L_0x0649:
            java.lang.Object r1 = r0.A02
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            com.instagram.common.session.UserSession r1 = r1.A01
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            X.P9E r7 = new X.P9E
            r7.<init>(r1, r0)
            return r7
        L_0x0659:
            java.lang.Object r3 = r0.A02
            X.9H6 r3 = (X.AnonymousClass9H6) r3
            X.4DH r1 = r3.A00
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A01
            java.lang.Object r0 = r0.A01
            X.0iw r0 = (X.AnonymousClass0iw) r0
            X.P9L r7 = new X.P9L
            r7.<init>(r2, r0, r1)
            return r7
        L_0x066f:
            java.lang.Object r1 = r0.A02
            X.9H6 r1 = (X.AnonymousClass9H6) r1
            com.instagram.common.session.UserSession r3 = r1.A01
            java.lang.Object r2 = r0.A01
            r1 = 3
            X.9Na r0 = new X.9Na
            r0.<init>(r2, r1)
            X.79i r7 = new X.79i
            r7.<init>(r3, r0)
            return r7
        L_0x0683:
            java.lang.Object r4 = r0.A02
            X.9H6 r4 = (X.AnonymousClass9H6) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            java.lang.Object r2 = r0.A01
            r1 = 5
            X.PqR r0 = new X.PqR
            r0.<init>((int) r1, (java.lang.Object) r2, (java.lang.Object) r4)
            X.AcZ r7 = new X.AcZ
            r7.<init>(r0, r3)
            return r7
        L_0x0697:
            java.lang.Object r3 = r0.A02
            X.9H6 r3 = (X.AnonymousClass9H6) r3
            X.4DH r1 = r3.A00
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            com.instagram.common.session.UserSession r1 = r3.A01
            java.lang.Object r0 = r0.A01
            X.0eK r0 = (X.AnonymousClass0eK) r0
            X.P9r r7 = new X.P9r
            r7.<init>(r2, r1, r0)
            return r7
        L_0x06ad:
            X.2YP r7 = X.AnonymousClass2YP.A00
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377429Lu.invoke():java.lang.Object");
    }
}
