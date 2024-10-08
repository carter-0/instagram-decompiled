package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;

public final class EN2 extends C47480E4f {
    public static final String __redex_internal_original_name = "FanClubSettingsFragment";
    public C231002qi A00;
    public final AnonymousClass0eM A01 = DbS.A0I(new C58176Ing(this, 23), new C58176Ing(this, 24), new C58187Inr(20, this, (Object) null), DbS.A0z(C60273JiU.class));

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131976320);
    }

    public final String getModuleName() {
        return "UserPayFanclubSettingsFragment";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass0eM r3 = this.A0C;
        F3F f3f = new F3F(requireActivity(), AnonymousClass7TE.A0l(r3));
        new C49877FBb(this, requireActivity(), AnonymousClass7TE.A0l(r3), f3f, DbS.A0t(this.A05), 32).A01(requireContext(), (C46401DeO) null, i, i2);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A0C;
        Long A10 = AnonymousClass7TE.A10(AnonymousClass7TE.A0l(r4).A06);
        if (A10 != null) {
            C273004lm A002 = C272994ll.A00(AnonymousClass7TE.A0l(r4));
            String A0t = DbS.A0t(this.A05);
            0qQ.A0B(A0t, 2);
            0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "ig_creator_subscription_management_screen_impression");
            DbS.A1O(A0e, "creator_management_settings");
            A0e.A9F("creator_igid", A10);
            A0e.AAJ("origin", A0t);
            A0e.Cgf();
        }
        DbT.A16(requireContext(), view, 2Yu.A0C(requireContext()));
        2YL A0H = DbS.A0H(this.A01);
        C318136oS A003 = C318116oQ.A00(A0H);
        MG8 mg8 = new MG8(A0H, (AnonymousClass4D7) null, 6);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mg8, A003);
        1YN A004 = AnonymousClass2bO.A00();
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A19;
        AnonymousClass2bO.A00();
        C231002qi A012 = A004.A01(this, this, A0l, 2bV.A04(new C50735Fha(this, 2), new C50736Fhb(this, 3)), quickPromotionSlot);
        this.A00 = A012;
        A012.Dh3();
        07U r9 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r3, new MHE(viewLifecycleOwner, r9, this, (AnonymousClass4D7) null, 21), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(EN2 en2) {
        C309516Yo A0K = DbY.A0K(en2);
        FC8.A00();
        Context requireContext = en2.requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(en2.A0C);
        0qQ.A0B(A0l, 1);
        C46649DiU A04 = C46649DiU.A04("com.instagram.user_pay.fan_club.screens.creator_onboarding.creator_side_subscription_settings", DbY.A0m("tooltip", (Object) null));
        IgBloksScreenConfig A0N = DbS.A0N(A0l);
        DbS.A18(requireContext, A0N, 2131976318);
        Dba.A0w((Bundle) null, C49891FBs.A02(A0N, A04), A0K);
    }
}
