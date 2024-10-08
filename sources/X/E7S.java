package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;
import java.util.Collection;

public final class E7S extends MYR implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CampfireMemberListFragment";
    public 0wc A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        String str = this.A02;
        if (str == null) {
            0qQ.A0F("hallPassName");
            throw AnonymousClass00P.createAndThrow();
        }
        r4.ErN(str);
        r4.Eu4(true);
        DbX.A1A(FP1.A00(this, 25), DbV.A0K(), r4);
        ActionButton ErD = r4.ErD(FP1.A00(this, 27), R.drawable.instagram_more_horizontal_pano_outline_24);
        ErD.setColorFilter(AnonymousClass37O.A00(AnonymousClass7TF.A03(ErD.getContext(), R.attr.igds_color_primary_icon)));
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_add_users_pano_outline_24;
        A0K.A03 = 2Yu.A0H(getContext(), R.attr.igds_color_primary_icon);
        A0K.A05 = 2131954676;
        A0K.A0G = FP1.A00(this, 28);
        r4.A8p(new AnonymousClass3Jb(A0K));
    }

    public final String getModuleName() {
        return "campfire_member_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r4 = this.A04;
        Dba.A15(getViewLifecycleOwner(), ((C46777Dl4) r4.getValue()).A00, new MPA(this, 1), 58);
        C46777Dl4 dl4 = (C46777Dl4) r4.getValue();
        String str = this.A01;
        if (str == null) {
            0qQ.A0F("hallPassId");
            throw AnonymousClass00P.createAndThrow();
        } else {
            dl4.A00(str);
        }
    }

    public final UserSession A0C() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public final void A0D(HallPassMemberViewModel hallPassMemberViewModel) {
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        FragmentActivity requireActivity = requireActivity();
        String id = hallPassMemberViewModel.A00.getId();
        0qQ.A0B(A0l, 0);
        C46474Dfc.A03(DbU.A0Q(requireActivity, A0l), A0l, C46447Df9.A02(), C46548Dgp.A01(A0l, id, "campfire_member_list", "campfire_member_list"));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(G3V.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public E7S() {
        C73662Phb phb = new C73662Phb(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMJ(new C73662Phb(this, 49), 0));
        this.A04 = DbS.A0I(new MMJ(A002, 1), phb, new C58185Inp(35, (Object) null, A002), DbS.A0z(C46777Dl4.class));
    }

    public static final void A00(E7S e7s) {
        C358248ab A0U = DbW.A0U(e7s);
        A0U.A04();
        A0U.A09(2131954707);
        A0U.A08(2131954706);
        A0U.A0Q(C50023FJi.A00(e7s, 67), C358278ae.RED, 2131964901);
        A0U.A03();
        DbT.A1V(A0U);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new EHB(requireContext(), this));
    }

    public final boolean onBackPressed() {
        DbT.A1K(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-512037909);
        E7S.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = C320236s2.A01(requireArguments, "hall_pass_id");
        this.A02 = C320236s2.A01(requireArguments, "hall_pass_name");
        requireArguments.getBoolean("should_show_add_story_button", false);
        this.A00 = AnonymousClass0kN.A01(this, AnonymousClass7TE.A0l(this.A05));
        AnonymousClass0fD.A09(1504964572, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1678339497);
        super.onResume();
        if (this.A03) {
            C46777Dl4 dl4 = (C46777Dl4) this.A04.getValue();
            String str = this.A01;
            if (str == null) {
                0qQ.A0F("hallPassId");
                throw AnonymousClass00P.createAndThrow();
            } else {
                dl4.A00(str);
                this.A03 = false;
            }
        }
        AnonymousClass0fD.A09(-1604263831, A022);
    }
}
