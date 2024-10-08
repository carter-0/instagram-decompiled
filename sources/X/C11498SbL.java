package X;

import android.view.View;

/* renamed from: X.SbL  reason: case insensitive filesystem */
public final class C11498SbL implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C11498SbL(QFM qfm, C8008Qev qev, SUj sUj, int i) {
        this.A00 = i;
        if (3 - i != 0) {
            this.A01 = sUj;
            this.A02 = qfm;
            this.A03 = qev;
        } else {
            this.A03 = qev;
            this.A01 = sUj;
            this.A02 = qfm;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE;
        r2 = X.0cp.A03(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r2.getScheme() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0075, code lost:
        if (r2.getScheme().equals("http") != false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0081, code lost:
        if (r2.getScheme().equals("https") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0083, code lost:
        r1 = new X.SUL(r5.requireActivity(), r4, X.2EG.A1Y, r3);
        r1.A0E(r4.A06);
        r1.A0S = X.AnonymousClass000.A00(281);
        r1.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x034e, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0351, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0359, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x035c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x029c;
                case 1: goto L_0x0285;
                case 2: goto L_0x022b;
                case 3: goto L_0x01c0;
                case 4: goto L_0x0198;
                case 5: goto L_0x0178;
                case 6: goto L_0x010f;
                case 7: goto L_0x00e7;
                case 8: goto L_0x00c7;
                case 9: goto L_0x0322;
                case 10: goto L_0x02ed;
                case 11: goto L_0x009f;
                case 12: goto L_0x0051;
                case 13: goto L_0x0042;
                case 14: goto L_0x02b3;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 104276775(0x6372327, float:3.44443E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r15.A01
            android.view.View r3 = (android.view.View) r3
            int r2 = r3.getVisibility()
            r1 = 0
            if (r2 != 0) goto L_0x0019
            r1 = 8
        L_0x0019:
            r3.setVisibility(r1)
            java.lang.Object r4 = r15.A02
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r3 = r3.getVisibility()
            java.lang.Object r1 = r15.A03
            android.view.View r1 = (android.view.View) r1
            android.content.res.Resources r2 = r1.getResources()
            r1 = 2131953401(0x7f1306f9, float:1.9543272E38)
            if (r3 != 0) goto L_0x0034
            r1 = 2131953399(0x7f1306f7, float:1.9543268E38)
        L_0x0034:
            java.lang.String r1 = r2.getString(r1)
            r4.setText(r1)
            r1 = -1770427544(0xffffffff96796b68, float:-2.0147951E-25)
        L_0x003e:
            X.AnonymousClass0fD.A0C(r1, r0)
        L_0x0041:
            return
        L_0x0042:
            java.lang.Object r5 = r15.A01
            X.E44 r5 = (X.E44) r5
            java.lang.Object r4 = r15.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r0 = r15.A03
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$AttributedAsset r0 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution.AttributedAsset) r0
            java.lang.String r3 = r0.mAssetURL
            goto L_0x005f
        L_0x0051:
            java.lang.Object r5 = r15.A01
            X.E44 r5 = (X.E44) r5
            java.lang.Object r4 = r15.A02
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.Object r0 = r15.A03
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$License r0 = (com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution.License) r0
            java.lang.String r3 = r0.mUrl
        L_0x005f:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.net.Uri r2 = X.0cp.A03(r3)
            java.lang.String r0 = r2.getScheme()
            if (r0 == 0) goto L_0x0041
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "http"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x0083:
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            X.2EG r0 = X.2EG.A1Y
            X.SUL r1 = new X.SUL
            r1.<init>(r2, r4, r0, r3)
            java.lang.String r0 = r4.A06
            r1.A0E(r0)
            r0 = 281(0x119, float:3.94E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A0S = r0
            r1.A0A()
            return
        L_0x009f:
            r0 = 1551132837(0x5c7468a5, float:2.75179809E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A02
            X.Qf5 r2 = (X.C8018Qf5) r2
            com.facebookpay.widget.listcell.ListCell r1 = r2.A02
            java.lang.String r1 = r1.getErrorText()
            if (r1 != 0) goto L_0x00b7
            X.Q9K r1 = r2.A03
            r1.A00()
        L_0x00b7:
            java.lang.Object r1 = r15.A03
            X.Qf0 r1 = (X.C8013Qf0) r1
            X.0sP r2 = r1.A06
            java.lang.Object r1 = r15.A01
            r2.invoke(r1)
            r1 = 139795906(0x8551dc2, float:6.4132336E-34)
            goto L_0x003e
        L_0x00c7:
            r0 = 1195930357(0x474872f5, float:51314.957)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A02
            X.QFO r1 = (X.QFO) r1
            X.Q9K r1 = r1.A02
            r1.A00()
            java.lang.Object r1 = r15.A03
            X.Qex r1 = (X.C8010Qex) r1
            X.0sP r2 = r1.A04
            java.lang.Object r1 = r15.A01
            r2.invoke(r1)
            r1 = -1785949221(0xffffffff958c93db, float:-5.6778824E-26)
            goto L_0x003e
        L_0x00e7:
            r0 = 1166080479(0x4580f9df, float:4127.234)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.SUj r2 = (X.SUj) r2
            boolean r1 = X.SUj.A0V(r2)
            if (r1 == 0) goto L_0x0101
            java.lang.Object r1 = r15.A02
            X.QFN r1 = (X.QFN) r1
            X.Q9K r1 = r1.A02
            r1.A00()
        L_0x0101:
            java.lang.Object r1 = r15.A03
            X.Qew r1 = (X.C8009Qew) r1
            X.0sP r1 = r1.A04
            r1.invoke(r2)
            r1 = -35623892(0xfffffffffde06c2c, float:-3.7288591E37)
            goto L_0x003e
        L_0x010f:
            r0 = 343956446(0x14805bde, float:1.2960932E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r15.A03
            X.Qew r8 = (X.C8009Qew) r8
            X.0sK r5 = r8.A05
            java.lang.Object r7 = r15.A01
            X.SUj r7 = (X.SUj) r7
            java.lang.Object r4 = r7.A01
            r1 = r4
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r1
            if (r1 == 0) goto L_0x0176
            java.lang.String r1 = r1.A04
            java.lang.Long r3 = X.DbV.A0q(r1)
        L_0x012d:
            java.lang.String r2 = "user_remove_contact_enter"
            java.lang.String r1 = "remove_phone"
            r5.invoke(r2, r1, r3)
            if (r4 == 0) goto L_0x0171
            java.lang.Object r2 = r15.A02
            X.QFN r2 = (X.QFN) r2
            com.facebookpay.widget.listcell.ListCell r1 = r2.A01
            android.content.Context r5 = X.AnonymousClass7TE.A0S(r1)
            r6 = 24
            X.Iw5 r4 = new X.Iw5
            r4.<init>(r6, r7, r2, r8)
            X.TVw r3 = new X.TVw
            r3.<init>(r6, r7, r8)
            r13 = 0
            r14 = 2
            X.SIG r2 = X.AnonymousClass2E0.A0H()
            r9 = 2131961320(0x7f1325e8, float:1.9559334E38)
            r10 = 2131961319(0x7f1325e7, float:1.9559332E38)
            r11 = 2131961310(0x7f1325de, float:1.9559313E38)
            r12 = 2131961303(0x7f1325d7, float:1.95593E38)
            r1 = 23
            X.SVE r7 = X.SVE.A00(r4, r1)
            X.SVE r8 = X.SVE.A00(r3, r6)
            X.SOk r1 = X.SA0.A00(r7, r8, r9, r10, r11, r12, r13, r14)
            X.SIG.A00(r5, r1, r2)
        L_0x0171:
            r1 = 2091208543(0x7ca54f5f, float:6.8667105E36)
            goto L_0x003e
        L_0x0176:
            r3 = 0
            goto L_0x012d
        L_0x0178:
            r0 = 1026092921(0x3d28ef79, float:0.041244004)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A02
            X.QFC r1 = (X.QFC) r1
            X.Q9K r1 = r1.A01
            r1.A00()
            java.lang.Object r1 = r15.A03
            X.Qef r1 = (X.C7992Qef) r1
            X.0sP r2 = r1.A00
            java.lang.Object r1 = r15.A01
            r2.invoke(r1)
            r1 = 1915281030(0x7228de86, float:3.3447997E30)
            goto L_0x003e
        L_0x0198:
            r0 = 1209578725(0x4818b4e5, float:156371.58)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.SUj r2 = (X.SUj) r2
            boolean r1 = X.SUj.A0V(r2)
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = r15.A02
            X.QFM r1 = (X.QFM) r1
            X.Q9K r1 = r1.A02
            r1.A00()
        L_0x01b2:
            java.lang.Object r1 = r15.A03
            X.Qev r1 = (X.C8008Qev) r1
            X.0sP r1 = r1.A04
            r1.invoke(r2)
            r1 = -124432299(0xfffffffff8955055, float:-2.4227549E34)
            goto L_0x003e
        L_0x01c0:
            r0 = 72163741(0x44d219d, float:2.4113069E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r15.A03
            X.Qev r8 = (X.C8008Qev) r8
            X.0sK r5 = r8.A05
            java.lang.Object r7 = r15.A01
            X.SUj r7 = (X.SUj) r7
            java.lang.Object r4 = r7.A01
            r1 = r4
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r1 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r1
            if (r1 == 0) goto L_0x0229
            java.lang.String r1 = r1.A04
            java.lang.Long r3 = X.DbV.A0q(r1)
        L_0x01de:
            java.lang.String r2 = "user_remove_contact_enter"
            java.lang.String r1 = "remove_email"
            r5.invoke(r2, r1, r3)
            if (r4 == 0) goto L_0x0224
            java.lang.Object r2 = r15.A02
            X.QFM r2 = (X.QFM) r2
            com.facebookpay.widget.listcell.ListCell r1 = r2.A01
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r1)
            r6 = 22
            X.Iw5 r5 = new X.Iw5
            r5.<init>(r6, r7, r2, r8)
            r1 = 23
            X.TVw r3 = new X.TVw
            r3.<init>(r1, r7, r8)
            r11 = 0
            r12 = 2
            X.SIG r2 = X.AnonymousClass2E0.A0H()
            r7 = 2131961316(0x7f1325e4, float:1.9559325E38)
            r8 = 2131961315(0x7f1325e3, float:1.9559323E38)
            r9 = 2131961310(0x7f1325de, float:1.9559313E38)
            r10 = 2131961303(0x7f1325d7, float:1.95593E38)
            r1 = 21
            X.SVE r5 = X.SVE.A00(r5, r1)
            X.SVE r6 = X.SVE.A00(r3, r6)
            X.SOk r1 = X.SA0.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.SIG.A00(r4, r1, r2)
        L_0x0224:
            r1 = 694584600(0x29668518, float:5.11857E-14)
            goto L_0x003e
        L_0x0229:
            r3 = 0
            goto L_0x01de
        L_0x022b:
            r0 = -561701805(0xffffffffde851c53, float:-4.7958163E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A02
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r2
            r3 = -1
            r4 = 0
            if (r2 == 0) goto L_0x0283
            int r1 = r2.A00
            if (r1 == r3) goto L_0x0283
            android.view.View r1 = r2.requireViewById(r1)
            java.lang.Object r5 = r1.getTag()
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r5 = (com.facebook.browser.lite.extensions.autofill.model.AutofillData) r5
        L_0x0248:
            java.lang.Object r2 = r15.A03
            com.instagram.ui.widget.radiogroup.IgRadioGroup r2 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r2
            if (r2 == 0) goto L_0x025a
            int r1 = r2.A00
            if (r1 == r3) goto L_0x025a
            android.view.View r1 = r2.requireViewById(r1)
            X.QA1 r1 = (X.QA1) r1
            com.fbpay.w3c.CardDetails r4 = r1.A00
        L_0x025a:
            java.lang.Object r3 = r15.A01
            X.QKJ r3 = (X.QKJ) r3
            X.STY r2 = r3.A01
            if (r2 == 0) goto L_0x026a
            if (r5 != 0) goto L_0x027d
            if (r4 != 0) goto L_0x027d
            r1 = 0
        L_0x0267:
            r2.A0E(r1)
        L_0x026a:
            X.4gR r1 = r3.A00
            if (r1 == 0) goto L_0x0275
            X.RzL r1 = r1.A00
            X.Tnz r2 = r1.A0A
            r1 = 1
            r2.A00 = r1
        L_0x0275:
            r3.A07()
            r1 = 668917952(0x27dee0c0, float:6.1861052E-15)
            goto L_0x003e
        L_0x027d:
            X.SGp r1 = new X.SGp
            r1.<init>(r5, r4)
            goto L_0x0267
        L_0x0283:
            r5 = r4
            goto L_0x0248
        L_0x0285:
            r0 = -1577620821(0xffffffffa1f76aab, float:-1.6765606E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A02
            X.TcN r2 = (X.C13551TcN) r2
            java.lang.Object r1 = r15.A03
            X.SOg r1 = (X.C11347SOg) r1
            r2.D1z(r1)
            r1 = -389398361(0xffffffffe8ca40a7, float:-7.640885E24)
            goto L_0x003e
        L_0x029c:
            r0 = -1463153764(0xffffffffa8ca0b9c, float:-2.243154E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A02
            X.TcN r2 = (X.C13551TcN) r2
            java.lang.Object r1 = r15.A03
            X.SOg r1 = (X.C11347SOg) r1
            r2.D1z(r1)
            r1 = -1926536887(0xffffffff8d2b6149, float:-5.2810546E-31)
            goto L_0x003e
        L_0x02b3:
            r0 = 911216765(0x3650107d, float:3.1004013E-6)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r15.A02
            X.TeZ r1 = (X.TeZ) r1
            java.lang.Object r0 = r15.A03
            com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData r0 = (com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData) r0
            r1.Cx8(r0)
            java.lang.Object r0 = r15.A01
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "input_method"
            java.lang.Object r2 = r1.getSystemService(r0)
            r2.getClass()
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.view.View r0 = r1.getCurrentFocus()
            r0.getClass()
            android.os.IBinder r1 = r0.getWindowToken()
            r0 = 0
            r2.hideSoftInputFromWindow(r1, r0)
            r0 = 7628685(0x74678d, float:1.0690065E-38)
            goto L_0x034e
        L_0x02ed:
            r0 = -1331521068(0xffffffffb0a299d4, float:-1.1830772E-9)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.SUj r2 = (X.SUj) r2
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x031a
            com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionPhoneNumberViewItem) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x030d
            java.lang.Object r0 = r15.A02
            X.QFT r0 = (X.QFT) r0
            X.Q9K r0 = r0.A02
            r0.A00()
        L_0x030d:
            java.lang.Object r0 = r15.A03
            X.Qed r0 = (X.C7990Qed) r0
            X.0sP r0 = r0.A00
            r0.invoke(r2)
            r0 = 2095978903(0x7cee1997, float:9.8902854E36)
            goto L_0x034e
        L_0x031a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -2061428267(0xffffffff852119d5, float:-7.574928E-36)
            goto L_0x0359
        L_0x0322:
            r0 = -886160237(0xffffffffcb2e4493, float:-1.1420819E7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r15.A01
            X.SUj r2 = (X.SUj) r2
            java.lang.Object r0 = r2.A01
            if (r0 == 0) goto L_0x0352
            com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem r0 = (com.facebookpay.common.recyclerview.adapteritems.SelectionEmailViewItem) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0342
            java.lang.Object r0 = r15.A02
            X.QFR r0 = (X.QFR) r0
            X.Q9K r0 = r0.A02
            r0.A00()
        L_0x0342:
            java.lang.Object r0 = r15.A03
            X.Qea r0 = (X.C7987Qea) r0
            X.0sP r0 = r0.A00
            r0.invoke(r2)
            r0 = -1640267997(0xffffffff9e3b7f23, float:-9.925989E-21)
        L_0x034e:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0352:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1740180864(0xffffffff9846f280, float:-2.5713331E-24)
        L_0x0359:
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11498SbL.onClick(android.view.View):void");
    }

    public C11498SbL(QFN qfn, C8009Qew qew, SUj sUj, int i) {
        this.A00 = i;
        if (6 - i != 0) {
            this.A01 = sUj;
            this.A02 = qfn;
            this.A03 = qew;
        } else {
            this.A03 = qew;
            this.A01 = sUj;
            this.A02 = qfn;
        }
    }

    public C11498SbL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
    }
}
