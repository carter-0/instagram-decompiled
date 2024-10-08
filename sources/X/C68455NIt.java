package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NIt  reason: case insensitive filesystem */
public final class C68455NIt extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CampaignListFragment";
    public AnonymousClass2t9 A00;
    public C62320sa A01 = new C73910Pll(this, 46);
    public C70936OSj A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "inbox_campaign_list_fragment";
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A03;
        C70936OSj oSj = new C70936OSj(this, AnonymousClass7TE.A0l(r3));
        this.A02 = oSj;
        C70936OSj.A00(oSj, "igd_campaign_list_impression", 0Yt.A0E());
        RecyclerView A0c = JTR.A0c(view, R.id.direct_inbox_campaign_recycler_view);
        AnonymousClass2tC A0S = DbV.A0S(this);
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        0qQ.A0B(A0l, 1);
        A0S.A01(new C68626NPw(this, A0l, new C70936OSj(this, A0l)));
        AnonymousClass2t9 A0U = DbU.A0U(A0S, new Object());
        this.A00 = A0U;
        A0c.setAdapter(A0U);
        DbU.A15(requireContext(), A0c, 1, false);
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHI(viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 13), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C68455NIt() {
        C73910Pll pll = new C73910Pll(this, 45);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73910Pll(new C73910Pll(this, 42), 43));
        this.A04 = DbS.A0I(new C73910Pll(A002, 44), pll, new C73916Plr(5, (Object) null, A002), DbS.A0z(C67728Mth.class));
        this.A03 = C227642jf.A02(this);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(requireContext().getString(2131964241));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1321374213);
        0qQ.A0B(layoutInflater, 0);
        C68455NIt.super.onCreateView(layoutInflater, viewGroup, bundle);
        2YL A0H = DbS.A0H(this.A04);
        C73565Pfm.A02(A0H, C318116oQ.A00(A0H), 19);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_list_layout, false);
        AnonymousClass0fD.A09(-163552025, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2033126617);
        super.onResume();
        if (AnonymousClass3HA.A00(requireContext())) {
            C317756nm.A05(requireActivity(), AnonymousClass7TE.A0l(this.A03), !C61290mR.A07());
        }
        AnonymousClass0fD.A09(1735285462, A022);
    }
}
