package X;

import android.view.View;

/* renamed from: X.ICy  reason: case insensitive filesystem */
public final class C56801ICy implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C56801ICy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C56801ICy A00(Object obj, int i) {
        return new C56801ICy(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C56801ICy(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0256, code lost:
        r3 = "pivotPageUrl";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0316, code lost:
        r3 = "attributionAppId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x076a, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x076d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x07af, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x07b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0ce4, code lost:
        if (r7 != null) goto L_0x0ce6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:455:0x1080, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x1083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x10a3, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x10a6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        X.0qQ.A0F(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0c0d  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x0ca1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r50) {
        /*
            r49 = this;
            r1 = r49
            int r0 = r1.A00
            r4 = r50
            switch(r0) {
                case 0: goto L_0x0357;
                case 1: goto L_0x1084;
                case 2: goto L_0x1061;
                case 3: goto L_0x102a;
                case 4: goto L_0x1016;
                case 5: goto L_0x032d;
                case 6: goto L_0x1003;
                case 7: goto L_0x0ff0;
                case 8: goto L_0x0fdd;
                case 9: goto L_0x0fca;
                case 10: goto L_0x0fb7;
                case 11: goto L_0x0fa4;
                case 12: goto L_0x031a;
                case 13: goto L_0x0f91;
                case 14: goto L_0x0f7e;
                case 15: goto L_0x0f6b;
                case 16: goto L_0x0f58;
                case 17: goto L_0x0f43;
                case 18: goto L_0x0f2e;
                case 19: goto L_0x0efd;
                case 20: goto L_0x0eec;
                case 21: goto L_0x029f;
                case 22: goto L_0x0edb;
                case 23: goto L_0x028c;
                case 24: goto L_0x0eca;
                case 25: goto L_0x0e89;
                case 26: goto L_0x025a;
                case 27: goto L_0x0214;
                case 28: goto L_0x01e4;
                case 29: goto L_0x0790;
                case 30: goto L_0x0e78;
                case 31: goto L_0x0808;
                case 32: goto L_0x0e13;
                case 33: goto L_0x0d66;
                case 34: goto L_0x03ca;
                case 35: goto L_0x0d55;
                case 36: goto L_0x01ab;
                case 37: goto L_0x0d1e;
                case 38: goto L_0x0d08;
                case 39: goto L_0x06e2;
                case 40: goto L_0x0b9a;
                case 41: goto L_0x0b0a;
                case 42: goto L_0x0557;
                case 43: goto L_0x0a9e;
                case 44: goto L_0x0482;
                case 45: goto L_0x0a80;
                case 46: goto L_0x0a67;
                case 47: goto L_0x0a50;
                case 48: goto L_0x0a33;
                case 49: goto L_0x0a20;
                case 50: goto L_0x0a07;
                case 51: goto L_0x09f0;
                case 52: goto L_0x0465;
                case 53: goto L_0x038f;
                case 54: goto L_0x0166;
                case 55: goto L_0x0041;
                case 56: goto L_0x09cb;
                case 57: goto L_0x0949;
                case 58: goto L_0x0933;
                case 59: goto L_0x091c;
                case 60: goto L_0x08fb;
                case 61: goto L_0x08e4;
                case 62: goto L_0x08cd;
                case 63: goto L_0x08ac;
                case 64: goto L_0x0892;
                case 65: goto L_0x087f;
                case 66: goto L_0x0022;
                case 67: goto L_0x086e;
                case 68: goto L_0x0857;
                case 69: goto L_0x0844;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -689519086(0xffffffffd6e6c612, float:-1.2686919E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.H1U r3 = (X.H1U) r3
            X.3oV r2 = r3.A01
            if (r2 != 0) goto L_0x1098
            java.lang.String r3 = "errorViewStubHolder"
        L_0x001a:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0022:
            r0 = -1052684329(0xffffffffc1414fd7, float:-12.081992)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.H1N r7 = (X.H1N) r7
            X.C55115HcO.A00()
            X.0eM r6 = r7.A0E
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r9 = r1.A05
            int r8 = r7.A00
            X.6sZ r1 = r7.A02
            if (r1 != 0) goto L_0x05ab
            java.lang.String r3 = "selectStateProvider"
            goto L_0x001a
        L_0x0041:
            r0 = -1008286029(0xffffffffc3e6c6b3, float:-461.55234)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.HK7 r2 = (X.HK7) r2
            X.4bN r4 = X.HK7.A00(r2)
            if (r4 == 0) goto L_0x0606
            java.lang.Integer r3 = X.HK7.A01(r2)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r3 != r1) goto L_0x0102
            X.4bN r1 = X.HK7.A00(r2)
            if (r1 == 0) goto L_0x00fe
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x00fe
            java.util.List r1 = r1.A3b()
            if (r1 == 0) goto L_0x00fe
            java.lang.Object r1 = X.00k.A0J(r1)
            X.54u r1 = (X.C2809354u) r1
            if (r1 == 0) goto L_0x00ff
            java.lang.String r10 = r1.getId()
        L_0x0076:
            X.1Xj r4 = r4.A02
            if (r4 == 0) goto L_0x0606
            if (r1 == 0) goto L_0x0606
            if (r10 == 0) goto L_0x0606
            X.2is r2 = r2.A05
            if (r2 == 0) goto L_0x0606
            X.GBE r1 = r2.A09
            java.lang.String r3 = "clipsViewerFragmentViewModel"
            if (r1 == 0) goto L_0x001a
            X.0eM r1 = r1.A1c
            java.lang.Object r1 = r1.getValue()
            X.314 r1 = (X.AnonymousClass314) r1
            X.33B r21 = r1.Aqg()
            int r1 = r10.length()
            if (r1 == 0) goto L_0x0606
            if (r21 == 0) goto L_0x0606
            com.instagram.common.session.UserSession r6 = X.C227232is.A01(r2)
            android.content.Context r9 = r2.requireContext()
            X.GBE r1 = r2.A09
            if (r1 == 0) goto L_0x001a
            X.GAc r5 = r1.A19
            r3 = 0
            X.0qQ.A0B(r6, r3)
            boolean r29 = X.DbW.A1Y(r5)
            java.util.List r1 = r4.A3b()
            r2 = 0
            if (r1 == 0) goto L_0x00fc
            java.util.Iterator r8 = r1.iterator()
        L_0x00bd:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x00fa
            java.lang.Object r1 = r8.next()
            r7 = r1
            X.54u r7 = (X.C2809354u) r7
            java.lang.String r7 = r7.getId()
            boolean r7 = X.0qQ.A0K(r7, r10)
            if (r7 == 0) goto L_0x00bd
        L_0x00d4:
            X.54u r1 = (X.C2809354u) r1
        L_0x00d6:
            java.util.List r7 = r4.A3b()
            if (r7 == 0) goto L_0x05e6
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x00e4:
            boolean r7 = r8.hasNext()
            if (r7 == 0) goto L_0x05e6
            java.lang.Object r7 = r8.next()
            X.54u r7 = (X.C2809354u) r7
            com.instagram.user.model.User r7 = r7.CCd()
            if (r7 == 0) goto L_0x00e4
            r2.add(r7)
            goto L_0x00e4
        L_0x00fa:
            r1 = r2
            goto L_0x00d4
        L_0x00fc:
            r1 = r2
            goto L_0x00d6
        L_0x00fe:
            r1 = 0
        L_0x00ff:
            r10 = 0
            goto L_0x0076
        L_0x0102:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r3 != r1) goto L_0x0606
            X.4bN r1 = X.HK7.A00(r2)
            if (r1 == 0) goto L_0x0163
            X.1Xj r1 = r1.A02
            if (r1 == 0) goto L_0x0163
            java.util.List r1 = r1.A3b()
            if (r1 == 0) goto L_0x0163
            java.lang.Object r1 = X.00k.A0J(r1)
            X.54u r1 = (X.C2809354u) r1
            if (r1 == 0) goto L_0x0164
            java.lang.String r11 = r1.getId()
        L_0x0122:
            X.1Xj r9 = r4.A02
            if (r9 == 0) goto L_0x0606
            if (r1 == 0) goto L_0x0606
            if (r11 == 0) goto L_0x0606
            X.2is r2 = r2.A05
            if (r2 == 0) goto L_0x0606
            r12 = 1
            X.GBE r1 = r2.A09
            java.lang.String r3 = "clipsViewerFragmentViewModel"
            r7 = 0
            if (r1 == 0) goto L_0x001a
            X.0eM r1 = r1.A1c
            java.lang.Object r1 = r1.getValue()
            X.314 r1 = (X.AnonymousClass314) r1
            if (r1 == 0) goto L_0x0161
            X.33B r8 = r1.Aqg()
        L_0x0144:
            int r1 = r11.length()
            if (r1 == 0) goto L_0x0606
            if (r8 == 0) goto L_0x0606
            X.I0Q r4 = X.I0Q.A00
            android.content.Context r5 = r2.requireContext()
            com.instagram.common.session.UserSession r6 = X.C227232is.A01(r2)
            X.GBE r1 = r2.A09
            if (r1 == 0) goto L_0x001a
            X.GAc r10 = r1.A19
            r4.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0606
        L_0x0161:
            r8 = r7
            goto L_0x0144
        L_0x0163:
            r1 = 0
        L_0x0164:
            r11 = 0
            goto L_0x0122
        L_0x0166:
            r0 = -359748677(0xffffffffea8eabbb, float:-8.623922E25)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.GNH r5 = (X.GNH) r5
            X.4bN r9 = r5.A0C()
            if (r9 == 0) goto L_0x06db
            com.instagram.common.session.UserSession r1 = r5.A0A
            X.0Tu r0 = X.0Tu.A05
            r3 = 36323032344439555(0x810b9b000e2b03, double:3.0341701435105365E-306)
            boolean r14 = X.182.A06(r0, r1, r3)
            X.2is r3 = r5.A04
            if (r3 == 0) goto L_0x068f
            java.lang.Integer r12 = X.C52050GCw.A08(r5)
            X.GBE r0 = r3.A09
            if (r0 != 0) goto L_0x0194
            java.lang.String r3 = "clipsViewerFragmentViewModel"
            goto L_0x001a
        L_0x0194:
            X.0eM r0 = r0.A1f
            java.lang.Object r6 = r0.getValue()
            X.GCT r6 = (X.GCT) r6
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            X.5OB r8 = X.AnonymousClass5OB.REELS_VIEWER_ADD_COMMENT
            r11 = 0
            X.GD6 r0 = r3.A0C
            if (r0 != 0) goto L_0x0684
            java.lang.String r3 = "viewerAdapter"
            goto L_0x001a
        L_0x01ab:
            r0 = -1966421935(0xffffffff8acac851, float:-1.9527243E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.H0c r4 = (X.C54133H0c) r4
            android.content.Context r3 = r4.requireContext()
            X.8ab r2 = X.DbS.A0Y(r3)
            r1 = 2131955268(0x7f130e44, float:1.9547059E38)
            r2.A09(r1)
            r1 = 2131955269(0x7f130e45, float:1.954706E38)
            X.DbU.A17(r3, r2, r1)
            r2.A06()
            r2.A04()
            X.DbT.A1V(r2)
            X.0eM r1 = r4.A0C
            X.27r r1 = X.C51971G9r.A0g(r1)
            r1.A0l()
            com.instagram.igds.components.textcell.IgdsListCell r2 = r4.A02
            if (r2 != 0) goto L_0x0778
            java.lang.String r3 = "audioTranslationOptInToggle"
            goto L_0x001a
        L_0x01e4:
            r0 = 128523857(0x7a91e51, float:2.5446112E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.H1A r6 = (X.H1A) r6
            android.content.Context r5 = r6.requireContext()
            X.0eM r0 = r6.A0E
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r9 = r6.A07
            if (r9 == 0) goto L_0x0256
            java.lang.String r10 = r6.A03
            if (r10 == 0) goto L_0x0316
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131970990(0x7f134bae, float:1.9578947E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.String r12 = r6.A04
            if (r12 != 0) goto L_0x0781
            java.lang.String r3 = "attributionAppName"
            goto L_0x001a
        L_0x0214:
            r0 = 1111069841(0x42399491, float:46.395084)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.H1A r3 = (X.H1A) r3
            android.content.Context r1 = r3.requireContext()
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r1.getSystemService(r0)
            boolean r0 = r2 instanceof android.content.ClipboardManager
            if (r0 == 0) goto L_0x0251
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            if (r2 == 0) goto L_0x0251
            android.content.Context r1 = r3.requireContext()
            r0 = 2131975263(0x7f135c5f, float:1.9587613E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0256
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r1, r0)
            r2.setPrimaryClip(r0)
            android.content.Context r1 = r3.requireContext()
            r0 = 2131975264(0x7f135c60, float:1.9587615E38)
            X.C59689JTv.A07(r1, r0)
        L_0x0251:
            r0 = -2016451487(0xffffffff87cf6461, float:-3.1204896E-34)
            goto L_0x1080
        L_0x0256:
            java.lang.String r3 = "pivotPageUrl"
            goto L_0x001a
        L_0x025a:
            r0 = -552731654(0xffffffffdf0dfbfa, float:-1.0231046E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H1A r2 = (X.H1A) r2
            X.0eM r1 = r2.A0E
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            java.lang.String r6 = r2.A03
            if (r6 == 0) goto L_0x0316
            X.TpH r4 = X.C14068TpH.CLIPS_THIRD_PARTY_APP_PAGE
            X.UzD r5 = X.C16677UzD.THIRD_PARTY_APP
            X.OcF r3 = X.ORV.A01(r1, r2, r3, r4, r5, r6)
            X.Uz2 r2 = X.C16666Uz2.REPORT_BUTTON
            r1 = 0
            X.0qQ.A0B(r2, r1)
            r3.A02 = r2
            r1 = 0
            X.C71093OcF.A00(r1, r3)
            r1 = 284093592(0x10eeec98, float:9.423898E-29)
            goto L_0x10a3
        L_0x028c:
            r0 = 1004824958(0x3be4697e, float:0.0069705835)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.H1D r5 = (X.H1D) r5
            X.H2k r4 = r5.A05
            if (r4 != 0) goto L_0x07b3
            java.lang.String r3 = "remixPivotPagePerfLogger"
            goto L_0x001a
        L_0x029f:
            r0 = 1577546059(0x5e07714b, float:2.43991608E18)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Gzm r0 = (X.C54117Gzm) r0
            X.H1A r2 = r0.A02
            if (r2 == 0) goto L_0x0311
            java.lang.String r1 = r2.A05
            java.lang.String r3 = "contentUrl"
            if (r1 == 0) goto L_0x001a
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0311
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 == 0) goto L_0x02c3
            X.FH7.A03(r0, r1)
        L_0x02c3:
            X.0eM r0 = r2.A0E
            X.0lg r0 = X.DbT.A0X(r0)
            java.lang.String r1 = r2.A06
            if (r1 != 0) goto L_0x02d1
            java.lang.String r3 = "mediaId"
            goto L_0x001a
        L_0x02d1:
            java.lang.String r6 = r2.A03
            if (r6 == 0) goto L_0x0316
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.0Aj r3 = X.C51972G9s.A0O(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0311
            java.lang.String r0 = "third_party_app_pivot_page"
            X.C51965G9l.A1M(r3, r0)
            java.lang.String r0 = X.C51965G9l.A0u(r1)
            X.0qQ.A0B(r0, r4)
            r2 = 10
            long r0 = X.DbZ.A07(r0)
            X.C51974G9v.A0l(r3, r4, r0)
            X.C51967G9n.A17(r3)
            X.GKd r0 = X.C52236GKd.A1K
            X.C51965G9l.A19(r0, r3)
            X.5OC r0 = X.AnonymousClass5OC.THIRD_PARTY_APP_PIVOT_PAGE
            X.C51965G9l.A1C(r0, r3)
            java.lang.Long r1 = X.00y.A0n(r2, r6)
            java.lang.String r0 = "app_attribution_id"
            r3.A9F(r0, r1)
            r3.Cgf()
        L_0x0311:
            r0 = 240966563(0xe5cdba3, float:2.7222845E-30)
            goto L_0x1080
        L_0x0316:
            java.lang.String r3 = "attributionAppId"
            goto L_0x001a
        L_0x031a:
            r0 = 542095443(0x204fb853, float:1.759457E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H1J r1 = (X.H1J) r1
            X.U94 r1 = r1.A04
            if (r1 != 0) goto L_0x07c8
            java.lang.String r3 = "adapter"
            goto L_0x001a
        L_0x032d:
            r0 = 1801781091(0x6b64ff63, float:2.7684112E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.H0o r4 = (X.C54144H0o) r4
            X.0eM r2 = r4.A0F
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            X.8A2 r3 = X.AnonymousClass8A1.A01(r1)
            X.27r r1 = X.C51971G9r.A0g(r2)
            X.283 r1 = r1.A04
            java.lang.String r2 = r1.A0L
            java.lang.String r1 = "sound_sync_publish"
            r3.A0L(r2, r1)
            X.A7f r1 = r4.A04
            if (r1 != 0) goto L_0x07d0
            java.lang.String r3 = "videoPlayer"
            goto L_0x001a
        L_0x0357:
            r0 = 124185400(0x766eb38, float:1.7372401E-34)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.GVT r7 = (X.GVT) r7
            X.0eM r0 = r7.A0o
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r0)
            X.HOu r6 = X.C54689HOu.A04
            long r12 = r7.A00
            java.lang.String r9 = r7.A0X
            java.lang.String r10 = r7.A0S
            java.lang.String r11 = r7.A0T
            X.C52086GEg.A0P(r6, r7, r8, r9, r10, r11, r12)
            X.1Ze r8 = X.C55169HdL.A00()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r9 = r7.requireActivity()
            X.HM8 r12 = r7.A0D
            if (r12 != 0) goto L_0x0387
            X.HM8 r12 = X.HM8.AUDIO_PAGE
        L_0x0387:
            X.Ghc r0 = r7.A0J
            if (r0 != 0) goto L_0x07fd
            java.lang.String r3 = "audioPageViewModel"
            goto L_0x001a
        L_0x038f:
            r0 = 1910957229(0x71e6e4ad, float:2.2866561E30)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.HK6 r4 = (X.HK6) r4
            java.lang.Integer r0 = X.C52050GCw.A08(r4)
            if (r0 == 0) goto L_0x03c5
            int r3 = r0.intValue()
            if (r3 < 0) goto L_0x03c5
            X.GD6 r0 = r4.A03
            X.GBg r1 = r0.A0A
            int r0 = r1.A0A()
            if (r3 >= r0) goto L_0x03c5
            X.4bN r3 = r1.A0E(r3)
            if (r3 == 0) goto L_0x03c5
            X.1Xj r0 = r3.A02
            if (r0 == 0) goto L_0x03c5
            X.2is r1 = r4.A02
            if (r1 == 0) goto L_0x03c5
            java.lang.Integer r0 = X.C52050GCw.A08(r4)
            r1.A0P(r3, r0)
        L_0x03c5:
            r0 = -956991003(0xffffffffc6f579e5, float:-31420.947)
            goto L_0x076a
        L_0x03ca:
            r0 = -1194842039(0xffffffffb8c82849, float:-9.544247E-5)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Hms r1 = (X.C55757Hms) r1
            X.H0c r0 = r1.A02
            X.C54133H0c.A00(r0)
            com.instagram.common.session.UserSession r0 = r1.A01
            X.27r r0 = X.27p.A01(r0)
            X.29V r5 = r0.A0C
            X.0wc r1 = r5.A01
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0460
            java.lang.String r1 = "TRANSLATE_AND_DUB_REEL_DISMISS"
            java.lang.String r0 = "entity"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "DISMISS"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            X.283 r4 = r5.A04
            java.lang.String r1 = r4.A0L
            if (r1 != 0) goto L_0x0406
            java.lang.String r1 = ""
        L_0x0406:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.28D r0 = r4.A09
            X.DbS.A1F(r0, r2)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            int r0 = r4.A01
            if (r0 == r1) goto L_0x041b
            r1 = 1
        L_0x041b:
            r0 = 535(0x217, float:7.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.8fP r1 = r5.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28t r1 = r4.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            X.DbW.A15(r2, r0)
            X.JVj r0 = X.C59725JVj.PRE_CAPTURE
            X.C51965G9l.A1A(r0, r2)
            java.lang.Long r1 = X.C51971G9r.A0m()
            r0 = 137(0x89, float:1.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            java.lang.String r1 = r4.A0O
            r0 = 77
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            java.lang.String r1 = r4.A0P
            java.lang.String r0 = "search_session_id"
            r2.AAJ(r0, r1)
            X.AnonymousClass7TH.A0V(r2)
        L_0x0460:
            r0 = -1349244526(0xffffffffaf942992, float:-2.695058E-10)
            goto L_0x07af
        L_0x0465:
            r0 = 125158479(0x775c44f, float:1.8489441E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.GJn r0 = (X.C52222GJn) r0
            java.lang.ref.WeakReference r0 = r0.A07
            java.lang.Object r0 = r0.get()
            X.0sa r0 = (X.C62320sa) r0
            if (r0 == 0) goto L_0x047d
            r0.invoke()
        L_0x047d:
            r0 = -1555890969(0xffffffffa342fce7, float:-1.0570315E-17)
            goto L_0x076a
        L_0x0482:
            r0 = 127794322(0x79dfc92, float:2.3771182E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GDB r1 = (X.GDB) r1
            X.GD9 r0 = r1.A0M
            X.4bN r0 = r0.A02()
            if (r0 == 0) goto L_0x0543
            X.HMv r28 = X.C54664HMv.A04
            java.lang.String r32 = r0.A0C()
            com.instagram.common.session.UserSession r3 = r1.A0G
            com.instagram.user.model.User r4 = r0.A08(r3)
            r8 = 0
            if (r4 == 0) goto L_0x054c
            java.lang.String r33 = r4.getId()
        L_0x04a8:
            r25 = 1
            r26 = 0
            X.1iA r4 = X.1iA.A0a
            int r6 = r4.A00
            r5 = 3
            int r4 = X.C51973G9u.A00()
            if (r4 == 0) goto L_0x0548
            if (r4 != r5) goto L_0x0550
            r48 = 1
        L_0x04bb:
            com.instagram.discovery.chaining.model.DiscoveryChainingItem r9 = new com.instagram.discovery.chaining.model.DiscoveryChainingItem
            r27 = r9
            r29 = r8
            r30 = r8
            r31 = r8
            r34 = r8
            r35 = r8
            r36 = r8
            r37 = r8
            r38 = r8
            r39 = r8
            r40 = r8
            r41 = r8
            r42 = r8
            r43 = r8
            r44 = r8
            r45 = r8
            r46 = r8
            r47 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            android.content.Context r5 = r1.A0C
            r4 = 2131956099(0x7f131183, float:1.9548744E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r5, r4)
            X.GBE r5 = r1.A0J
            X.93T r4 = r5.A1D
            java.lang.String r15 = r4.A00
            X.GAc r4 = r5.A19
            java.lang.String r4 = r4.getModuleName()
            java.lang.String r14 = "clips_showcase"
            X.AnonymousClass7TG.A1R(r15, r4)
            X.0sl r24 = X.0sl.A00
            com.instagram.discovery.chaining.intf.DiscoveryChainingConfig r7 = new com.instagram.discovery.chaining.intf.DiscoveryChainingConfig
            r10 = r8
            r11 = r8
            r12 = r8
            r16 = r4
            r17 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r27 = r26
            r28 = r26
            r29 = r26
            r30 = r26
            r31 = r26
            r32 = r26
            r33 = r26
            r34 = r26
            r35 = r26
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.GUf r7 = X.Ha1.A00(r7)
            X.JR1 r6 = r1.A0K
            X.GNk r5 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            X.GNj r4 = X.C52317GNj.A0B
            r6.AGC(r0, r5, r4)
            androidx.fragment.app.FragmentActivity r0 = r1.A0D
            X.6Yo r0 = X.DbU.A0Q(r0, r3)
            r0.A0B(r8, r7)
            r0.A04()
        L_0x0543:
            r0 = 414433728(0x18b3c1c0, float:4.6466053E-24)
            goto L_0x076a
        L_0x0548:
            r48 = 0
            goto L_0x04bb
        L_0x054c:
            java.lang.String r33 = ""
            goto L_0x04a8
        L_0x0550:
            java.lang.String r0 = "All channel-related arguments must be provided"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0557:
            r0 = -1222368116(0xffffffffb724248c, float:-9.783671E-6)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GDB r3 = (X.GDB) r3
            android.widget.ImageView r0 = r3.A04
            if (r0 == 0) goto L_0x0599
            X.GD9 r0 = r3.A0M
            X.4bN r5 = r0.A02()
            com.instagram.common.session.UserSession r4 = r3.A0G
            boolean r0 = X.AnonymousClass3ZJ.A09(r5, r4)
            if (r0 == 0) goto L_0x059e
            X.GBE r0 = r3.A0J
            X.GBn r1 = r0.A1K
            r0 = -3
            r1.A0F(r0)
            r3.A09()
        L_0x057f:
            X.JR1 r3 = r3.A0K
            X.GNk r1 = X.C52318GNk.ITEM_INTERACTION
            X.GNj r0 = X.C52317GNj.A0S
            r3.AGC(r5, r1, r0)
            X.1Av r0 = X.1Au.A00(r4)
            r3 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "has_clicked_audio_control_button"
            r1.E5T(r0, r3)
            r1.apply()
        L_0x0599:
            r0 = 1473111897(0x57cde759, float:4.52787029E14)
            goto L_0x076a
        L_0x059e:
            android.content.Context r1 = r3.A0C
            r0 = 2131955232(0x7f130e20, float:1.9546986E38)
            java.lang.String r0 = r1.getString(r0)
            X.C59689JTv.A09(r1, r0)
            goto L_0x057f
        L_0x05ab:
            java.util.LinkedHashMap r1 = r1.A02
            java.util.Set r1 = r1.keySet()
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1D(r1)
            X.HMU r2 = X.HMU.A04
            r1 = 0
            X.0qQ.A0B(r9, r1)
            X.H25 r4 = new X.H25
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r2 = r2.A00
            java.lang.String r1 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION_SUBTYPE"
            r3.putString(r1, r2)
            java.lang.String r1 = "IgSessionManager.SESSION_TOKEN_KEY"
            r3.putString(r1, r9)
            java.lang.String r1 = "ARGUMENT_NUM_MEDIA_COLLECTIONS"
            r3.putInt(r1, r8)
            java.lang.String r1 = "SaveFragment.ARGUMENT_SAVED_ITEM_IDS"
            r3.putStringArrayList(r1, r5)
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r3, r4, r7)
            X.Dbc.A0S(r4, r1, r6)
            r1 = 516469008(0x1ec8b110, float:2.1249055E-20)
            goto L_0x10a3
        L_0x05e6:
            if (r1 == 0) goto L_0x067f
            if (r2 == 0) goto L_0x067f
            com.instagram.user.model.User r10 = r1.CCd()
            if (r10 != 0) goto L_0x060b
            r1 = 2131956651(0x7f1313ab, float:1.9549864E38)
        L_0x05f3:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r9, r1)
            X.1xC r3 = X.1xC.A01
            X.6ap r2 = X.DbV.A0X()
            java.lang.String r1 = "content_note_detail_launcher_error"
            r2.A0H = r1
            r2.A0D = r4
            X.DbY.A1K(r3, r2)
        L_0x0606:
            r1 = 177602105(0xa95fe39, float:1.4443806E-32)
            goto L_0x10a3
        L_0x060b:
            X.GPJ r13 = X.GPJ.A00
            java.lang.String r16 = r5.getModuleName()
            java.lang.String r17 = X.C51965G9l.A0t(r4)
            java.lang.String r18 = X.DbT.A0x(r4)
            java.lang.String r19 = r1.getId()
            java.lang.String r7 = ""
            if (r19 != 0) goto L_0x0623
            r19 = r7
        L_0x0623:
            r12 = 0
            r14 = r6
            r15 = r12
            r20 = r12
            r13.A06(r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r13 = r4.getId()
            if (r13 != 0) goto L_0x0632
            r13 = r7
        L_0x0632:
            java.lang.String r14 = r4.A2Z()
            java.lang.String r15 = r1.getId()
            java.lang.String r16 = r5.getModuleName()
            java.lang.String r17 = X.C51965G9l.A0t(r4)
            java.lang.String r18 = X.DbT.A0x(r4)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            com.instagram.common.typedurl.ImageUrl r9 = r4.A1Q()
            boolean r20 = r4.CeS()
            com.instagram.contentnotes.data.metadata.ContentNoteMetadata r8 = new com.instagram.contentnotes.data.metadata.ContentNoteMetadata
            r19 = r12
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r27 = r1.getText()
            if (r27 != 0) goto L_0x0661
            r27 = r7
        L_0x0661:
            java.lang.Integer r25 = r1.AdI()
            java.lang.Boolean r3 = r1.BCJ()
            boolean r30 = X.C51972G9s.A1Z(r3)
            java.lang.Long r26 = r1.AsC()
            com.instagram.api.schemas.NoteCustomTheme r22 = r1.Auz()
            r23 = r8
            r24 = r5
            r28 = r2
            r21.DIP(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            goto L_0x0606
        L_0x067f:
            r1 = 2131956652(0x7f1313ac, float:1.9549866E38)
            goto L_0x05f3
        L_0x0684:
            r15 = 0
            X.GDe r10 = X.JSx.A00(r9, r0)
            r13 = r11
            r16 = r15
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x068f:
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x06b6
            X.2is r8 = r5.A04
            if (r8 == 0) goto L_0x06b6
            com.instagram.common.session.UserSession r3 = X.C227232is.A01(r8)
            com.instagram.api.schemas.MusicPageTabType r0 = com.instagram.api.schemas.MusicPageTabType.CLIPS
            X.GLN r7 = X.GLB.A00(r0, r3)
            X.1Xj r0 = r9.A02
            if (r0 == 0) goto L_0x06e0
            X.1sQ r6 = X.C51966G9m.A0n(r0)
        L_0x06a9:
            com.instagram.common.session.UserSession r4 = X.C227232is.A01(r8)
            java.lang.String r3 = r8.getModuleName()
            java.lang.String r0 = "open_comments"
            r7.A01(r6, r4, r0, r3)
        L_0x06b6:
            X.1Xj r7 = r9.A02
            if (r7 == 0) goto L_0x06db
            X.GD6 r0 = r5.A0C
            X.GDe r0 = X.JSx.A00(r9, r0)
            X.3W1 r0 = r0.A0E
            if (r0 == 0) goto L_0x06db
            int r0 = r0.getPosition()
            long r3 = (long) r0
            X.93U r6 = r5.A0B
            X.5OC r8 = X.AnonymousClass5OC.COMMENT_BAR
            X.Hlh r0 = r5.A0D
            java.lang.String r0 = r0.A00
            X.0iw r9 = r5.A09
            r14 = r3
            r10 = r1
            r11 = r7
            r12 = r6
            r13 = r0
            X.C52086GEg.A0A(r8, r9, r10, r11, r12, r13, r14)
        L_0x06db:
            r0 = 1683866652(0x645dc41c, float:1.6363446E22)
            goto L_0x076a
        L_0x06e0:
            r6 = 0
            goto L_0x06a9
        L_0x06e2:
            r0 = -704544958(0xffffffffd6017f42, float:-3.5595892E13)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r1.A01
            X.GDB r10 = (X.GDB) r10
            com.instagram.clips.intf.ClipsViewerConfig r1 = r10.A0E
            java.lang.String r8 = r1.A0m
            java.lang.String r0 = "Required value was null."
            if (r8 == 0) goto L_0x0773
            java.lang.String r7 = r1.A1I
            if (r7 == 0) goto L_0x076e
            r6 = 0
            com.instagram.common.session.UserSession r5 = r10.A0G
            X.GBE r0 = r10.A0J
            X.GAc r11 = r0.A19
            X.93T r9 = r0.A1D
            X.GD9 r0 = r10.A0M
            X.0sa r0 = r0.A00
            int r4 = X.C52012GBj.A01(r0)
            X.AnonymousClass7TG.A1O(r11, r9)
            X.0wc r1 = X.AnonymousClass0kN.A02(r5)
            java.lang.String r0 = "instagram_clips_open_blend_control"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0739
            X.C51979GAc.A01(r3, r11)
            X.C51969G9p.A16(r3, r4)
            java.lang.Long r1 = X.DbV.A0q(r8)
            java.lang.String r0 = "blend_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = r9.AmZ()
            X.C51965G9l.A1R(r3, r0)
            X.C51970G9q.A1G(r3, r9)
            r3.Cgf()
        L_0x0739:
            androidx.fragment.app.FragmentActivity r4 = r10.A0D
            X.H00 r3 = new X.H00
            r3.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "BLEND_BOTTOM_SHEET_BLEND_ID"
            r1.putString(r0, r8)
            java.lang.String r0 = "BLEND_BOTTOM_SHEET_THREAD_ID"
            r1.putString(r0, r7)
            r0 = 206(0xce, float:2.89E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putStringArray(r0, r6)
            r0 = 205(0xcd, float:2.87E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putStringArray(r0, r6)
            X.7Pr r0 = X.DbV.A0V(r1, r3, r5)
            X.DbU.A0y(r4, r3, r0)
            r0 = -1170564429(0xffffffffba3a9ab3, float:-7.118389E-4)
        L_0x076a:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x076e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0773:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0778:
            r1 = 0
            r2.setChecked(r1)
            r1 = 1270902238(0x4bc06dde, float:2.5222076E7)
            goto L_0x10a3
        L_0x0781:
            r8 = 0
            r14 = 0
            X.LT3 r4 = new X.LT3
            r13 = r8
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r4.A04()
            r0 = -2136591515(0xffffffff80a63365, float:-1.5263129E-38)
            goto L_0x07af
        L_0x0790:
            r0 = 1837299415(0x6d82f6d7, float:5.066433E27)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.H1I r0 = (X.H1I) r0
            X.0eM r0 = r0.A0J
            X.2YL r2 = X.DbS.A0H(r0)
            if (r2 == 0) goto L_0x07ac
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 26
            X.C58099ImL.A01(r2, r1, r0)
        L_0x07ac:
            r0 = 944230795(0x3847d18b, float:4.764045E-5)
        L_0x07af:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x07b3:
            java.lang.String r3 = "exit_pivot_page"
            java.lang.String r2 = "has_user_interacted"
            r1 = 1
            r4.A0K(r2, r1)
            java.lang.String r1 = "interaction_type"
            r4.A0J(r1, r3)
            X.DbT.A1J(r5)
            r1 = -14260307(0xffffffffff2667ad, float:-2.2119016E38)
            goto L_0x10a3
        L_0x07c8:
            r1.A04()
            r1 = -2115301245(0xffffffff81eb1083, float:-8.634906E-38)
            goto L_0x10a3
        L_0x07d0:
            X.STU r1 = r1.A02
            r1.A05()
            X.0eM r1 = r4.A0E
            java.lang.Object r5 = r1.getValue()
            X.GgR r5 = (X.C52974GgR) r5
            X.27r r2 = r5.A09
            X.80P r1 = X.AnonymousClass80P.SOUND_SYNC
            r2.A1Z(r1)
            X.8ZP r1 = r5.A0C
            X.1QP r4 = r1.A02
            long r2 = r1.A01
            java.lang.String r1 = "SOUND_SYNC_PUBLISH_TAPPED"
            r4.flowMarkPoint(r2, r1)
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 19
            X.C58099ImL.A01(r5, r2, r1)
            r1 = -332803433(0xffffffffec29d297, float:-8.212118E26)
            goto L_0x10a3
        L_0x07fd:
            java.util.List r13 = r0.A03
            r10 = 0
            r8.A01(r9, r10, r11, r12, r13)
            r0 = -1204145354(0xffffffffb83a3336, float:-4.439355E-5)
            goto L_0x1080
        L_0x0808:
            r0 = 1153351924(0x44bec0f4, float:1526.0298)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H12 r2 = (X.H12) r2
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            X.0eM r1 = r2.A0A
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.util.ArrayList r9 = r2.A05
            r6 = 0
            if (r9 == 0) goto L_0x083d
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L_0x083d
            X.0eM r1 = r2.A0B
            r1.getValue()
            X.28D r4 = X.28D.A2c
            r10 = 1
            X.0qQ.A0B(r5, r10)
            r7 = r6
            r8 = r6
            X.C250563lf.A0V(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = 2094500890(0x7cd78c1a, float:8.9534834E36)
            goto L_0x10a3
        L_0x083d:
            java.lang.String r0 = "Medium list is null or empty when trying to skip to sound sync"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x0844:
            r0 = -702779338(0xffffffffd61c7036, float:-4.3001439E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H1u r1 = (X.C54174H1u) r1
            X.C54174H1u.A02(r1)
            r1 = -6770670(0xffffffffff98b012, float:NaN)
            goto L_0x10a3
        L_0x0857:
            r0 = 1872325714(0x6f996c52, float:9.496432E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GcK r1 = (X.C52767GcK) r1
            X.JRI r2 = r1.A0D
            java.lang.String r1 = "favorites_feed_nav_bar"
            r2.DEt(r1)
            r1 = 1590644623(0x5ecf4f8f, float:7.4691579E18)
            goto L_0x10a3
        L_0x086e:
            r0 = -613833242(0xffffffffdb69a5e6, float:-6.5766077E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.C51965G9l.A1W(r1, r4)
            r1 = -1277595764(0xffffffffb3d96f8c, float:-1.012514E-7)
            goto L_0x10a3
        L_0x087f:
            r0 = -874224456(0xffffffffcbe464b8, float:-2.9935984E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.0mM r1 = (X.0mM) r1
            r1.A01(r4)
            r1 = 1388511272(0x52c30028, float:4.18760622E11)
            goto L_0x10a3
        L_0x0892:
            r0 = -1382957467(0xffffffffad91be65, float:-1.6569144E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ho4 r1 = (X.C55821Ho4) r1
            X.GBE r4 = r1.A04
            X.4bN r3 = r1.A01
            java.lang.String r2 = "three_dot_menu"
            r1 = 0
            r4.A0N(r3, r2, r1, r1)
            r1 = -394849231(0xffffffffe8771431, float:-4.667188E24)
            goto L_0x10a3
        L_0x08ac:
            r0 = -614257592(0xffffffffdb632c48, float:-6.3943507E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.1Av r1 = (X.1Av) r1
            X.0xY r3 = X.AnonymousClass7TE.A0p(r1)
            r1 = 536(0x218, float:7.51E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 0
            r3.E5T(r2, r1)
            r3.apply()
            r1 = 322236782(0x1334f16e, float:2.2838228E-27)
            goto L_0x10a3
        L_0x08cd:
            r0 = 1584912456(0x5e77d848, float:4.46477587E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCf r1 = (X.C52033GCf) r1
            X.GCg r2 = r1.A0H
            X.HNR r1 = X.HNR.A0F
            r2.A0D(r1)
            r1 = 186369797(0xb1bc705, float:3.000164E-32)
            goto L_0x10a3
        L_0x08e4:
            r0 = 789439518(0x2f0de41e, float:1.2904919E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCf r1 = (X.C52033GCf) r1
            X.GCg r2 = r1.A0H
            X.HNR r1 = X.HNR.A0F
            r2.A0D(r1)
            r1 = 1960424514(0x74d9b442, float:1.3798639E32)
            goto L_0x10a3
        L_0x08fb:
            r0 = 248797899(0xed45acb, float:5.2349465E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GCi r1 = (X.C52036GCi) r1
            androidx.fragment.app.FragmentActivity r5 = r1.A00
            com.instagram.common.session.UserSession r4 = r1.A02
            X.2EG r3 = X.2EG.A18
            X.4DH r1 = r1.A01
            java.lang.String r2 = r1.getModuleName()
            java.lang.String r1 = "https://www.facebook.com/help/instagram/1874272716133511?ref=igapp"
            X.FH7.A08(r5, r4, r3, r1, r2)
            r1 = 334242120(0x13ec2148, float:5.9607593E-27)
            goto L_0x10a3
        L_0x091c:
            r0 = -1560505903(0xffffffffa2fc91d1, float:-6.8459126E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Gkw r1 = (X.C53248Gkw) r1
            X.0sa r1 = r1.A03
            if (r1 == 0) goto L_0x092e
            r1.invoke()
        L_0x092e:
            r1 = 1424973409(0x54ef5e61, float:8.2246448E12)
            goto L_0x10a3
        L_0x0933:
            r0 = 1521138421(0x5aaabaf5, float:2.40281537E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.3NK r1 = (X.AnonymousClass3NK) r1
            X.0qQ.A0A(r4)
            r1.Dqe(r4)
            r1 = 1676042181(0x63e65fc5, float:8.499304E21)
            goto L_0x10a3
        L_0x0949:
            r0 = 961155339(0x394a110b, float:1.927057E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GPN r2 = (X.GPN) r2
            X.4bN r1 = X.GPN.A00(r2)
            if (r1 == 0) goto L_0x09a3
            X.1Xj r6 = r1.A02
            if (r6 == 0) goto L_0x09a3
            java.lang.Boolean r1 = X.GPN.A01(r2)
            if (r1 == 0) goto L_0x09a3
            java.lang.Boolean r1 = X.GPN.A01(r2)
            r5 = 1
            boolean r3 = X.AnonymousClass7TF.A1Y(r1, r5)
            r4 = 0
            com.instagram.igds.components.mediabutton.IgdsMediaButton r1 = r2.A03
            if (r3 == 0) goto L_0x09aa
            if (r1 == 0) goto L_0x0977
            r1.setEnabled(r4)
        L_0x0977:
            r1 = 22
            X.H50 r3 = new X.H50
            r3.<init>(r2, r1)
            X.0iw r8 = r2.A06
            com.instagram.common.session.UserSession r7 = r2.A07
            X.GBj r1 = r2.A02
            if (r1 == 0) goto L_0x09a8
            int r12 = r1.A06()
        L_0x098a:
            X.93T r1 = r2.A09
            java.lang.String r11 = r1.A01
            java.lang.String r9 = "creator_unpick"
        L_0x0990:
            java.lang.String r10 = "creator_pick_cta"
            X.C52086GEg.A0h(r7, r8, r9, r10, r11, r12)
            X.2is r2 = r2.A04
            if (r2 == 0) goto L_0x09a3
            com.instagram.common.session.UserSession r1 = X.C227232is.A01(r2)
            X.0qQ.A0B(r1, r4)
            X.C52200GIr.A01(r2, r3, r1, r6, r5)
        L_0x09a3:
            r1 = -1764048558(0xffffffff96dac152, float:-3.5341802E-25)
            goto L_0x10a3
        L_0x09a8:
            r12 = -1
            goto L_0x098a
        L_0x09aa:
            if (r1 == 0) goto L_0x09af
            r1.setEnabled(r4)
        L_0x09af:
            r1 = 23
            X.H50 r3 = new X.H50
            r3.<init>(r2, r1)
            X.0iw r8 = r2.A06
            com.instagram.common.session.UserSession r7 = r2.A07
            X.GBj r1 = r2.A02
            if (r1 == 0) goto L_0x09c9
            int r12 = r1.A06()
        L_0x09c2:
            X.93T r1 = r2.A09
            java.lang.String r11 = r1.A01
            java.lang.String r9 = "creator_pick"
            goto L_0x0990
        L_0x09c9:
            r12 = -1
            goto L_0x09c2
        L_0x09cb:
            r0 = 1212688594(0x484828d2, float:204963.28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.HK7 r4 = (X.HK7) r4
            X.4bN r3 = X.HK7.A00(r4)
            if (r3 == 0) goto L_0x09eb
            X.1Xj r1 = r3.A02
            if (r1 == 0) goto L_0x09eb
            X.2is r2 = r4.A05
            if (r2 == 0) goto L_0x09eb
            java.lang.Integer r1 = X.C52050GCw.A08(r4)
            r2.A0P(r3, r1)
        L_0x09eb:
            r1 = -1797206470(0xffffffff94e0ce3a, float:-2.2699562E-26)
            goto L_0x10a3
        L_0x09f0:
            r0 = 2084779958(0x7c4337b6, float:4.0545114E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GHU r1 = (X.GHU) r1
            X.JTB r2 = r1.A07
            X.4bN r1 = r1.A02
            r2.Dp6(r1)
            r1 = 1205531279(0x47daf28f, float:112101.12)
            goto L_0x10a3
        L_0x0a07:
            r0 = 963992967(0x39755d87, float:2.3399862E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GHU r1 = (X.GHU) r1
            X.JTB r3 = r1.A07
            X.4bN r2 = r1.A02
            X.GDe r1 = r1.A03
            r3.D95(r2, r1)
            r1 = 2076858895(0x7bca5a0f, float:2.1013411E36)
            goto L_0x10a3
        L_0x0a20:
            r0 = -2137570102(0xffffffff809744ca, float:-1.3891837E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.1Xj r1 = (X.1Xj) r1
            r1.A29()
            r1 = 1709287912(0x65e1a9e8, float:1.3320833E23)
            goto L_0x10a3
        L_0x0a33:
            r0 = -382889496(0xffffffffe92d91e8, float:-1.3114574E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GHU r1 = (X.GHU) r1
            X.JTB r4 = r1.A07
            X.4bN r3 = r1.A02
            X.GDe r2 = r1.A03
            int r1 = r2.A09()
            r4.DQj(r3, r2, r1)
            r1 = 2073209218(0x7b92a982, float:1.5230267E36)
            goto L_0x10a3
        L_0x0a50:
            r0 = -785128124(0xffffffffd133e544, float:-4.8290349E10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GHU r1 = (X.GHU) r1
            X.JTB r2 = r1.A07
            X.4bN r1 = r1.A02
            r2.DbE(r1)
            r1 = -1828880985(0xffffffff92fd7da7, float:-1.599752E-27)
            goto L_0x10a3
        L_0x0a67:
            r0 = 146412750(0x8ba14ce, float:1.1199359E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GHU r1 = (X.GHU) r1
            X.JTB r3 = r1.A07
            X.4bN r2 = r1.A02
            X.GDe r1 = r1.A03
            r3.Cw0(r2, r1)
            r1 = 820621449(0x30e9b089, float:1.7003156E-9)
            goto L_0x10a3
        L_0x0a80:
            r0 = 1615812724(0x604f5874, float:5.9763277E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.GHU r3 = (X.GHU) r3
            X.GCs r2 = r3.A08
            X.0qQ.A0A(r4)
            r1 = 0
            r2.A05(r4, r1, r1)
            X.3NK r1 = r3.A05
            r1.Dqe(r4)
            r1 = -2016382035(0xffffffff87d073ad, float:-3.136435E-34)
            goto L_0x10a3
        L_0x0a9e:
            r0 = -1585162061(0xffffffffa18458b3, float:-8.968146E-19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.GDB r1 = (X.GDB) r1
            com.instagram.clips.intf.ClipsViewerConfig r0 = r1.A0E
            boolean r0 = r0.A00()
            r10 = 1
            if (r0 != 0) goto L_0x0ace
            X.37E r3 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r2 = r1.A0D
            X.37D r0 = r3.A01(r2)
            if (r0 == 0) goto L_0x0af4
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r10) goto L_0x0af4
            X.37D r0 = r3.A01(r2)
            if (r0 == 0) goto L_0x0af4
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0n
            if (r0 != r10) goto L_0x0af4
        L_0x0ace:
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            r7 = 0
            r11 = 0
            com.instagram.explore.intf.ExploreFragmentConfig r6 = new com.instagram.explore.intf.ExploreFragmentConfig
            r8 = r7
            r9 = r7
            r12 = r10
            r13 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0 = 941(0x3ad, float:1.319E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putParcelable(r0, r6)
            com.instagram.common.session.UserSession r2 = r1.A0G
            androidx.fragment.app.FragmentActivity r1 = r1.A0D
            java.lang.String r0 = "explore_grid"
            X.DbY.A0u(r1, r3, r2, r0)
        L_0x0aef:
            r0 = 136996409(0x82a6639, float:5.1277676E-34)
            goto L_0x1080
        L_0x0af4:
            X.1pN r0 = X.C243443Yu.A00()
            X.0eM r0 = r0.A01
            java.lang.Object r0 = r0.getValue()
            X.HpU r0 = (X.C55907HpU) r0
            com.instagram.common.session.UserSession r1 = r1.A0G
            X.32L r0 = r0.A00(r10)
            X.Dbb.A11(r0, r2, r1)
            goto L_0x0aef
        L_0x0b0a:
            r0 = -1604842809(0xffffffffa0580ac7, float:-1.8299478E-19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.GDB r2 = (X.GDB) r2
            com.instagram.common.session.UserSession r4 = r2.A0G
            com.instagram.clips.intf.ClipsViewerSource r0 = com.instagram.clips.intf.ClipsViewerSource.CLIPS_MEDIA_NOTES
            X.4h3 r6 = X.C51965G9l.A0i(r0, r4)
            r3 = 1
            r6.A1Q = r3
            java.lang.String r0 = "clips_media_notes_stack"
            r6.A0p = r0
            X.0Tu r7 = X.0Tu.A05
            r0 = 2342171272827583648(0x2081105d00033ca0, double:4.072592723833149E-152)
            boolean r0 = X.182.A06(r7, r4, r0)
            r6.A1r = r0
            r0 = 2342171272827649185(0x2081105d00043ca1, double:4.072592723888719E-152)
            boolean r0 = X.182.A06(r7, r4, r0)
            r6.A1n = r0
            r0 = 36328263614151842(0x81105d00073ca2, double:3.037478419541219E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x0b53
            r0 = 36328263614217379(0x81105d00083ca3, double:3.037478419582665E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x0b53
            r3 = 0
        L_0x0b53:
            r6.A1q = r3
            com.instagram.clips.intf.ClipsViewerConfig r1 = r6.A00()
            androidx.fragment.app.FragmentActivity r0 = r2.A0D
            X.C250563lf.A0Y(r0, r1, r4)
            X.GBE r0 = r2.A0J
            X.GAc r0 = r0.A19
            java.lang.String r3 = r0.getModuleName()
            X.GBj r0 = r2.A0L
            X.4bN r0 = X.C52012GBj.A04(r0)
            if (r0 == 0) goto L_0x0b98
            X.1Xj r0 = r0.A02
            if (r0 == 0) goto L_0x0b98
            java.lang.String r2 = r0.getId()
        L_0x0b76:
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r4)
            java.lang.String r0 = "instagram_media_note_clips_entry_point_click_client"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0b93
            X.DbS.A1O(r1, r3)
            X.C51965G9l.A1J(r1, r2)
            r1.Cgf()
        L_0x0b93:
            r0 = -1950331507(0xffffffff8bc04d8d, float:-7.4072395E-32)
            goto L_0x1080
        L_0x0b98:
            r2 = 0
            goto L_0x0b76
        L_0x0b9a:
            r0 = -1929895252(0xffffffff8cf822ac, float:-3.8231317E-31)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.GDB r8 = (X.GDB) r8
            X.GD9 r1 = r8.A0M
            X.4bN r7 = r1.A02()
            r2 = 0
            if (r7 == 0) goto L_0x0d05
            X.5o2 r3 = r7.A01
        L_0x0bb0:
            X.5o2 r0 = X.C295365o2.AD_PREVIEW
            if (r3 == r0) goto L_0x0c35
            com.instagram.common.session.UserSession r11 = r8.A0G
            X.JVm r6 = X.AnonymousClass9PJ.A00(r11)
            com.instagram.clips.intf.ClipsViewerSource r0 = r8.A0F
            X.28D r4 = X.C55275Hf4.A00(r0)
            r3 = 1
            r6.A07(r4, r3)
            X.GBj r0 = r8.A0L
            int r6 = r0.A07()
            int r0 = r0.A09()
            if (r6 == r0) goto L_0x0cc4
            r7 = r2
        L_0x0bd1:
            X.GBE r2 = r8.A0J
            X.GAc r9 = r2.A19
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.0wc r1 = X.AnonymousClass0kN.A01(r9, r11)
            java.lang.String r0 = "instagram_clips_create_clips"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            X.C51979GAc.A01(r6, r9)
            r0 = 0
            X.C51970G9q.A19(r6, r0)
            X.C51967G9n.A17(r6)
            r1 = 0
            X.C51965G9l.A1F(r6, r1)
            X.C51965G9l.A1P(r6, r1)
            java.lang.String r0 = "viewer_init_media_compound_key"
            r6.AAJ(r0, r1)
            java.lang.String r0 = "mezql_token"
            r6.AAJ(r0, r1)
            X.C51965G9l.A1Q(r6, r1)
            X.AnonymousClass7TH.A0V(r6)
        L_0x0c05:
            X.2is r10 = r8.A0I
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L_0x0caa
            androidx.fragment.app.FragmentActivity r9 = r8.A0D
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L_0x0caa
            boolean r0 = r9.isDestroyed()
            if (r0 != 0) goto L_0x0caa
            X.JR1 r6 = r8.A0K
            X.GNk r1 = X.C52318GNk.ITEM_INTERACTION_NEW_PAGE
            X.GNj r0 = X.C52317GNj.A09
            r6.AGC(r7, r1, r0)
            X.Hrt r6 = X.I7J.A04(r4, r7, r11)
            if (r6 != 0) goto L_0x0c3a
            if (r7 != 0) goto L_0x0c3a
            r0 = 0
        L_0x0c2d:
            r1 = 0
            X.I3M.A00(r9, r0, r10, r4, r11)
            X.GIN r0 = r2.A15
            r0.A00 = r1
        L_0x0c35:
            r0 = -57224748(0xfffffffffc96d1d4, float:-6.264803E36)
            goto L_0x1080
        L_0x0c3a:
            X.Hrt r0 = X.C250563lf.A0C(r4)
            if (r6 != 0) goto L_0x0c41
            r6 = r0
        L_0x0c41:
            if (r7 == 0) goto L_0x0c4d
            java.lang.String r0 = r7.A0C()
            r6.A0V = r0
            java.lang.String r0 = r7.A0Q
            r6.A0W = r0
        L_0x0c4d:
            r6.A0m = r3
            com.instagram.clips.intf.ClipsViewerConfig r0 = r8.A0E
            boolean r0 = r0.A25
            if (r0 == 0) goto L_0x0ca8
            boolean r0 = X.C318996ps.A01()
            if (r0 == 0) goto L_0x0ca8
            X.C318996ps.A00()
            X.0Tu r7 = X.0Tu.A05
            r0 = 36321082429547603(0x8109d500122453, double:3.032937009481189E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x0ca8
            boolean r0 = X.1q7.A00(r11)
            if (r0 == 0) goto L_0x0ca8
            X.C318996ps.A00()
            r0 = 36321082429023309(0x8109d5000a244d, double:3.0329370091496234E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x0ca8
            boolean r0 = X.1q7.A00(r11)
            if (r0 == 0) goto L_0x0ca8
            android.os.Parcelable$Creator r0 = com.instagram.pendingmedia.model.recipients.PendingRecipient.CREATOR
            com.instagram.user.model.User r1 = X.DbT.A0j(r11)
            com.instagram.pendingmedia.model.recipients.PendingRecipient r0 = new com.instagram.pendingmedia.model.recipients.PendingRecipient
            r0.<init>((com.instagram.user.model.User) r1)
            r0.A0Y = r3
        L_0x0c92:
            r6.A0B = r0
            X.0Tu r7 = X.0Tu.A05
            r0 = 36324973669069343(0x810d5f0005321f, double:3.035397845023501E-306)
            boolean r0 = X.182.A06(r7, r11, r0)
            if (r0 == 0) goto L_0x0ca3
            r6.A0n = r3
        L_0x0ca3:
            android.os.Bundle r0 = r6.A00()
            goto L_0x0c2d
        L_0x0ca8:
            r0 = 0
            goto L_0x0c92
        L_0x0caa:
            X.JVm r2 = X.AnonymousClass9PJ.A00(r11)
            X.0JA.A01()
            X.29E r6 = r2.A04
            long r10 = r2.A00
            java.lang.String r7 = "activity_finishing"
            r9 = 585177486(0x22e1198e, float:6.101343E-18)
            java.lang.String r8 = ""
            long r0 = r6.A07(r7, r8, r9, r10)
            r2.A00 = r0
            goto L_0x0c35
        L_0x0cc4:
            if (r7 == 0) goto L_0x0cc8
            X.5o2 r2 = r7.A01
        L_0x0cc8:
            X.5o2 r0 = X.C295365o2.MIDCARD
            if (r2 != r0) goto L_0x0ce4
            X.GmI r0 = r7.A01()
            java.util.List r0 = r0.A0H
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0ce6
            X.GmI r0 = r7.A01()
            java.util.List r0 = r0.A0H
            java.lang.Object r7 = X.AnonymousClass7TE.A13(r0)
            X.4bN r7 = (X.C267324bN) r7
        L_0x0ce4:
            if (r7 == 0) goto L_0x0bd1
        L_0x0ce6:
            X.1Xj r12 = r7.A02
            if (r12 == 0) goto L_0x0bd1
            X.GBE r2 = r8.A0J
            X.GAc r13 = r2.A19
            X.93T r14 = r2.A1D
            X.Hlh r0 = r2.A1E
            java.lang.String r15 = r0.A00
            X.0sa r0 = r1.A00
            int r17 = X.C52012GBj.A01(r0)
            X.1Xj r0 = r7.A02
            java.lang.String r16 = X.GN9.A00(r0)
            X.C52086GEg.A0k(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0c05
        L_0x0d05:
            r3 = r2
            goto L_0x0bb0
        L_0x0d08:
            r0 = -194494982(0xfffffffff4683dfa, float:-7.360046E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.3NK r1 = (X.AnonymousClass3NK) r1
            X.0qQ.A0A(r4)
            r1.Dqe(r4)
            r1 = 899021231(0x3595f9af, float:1.1174033E-6)
            goto L_0x10a3
        L_0x0d1e:
            r0 = -719587157(0xffffffffd51bf8ab, float:-1.07182702E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.H0c r5 = (X.C54133H0c) r5
            X.Gzg r4 = new X.Gzg
            r4.<init>()
            r4.A00 = r5
            X.0eM r1 = r5.A0C
            X.7Pr r3 = X.DbX.A0f(r1)
            android.content.Context r2 = r5.requireContext()
            r1 = 2131955281(0x7f130e51, float:1.9547085E38)
            X.DbZ.A0z(r2, r3, r1)
            r1 = 0
            X.DbS.A1S(r3, r1)
            r2 = 8
            X.Lys r1 = new X.Lys
            r1.<init>(r5, r2)
            r3.A0T = r1
            X.DbY.A13(r5, r4, r3)
            r1 = 2017010726(0x78392426, float:1.5020439E34)
            goto L_0x10a3
        L_0x0d55:
            r0 = -741924029(0xffffffffd3c72343, float:-1.71058017E12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -1554047105(0xffffffffa35f1f7f, float:-1.2095524E-17)
            goto L_0x10a3
        L_0x0d66:
            r0 = -893286916(0xffffffffcac185fc, float:-6341374.0)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.Hms r7 = (X.C55757Hms) r7
            X.H0c r6 = r7.A02
            X.0eM r0 = r6.A0D
            java.lang.Object r4 = r0.getValue()
            X.1Av r4 = (X.1Av) r4
            r3 = 1
            X.0s0 r2 = r4.A2c
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 189(0xbd, float:2.65E-43)
            X.AnonymousClass7TF.A1J(r4, r2, r1, r0, r3)
            X.DbZ.A15(r6)
            com.instagram.common.session.UserSession r0 = r7.A01
            X.27r r0 = X.27p.A01(r0)
            X.29V r4 = r0.A0C
            X.0wc r1 = r4.A01
            java.lang.String r0 = "ig_camera_nux"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0e0e
            java.lang.String r1 = "TRANSLATE_AND_DUB_REEL_TAP"
            java.lang.String r0 = "entity"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "TAP"
            java.lang.String r0 = "nux_step"
            r2.AAJ(r0, r1)
            X.283 r3 = r4.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x0db4
            java.lang.String r1 = ""
        L_0x0db4:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.28D r0 = r3.A09
            X.DbS.A1F(r0, r2)
            r1 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            int r0 = r3.A01
            if (r0 == r1) goto L_0x0dc9
            r1 = 1
        L_0x0dc9:
            r0 = 535(0x217, float:7.5E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            X.8fP r1 = r4.A0I()
            java.lang.String r0 = "capture_type"
            r2.A8M(r1, r0)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "media_type"
            r2.A8M(r1, r0)
            X.0iw r0 = X.27x.A08
            X.DbW.A15(r2, r0)
            X.JVj r0 = X.C59725JVj.PRE_CAPTURE
            X.C51965G9l.A1A(r0, r2)
            java.lang.Long r1 = X.C51971G9r.A0m()
            r0 = 137(0x89, float:1.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A9F(r0, r1)
            java.lang.String r1 = r3.A0O
            r0 = 77
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.AAJ(r0, r1)
            java.lang.String r1 = r3.A0P
            java.lang.String r0 = "search_session_id"
            r2.AAJ(r0, r1)
            X.AnonymousClass7TH.A0V(r2)
        L_0x0e0e:
            r0 = -1891002492(0xffffffff8f499784, float:-9.939246E-30)
            goto L_0x1080
        L_0x0e13:
            r0 = 1463054304(0x57346fe0, float:1.98392592E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.HJb r2 = (X.C54566HJb) r2
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.common.session.UserSession r6 = r2.A03
            android.view.View r1 = r2.A01
            android.content.Context r5 = r1.getContext()
            r1 = 2131975046(0x7f135b86, float:1.9587173E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r5, r1)
            r3 = 0
            X.0qQ.A0B(r6, r3)
            java.lang.String r2 = "description"
            android.os.Bundle r1 = X.DbY.A09(r6)
            r1.putString(r2, r4)
            X.Gzd r4 = new X.Gzd
            r4.<init>()
            X.7Pr r2 = X.DbV.A0V(r1, r4, r6)
            r1 = 2131100285(0x7f06027d, float:1.7812947E38)
            int r1 = r5.getColor(r1)
            r2.A06 = r1
            r2.A1C = r3
            r1 = 2131975047(0x7f135b87, float:1.9587175E38)
            X.DbZ.A0z(r5, r2, r1)
            r1 = 2131100241(0x7f060251, float:1.7812858E38)
            int r1 = r5.getColor(r1)
            r2.A0E = r1
            X.7Pu r3 = r2.A00()
            android.app.Activity r2 = X.C61270mF.A00(r5)
            r1 = 8
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.0qQ.A0C(r4, r1)
            r3.A02(r2, r4)
            r1 = 108167491(0x6728143, float:4.5610108E-35)
            goto L_0x10a3
        L_0x0e78:
            r0 = 691128712(0x2931c988, float:3.9476696E-14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -32697246(0xfffffffffe0d1462, float:-4.6881745E37)
            goto L_0x10a3
        L_0x0e89:
            r0 = -545621943(0xffffffffdf7a7849, float:-1.8048256E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.H1A r4 = (X.H1A) r4
            android.content.Context r2 = r4.requireContext()
            X.0eM r1 = r4.A0E
            X.Dg1 r3 = X.C46498Dg1.A00(r2, r1)
            r2 = 2131975270(0x7f135c66, float:1.9587628E38)
            r1 = 26
            X.ICy r1 = A00(r4, r1)
            r3.A04(r1, r2)
            r2 = 2131975265(0x7f135c61, float:1.9587617E38)
            r1 = 27
            X.ICy r1 = A00(r4, r1)
            r3.A04(r1, r2)
            r2 = 2131975269(0x7f135c65, float:1.9587626E38)
            r1 = 28
            X.ICy r1 = A00(r4, r1)
            r3.A04(r1, r2)
            X.C49945FFy.A00(r4, r3)
            r1 = 1657153563(0x62c6281b, float:1.8276726E21)
            goto L_0x10a3
        L_0x0eca:
            r0 = -1776330817(0xffffffff961f57bf, float:-1.2871605E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1923093436(0x72a013bc, float:6.341307E30)
            goto L_0x10a3
        L_0x0edb:
            r0 = -1624180995(0xffffffff9f30f6fd, float:-3.7473754E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1135523271(0x43aeb5c7, float:349.42014)
            goto L_0x10a3
        L_0x0eec:
            r0 = -276082830(0xffffffffef8b4f72, float:-8.622892E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 808298531(0x302da823, float:6.317597E-10)
            goto L_0x10a3
        L_0x0efd:
            r0 = -566909558(0xffffffffde35a58a, float:-3.27225491E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.HJZ r5 = (X.HJZ) r5
            X.JVg r4 = X.C59722JVg.DRAFT_FOLDER
            com.instagram.common.session.UserSession r3 = r5.A07
            X.LPH r2 = new X.LPH
            r2.<init>(r4, r5, r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r2.A06(r1)
            X.K4z r2 = X.HWF.A00(r4)
            X.2k4 r1 = X.AnonymousClass2k4.NIGHT
            r2.setDayNightMode(r1)
            android.app.Activity r1 = r5.A03
            X.DbS.A1X(r1)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.Dbb.A11(r2, r1, r3)
            r1 = -431090385(0xffffffffe64e152f, float:-2.4329957E23)
            goto L_0x10a3
        L_0x0f2e:
            r0 = 1719179768(0x667899f8, float:2.9349678E23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H0d r2 = (X.C54134H0d) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            X.C54134H0d.A01(r2, r1)
            r1 = 351413740(0x14f225ec, float:2.4450713E-26)
            goto L_0x10a3
        L_0x0f43:
            r0 = 134863535(0x809daaf, float:4.1484E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.H0d r2 = (X.C54134H0d) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.C54134H0d.A01(r2, r1)
            r1 = 1262461651(0x4b3fa2d3, float:1.2559059E7)
            goto L_0x10a3
        L_0x0f58:
            r0 = -1780267386(0xffffffff95e34686, float:-9.1795836E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0d r1 = (X.C54134H0d) r1
            X.C54134H0d.A00(r1)
            r1 = 199260455(0xbe07927, float:8.646395E-32)
            goto L_0x10a3
        L_0x0f6b:
            r0 = 1867034790(0x6f48b0a6, float:6.2110557E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0d r1 = (X.C54134H0d) r1
            X.C54134H0d.A00(r1)
            r1 = 512998018(0x1e93ba82, float:1.5641368E-20)
            goto L_0x10a3
        L_0x0f7e:
            r0 = -663746835(0xffffffffd87006ed, float:-1.05565015E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0d r1 = (X.C54134H0d) r1
            X.C54134H0d.A00(r1)
            r1 = -634173509(0xffffffffda3347bb, float:-1.26157223E16)
            goto L_0x10a3
        L_0x0f91:
            r0 = -1125004124(0xffffffffbcf1cca4, float:-0.029516526)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H1J r1 = (X.H1J) r1
            r1.onBackPressed()
            r1 = 2158495(0x20ef9f, float:3.024696E-39)
            goto L_0x10a3
        L_0x0fa4:
            r0 = -850790213(0xffffffffcd49f8bb, float:-2.11782576E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            r1.onBackPressed()
            r1 = 223059904(0xd4b9fc0, float:6.2746497E-31)
            goto L_0x10a3
        L_0x0fb7:
            r0 = 172885258(0xa4e050a, float:9.919487E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            X.C54144H0o.A02(r1)
            r1 = -1644824396(0xffffffff9df5f8b4, float:-6.5108113E-21)
            goto L_0x10a3
        L_0x0fca:
            r0 = 670802797(0x27fba36d, float:6.984368E-15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            X.C54144H0o.A01(r1)
            r1 = 143927150(0x894276e, float:8.916696E-34)
            goto L_0x10a3
        L_0x0fdd:
            r0 = 1894335956(0x70e945d4, float:5.775554E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            X.C54144H0o.A01(r1)
            r1 = -1672011937(0xffffffff9c571f5f, float:-7.117808E-22)
            goto L_0x10a3
        L_0x0ff0:
            r0 = -1409682820(0xffffffffabf9f27c, float:-1.7759817E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            X.C54144H0o.A02(r1)
            r1 = 2051498787(0x7a476323, float:2.5881945E35)
            goto L_0x10a3
        L_0x1003:
            r0 = 356571508(0x1540d974, float:3.894563E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.H0o r1 = (X.C54144H0o) r1
            X.C54144H0o.A01(r1)
            r1 = -1776037619(0xffffffff9623d10d, float:-1.3233E-25)
            goto L_0x10a3
        L_0x1016:
            r0 = -115178670(0xfffffffff9228352, float:-5.2738474E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Gi7 r1 = (X.C53074Gi7) r1
            X.Htl r1 = r1.A01
            r1.A02()
            r1 = -1153241422(0xffffffffbb42eeb2, float:-0.0029744324)
            goto L_0x10a3
        L_0x102a:
            r0 = 2043156404(0x79c817b4, float:1.2986752E35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.H1a r7 = (X.C54156H1a) r7
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r1 = r7.A00
            if (r1 == 0) goto L_0x105d
            X.0eM r0 = r7.A01
            X.0lg r6 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            com.instagram.clips.model.metadata.AudioPageMetadata r3 = X.LT9.A02(r1)
            X.8ZN r2 = X.AnonymousClass8ZN.AUDIO_PAGE_MAY_INCLUDE
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r0 = 0
            android.os.Bundle r2 = X.C250563lf.A02(r0, r2, r3, r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            java.lang.String r0 = "audio_page"
            X.6W8 r0 = X.DbS.A0b(r1, r2, r6, r4, r0)
            X.DbT.A1L(r7, r0)
        L_0x105d:
            r0 = -305855294(0xffffffffedc504c2, float:-7.6217873E27)
            goto L_0x1080
        L_0x1061:
            r0 = 1461717660(0x57200a9c, float:1.75967427E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.IO9 r3 = (X.IO9) r3
            X.Ghc r2 = r3.A0X
            X.GVW r0 = X.C53044Ghc.A00(r2)
            if (r0 == 0) goto L_0x107d
            X.46i r1 = r0.A03
            if (r1 == 0) goto L_0x107d
            java.lang.String r0 = r3.A0Z
            r2.A04(r1, r0)
        L_0x107d:
            r0 = 831864903(0x31954047, float:4.3437782E-9)
        L_0x1080:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x1084:
            r0 = 1217551068(0x48925adc, float:299734.88)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.IO9 r1 = (X.IO9) r1
            X.Htl r1 = r1.A0Y
            r1.A02()
            r1 = -1158361885(0xffffffffbaf4cce3, float:-0.0018676784)
            goto L_0x10a3
        L_0x1098:
            r1 = 8
            r2.setVisibility(r1)
            X.H1U.A01(r3)
            r1 = -1845347878(0xffffffff920239da, float:-4.1092075E-28)
        L_0x10a3:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56801ICy.onClick(android.view.View):void");
    }
}
