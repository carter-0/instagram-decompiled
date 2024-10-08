package X;

import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.creation.fragment.EditMediaInfoFragment;

public final class LYB implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LYB(C61441K7r k7r, int i) {
        this.A00 = i;
        if (49 - i != 0) {
            this.A01 = k7r;
        } else {
            this.A01 = k7r;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LYB(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r0v276, types: [X.1qK, java.lang.Object, X.LfC] */
    /* JADX WARNING: type inference failed for: r0v282, types: [X.1qK, java.lang.Object, X.LfC] */
    /* JADX WARNING: type inference failed for: r0v383, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0461, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0464, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0465, code lost:
        r9 = "publicRadioButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0469, code lost:
        r9 = "privateRadioButton";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0986, code lost:
        if (r1.A00.getBoolean("PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING", false) == false) goto L_0x0988;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0104, code lost:
        if (com.instagram.creation.fragment.EditMediaInfoFragment.A0O(r1) == false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0e06, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0e09, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0e6e, code lost:
        X.0qQ.A0F(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0e75, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x105f, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x1062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x1099, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x109c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x10c8, code lost:
        X.AnonymousClass0fD.A0C(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x10cb, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A00
            r6 = r19
            switch(r0) {
                case 0: goto L_0x109d;
                case 1: goto L_0x1063;
                case 2: goto L_0x1047;
                case 3: goto L_0x0feb;
                case 4: goto L_0x0fd9;
                case 5: goto L_0x0fab;
                case 6: goto L_0x0f9a;
                case 7: goto L_0x0f87;
                case 8: goto L_0x0f6a;
                case 9: goto L_0x0f21;
                case 10: goto L_0x0f0e;
                case 11: goto L_0x0efd;
                case 12: goto L_0x0eec;
                case 13: goto L_0x0ed9;
                case 14: goto L_0x0ec6;
                case 15: goto L_0x0e5d;
                case 16: goto L_0x0e35;
                case 17: goto L_0x0e22;
                case 18: goto L_0x0e0f;
                case 19: goto L_0x0dc5;
                case 20: goto L_0x0d71;
                case 21: goto L_0x0d5c;
                case 22: goto L_0x0d47;
                case 23: goto L_0x0d2a;
                case 24: goto L_0x0cf4;
                case 25: goto L_0x00c7;
                case 26: goto L_0x0cb1;
                case 27: goto L_0x0009;
                case 28: goto L_0x0092;
                case 29: goto L_0x0c95;
                case 30: goto L_0x0c95;
                case 31: goto L_0x0c77;
                case 32: goto L_0x0c4a;
                case 33: goto L_0x0009;
                case 34: goto L_0x0c41;
                case 35: goto L_0x0ba0;
                case 36: goto L_0x0b84;
                case 37: goto L_0x0b5d;
                case 38: goto L_0x0aea;
                case 39: goto L_0x09ed;
                case 40: goto L_0x09c0;
                case 41: goto L_0x0751;
                case 42: goto L_0x070e;
                case 43: goto L_0x06f0;
                case 44: goto L_0x06dd;
                case 45: goto L_0x06ca;
                case 46: goto L_0x06ac;
                case 47: goto L_0x0633;
                case 48: goto L_0x0629;
                case 49: goto L_0x060c;
                case 50: goto L_0x05e0;
                case 51: goto L_0x05b9;
                case 52: goto L_0x059e;
                case 53: goto L_0x0588;
                case 54: goto L_0x056b;
                case 55: goto L_0x053a;
                case 56: goto L_0x051d;
                case 57: goto L_0x04b5;
                case 58: goto L_0x0480;
                case 59: goto L_0x046d;
                case 60: goto L_0x042a;
                case 61: goto L_0x03f1;
                case 62: goto L_0x03d4;
                case 63: goto L_0x0354;
                case 64: goto L_0x030c;
                case 65: goto L_0x02f5;
                case 66: goto L_0x02ce;
                case 67: goto L_0x02ac;
                case 68: goto L_0x0258;
                case 69: goto L_0x007a;
                case 70: goto L_0x0235;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r8 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r8 = (com.instagram.creation.fragment.EditMediaInfoFragment) r8
            X.JTT.A16(r8)
            android.content.Context r10 = r8.requireContext()
            X.1Xj r12 = r8.A0I
            com.instagram.common.session.UserSession r11 = r8.getSession()
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            r0 = 2
            X.0Tu r2 = X.DbS.A0J(r11, r0)
            r0 = 36323599279402292(0x810c1f00032d34, double:3.034528675463835E-306)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0079
            android.content.res.Resources r5 = r10.getResources()
            X.Hto r4 = new X.Hto
            r4.<init>(r11)
            r0 = 2131962316(0x7f1329cc, float:1.9561354E38)
            java.lang.String r6 = X.AnonymousClass7TF.A0d(r5, r0)
            r2 = 2131238196(0x7f081d34, float:1.8092664E38)
            r1 = 12
            X.LYF r0 = new X.LYF
            r0.<init>((java.lang.Object) r8, (int) r1)
            r4.A00(r10, r0, r6, r2)
            r0 = 2131962317(0x7f1329cd, float:1.9561356E38)
            java.lang.String r1 = X.AnonymousClass7TF.A0d(r5, r0)
            r0 = 2131238581(0x7f081eb5, float:1.8093445E38)
            r7 = 4
            X.LXf r6 = new X.LXf
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r4.A01(r10, r6, r1, r0)
            r0 = 2131962315(0x7f1329cb, float:1.9561352E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0d(r5, r0)
            r1 = 2131238125(0x7f081ced, float:1.809252E38)
            X.LXt r0 = X.C64267LXt.A00
            r4.A01(r10, r0, r2, r1)
            r0 = 1
            r4.A03 = r0
            X.Vho r0 = new X.Vho
            r0.<init>(r4)
            r0.A00(r3)
        L_0x0079:
            return
        L_0x007a:
            java.lang.Object r1 = r1.A01
            X.K5H r1 = (X.K5H) r1
            android.location.Location r0 = r1.A02
            if (r0 != 0) goto L_0x0086
            X.K5H.A08(r1)
            return
        L_0x0086:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r1.A0J
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = r0.getSearchString()
            r1.A0C(r0)
            return
        L_0x0092:
            java.lang.Object r3 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r3 = (com.instagram.creation.fragment.EditMediaInfoFragment) r3
            X.JTT.A16(r3)
            android.content.Context r2 = r3.requireContext()
            X.1Xj r1 = r3.A0I
            com.instagram.common.session.UserSession r5 = r3.getSession()
            r0 = 2
            X.0qQ.A0B(r5, r0)
            boolean r0 = X.LIZ.A00(r5, r1)
            if (r0 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            java.lang.String r6 = r1.getId()
            if (r6 == 0) goto L_0x0079
            X.Lo9 r0 = new X.Lo9
            r1 = r0
            r4 = r3
            r1.<init>(r2, r3, r4, r5, r6)
            r1 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A04
            r2 = r1
            r3 = r1
            r5 = r1
            r6 = r1
            r0.Exg(r1, r2, r3, r4, r5, r6)
            return
        L_0x00c7:
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = (com.instagram.creation.fragment.EditMediaInfoFragment) r1
            X.1Xj r0 = r1.A0I
            r0.getClass()
            X.1Xj r0 = r1.A0I
            r0.getClass()
            X.1Xj r0 = r1.A0I
            X.3QO r2 = r0.A1t()
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01f5
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00e5:
            int r2 = r0.intValue()
            r5 = 1
            if (r2 == r5) goto L_0x01d1
            r0 = 2
            if (r2 == r0) goto L_0x01cd
            r0 = 4
            if (r2 == r0) goto L_0x01c9
            r0 = 5
            if (r2 == r0) goto L_0x01c5
            r0 = 3
            if (r2 == r0) goto L_0x01d5
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0P(r1)
            r4 = 0
            if (r0 != 0) goto L_0x0106
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0O(r1)
            r3 = 0
            if (r0 != 0) goto L_0x0107
        L_0x0106:
            r3 = 1
        L_0x0107:
            android.content.Context r2 = r1.requireContext()
            X.Kj1 r0 = X.C62630Kj1.PEOPLE
            X.LRj r6 = new X.LRj
            r6.<init>(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A02 = r0
            X.C64167LRj.A01(r1, r6)
            com.instagram.common.session.UserSession r0 = r1.getSession()
            r6.A03(r0)
            r6.A0B = r5
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0N(r1)
            r6.A0F = r0
            r6.A0J = r4
            r6.A0I = r3
            r6.A0H = r5
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0P(r1)
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L_0x01a6
            X.C64167LRj.A00(r1, r6)
        L_0x013b:
            android.content.Intent r4 = r6.A02()
            com.instagram.common.session.UserSession r0 = r1.getSession()
            X.2cc r2 = X.C71342cb.A00(r0)
            androidx.fragment.app.FragmentActivity r0 = r1.requireActivity()
            r2.A06(r0)
            X.0kR.A05(r1, r4, r3)
        L_0x0151:
            X.JbO r1 = r1.A0F
            java.lang.String r8 = "edit_collab_tagging"
            com.instagram.common.session.UserSession r0 = r1.A05
            X.27r r0 = X.27p.A01(r0)
            X.29Z r7 = r0.A0F
            java.lang.String r6 = X.C59899JbO.A03(r1)
            X.28D r5 = r1.A00
            r4 = 2
            X.0qQ.A0B(r5, r4)
            X.0Aj r3 = X.JTR.A0d(r7)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0079
            X.80P r0 = X.AnonymousClass80P.INVITE_COLLABORATOR
            X.JTO.A1O(r0, r3)
            X.283 r2 = r7.A04
            java.lang.String r0 = X.JTP.A0p(r2)
            java.lang.String r1 = "camera_session_id"
            r3.AAJ(r1, r0)
            java.lang.String r0 = "MODIFY"
            X.DbS.A1J(r3, r0)
            java.lang.String r0 = "IG_CAMERA_INVITE_COLLABORATOR_TAP"
            X.JTO.A1T(r3, r0)
            r3.AAJ(r1, r6)
            X.JTP.A1H(r3)
            X.JTQ.A12(r3, r7)
            X.JTS.A15(r5, r3, r4)
            X.JTP.A1J(r3, r2)
            X.DbS.A1K(r3, r8)
            X.JVj r0 = X.C59725JVj.EDIT_POST
            X.C51965G9l.A1A(r0, r3)
            X.AnonymousClass7TH.A0V(r3)
            return
        L_0x01a6:
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0O(r1)
            if (r0 == 0) goto L_0x01ae
            r3 = 1003(0x3eb, float:1.406E-42)
        L_0x01ae:
            X.1Xj r7 = r1.A0I
            java.util.ArrayList r9 = r1.A0a
            java.util.ArrayList r10 = r1.A0W
            java.util.ArrayList r11 = r1.A0b
            java.util.List r13 = r1.A0g
            java.util.ArrayList r14 = r1.A0Y
            java.util.ArrayList r15 = r1.A0X
            java.lang.String r8 = r1.A0V
            java.util.ArrayList r12 = r1.A0Z
            r6.A07(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            goto L_0x013b
        L_0x01c5:
            r0 = 2131956230(0x7f131206, float:1.954901E38)
            goto L_0x01d8
        L_0x01c9:
            r0 = 2131956233(0x7f131209, float:1.9549016E38)
            goto L_0x01d8
        L_0x01cd:
            r0 = 2131956231(0x7f131207, float:1.9549012E38)
            goto L_0x01d8
        L_0x01d1:
            r0 = 2131956232(0x7f131208, float:1.9549014E38)
            goto L_0x01d8
        L_0x01d5:
            r0 = 2131956234(0x7f13120a, float:1.9549018E38)
        L_0x01d8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.content.Context r3 = r1.getContext()
            int r2 = r0.intValue()
            r0 = 2131956228(0x7f131204, float:1.9549006E38)
            X.8ab r2 = X.JTU.A0N(r3, r0, r2)
            X.LUh r0 = X.C64217LUh.A00
            r2.A0E(r0)
            X.DbT.A1V(r2)
            goto L_0x0151
        L_0x01f5:
            X.1Xj r0 = r1.A0I
            X.3QO r2 = r0.A1t()
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0207
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            goto L_0x00e5
        L_0x0207:
            X.1Xj r0 = r1.A0I
            X.3QO r2 = r0.A1t()
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0219
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00e5
        L_0x0219:
            X.1Xj r0 = r1.A0I
            boolean r0 = r0.A5u()
            if (r0 == 0) goto L_0x0225
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x00e5
        L_0x0225:
            X.1Xj r0 = r1.A0I
            boolean r0 = r0.A6H()
            if (r0 == 0) goto L_0x0231
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x00e5
        L_0x0231:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00e5
        L_0x0235:
            java.lang.Object r2 = r1.A01
            X.K5H r2 = (X.K5H) r2
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x0249
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            r0 = 3
            r1.setResult(r0)
            X.DbT.A1K(r2)
            return
        L_0x0249:
            com.instagram.common.session.UserSession r0 = r2.A0B
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r0)
            X.LfJ r0 = new X.LfJ
            r0.<init>()
            r1.A00(r0)
            return
        L_0x0258:
            r0 = -1612551194(0xffffffff9fe26be6, float:-9.5893226E-20)
            int r4 = X.DbX.A03(r6, r0)
            X.2AS r5 = X.AnonymousClass2AV.A00
            if (r5 == 0) goto L_0x028c
            android.content.Context r6 = r6.getContext()
            java.lang.Object r3 = r1.A01
            X.LOe r3 = (X.LOe) r3
            com.instagram.model.venue.Venue r0 = r3.A01
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0299
            java.lang.Double r1 = r0.A00()
            if (r1 == 0) goto L_0x02a1
            com.instagram.model.venue.Venue r0 = r3.A01
            if (r0 == 0) goto L_0x0291
            java.lang.Double r0 = r0.A01()
            if (r0 == 0) goto L_0x0291
            double r7 = r1.doubleValue()
            double r9 = r0.doubleValue()
            r5.A01(r6, r7, r9)
        L_0x028c:
            r0 = -960840337(0xffffffffc6babd6f, float:-23902.717)
            goto L_0x105f
        L_0x0291:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -1037791623(0xffffffffc2248e79, float:-41.139133)
            goto L_0x02a8
        L_0x0299:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = -337496906(0xffffffffebe234b6, float:-5.469323E26)
            goto L_0x02a8
        L_0x02a1:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r2)
            r0 = 348925243(0x14cc2d3b, float:2.0616576E-26)
        L_0x02a8:
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x02ac:
            r0 = -1492380380(0xffffffffa70c1524, float:-1.9440363E-15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LOe r0 = (X.LOe) r0
            X.MUo r0 = r0.A00
            if (r0 == 0) goto L_0x02c3
            r0.DOl()
            r0 = 557413262(0x2139738e, float:6.2833373E-19)
            goto L_0x0461
        L_0x02c3:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1703819617(0x658e3961, float:8.395431E22)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x02ce:
            r0 = 228253089(0xd9adda1, float:9.544338E-31)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.LOe r1 = (X.LOe) r1
            X.MUo r0 = r1.A00
            if (r0 == 0) goto L_0x02ea
            r0.DOi()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.LOe.A00(r1, r0)
            r0 = -179096597(0xfffffffff55333eb, float:-2.6773136E32)
            goto L_0x0461
        L_0x02ea:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -2132828509(0xffffffff80df9ea3, float:-2.0536224E-38)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r1
        L_0x02f5:
            r0 = 102166401(0x616ef81, float:2.8387824E-35)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LOe r0 = (X.LOe) r0
            X.MUo r0 = r0.A00
            if (r0 == 0) goto L_0x0307
            r0.DOl()
        L_0x0307:
            r0 = 838074436(0x31f40044, float:7.101365E-9)
            goto L_0x0e06
        L_0x030c:
            r0 = -52897478(0xfffffffffcd8d93a, float:-9.007536E36)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.LFW r4 = (X.LFW) r4
            X.LE1 r0 = r4.A05
            java.lang.Integer r3 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 == r0) goto L_0x0330
            java.lang.Integer r0 = X.AnonymousClass05K.A07
            if (r3 != r0) goto L_0x0335
            android.view.View r0 = r4.A01
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r1 = r4.A03
            java.lang.String r0 = "share_post_to_threads"
            X.FFO.A02(r2, r1, r0)
        L_0x0330:
            r0 = 588882235(0x2319a13b, float:8.3282885E-18)
            goto L_0x0e06
        L_0x0335:
            android.app.Activity r0 = r4.A00
            X.8ab r2 = X.DbS.A0X(r0)
            r0 = 2131973550(0x7f1355ae, float:1.9584139E38)
            r2.A09(r0)
            android.view.View r0 = r4.A01
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r0 = X.C63196Kt3.A00(r1, r0, r3)
            r2.A0q(r0)
            X.Dba.A1L(r2)
            goto L_0x0330
        L_0x0354:
            r0 = 1484191569(0x5876f751, float:1.08616831E15)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K6P r7 = (X.K6P) r7
            X.0eM r6 = r7.A02
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r4 = X.JTT.A0p(r6)
            r9 = 0
            X.KkI r2 = X.C62656KkI.PRIVACY_SELECTION
            X.KkO r1 = X.C62662KkO.A03
            X.Kk8 r0 = X.K6P.A00(r7)
            X.LT4.A03(r1, r0, r2, r5, r4)
            X.7Pr r6 = X.DbX.A0f(r6)
            r2 = 1
            r12 = 0
            java.lang.String r11 = ""
            X.7Ps r8 = new X.7Ps
            r10 = r9
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13)
            r0 = 2131231324(0x7f08025c, float:1.8078726E38)
            r8.A02 = r0
            r1 = 62
            X.LYB r0 = new X.LYB
            r0.<init>((java.lang.Object) r7, (int) r1)
            r8.A05 = r0
            X.7Pt r0 = r8.A00()
            r6.A06(r0)
            r6.A1C = r2
            android.content.Context r0 = r7.requireContext()
            r1 = 2131975326(0x7f135c9e, float:1.9587741E38)
            android.content.Context r0 = X.02K.A01(r0)
            X.DbZ.A0z(r0, r6, r1)
            X.37D r0 = X.DbX.A0i(r7)
            X.7Pu r5 = X.C48943Emh.A00(r0)
            if (r5 == 0) goto L_0x03cf
            X.K6N r4 = new X.K6N
            r4.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.Jew r0 = r7.A00
            if (r0 == 0) goto L_0x0469
            boolean r1 = r0.isChecked()
            java.lang.String r0 = "is_private"
            r2.putBoolean(r0, r1)
            r4.setArguments(r2)
            r5.A0F(r4, r6)
        L_0x03cf:
            r0 = -1994735225(0xffffffff891ac187, float:-1.8628072E-33)
            goto L_0x10c8
        L_0x03d4:
            r0 = 10465706(0x9fb1aa, float:1.4665578E-38)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.37D r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x03ec
            r0.A0X()
        L_0x03ec:
            r0 = 1295168549(0x4d32b425, float:1.873844E8)
            goto L_0x0e06
        L_0x03f1:
            r0 = 1530105069(0x5b338ced, float:5.053897E16)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K6P r2 = (X.K6P) r2
            X.0eM r0 = r2.A02
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r12 = X.JTT.A0p(r0)
            r6 = 0
            X.KkI r10 = X.C62656KkI.PRIVACY_SELECTION
            X.KkO r5 = X.C62662KkO.SELECTION
            X.Kk8 r9 = X.C62646Kk8.PRIVATE
            X.Kk7 r8 = X.C62645Kk7.PRIVACY_TOGGLE
            X.Kk2 r4 = X.C62640Kk2.A02
            r7 = r6
            X.LT4.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.Jew r1 = r2.A01
            if (r1 == 0) goto L_0x0465
            r0 = 0
            r1.setChecked(r0)
            X.Jew r1 = r2.A00
            if (r1 == 0) goto L_0x0469
            r0 = 1
            r1.setChecked(r0)
            r0 = 400553496(0x17dff618, float:1.447316E-24)
            goto L_0x10c8
        L_0x042a:
            r0 = 537327881(0x2006f909, float:1.143264E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6P r3 = (X.K6P) r3
            X.0eM r0 = r3.A02
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r12 = X.JTT.A0p(r0)
            r6 = 0
            X.KkI r10 = X.C62656KkI.PRIVACY_SELECTION
            X.KkO r5 = X.C62662KkO.SELECTION
            X.Kk8 r9 = X.C62646Kk8.PUBLIC
            X.Kk7 r8 = X.C62645Kk7.PRIVACY_TOGGLE
            X.Kk2 r4 = X.C62640Kk2.A02
            r7 = r6
            X.LT4.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.Jew r1 = r3.A00
            if (r1 == 0) goto L_0x0469
            r0 = 0
            r1.setChecked(r0)
            X.Jew r1 = r3.A01
            if (r1 == 0) goto L_0x0465
            r0 = 1
            r1.setChecked(r0)
            r0 = 926062506(0x373297aa, float:1.0644939E-5)
        L_0x0461:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0465:
            java.lang.String r9 = "publicRadioButton"
            goto L_0x0e6e
        L_0x0469:
            java.lang.String r9 = "privateRadioButton"
            goto L_0x0e6e
        L_0x046d:
            r0 = 1554260245(0x5ca42115, float:3.69586162E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jew r0 = (X.C60068Jew) r0
            r0.toggle()
            r0 = -1612237730(0xffffffff9fe7345e, float:-9.791894E-20)
            goto L_0x105f
        L_0x0480:
            r0 = 441608781(0x1a526a4d, float:4.351285E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K7K r2 = (X.K7K) r2
            X.0eM r1 = r2.A00
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r11 = X.JTT.A0p(r1)
            r5 = 0
            X.KkI r9 = X.C62656KkI.PROFILE_LOGIN
            X.KkO r4 = X.C62662KkO.EXIT
            X.Kk6 r6 = X.C62644Kk6.NOT_NOW
            X.Kk2 r3 = X.C62640Kk2.A02
            r7 = r5
            r8 = r5
            X.LT4.A01(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.37E r1 = X.AnonymousClass37D.A00
            X.37D r2 = X.DbV.A0g(r2, r1)
            if (r2 == 0) goto L_0x04b0
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A0S(r1)
        L_0x04b0:
            r1 = -1363829488(0xffffffffaeb59d10, float:-8.258827E-11)
            goto L_0x1099
        L_0x04b5:
            r0 = -576508587(0xffffffffdda32d55, float:-1.46976846E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K7K r5 = (X.K7K) r5
            X.0eM r6 = r5.A00
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r3 = X.JTT.A0p(r6)
            r7 = 0
            X.KkI r2 = X.C62656KkI.PROFILE_LOGIN
            X.KkO r1 = X.C62662KkO.A03
            X.LT4.A03(r1, r7, r2, r4, r3)
            X.7Pr r3 = X.DbX.A0f(r6)
            r4 = 1
            r10 = 0
            java.lang.String r9 = ""
            X.7Ps r6 = new X.7Ps
            r8 = r7
            r11 = r10
            r6.<init>(r7, r8, r9, r10, r11)
            r1 = 2131231324(0x7f08025c, float:1.8078726E38)
            r6.A02 = r1
            r2 = 56
            X.LYB r1 = new X.LYB
            r1.<init>((java.lang.Object) r5, (int) r2)
            r6.A05 = r1
            X.7Pt r1 = r6.A00()
            r3.A06(r1)
            r3.A1C = r4
            android.content.Context r1 = r5.requireContext()
            r2 = 2131975340(0x7f135cac, float:1.958777E38)
            android.content.Context r1 = X.02K.A01(r1)
            X.DbZ.A0z(r1, r3, r2)
            X.37D r1 = X.DbX.A0i(r5)
            X.7Pu r2 = X.C48943Emh.A00(r1)
            if (r2 == 0) goto L_0x0518
            X.K6P r1 = new X.K6P
            r1.<init>()
            r2.A0F(r1, r3)
        L_0x0518:
            r1 = -1919495852(0xffffffff8d96d154, float:-9.294858E-31)
            goto L_0x1099
        L_0x051d:
            r0 = 96812664(0x5c53e78, float:1.8548738E-35)
            int r6 = X.AnonymousClass0fD.A05(r0)
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r0)
            X.37D r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0535
            r0.A0X()
        L_0x0535:
            r0 = -2081228221(0xffffffff83f2fa43, float:-1.4280939E-36)
            goto L_0x0e06
        L_0x053a:
            r0 = -1014314936(0xffffffffc38ac848, float:-277.5647)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K7W r2 = (X.K7W) r2
            java.lang.Boolean r1 = r2.A01
            boolean r1 = X.DbX.A1a(r1)
            if (r1 == 0) goto L_0x0557
            X.0eM r1 = r2.A05
            X.C59888JbD.A02(r1)
        L_0x0552:
            r1 = -874595576(0xffffffffcbdebb08, float:-2.9193744E7)
            goto L_0x1099
        L_0x0557:
            boolean r1 = r2.isAdded()
            if (r1 == 0) goto L_0x0552
            X.0hq r1 = r2.getParentFragmentManager()
            boolean r1 = X.AnonymousClass06S.A01(r1)
            if (r1 == 0) goto L_0x0552
            X.JTS.A0z(r2)
            goto L_0x0552
        L_0x056b:
            r0 = -33843140(0xfffffffffdfb983c, float:-4.1803334E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.L10 r0 = (X.L10) r0
            X.KHT r0 = r0.A00
            X.L4K r2 = r0.A09
            X.LpE r0 = r2.A01
            X.MXh r1 = r0.A04
            X.L13 r0 = r2.A00
            r1.E14(r0)
            r0 = -666162098(0xffffffffd84b2c4e, float:-8.9356459E14)
            goto L_0x105f
        L_0x0588:
            r0 = 1250957957(0x4a901a85, float:4721986.5)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.L10 r0 = (X.L10) r0
            r1 = 0
            X.KHT r0 = r0.A00
            r0.A01(r1, r1)
            r0 = 75422228(0x47eda14, float:2.9957693E-36)
            goto L_0x105f
        L_0x059e:
            r0 = 1391190943(0x52ebe39f, float:5.06568081E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jl9 r0 = (X.C60416Jl9) r0
            X.L4K r2 = r0.A01
            X.LpE r0 = r2.A01
            X.MXh r1 = r0.A04
            X.L13 r0 = r2.A00
            r1.E14(r0)
            r0 = 2132257168(0x7f17a990, float:2.0159385E38)
            goto L_0x105f
        L_0x05b9:
            r0 = 1087316068(0x40cf2064, float:6.472704)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K7r r1 = (X.C61441K7r) r1
            com.instagram.common.session.UserSession r0 = r1.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            X.JeH r0 = r1.A01
            r0.getClass()
            java.util.LinkedHashMap r1 = r0.A01
            X.LfC r0 = new X.LfC
            r0.<init>()
            r0.A00 = r1
            r2.A05(r0)
            r0 = 1599370913(0x5f5476a1, float:1.5309601E19)
            goto L_0x105f
        L_0x05e0:
            r0 = 1787162277(0x6a85eea5, float:8.095705E25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K7r r3 = (X.C61441K7r) r3
            com.instagram.common.session.UserSession r0 = r3.A00
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            X.JeH r0 = r3.A01
            r0.getClass()
            java.util.LinkedHashMap r1 = r0.A01
            X.LfC r0 = new X.LfC
            r0.<init>()
            r0.A00 = r1
            r2.A05(r0)
            com.instagram.common.session.UserSession r0 = r3.A00
            X.C59888JbD.A00(r0)
            r0 = -1862103884(0xffffffff91028cb4, float:-1.0298549E-28)
            goto L_0x105f
        L_0x060c:
            java.lang.Object r4 = r1.A01
            X.K7r r4 = (X.C61441K7r) r4
            X.E0T r3 = new X.E0T
            r3.<init>()
            com.instagram.common.session.UserSession r0 = r4.A00
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131952929(0x7f130521, float:1.9542315E38)
            X.DbZ.A0z(r1, r2, r0)
            X.DbY.A13(r4, r3, r2)
            return
        L_0x0629:
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.preview.ThumbnailPreviewFragment r0 = (com.instagram.creation.fragment.preview.ThumbnailPreviewFragment) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.C59888JbD.A00(r0)
            return
        L_0x0633:
            r0 = -294446551(0xffffffffee731a29, float:-1.8809121E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r8 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r8
            X.KO3 r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A02(r8)
            r1.A04()
            X.3Q2 r1 = X.LRK.A00(r8)
            X.1iA r7 = r1.A1G
            X.1iA r5 = X.1iA.A0Q
            r6 = 1
            if (r7 == r5) goto L_0x0672
            X.1iA r1 = X.1iA.A0a
            if (r7 == r1) goto L_0x0672
            X.3Q2 r1 = X.LRK.A00(r8)
            java.util.List r1 = r1.A0L()
            int r4 = r1.size()
        L_0x0660:
            X.0eM r3 = r8.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.JaN r2 = X.JW1.A00(r1)
            X.KNl r1 = r8.A0C
            if (r1 != 0) goto L_0x0674
            java.lang.String r9 = "dependencyProvider"
            goto L_0x0e6e
        L_0x0672:
            r4 = 1
            goto L_0x0660
        L_0x0674:
            X.28D r1 = r1.A0F
            r2.A06(r1, r4, r6)
            if (r7 != r5) goto L_0x0693
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            r3 = 0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)
            X.Kgp r1 = X.C62499Kgp.A04
            X.KPf r4 = new X.KPf
            r4.<init>(r1, r2, r3)
        L_0x068b:
            X.C59888JbD.A01(r5, r4)
            r1 = -1740592721(0xffffffff9840a9af, float:-2.4901087E-24)
            goto L_0x1099
        L_0x0693:
            X.1iA r1 = X.1iA.A0a
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r3)
            if (r7 != r1) goto L_0x06a6
            java.lang.String r3 = "video_edit_button"
            r2 = 0
            X.Kgp r1 = X.C62499Kgp.A04
            X.KPb r4 = new X.KPb
            r4.<init>(r1, r3, r6, r2)
            goto L_0x068b
        L_0x06a6:
            X.KPc r4 = new X.KPc
            r4.<init>()
            goto L_0x068b
        L_0x06ac:
            r0 = -1598967769(0xffffffffa0b1b027, float:-3.0101534E-19)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            android.view.View r0 = r1.mView
            X.0nA.A0N(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = X.LQa.A01(r1)
            r0.clearFocus()
            r0 = -1730231739(0xffffffff98dec245, float:-5.7581817E-24)
            goto L_0x105f
        L_0x06ca:
            r0 = -1849124318(0xffffffff91c89a22, float:-3.1649428E-28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            r0.D4t()
            r0 = 2081474173(0x7c10c67d, float:3.0068663E36)
            goto L_0x105f
        L_0x06dd:
            r0 = -2113844496(0xffffffff82014af0, float:-9.498929E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            r0.D4q()
            r0 = 845693569(0x32684281, float:1.3519299E-8)
            goto L_0x105f
        L_0x06f0:
            r0 = -943647017(0xffffffffc7c116d7, float:-98861.68)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            android.view.View r0 = r1.mView
            X.0nA.A0N(r0)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = X.LQa.A01(r1)
            r0.clearFocus()
            r0 = -1732996557(0xffffffff98b49233, float:-4.6676533E-24)
            goto L_0x105f
        L_0x070e:
            r0 = -384805658(0xffffffffe91054e6, float:-1.090539E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r5 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r5
            androidx.fragment.app.FragmentActivity r4 = r5.requireActivity()
            boolean r1 = r4 instanceof X.C267864cL
            if (r1 == 0) goto L_0x074f
            X.4cL r4 = (X.C267864cL) r4
        L_0x0723:
            X.27r r6 = X.JTT.A0M(r5)
            X.283 r3 = r6.A04
            X.JVj r2 = r3.A0B
            X.JVj r8 = X.C59725JVj.FEED_POST_PUBLISH_SCREEN
            r3.A0B = r8
            X.0eM r1 = r5.A0f
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            java.lang.String r9 = X.AnonymousClass7TF.A0g(r1)
            r10 = 0
            X.8xY r7 = X.C371088xY.FEED_POST_PUBLISH_SCREEN
            r13 = 0
            r11 = r10
            r12 = r10
            r6.A1D(r7, r8, r9, r10, r11, r12, r13)
            if (r4 == 0) goto L_0x0748
            r1 = 1
            r4.EJy(r1)
        L_0x0748:
            r3.A0B = r2
            r1 = 117016811(0x6f988eb, float:9.386457E-35)
            goto L_0x1099
        L_0x074f:
            r4 = 0
            goto L_0x0723
        L_0x0751:
            r0 = 1536688045(0x5b97ffad, float:8.556768E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            X.3Q2 r2 = X.LRK.A00(r1)
            boolean r2 = r2.A5T
            if (r2 == 0) goto L_0x077e
            X.0eM r2 = r1.A0f
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r2)
            X.3Q2 r2 = X.LRK.A00(r1)
            java.lang.String r4 = X.C2373637i.A01(r2)
            java.lang.String r3 = X.AnonymousClass6SR.A02()
            X.0qQ.A07(r3)
            java.lang.String r2 = "feed_composer"
            X.C64189LSw.A05(r5, r2, r4, r3)
        L_0x077e:
            X.0eM r4 = r1.A0f
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r8 = X.AnonymousClass6SR.A02()
            X.3Q2 r2 = X.LRK.A00(r1)
            java.lang.String r9 = X.C2373637i.A01(r2)
            X.818 r6 = X.AnonymousClass818.IG_FEED_COMPOSER
            X.3Q2 r2 = X.LRK.A00(r1)
            boolean r11 = r2.A5T
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.JZZ r5 = X.JZZ.FEED
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.C64007LIn.A00(r5, r6, r7, r8, r9, r10, r11)
            X.3Q2 r2 = X.LRK.A01(r1)
            r10 = 0
            if (r2 == 0) goto L_0x07cd
            X.JxB r2 = r2.A0v
            if (r2 == 0) goto L_0x07cd
            X.27r r2 = X.JTT.A0M(r1)
            X.283 r2 = r2.A04
            X.28D r2 = r2.A09
            X.0qQ.A07(r2)
            X.JVg r6 = X.C63094KrN.A00(r2)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.LPH r5 = new X.LPH
            r5.<init>(r6, r1, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r5.A05(r2)
        L_0x07cd:
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.1Av r5 = X.1Au.A00(r2)
            X.3Q2 r2 = X.LRK.A01(r1)
            if (r2 == 0) goto L_0x08ac
            X.JxB r2 = r2.A0v
        L_0x07dd:
            r8 = 1
            boolean r2 = X.AnonymousClass7TF.A1V(r2)
            r5.A1J(r2)
            X.3Q2 r2 = X.LRK.A00(r1)
            X.Juw r2 = r2.A1B
            if (r2 == 0) goto L_0x0811
            X.KNl r2 = r1.A0C
            if (r2 == 0) goto L_0x09b9
            X.JbO r7 = r2.A0J
            X.0wc r5 = r7.A04
            java.lang.String r2 = "ig_ads_conversion_funnel"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r2)
            X.KkS r2 = X.C62666KkS.BIO_IG_POST
            X.DbS.A1F(r2, r6)
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r5 = r2.A06
            java.lang.String r2 = "seller_igid"
            r6.AAJ(r2, r5)
            java.lang.String r2 = "seller_click_create_post"
            X.DbS.A1I(r6, r2)
            r6.Cgf()
        L_0x0811:
            X.3Q2 r2 = X.LRK.A00(r1)
            java.lang.String r5 = r2.A3G
            if (r5 == 0) goto L_0x0845
            java.lang.String r2 = "book_appointment"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0845
            X.KNl r2 = r1.A0C
            if (r2 == 0) goto L_0x09b9
            X.JbO r7 = r2.A0J
            X.0wc r5 = r7.A04
            java.lang.String r2 = "ig_ads_conversion_funnel"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r5, r2)
            X.KkS r2 = X.C62666KkS.SHARE_ACTION_BUTTON_MENU
            X.DbS.A1F(r2, r6)
            com.instagram.common.session.UserSession r2 = r7.A05
            java.lang.String r5 = r2.A06
            java.lang.String r2 = "seller_igid"
            r6.AAJ(r2, r5)
            java.lang.String r2 = "prof_click_create_post_with_cta"
            X.DbS.A1I(r6, r2)
            r6.Cgf()
        L_0x0845:
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r2 = r1.A02
            java.lang.String r9 = "brandedContentDisclosureController"
            if (r2 == 0) goto L_0x0e6e
            X.3Q2 r5 = X.LRK.A00(r1)
            com.instagram.api.schemas.BrandedContentProjectMetadata r6 = r5.A0t
            boolean r2 = r2.A00
            if (r2 != 0) goto L_0x08af
            boolean r2 = r5.A5i
            if (r2 == 0) goto L_0x08af
            boolean r2 = r5.CJe()
            if (r2 != 0) goto L_0x08af
            if (r6 == 0) goto L_0x086f
            com.instagram.api.schemas.BrandedContentProjectAction r5 = r6.A01
            com.instagram.api.schemas.BrandedContentProjectAction r2 = com.instagram.api.schemas.BrandedContentProjectAction.ADD_MEDIA_TO_PROJECT
            if (r5 != r2) goto L_0x086f
            java.lang.String r2 = r6.A07
            int r2 = r2.length()
            if (r2 != 0) goto L_0x08af
        L_0x086f:
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r5 = r1.A02
            if (r5 == 0) goto L_0x0e6e
            android.content.Context r3 = r1.requireContext()
            r2 = 54
            X.LV3 r4 = X.LV3.A00(r1, r2)
            X.8ab r3 = X.DbS.A0Y(r3)
            r1 = 2131973604(0x7f1355e4, float:1.9584249E38)
            r3.A09(r1)
            r1 = 2131973605(0x7f1355e5, float:1.958425E38)
            r3.A08(r1)
            r2 = 2131952278(0x7f130296, float:1.9540994E38)
            r1 = 19
            X.LV3 r1 = X.LV3.A00(r5, r1)
            r3.A0J(r1, r2)
            r3.A0D(r10)
            r1 = 2131974987(0x7f135b4b, float:1.9587054E38)
            r3.A0G(r4, r1)
            X.DbT.A1V(r3)
            r5.A00 = r8
            r1 = 2095352862(0x7ce48c1e, float:9.493485E36)
            goto L_0x1099
        L_0x08ac:
            r2 = r10
            goto L_0x07dd
        L_0x08af:
            android.view.View r2 = r1.mView
            if (r2 == 0) goto L_0x093f
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            boolean r2 = X.AnonymousClass430.A00(r2)
            if (r2 == 0) goto L_0x093f
            X.847 r7 = r1.A03
            if (r7 != 0) goto L_0x08c5
            java.lang.String r9 = "brandedContentTaggingUpsellController"
            goto L_0x0e6e
        L_0x08c5:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r5 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A06(r1)
            X.3Q2 r2 = X.LRK.A00(r1)
            java.util.List r2 = r2.A4C
            if (r2 != 0) goto L_0x08d9
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
        L_0x08d9:
            java.util.List r2 = r7.A01(r6, r5, r2)
            r1.A0P = r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x093f
            X.3Q2 r2 = X.LRK.A00(r1)
            boolean r2 = r2.A5i
            if (r2 != 0) goto L_0x093f
            X.6SR r2 = X.AnonymousClass6SR.A01()
            java.util.List r5 = r1.A0P
            java.util.List r2 = r2.A0Y
            r2.clear()
            r2.addAll(r5)
            X.847 r2 = r1.A03
            java.lang.String r8 = "brandedContentTaggingUpsellController"
            if (r2 == 0) goto L_0x09bb
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r4)
            java.lang.String r6 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A06(r1)
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            X.82q r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A00(r1)
            java.util.ArrayList r2 = X.LTZ.A04(r5, r2, r3)
            com.instagram.user.model.User r3 = X.AnonymousClass847.A00(r7, r6, r2)
            X.847 r5 = r1.A03
            if (r5 == 0) goto L_0x09bb
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r4)
            android.content.Context r6 = r1.requireContext()
            r2 = 30
            X.LV0 r7 = X.LV0.A00(r3, r1, r2)
            r2 = 56
            X.LV3 r8 = X.LV3.A00(r1, r2)
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            java.util.List r12 = r1.A0P
            java.lang.String r11 = "feed"
            r5.A03(r6, r7, r8, r9, r10, r11, r12)
            r1 = 1093202378(0x4128f1ca, float:10.559031)
            goto L_0x1099
        L_0x093f:
            androidx.fragment.app.FragmentActivity r6 = r1.getActivity()
            if (r6 == 0) goto L_0x099b
            r2 = 3
            X.LxI r9 = new X.LxI
            r9.<init>(r1, r2)
            X.KNl r2 = r1.A0C
            if (r2 == 0) goto L_0x09b9
            X.8qK r7 = r2.A0L
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r4)
            X.818 r2 = X.AnonymousClass818.IG_FEED_COMPOSER_SHARE_BUTTON
            X.LEO r6 = X.C63435Kwv.A00(r6, r2, r5)
            r6.A05 = r9
            java.lang.String r2 = X.AnonymousClass6SR.A02()
            r6.A0A = r2
            r6.A01 = r1
            X.Lxe r5 = new X.Lxe
            r5.<init>(r1, r8)
            boolean r2 = X.LTP.A0A(r1)
            if (r2 != 0) goto L_0x09a0
            X.LFW r4 = r1.shareToBarcelonaViewBinder
            if (r4 == 0) goto L_0x09b7
            X.LE1 r1 = r4.A05
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x09b7
            X.7xL r1 = r4.A09
        L_0x097e:
            X.0xa r2 = r1.A00
            java.lang.String r1 = "PREFERENCE_SHARE_TO_BARCELONA_AUTO_POSTING"
            boolean r1 = r2.getBoolean(r1, r3)
            if (r1 != 0) goto L_0x09b7
        L_0x0988:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r8)
            r17 = 191(0xbf, float:2.68E-43)
            X.9Im r9 = new X.9Im
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r9.<init>((java.lang.Boolean) r10, (java.lang.Boolean) r11, (java.lang.Boolean) r12, (java.lang.Boolean) r13, (java.lang.Boolean) r14, (java.lang.Boolean) r15, (java.lang.Boolean) r16, (int) r17)
            r7.A01(r9, r6, r5)
        L_0x099b:
            r1 = -1903685253(0xffffffff8e88117b, float:-3.354342E-30)
            goto L_0x1099
        L_0x09a0:
            X.JU0 r1 = X.LSR.A03(r1)
            java.lang.Object r1 = r1.A03
            X.LE1 r1 = (X.LE1) r1
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x09b7
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.7xL r1 = X.C347757xK.A00(r1)
            goto L_0x097e
        L_0x09b7:
            r8 = 0
            goto L_0x0988
        L_0x09b9:
            java.lang.String r8 = "dependencyProvider"
        L_0x09bb:
            X.0qQ.A0F(r8)
            goto L_0x0e71
        L_0x09c0:
            r0 = -587796928(0xffffffffdcf6ee40, float:-5.56038423E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5Y r0 = (X.K5Y) r0
            android.content.Context r3 = r0.requireContext()
            X.0eM r0 = r0.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.2EG r1 = X.2EG.A46
            r0 = 158(0x9e, float:2.21E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.SUL r1 = X.Dba.A0J(r3, r2, r1, r0)
            java.lang.String r0 = "advanced_post_settings"
            r1.A0S = r0
            r1.A0A()
            r0 = 1803282772(0x6b7be954, float:3.0454224E26)
            goto L_0x105f
        L_0x09ed:
            r0 = 867035797(0x33adea95, float:8.0986105E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r11 = r1.A01
            com.instagram.creation.fragment.ShareLaterFragment r11 = (com.instagram.creation.fragment.ShareLaterFragment) r11
            X.2dY r1 = X.2dZ.A0t
            androidx.fragment.app.FragmentActivity r0 = r11.requireActivity()
            X.Dba.A0n(r0, r1)
            com.instagram.model.sharelater.ShareLaterMedia r1 = r11.A04
            X.0qQ.A0A(r1)
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r11.A05
            java.lang.String r7 = "Required value was null."
            if (r0 == 0) goto L_0x0ae5
            java.lang.String r0 = X.AnonymousClass7TF.A0f(r0)
            r1.A04 = r0
            java.lang.String r0 = r11.A07
            if (r0 != 0) goto L_0x0a1c
            java.lang.String r0 = X.AnonymousClass7TF.A0b()
            r11.A07 = r0
        L_0x0a1c:
            com.instagram.common.session.UserSession r2 = r11.A00
            java.lang.String r9 = "userSession"
            r5 = 0
            if (r2 == 0) goto L_0x0e6e
            com.instagram.model.sharelater.ShareLaterMedia r1 = r11.A04
            X.0qQ.A0A(r1)
            java.lang.String r0 = r11.A07
            X.0qQ.A0A(r0)
            java.lang.String r6 = "feed_share_later"
            X.1OC r1 = X.C63413KwZ.A00(r2, r1, r0, r6)
            X.KAf r0 = r11.A0G
            r1.A00 = r0
            r11.schedule(r1)
            java.lang.String r12 = r11.A07
            com.instagram.common.session.UserSession r10 = r11.A00
            if (r10 == 0) goto L_0x0e6e
            com.instagram.model.sharelater.ShareLaterMedia r0 = r11.A04
            X.0qQ.A0A(r0)
            java.lang.String r13 = r0.A05
            r0 = 95
            int r1 = r13.indexOf(r0)
            r0 = -1
            if (r1 == r0) goto L_0x0a55
            r0 = 0
            java.lang.String r13 = r13.substring(r0, r1)
        L_0x0a55:
            X.0qQ.A07(r13)
            com.instagram.model.sharelater.ShareLaterMedia r0 = r11.A04
            X.0qQ.A0A(r0)
            X.1iA r0 = r0.A02
            int r15 = r0.A00
            java.lang.String r14 = "share_later"
            X.LT0.A02(r10, r11, r12, r13, r14, r15)
            java.lang.String r0 = "share_later_fragment_share_tapped"
            X.0xI r1 = X.JTU.A0F(r11, r0)
            com.instagram.common.session.UserSession r0 = r11.A00
            if (r0 == 0) goto L_0x0e6e
            X.DbU.A1R(r1, r0)
            com.instagram.common.session.UserSession r1 = r11.A00
            if (r1 == 0) goto L_0x0e6e
            com.instagram.model.sharelater.ShareLaterMedia r0 = r11.A04
            X.0qQ.A0A(r0)
            java.lang.String r3 = r0.A05
            X.0qQ.A07(r3)
            java.lang.String r2 = "share_later_view"
            X.DbY.A1S(r1, r3)
            X.0wc r1 = X.AnonymousClass0kN.A01(r11, r1)
            java.lang.String r0 = "external_share_clicked"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x0aa6
            X.DbW.A15(r1, r11)
            java.lang.String r0 = "share_location"
            r1.AAJ(r0, r2)
            java.lang.String r0 = "media_id"
            r1.AAJ(r0, r3)
            r1.Cgf()
        L_0x0aa6:
            com.instagram.model.sharelater.ShareLaterMedia r0 = r11.A04
            X.0qQ.A0A(r0)
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0adb
            com.instagram.common.session.UserSession r1 = r11.A00
            if (r1 == 0) goto L_0x0e6e
            java.lang.String r0 = r11.A07
            if (r0 == 0) goto L_0x0ae0
            X.C64189LSw.A05(r1, r6, r5, r0)
            com.instagram.common.session.UserSession r7 = r11.A00
            if (r7 == 0) goto L_0x0e6e
            com.instagram.pendingmedia.model.constants.ShareType r1 = com.instagram.pendingmedia.model.constants.ShareType.FOLLOWERS_SHARE
            java.lang.String r3 = r11.A07
            r0 = 1
            X.0qQ.A0B(r1, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r7)
            X.16V r2 = r0.A0J()
            X.0Aj r1 = X.C64189LSw.A00(r7)
            java.lang.String r0 = "request"
            java.lang.String r0 = X.C64189LSw.A01(r1, r2, r0, r6)
            X.C64189LSw.A02(r1, r0, r5, r3)
        L_0x0adb:
            r0 = -1148057444(0xffffffffbb92089c, float:-0.0044565927)
            goto L_0x105f
        L_0x0ae0:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r7)
            throw r1
        L_0x0ae5:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r7)
            throw r1
        L_0x0aea:
            r0 = 329005520(0x139c39d0, float:3.9436944E-27)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.fragment.ManageDraftsFragment r4 = (com.instagram.creation.fragment.ManageDraftsFragment) r4
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0b42
            X.K9A r0 = r4.A00
            if (r0 == 0) goto L_0x0b55
            java.util.ArrayList r0 = r0.A02
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0b42
            X.K9A r0 = r4.A00
            if (r0 == 0) goto L_0x0b55
            java.util.ArrayList r0 = r0.A02
            java.util.List r3 = X.C51966G9m.A1J(r0)
            int r2 = r3.size()
            android.content.res.Resources r1 = X.DbV.A05(r4)
            r0 = 2131820683(0x7f11008b, float:1.9274088E38)
            java.lang.String r0 = X.DbY.A0d(r1, r2, r0)
            X.0qQ.A07(r0)
            X.8ab r2 = X.DbW.A0U(r4)
            r2.A05 = r0
            r1 = 2131958477(0x7f131acd, float:1.9553567E38)
            r0 = 29
            X.LV0 r0 = X.LV0.A00(r3, r4, r0)
            r2.A0I(r0, r1)
            r2.A05()
            X.DbT.A1V(r2)
        L_0x0b3d:
            r0 = 1902792651(0x716a4fcb, float:1.1602553E30)
            goto L_0x0e06
        L_0x0b42:
            boolean r0 = r4.A02
            r1 = r0 ^ 1
            r4.A02 = r1
            X.K9A r0 = r4.A00
            if (r0 == 0) goto L_0x0b55
            r0.A00 = r1
            X.K9A.A00(r0)
            com.instagram.creation.fragment.ManageDraftsFragment.A00(r4)
            goto L_0x0b3d
        L_0x0b55:
            X.DbS.A13()
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0b5d:
            r0 = 32794101(0x1f465f5, float:8.9777745E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.ManageDraftsFragment r1 = (com.instagram.creation.fragment.ManageDraftsFragment) r1
            X.82p r0 = r1.A01
            if (r0 == 0) goto L_0x0b7c
            com.instagram.creation.base.CreationSession r0 = X.JWE.A01(r0)
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0b7c
            X.DbT.A1J(r1)
        L_0x0b77:
            r0 = -1090301782(0xffffffffbf0350aa, float:-0.5129496)
            goto L_0x105f
        L_0x0b7c:
            com.instagram.common.session.UserSession r0 = r1.getSession()
            X.C59888JbD.A00(r0)
            goto L_0x0b77
        L_0x0b84:
            r0 = -1957794601(0xffffffff8b4e6cd7, float:-3.975604E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = (com.instagram.creation.fragment.EditMediaInfoFragment) r0
            com.instagram.creation.fragment.EditMediaInfoFragment.A0D(r0)
            X.WGU r2 = r0.A07
            X.UzE r1 = X.C16678UzE.EDIT_CAPTION
            java.lang.String r0 = "caption_tips"
            r2.A0F(r1, r0)
            r0 = 2066190898(0x7b279232, float:8.700788E35)
            goto L_0x105f
        L_0x0ba0:
            java.lang.Object r4 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r4 = (com.instagram.creation.fragment.EditMediaInfoFragment) r4
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.util.LinkedHashMap r5 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            X.1Xj r0 = r4.A0I
            if (r0 == 0) goto L_0x0c1b
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0P(r4)
            if (r0 == 0) goto L_0x0bf9
            java.util.List r0 = r4.A1B
            java.util.Iterator r8 = r0.iterator()
        L_0x0bc0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0c1b
            X.1Xj r7 = X.C51966G9m.A0t(r8)
            java.util.LinkedHashMap r1 = r4.A0f
            java.lang.String r0 = r7.getId()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0be7
            java.lang.String r6 = r7.getId()
            java.util.LinkedHashMap r1 = r4.A0f
            java.lang.String r0 = r7.getId()
            java.lang.Object r0 = r1.get(r0)
            r5.put(r6, r0)
        L_0x0be7:
            boolean r0 = r7.CeS()
            if (r0 != 0) goto L_0x0bc0
            java.lang.String r1 = r7.getId()
            com.instagram.common.typedurl.ImageUrl r0 = r7.A1Q()
            r3.put(r1, r0)
            goto L_0x0bc0
        L_0x0bf9:
            X.1Xj r0 = r4.A0I
            boolean r0 = r0.CeS()
            if (r0 != 0) goto L_0x0c1b
            X.1Xj r0 = r4.A0I
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r4.A0U
            r5.put(r1, r0)
            X.1Xj r0 = r4.A0I
            java.lang.String r1 = r0.getId()
            X.1Xj r0 = r4.A0I
            com.instagram.common.typedurl.ImageUrl r0 = r0.A1Q()
            r3.put(r1, r0)
        L_0x0c1b:
            r1 = 1
            java.lang.String r0 = "is_edit_flow"
            r2.putBoolean(r0, r1)
            java.lang.String r0 = "media_key_to_alt"
            r2.putSerializable(r0, r5)
            java.lang.String r0 = "media_key_to_path"
            r2.putSerializable(r0, r3)
            X.6Yo r1 = X.Dbb.A0G(r4)
            X.AnonymousClass36R.A01()
            X.K7r r0 = new X.K7r
            r0.<init>()
            r0.setArguments(r2)
            r1.A0E(r0)
            r1.A04()
            return
        L_0x0c41:
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = (com.instagram.creation.fragment.EditMediaInfoFragment) r1
            r0 = 0
            com.instagram.creation.fragment.EditMediaInfoFragment.A0J(r1, r0)
            return
        L_0x0c4a:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            X.8Wq r0 = r2.A0Q
            if (r0 == 0) goto L_0x0c5b
            com.instagram.creation.fragment.EditMediaInfoFragment.A06(r2)
            X.8Wq r0 = r2.A0Q
            r0.A04()
            return
        L_0x0c5b:
            boolean r0 = r2.A0n
            if (r0 == 0) goto L_0x0c73
            X.1Av r0 = r2.A0N
            X.0xa r1 = r0.A01
            java.lang.String r0 = "has_seen_boost_edit_caption_confirmation_dialog"
            boolean r0 = X.DbT.A1a(r1, r0)
            if (r0 != 0) goto L_0x0c73
            androidx.fragment.app.FragmentActivity r0 = r2.requireActivity()
            com.instagram.creation.fragment.EditMediaInfoFragment.A01(r0, r2)
            return
        L_0x0c73:
            com.instagram.creation.fragment.EditMediaInfoFragment.A08(r2)
            return
        L_0x0c77:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            java.lang.String r0 = r2.A0R
            r0.getClass()
            java.lang.String r1 = r2.A0R
            com.instagram.common.session.UserSession r0 = r2.getSession()
            X.1OC r1 = X.C3724090s.A04(r0, r1)
            X.KAX r0 = new X.KAX
            r0.<init>(r2)
            r1.A00 = r0
            r2.schedule(r1)
            return
        L_0x0c95:
            java.lang.Object r5 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r5 = (com.instagram.creation.fragment.EditMediaInfoFragment) r5
            android.content.Context r4 = r5.requireContext()
            com.instagram.common.session.UserSession r3 = r5.getSession()
            X.1Xj r2 = r5.A0I
            r1 = 2
            X.LcN r0 = new X.LcN
            r0.<init>(r5, r1)
            X.8ab r0 = X.AnonymousClass4LK.A01(r4, r0, r3, r2)
            X.DbT.A1V(r0)
            return
        L_0x0cb1:
            java.lang.Object r2 = r1.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            X.1Xj r0 = r2.A0I
            r0.getClass()
            X.1Xj r1 = r2.A0I
            com.instagram.common.session.UserSession r0 = r2.getSession()
            com.instagram.user.model.UpcomingEvent r7 = r1.A27(r0)
            r0 = 0
            X.M02 r6 = new X.M02
            r6.<init>(r2, r0)
            com.instagram.common.session.UserSession r5 = r2.getSession()
            androidx.fragment.app.FragmentActivity r4 = r2.requireActivity()
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.K6D r3 = new X.K6D
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.Khz r1 = X.C62569Khz.EDIT_MEDIA
            java.lang.String r0 = "prior_surface"
            r2.putSerializable(r0, r1)
            java.lang.String r0 = "initial_upcoming_event"
            r2.putParcelable(r0, r7)
            r3.A06 = r6
            r3.setArguments(r2)
            X.DbY.A14(r3, r4, r5)
            return
        L_0x0cf4:
            r0 = -1739421677(0xffffffff98528813, float:-2.7210564E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            X.JVf r1 = X.C60323JjS.A00(r5)
            java.lang.Object r2 = r1.A00
            X.MVo r2 = (X.C66534MVo) r2
            boolean r1 = r2 instanceof X.C65499LuN
            r4 = 0
            if (r1 == 0) goto L_0x0d10
            X.LuN r2 = (X.C65499LuN) r2
            X.Kk4 r4 = r2.A00
        L_0x0d10:
            X.0eM r1 = r5.A0f
            java.lang.Object r3 = r1.getValue()
            X.JjS r3 = (X.C60323JjS) r3
            r1 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            r3.A07(r2, r1)
            X.LG9 r1 = r5.A0K
            if (r1 == 0) goto L_0x0d25
            r1.A02(r4, r2)
        L_0x0d25:
            r1 = 1742704297(0x67df8ea9, float:2.1114387E24)
            goto L_0x1099
        L_0x0d2a:
            r0 = -109571850(0xfffffffff97810f6, float:-8.05021E34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r1 = r0.getValue()
            X.JjS r1 = (X.C60323JjS) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A06(r0)
            r0 = -419237271(0xffffffffe702f269, float:-6.183793E23)
            goto L_0x105f
        L_0x0d47:
            r0 = -999838962(0xffffffffc467ab0e, float:-926.6727)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r1 = (com.instagram.creation.fragment.AlbumEditFragment) r1
            X.Kgp r0 = X.C62499Kgp.ADD_GALLERY_STICKER
            com.instagram.creation.fragment.AlbumEditFragment.A0C(r1, r0)
            r0 = 1595342193(0x5f16fd71, float:1.0879977E19)
            goto L_0x105f
        L_0x0d5c:
            r0 = 1376851126(0x521114b6, float:1.55779432E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r1 = (com.instagram.creation.fragment.AlbumEditFragment) r1
            X.Kgp r0 = X.C62499Kgp.ADD_STATIC_STICKER
            com.instagram.creation.fragment.AlbumEditFragment.A0C(r1, r0)
            r0 = 288108636(0x112c305c, float:1.358331E-28)
            goto L_0x105f
        L_0x0d71:
            r0 = -1015084456(0xffffffffc37f0a58, float:-255.0404)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r4 = (com.instagram.creation.fragment.AlbumEditFragment) r4
            X.0eM r7 = r4.A0d
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r7)
            r3 = 0
            X.0Tu r2 = X.DbS.A0J(r5, r3)
            r0 = 36323113948359530(0x810bae00072b6a, double:3.0342217501581213E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x0dbc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.0xa r0 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r1 = "dismissed_feed_text_tool_badge"
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 != 0) goto L_0x0dbc
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.0xY r0 = X.AnonymousClass7TF.A0N(r0)
            X.DbW.A1L(r0, r1)
            android.view.View r1 = r4.A02
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r0 == 0) goto L_0x0dbc
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            if (r1 == 0) goto L_0x0dbc
            r1.A05 = r3
            r1.invalidate()
        L_0x0dbc:
            X.Kgp r0 = X.C62499Kgp.ADD_TEXT
            com.instagram.creation.fragment.AlbumEditFragment.A0C(r4, r0)
            r0 = 920650354(0x36e00272, float:6.676005E-6)
            goto L_0x0e06
        L_0x0dc5:
            r0 = 1785502467(0x6a6c9b03, float:7.150963E25)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            android.content.Context r4 = r5.requireContext()
            X.4mi r0 = r5.A0N
            r3 = 0
            if (r0 != 0) goto L_0x0de3
            java.lang.String r0 = "provider"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0de3:
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r2 = r0.A07
            if (r2 == 0) goto L_0x0e0a
            java.lang.Integer r0 = X.AnonymousClass05K.A0E
            r2.A0A(r3, r0)
            X.0eM r0 = r5.A0f
            java.lang.Object r0 = r0.getValue()
            X.JjS r0 = (X.C60323JjS) r0
            X.6oS r1 = X.C318116oQ.A00(r0)
            r0 = 37
            X.MHJ r0 = X.MHJ.A02(r2, r4, r5, r3, r0)
            X.AnonymousClass7TE.A1Z(r0, r1)
            r0 = 416035745(0x18cc33a1, float:5.2784896E-24)
        L_0x0e06:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x0e0a:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0e0f:
            r0 = -2135032529(0xffffffff80bdfd2f, float:-1.7447734E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            com.instagram.creation.fragment.AlbumEditFragment.A0B(r0)
            r0 = -258722583(0xfffffffff09434e9, float:-3.6694197E29)
            goto L_0x105f
        L_0x0e22:
            r0 = -433310309(0xffffffffe62c359b, float:-2.0330897E23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            com.instagram.creation.fragment.AlbumEditFragment.A0B(r0)
            r0 = -1996733027(0xffffffff88fc459d, float:-1.5183064E-33)
            goto L_0x105f
        L_0x0e35:
            r0 = 438277154(0x1a1f9422, float:3.300009E-23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r3 = (com.instagram.creation.fragment.AlbumEditFragment) r3
            X.KB5 r2 = r3.A0D
            if (r2 == 0) goto L_0x0e4a
            int r1 = r2.A01
            r0 = 0
            r2.A0N(r0, r1)
        L_0x0e4a:
            X.0eM r0 = r3.A0d
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.27r r1 = X.27p.A01(r0)
            r0 = 0
            r1.A24(r0)
            r0 = -1002765599(0xffffffffc43b02e1, float:-748.045)
            goto L_0x105f
        L_0x0e5d:
            r0 = 1426733144(0x550a3858, float:9.4984124E12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r5 = (com.instagram.creation.fragment.AlbumEditFragment) r5
            X.4cI r1 = r5.A0Q
            if (r1 != 0) goto L_0x0e76
            java.lang.String r9 = "pendingMediaProvider"
        L_0x0e6e:
            X.0qQ.A0F(r9)
        L_0x0e71:
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0e76:
            X.82q r0 = r5.A0H
            java.lang.String r9 = "creationCameraSession"
            if (r0 == 0) goto L_0x0e6e
            X.3Q2 r0 = X.JWE.A05(r1, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0eb8
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r0.A1J
            if (r0 == 0) goto L_0x0eb8
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r5.A0B
            if (r0 == 0) goto L_0x0eb8
            boolean r0 = r0.isSelected()
            if (r0 != r3) goto L_0x0eb8
            boolean r2 = com.instagram.creation.fragment.AlbumEditFragment.A0H(r5)
            X.0eM r0 = r5.A0d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.82q r0 = r5.A0H
            if (r0 == 0) goto L_0x0e6e
            boolean r0 = r0.CL3()
            boolean r0 = X.AnonymousClass30D.A0K(r1, r2, r0)
            if (r0 == 0) goto L_0x0eb8
            android.content.Context r1 = r5.getContext()
            r0 = 2131976465(0x7f136111, float:1.9590051E38)
            X.DbZ.A0w(r1, r5, r0)
            r0 = -1175829390(0xffffffffb9ea4472, float:-4.4682954E-4)
            goto L_0x105f
        L_0x0eb8:
            boolean r0 = r6.isSelected()
            r0 = r0 ^ 1
            com.instagram.creation.fragment.AlbumEditFragment.A0E(r5, r0, r3)
            r0 = -1527824685(0xffffffffa4ef3ed3, float:-1.03756156E-16)
            goto L_0x105f
        L_0x0ec6:
            r0 = -1679497370(0xffffffff9be4e766, float:-3.7868974E-22)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            com.instagram.creation.fragment.AlbumEditFragment.A09(r0)
            r0 = -776200360(0xffffffffd1bc1f58, float:-1.00997464E11)
            goto L_0x105f
        L_0x0ed9:
            r0 = -1025978776(0xffffffffc2d8ce68, float:-108.40314)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            com.instagram.creation.fragment.AlbumEditFragment.A0A(r0)
            r0 = -1430243560(0xffffffffaac03718, float:-3.414428E-13)
            goto L_0x105f
        L_0x0eec:
            r0 = -670848813(0xffffffffd803a8d3, float:-5.7904447E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 1320243403(0x4eb150cb, float:1.48743104E9)
            goto L_0x105f
        L_0x0efd:
            r0 = 640810566(0x2631fe46, float:6.1753816E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 943876633(0x38426a19, float:4.6352015E-5)
            goto L_0x105f
        L_0x0f0e:
            r0 = -1911536750(0xffffffff8e104392, float:-1.7781904E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Jex r0 = (X.C60069Jex) r0
            r0.toggle()
            r0 = 838102728(0x31f46ec8, float:7.113929E-9)
            goto L_0x105f
        L_0x0f21:
            r0 = 125071185(0x7746f51, float:1.8389233E-34)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KHP r1 = (X.KHP) r1
            X.KHP.A01(r1)
            X.4DH r0 = r1.A01
            androidx.fragment.app.FragmentActivity r4 = r0.getActivity()
            if (r4 == 0) goto L_0x0f59
            X.Kfp r0 = r1.A09
            com.instagram.common.session.UserSession r2 = r1.A02
            boolean r1 = r0 instanceof X.KN8
            r0 = 1
            if (r1 == 0) goto L_0x0f5e
            X.0qQ.A0B(r2, r0)
            X.AnonymousClass36R.A01()
            X.K7s r1 = new X.K7s
            r1.<init>()
            android.os.Bundle r0 = X.DbY.A09(r2)
            r1.setArguments(r0)
            X.6Yo r0 = X.DbS.A0M(r4, r2)
            X.Dba.A12(r1, r0)
        L_0x0f59:
            r0 = -1678031623(0xffffffff9bfb44f9, float:-4.156904E-22)
            goto L_0x10c8
        L_0x0f5e:
            X.0qQ.A0B(r2, r0)
            X.KPG r0 = new X.KPG
            r0.<init>()
            X.C59888JbD.A01(r2, r0)
            goto L_0x0f59
        L_0x0f6a:
            r0 = 264105911(0xfbdefb7, float:1.8729174E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KHP r0 = (X.KHP) r0
            X.Jie r2 = r0.getViewModel()
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 14
            X.C51971G9r.A1Q(r2, r1, r0)
            r0 = -1990413770(0xffffffff895cb236, float:-2.6565331E-33)
            goto L_0x105f
        L_0x0f87:
            r0 = 367051337(0x15e0c249, float:9.077941E-26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KHP r0 = (X.KHP) r0
            X.KHP.A01(r0)
            r0 = -1881903424(0xffffffff8fd46ec0, float:-2.0947473E-29)
            goto L_0x105f
        L_0x0f9a:
            r0 = -1549908613(0xffffffffa39e457b, float:-1.715982E-17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -1426752563(0xffffffffaaf57bcd, float:-4.3606647E-13)
            goto L_0x105f
        L_0x0fab:
            r0 = -1511718785(0xffffffffa5e5007f, float:-3.9725504E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KFW r0 = (X.KFW) r0
            X.L1f r0 = r0.A01
            X.K8A r3 = r0.A00
            boolean r0 = r3 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x0fd1
            X.KSr r3 = (X.C61942KSr) r3
            boolean r2 = X.JTT.A1a(r3)
            X.0eM r0 = r3.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            if (r2 == 0) goto L_0x0fd6
            X.KTC r0 = X.KTC.A00
        L_0x0fce:
            r1.A04(r3, r0)
        L_0x0fd1:
            r0 = 335080729(0x13f8ed19, float:6.2837798E-27)
            goto L_0x105f
        L_0x0fd6:
            X.KT9 r0 = X.KT9.A00
            goto L_0x0fce
        L_0x0fd9:
            r0 = 954463171(0x38e3f3c3, float:1.0869608E-4)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            r0 = -1051698358(0xffffffffc1505b4a, float:-13.022287)
            goto L_0x105f
        L_0x0feb:
            r0 = 1441227451(0x55e762bb, float:3.18014038E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.KIL r1 = (X.KIL) r1
            X.K7x r5 = r1.A00
            X.3Q2 r4 = X.C61445K7x.A01(r5)
            if (r4 == 0) goto L_0x103c
            com.instagram.pendingmedia.model.ClipInfo r1 = r4.A1N
            if (r1 == 0) goto L_0x1032
            java.lang.String r1 = r1.A0F
            r1.getClass()
            boolean r1 = X.JTQ.A1Z(r1)
            if (r1 == 0) goto L_0x1032
            X.6SR r3 = X.AnonymousClass6SR.A01()
            com.instagram.common.session.UserSession r2 = r5.getSession()
            java.lang.String r1 = "edit_video"
            r3.A04(r2, r1)
            X.82q r1 = X.C61445K7x.A00(r5)
            com.instagram.creation.base.VideoSession r1 = X.JWE.A03(r1)
            float r1 = r1.A00
            r4.A02 = r1
            X.4mm r1 = r5.A02
            r1.getClass()
            r1.Cqm(r4)
        L_0x102e:
            r1 = 726142467(0x2b480e03, float:7.107372E-13)
            goto L_0x1099
        L_0x1032:
            android.content.Context r3 = X.C60960kU.A00
            r2 = 2131976480(0x7f136120, float:1.9590082E38)
            java.lang.String r1 = "video_import_error"
            X.C59689JTv.A0F(r3, r1, r2)
        L_0x103c:
            X.4mm r1 = r5.A02
            r1.getClass()
            com.instagram.creation.activity.MediaCaptureActivity r1 = (com.instagram.creation.activity.MediaCaptureActivity) r1
            r1.onBackPressed()
            goto L_0x102e
        L_0x1047:
            r0 = 287901218(0x11290622, float:1.3333639E-28)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K7x r0 = (X.C61445K7x) r0
            X.4mm r0 = r0.A02
            r0.getClass()
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            r0.onBackPressed()
            r0 = -1809559897(0xffffffff94244ea7, float:-8.2953955E-27)
        L_0x105f:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x1063:
            r0 = -506540919(0xffffffffe1cecc89, float:-4.7684595E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K7x r5 = (X.C61445K7x) r5
            X.82q r4 = X.C61445K7x.A00(r5)
            X.514 r1 = r4.ANP()
            int r2 = r1.A01
            X.514 r3 = X.AnonymousClass514.SQUARE
            int r1 = r3.A01
            if (r2 != r1) goto L_0x1080
            X.514 r3 = X.AnonymousClass514.FOUR_BY_FIVE
        L_0x1080:
            r1 = r4
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r2 = r1.A01
            r2.A05 = r3
            boolean r1 = r5.A08
            if (r1 == 0) goto L_0x1090
            com.instagram.creation.capture.video.view.IgCaptureVideoPreviewView r1 = r5.A03
            r1.requestLayout()
        L_0x1090:
            X.514 r1 = r4.ANP()
            r2.A06 = r1
            r1 = -481627369(0xffffffffe34af317, float:-3.7437588E21)
        L_0x1099:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x109d:
            r0 = 395320125(0x17901b3d, float:9.312658E-25)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KLo r0 = (X.C61775KLo) r0
            X.L44 r0 = r0.A03
            X.LQi r2 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r1 = r2.A01
            if (r1 == 0) goto L_0x10b7
            r0 = 0
            r2.A02 = r0
            r0 = 1
            r1.A03(r0)
        L_0x10b7:
            com.instagram.common.session.UserSession r0 = r2.A07
            X.27r r4 = X.27p.A01(r0)
            r2 = 0
            X.JVj r1 = X.C59725JVj.POST_CAPTURE
            java.lang.String r0 = "TIMELINE_TEXT_VOICE_DONE_TAP"
            X.27r.A08(r1, r4, r0, r2)
            r0 = 459779226(0x1b67ac9a, float:1.9163643E-22)
        L_0x10c8:
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYB.onClick(android.view.View):void");
    }

    public LYB(EditMediaInfoFragment editMediaInfoFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                this.A01 = editMediaInfoFragment;
                return;
            default:
                this.A01 = editMediaInfoFragment;
                return;
        }
    }

    public LYB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
