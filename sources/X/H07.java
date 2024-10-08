package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class H07 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorInspirationHubAccountsFragment";
    public RecyclerView A00;
    public C54227H3w A01;
    public SpinnerImageView A02;
    public C46434Dew A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new GW6(this, 19));
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final AnonymousClass0eM A0B;
    public final M0A A0C;
    public final C55917Hpe A0D;

    public final String getModuleName() {
        return "creator_inspiration_hub_accounts_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = DbX.A0k(view);
        RecyclerView A0I = DbT.A0I(view, R.id.list);
        this.A00 = A0I;
        if (A0I != null) {
            DbU.A15(getContext(), A0I, 1, false);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C54227H3w h3w = this.A01;
            if (h3w == null) {
                str = "adapter";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView.setAdapter(h3w);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            C46434Dew dew = this.A03;
            if (dew == null) {
                str = "paginationHelper";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView2.A15(dew);
        }
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(view2, viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 15), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public H07() {
        GW6 gw6 = new GW6(this, 26);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new GW6(new GW6(this, 23), 24));
        this.A0B = DbS.A0I(new GW6(A002, 25), gw6, new C73664Phd(6, A002, (Object) null), DbS.A0z(C53010Gh1.class));
        this.A06 = AnonymousClass1YB.A00(new GW6(this, 18));
        this.A08 = AnonymousClass1YB.A00(C58370Iqp.A00);
        this.A09 = AnonymousClass1YB.A00(new GW6(this, 22));
        this.A0D = new C55917Hpe(this);
        this.A0C = new M0A(this, 2);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.07Z, X.H07, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1322739066);
        H07.super.onCreate(bundle);
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        M0A m0a = this.A0C;
        AnonymousClass0eM r3 = this.A0A;
        this.A03 = new C46434Dew(this, AnonymousClass7TE.A0l(r3), m0a);
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        AnonymousClass0iw r6 = (AnonymousClass0iw) this.A07.getValue();
        C46434Dew dew = this.A03;
        if (dew != null) {
            this.A01 = new C54227H3w(requireContext, r6, A0l, this.A0D, dew);
            C46434Dew dew2 = this.A03;
            if (dew2 != null) {
                dew2.A02 = true;
                if (!AnonymousClass7TF.A1Z(this.A06)) {
                    ((C53010Gh1) this.A0B.getValue()).A00((String) null);
                }
                AnonymousClass0fD.A09(-466218629, A022);
                return;
            }
        }
        0qQ.A0F("paginationHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1696716217);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.creator_inspiration_hub_accounts_fragment, false);
        AnonymousClass0fD.A09(-1318005622, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1391542017);
        super.onDestroyView();
        this.A02 = null;
        this.A00 = null;
        AnonymousClass0fD.A09(-361812830, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1247147135);
        super.onResume();
        if (AnonymousClass7TF.A1Z(this.A06) && !this.A05) {
            this.A05 = true;
            ((C53010Gh1) this.A0B.getValue()).A00((String) null);
        }
        AnonymousClass0fD.A09(-355083281, A022);
    }
}
