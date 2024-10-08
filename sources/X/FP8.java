package X;

import android.view.View;

public final class FP8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public FP8(E5N e5n, int i) {
        this.A00 = i;
        if (36 - i != 0) {
            this.A01 = e5n;
        } else {
            this.A01 = e5n;
        }
    }

    public static FP8 A00(Object obj, int i) {
        return new FP8(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new FP8(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [X.07Z, X.E4p, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0539, code lost:
        if (r7.length() == 0) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x09d3, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x09da, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0a6b, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0a6e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0b2d, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0b30, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0b57, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0b5a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0439, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x043c, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0822  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0208  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r17) {
        /*
            r16 = this;
            r1 = r16
            int r0 = r1.A00
            r3 = r17
            switch(r0) {
                case 0: goto L_0x0b7d;
                case 1: goto L_0x0b63;
                case 2: goto L_0x0b7d;
                case 3: goto L_0x0009;
                case 4: goto L_0x0b63;
                case 5: goto L_0x0009;
                case 6: goto L_0x0b7d;
                case 7: goto L_0x0b63;
                case 8: goto L_0x0b7d;
                case 9: goto L_0x0b7d;
                case 10: goto L_0x0009;
                case 11: goto L_0x0b63;
                case 12: goto L_0x0009;
                case 13: goto L_0x0b5b;
                case 14: goto L_0x0b5b;
                case 15: goto L_0x0009;
                case 16: goto L_0x0b5b;
                case 17: goto L_0x0b46;
                case 18: goto L_0x0b34;
                case 19: goto L_0x0b04;
                case 20: goto L_0x0ac0;
                case 21: goto L_0x0aa9;
                case 22: goto L_0x0a94;
                case 23: goto L_0x0a83;
                case 24: goto L_0x0a72;
                case 25: goto L_0x0925;
                case 26: goto L_0x0912;
                case 27: goto L_0x08a2;
                case 28: goto L_0x0891;
                case 29: goto L_0x086e;
                case 30: goto L_0x07e9;
                case 31: goto L_0x0733;
                case 32: goto L_0x09b9;
                case 33: goto L_0x06f4;
                case 34: goto L_0x06b3;
                case 35: goto L_0x060b;
                case 36: goto L_0x0603;
                case 37: goto L_0x05e8;
                case 38: goto L_0x05d5;
                case 39: goto L_0x0489;
                case 40: goto L_0x0474;
                case 41: goto L_0x0448;
                case 42: goto L_0x040d;
                case 43: goto L_0x03ae;
                case 44: goto L_0x0362;
                case 45: goto L_0x034c;
                case 46: goto L_0x032f;
                case 47: goto L_0x0312;
                case 48: goto L_0x02f3;
                case 49: goto L_0x02d4;
                case 50: goto L_0x02b5;
                case 51: goto L_0x0296;
                case 52: goto L_0x028e;
                case 53: goto L_0x0273;
                case 54: goto L_0x0258;
                case 55: goto L_0x023d;
                case 56: goto L_0x021e;
                case 57: goto L_0x018d;
                case 58: goto L_0x0150;
                case 59: goto L_0x013f;
                case 60: goto L_0x011c;
                case 61: goto L_0x010b;
                case 62: goto L_0x00fa;
                case 63: goto L_0x00e9;
                case 64: goto L_0x00d3;
                case 65: goto L_0x00b4;
                case 66: goto L_0x0095;
                case 67: goto L_0x0076;
                case 68: goto L_0x0057;
                case 69: goto L_0x002c;
                case 70: goto L_0x0011;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            r0.DU3()
            return
        L_0x0011:
            r0 = -539750160(0xffffffffdfd410f0, float:-3.0561955E19)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E7R r0 = (X.E7R) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Jfm r0 = (X.C60106Jfm) r0
            r0.A0F()
            r0 = 812116675(0x3067eac3, float:8.4370927E-10)
            goto L_0x0439
        L_0x002c:
            r0 = 44101265(0x2a0ee91, float:2.3646817E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E4b r0 = (X.C47477E4b) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A0O
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.6Yo r2 = X.DbS.A0M(r1, r0)
            X.F3X r1 = X.FC8.A00()
            java.lang.String r0 = "content_preview_placeholder"
            X.Ubn r0 = r1.A00(r0)
            X.Dba.A12(r0, r2)
            r0 = 490834677(0x1d418af5, float:2.5615176E-21)
            goto L_0x0439
        L_0x0057:
            r0 = -1933133236(0xffffffff8cc6ba4c, float:-3.0618854E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ERW r0 = (X.ERW) r0
            java.lang.String r1 = r0.A03
            if (r1 != 0) goto L_0x006a
            java.lang.String r0 = "prompts"
            goto L_0x09d3
        L_0x006a:
            android.content.Context r0 = r0.getContext()
            X.C48300EcJ.A00(r0, r1)
            r0 = -2108973194(0xffffffff824b9f76, float:-1.4959848E-37)
            goto L_0x0439
        L_0x0076:
            r0 = 768454202(0x2dcdae3a, float:2.3383174E-11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ERW r0 = (X.ERW) r0
            java.lang.String r1 = r0.A01
            if (r1 != 0) goto L_0x0089
            java.lang.String r0 = "mediaEligibility"
            goto L_0x09d3
        L_0x0089:
            android.content.Context r0 = r0.getContext()
            X.C48300EcJ.A00(r0, r1)
            r0 = -321681696(0xffffffffecd386e0, float:-2.0457622E27)
            goto L_0x0439
        L_0x0095:
            r0 = 1193114610(0x471d7bf2, float:40315.945)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ERW r0 = (X.ERW) r0
            java.lang.String r1 = r0.A02
            if (r1 != 0) goto L_0x00a8
            java.lang.String r0 = "mediaId"
            goto L_0x09d3
        L_0x00a8:
            android.content.Context r0 = r0.getContext()
            X.C48300EcJ.A00(r0, r1)
            r0 = -1704443102(0xffffffff9a684322, float:-4.8030705E-23)
            goto L_0x0439
        L_0x00b4:
            r0 = -376818974(0xffffffffe98a32e2, float:-2.0884006E25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.ERW r0 = (X.ERW) r0
            java.lang.String r1 = r0.A00
            if (r1 != 0) goto L_0x00c7
            java.lang.String r0 = "cddEnabled"
            goto L_0x09d3
        L_0x00c7:
            android.content.Context r0 = r0.getContext()
            X.C48300EcJ.A00(r0, r1)
            r0 = 250804305(0xef2f851, float:5.9896726E-30)
            goto L_0x0439
        L_0x00d3:
            r0 = -2093090794(0xffffffff833df816, float:-5.5826897E-37)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbS.A1D(r0)
            X.DbT.A1J(r0)
            r0 = -716329938(0xffffffffd54dac2e, float:-1.41337119E13)
            goto L_0x0439
        L_0x00e9:
            r0 = -781478535(0xffffffffd16b9579, float:-6.3239066E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dbb.A1S(r1)
            r1 = -18908557(0xfffffffffedf7a73, float:-1.4852682E38)
            goto L_0x0b57
        L_0x00fa:
            r0 = 2090815559(0x7c9f5047, float:6.6176273E36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1265693877(0x4b70f4b5, float:1.5791285E7)
            goto L_0x0439
        L_0x010b:
            r0 = -662895575(0xffffffffd87d0429, float:-1.11277724E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Dba.A1Q(r0)
            r0 = 1977755478(0x75e22756, float:5.7336764E32)
            goto L_0x0439
        L_0x011c:
            r0 = -91475690(0xfffffffffa8c3116, float:-3.6395857E35)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.EAv r6 = (X.C47635EAv) r6
            com.instagram.common.session.UserSession r5 = r6.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.EWD r2 = X.C47635EAv.A04
            r1 = 0
            r0 = 0
            android.os.Bundle r2 = X.C343547qO.A00(r1, r2, r0)
            android.app.Activity r1 = r6.A00
            java.lang.String r0 = "nametag"
            X.Dbb.A0i(r1, r2, r5, r4, r0)
            r0 = 1527527567(0x5b0c388f, float:3.9468684E16)
            goto L_0x0439
        L_0x013f:
            r0 = -1600269206(0xffffffffa09dd46a, float:-2.6737398E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dbb.A1S(r1)
            r1 = 498860488(0x1dbc01c8, float:4.9765027E-21)
            goto L_0x0b57
        L_0x0150:
            r0 = -1263305066(0xffffffffb4b37e96, float:-3.3433452E-7)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.E4B r2 = (X.E4B) r2
            X.0eM r6 = r2.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            r0 = 1
            X.C48884Elk.A00(r1, r0)
            X.6Yo r5 = X.DbZ.A0P(r2, r6)
            r5.A0F = r0
            X.1ZQ r0 = X.C48883Elj.A00()
            X.1ZR r4 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            X.DbS.A1X(r2)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            androidx.fragment.app.Fragment r0 = r4.A00(r2, r1, r0)
            r5.A0D(r0)
            r5.A04()
            r0 = -1476721115(0xffffffffa7fb0625, float:-6.9673157E-15)
            goto L_0x0439
        L_0x018d:
            r0 = 1992408429(0x76c1bd6d, float:1.9647565E33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E0Q r5 = (X.E0Q) r5
            boolean r7 = r5 instanceof X.EKH
            X.0hq r0 = r5.getParentFragmentManager()
            r0.A13()
            android.os.Bundle r6 = r5.requireArguments()
            com.instagram.common.session.UserSession r4 = X.DbS.A0U(r6)
            X.2Dm r2 = X.1bJ.A00(r4)
            java.lang.String r0 = "thread_key"
            X.3sy r1 = X.C67002Mga.A00(r6, r0)
            if (r7 == 0) goto L_0x01dd
            r1.getClass()
            boolean r0 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x01d8
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r1)
            java.lang.String r1 = r0.A00
            r1.getClass()
            X.2Dr r2 = (X.2Dr) r2
            X.3U9 r2 = r2.A0N(r1)
            if (r2 != 0) goto L_0x01fe
            java.lang.String r0 = "Thread could not be found in store: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "UnsendWarningInterstitialFragment"
        L_0x01d5:
            X.0wb.A03(r0, r1)
        L_0x01d8:
            r0 = -965670996(0xffffffffc67107ac, float:-15425.918)
            goto L_0x0439
        L_0x01dd:
            if (r1 == 0) goto L_0x01d8
            boolean r0 = X.C66647MaG.A0F(r1)
            if (r0 == 0) goto L_0x01d8
            com.instagram.model.direct.DirectThreadKey r0 = X.C66647MaG.A03(r1)
            java.lang.String r1 = r0.A00
            if (r1 == 0) goto L_0x01d8
            X.2Dr r2 = (X.2Dr) r2
            X.3U9 r2 = r2.A0N(r1)
            if (r2 != 0) goto L_0x01fe
            java.lang.String r0 = "Thread could not be found in store: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "RemoveUnsendInterstitialFragment"
            goto L_0x01d5
        L_0x01fe:
            java.lang.String r0 = "entry_point"
            java.io.Serializable r1 = r6.getSerializable(r0)
            X.9rg r0 = X.C390689rg.SENDER
            if (r1 != r0) goto L_0x0213
            X.ACo r1 = new X.ACo
            r1.<init>(r5, r4)
            java.lang.String r0 = "interstitial_ok_button_clicked"
            X.C39867ACo.A00(r1, r2, r0)
            goto L_0x01d8
        L_0x0213:
            X.8xK r1 = new X.8xK
            r1.<init>(r5, r4)
            java.lang.String r0 = "interstitial_ok_button_clicked"
            X.C370948xK.A00(r1, r2, r0)
            goto L_0x01d8
        L_0x021e:
            r0 = 592564075(0x2351cf6b, float:1.1373835E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            boolean r2 = r3.hasFocus()
            if (r2 == 0) goto L_0x0238
            X.0nA.A0Q(r3)
            java.lang.Object r1 = r1.A01
            X.FbW r1 = (X.C50423FbW) r1
            X.FPM r2 = r1.A06
            r1 = 1
            r2.onFocusChange(r3, r1)
        L_0x0238:
            r1 = -1818933181(0xffffffff93954843, float:-3.7684144E-27)
            goto L_0x0b57
        L_0x023d:
            r0 = 812923413(0x30743a15, float:8.884922E-10)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FbW r0 = (X.C50423FbW) r0
            X.C50423FbW.A01(r0)
            com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText r0 = r0.A07
            r0.requestFocus()
            X.0nA.A0Q(r0)
            r0 = -887729615(0xffffffffcb165231, float:-9851441.0)
            goto L_0x0439
        L_0x0258:
            r0 = 1553620691(0x5c9a5ed3, float:3.47611254E17)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FbW r0 = (X.C50423FbW) r0
            X.C50423FbW.A01(r0)
            com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText r0 = r0.A07
            r0.requestFocus()
            X.0nA.A0Q(r0)
            r0 = -1970908318(0xffffffff8a865362, float:-1.2935096E-32)
            goto L_0x0439
        L_0x0273:
            r0 = 539946995(0x202eeff3, float:1.4817766E-19)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FbV r0 = (X.C50422FbV) r0
            X.FPM r0 = r0.A01
            java.lang.Object r0 = r0.A01
            X.FEq r0 = (X.C49916FEq) r0
            X.G99 r0 = r0.A05
            r0.Dhe()
            r0 = 1655414510(0x62ab9eee, float:1.5829227E21)
            goto L_0x0439
        L_0x028e:
            java.lang.Object r0 = r1.A01
            X.G99 r0 = (X.G99) r0
            r0.CxW(r3)
            return
        L_0x0296:
            r0 = -60419782(0xfffffffffc66113a, float:-4.7783107E36)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E0x r0 = (X.C47405E0x) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.MtN r0 = (X.C67708MtN) r0
            X.EVJ r1 = X.EVJ.NEXT_BUTTON_CLICKED
            X.2Fj r0 = r0.A00
            r0.A0B(r1)
            r0 = 1028046620(0x3d46bf1c, float:0.0485221)
            goto L_0x0439
        L_0x02b5:
            r0 = -756561759(0xffffffffd2e7c8a1, float:-4.9775172E11)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E0x r0 = (X.C47405E0x) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.MtN r0 = (X.C67708MtN) r0
            X.EVJ r1 = X.EVJ.CANCEL_BUTTON_CLICKED
            X.2Fj r0 = r0.A00
            r0.A0B(r1)
            r0 = -2090845055(0xffffffff83603c81, float:-6.589714E-37)
            goto L_0x0439
        L_0x02d4:
            r0 = 676165967(0x284d794f, float:1.1406091E-14)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E0w r0 = (X.C47404E0w) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.MtN r0 = (X.C67708MtN) r0
            X.EVJ r1 = X.EVJ.CONNECT_TO_GLASSES_BUTTON_CLICKED
            X.2Fj r0 = r0.A00
            r0.A0B(r1)
            r0 = -1897647066(0xffffffff8ee43426, float:-5.6256557E-30)
            goto L_0x0439
        L_0x02f3:
            r0 = -157644862(0xfffffffff69a87c2, float:-1.5671235E33)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E0w r0 = (X.C47404E0w) r0
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.MtN r0 = (X.C67708MtN) r0
            X.EVJ r1 = X.EVJ.CANCEL_BUTTON_CLICKED
            X.2Fj r0 = r0.A00
            r0.A0B(r1)
            r0 = -46892673(0xfffffffffd34797f, float:-1.4993243E37)
            goto L_0x0439
        L_0x0312:
            r0 = 208804677(0xc721b45, float:1.8651208E-31)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E2B r0 = (X.E2B) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A00
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A06()
            r0 = -700584122(0xffffffffd63def46, float:-5.2208842E13)
            goto L_0x0439
        L_0x032f:
            r0 = 524962349(0x1f4a4a2d, float:4.283652E-20)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E2B r0 = (X.E2B) r0
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            X.0eM r0 = r0.A00
            X.6Yo r0 = X.DbX.A0N(r1, r0)
            r0.A06()
            r0 = 1837793938(0x6d8a8292, float:5.3583476E27)
            goto L_0x0439
        L_0x034c:
            r0 = 557967036(0x2141e6bc, float:6.569632E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.Dba.A11(r1)
            X.DbZ.A15(r1)
            r1 = -831193449(0xffffffffce74fe97, float:-1.02758138E9)
            goto L_0x0b57
        L_0x0362:
            r0 = 306153433(0x123f87d9, float:6.043642E-28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.E0l r0 = (X.C47393E0l) r0
            X.Dba.A11(r0)
            X.DbZ.A15(r0)
            X.0eM r0 = r0.A00
            X.0lg r3 = X.DbY.A0R(r0)
            r0 = 6
            X.Pm0 r1 = new X.Pm0
            r1.<init>(r3, r0)
            java.lang.Class<X.ENY> r0 = X.ENY.class
            java.lang.Object r6 = r3.A01(r0, r1)
            X.ENY r6 = (X.ENY) r6
            boolean r1 = r6.A00
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1Av r5 = X.1Au.A00(r0)
            r4 = 1
            if (r1 == 0) goto L_0x03a7
            X.0s0 r3 = r5.A2t
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 424(0x1a8, float:5.94E-43)
        L_0x0398:
            X.AnonymousClass7TF.A1J(r5, r3, r1, r0, r4)
            X.G7f r0 = r6.A00
            if (r0 == 0) goto L_0x03a2
            r0.DZM()
        L_0x03a2:
            r0 = -363863320(0xffffffffea4fe2e8, float:-6.2829795E25)
            goto L_0x0b2d
        L_0x03a7:
            X.0s0 r3 = r5.A2r
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 423(0x1a7, float:5.93E-43)
            goto L_0x0398
        L_0x03ae:
            r0 = -457923303(0xffffffffe4b4a519, float:-2.6658484E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.FbD r3 = (X.C50405FbD) r3
            com.instagram.common.session.UserSession r7 = r3.A02
            X.7Zg r2 = r3.A03
            r10 = 0
            X.OdH r1 = new X.OdH
            r1.<init>(r10, r7, r2)
            X.Dri r8 = r1.A03()
            X.3t3 r1 = r8.A06
            if (r1 == 0) goto L_0x0408
            androidx.fragment.app.FragmentActivity r4 = r3.A00
            X.MmR r9 = X.C67350MmR.COLLABORATOR
            X.0iw r6 = r3.A01
            r5 = r4
            X.FFK.A00(r4, r5, r6, r7, r8, r9, r10)
            X.6gx r6 = X.C313746gw.A00(r7)
            int r5 = r8.A00
            java.lang.String r4 = X.C300965yF.A07(r1)
            java.lang.String r3 = r8.A0C
            X.1Ln r2 = X.DbT.A0J(r6)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0408
            X.DbW.A17(r2, r6)
            r1 = 259(0x103, float:3.63E-43)
            java.lang.String r1 = X.C66579MXk.A00(r1)
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "invite_collaborator_cta"
            r2.A0p(r1)
            java.lang.String r1 = "thread_view"
            java.lang.Long r1 = X.DbZ.A0b(r2, r1, r4, r3, r5)
            r2.A0i(r1)
            r2.Cgf()
        L_0x0408:
            r1 = 416870543(0x18d8f08f, float:5.6077593E-24)
            goto L_0x0b57
        L_0x040d:
            r0 = -1826344398(0xffffffff93243232, float:-2.0724458E-27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.FbE r0 = (X.C50406FbE) r0
            androidx.fragment.app.FragmentActivity r4 = r0.A00
            com.instagram.common.session.UserSession r7 = r0.A02
            X.Dri r8 = r0.A03
            X.0iw r6 = r0.A01
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r5 = r4
            X.FFK.A01(r4, r5, r6, r7, r8, r9)
            X.3t3 r0 = r8.A06
            if (r0 == 0) goto L_0x043d
            java.lang.String r2 = X.C300965yF.A07(r0)
            if (r2 == 0) goto L_0x043d
            X.NmP r1 = X.C69481NmP.ADD
            r0 = 0
            X.C70035NwD.A00(r1, r0, r7, r2)
            r0 = 2024450262(0x78aaa8d6, float:2.769109E34)
        L_0x0439:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x043d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1086719889(0x40c60791, float:6.1884236)
            X.AnonymousClass0fD.A0C(r0, r3)
            throw r1
        L_0x0448:
            r0 = 1533095905(0x5b612fe1, float:6.3384513E16)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E1P r3 = (X.E1P) r3
            X.Pt3 r0 = r3.A00
            if (r0 == 0) goto L_0x045a
            r0.E1J()
        L_0x045a:
            java.lang.Integer r1 = r3.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x046c
            X.0hq r0 = r3.getParentFragmentManager()
            r0.A13()
        L_0x0467:
            r0 = 165260930(0x9d9ae82, float:5.2404956E-33)
            goto L_0x0b2d
        L_0x046c:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0467
            X.DbT.A1K(r3)
            goto L_0x0467
        L_0x0474:
            r0 = -1401045035(0xffffffffac7dbfd5, float:-3.605995E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.EbK r1 = (X.C48239EbK) r1
            android.view.View$OnClickListener r1 = r1.A00
            r1.onClick(r3)
            r1 = -869520469(0xffffffffcc2c2bab, float:-4.5133484E7)
            goto L_0x0b57
        L_0x0489:
            r0 = 1425626701(0x54f9564d, float:8.5671579E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.E3B r3 = (X.E3B) r3
            boolean r1 = r3.A0C
            if (r1 != 0) goto L_0x04bf
            android.content.Context r1 = r3.A04()
            X.8ab r4 = X.DbS.A0Y(r1)
            r1 = 2131960743(0x7f1323a7, float:1.9558163E38)
            r4.A09(r1)
            r1 = 2131960741(0x7f1323a5, float:1.955816E38)
            r4.A08(r1)
            r2 = 2131960742(0x7f1323a6, float:1.9558161E38)
            r1 = 40
            X.C50023FJi.A02(r4, r3, r1, r2)
            r1 = 2131960740(0x7f1323a4, float:1.9558157E38)
            X.DbY.A1M(r4, r1)
        L_0x04ba:
            r1 = -72025599(0xfffffffffbb4fa01, float:-1.8793682E36)
            goto L_0x0b57
        L_0x04bf:
            X.FYk r6 = r3.A06()
            android.widget.EditText r1 = r3.A05()
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A07()
            boolean r4 = r1.isChecked()
            r5 = 0
            X.0qQ.A0B(r2, r5)
            java.lang.String r1 = r6.A05
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0500
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r1 = r6.A03
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x04f1
            if (r4 != 0) goto L_0x0500
            java.lang.Boolean r1 = r6.A03
            if (r1 != 0) goto L_0x0500
        L_0x04f1:
            android.app.Activity r1 = r3.A00
            if (r1 == 0) goto L_0x05ca
            X.0nA.A0J(r1)
            android.app.Activity r1 = r3.A00
            if (r1 == 0) goto L_0x05ca
            r1.onBackPressed()
            goto L_0x04ba
        L_0x0500:
            X.F9x r8 = r3.A08
            if (r8 == 0) goto L_0x05d1
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A07()
            boolean r1 = r1.isChecked()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            android.widget.EditText r1 = r3.A05()
            java.lang.String r7 = X.AnonymousClass7TF.A0f(r1)
            android.widget.EditText r1 = r3.A05()
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r1)
            X.FYk r1 = r3.A06()
            java.lang.Boolean r1 = r1.A03
            if (r1 != 0) goto L_0x0590
            r6 = 1
        L_0x0529:
            java.lang.String r2 = r3.A0B
            java.lang.String r1 = "inbox_qp"
            boolean r4 = X.0qQ.A0K(r2, r1)
            r15 = 0
            if (r7 == 0) goto L_0x053b
            int r2 = r7.length()
            r1 = 0
            if (r2 != 0) goto L_0x053c
        L_0x053b:
            r1 = 1
        L_0x053c:
            java.lang.Boolean r10 = X.DbT.A0l(r1)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            if (r4 == 0) goto L_0x058d
            java.lang.String r14 = "source_qp"
        L_0x054c:
            java.lang.String r13 = "welcome_message_settings_message_save_clicked"
            X.C49857F9x.A00(r8, r9, r10, r11, r12, r13, r14, r15)
            X.FYk r1 = r3.A06()
            r1.A02 = r3
            android.content.Context r4 = r3.A04()
            r1 = 2131960756(0x7f1323b4, float:1.955819E38)
            r2 = 1
            android.widget.Toast r1 = X.C59689JTv.A01(r4, r15, r1, r2)
            r3.A06 = r1
            android.widget.EditText r1 = r3.A05()
            r1.setEnabled(r5)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A07()
            r1.setEnabled(r5)
            X.FYk r7 = r3.A06()
            android.widget.EditText r1 = r3.A05()
            java.lang.String r1 = X.AnonymousClass7TF.A0f(r1)
            java.lang.String r8 = X.DbV.A12(r1)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r3.A07()
            boolean r6 = r1.isChecked()
            monitor-enter(r7)
            goto L_0x0599
        L_0x058d:
            java.lang.String r14 = "source_business_options"
            goto L_0x054c
        L_0x0590:
            java.lang.String r1 = X.E3B.A00(r3)
            boolean r6 = X.0qQ.A0K(r1, r2)
            goto L_0x0529
        L_0x0599:
            X.0qQ.A0B(r8, r5)     // Catch:{ all -> 0x05ce }
            com.instagram.common.session.UserSession r1 = r7.A08     // Catch:{ all -> 0x05ce }
            X.1NY r4 = X.AnonymousClass7TG.A0a(r1)     // Catch:{ all -> 0x05ce }
            r4.A0R = r2     // Catch:{ all -> 0x05ce }
            java.lang.Class<X.CED> r2 = X.CED.class
            java.lang.Class<X.Cyn> r1 = X.C45575Cyn.class
            r4.A0O(r15, r2, r1, r5)     // Catch:{ all -> 0x05ce }
            java.lang.String r1 = "direct_v2/welcome_message/update/"
            r4.A0A(r1)     // Catch:{ all -> 0x05ce }
            java.lang.String r1 = "welcome_message_text"
            r4.A9m(r1, r8)     // Catch:{ all -> 0x05ce }
            java.lang.String r1 = "enabled"
            r4.A0H(r1, r6)     // Catch:{ all -> 0x05ce }
            X.1OC r2 = r4.A0M()     // Catch:{ all -> 0x05ce }
            r7.A00 = r2     // Catch:{ all -> 0x05ce }
            X.EDg r1 = r7.A06     // Catch:{ all -> 0x05ce }
            r2.A00 = r1     // Catch:{ all -> 0x05ce }
            X.1ES.A03(r2)     // Catch:{ all -> 0x05ce }
            monitor-exit(r7)
            goto L_0x04f1
        L_0x05ca:
            java.lang.String r0 = "activity"
            goto L_0x09d3
        L_0x05ce:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x05d1:
            java.lang.String r0 = "directWelcomeMessageLogger"
            goto L_0x09d3
        L_0x05d5:
            r0 = 811026359(0x305747b7, float:7.831846E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E5N r1 = (X.E5N) r1
            X.E5N.A01(r1)
            r1 = -655556032(0xffffffffd8ed0240, float:-2.08475136E15)
            goto L_0x0b57
        L_0x05e8:
            r0 = -1551513308(0xffffffffa385c924, float:-1.4505075E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.02m r2 = X.02m.A0p
            r1 = 31792525(0x1e51d8d, float:8.416372E-38)
            r2.markerStart(r1)
            X.DbX.A1J(r3)
            r1 = -225163297(0xfffffffff29447df, float:-5.8740055E30)
            goto L_0x0b57
        L_0x0603:
            java.lang.Object r0 = r1.A01
            X.E5N r0 = (X.E5N) r0
            X.E5N.A01(r0)
            return
        L_0x060b:
            java.lang.Object r3 = r1.A01
            X.E5I r3 = (X.E5I) r3
            java.util.ArrayList r0 = r3.A08
            r2 = 0
            X.0qQ.A0B(r0, r2)
            java.util.Iterator r4 = X.AnonymousClass7TE.A1G(r0)
            r1 = 0
        L_0x061a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x062e
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r4)
            com.instagram.model.direct.DirectShareTarget r0 = (com.instagram.model.direct.DirectShareTarget) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L_0x061a
            r1 = 1
            goto L_0x061a
        L_0x062e:
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x06ab
            if (r1 == 0) goto L_0x06ab
            java.util.ArrayList r0 = r3.A08
            java.util.ArrayList r1 = X.FFJ.A01(r0)
            java.util.ArrayList r0 = r3.A09
            r1.addAll(r0)
            X.5gg r6 = new X.5gg
            r6.<init>(r1)
            X.Mi7 r0 = r3.A04
            if (r0 == 0) goto L_0x068a
            r0.A0A(r6, r2)
            X.Mi7 r8 = r3.A04
            java.util.ArrayList r0 = r3.A08
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r0)
            java.util.ArrayList r0 = r3.A09
            X.0qQ.A0B(r0, r2)
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            java.util.Iterator r4 = r0.iterator()
        L_0x0660:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x067e
            java.lang.Object r2 = r4.next()
            com.instagram.pendingmedia.model.recipients.PendingRecipient r2 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2
            java.util.List r0 = X.AnonymousClass7TE.A1I(r2)
            X.5gg r1 = new X.5gg
            r1.<init>(r0)
            com.instagram.model.direct.DirectShareTarget r0 = new com.instagram.model.direct.DirectShareTarget
            r0.<init>((X.C254783t2) r1, (com.instagram.pendingmedia.model.recipients.PendingRecipient) r2)
            r5.add(r0)
            goto L_0x0660
        L_0x067e:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r5)
            r7.addAll(r0)
            r0 = 0
            r8.A09 = r7
            r8.A08 = r0
        L_0x068a:
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            r2.getClass()
            com.instagram.common.session.UserSession r1 = r3.A02
            r0 = 260(0x104, float:3.64E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.1pE r1 = X.1pE.A01(r2, r3, r1, r0)
            r1.A0B = r6
            r0 = 1
            r1.A0q = r0
            r1.A01 = r3
            r1.A0v = r0
            r0 = 7
            X.C50399Fb7.A00(r1, r3, r0)
            return
        L_0x06ab:
            X.FBR r1 = r3.A03
            java.util.ArrayList r0 = r3.A08
            r1.A01(r0)
            return
        L_0x06b3:
            r0 = 1922503607(0x729713b7, float:5.984777E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.P2w r6 = (X.C72357P2w) r6
            java.lang.String r2 = r6.A03
            java.lang.String r1 = "target_user_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            java.lang.String r2 = "referer_type"
            java.lang.String r1 = "DirectThreadDetails"
            java.util.HashMap r2 = X.Dbb.A0e(r2, r1, r3)
            r1 = 45
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DiU r5 = X.C46649DiU.A04(r1, r2)
            androidx.fragment.app.FragmentActivity r4 = r6.A01
            com.instagram.common.session.UserSession r1 = r6.A02
            com.instagram.bloks.hosting.IgBloksScreenConfig r3 = X.DbS.A0N(r1)
            android.content.Context r2 = r6.A00
            r1 = 2131951988(0x7f130174, float:1.9540406E38)
            X.DbS.A18(r2, r3, r1)
            java.lang.String r1 = "account_transparency_bloks"
            r3.A0R = r1
            X.C46649DiU.A07(r4, r3, r5)
            r1 = 1456469911(0x56cff797, float:1.14331149E14)
            goto L_0x0b57
        L_0x06f4:
            r0 = 1428589610(0x55268c2a, float:1.14450581E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.Object r3 = r1.A01
            X.P2U r3 = (X.P2U) r3
            X.N4P r1 = r3.A02
            java.util.List r1 = r1.A0T
            java.util.List r1 = X.00k.A0a(r1)
            java.util.ArrayList r2 = X.C330397Mp.A05(r1)
            r1 = 94
            java.lang.String r1 = X.C66579MXk.A00(r1)
            r4.putParcelableArrayList(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r3.A00
            com.instagram.common.session.UserSession r1 = r3.A01
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.NJs r1 = new X.NJs
            r1.<init>()
            r2.A0B(r4, r1)
            r1 = 1
            r2.A0F = r1
            r2.A07()
            r1 = 251743981(0xf014eed, float:6.3753916E-30)
            goto L_0x0b57
        L_0x0733:
            r0 = -1785280423(0xffffffff9596c859, float:-6.090061E-26)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NJY r4 = (X.NJY) r4
            X.NmZ r0 = X.C69491NmZ.CREATE_GROUP
            X.NJY.A05(r0, r4)
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "direct_is_creating_group_chat"
            r1 = 1
            r5.putBoolean(r0, r1)
            java.lang.String r0 = "direct_is_creating_group_chat_from_existing_thread"
            r5.putBoolean(r0, r1)
            X.EZi r1 = X.C48140EZi.THREAD_DETAILS
            java.lang.String r0 = "direct_group_creation_entrypoint"
            r5.putSerializable(r0, r1)
            X.N4P r0 = r4.A0Z
            if (r0 == 0) goto L_0x07e4
            java.util.List r0 = r0.A0T
            java.util.List r0 = X.00k.A0a(r0)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r0.iterator()
        L_0x076b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0788
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r0 = r0.A00
            java.lang.String r1 = r0.getId()
            com.instagram.common.session.UserSession r0 = r4.A0N()
            java.lang.String r0 = r0.A06
            X.DbY.A1T(r1, r0, r2, r7)
            goto L_0x076b
        L_0x0788:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x0790:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07a7
            java.lang.Object r0 = r2.next()
            X.N9q r0 = (X.C68303N9q) r0
            com.instagram.user.model.User r1 = r0.A00
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            r3.add(r0)
            goto L_0x0790
        L_0x07a7:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r3)
            java.lang.String r0 = "bundle_extra_parcelable_new_group_selected_recipients"
            r5.putParcelableArrayList(r0, r1)
            com.instagram.common.session.UserSession r1 = r4.A0N()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            X.Mi7 r1 = X.C67089Mi7.A00(r1, r0)
            r0 = 2
            r1.A04(r0)
            X.E5H r2 = new X.E5H
            r2.<init>()
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r5, r2, r4)
            com.instagram.common.session.UserSession r0 = r4.A0N()
            X.6Yo r1 = X.DbU.A0Q(r1, r0)
            r0 = 103(0x67, float:1.44E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.A0A = r0
            r1.A0D(r2)
            r1.A04()
            r0 = -1721846242(0xffffffff995eb61e, float:-1.1513909E-23)
            goto L_0x0a6b
        L_0x07e4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x07e9:
            r0 = -402415126(0xffffffffe803a1ea, float:-2.4864672E24)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.NJY r5 = (X.NJY) r5
            com.instagram.common.session.UserSession r4 = r5.A0N()
            r9 = 0
            X.0qQ.A0B(r4, r9)
            boolean r0 = X.AnonymousClass9B8.A07(r4)
            if (r0 == 0) goto L_0x086c
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319398806560011(0x81084d00521d0b, double:3.03187227952443E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            if (r0 == 0) goto L_0x086c
            r0 = 36882348760170945(0x83084d005501c1, double:3.3878840970055E-306)
            java.lang.String r1 = X.182.A04(r3, r4, r0)
        L_0x0818:
            boolean r0 = X.NJY.A0L(r5)
            com.instagram.common.session.UserSession r4 = r5.A0N()
            if (r0 == 0) goto L_0x0864
            X.0qQ.A0B(r4, r9)
            com.instagram.simplewebview.SimpleWebViewConfig r3 = X.Dba.A0N(r1)
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG"
            r1.putParcelable(r0, r3)
            X.DbU.A1D(r1, r4)
            X.R8R r4 = new X.R8R
            r4.<init>()
            r4.setArguments(r1)
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r0 = X.DbV.A0g(r5, r0)
            X.7Pu r3 = X.C48943Emh.A00(r0)
            com.instagram.common.session.UserSession r0 = r5.A0N()
            X.7Pr r5 = X.DbS.A0W(r0)
            r1 = 2
            X.Lys r0 = new X.Lys
            r0.<init>(r4, r1)
            r5.A0T = r0
            if (r3 == 0) goto L_0x085f
            r6 = 1
            r7 = r6
            r8 = r6
            r3.A0H(r4, r5, r6, r7, r8, r9)
        L_0x085f:
            r0 = -1248097486(0xffffffffb59b8b32, float:-1.1588911E-6)
            goto L_0x0b2d
        L_0x0864:
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.C49845F9k.A00(r0, r4, r1)
            goto L_0x085f
        L_0x086c:
            r1 = 0
            goto L_0x0818
        L_0x086e:
            r0 = -733013002(0xffffffffd44f1bf6, float:-3.55810935E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.E3f r6 = (X.C47458E3f) r6
            X.0eM r1 = r6.A06
            X.1Av r5 = X.DbX.A0h(r1)
            r4 = 1
            X.0s0 r3 = r5.A1Z
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 396(0x18c, float:5.55E-43)
            X.AnonymousClass7TF.A1J(r5, r3, r2, r1, r4)
            X.DbZ.A17(r6)
            r1 = -1449493056(0xffffffffa99a7dc0, float:-6.860788E-14)
            goto L_0x0b57
        L_0x0891:
            r0 = -1165570959(0xffffffffba86cc71, float:-0.0010284317)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 403482496(0x180ca780, float:1.8179142E-24)
            goto L_0x0b57
        L_0x08a2:
            r0 = 336373904(0x140ca890, float:7.101437E-27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E3m r5 = (X.C47464E3m) r5
            X.0eM r1 = r5.A06
            java.lang.Object r1 = r1.getValue()
            X.9s1 r1 = (X.C390899s1) r1
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 != r1) goto L_0x0904
            X.0eM r1 = r5.A03
            java.lang.Object r6 = r1.getValue()
            X.Oy7 r6 = (X.Oy7) r6
            X.0eM r1 = r5.A08
            java.lang.String r4 = X.DbS.A0t(r1)
            X.0eM r1 = r5.A09
            java.lang.String r3 = X.DbS.A0t(r1)
            X.AnonymousClass7TF.A1H(r4, r3)
            X.0wc r1 = r6.A00
            X.1Ln r2 = X.1Ln.A0F(r1)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0904
            com.instagram.common.session.UserSession r1 = r6.A01
            X.Dbb.A1G(r2, r1)
            r1 = 1889(0x761, float:2.647E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "accept_user_nux_button"
            r2.A0p(r1)
            java.lang.String r1 = "public_chat_nux"
            X.Dba.A1E(r2, r1)
            r2.A0s(r4)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r3)
            r2.A0i(r1)
            r2.Cgf()
        L_0x0904:
            X.Dba.A11(r5)
            r1 = 1
            r5.A00 = r1
            X.DbT.A1J(r5)
            r1 = -1307574213(0xffffffffb210003b, float:-8.381956E-9)
            goto L_0x0b57
        L_0x0912:
            r0 = 1433716963(0x5574c8e3, float:1.68214774E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbZ.A17(r1)
            r1 = 1241839525(0x4a04f7a5, float:2178537.2)
            goto L_0x0b57
        L_0x0925:
            r0 = -1751758969(0xffffffff97964787, float:-9.711579E-25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.EJc r5 = (X.C47830EJc) r5
            X.0eM r9 = r5.A06
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r9)
            X.2Dm r1 = X.1bJ.A00(r0)
            X.0eM r8 = r5.A01
            java.lang.String r0 = X.DbS.A0t(r8)
            X.2Dr r1 = (X.2Dr) r1
            r7 = 0
            X.0qQ.A0B(r0, r7)
            X.3U9 r1 = r1.A0N(r0)
            if (r1 == 0) goto L_0x0984
            com.instagram.user.model.User r0 = r1.Ash()
            if (r0 == 0) goto L_0x0984
            com.instagram.user.model.User r4 = r1.Ash()
            if (r4 == 0) goto L_0x09b4
            boolean r0 = r4.A29()
            if (r0 != 0) goto L_0x098c
            X.0lg r3 = X.DbT.A0X(r9)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36319407391776032(0x81084f000a1d20, double:3.031877708849612E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x098c
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x0984
            X.37D r1 = X.DbT.A0i(r2)
            if (r1 == 0) goto L_0x0984
            X.FmM r0 = new X.FmM
            r0.<init>(r7, r4, r5, r2)
            X.37F r1 = (X.AnonymousClass37F) r1
            r1.A0H = r0
        L_0x0984:
            X.DbZ.A17(r5)
        L_0x0987:
            r0 = -149452477(0xfffffffff7178943, float:-3.0735188E33)
            goto L_0x0a6b
        L_0x098c:
            com.instagram.igds.components.button.IgdsButton r1 = r5.A00
            if (r1 == 0) goto L_0x09b1
            r0 = 1
            r1.setLoading(r0)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r9)
            java.lang.String r3 = X.DbS.A0t(r8)
            X.0eM r0 = r5.A02
            java.lang.String r2 = X.DbS.A0t(r0)
            X.0eM r0 = r5.A00
            int r1 = X.DbX.A07(r0)
            X.FbJ r0 = new X.FbJ
            r0.<init>(r5)
            X.LPX.A02(r4, r0, r3, r2, r1)
            goto L_0x0987
        L_0x09b1:
            java.lang.String r0 = "ctaButton"
            goto L_0x09d3
        L_0x09b4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x09b9:
            r0 = -1919406309(0xffffffff8d982f1b, float:-9.3790635E-31)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.E5m r7 = (X.E5m) r7
            X.Dri r9 = r7.A01
            if (r9 == 0) goto L_0x0a65
            X.3t3 r8 = r9.A06
            if (r8 == 0) goto L_0x0a65
            X.7ZA r3 = r7.A02
            r5 = 0
            if (r3 != 0) goto L_0x09db
            java.lang.String r0 = "threadActionsManager"
        L_0x09d3:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x09db:
            com.instagram.common.ui.base.IgEditText r0 = r7.A00
            if (r0 != 0) goto L_0x09e2
            java.lang.String r0 = "editText"
            goto L_0x09d3
        L_0x09e2:
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r0)
            int r4 = r9.A01
            r0 = 47
            boolean r1 = X.AnonymousClass7TF.A1S(r4, r0)
            android.content.Context r0 = r7.requireContext()
            r3.AGp(r0, r8, r2, r1)
            java.lang.String r1 = r7.A03
            r0 = 359(0x167, float:5.03E-43)
            java.lang.String r10 = X.C66579MXk.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r10)
            if (r0 == 0) goto L_0x0a17
            X.0eM r0 = r7.A08
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r2 = X.C300965yF.A07(r8)
            X.AnonymousClass7TG.A1N(r3, r2)
            X.NmP r1 = X.C69481NmP.CHANGE_THREAD_NAME
            X.NmL r0 = X.C69477NmL.THREAD_NAME_CHANGED
            X.C70035NwD.A00(r1, r0, r3, r2)
        L_0x0a17:
            X.0eM r3 = r7.A08
            X.0lg r2 = X.DbT.A0X(r3)
            java.lang.String r1 = X.C300965yF.A07(r8)
            java.lang.String r0 = r7.A03
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 == 0) goto L_0x0a6f
            X.EZa r0 = X.EZa.THREAD_NULL_STATE
        L_0x0a2b:
            X.C3265677h.A07(r0, r5, r7, r2, r1)
            r0 = 29
            if (r4 != r0) goto L_0x0a65
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.6gx r4 = X.C313746gw.A00(r0)
            int r3 = r9.A00
            java.lang.String r2 = X.C300965yF.A07(r8)
            X.1Ln r1 = X.DbT.A0J(r4)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0a65
            X.DbW.A17(r1, r4)
            java.lang.String r0 = "thread_update_name"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "group_name_textbox"
            r1.A0p(r0)
            java.lang.String r0 = "thread_view"
            X.DbZ.A1L(r1, r0, r3)
            r1.A0s(r2)
            r1.A0i(r5)
            r1.Cgf()
        L_0x0a65:
            X.DbX.A1J(r7)
            r0 = -306543003(0xffffffffedba8665, float:-7.2158356E27)
        L_0x0a6b:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0a6f:
            X.EZa r0 = X.EZa.THREAD_DETAILS
            goto L_0x0a2b
        L_0x0a72:
            r0 = -500480297(0xffffffffe22b46d7, float:-7.8987445E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1627643125(0x6103dcf5, float:1.5202782E20)
            goto L_0x0b57
        L_0x0a83:
            r0 = -208754175(0xfffffffff38eaa01, float:-2.2606025E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 995953298(0x3b5d0a92, float:0.0033728224)
            goto L_0x0b57
        L_0x0a94:
            r0 = 990975263(0x3b11151f, float:0.0022137833)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.37D r1 = (X.AnonymousClass37D) r1
            if (r1 == 0) goto L_0x0aa4
            r1.A0B()
        L_0x0aa4:
            r1 = 75597690(0x481877a, float:3.045217E-36)
            goto L_0x0b57
        L_0x0aa9:
            r0 = 1555623859(0x5cb8efb3, float:4.16439582E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Dou r2 = (X.C47002Dou) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sa r1 = r2.A04
            r1.invoke()
            r1 = -2033547784(0xffffffff86ca85f8, float:-7.6180804E-35)
            goto L_0x0b57
        L_0x0ac0:
            r0 = 310308261(0x127eeda5, float:8.0441187E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.E4p r4 = (X.C47485E4p) r4
            X.0eM r1 = r4.A08
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            X.DbS.A1Z(r5)
            r13 = 1
            r6 = 0
            r9 = -2
            r10 = 0
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r7 = r6
            r11 = r10
            r12 = r10
            r14 = r10
            X.NKM r3 = X.C70139Nxt.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.7Pr r1 = X.DbX.A0f(r1)
            X.DbS.A1S(r1, r13)
            X.7Pu r2 = r1.A00()
            X.FbG r1 = new X.FbG
            r1.<init>(r10, r4, r2)
            r3.A01 = r1
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            X.0nA.A0J(r1)
            X.DbU.A1I(r4, r3, r2)
            r1 = 502094053(0x1ded58e5, float:6.2825292E-21)
            goto L_0x0b57
        L_0x0b04:
            r0 = -278191899(0xffffffffef6b20e5, float:-7.2768744E28)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.E4p r5 = (X.C47485E4p) r5
            boolean r1 = r5.A06
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            X.0xx r0 = X.DbW.A0E(r5)
            r7 = 0
            if (r1 == 0) goto L_0x0b31
            r8 = 49
        L_0x0b22:
            X.MGi r3 = new X.MGi
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r0)
            r0 = 1291325844(0x4cf81194, float:1.30059424E8)
        L_0x0b2d:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0b31:
            r8 = 48
            goto L_0x0b22
        L_0x0b34:
            r0 = 1874163566(0x6fb5776e, float:1.1232234E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E4p r1 = (X.C47485E4p) r1
            X.DbT.A1K(r1)
            r1 = 816838077(0x30aff5bd, float:1.2802769E-9)
            goto L_0x0b57
        L_0x0b46:
            r0 = 1586686566(0x5e92ea66, float:5.293193E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.E51 r1 = (X.E51) r1
            r1.onBackPressed()
            r1 = -1539081660(0xffffffffa4437a44, float:-4.2387448E-17)
        L_0x0b57:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0b5b:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            X.DbX.A1J(r0)
            return
        L_0x0b63:
            java.lang.Object r0 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r0 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r0
            com.instagram.direct.fragment.sharesheet.viewmodel.DirectShareSheetFragmentViewModel r5 = r0.A0P
            android.content.Context r4 = r0.requireContext()
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 12
            X.Pfp r0 = new X.Pfp
            r0.<init>(r4, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x0b7d:
            java.lang.Object r1 = r1.A01
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = (com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment) r1
            X.EIn r0 = com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A02(r1)
            java.util.List r0 = r0.A0F()
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0O(r1, r0)
            X.DbX.A1J(r1)
            java.lang.String r0 = "ig_content_deep_dive:prompt_send"
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment.A0L(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FP8.onClick(android.view.View):void");
    }

    public FP8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
