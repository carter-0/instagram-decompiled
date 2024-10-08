package X;

/* renamed from: X.PHt  reason: case insensitive filesystem */
public final class C72739PHt implements C358618bC {
    public final int A00;
    public final Object A01;

    public C72739PHt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: android.content.Context} */
    /* JADX WARNING: type inference failed for: r3v7, types: [X.NKQ, androidx.fragment.app.Fragment] */
    /* JADX WARNING: type inference failed for: r3v14, types: [androidx.fragment.app.Fragment, X.NK6] */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0303, code lost:
        if (X.C71118OdC.A03(r1, r2, r3, r4, (X.2EM) null, X.C330397Mp.A00(r0), r7) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0352, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0359, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03d6, code lost:
        return !X.C71118OdC.A03(r1, r2, r3, r4, (X.2EM) null, X.C330397Mp.A00(r0), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r3.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0295, code lost:
        if (X.182.A06(r5, r1.A00, 36322409576016033L) == false) goto L_0x0297;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onToggle(boolean r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x0342;
                case 1: goto L_0x03ed;
                case 2: goto L_0x0307;
                case 3: goto L_0x03b6;
                case 4: goto L_0x03d7;
                case 5: goto L_0x02bd;
                case 6: goto L_0x039c;
                case 7: goto L_0x02dd;
                case 8: goto L_0x0267;
                case 9: goto L_0x024c;
                case 10: goto L_0x023e;
                case 11: goto L_0x0230;
                case 12: goto L_0x01ca;
                case 13: goto L_0x0185;
                case 14: goto L_0x0167;
                default: goto L_0x0005;
            }
        L_0x0005:
            r4 = 0
            java.lang.String r1 = "Required value was null."
            r6 = 1
            r5 = 0
            java.lang.Object r3 = r11.A01
            X.H1O r3 = (X.H1O) r3
            if (r12 == 0) goto L_0x011b
            boolean r0 = X.H1O.A0A(r3)
            if (r0 == 0) goto L_0x0031
            boolean r0 = X.H1O.A09(r3)
            if (r0 != 0) goto L_0x0031
            android.view.ViewGroup r2 = r3.A03
            if (r2 == 0) goto L_0x0392
            r1 = 1058642330(0x3f19999a, float:0.6)
            android.content.Context r0 = r3.requireContext()
            int r0 = X.AnonymousClass0nB.A00(r0)
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            X.0nA.A0V(r2, r0)
        L_0x0031:
            android.view.ViewGroup r0 = r3.A03
            if (r0 == 0) goto L_0x0038
            r0.setVisibility(r4)
        L_0x0038:
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            X.0nA.A0J(r0)
            boolean r0 = X.H1O.A0A(r3)
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.H1O.A09(r3)
            if (r0 != 0) goto L_0x0068
            android.view.ViewGroup r0 = r3.A03
            if (r0 == 0) goto L_0x0118
            int r0 = r0.getHeight()
            float r0 = (float) r0
        L_0x0054:
            android.view.animation.TranslateAnimation r2 = new android.view.animation.TranslateAnimation
            r2.<init>(r5, r5, r0, r5)
            r0 = 500(0x1f4, double:2.47E-321)
            r2.setDuration(r0)
            r2.setFillAfter(r6)
            android.view.ViewGroup r0 = r3.A03
            if (r0 == 0) goto L_0x0068
            r0.startAnimation(r2)
        L_0x0068:
            X.0eM r0 = r3.A0T
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x0075
            if (r12 == 0) goto L_0x00be
            X.H1O.A03(r3)
        L_0x0075:
            X.H1O.A08(r3, r12)
            X.0eM r0 = r3.A0K
            java.lang.Object r2 = r0.getValue()
            X.I0f r2 = (X.C56534I0f) r2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "ig_collections"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x00b5
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r2 = r2.A01
            java.lang.Integer r0 = r2.A03
            java.lang.String r1 = X.C70864OPd.A00(r0)
            java.lang.String r0 = "module_name"
            r3.AAJ(r0, r1)
            java.lang.String r0 = "creation_toggle_tap"
            X.DbS.A1I(r3, r0)
            java.lang.String r0 = r2.A07
            X.DbS.A1N(r3, r0)
            if (r12 == 0) goto L_0x00b7
            java.lang.String r1 = "collaborative"
        L_0x00ad:
            java.lang.String r0 = "collection_type"
            r3.AAJ(r0, r1)
        L_0x00b2:
            r3.Cgf()
        L_0x00b5:
            r7 = 1
        L_0x00b6:
            return r7
        L_0x00b7:
            r0 = 891(0x37b, float:1.249E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x00ad
        L_0x00be:
            r3.A0C = r4
            android.view.View r1 = r3.A00
            java.lang.String r2 = "audienceSelectorIntentRow"
            if (r1 == 0) goto L_0x0352
            r0 = 2131438215(0x7f0b2a87, float:1.849835E38)
            android.widget.ImageView r7 = X.DbX.A0J(r1, r0)
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x0352
            r0 = 2131443887(0x7f0b40af, float:1.8509855E38)
            android.widget.TextView r6 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x0352
            r0 = 2131428247(0x7f0b0397, float:1.8478133E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r1, r0)
            android.view.View r1 = r3.A00
            if (r1 == 0) goto L_0x0352
            r0 = 2131429892(0x7f0b0a04, float:1.848147E38)
            android.widget.ImageView r4 = X.DbX.A0J(r1, r0)
            android.content.Context r1 = r3.requireContext()
            android.content.Context r0 = r3.getContext()
            int r0 = X.2Yu.A07(r0)
            int r2 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            r7.setColorFilter(r2, r1)
            r6.setTextColor(r2)
            int r0 = X.Dbb.A05(r3)
            r5.setTextColor(r0)
            r0 = 2131968267(0x7f13410b, float:1.9573424E38)
            X.DbU.A1G(r5, r3, r0)
            r4.setColorFilter(r2, r1)
            goto L_0x0075
        L_0x0118:
            r0 = 0
            goto L_0x0054
        L_0x011b:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r3.A07
            if (r0 == 0) goto L_0x0397
            X.0nA.A0M(r0)
            android.view.ViewGroup r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L_0x012f
            float r0 = r1.getTranslationY()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x012f:
            boolean r0 = X.0qQ.A0I(r0, r5)
            if (r0 == 0) goto L_0x0152
            android.view.View r0 = r3.A02
            if (r0 != 0) goto L_0x013d
            java.lang.String r2 = "composerContainer"
            goto L_0x0352
        L_0x013d:
            float r0 = r0.getTranslationY()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0152
            boolean r0 = X.H1O.A09(r3)
            if (r0 == 0) goto L_0x0068
            android.view.ViewGroup r0 = r3.A03
            X.C66581MXm.A19(r0)
            goto L_0x0068
        L_0x0152:
            java.lang.Integer r0 = r3.A09
            if (r0 == 0) goto L_0x0068
            int r0 = r0.intValue()
            float r2 = (float) r0
            r1 = 10
            X.Plk r0 = new X.Plk
            r0.<init>(r3, r1)
            X.H1O.A07(r3, r0, r5, r2)
            goto L_0x0068
        L_0x0167:
            java.lang.Object r1 = r11.A01
            X.NIn r1 = (X.C68449NIn) r1
            X.MuH r0 = X.C68449NIn.A02(r1)
            r0.A0G = r12
            X.0eM r0 = r1.A1T
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r0)
            java.lang.String r0 = "notes_music_reshare_enabled_pref"
            r1.E5T(r0, r12)
            r1.apply()
            goto L_0x00b5
        L_0x0185:
            java.lang.Object r6 = r11.A01
            X.P2X r6 = (X.P2X) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.N4P r0 = r6.A02
            X.3t3 r0 = r0.A0L
            X.3t0 r1 = X.C300965yF.A01(r0)
            r4 = r12 ^ 1
            r3 = 1
            java.lang.Class<X.1lm> r0 = X.AnonymousClass1lm.class
            X.MaY r2 = X.C66669Mac.A08(r5, r0)
            java.lang.String r1 = r1.A00
            X.AnonymousClass7TF.A1B(r2, r3, r1)
            X.1lm r0 = new X.1lm
            r0.<init>(r2)
            r0.A00 = r1
            r0.A01 = r4
            X.C66580MXl.A1P(r5, r0)
            X.0wc r1 = r6.A00
            r2 = 0
            java.lang.String r0 = "ig_read_receipt_control_setting"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "setting_enabled"
            r3.A7p(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.String r0 = "is_account_level"
            r3.A7p(r0, r1)
            goto L_0x00b2
        L_0x01ca:
            X.OWM r1 = X.OWM.A00
            java.lang.Object r4 = r11.A01
            X.P2x r4 = (X.C72358P2x) r4
            com.instagram.common.session.UserSession r5 = r4.A02
            X.N4P r0 = r4.A06
            X.3t3 r6 = r0.A0L
            java.lang.String r0 = X.C300965yF.A07(r6)
            java.lang.String r3 = "thread_details_page"
            r1.A00(r5, r3, r0)
            X.Q2C r0 = r4.A04
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0458
            X.O7J r0 = r4.A03
            X.0xa r7 = r0.A00
            java.lang.String r2 = "key_should_show_locked_chat_nux"
            r9 = 1
            boolean r0 = r7.getBoolean(r2, r9)
            if (r0 == 0) goto L_0x0477
            X.7Pr r10 = X.DbS.A0W(r5)
            r10.A1J = r9
            androidx.fragment.app.Fragment r8 = r4.A01
            r0 = 2131956706(0x7f1313e2, float:1.9549975E38)
            java.lang.String r0 = r8.getString(r0)
            r10.A0g = r0
            r10.A0v = r9
            r1 = 18
            X.Oju r0 = new X.Oju
            r0.<init>(r4, r1)
            r10.A0K = r0
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = r8.getString(r0)
            r10.A0h = r0
            r10.A1N = r9
            r10.A0w = r9
            X.7Pu r0 = r10.A00()
            r4.A00 = r0
            X.H1W r1 = new X.H1W
            r1.<init>()
            X.7Pu r0 = r4.A00
            if (r0 != 0) goto L_0x0436
            java.lang.String r2 = "bottomSheetNux"
            goto L_0x0352
        L_0x0230:
            java.lang.Object r0 = r11.A01
            X.P2Z r0 = (X.P2Z) r0
            X.O7D r0 = r0.A01
            if (r0 == 0) goto L_0x00b5
            X.NJl r0 = r0.A00
            r0.A06 = r12
            goto L_0x00b5
        L_0x023e:
            java.lang.Object r0 = r11.A01
            X.P2Y r0 = (X.P2Y) r0
            X.O7C r0 = r0.A00
            if (r0 == 0) goto L_0x00b5
            X.NJl r0 = r0.A00
            r0.A05 = r12
            goto L_0x00b5
        L_0x024c:
            java.lang.Object r4 = r11.A01
            X.P2y r4 = (X.C72359P2y) r4
            com.instagram.common.session.UserSession r3 = r4.A02
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322409576736938(0x810b0a003528aa, double:3.033776302707717E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r7 = 1
            if (r0 != 0) goto L_0x00b6
            boolean r0 = X.C72359P2y.A01(r4, r7)
            if (r0 == 0) goto L_0x047a
            return r7
        L_0x0267:
            java.lang.Object r3 = r11.A01
            X.P2y r3 = (X.C72359P2y) r3
            com.instagram.common.session.UserSession r4 = r3.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36322409576736938(0x810b0a003528aa, double:3.033776302707717E-306)
            boolean r0 = X.182.A06(r5, r4, r0)
            r7 = 0
            if (r0 != 0) goto L_0x00b5
            boolean r0 = X.C72359P2y.A01(r3, r7)
            if (r0 == 0) goto L_0x00b6
            X.43Q r1 = r3.A03
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x0297
            com.instagram.common.session.UserSession r2 = r1.A00
            r0 = 36322409576016033(0x810b0a002a28a1, double:3.033776302251814E-306)
            boolean r1 = X.182.A06(r5, r2, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0298
        L_0x0297:
            r0 = 0
        L_0x0298:
            if (r12 == 0) goto L_0x00b5
            if (r0 != 0) goto L_0x00b5
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "\n        Things may go unexpected if you're testing Instamadillo TLC.\n        Recommend to add "
            r1.append(r0)
            com.instagram.user.model.User r0 = X.DbT.A0j(r4)
            r1.append(r0)
            java.lang.String r0 = " to igd_instamadillo_tlc_dogfooding_biglist and then restart app.\n        "
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r1 = X.0rw.A0t(r0)
            java.lang.String r0 = "You are not passing TLC GK"
            X.C72359P2y.A00(r3, r1, r0, r7)
            goto L_0x00b5
        L_0x02bd:
            java.lang.Object r3 = r11.A01
            X.NK6 r3 = (X.NK6) r3
            boolean r0 = r3.isAdded()
            r7 = 0
            if (r0 == 0) goto L_0x00b6
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A07
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r0 = r3.A02
            if (r0 != 0) goto L_0x02fa
            java.lang.String r2 = "threadDetailInfo"
            goto L_0x0352
        L_0x02dd:
            java.lang.Object r3 = r11.A01
            X.NJm r3 = (X.NJm) r3
            android.content.Context r2 = r3.getContext()
            r7 = 0
            if (r2 == 0) goto L_0x00b6
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            X.0eM r0 = r3.A0A
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r0 = r3.A04
            if (r0 != 0) goto L_0x02fa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02fa:
            int r6 = X.C330397Mp.A00(r0)
            r5 = 0
            boolean r0 = X.C71118OdC.A03(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x00b6
            goto L_0x00b5
        L_0x0307:
            java.lang.Object r4 = r11.A01
            X.NJ7 r4 = (X.NJ7) r4
            X.3t3 r1 = X.NJ7.A00(r4)
            X.3t0 r0 = X.C300965yF.A02(r1)
            if (r0 == 0) goto L_0x00b5
            X.0eM r0 = r4.A0G
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = X.C66580MXl.A0x(r1)
            com.instagram.model.direct.DirectThreadKey r2 = X.C66581MXm.A0e(r0)
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Class<X.1jR> r0 = X.C66101jR.class
            X.MaY r1 = X.C66669Mac.A08(r3, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            X.1jR r0 = new X.1jR
            r0.<init>(r1)
            r0.A00 = r2
            r0.A01 = r12
            X.C66580MXl.A1P(r3, r0)
            X.NJ7.A07(r4)
            goto L_0x00b5
        L_0x0342:
            java.lang.Object r4 = r11.A01
            X.NKH r4 = (X.NKH) r4
            if (r12 != 0) goto L_0x0379
            r0 = 0
        L_0x0349:
            r4.A00 = r0
            X.ONz r5 = r4.A06
            r8 = 0
            if (r5 != 0) goto L_0x035a
            java.lang.String r2 = "directPromptsPrivateAndSocialGroupsLogger"
        L_0x0352:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x035a:
            if (r12 == 0) goto L_0x0367
            X.Nmf r6 = X.C69497Nmf.TOGGLE_ON
        L_0x035e:
            X.Nmc r7 = X.C69494Nmc.FREQUENCY_TOGGLE
            X.Mts r0 = r4.A07
            if (r0 != 0) goto L_0x036a
            java.lang.String r2 = "promptNamingSuggestionsViewModel"
            goto L_0x0352
        L_0x0367:
            X.Nmf r6 = X.C69497Nmf.TOGGLE_OFF
            goto L_0x035e
        L_0x036a:
            X.OBU r0 = r0.A01
            if (r0 == 0) goto L_0x0370
            java.lang.String r8 = r0.A00
        L_0x0370:
            java.lang.String r10 = r4.A0C
            com.instagram.model.direct.DirectThreadKey r0 = r4.A0A
            if (r0 != 0) goto L_0x038b
            java.lang.String r2 = "threadKey"
            goto L_0x0352
        L_0x0379:
            X.0eM r0 = r4.A0G
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36605611126953238(0x820c9c00021516, double:3.212874103425616E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            goto L_0x0349
        L_0x038b:
            java.lang.String r9 = r0.A00
            r5.A00(r6, r7, r8, r9, r10)
            goto L_0x00b5
        L_0x0392:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x0397:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x039c:
            java.lang.Object r3 = r11.A01
            X.NKQ r3 = (X.NKQ) r3
            android.content.Context r2 = r3.requireContext()
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            X.0eM r0 = r3.A0L
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r0 = r3.A0A
            if (r0 != 0) goto L_0x03ca
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x03b6:
            java.lang.Object r3 = r11.A01
            X.NJk r3 = (X.C68472NJk) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A0C
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.N4P r0 = r3.A04
        L_0x03ca:
            int r6 = X.C330397Mp.A00(r0)
            r5 = 0
            r7 = 0
            boolean r0 = X.C71118OdC.A03(r1, r2, r3, r4, r5, r6, r7)
            r7 = r0 ^ 1
            return r7
        L_0x03d7:
            java.lang.Object r2 = r11.A01
            X.NK6 r2 = (X.NK6) r2
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x03e6
            int r0 = X.DbW.A01(r12)
            r1.setVisibility(r0)
        L_0x03e6:
            X.8bC r0 = r2.A06
            boolean r7 = r0.onToggle(r12)
            return r7
        L_0x03ed:
            java.lang.Object r3 = r11.A01
            X.OVT r3 = (X.OVT) r3
            r7 = r12
            X.OyN r5 = r3.A07
            X.1OC r0 = r5.A01
            if (r0 == 0) goto L_0x03fb
            r7 = r12 ^ 1
            return r7
        L_0x03fb:
            r4 = 1
            if (r12 != 0) goto L_0x041f
            android.content.Context r0 = r3.A01
            X.8ab r2 = X.DbS.A0Y(r0)
            r0 = 2131959394(0x7f131e62, float:1.9555427E38)
            r2.A09(r0)
            r0 = 2131959392(0x7f131e60, float:1.9555423E38)
            r2.A08(r0)
            r1 = 2131959393(0x7f131e61, float:1.9555425E38)
            r0 = 35
            X.C71249OgE.A02(r2, r3, r0, r1)
            r2.A05()
            X.DbT.A1V(r2)
            return r7
        L_0x041f:
            X.OSf r3 = r3.A06
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "1"
            java.lang.String r0 = "enabled_status"
            r2.put(r0, r1)
            r1 = 0
            java.lang.String r0 = "icebreaker_settings_show_question_button_toggled"
            X.C70932OSf.A00(r3, r0, r1, r2)
            r5.A09(r4)
            return r7
        L_0x0436:
            X.DbU.A1I(r8, r1, r0)
            X.0xY r1 = r7.AR4()
            r0 = 0
            r1.E5T(r2, r0)
            r1.apply()
            java.lang.String r2 = X.C300965yF.A07(r6)
            X.0Aj r1 = X.C66584MXp.A0B(r5)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x047a
            java.lang.String r0 = "show_locked_chat_NUX"
            X.C66584MXp.A0x(r1, r0, r3, r2)
            goto L_0x047a
        L_0x0458:
            androidx.fragment.app.Fragment r0 = r4.A01
            X.8ab r2 = X.DbW.A0V(r0)
            r0 = 2131963799(0x7f132f97, float:1.9564362E38)
            r2.A09(r0)
            r0 = 2131963797(0x7f132f95, float:1.9564358E38)
            r2.A08(r0)
            r1 = 2131963798(0x7f132f96, float:1.956436E38)
            r0 = 42
            X.OgE r0 = X.C71249OgE.A00(r4, r0)
            X.Dba.A0t(r0, r2, r1)
            goto L_0x047a
        L_0x0477:
            X.C72358P2x.A00(r4, r12)
        L_0x047a:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72739PHt.onToggle(boolean):boolean");
    }
}
