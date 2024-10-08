package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public final class E1U extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ClickableCategoryFragment";
    public 1Ln A00;
    public AnonymousClass2t9 A01;
    public String A02 = "";
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C51763G0f(this, 29));
    public final F1l A05 = new F1l(this);

    public final String getModuleName() {
        return "clickable_profile_category";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(view, R.id.recommeded_business_recylcer_view);
        View A0F = AnonymousClass7TF.A0F(view, R.id.clickable_categories_loading_spinner);
        View A0F2 = AnonymousClass7TF.A0F(view, R.id.clickable_categories_error_screen);
        recyclerView.setLayoutManager(linearLayoutManager);
        AnonymousClass2t9 r0 = this.A01;
        if (r0 == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(r0);
        FPC.A01(AnonymousClass7TF.A0G(view, R.id.action_bar_button_back), 31, this);
        AnonymousClass7TG.A0R(view, R.id.action_bar_title).setText(2131971417);
        1Ln r2 = this.A00;
        if (r2 != null) {
            r2.A0R("container_module", "clickable_profile_category");
            r2.A0R("entry_module", "recommended_user_impression");
            r2.A0R("target_id", this.A02);
            r2.Cgf();
        }
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66177MGo(A0F, viewLifecycleOwner, this, r6, A0F2, (AnonymousClass4D7) null, 0), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment, X.E1U, X.4DH] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-1643462141);
        E1U.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            C320236s2.A01(bundle2, "category_name");
            String string = requireArguments().getString("category_id");
            if (string != null) {
                String string2 = requireArguments().getString(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
                if (string2 != null) {
                    2YL A0H = DbS.A0H(this.A04);
                    Context requireContext = requireContext();
                    0gy A002 = AnonymousClass07i.A00(this);
                    AnonymousClass7TE.A1Z(new C73557Pf9(A002, A0H, requireContext, string2, string, (AnonymousClass4D7) null, 3), C318116oQ.A00(A0H));
                    AnonymousClass0eM r5 = this.A03;
                    this.A00 = new 1Ln(AnonymousClass7TE.A0e(DbX.A0P(this, r5), "clickable_category_impression"), 11);
                    this.A02 = string2;
                    this.A01 = DbU.A0U(DbV.A0S(this), new EHF(this, AnonymousClass7TE.A0l(r5), this.A05));
                    AnonymousClass0fD.A09(-1446671146, A022);
                    return;
                }
                illegalStateException = AnonymousClass7TE.A0z("User ID required");
                i = 328487499;
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Category ID required");
                i = 404031070;
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0y();
            i = 857177002;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1898947015);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.recommended_business_list, viewGroup, false);
        AnonymousClass0fD.A09(455167722, A022);
        return inflate;
    }
}
