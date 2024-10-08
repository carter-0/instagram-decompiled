package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.io.Serializable;
import java.util.ArrayList;

public final class E6K extends AnonymousClass4DH implements C51885G6a {
    public static final String __redex_internal_original_name = "FollowListSortingOptionsFragment";
    public C51885G6a A00;
    public C48104EVw A01;
    public C46849DmR A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "follow_list_sorting_selection";
    }

    public final void Dln(C48104EVw eVw) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0P(this, this.A03), "follow_list_did_select_sorting_option");
        if (eVw != C48104EVw.DEFAULT) {
            A0e.AAJ("order", eVw.A00);
        }
        A0e.Cgf();
        C51885G6a g6a = this.A00;
        if (g6a != null) {
            g6a.Dln(eVw);
        }
        DbZ.A15(this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(650541067);
        E6K.super.onCreate(bundle);
        Serializable serializable = requireArguments().getSerializable("FollowListSortingOptionsFragment.SortingType");
        0qQ.A0C(serializable, "null cannot be cast to non-null type com.instagram.user.userlist.model.SortingType");
        this.A01 = (C48104EVw) serializable;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C48104EVw[] values = C48104EVw.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C48104EVw eVw = values[i];
            String A002 = C49188Eqt.A00(requireContext(), eVw);
            C48104EVw eVw2 = this.A01;
            if (eVw2 == null) {
                0qQ.A0F("sortingTypeSelected");
                throw AnonymousClass00P.createAndThrow();
            } else {
                A1C.add(new EyZ(eVw, A002, AnonymousClass7TF.A1W(eVw, eVw2)));
                i++;
            }
        }
        this.A02 = new C46849DmR(this, A1C);
        AnonymousClass0fD.A09(-654152053, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-124025906);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.follow_list_sorting_options_fragment, false);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0F(A0D, R.id.follow_list_sorting_options_recycler_view);
        DbY.A16(this, recyclerView);
        C46849DmR dmR = this.A02;
        if (dmR == null) {
            0qQ.A0F("followListSortingOptionsListAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter(dmR);
        AnonymousClass0fD.A09(1828178741, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(756779747);
        super.onResume();
        2eQ.A06(AnonymousClass7TF.A0G(requireView(), R.id.follow_list_sorting_options_fragment_title), 500);
        AnonymousClass0fD.A09(1081064923, A022);
    }
}
