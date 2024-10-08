package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;

public final class E7N extends MYR implements AnonymousClass4DS, C74380Ptv {
    public static final String __redex_internal_original_name = "FanClubRemovedMemberListFragment";
    public SpinnerImageView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final void DWd(User user) {
        Context A06 = DbT.A06(this, user, 0);
        C46498Dg1 A002 = C46498Dg1.A00(A06, this.A01);
        A002.A08(user.getUsername());
        A002.A04(new FPH(29, (Object) A06, (Object) this, (Object) user), 2131976283);
        C49945FFy.A00(this, A002);
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131976312);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbX.A0k(view);
        DbX.A1B(view, R.id.search_box);
        getRecyclerView().A15(new C3251871j(getRecyclerView().A0D, new C50436Fbj(this, 4), C3251771i.A0A, false, false));
        2YL A0H = DbS.A0H(this.A02);
        C318136oS A002 = C318116oQ.A00(A0H);
        MG8 mg8 = new MG8(A0H, (AnonymousClass4D7) null, 0);
        19B r1 = 19B.A00;
        1Eo.A05(r1, mg8, A002);
        07U r7 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r1, new MHE(viewLifecycleOwner, r7, this, (AnonymousClass4D7) null, 17), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new NOT(this, this, this, AnonymousClass7TE.A0l(this.A01)));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3S.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E7N() {
        C58176Ing ing = new C58176Ing(this, 3);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58176Ing(new C58176Ing(this, 0), 1));
        this.A02 = DbS.A0I(new C58176Ing(A002, 2), ing, new C58187Inr(14, A002, (Object) null), DbS.A0z(C60217Jha.class));
    }
}
