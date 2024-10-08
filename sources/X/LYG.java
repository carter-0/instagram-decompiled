package X;

import android.view.View;

public final class LYG implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LYG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public static LYG A01(Object obj, Object obj2, int i) {
        return new LYG(i, obj, obj2);
    }

    public static void A02(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new LYG(i, obj, obj2), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:166:0x082f, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0836, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0db1, code lost:
        if (X.182.A06(X.0Tu.A05, X.AnonymousClass7TE.A0l(r7.A0d), 36326541331806019L) == false) goto L_0x0db3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0022, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:0x10fb, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x10fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x1137, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x113a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x1167, code lost:
        X.0qQ.A0F("buttonDebouncer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x1170, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r36) {
        /*
            r35 = this;
            r0 = r35
            int r1 = r0.A00
            r3 = r36
            switch(r1) {
                case 0: goto L_0x10ff;
                case 1: goto L_0x05bf;
                case 2: goto L_0x05aa;
                case 3: goto L_0x10f1;
                case 4: goto L_0x10e6;
                case 5: goto L_0x10db;
                case 6: goto L_0x10d0;
                case 7: goto L_0x10ba;
                case 8: goto L_0x10a4;
                case 9: goto L_0x1099;
                case 10: goto L_0x108e;
                case 11: goto L_0x1078;
                case 12: goto L_0x1056;
                case 13: goto L_0x0593;
                case 14: goto L_0x057c;
                case 15: goto L_0x0565;
                case 16: goto L_0x054e;
                case 17: goto L_0x0537;
                case 18: goto L_0x0520;
                case 19: goto L_0x0509;
                case 20: goto L_0x0f8d;
                case 21: goto L_0x04f4;
                case 22: goto L_0x0f56;
                case 23: goto L_0x04ac;
                case 24: goto L_0x0e07;
                case 25: goto L_0x0dd0;
                case 26: goto L_0x0d6d;
                case 27: goto L_0x0d39;
                case 28: goto L_0x0d05;
                case 29: goto L_0x0cdd;
                case 30: goto L_0x047f;
                case 31: goto L_0x0cba;
                case 32: goto L_0x0c97;
                case 33: goto L_0x0461;
                case 34: goto L_0x0c56;
                case 35: goto L_0x0430;
                case 36: goto L_0x0b88;
                case 37: goto L_0x0419;
                case 38: goto L_0x0a09;
                case 39: goto L_0x09b0;
                case 40: goto L_0x03c1;
                case 41: goto L_0x0921;
                case 42: goto L_0x080f;
                case 43: goto L_0x08c4;
                case 44: goto L_0x0885;
                case 45: goto L_0x086b;
                case 46: goto L_0x02ea;
                case 47: goto L_0x0283;
                case 48: goto L_0x024a;
                case 49: goto L_0x021f;
                case 50: goto L_0x0204;
                case 51: goto L_0x01e6;
                case 52: goto L_0x01c7;
                case 53: goto L_0x01a8;
                case 54: goto L_0x0173;
                case 55: goto L_0x0151;
                case 56: goto L_0x07a2;
                case 57: goto L_0x0772;
                case 58: goto L_0x0717;
                case 59: goto L_0x06df;
                case 60: goto L_0x0322;
                case 61: goto L_0x011e;
                case 62: goto L_0x00fe;
                case 63: goto L_0x0696;
                case 64: goto L_0x00db;
                case 65: goto L_0x05d4;
                case 66: goto L_0x00c2;
                case 67: goto L_0x0062;
                case 68: goto L_0x0045;
                case 69: goto L_0x0026;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 2089813638(0x7c900686, float:5.9825845E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.02m r3 = X.02m.A0p
            r2 = 145754550(0x8b009b6, float:1.0594898E-33)
            r3.markerStart(r2)
            java.lang.Object r0 = r0.A02
            X.MV9 r0 = (X.MV9) r0
            r0.Dj4()
            r0 = -1653961707(0xffffffff9d6a8c15, float:-3.1042063E-21)
        L_0x0022:
            X.AnonymousClass0fD.A0C(r0, r1)
        L_0x0025:
            return
        L_0x0026:
            r1 = 898369020(0x358c05fc, float:1.0432555E-6)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout r4 = (com.instagram.direct.fragment.stickertray.hscroll.tabs.IgdExpressionTrayHscrollLayout) r4
            X.Jek r2 = r4.A00
            int r2 = r2.indexOfChild(r3)
            r4.setSelectedIndex(r2)
            java.lang.Object r0 = r0.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r3)
            r0 = -1157282089(0xffffffffbb0546d7, float:-0.0020336413)
            goto L_0x0022
        L_0x0045:
            r1 = 439195391(0x1a2d96ff, float:3.5897535E-23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.7GV r2 = (X.AnonymousClass7GV) r2
            r2.A04()
            java.lang.Object r0 = r0.A02
            X.LN8 r0 = (X.LN8) r0
            android.view.View r2 = r0.A09
            r0 = 8
            r2.setVisibility(r0)
            r0 = 543676013(0x2067d66d, float:1.9637409E-19)
            goto L_0x0022
        L_0x0062:
            r1 = 539409565(0x2026bc9d, float:1.4123154E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.JjH r2 = (X.C60314JjH) r2
            java.lang.String r11 = X.AnonymousClass7TG.A0j()
            java.lang.Object r3 = r0.A02
            X.LZa r3 = (X.C64300LZa) r3
            X.L9i r0 = r3.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r0.A03
            java.lang.String r12 = X.AnonymousClass7TF.A0f(r0)
            X.KIN r3 = r3.A04
            long r14 = r3.A00()
            int r13 = r3.A00
            r0 = 0
            r3.A00 = r0
            r6 = 0
            X.GlX r9 = new X.GlX
            r10 = r6
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r16)
            X.7a3 r4 = r2.A04
            java.lang.String r0 = r9.A04
            X.7cr r3 = r4.A00(r0)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = r2.A05
            X.7a5 r0 = r2.A06
            X.1Xl r12 = r0.A00
            if (r12 == 0) goto L_0x113e
            if (r3 == 0) goto L_0x00c0
            java.lang.String r13 = r3.A04
        L_0x00a5:
            r0 = 5
            X.IMw r8 = new X.IMw
            r8.<init>(r2, r0)
            X.Le4 r7 = X.C64563Le4.A00
            r11 = r6
            r5.A0F(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.A01()
            X.05G r2 = r2.A0C
            X.P0g r0 = X.P0g.A00
            r2.Epw(r0)
            r0 = -1956884003(0xffffffff8b5c51dd, float:-4.2432046E-32)
            goto L_0x0022
        L_0x00c0:
            r13 = 0
            goto L_0x00a5
        L_0x00c2:
            r1 = 58453027(0x37bec23, float:7.403334E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Jp0 r3 = (X.C60653Jp0) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0sP r2 = r3.A04
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 178586095(0xaa501ef, float:1.588965E-32)
            goto L_0x0022
        L_0x00db:
            r1 = -301740033(0xffffffffee03cfff, float:-1.0198497E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.61u r3 = (X.C3021461u) r3
            r2 = 1
            r3.setPrimaryActionIsLoading(r2)
            java.lang.Object r0 = r0.A02
            X.E3z r0 = (X.C47475E3z) r0
            X.0eM r0 = r0.A03
            java.lang.Object r0 = r0.getValue()
            X.Jhi r0 = (X.C60225Jhi) r0
            r0.A00()
            r0 = -1371590653(0xffffffffae3f3003, float:-4.3471015E-11)
            goto L_0x0022
        L_0x00fe:
            r1 = -1788791158(0xffffffff9561368a, float:-4.5481412E-26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.LSk r5 = (X.LSk) r5
            java.lang.String r4 = "user"
            java.lang.String r3 = "trial_settings"
            java.lang.String r2 = "tap_close"
            X.LSk.A03(r5, r4, r3, r2)
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A17(r0)
            r0 = 419210186(0x18fca3ca, float:6.5305858E-24)
            goto L_0x0022
        L_0x011e:
            r1 = 1684930945(0x646e0181, float:1.7561734E22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r12 = r0.A01
            X.LSk r12 = (X.LSk) r12
            java.lang.Boolean r4 = X.AnonymousClass7TE.A0v()
            r2 = 0
            r3 = r2
            r5 = r2
            r6 = r2
            r7 = r2
            r8 = r2
            r9 = r2
            r10 = r2
            r11 = r2
            X.Jqu r11 = X.LSk.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "user"
            java.lang.String r14 = "creation_education"
            java.lang.String r15 = "tap_close"
            r16 = r2
            X.LSk.A02(r11, r12, r13, r14, r15, r16)
            java.lang.Object r0 = r0.A02
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbZ.A17(r0)
            r0 = -1091095552(0xffffffffbef73400, float:-0.4828186)
            goto L_0x0022
        L_0x0151:
            r1 = -384954872(0xffffffffe90e0e08, float:-1.0733358E25)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.LQz r5 = X.C64158LQz.A00
            java.lang.Object r3 = r0.A02
            X.LpU r3 = (X.C65224LpU) r3
            X.4DH r2 = r3.A01
            android.content.Context r4 = r2.requireContext()
            com.instagram.common.session.UserSession r3 = r3.A02
            java.lang.Object r2 = r0.A01
            X.Ki8 r2 = (X.C62575Ki8) r2
            r0 = 0
            r5.A01(r4, r3, r2, r0)
            r0 = 1486259946(0x589686ea, float:1.32404957E15)
            goto L_0x0022
        L_0x0173:
            r1 = -117983732(0xfffffffff8f7b60c, float:-4.0193427E34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Lp3 r3 = (X.C65199Lp3) r3
            X.4DH r2 = r3.A01
            android.content.Context r4 = r2.requireContext()
            com.instagram.common.session.UserSession r3 = r3.A02
            java.lang.Object r0 = r0.A01
            X.Ki8 r0 = (X.C62575Ki8) r0
            X.6ap r2 = X.DbS.A0a()
            java.lang.String r0 = X.C64158LQz.A00(r4, r3, r0)
            r2.A0D = r0
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r0 = r4.getDrawable(r0)
            r2.A04 = r0
            r2.A02()
            X.DbY.A1N(r2)
            r0 = -300965270(0xffffffffee0fa26a, float:-1.1113176E28)
            goto L_0x0022
        L_0x01a8:
            r1 = -2146127806(0xffffffff8014b042, float:-1.89994E-39)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FGZ r3 = X.FGZ.A01
            java.lang.Object r2 = r0.A02
            X.LpH r2 = (X.C65211LpH) r2
            X.4DH r2 = r2.A01
            android.content.Context r2 = r2.requireContext()
            java.lang.Object r0 = r0.A01
            X.Ki8 r0 = (X.C62575Ki8) r0
            r3.A04(r2, r0)
            r0 = 8709149(0x84e41d, float:1.2204117E-38)
            goto L_0x0022
        L_0x01c7:
            r1 = 126273374(0x786c75e, float:2.0279257E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FGZ r3 = X.FGZ.A01
            java.lang.Object r2 = r0.A02
            X.Lp2 r2 = (X.C65198Lp2) r2
            X.4DH r2 = r2.A01
            android.content.Context r2 = r2.requireContext()
            java.lang.Object r0 = r0.A01
            X.Ki8 r0 = (X.C62575Ki8) r0
            r3.A04(r2, r0)
            r0 = -853712454(0xffffffffcd1d61ba, float:-1.6502672E8)
            goto L_0x0022
        L_0x01e6:
            r1 = -1837123148(0xffffffff927fb9b4, float:-8.069271E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.FEb r3 = X.ENZ.A04
            java.lang.Object r2 = r0.A02
            X.LpO r2 = (X.C65218LpO) r2
            com.instagram.common.session.UserSession r5 = r2.A07
            java.lang.Object r4 = r0.A01
            android.content.Context r4 = (android.content.Context) r4
            r7 = 1
            r6 = 0
            r8 = r7
            r3.A02(r4, r5, r6, r7, r8)
            r0 = -777612104(0xffffffffd1a694b8, float:-8.9432457E10)
            goto L_0x0022
        L_0x0204:
            r1 = 1502880738(0x599423e2, float:5.2122188E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Loi r2 = (X.C65179Loi) r2
            X.MXh r3 = r2.A03
            X.4DH r2 = r2.A02
            java.lang.Object r0 = r0.A01
            com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType r0 = (com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType) r0
            r3.Dax(r2, r0)
            r0 = -168497001(0xfffffffff5f4f097, float:-6.2099618E32)
            goto L_0x0022
        L_0x021f:
            r1 = -743850150(0xffffffffd3a9bf5a, float:-1.45811964E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.5w9 r2 = X.AnonymousClass5w8.A05
            java.lang.Object r2 = r0.A02
            X.LpY r2 = (X.C65228LpY) r2
            com.instagram.common.session.UserSession r6 = r2.A05
            X.5w8 r3 = X.AnonymousClass5w9.A00(r6)
            X.4DH r2 = r2.A04
            androidx.fragment.app.FragmentActivity r5 = r2.requireActivity()
            android.content.Context r4 = r2.requireContext()
            java.lang.Object r7 = r0.A01
            X.MSE r7 = (X.MSE) r7
            java.lang.String r8 = "advanced_setting"
            r3.A06(r4, r5, r6, r7, r8)
            r0 = 587597848(0x23060818, float:7.2658685E-18)
            goto L_0x0022
        L_0x024a:
            r1 = -1858535929(0xffffffff9138fe07, float:-1.4593319E-28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.Los r6 = (X.C65189Los) r6
            X.KOO r2 = r6.A06
            X.05G r5 = r2.A00
            java.lang.Object r2 = r5.getValue()
            X.Jvg r2 = (X.C61042Jvg) r2
            boolean r4 = r2.A00
            r3 = 0
            r2 = 5
            X.C61042Jvg.A00(r5, r2, r4, r3)
            java.lang.Object r0 = r0.A01
            X.MS9 r0 = (X.MS9) r0
            X.JwM r0 = r0.AYb()
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            com.instagram.common.session.UserSession r0 = r6.A04
            X.27r r2 = X.27p.A01(r0)
            X.80P r0 = r6.A02
            r2.A1X(r0)
            r0 = -1574160173(0xffffffffa22c38d3, float:-2.334043E-18)
            goto L_0x0022
        L_0x0283:
            r1 = -1640600231(0xffffffff9e366d59, float:-9.657612E-21)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.LOL r3 = (X.LOL) r3
            X.L4J r5 = r3.A03
            com.instagram.common.session.UserSession r6 = r5.A01
            java.lang.String r8 = "VIDEO_COMPOSER"
            java.lang.Object r4 = r0.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r2 = r4.getId()
            X.0iw r5 = r5.A00
            java.util.HashMap r10 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "nonprofit_id"
            r10.put(r0, r2)
            java.lang.String r7 = "fundraiser_creation_nudge"
            r9 = 0
            X.LTM.A07(r5, r6, r7, r8, r9, r10)
            android.view.View r0 = r3.A00
            android.content.Context r2 = r0.getContext()
            java.lang.String r0 = r4.getId()
            X.LTM.A05(r5, r6, r8, r0)
            X.8ab r5 = X.DbS.A0Y(r2)
            r0 = 2131237569(0x7f081ac1, float:1.8091392E38)
            X.DbU.A16(r2, r5, r0)
            r0 = 2131952462(0x7f13034e, float:1.9541367E38)
            r5.A09(r0)
            r0 = 2131952461(0x7f13034d, float:1.9541365E38)
            r5.A08(r0)
            r2 = 2131956858(0x7f13147a, float:1.9550284E38)
            r0 = 32
            X.LV0 r0 = X.LV0.A00(r4, r3, r0)
            r5.A0J(r0, r2)
            r0 = 33
            X.LV0 r0 = X.LV0.A00(r4, r3, r0)
            X.DbX.A16(r0, r5)
            r0 = 1502897760(0x59946660, float:5.2213574E15)
            goto L_0x0022
        L_0x02ea:
            r1 = 50481054(0x302479e, float:3.828578E-37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.LOL r2 = (X.LOL) r2
            X.L0z r6 = r2.A02
            java.lang.Object r0 = r0.A01
            X.DUz r0 = (X.C46322DUz) r0
            java.lang.String r5 = r0.getFundraiserId()
            java.lang.String r4 = r0.getFundraiserTitle()
            java.lang.String r2 = r0.getFormattedGoalAmount()
            X.AnonymousClass7TG.A1U(r5, r4, r2)
            r0 = 0
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r3 = new com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel
            r3.<init>(r5, r4, r2, r0)
            X.KHV r0 = r6.A00
            X.LpT r0 = X.C65223LpT.A00(r0)
            X.MXh r2 = r0.A05
            X.4DH r0 = r0.A03
            r2.Dp4(r0, r3)
            r0 = 876609795(0x34400103, float:1.7881761E-7)
            goto L_0x0022
        L_0x0322:
            r1 = -972588603(0xffffffffc60779c5, float:-8670.442)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.K67 r4 = (X.K67) r4
            java.lang.Object r5 = r0.A01
            X.2da r5 = (X.2da) r5
            r0 = 1
            r5.ART(r0)
            r5.setIsLoading(r0)
            r0 = 0
            r5.ARb(r0, r0)
            X.1ET r3 = X.1ES.A01()
            X.0eM r6 = r4.A0Q
            X.1E8 r2 = X.DbX.A0d(r6)
            java.lang.String r0 = r4.A0C
            X.1Xj r15 = r2.A02(r0)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r6)
            if (r15 == 0) goto L_0x114b
            r9 = 0
            boolean r34 = r15.A5l()
            X.JiL r0 = r4.A07
            java.lang.String r8 = "clipsPeopleTaggingViewModel"
            if (r0 == 0) goto L_0x1143
            X.2Fj r0 = r0.A0A
            java.lang.Object r7 = r0.A02()
            java.util.List r7 = (java.util.List) r7
            X.JiL r0 = r4.A07
            if (r0 == 0) goto L_0x1143
            X.2Fj r0 = r0.A08
            java.lang.Object r6 = r0.A02()
            java.util.List r6 = (java.util.List) r6
            X.JiL r0 = r4.A07
            if (r0 == 0) goto L_0x1143
            X.2Fj r0 = r0.A09
            java.lang.Object r2 = r0.A02()
            java.util.List r2 = (java.util.List) r2
            X.JiL r0 = r4.A07
            if (r0 == 0) goto L_0x1143
            X.2Fj r0 = r0.A07
            java.lang.Object r0 = r0.A02()
            java.util.List r0 = (java.util.List) r0
            r10 = r9
            r11 = r9
            r12 = r9
            r14 = r9
            r16 = r9
            r17 = r9
            r18 = r9
            r19 = r9
            r20 = r9
            r21 = r9
            r22 = r9
            r23 = r9
            r24 = r9
            r25 = r9
            r26 = r9
            r27 = r9
            r28 = r9
            r29 = r7
            r30 = r6
            r31 = r9
            r32 = r2
            r33 = r0
            X.1OC r2 = X.LSW.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0 = 4
            X.C61499KAe.A00(r2, r5, r4, r0)
            r3.schedule(r2)
            r0 = -1300377556(0xffffffffb27dd02c, float:-1.4773871E-8)
            goto L_0x0022
        L_0x03c1:
            java.lang.Object r4 = r0.A01
            X.Lkh r4 = (X.C64942Lkh) r4
            java.lang.Object r5 = r0.A02
            java.lang.Integer r5 = (java.lang.Integer) r5
            java.lang.Integer r0 = r4.A0C
            r3 = 0
            if (r5 == r0) goto L_0x0407
            r4.A0C = r5
            X.MV1 r1 = r4.A05
            r1.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1W(r5, r0)
            r1.setSelected(r0)
            X.MV1 r1 = r4.A03
            r1.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            boolean r0 = X.AnonymousClass7TF.A1W(r5, r0)
            r1.setSelected(r0)
            X.MV1 r1 = r4.A04
            r1.getClass()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r5 == r0) goto L_0x03f7
            r2 = 0
        L_0x03f7:
            r1.setSelected(r2)
            com.instagram.creation.base.ui.sliderview.SliderView r1 = r4.A06
            r1.getClass()
            float r0 = X.C64942Lkh.A00(r4, r5)
            r1.A02(r3, r0)
            return
        L_0x0407:
            float r0 = X.C64942Lkh.A00(r4, r5)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            com.instagram.creation.base.ui.sliderview.SliderView r0 = r4.A06
            r0.getClass()
            r0.A02(r3, r1)
            return
        L_0x0419:
            r1 = -803370431(0xffffffffd01d8a41, float:-1.05723341E10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Jkn r2 = (X.C60394Jkn) r2
            X.0sP r2 = r2.A01
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = 568243363(0x21deb4a3, float:1.5091119E-18)
            goto L_0x0022
        L_0x0430:
            java.lang.Object r6 = r0.A01
            X.K5H r6 = (X.K5H) r6
            java.lang.Object r5 = r0.A02
            android.content.Context r5 = (android.content.Context) r5
            X.4O6 r4 = r6.A0H
            com.instagram.common.session.UserSession r3 = r6.A0B
            X.Uwa r0 = X.K5H.A01(r6)
            java.lang.String r2 = r0.name()
            java.lang.String r1 = "NearbyVenusFragment::CLICK_LS_UPSELL_BUTTON"
            X.4O7 r0 = X.VK6.A00
            r0.A05(r3, r4, r2, r1)
            if (r5 == 0) goto L_0x1156
            boolean r0 = X.1Wr.isLocationEnabled(r5)
            if (r0 != 0) goto L_0x1156
            android.os.Handler r0 = r6.A03
            if (r0 == 0) goto L_0x0025
            r1 = 2
            r0.removeMessages(r1)
            android.os.Handler r0 = r6.A03
            r0.sendEmptyMessage(r1)
            return
        L_0x0461:
            r1 = 1592861022(0x5ef1215e, float:8.6876361E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.Jl9 r2 = (X.C60416Jl9) r2
            X.0sL r3 = r2.A03
            java.lang.Object r0 = r0.A01
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r2 = X.JTP.A0r(r0)
            r0 = 0
            r3.invoke(r2, r0)
            r0 = 1487082468(0x58a313e4, float:1.4344466E15)
            goto L_0x0022
        L_0x047f:
            r1 = 2010811514(0x77da8c7a, float:8.86539E33)
            int r1 = X.AnonymousClass0fD.A05(r1)
            X.5w9 r2 = X.AnonymousClass5w8.A05
            java.lang.Object r3 = r0.A02
            X.K5Y r3 = (X.K5Y) r3
            X.0eM r2 = r3.A0C
            X.5w8 r4 = X.JTT.A0R(r2)
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            android.content.Context r5 = r3.requireContext()
            java.lang.Object r8 = r0.A01
            X.MSE r8 = (X.MSE) r8
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r9 = "advanced_setting"
            r4.A06(r5, r6, r7, r8, r9)
            r0 = -1505693216(0xffffffffa640f1e0, float:-6.6941183E-16)
            goto L_0x0022
        L_0x04ac:
            r1 = 187508536(0xb2d2738, float:3.3348093E-32)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.K7x r2 = (X.C61445K7x) r2
            X.7kB r2 = r2.A04
            r2.getClass()
            java.util.HashMap r3 = r2.A06
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r3)
            java.lang.String r5 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r2 = r2.get(r5)
            X.7vz r2 = (X.C346927vz) r2
            if (r2 == 0) goto L_0x115a
            int r3 = r2.ordinal()
            r2 = 1
            if (r3 == r2) goto L_0x04e6
            r2 = 2
            if (r3 != r2) goto L_0x04e1
            java.lang.Object r2 = r0.A02
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 2131974228(0x7f135854, float:1.9585514E38)
            X.W38.A02(r2, r0)
        L_0x04e1:
            r0 = 1615246348(0x6046b40c, float:5.727233E19)
            goto L_0x0022
        L_0x04e6:
            java.lang.Object r4 = r0.A02
            android.app.Activity r4 = (android.app.Activity) r4
            r3 = 3
            X.Lh4 r2 = new X.Lh4
            r2.<init>(r0, r3)
            X.JTP.A11(r4, r2, r5)
            goto L_0x04e1
        L_0x04f4:
            r1 = -559256797(0xffffffffdeaa6b23, float:-6.1399736E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = -447915041(0xffffffffe54d5bdf, float:-6.061124E22)
            goto L_0x0022
        L_0x0509:
            r1 = 2103226366(0x7d5caffe, float:1.8333998E37)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = 863533737(0x33787aa9, float:5.785356E-8)
            goto L_0x0022
        L_0x0520:
            r1 = -1218911336(0xffffffffb758e398, float:-1.2927594E-5)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = -1177733843(0xffffffffb9cd352d, float:-3.9140266E-4)
            goto L_0x0022
        L_0x0537:
            r1 = -1921157570(0xffffffff8d7d763e, float:-7.8103973E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = -934987526(0xffffffffc84538fa, float:-201955.9)
            goto L_0x0022
        L_0x054e:
            r1 = -1563621398(0xffffffffa2cd07ea, float:-5.557374E-18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = 1352417009(0x509c3ef1, float:2.0970965E10)
            goto L_0x0022
        L_0x0565:
            r1 = 1736599411(0x67826773, float:1.2316319E24)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = 1677732832(0x64002be0, float:9.457379E21)
            goto L_0x0022
        L_0x057c:
            r1 = -286220989(0xffffffffeef09d43, float:-3.723326E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = -567398366(0xffffffffde2e3022, float:-3.13789239E18)
            goto L_0x0022
        L_0x0593:
            r1 = 1077982532(0x4040b544, float:3.0110636)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController r2 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsTimelineActionBarViewController) r2
            X.L3z r2 = r2.A00
            if (r2 == 0) goto L_0x1167
            A03(r3, r0, r2)
            r0 = -1281691777(0xffffffffb39aef7f, float:-7.214748E-8)
            goto L_0x0022
        L_0x05aa:
            r1 = -1503662419(0xffffffffa65feead, float:-7.7692133E-16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = -1576810024(0xffffffffa203c9d8, float:-1.7860666E-18)
            goto L_0x0022
        L_0x05bf:
            r1 = -652400678(0xffffffffd91d27da, float:-2.76471179E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r0 = r0.A01
            r2.invoke(r0)
            r0 = -940588388(0xffffffffc7efc29c, float:-122757.22)
            goto L_0x0022
        L_0x05d4:
            r1 = 160400075(0x98f82cb, float:3.4548995E-33)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.KGf r1 = (X.C61655KGf) r1
            X.K6f r1 = r1.A01
            java.lang.Object r0 = r0.A01
            X.LiW r0 = (X.C64811LiW) r0
            X.4sL r0 = r0.A01
            X.1Xj r0 = r0.A00
            java.lang.String r2 = r0.getId()
            if (r2 == 0) goto L_0x0691
            X.0eM r0 = r1.A04
            java.lang.Object r6 = r0.getValue()
            X.JhJ r6 = (X.C60200JhJ) r6
            java.util.List r0 = r6.A02
            java.util.Iterator r1 = r0.iterator()
        L_0x05fd:
            boolean r0 = r1.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x068a
            java.lang.Object r8 = r1.next()
            r0 = r8
            X.LiW r0 = (X.C64811LiW) r0
            X.4sL r0 = r0.A01
            X.1Xj r0 = r0.A00
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x068c
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05fd
        L_0x061b:
            X.LiW r8 = (X.C64811LiW) r8
            if (r8 == 0) goto L_0x0651
            int r1 = r8.A00
            r0 = -1
            java.util.List r7 = r6.A03
            if (r1 != r0) goto L_0x0656
            r7.add(r8)
            X.7Gd r3 = r6.A00
            com.instagram.common.typedurl.ImageUrl r0 = r8.A00()
            com.instagram.common.gallery.model.GalleryItem r2 = new com.instagram.common.gallery.model.GalleryItem
            r2.<init>((com.instagram.common.typedurl.ImageUrl) r0)
            r1 = 0
            X.9SZ r0 = new X.9SZ
            r0.<init>(r2, r1)
            r3.A8m(r0)
            int r0 = X.C51966G9m.A06(r7)
            r8.A00 = r0
        L_0x0643:
            X.6oS r2 = X.C318116oQ.A00(r6)
            r1 = 11
            X.MFR r0 = new X.MFR
            r0.<init>(r6, r4, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
        L_0x0651:
            r0 = -557624902(0xffffffffdec351ba, float:-7.0371174E18)
            goto L_0x1137
        L_0x0656:
            r7.remove(r8)
            r8.A00 = r0
            X.7Gd r2 = r6.A00
            com.instagram.common.typedurl.ImageUrl r1 = r8.A00()
            com.instagram.common.gallery.model.GalleryItem r0 = new com.instagram.common.gallery.model.GalleryItem
            r0.<init>((com.instagram.common.typedurl.ImageUrl) r1)
            r2.EDm(r0)
            r3 = 0
            java.util.Iterator r2 = r7.iterator()
        L_0x066e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0643
            java.lang.Object r1 = r2.next()
            int r0 = r3 + 1
            if (r3 >= 0) goto L_0x0684
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0684:
            X.LiW r1 = (X.C64811LiW) r1
            r1.A00 = r3
            r3 = r0
            goto L_0x066e
        L_0x068a:
            r8 = r4
            goto L_0x061b
        L_0x068c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0691:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0696:
            r1 = 2003190558(0x7766431e, float:4.6702718E33)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.LSk r6 = (X.LSk) r6
            java.lang.String r5 = "user"
            java.lang.String r4 = "trial_settings"
            java.lang.String r1 = "tap_learn_more"
            X.LSk.A03(r6, r5, r4, r1)
            java.lang.Object r7 = r0.A02
            X.K45 r7 = (X.K45) r7
            X.0eM r6 = r7.A02
            X.0lg r5 = X.DbT.A0X(r6)
            X.0Tu r4 = X.0Tu.A05
            r0 = 2342168244875899642(0x20810d9c000732fa, double:4.070025277659045E-152)
            boolean r0 = X.182.A06(r4, r5, r0)
            java.lang.String r5 = "https://help.instagram.com/1013292530224018"
            if (r0 == 0) goto L_0x06d7
            androidx.fragment.app.FragmentActivity r4 = r7.requireActivity()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.2EG r1 = X.2EG.A43
            java.lang.String r0 = r7.A01
            X.FH7.A08(r4, r3, r1, r5, r0)
        L_0x06d2:
            r0 = -634406360(0xffffffffda2fba28, float:-1.23657005E16)
            goto L_0x10fb
        L_0x06d7:
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r3)
            X.FH7.A03(r0, r5)
            goto L_0x06d2
        L_0x06df:
            r1 = -1239932254(0xffffffffb61822a2, float:-2.2669924E-6)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.LpZ r4 = (X.C65229LpZ) r4
            java.lang.Object r0 = r0.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            r0 = 0
            if (r1 == r0) goto L_0x0710
            r0 = 6
            if (r1 != r0) goto L_0x070b
            r3 = 2131973690(0x7f13563a, float:1.9584423E38)
            r1 = 2131973689(0x7f135639, float:1.958442E38)
        L_0x06fc:
            X.4DH r0 = r4.A0I
            X.8ab r0 = X.DbW.A0U(r0)
            r0.A09(r3)
            r0.A08(r1)
            X.Dba.A1L(r0)
        L_0x070b:
            r0 = -1183289187(0xffffffffb978709d, float:-2.3693075E-4)
            goto L_0x10fb
        L_0x0710:
            r3 = 2131973688(0x7f135638, float:1.9584419E38)
            r1 = 2131973687(0x7f135637, float:1.9584417E38)
            goto L_0x06fc
        L_0x0717:
            r1 = 1447441798(0x56463586, float:5.4483296E13)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A02
            X.LpZ r4 = (X.C65229LpZ) r4
            java.lang.Object r6 = r0.A01
            X.EZv r6 = (X.C48153EZv) r6
            java.lang.Integer r0 = X.AnonymousClass05K.A0e
            X.0xI r5 = X.C59882Jb5.A00(r0)
            X.4DH r0 = r4.A0I
            android.content.Context r1 = r0.requireContext()
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r3 = r4.A0J
            com.instagram.user.model.User r0 = r0.A01(r3)
            java.lang.String r1 = r6.A01(r1, r0)
            java.lang.String r0 = "name"
            r5.A0C(r0, r1)
            X.DbU.A1R(r5, r3)
            X.Lzr r1 = r4.A0M
            java.lang.String r0 = r6.A02
            r1.Cha(r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r4.A0B
            if (r1 == 0) goto L_0x0760
            X.KOP r0 = r4.A0K
            X.0Ud r0 = r0.A05
            java.lang.Object r0 = r0.getValue()
            X.Jur r0 = (X.C60995Jur) r0
            boolean r0 = r0.A03
            r1.setChecked(r0)
        L_0x0760:
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r4.A0B
            if (r0 == 0) goto L_0x076d
            boolean r1 = r0.isChecked()
            X.MXh r0 = r4.A0L
            r0.E0Y(r1)
        L_0x076d:
            r0 = -777258638(0xffffffffd1abf972, float:-9.2328051E10)
            goto L_0x10fb
        L_0x0772:
            r1 = -1338908054(0xffffffffb031e26a, float:-6.471398E-10)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.LpZ r1 = (X.C65229LpZ) r1
            X.MXh r5 = r1.A0L
            java.lang.Object r4 = r0.A01
            X.5nZ r4 = (X.C295095nZ) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0794
            java.lang.String r3 = r4.A04
        L_0x0789:
            r1 = 0
            java.lang.String r0 = "share_sheet_toggle"
            r5.EuY(r4, r3, r0, r1)
            r0 = 1112451977(0x424eab89, float:51.667515)
            goto L_0x10fb
        L_0x0794:
            X.4DH r0 = r1.A0I
            r0.requireContext()
            X.5w9 r0 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r0 = r1.A0J
            X.AnonymousClass5w9.A00(r0)
            r3 = 0
            goto L_0x0789
        L_0x07a2:
            r1 = -789812538(0xffffffffd0ec6ac6, float:-3.17313638E10)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.LpW r6 = (X.C65226LpW) r6
            X.KOh r3 = r6.A05
            X.0Ud r1 = r3.A06
            java.lang.Object r1 = r1.getValue()
            X.KO6 r1 = (X.KO6) r1
            boolean r1 = r1.A04
            if (r1 == 0) goto L_0x07c3
            X.C65226LpW.A01(r6)
            r0 = -1906413012(0xffffffff8e5e722c, float:-2.7418584E-30)
            goto L_0x10fb
        L_0x07c3:
            X.KHY r5 = r6.A01
            java.lang.String r4 = "spinsOption"
            if (r5 == 0) goto L_0x082f
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r5.A08
            if (r1 == 0) goto L_0x080c
            boolean r1 = r1.isChecked()
        L_0x07d1:
            if (r1 == 0) goto L_0x0800
            com.instagram.common.session.UserSession r8 = r6.A04
            X.4DH r1 = r6.A02
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            java.lang.Object r9 = r0.A01
            X.0sa r9 = (X.C62320sa) r9
            r0 = 16
            X.MMf r10 = X.C66296MMf.A00(r6, r0)
            r0 = 17
            X.MMf r11 = X.C66296MMf.A00(r6, r0)
            r0 = 64
            X.Imy r12 = new X.Imy
            r12.<init>(r3, r0)
            r0 = 6
            X.MIX r13 = new X.MIX
            r13.<init>(r3, r0)
            X.C55366HgY.A00(r7, r8, r9, r10, r11, r12, r13)
        L_0x07fb:
            r0 = 198836138(0xbd9ffaa, float:8.397004E-32)
            goto L_0x10fb
        L_0x0800:
            X.KHY r0 = r6.A01
            if (r0 == 0) goto L_0x082f
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r0.A08
            if (r0 == 0) goto L_0x07fb
            r0.performClick()
            goto L_0x07fb
        L_0x080c:
            boolean r1 = r5.A0F
            goto L_0x07d1
        L_0x080f:
            r1 = 416295354(0x18d029ba, float:5.3808873E-24)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A02
            X.JcV r6 = (X.C59962JcV) r6
            X.0eM r4 = r6.A0i
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            X.Lkb r3 = new X.Lkb
            r3.<init>(r1)
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = r6.A0B
            if (r1 != 0) goto L_0x0837
            java.lang.String r4 = "filterViewContainer"
        L_0x082f:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0837:
            r0 = 1
            X.C59962JcV.A09(r2, r3, r1, r6, r0)
            X.82q r0 = r6.A0G
            if (r0 != 0) goto L_0x0842
            java.lang.String r4 = "creationCameraSession"
            goto L_0x082f
        L_0x0842:
            boolean r1 = r0.COf()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r1 == 0) goto L_0x0863
            if (r0 == 0) goto L_0x085e
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 0
            java.lang.String r0 = "FEED_LUX_CAROUSEL_TAP"
        L_0x085b:
            X.27r.A08(r2, r3, r0, r1)
        L_0x085e:
            r0 = -516605714(0xffffffffe13538ee, float:-2.0893518E20)
            goto L_0x1137
        L_0x0863:
            if (r0 == 0) goto L_0x085e
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 0
            java.lang.String r0 = "FEED_LUX_TAP"
            goto L_0x085b
        L_0x086b:
            r1 = -52651136(0xfffffffffcdc9b80, float:-9.163674E36)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.K5u r1 = (X.C61400K5u) r1
            X.80Q r1 = r1.A01
            X.JTS.A1P(r1)
            java.lang.Object r0 = r0.A01
            X.C51969G9p.A1M(r0)
            r0 = -407284315(0xffffffffe7b955a5, float:-1.7504353E24)
            goto L_0x1137
        L_0x0885:
            r1 = 880254766(0x34779f2e, float:2.3061577E-7)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.KHW r3 = (X.KHW) r3
            X.0eM r1 = r3.A09
            X.JiG r1 = X.JTT.A0P(r1)
            X.05G r2 = r1.A06
            X.KgY r1 = X.C62483KgY.CLOSE_FRIENDS_LIST
            r2.Epw(r1)
            com.instagram.common.session.UserSession r1 = r3.A03
            X.27r r3 = X.27p.A01(r1)
            java.lang.Object r0 = r0.A01
            X.Jtt r0 = (X.C60935Jtt) r0
            int r2 = r0.A00
            X.283 r0 = r3.A04
            X.JVj r1 = r0.A0C
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x08bc
            if (r1 == 0) goto L_0x08bc
            if (r2 != 0) goto L_0x08c1
            java.lang.String r0 = "CLOSE_FRIENDS_LIST_ADD_PEOPLE_ATTRIBUTION"
        L_0x08b9:
            r3.A1Q(r1, r0)
        L_0x08bc:
            r0 = 1298404368(0x4d641410, float:2.39157504E8)
            goto L_0x1137
        L_0x08c1:
            java.lang.String r0 = "CLOSE_FRIENDS_LIST_EDIT_ATTRIBUTION"
            goto L_0x08b9
        L_0x08c4:
            r1 = -1229242643(0xffffffffb6bb3eed, float:-5.58036E-6)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.JcV r5 = (X.C59962JcV) r5
            X.0eM r8 = r5.A0i
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r8)
            r6 = 0
            X.0Tu r1 = X.DbS.A0J(r7, r6)
            r3 = 36323113948359530(0x810bae00072b6a, double:3.0342217501581213E-306)
            boolean r1 = X.182.A06(r1, r7, r3)
            if (r1 == 0) goto L_0x0911
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            X.0xa r1 = X.AnonymousClass7TE.A0q(r1)
            java.lang.String r3 = "dismissed_feed_text_tool_badge"
            boolean r1 = r1.getBoolean(r3, r6)
            if (r1 != 0) goto L_0x0911
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r8)
            X.0xY r1 = X.AnonymousClass7TF.A0N(r1)
            X.DbW.A1L(r1, r3)
            java.lang.Object r1 = r0.A01
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            boolean r0 = r1 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r0 == 0) goto L_0x0911
            com.instagram.common.ui.base.IgSimpleImageView r1 = (com.instagram.common.ui.base.IgSimpleImageView) r1
            if (r1 == 0) goto L_0x0911
            r1.A05 = r6
            r1.invalidate()
        L_0x0911:
            X.80Q r0 = r5.A0I
            if (r0 == 0) goto L_0x091c
            X.JcW r0 = X.C59962JcV.A01(r5)
            r0.A05()
        L_0x091c:
            r0 = -816076975(0xffffffffcf5ba751, float:-3.68517555E9)
            goto L_0x10fb
        L_0x0921:
            r1 = -1553332373(0xffffffffa36a076b, float:-1.2686736E-17)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            X.Lkg r7 = (X.C64941Lkg) r7
            java.lang.Object r5 = r0.A01
            X.Jeb r5 = (X.C60060Jeb) r5
            X.Jez r0 = r5.A05
            int r8 = X.C66568MWw.A00(r0)
            r0 = 3
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            int r4 = r6.length
            r3 = 0
        L_0x093d:
            if (r3 >= r4) goto L_0x09a5
            r1 = r6[r3]
            int r0 = X.AE9.A00(r1)
            if (r0 != r8) goto L_0x0985
            r7.A00 = r1
            X.L96 r4 = r7.A02
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r4.A04
            if (r0 == 0) goto L_0x09a0
            X.C64002LIe.A01(r0, r1)
            java.lang.Integer r3 = r7.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.LGM r1 = r4.A02
            if (r1 == 0) goto L_0x099b
            if (r3 == r0) goto L_0x097a
            X.8Kg r0 = r4.A03
            if (r0 == 0) goto L_0x0991
            r1.A02(r0)
        L_0x0963:
            java.util.List r0 = r7.A03
            java.util.Iterator r3 = r0.iterator()
        L_0x0969:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0988
            java.lang.Object r1 = r3.next()
            X.Jeb r1 = (X.C60060Jeb) r1
            r0 = 0
            r1.setChecked(r0)
            goto L_0x0969
        L_0x097a:
            r1.A00()
            X.8Kg r0 = r4.A03
            if (r0 == 0) goto L_0x0996
            r0.EEp()
            goto L_0x0963
        L_0x0985:
            int r3 = r3 + 1
            goto L_0x093d
        L_0x0988:
            r0 = 1
            r5.setChecked(r0)
            r0 = 1713992148(0x662971d4, float:2.0004492E23)
            goto L_0x10fb
        L_0x0991:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0996:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x099b:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            throw r2
        L_0x09a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x09a5:
            r0 = 5
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>(r0)
            throw r2
        L_0x09b0:
            r1 = -2039969256(0xffffffff86688a18, float:-4.3735806E-35)
            int r4 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A02
            X.K6Y r5 = (X.K6Y) r5
            X.0vF r1 = X.K6Y.A0O
            X.7kB r1 = r5.A08
            if (r1 == 0) goto L_0x09f8
            java.util.HashMap r2 = r1.A06
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r2)
            java.lang.String r3 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.Object r1 = r1.get(r3)
            X.7vz r1 = (X.C346927vz) r1
            if (r1 == 0) goto L_0x09fc
            int r2 = r1.ordinal()
            r1 = 1
            if (r2 == r1) goto L_0x09ea
            r1 = 2
            if (r2 != r1) goto L_0x09e3
            java.lang.Object r0 = r0.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.W38.A01(r0)
        L_0x09e3:
            r0 = 211677445(0xc9df105, float:2.4334738E-31)
        L_0x09e6:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x09ea:
            java.lang.Object r2 = r0.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 4
            X.Lh4 r0 = new X.Lh4
            r0.<init>(r5, r1)
            X.JTP.A11(r2, r0, r3)
            goto L_0x09e3
        L_0x09f8:
            r0 = 1607960400(0x5fd78750, float:3.106094E19)
            goto L_0x09e6
        L_0x09fc:
            java.lang.String r0 = "STORAGE PermissionState not received in permission request"
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
            r0 = 1067940160(0x3fa77940, float:1.3083878)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0a09:
            r1 = -1120175875(0xffffffffbd3b78fd, float:-0.04576968)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.JoN r1 = (X.C60614JoN) r1
            X.LFA r4 = r1.A00
            if (r4 == 0) goto L_0x0a42
            java.lang.Object r5 = r0.A01
            X.JlX r5 = (X.C60439JlX) r5
            X.KHS r0 = r1.A01
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0a47
            X.LFA r6 = r5.A00
            if (r6 == 0) goto L_0x0a42
            X.MV6 r5 = r5.A04
            X.MWx r0 = r6.A02
            com.instagram.music.common.model.MusicAssetModel r4 = com.instagram.music.common.model.MusicAssetModel.A02(r0)
            int r3 = r6.A01
            r1 = 90000(0x15f90, float:1.26117E-40)
            int r0 = r6.A00
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r1, r0)
            com.instagram.music.common.model.AudioOverlayTrack r0 = new com.instagram.music.common.model.AudioOverlayTrack
            r0.<init>(r4, r3, r1)
            r5.Cwt(r0)
        L_0x0a42:
            r0 = 849406021(0x32a0e845, float:1.8732075E-8)
            goto L_0x10fb
        L_0x0a47:
            X.89i r9 = r5.A02
            X.27r r14 = r5.A03
            X.MWx r3 = r4.A02
            java.lang.String r13 = r5.A05
            if (r9 != 0) goto L_0x0ad1
            X.0wc r1 = r14.A01
            java.lang.String r0 = "ig_camera_music_browse_song_select"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0ac7
            X.283 r7 = r14.A04
            java.lang.String r1 = r7.A0L
            if (r1 == 0) goto L_0x0b7f
            X.C66569MWx.A03(r6, r3)
            java.lang.String r0 = "browse_session_id"
            r6.AAJ(r0, r13)
            X.AnonymousClass7TH.A0W(r6, r14)
            X.JTO.A1S(r6, r1)
            X.JTQ.A12(r6, r14)
            java.lang.String r1 = "suggested_audio_sound_sync"
            java.lang.String r0 = "category"
            r6.AAJ(r0, r1)
            r8 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r6, r0, r8)
            X.AnonymousClass7TH.A0U(r6)
            java.lang.String r1 = r3.getTitle()
            java.lang.String r0 = "song_name"
            X.C66569MWx.A04(r6, r3, r0, r1)
            java.lang.String r0 = r3.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "audio_asset_id"
            r6.A9F(r0, r1)
            X.C66569MWx.A01(r6, r3)
            int r0 = r7.A01
            if (r0 == r8) goto L_0x0aa4
            r8 = 1
        L_0x0aa4:
            java.lang.String r0 = "camera_position"
            X.AnonymousClass7TE.A1W(r6, r0, r8)
            X.JTS.A16(r6)
            X.AnonymousClass7TE.A1V(r6, r7)
            X.C66569MWx.A02(r6, r3)
            X.28t r0 = X.28t.A02
            X.JTO.A1P(r0, r6)
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.CLIPS_CAMERA_FORMAT_V2
            X.JTR.A1J(r6, r0)
            X.JVj r0 = r7.A0C
            X.C51965G9l.A1A(r0, r6)
            X.DbY.A1C(r6)
        L_0x0ac4:
            r6.Cgf()
        L_0x0ac7:
            X.MV6 r0 = r5.A04
            r0.Dp5(r3)
            X.C60439JlX.A00(r5, r4)
            goto L_0x0a42
        L_0x0ad1:
            java.util.List r0 = r5.A06
            int r0 = r0.indexOf(r4)
            int r16 = r0 + 1
            r11 = 0
            java.lang.String r15 = "2282005535164995"
            java.lang.String r7 = "For you"
            java.lang.String r8 = "preview"
            r12 = 2
            X.0qQ.A0B(r7, r12)
            X.0wc r1 = r14.A01
            java.lang.String r0 = "ig_camera_music_browse_song_select"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0ac7
            X.283 r10 = r14.A04
            java.lang.String r1 = r10.A0L
            if (r1 == 0) goto L_0x0b7f
            X.C66569MWx.A03(r6, r3)
            java.lang.String r0 = "browse_session_id"
            r6.AAJ(r0, r13)
            X.AnonymousClass7TH.A0W(r6, r14)
            X.JTO.A1S(r6, r1)
            X.JTQ.A12(r6, r14)
            java.lang.String r0 = "category"
            r6.AAJ(r0, r11)
            r11 = 2
            java.lang.String r0 = "event_type"
            X.AnonymousClass7TE.A1W(r6, r0, r12)
            X.AnonymousClass7TH.A0U(r6)
            java.lang.String r1 = r3.getTitle()
            java.lang.String r0 = "song_name"
            X.C66569MWx.A04(r6, r3, r0, r1)
            java.lang.String r0 = r3.getId()
            java.lang.Long r1 = X.DbV.A0q(r0)
            java.lang.String r0 = "audio_asset_id"
            r6.A9F(r0, r1)
            X.C66569MWx.A01(r6, r3)
            int r0 = r10.A01
            if (r0 == r12) goto L_0x0b35
            r11 = 1
        L_0x0b35:
            java.lang.String r0 = "camera_position"
            X.AnonymousClass7TE.A1W(r6, r0, r11)
            X.JTS.A16(r6)
            X.AnonymousClass7TE.A1V(r6, r10)
            X.C66569MWx.A02(r6, r3)
            X.28t r0 = X.28t.A02
            X.JTO.A1P(r0, r6)
            com.instagram.api.schemas.MusicProduct r0 = com.instagram.api.schemas.MusicProduct.MUSIC_IN_FEED
            X.JTR.A1J(r6, r0)
            X.JVj r0 = r10.A0C
            X.C51965G9l.A1A(r0, r6)
            X.8xY r1 = X.C371088xY.POST_CAPTURE_AUDIO_BAR
            java.lang.String r0 = "surface_element"
            r6.A8M(r1, r0)
            X.DbY.A1C(r6)
            java.lang.String r0 = "music_browser_entry_point"
            r6.A8M(r9, r0)
            java.lang.Long r1 = X.DbS.A0j(r16)
            java.lang.String r0 = "audio_index"
            r6.A9F(r0, r1)
            java.lang.String r0 = "audio_browser_surface"
            r6.AAJ(r0, r8)
            java.lang.String r0 = "section_name"
            r6.AAJ(r0, r7)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r15)
            java.lang.String r0 = "section_id"
            r6.A9F(r0, r1)
            goto L_0x0ac4
        L_0x0b7f:
            java.lang.String r1 = "IgCameraLoggerImpl"
            java.lang.String r0 = "logMusicSelectTrack() mCameraSession null"
            X.0kD.A01(r1, r0)
            goto L_0x0ac7
        L_0x0b88:
            r1 = 1338410267(0x4fc6851b, float:6.6612239E9)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.K5H r3 = (X.K5H) r3
            java.lang.Object r5 = r0.A02
            com.instagram.model.venue.Venue r5 = (com.instagram.model.venue.Venue) r5
            X.3Ar r0 = r3.A0G
            if (r0 == 0) goto L_0x0c13
            X.LET r4 = r3.A0D
            java.lang.String r1 = r5.A02()
            X.K9J r0 = r3.A0E
            java.util.List r0 = r0.A03
            java.util.List r0 = X.C51966G9m.A1J(r0)
            r4.A02(r1, r0)
            java.lang.Integer r1 = r3.A0K
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0c45
            com.instagram.common.session.UserSession r0 = r3.A0B
            X.L4H r0 = X.C63209KtG.A00(r0)
            X.1QP r1 = r0.A01
            long r6 = r0.A00
            java.lang.String r0 = "ADD_LOCATION_SAVED"
            r1.flowMarkPoint(r6, r0)
        L_0x0bc1:
            com.instagram.common.session.UserSession r0 = r3.A0B
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r0)
            boolean r0 = r3.A0S
            if (r0 == 0) goto L_0x0c42
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
        L_0x0bcd:
            X.3St r0 = new X.3St
            r0.<init>(r5, r1)
            r4.A00(r0)
            java.lang.String r8 = r3.A0L
            if (r8 == 0) goto L_0x0c18
            androidx.fragment.app.FragmentActivity r7 = r3.requireActivity()
            androidx.fragment.app.FragmentActivity r6 = r3.requireActivity()
            com.instagram.common.session.UserSession r4 = r3.A0B
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.JfT r0 = new X.JfT
            r0.<init>(r1, r6, r4, r8)
            X.2YN r1 = X.JTO.A0L(r0, r7)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel.class
            X.2YL r4 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r4 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel) r4
            X.JXe r1 = new X.JXe
            r1.<init>()
            com.instagram.model.venue.LocationDictIntf r0 = r5.A00
            com.instagram.model.venue.LocationDict r0 = r0.FG5()
            X.JXc r0 = X.C59764JXc.A00(r0)
            r1.A0X = r0
            r4.A06(r1)
        L_0x0c0c:
            boolean r0 = r3.A0P
            if (r0 == 0) goto L_0x0c13
            X.DbT.A1J(r3)
        L_0x0c13:
            r0 = -896644178(0xffffffffca8e4bae, float:-4662743.0)
            goto L_0x10fb
        L_0x0c18:
            boolean r0 = r3.A0S
            if (r0 == 0) goto L_0x0c33
            java.lang.String r0 = "NearbyVenuesFragment.VENUE_SELECTED"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r0 = 4185(0x1059, float:5.864E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putExtra(r0, r5)
            X.DbX.A17(r1, r3)
            X.DbT.A1K(r3)
            goto L_0x0c0c
        L_0x0c33:
            X.Lfa r1 = new X.Lfa
            r1.<init>(r5)
            com.instagram.common.session.UserSession r0 = r3.A0B
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r0)
            r0.A00(r1)
            goto L_0x0c0c
        L_0x0c42:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x0bcd
        L_0x0c45:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0bc1
            com.instagram.common.session.UserSession r0 = r3.A0B
            X.AE4 r1 = X.C59847JaN.A00(r0)
            java.lang.String r0 = "LOCATION_SAVED"
            r1.A04(r0)
            goto L_0x0bc1
        L_0x0c56:
            r1 = 102440415(0x61b1ddf, float:2.9174206E-35)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.KGe r1 = (X.C61654KGe) r1
            X.L13 r1 = r1.A01
            if (r1 == 0) goto L_0x0c92
            java.lang.Object r0 = r0.A01
            X.Lhf r0 = (X.C64763Lhf) r0
            com.instagram.model.reels.Reel r0 = r0.A00
            java.lang.String r4 = X.JTP.A0r(r0)
            X.LpE r3 = r1.A00
            X.4DH r1 = r3.A02
            X.0hq r0 = r1.getParentFragmentManager()
            boolean r0 = X.AnonymousClass06S.A01(r0)
            if (r0 == 0) goto L_0x0c80
            X.Dbb.A0z(r1)
        L_0x0c80:
            X.KHT r1 = r3.A00
            r0 = 0
            if (r1 != 0) goto L_0x0c8f
            java.lang.String r0 = "row"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c8f:
            r1.A01(r4, r0)
        L_0x0c92:
            r0 = -199135258(0xfffffffff4216fe6, float:-5.116146E31)
            goto L_0x10fb
        L_0x0c97:
            r1 = -1737104580(0xffffffff9875e33c, float:-3.1780232E-24)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.L0h r1 = (X.C63619L0h) r1
            java.lang.Object r0 = r0.A02
            X.3kE r0 = (X.C249703kE) r0
            int r3 = r0.getLayoutPosition()
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = r1.A00
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.LFX r0 = r1.A0F
            if (r0 == 0) goto L_0x0cb5
            r0.A01(r3)
        L_0x0cb5:
            r0 = -252932915(0xfffffffff0ec8ccd, float:-5.8566944E29)
            goto L_0x10fb
        L_0x0cba:
            r1 = 1925020829(0x72bd7c9d, float:7.5063443E30)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.L0g r1 = (X.C63618L0g) r1
            java.lang.Object r0 = r0.A02
            X.3kE r0 = (X.C249703kE) r0
            int r3 = r0.getLayoutPosition()
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = r1.A00
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.LFX r0 = r1.A0F
            if (r0 == 0) goto L_0x0cd8
            r0.A01(r3)
        L_0x0cd8:
            r0 = 774557721(0x2e2ad019, float:3.8838353E-11)
            goto L_0x10fb
        L_0x0cdd:
            java.lang.Object r2 = r0.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            java.lang.Object r7 = r0.A02
            X.8Cg r7 = (X.AnonymousClass8Cg) r7
            android.content.Context r3 = r2.requireContext()
            com.instagram.common.session.UserSession r6 = r2.getSession()
            java.lang.String r8 = "edit_media_info"
            java.lang.String r1 = r2.A0R
            r1.getClass()
            java.lang.String r0 = "_"
            java.lang.String[] r1 = r1.split(r0)
            r0 = 0
            r9 = r1[r0]
            com.instagram.api.schemas.MediaGenAIDetectionMethod r5 = r2.A06
            X.9OT r4 = X.AnonymousClass9OT.POST
            X.C250563lf.A0P(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0d05:
            r1 = -1786925839(0xffffffff957dacf1, float:-5.122937E-26)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.creation.fragment.AlbumEditFragment r3 = (com.instagram.creation.fragment.AlbumEditFragment) r3
            X.JVf r1 = X.C60323JjS.A00(r3)
            java.lang.Object r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x0d28
            boolean r1 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r3)
            if (r1 == 0) goto L_0x0d28
            com.instagram.creation.fragment.AlbumEditFragment.A09(r3)
        L_0x0d23:
            r0 = 794287151(0x2f57dc2f, float:1.9632361E-10)
            goto L_0x1137
        L_0x0d28:
            X.0eM r1 = r3.A0f
            java.lang.Object r2 = r1.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            r1 = 0
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A07(r0, r1)
            goto L_0x0d23
        L_0x0d39:
            r1 = -313342265(0xffffffffed52c6c7, float:-4.07701E27)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.creation.fragment.AlbumEditFragment r3 = (com.instagram.creation.fragment.AlbumEditFragment) r3
            X.JVf r1 = X.C60323JjS.A00(r3)
            java.lang.Object r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x0d5c
            boolean r1 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r3)
            if (r1 == 0) goto L_0x0d5c
            com.instagram.creation.fragment.AlbumEditFragment.A0A(r3)
        L_0x0d57:
            r0 = -133678770(0xfffffffff808394e, float:-1.1051791E34)
            goto L_0x1137
        L_0x0d5c:
            X.0eM r1 = r3.A0f
            java.lang.Object r2 = r1.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            r1 = 1
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A07(r0, r1)
            goto L_0x0d57
        L_0x0d6d:
            r1 = 2032057399(0x791ebc37, float:5.151252E34)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A02
            com.instagram.creation.fragment.AlbumEditFragment r7 = (com.instagram.creation.fragment.AlbumEditFragment) r7
            boolean r1 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r7)
            if (r1 == 0) goto L_0x0d90
            X.JVf r1 = X.C60323JjS.A00(r7)
            java.lang.Object r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r2 != r1) goto L_0x0d90
            com.instagram.creation.fragment.AlbumEditFragment.A09(r7)
        L_0x0d8b:
            r0 = -2046369423(0xffffffff8606e171, float:-2.5368227E-35)
            goto L_0x1137
        L_0x0d90:
            boolean r1 = r7.A0U
            r6 = 0
            if (r1 == 0) goto L_0x0db3
            X.JVf r1 = X.C60323JjS.A00(r7)
            java.lang.Object r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 != r1) goto L_0x0db3
            X.0eM r1 = r7.A0d
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36326541331806019(0x810ecc00003743, double:3.0363892412506464E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r2 = 1
            if (r1 != 0) goto L_0x0db4
        L_0x0db3:
            r2 = 0
        L_0x0db4:
            X.0eM r1 = r7.A0f
            java.lang.Object r1 = r1.getValue()
            X.JjS r1 = (X.C60323JjS) r1
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r1.A07(r0, r6)
            if (r2 == 0) goto L_0x0d8b
            X.LG9 r2 = r7.A0K
            if (r2 == 0) goto L_0x0d8b
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            r2.A02(r0, r1)
            goto L_0x0d8b
        L_0x0dd0:
            r1 = -1031836461(0xffffffffc27f6cd3, float:-63.856274)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            com.instagram.creation.fragment.AlbumEditFragment r3 = (com.instagram.creation.fragment.AlbumEditFragment) r3
            boolean r1 = com.instagram.creation.fragment.AlbumEditFragment.A0I(r3)
            if (r1 == 0) goto L_0x0df3
            X.JVf r1 = X.C60323JjS.A00(r3)
            java.lang.Object r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r2 != r1) goto L_0x0df3
            com.instagram.creation.fragment.AlbumEditFragment.A0A(r3)
        L_0x0dee:
            r0 = -1415917426(0xffffffffab9ad08e, float:-1.1000244E-12)
            goto L_0x1137
        L_0x0df3:
            r1 = 0
            r3.A0U = r1
            X.0eM r1 = r3.A0f
            java.lang.Object r2 = r1.getValue()
            X.JjS r2 = (X.C60323JjS) r2
            r1 = 1
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2.A07(r0, r1)
            goto L_0x0dee
        L_0x0e07:
            r1 = 753344133(0x2ce71e85, float:6.5688032E-12)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A01
            X.LBJ r7 = (X.LBJ) r7
            boolean r1 = r7.A0A
            r9 = 0
            com.instagram.common.session.UserSession r6 = r7.A03
            com.instagram.bloks.hosting.IgBloksScreenConfig r4 = X.DbS.A0N(r6)
            if (r1 == 0) goto L_0x0ee1
            java.lang.String r11 = "com.bloks.www.biig.bio.productedit"
            r4.A0R = r11
            android.content.Context r1 = r7.A00
            r8 = 719983200(0x2aea1260, float:4.15795E-13)
            X.L8s r3 = new X.L8s
            r3.<init>(r1)
            java.lang.Object r2 = r0.A02
            X.Ja7 r2 = (X.C59832Ja7) r2
            java.lang.String r1 = r2.A03
            java.util.Map r12 = r3.A02
            java.lang.String r0 = "name"
            r12.put(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "price"
            r12.put(r0, r1)
            java.lang.String r1 = r2.A05
            java.lang.String r0 = "metadata"
            r12.put(r0, r1)
            java.lang.String r1 = r2.A02
            java.util.Map r13 = r3.A03
            java.lang.String r0 = "currency_code"
            r13.put(r0, r1)
            X.KkS r10 = r7.A02
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "entrypoint"
            r13.put(r0, r1)
            java.lang.String r1 = r7.A08
            java.lang.String r0 = "media_igid"
            r13.put(r0, r1)
            boolean r0 = r7.A0B
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "load_remote_images"
            r13.put(r0, r1)
            r0 = 3
            X.JK3 r14 = new X.JK3
            r14.<init>(r2, r0)
            r1 = 1
            X.MBL r0 = new X.MBL
            r0.<init>(r1, r3, r14)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "callback"
            r12.put(r0, r1)
            r0 = 28
            X.MMQ r2 = X.MMQ.A00(r2, r0)
            r1 = 2
            X.MBL r0 = new X.MBL
            r0.<init>(r1, r3, r2)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "on_delete"
            r12.put(r0, r1)
            java.util.HashMap r0 = X.C359608dC.A01(r13)
            X.DiU r1 = X.C46649DiU.A06(r11, r0, r12)
            X.C46649DiU.A0B(r1, r8)
            r1.A03 = r9
            r1.A02 = r9
            r1.A04 = r9
            java.util.Map r0 = r3.A01
            r1.A0H(r0)
            android.content.Context r0 = r3.A00
            r1.A0D(r0, r4)
        L_0x0eb1:
            boolean r1 = r7.A09
            X.JbO r0 = X.JZM.A00(r6)
            if (r1 == 0) goto L_0x0ed7
            java.lang.String r1 = r7.A08
            X.0Aj r2 = X.C59899JbO.A01(r10, r0)
            java.lang.String r0 = "seller_click_edit_product"
            X.DbS.A1I(r2, r0)
            java.lang.String r0 = "post_igid"
            java.util.Map r1 = X.AnonymousClass7TF.A0w(r0, r1)
            java.lang.String r0 = "extra_data"
            r2.A9H(r0, r1)
        L_0x0ecf:
            r2.Cgf()
            r0 = 1037455356(0x3dd64ffc, float:0.104644746)
            goto L_0x1137
        L_0x0ed7:
            X.0Aj r2 = X.C59899JbO.A01(r10, r0)
            java.lang.String r0 = "seller_click_add_purchase_button"
            X.DbS.A1I(r2, r0)
            goto L_0x0ecf
        L_0x0ee1:
            r1 = 550(0x226, float:7.71E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r4.A0R = r1
            android.content.Context r1 = r7.A00
            X.LDg r3 = new X.LDg
            r3.<init>(r1)
            java.lang.Object r9 = r0.A02
            X.Ja7 r9 = (X.C59832Ja7) r9
            java.lang.String r1 = r9.A02
            java.util.Map r2 = r3.A02
            java.lang.String r0 = "currency_code"
            r2.put(r0, r1)
            java.lang.String r1 = r9.A03
            java.util.Map r8 = r3.A01
            r0 = 1460(0x5b4, float:2.046E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r8.put(r0, r1)
            java.lang.String r1 = r9.A04
            java.lang.String r0 = "initial_price"
            r8.put(r0, r1)
            java.lang.String r1 = r9.A05
            java.lang.String r0 = "initial_metadata"
            r8.put(r0, r1)
            r0 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "content_version"
            r2.put(r0, r1)
            boolean r0 = r7.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = 1919(0x77f, float:2.689E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.put(r0, r1)
            X.KkS r10 = r7.A02
            java.lang.String r1 = r10.A00
            java.lang.String r0 = "entrypoint"
            r2.put(r0, r1)
            r0 = 4
            X.JK3 r2 = new X.JK3
            r2.<init>(r9, r0)
            r1 = 0
            X.MBL r0 = new X.MBL
            r0.<init>(r1, r3, r2)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.lang.String r0 = "callback"
            r8.put(r0, r1)
            r3.A00(r4)
            goto L_0x0eb1
        L_0x0f56:
            r1 = 1074500666(0x400b943a, float:2.180922)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.L0a r1 = (X.C63612L0a) r1
            if (r1 == 0) goto L_0x0f88
            java.lang.Object r0 = r0.A01
            X.JwK r0 = (X.C61082JwK) r0
            java.lang.Object r6 = r0.A00
            java.lang.Integer r6 = (java.lang.Integer) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserCategoriesViewController r0 = r1.A00
            X.Jj5 r5 = r0.A03
            java.lang.String r4 = X.LIJ.A01(r6)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.05G r1 = r5.A07
            X.JwF r0 = new X.JwF
            r0.<init>((java.lang.Integer) r3, (java.lang.String) r4)
            r1.Epw(r0)
            X.C60306Jj5.A00(r5, r6)
            r5.A00 = r6
        L_0x0f88:
            r0 = 307000970(0x124c768a, float:6.451716E-28)
            goto L_0x10fb
        L_0x0f8d:
            r1 = 157175720(0x95e4fa8, float:2.6759732E-33)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A02
            X.Jp6 r3 = (X.C60659Jp6) r3
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.JlJ r4 = r3.A04
            java.lang.Object r5 = r0.A01
            X.8Yu r5 = (X.C357588Yu) r5
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x0fbf
            if (r5 != 0) goto L_0x0fd7
            java.lang.Integer r0 = r4.A04
            int r3 = r0.intValue()
            r0 = 2
            if (r3 == r0) goto L_0x0fc7
            r1 = 1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            if (r3 == r1) goto L_0x0fc4
            X.05G r1 = r0.A0L
        L_0x0fb8:
            r0 = 0
            r1.Epw(r0)
        L_0x0fbc:
            r4.notifyDataSetChanged()
        L_0x0fbf:
            r0 = 1639013324(0x61b15bcc, float:4.0896105E20)
            goto L_0x10fb
        L_0x0fc4:
            X.05G r1 = r0.A0T
            goto L_0x0fb8
        L_0x0fc7:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r3 = r0.A0K
            X.05G r0 = r3.A0T
            r1 = 0
            r0.Epw(r1)
            X.05G r0 = r3.A0L
            r0.Epw(r1)
            goto L_0x0fbc
        L_0x0fd7:
            X.0wc r0 = r4.A02
            X.1Ln r6 = X.1Ln.A08(r0)
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x1023
            X.4yP r0 = X.C279294yP.CLIPS
            r6.A0a(r0)
            java.lang.String r0 = "AUDIO_EFFECT"
            r6.A0r(r0)
            X.28D r0 = X.28D.A5J
            r6.A0b(r0)
            r3 = 2
            r6.A0W(r3)
            r6.A0U()
            java.lang.String r0 = r4.A05
            X.JTO.A1U(r6, r0)
            X.0iw r0 = r4.A01
            java.lang.String r0 = r0.getModuleName()
            r6.A0n(r0)
            int r1 = r5.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x1040
            r0 = 3
            if (r1 == r0) goto L_0x103d
            r0 = 1
            if (r1 == r0) goto L_0x103a
            r0 = 4
            if (r1 == r0) goto L_0x1037
            if (r1 != r3) goto L_0x1051
            java.lang.String r1 = "VOCALIST"
        L_0x101b:
            java.lang.String r0 = "audio_effect"
            r6.A0R(r0, r1)
            r6.Cgf()
        L_0x1023:
            java.lang.Integer r0 = r4.A04
            int r3 = r0.intValue()
            r0 = 2
            if (r3 == r0) goto L_0x1043
            r1 = 1
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            if (r3 != r1) goto L_0x104a
            r0.A0A(r5)
            goto L_0x0fbc
        L_0x1037:
            java.lang.String r1 = "ROBOT"
            goto L_0x101b
        L_0x103a:
            java.lang.String r1 = "GIANT"
            goto L_0x101b
        L_0x103d:
            java.lang.String r1 = "ANNOUNCER"
            goto L_0x101b
        L_0x1040:
            java.lang.String r1 = "HELIUM"
            goto L_0x101b
        L_0x1043:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A03
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A0K
            r0.A0A(r5)
        L_0x104a:
            X.05G r0 = r0.A0L
            r0.Epw(r5)
            goto L_0x0fbc
        L_0x1051:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x1056:
            r1 = -1355948625(0xffffffffaf2dddaf, float:-1.5813016E-10)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A02
            X.JlF r1 = (X.C60422JlF) r1
            X.0sL r1 = r1.A06
            X.0qQ.A0A(r3)
            java.lang.Object r0 = r0.A01
            X.Jzw r0 = (X.C61263Jzw) r0
            if (r0 == 0) goto L_0x1076
            X.KjH r0 = r0.A00
        L_0x106e:
            r1.invoke(r3, r0)
            r0 = 953308499(0x38d25553, float:1.0029473E-4)
            goto L_0x1137
        L_0x1076:
            r0 = 0
            goto L_0x106e
        L_0x1078:
            r1 = -1758518273(0xffffffff972f23ff, float:-5.6590983E-25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x108a
            java.lang.Object r0 = r0.A02
            r1.invoke(r0)
        L_0x108a:
            r0 = -1039499805(0xffffffffc20a7de3, float:-34.622936)
            goto L_0x10fb
        L_0x108e:
            r1 = 1716340577(0x664d4761, float:2.4235046E23)
            int r2 = A00(r0, r1)
            r0 = 240660781(0xe58312d, float:2.6647733E-30)
            goto L_0x10fb
        L_0x1099:
            r1 = -761851548(0xffffffffd2971164, float:-3.24415914E11)
            int r2 = A00(r0, r1)
            r0 = -1414150146(0xffffffffabb5c7fe, float:-1.2916333E-12)
            goto L_0x10fb
        L_0x10a4:
            r1 = 91432873(0x57327a9, float:1.14330895E-35)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x10b6
            java.lang.Object r0 = r0.A02
            r1.invoke(r0)
        L_0x10b6:
            r0 = -1414262085(0xffffffffabb412bb, float:-1.2794968E-12)
            goto L_0x10fb
        L_0x10ba:
            r1 = -1881493203(0xffffffff8fdab12d, float:-2.1564705E-29)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            if (r1 == 0) goto L_0x10cc
            java.lang.Object r0 = r0.A02
            r1.invoke(r0)
        L_0x10cc:
            r0 = -822263656(0xffffffffcefd4098, float:-2.12443443E9)
            goto L_0x10fb
        L_0x10d0:
            r1 = -1116961630(0xffffffffbd6c84a2, float:-0.057743676)
            int r2 = A00(r0, r1)
            r0 = 1548156649(0x5c46fee9, float:2.24049288E17)
            goto L_0x10fb
        L_0x10db:
            r1 = 1918939678(0x7260b21e, float:4.4505583E30)
            int r2 = A00(r0, r1)
            r0 = 1086272868(0x40bf3564, float:5.9752674)
            goto L_0x10fb
        L_0x10e6:
            r1 = -165153224(0xfffffffff627f638, float:-8.516675E32)
            int r2 = A00(r0, r1)
            r0 = -457273878(0xffffffffe4be8dea, float:-2.812086E22)
            goto L_0x10fb
        L_0x10f1:
            r1 = -1183593383(0xffffffffb973cc59, float:-2.3250411E-4)
            int r2 = A00(r0, r1)
            r0 = 2031313607(0x791362c7, float:4.7829443E34)
        L_0x10fb:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x10ff:
            r1 = 1805349134(0x6b9b710e, float:3.7583478E26)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle r4 = (com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle) r4
            java.lang.Object r3 = r0.A02
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            int r2 = r4.A00
            r1 = 10000(0x2710, float:1.4013E-41)
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r2 == r0) goto L_0x113b
            if (r2 != r1) goto L_0x111a
            r4.A00 = r0
        L_0x111a:
            com.instagram.creation.capture.quickcapture.sundial.widget.CountdownDurationToggle.A00(r4)
            int r2 = r4.A00
            X.0xY r1 = X.AnonymousClass7TF.A0N(r3)
            java.lang.String r0 = "clips_camera_countdown_duration_ms"
            r1.E5Z(r0, r2)
            r1.apply()
            X.8JF r1 = r4.A03
            if (r1 == 0) goto L_0x1134
            int r0 = r4.A00
            r1.D6P(r0)
        L_0x1134:
            r0 = 1206717656(0x47ed0cd8, float:121369.69)
        L_0x1137:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        L_0x113b:
            r4.A00 = r1
            goto L_0x111a
        L_0x113e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x1143:
            X.0qQ.A0F(r8)
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x114b:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 230247418(0xdb94bfa, float:1.1419796E-30)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x1156:
            X.K5H.A05(r6)
            return
        L_0x115a:
            java.lang.String r0 = "STORAGE PermissionState not received in permission request"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = -1780359018(0xffffffff95e1e096, float:-9.123111E-26)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r2
        L_0x1167:
            java.lang.String r0 = "buttonDebouncer"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYG.onClick(android.view.View):void");
    }

    public static int A00(LYG lyg, int i) {
        int A05 = AnonymousClass0fD.A05(i);
        0sP r1 = (0sP) lyg.A02;
        if (r1 != null) {
            r1.invoke(lyg.A01);
        }
        return A05;
    }

    public static void A03(View view, LYG lyg, C63715L3z l3z) {
        0qQ.A0A(view);
        View.OnClickListener onClickListener = (View.OnClickListener) lyg.A01;
        0qQ.A0B(view, 0);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - l3z.A00 >= 200 && !l3z.A01) {
            l3z.A00 = currentTimeMillis;
            onClickListener.onClick(view);
            view.performHapticFeedback(1);
        }
    }
}
