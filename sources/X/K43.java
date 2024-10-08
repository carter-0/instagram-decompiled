package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

public final class K43 extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "IgLiveSchedulingManagementFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(C66298MMh.A01(this, 8));
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return "ig_live_scheduling_management";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2dY.A01(LY5.A00(this, 64), DbX.A0I(requireView(), R.id.action_bar_container)).A0X(new C64464LcR(this, 8));
        L7L l7l = new L7L(requireContext(), AnonymousClass7TE.A0l(this.A00), new C63685L2v(this));
        View requireViewById = requireView().requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setAdapter(l7l.A01);
        DbU.A15(requireContext(), recyclerView, 1, false);
        AnonymousClass3AQ r0 = new AnonymousClass3AQ();
        r0.A00 = false;
        recyclerView.setItemAnimator(r0);
        0qQ.A07(requireViewById);
        View requireViewById2 = requireView().requireViewById(R.id.empty_state);
        IgdsEmptyState igdsEmptyState = (IgdsEmptyState) requireViewById2;
        igdsEmptyState.setAction(requireContext().getString(2131965339), LY5.A00(this, 66));
        0qQ.A07(requireViewById2);
        AnonymousClass0eM r4 = this.A02;
        C64321LZw.A00(getViewLifecycleOwner(), ((C60204JhN) r4.getValue()).A00, new C59104J6m(38, (Object) igdsEmptyState, (Object) l7l, (Object) recyclerView), 1);
        DbZ.A1C(this, MHB.A01(this, (AnonymousClass4D7) null, 11), ((C60204JhN) r4.getValue()).A04);
        C60204JhN jhN = (C60204JhN) r4.getValue();
        jhN.A05.Epw(jhN.A01.A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public K43() {
        C66298MMh A012 = C66298MMh.A01(this, 12);
        AnonymousClass0eM A002 = C66298MMh.A00(C66298MMh.A01(this, 9), 0eO.A02, 10);
        this.A02 = DbS.A0I(C66298MMh.A01(A002, 11), A012, new MJ6(0, (Object) null, A002), DbS.A0z(C60204JhN.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1272379596);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.live_scheduling_management_fragment, false);
        AnonymousClass0fD.A09(-1985520646, A022);
        return A0D;
    }
}
