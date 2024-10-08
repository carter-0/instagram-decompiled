package X;

/* renamed from: X.Ivu  reason: case insensitive filesystem */
public final class C58685Ivu extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58685Ivu(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static 0t0 A00(Object obj, int i) {
        return AnonymousClass0eN.A01(new C58685Ivu(obj, i));
    }

    /* JADX WARNING: type inference failed for: r0v97, types: [X.LJo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, X.0JR] */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0311, code lost:
        if (X.182.A06(X.0Tu.A05, ((X.OZU) r11.A01).A08, 2342157434443270693L) != false) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0333, code lost:
        if (r3 == 1) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0335, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x033a, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x033b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0163, code lost:
        if (r1 == X.HMH.A02) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0195, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019c, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0314;
                case 1: goto L_0x02fa;
                case 2: goto L_0x02e8;
                case 3: goto L_0x02da;
                case 4: goto L_0x02d0;
                case 5: goto L_0x02bf;
                case 6: goto L_0x02b5;
                case 7: goto L_0x0295;
                case 8: goto L_0x0295;
                case 9: goto L_0x0295;
                case 10: goto L_0x0005;
                case 11: goto L_0x0287;
                case 12: goto L_0x0278;
                case 13: goto L_0x026c;
                case 14: goto L_0x0201;
                case 15: goto L_0x033d;
                case 16: goto L_0x01fa;
                case 17: goto L_0x01f3;
                case 18: goto L_0x000d;
                case 19: goto L_0x01e1;
                case 20: goto L_0x01cd;
                case 21: goto L_0x01bb;
                case 22: goto L_0x01a9;
                case 23: goto L_0x018b;
                case 24: goto L_0x0167;
                case 25: goto L_0x0156;
                case 26: goto L_0x014b;
                case 27: goto L_0x013c;
                case 28: goto L_0x012d;
                case 29: goto L_0x0114;
                case 30: goto L_0x0005;
                case 31: goto L_0x010a;
                case 32: goto L_0x00fa;
                case 33: goto L_0x033d;
                case 34: goto L_0x01fa;
                case 35: goto L_0x01f3;
                case 36: goto L_0x00ea;
                case 37: goto L_0x00de;
                case 38: goto L_0x00d2;
                case 39: goto L_0x00c7;
                case 40: goto L_0x00b7;
                case 41: goto L_0x0090;
                case 42: goto L_0x033d;
                case 43: goto L_0x01fa;
                case 44: goto L_0x01f3;
                case 45: goto L_0x007e;
                case 46: goto L_0x0074;
                case 47: goto L_0x0049;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A01
            X.DbS.A1U(r0)
            X.0gF r2 = X.C60340gF.A00
        L_0x000c:
            return r2
        L_0x000d:
            java.lang.Object r4 = r11.A01
            X.H1q r4 = (X.C54171H1q) r4
            X.1Xj r2 = r4.A05
            if (r2 == 0) goto L_0x0047
            int r1 = r4.A00
            X.0eM r0 = r4.A0P
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r1 = X.I7Q.A09(r0, r2, r1)
        L_0x0021:
            X.0eM r0 = r4.A0P
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            boolean r7 = X.I7Q.A08(r0)
            android.content.Context r3 = r4.requireContext()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            X.GiB r2 = new X.GiB
            r5 = r4
            r2.<init>(r3, r4, r5, r6, r7)
            X.1Xj r0 = r4.A05
            if (r0 == 0) goto L_0x000c
            r0.A3i()
            java.util.List r0 = r0.A3i()
            r2.A00 = r0
            return r2
        L_0x0047:
            r1 = 0
            goto L_0x0021
        L_0x0049:
            java.lang.Object r0 = r11.A01
            X.Gh9 r0 = (X.C53018Gh9) r0
            X.C53018Gh9.A00(r0)
            X.05G r5 = r0.A01
        L_0x0052:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            X.Jw1 r3 = (X.C61063Jw1) r3
            java.lang.Object r1 = r3.A03
            java.util.Collection r1 = (java.util.Collection) r1
            X.Hyp r0 = X.C56457Hyp.A00
            java.util.ArrayList r2 = X.00k.A0T(r0, r1)
            java.lang.Object r1 = r3.A02
            X.JwL r1 = (X.C61083JwL) r1
            int r0 = r3.A01
            X.Jw1 r0 = X.C61063Jw1.A00(r1, r2, r0)
            boolean r0 = r5.AIY(r4, r0)
            if (r0 == 0) goto L_0x0052
            goto L_0x00b4
        L_0x0074:
            java.lang.Object r0 = r11.A01
            X.Gh9 r0 = (X.C53018Gh9) r0
            X.C53018Gh9.A00(r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x007e:
            java.lang.Object r2 = r11.A01
            X.H0s r2 = (X.C54148H0s) r2
            X.0eM r0 = r2.A04
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.schools.management.data.SchoolSettingsRepository r0 = r2.A01
            X.H68 r2 = new X.H68
            r2.<init>(r1, r0)
            return r2
        L_0x0090:
            java.lang.Object r1 = r11.A01
            X.H0s r1 = (X.C54148H0s) r1
            X.0eM r0 = r1.A03
            X.INA r0 = X.C51966G9m.A0z(r0)
            X.HOd r2 = r1.A00
            X.0wc r1 = X.INA.A01(r0, r2)
            java.lang.String r0 = "ig_school_reliability_grad_date_picker_dismiss"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00b4
            X.C51965G9l.A1B(r2, r1)
            X.HOp r0 = X.C54684HOp.UPDATE_GRADUATION
            X.C51974G9v.A0j(r0, r1)
        L_0x00b4:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x00b7:
            java.lang.Object r0 = r11.A01
            X.H0s r0 = (X.C54148H0s) r0
            X.0eM r0 = r0.A04
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.INA r2 = new X.INA
            r2.<init>(r0)
            return r2
        L_0x00c7:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.6ST r2 = X.DbV.A0h(r0)
            return r2
        L_0x00d2:
            java.lang.Object r0 = r11.A01
            com.instagram.schools.management.data.SchoolSettingsRepository r0 = (com.instagram.schools.management.data.SchoolSettingsRepository) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.INA r2 = new X.INA
            r2.<init>(r0)
            return r2
        L_0x00de:
            java.lang.Object r0 = r11.A01
            X.HDX r0 = (X.HDX) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.INA r2 = new X.INA
            r2.<init>(r0)
            return r2
        L_0x00ea:
            java.lang.Object r0 = r11.A01
            X.H0q r0 = (X.C54146H0q) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.H5h r2 = new X.H5h
            r2.<init>(r0)
            return r2
        L_0x00fa:
            java.lang.Object r0 = r11.A01
            X.H0q r0 = (X.C54146H0q) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.INA r2 = new X.INA
            r2.<init>(r0)
            return r2
        L_0x010a:
            java.lang.Object r0 = r11.A01
            X.7Pu r0 = (X.C331157Pu) r0
            r0.A07()
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0114:
            java.lang.Object r1 = r11.A01
            X.Hqa r1 = (X.C55969Hqa) r1
            r0 = 2131972029(0x7f134fbd, float:1.9581054E38)
            android.content.Context r2 = r1.A00
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r0)
            r0 = 2131972043(0x7f134fcb, float:1.9581082E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[]{r1, r0}
            return r2
        L_0x012d:
            X.1FE r1 = new X.1FE
            r1.<init>()
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.IOk r2 = new X.IOk
            r2.<init>(r1, r0)
            return r2
        L_0x013c:
            java.lang.Object r1 = r11.A01
            com.instagram.common.session.UserSession r1 = (com.instagram.common.session.UserSession) r1
            X.LJo r0 = new X.LJo
            r0.<init>()
            X.KWw r2 = new X.KWw
            r2.<init>(r1, r0)
            return r2
        L_0x014b:
            java.lang.Object r0 = r11.A01
            X.I06 r0 = (X.I06) r0
            com.instagram.common.session.UserSession r0 = r0.A04
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            return r2
        L_0x0156:
            java.lang.Object r0 = r11.A01
            X.GcN r0 = (X.C52770GcN) r0
            X.HMH r1 = r0.A09
            if (r1 != 0) goto L_0x0161
            java.lang.String r0 = "savedFeedMode"
            goto L_0x0195
        L_0x0161:
            X.HMH r0 = X.HMH.ADD_AND_CREATE_COLLECTION
            if (r1 != r0) goto L_0x033b
            goto L_0x0335
        L_0x0167:
            java.lang.Object r1 = r11.A01
            X.H1q r1 = (X.C54171H1q) r1
            android.view.ViewStub r0 = r1.A03
            if (r0 != 0) goto L_0x0172
            java.lang.String r0 = "trayBackButtonStub"
            goto L_0x0195
        L_0x0172:
            android.view.View r2 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r2, r0)
            r0 = 2131953555(0x7f130793, float:1.9543584E38)
            java.lang.String r0 = r1.getString(r0)
            r2.setContentDescription(r0)
            r0 = 50
            X.C56802ICz.A01(r2, r0, r1)
            return r2
        L_0x018b:
            java.lang.Object r0 = r11.A01
            X.H1q r0 = (X.C54171H1q) r0
            android.view.ViewStub r0 = r0.A02
            if (r0 != 0) goto L_0x019d
            java.lang.String r0 = "newCollectionViewStub"
        L_0x0195:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x019d:
            android.view.View r1 = r0.inflate()
            r0 = 2131440654(0x7f0b340e, float:1.8503297E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x01a9:
            java.lang.Object r0 = r11.A01
            X.H1q r0 = (X.C54171H1q) r0
            X.0eM r0 = r0.A0O
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131430401(0x7f0b0c01, float:1.8482502E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x01bb:
            java.lang.Object r0 = r11.A01
            X.H1q r0 = (X.C54171H1q) r0
            X.0eM r0 = r0.A0O
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131430933(0x7f0b0e15, float:1.848358E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x01cd:
            java.lang.Object r0 = r11.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.DbV.A05(r0)
            r0 = 2131165205(0x7f070015, float:1.794462E38)
            int r0 = r1.getDimensionPixelSize(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        L_0x01e1:
            java.lang.Object r0 = r11.A01
            X.H1q r0 = (X.C54171H1q) r0
            X.0eM r0 = r0.A0O
            android.view.View r1 = X.AnonymousClass7TE.A0c(r0)
            r0 = 2131432230(0x7f0b1326, float:1.8486212E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            return r2
        L_0x01f3:
            java.lang.Object r0 = r11.A01
            X.07f r2 = X.DbY.A0I(r0)
            return r2
        L_0x01fa:
            java.lang.Object r0 = r11.A01
            java.lang.Object r2 = X.DbT.A0r(r0)
            return r2
        L_0x0201:
            java.lang.Object r3 = r11.A01
            X.H1x r3 = (X.C54177H1x) r3
            X.0eM r5 = r3.A0D
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r7 = X.C54177H1x.A00(r3)
            boolean r9 = r3.A05
            java.lang.String r1 = r3.getModuleName()
            java.lang.String r0 = "saved_collections_list"
            boolean r10 = X.0qQ.A0K(r1, r0)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            X.HMw r0 = X.C54665HMw.ALL_MEDIA_AUTO_COLLECTION
            r8.add(r0)
            X.HMw r0 = X.C54665HMw.MEDIA
            r8.add(r0)
            X.HMw r0 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            r8.add(r0)
            X.HMw r0 = X.C54665HMw.AUDIO_AUTO_COLLECTION
            r8.add(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r5)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313682199709888(0x81031a000008c0, double:3.028257074333484E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0249
            X.HMw r0 = X.C54665HMw.LOCATIONS_AUTO_COLLECTION
            r8.add(r0)
        L_0x0249:
            boolean r0 = r3.A07
            if (r0 == 0) goto L_0x025c
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r5)
            boolean r0 = X.I31.A01(r0)
            if (r0 == 0) goto L_0x025c
            X.HMw r0 = X.C54665HMw.SAVED_ENTRYPOINT_COLLECTION
            r8.add(r0)
        L_0x025c:
            boolean r0 = r3.A07
            if (r0 != 0) goto L_0x0265
            X.HMw r0 = X.C54665HMw.LIKED_COLLECTIONS
            r8.add(r0)
        L_0x0265:
            X.H6j r2 = new X.H6j
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return r2
        L_0x026c:
            java.lang.Object r0 = r11.A01
            X.Hj8 r0 = (X.C55526Hj8) r0
            com.instagram.profile.fragment.UserDetailTabController r0 = r0.A00
            r0.A0H()
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0278:
            X.0wj r0 = X.0wj.A01
            X.ON9 r1 = new X.ON9
            r1.<init>(r0)
            java.lang.String r0 = "Successfully reject call. Soft reporting error just to compare with other errors"
            r1.A01(r0)
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0287:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = r0.getApplicationContext()
            X.1Fs r2 = new X.1Fs
            r2.<init>(r0)
            return r2
        L_0x0295:
            java.lang.Object r0 = r11.A01
            X.OFb r0 = (X.C70654OFb) r0
            X.0xa r2 = r0.A00
            r0 = 1172(0x494, float:1.642E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x02ae
            java.util.List r0 = X.DbX.A0x(r0)
            if (r0 != 0) goto L_0x02b0
        L_0x02ae:
            X.0sn r0 = X.0sn.A00
        L_0x02b0:
            java.util.ArrayList r2 = X.00k.A0U(r0)
            return r2
        L_0x02b5:
            java.lang.Object r0 = r11.A01
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.OFb r2 = new X.OFb
            r2.<init>(r0)
            return r2
        L_0x02bf:
            java.lang.Object r0 = r11.A01
            X.OKy r0 = (X.C70778OKy) r0
            X.5HJ r0 = r0.A00
            java.lang.String r0 = r0.A0g
            if (r0 != 0) goto L_0x02cb
            java.lang.String r0 = ""
        L_0x02cb:
            android.net.Uri r2 = X.0cp.A03(r0)
            return r2
        L_0x02d0:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            X.OWY r2 = new X.OWY
            r2.<init>(r0)
            return r2
        L_0x02da:
            java.lang.Object r0 = r11.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r0 = X.DbT.A05(r0)
            X.AIZ r2 = new X.AIZ
            r2.<init>(r0)
            return r2
        L_0x02e8:
            java.lang.Object r0 = r11.A01
            X.OZU r0 = (X.OZU) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 37158850159771738(0x8403c70009005a, double:3.5627446954948114E-306)
            java.lang.Double r2 = X.C51968G9o.A0r(r2, r3, r0)
            return r2
        L_0x02fa:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x033b
            java.lang.Object r0 = r11.A01
            X.OZU r0 = (X.OZU) r0
            com.instagram.common.session.UserSession r3 = r0.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342157434443270693(0x208103c700080a25, double:4.0608589478129624E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x033b
            goto L_0x0335
        L_0x0314:
            java.lang.Object r1 = r11.A01
            X.OZU r1 = (X.OZU) r1
            com.facebook.rsys.audiomodule.gen.AudioModule r0 = r1.A06
            if (r0 == 0) goto L_0x033b
            com.instagram.common.session.UserSession r3 = r1.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36592000375455848(0x82003b00000068, double:3.2042666093725695E-306)
            long r3 = X.182.A01(r2, r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1 = 1
            if (r0 == 0) goto L_0x033b
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x033b
        L_0x0335:
            r0 = 1
        L_0x0336:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x033b:
            r0 = 0
            goto L_0x0336
        L_0x033d:
            java.lang.Object r2 = r11.A01
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58685Ivu.invoke():java.lang.Object");
    }
}
