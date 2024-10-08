package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.Collection;

public final class E7T extends MYR implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "HallPassMemberListFragment";
    public 0wc A00;
    public IgTextView A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass07i A07;
    public 2dZ A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("hallPassName");
            throw AnonymousClass00P.createAndThrow();
        }
        r4.ErN(str);
        r4.Eu4(true);
        DbX.A1A(FP1.A00(this, 35), DbV.A0K(), r4);
        ActionButton ErD = r4.ErD(FP1.A00(this, 37), R.drawable.instagram_more_horizontal_pano_outline_24);
        ErD.setColorFilter(DbV.A06(ErD.getContext(), R.color.igds_primary_icon));
    }

    public final String getModuleName() {
        return "hall_pass_member_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ((IgdsInlineSearchBox) requireView().requireViewById(R.id.search_box)).A02 = new Fd1(this, 7);
        this.A01 = DbT.A0a(requireView(), R.id.followers_count);
        FP1.A01(AnonymousClass7TF.A0G(requireView(), R.id.add_people_button), 40, this);
        C3021461u r1 = (C3021461u) AnonymousClass7TF.A0F(requireView(), R.id.cta);
        r1.setVisibility(DbW.A01(this.A06 ? 1 : 0));
        r1.setPrimaryActionOnClickListener(FP1.A00(this, 38));
        AnonymousClass0eM r4 = this.A09;
        Dba.A15(getViewLifecycleOwner(), ((C46777Dl4) r4.getValue()).A00, new MPA(this, 4), 60);
        C46777Dl4 dl4 = (C46777Dl4) r4.getValue();
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("hallPassId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dl4.A00(str);
        }
    }

    public final UserSession A0C() {
        return AnonymousClass7TE.A0l(this.A0A);
    }

    public final void A0D(HallPassMemberViewModel hallPassMemberViewModel) {
        UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
        FragmentActivity requireActivity = requireActivity();
        String id = hallPassMemberViewModel.A00.getId();
        0qQ.A0B(A0l, 0);
        C46474Dfc.A03(DbU.A0Q(requireActivity, A0l), A0l, C46447Df9.A02(), C46548Dgp.A01(A0l, id, "hall_pass_member_list", "hall_pass_member_list"));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3W.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0A);
    }

    public E7T() {
        MMJ mmj = new MMJ(this, 6);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMJ(new MMJ(this, 7), 8));
        this.A09 = DbS.A0I(new MMJ(A002, 9), mmj, new C58185Inp(37, (Object) null, A002), DbS.A0z(C46777Dl4.class));
    }

    public static final void A00(E7T e7t) {
        C358248ab A0U = DbW.A0U(e7t);
        A0U.A04();
        A0U.A09(2131963270);
        A0U.A08(2131963268);
        A0U.A0Q(C50023FJi.A00(e7t, 68), C358278ae.RED, 2131964901);
        A0U.A03();
        DbT.A1V(A0U);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        return 0sr.A1P(new C232232tF[]{new EHH(requireContext(), this, AnonymousClass7TE.A0l(this.A0A), this), new Object()});
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.E7T, X.0iw, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1325621489);
        E7T.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = C320236s2.A01(requireArguments, "hall_pass_id");
        this.A03 = C320236s2.A01(requireArguments, "hall_pass_name");
        this.A06 = DbT.A1X(requireArguments, "should_show_add_story_button");
        this.A08 = 2dZ.A0t.A04(this);
        this.A00 = AnonymousClass0kN.A01(this, AnonymousClass7TE.A0l(this.A0A));
        this.A07 = AnonymousClass07i.A00(this);
        AnonymousClass0fD.A09(722090664, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1298081088);
        super.onResume();
        if (this.A04) {
            this.A04 = false;
            C46777Dl4 dl4 = (C46777Dl4) this.A09.getValue();
            String str = this.A02;
            if (str == null) {
                0qQ.A0F("hallPassId");
                throw AnonymousClass00P.createAndThrow();
            }
            dl4.A00(str);
        }
        AnonymousClass0fD.A09(-1009465299, A022);
    }
}
