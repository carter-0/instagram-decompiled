package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.E2g  reason: case insensitive filesystem */
public final class C47434E2g extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubSettingsRecommendationsFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C58176Ing(this, 25));
    public final AnonymousClass0eM A01 = DbS.A0I(new C58176Ing(this, 28), new C58176Ing(this, 26), new C58187Inr(21, this, (Object) null), DbS.A0z(C60166Jgl.class));
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58176Ing(this, 27));

    public final String getModuleName() {
        return "fan_club_settings_recommendations";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AnonymousClass0eM r3 = this.A02;
        F3F f3f = new F3F(requireActivity(), AnonymousClass7TE.A0l(r3));
        new C49877FBb(this, requireActivity(), AnonymousClass7TE.A0l(r3), f3f, DbS.A0t(this.A00), 32).A01(requireContext(), (C46401DeO) null, i, i2);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, X.E2g, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (AnonymousClass7TF.A1Z(this.A03)) {
            2YL A0H = DbS.A0H(this.A01);
            Dba.A1S(A0H, C318116oQ.A00(A0H), 25, AnonymousClass2o2.A02(AnonymousClass7TE.A0l(this.A02)));
        }
        AnonymousClass0eM r1 = this.A02;
        C60424JlH jlH = new C60424JlH(AnonymousClass7TE.A0l(r1));
        jlH.A00 = this;
        DbZ.A0F(view, R.id.product_settings_recycle_view).setAdapter(jlH);
        C273004lm A002 = C272994ll.A00(AnonymousClass7TE.A0l(r1));
        String A0t = DbS.A0t(this.A00);
        0qQ.A0B(A0t, 1);
        0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "ig_fan_club_settings_recommendations_full_screen_impression");
        DbS.A1O(A0e, "creator_management_settings");
        DbY.A1G(A0e, A002.A01.A06);
        A0e.AAJ("origin", A0t);
        A0e.Cgf();
        AnonymousClass0xx A0E = DbW.A0E(this);
        MH0 mh0 = new MH0((Object) jlH, (Object) this, (AnonymousClass4D7) null, 9);
        19B r12 = 19B.A00;
        1Eo.A05(r12, mh0, A0E);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r12, new MHE(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void configureActionBar(2da r2) {
        Dbb.A1I(r2);
        r2.Eom(2131962038);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1380565510);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_settings_layout, viewGroup, false);
        AnonymousClass0fD.A09(-451251995, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(338053213);
        super.onResume();
        2YL A0H = DbS.A0H(this.A01);
        Dba.A1S(A0H, C318116oQ.A00(A0H), 25, AnonymousClass2o2.A02(AnonymousClass7TE.A0l(this.A02)));
        AnonymousClass0fD.A09(-762315130, A022);
    }
}
