package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.memberlist.viewmodel.FanClubMemberListViewModel;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.user.model.User;
import java.util.Collection;

public final class E7P extends MYR implements AnonymousClass4DS, C74380Ptv, C51872G5j {
    public static final String __redex_internal_original_name = "FanClubMemberListFragment";
    public final AnonymousClass0eM A00 = C51798G2h.A00(this, 45);
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final void DWd(User user) {
        Context A06 = DbT.A06(this, user, 0);
        String username = user.getUsername();
        C46498Dg1 A002 = C46498Dg1.A00(A06, this.A01);
        A002.A08(username);
        A002.A0A(AnonymousClass7TE.A16(requireContext(), 2131976309), new C64250LXc(A06, user, this, username, 1));
        new C49945FFy(A002).A05(requireContext());
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eom(2131976317);
        if (AnonymousClass7TE.A14(this.A00).equals("SETTINGS")) {
            r3.Eu4(true);
            return;
        }
        r3.EVS(true);
        Dbc.A0k(r3);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        FanClubMemberListViewModel fanClubMemberListViewModel = (FanClubMemberListViewModel) this.A02.getValue();
        AnonymousClass7TF.A1O(fanClubMemberListViewModel.A0D, true);
        C318136oS A002 = C318116oQ.A00(fanClubMemberListViewModel);
        C66182MGt mGt = new C66182MGt((Object) fanClubMemberListViewModel, (AnonymousClass4D7) null, 49);
        19B r3 = 19B.A00;
        1Eo.A05(r3, mGt, A002);
        1Eo.A05(r3, new C66181MGs(fanClubMemberListViewModel, (AnonymousClass4D7) null, 16), C318116oQ.A00(fanClubMemberListViewModel));
        View requireViewById = view2.requireViewById(R.id.empty_state_headline);
        IgdsEmptyState igdsEmptyState = (IgdsEmptyState) requireViewById;
        igdsEmptyState.EZe(R.drawable.instagram_users_outline_96, true);
        0qQ.A07(requireViewById);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.create_group_chat_button);
        07U r11 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r3, new C59703JUk((Object) A0G, (Object) this, (Object) viewLifecycleOwner, (Object) igdsEmptyState, (Object) r11, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r3, new MHE(viewLifecycleOwner2, r11, this, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(viewLifecycleOwner2));
        getRecyclerView().A15(new C3251871j(getRecyclerView().A0D, new C50436Fbj(this, 3), C3251771i.A0A, false, false));
        C46864Dmg.A00(getRecyclerView(), this, 7);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new NOT(this, this, this, AnonymousClass7TE.A0l(this.A01)), new Object(), new C47784EGv(this), new C47783EGu(this), new Object(), new C47782EGt(this)});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3Q.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public E7P() {
        C51798G2h g2h = new C51798G2h(this, 49);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51798G2h(new C51798G2h(this, 46), 47));
        this.A02 = DbS.A0I(new C51798G2h(A002, 48), g2h, new C58187Inr(13, A002, (Object) null), DbS.A0z(FanClubMemberListViewModel.class));
    }

    public static final void A00(E7P e7p) {
        InputMethodManager inputMethodManager;
        View currentFocus = e7p.requireActivity().getCurrentFocus();
        if (currentFocus != null) {
            Object systemService = e7p.requireContext().getSystemService("input_method");
            if ((systemService instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) systemService) != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }

    public final void D1J(FanClubCategoryType fanClubCategoryType, String str) {
        EW6 ew6;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("fan_club_category_type", fanClubCategoryType);
        A0a.putString("fan_club_category_name", str);
        String str2 = ((FanClubMemberListViewModel) this.A02.getValue()).A08;
        if (0qQ.A0K(str2, "PROFILE")) {
            ew6 = EW6.PROFILE_SUBSCRIPTION;
        } else {
            if (0qQ.A0K(str2, "SETTINGS")) {
                ew6 = EW6.PROFESSIONAL_HOME;
            }
            C309516Yo A0N = DbX.A0N(requireActivity(), this.A01);
            A0N.A0B(A0a, new E7O());
            A0N.A04();
        }
        A0a.putString("entrypoint", ew6.A00);
        C309516Yo A0N2 = DbX.A0N(requireActivity(), this.A01);
        A0N2.A0B(A0a, new E7O());
        A0N2.A04();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2014403045);
        E7P.super.onPause();
        A00(this);
        AnonymousClass0fD.A09(-1682506897, A022);
    }
}
