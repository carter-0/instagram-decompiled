package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.FanClubCategoryType;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.List;

public final class E7O extends MYR implements AnonymousClass4DS, C74380Ptv {
    public static final String __redex_internal_original_name = "FanClubMemberListCategoryFragment";
    public FanClubCategoryType A00;
    public C48178EaK A01;
    public SpinnerImageView A02;
    public String A03;
    public String A04;
    public List A05;
    public boolean A06;
    public IgdsBottomButtonLayout A07;
    public final AnonymousClass0eM A08 = C51798G2h.A00(this, 40);
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    public final /* synthetic */ void Cqk(FragmentActivity fragmentActivity, UserSession userSession, User user, String str) {
        C63092KrL.A00(fragmentActivity, userSession, user, str);
    }

    public final void DWd(User user) {
        0qQ.A0B(user, 0);
        String username = user.getUsername();
        C46498Dg1 A002 = C46498Dg1.A00(requireContext(), this.A0A);
        A002.A08(username);
        A002.A0A(DbU.A0m(this, 2131976309), new C50072FNn(user, this, username, 4));
        C49945FFy.A00(this, A002);
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        String str = this.A04;
        if (str == null) {
            0qQ.A0F("categoryName");
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbW.A1C(r2, str);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbX.A0k(view);
        if (C375479Ds.A01(AnonymousClass7TE.A0l(this.A0A))) {
            this.A07 = DbT.A0c(view, R.id.create_group_chat_button);
            A00(this);
        }
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(E7O e7o) {
        boolean isEmpty = e7o.A05.isEmpty();
        IgdsBottomButtonLayout igdsBottomButtonLayout = e7o.A07;
        if (isEmpty) {
            AnonymousClass7TH.A0R(igdsBottomButtonLayout);
        } else {
            AnonymousClass7TF.A16(igdsBottomButtonLayout);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = e7o.A07;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setPrimaryAction(DbV.A05(e7o).getString(2131957108), FP1.A00(e7o, 6));
            }
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout3 = e7o.A07;
        if (igdsBottomButtonLayout3 != null) {
            C48895Elv.A00(igdsBottomButtonLayout3, e7o.A06);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232222tE[]{new NOT(this, this, this, AnonymousClass7TE.A0l(this.A0A)), new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3P.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public E7O() {
        C51798G2h g2h = new C51798G2h(this, 44);
        C51798G2h g2h2 = new C51798G2h(this, 41);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new C51798G2h(g2h2, 42));
        this.A0B = DbS.A0I(new C51798G2h(A002, 43), g2h, new C58187Inr(12, A002, (Object) null), DbS.A0z(C47870EKq.class));
        this.A09 = AnonymousClass0eN.A00(r6, new C51679Fyf(this));
        this.A03 = "";
        this.A05 = AnonymousClass7TE.A1C();
        this.A01 = C47868EKo.A00;
        this.A0A = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(535619461);
        E7O.super.onCreate(bundle);
        this.A00 = (FanClubCategoryType) C320236s2.A00(requireArguments(), FanClubCategoryType.class, "fan_club_category_type");
        this.A04 = C320236s2.A01(requireArguments(), "fan_club_category_name");
        AnonymousClass0fD.A09(672478617, A022);
    }

    public final void onResume() {
        String str;
        int A022 = AnonymousClass0fD.A02(-1295608868);
        super.onResume();
        SpinnerImageView spinnerImageView = this.A02;
        if (spinnerImageView == null) {
            str = "spinner";
        } else {
            DbS.A1T(spinnerImageView);
            C47870EKq eKq = (C47870EKq) this.A0B.getValue();
            FanClubCategoryType fanClubCategoryType = this.A00;
            if (fanClubCategoryType == null) {
                str = "categoryType";
            } else {
                eKq.A03(fanClubCategoryType, true, true);
                AnonymousClass0fD.A09(1417339688, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
