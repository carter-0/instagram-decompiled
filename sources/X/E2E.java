package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class E2E extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "StoryHighlightsToReelsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final String A02 = "story_highlights_to_reels_fragment";

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        FPB.A02(DbV.A0K(), r3, this, 67);
        r3.Eom(2131974432);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C60413Jl6 jl6 = new C60413Jl6(requireActivity(), this, AnonymousClass7TE.A0l(this.A00));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 2);
        gridLayoutManager.A01 = new C60366JkE(jl6, 2);
        View requireViewById = view.requireViewById(R.id.recycler_view);
        RecyclerView recyclerView = (RecyclerView) requireViewById;
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(jl6);
        0qQ.A07(requireViewById);
        Dba.A16(getViewLifecycleOwner(), DbT.A0H(((C46736DkP) this.A01.getValue()).A01), new J6W(5, jl6, view, this), 49);
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public E2E() {
        C20703Wxa wxa = new C20703Wxa(this, 19);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20703Wxa(new C20703Wxa(this, 16), 17));
        this.A01 = DbS.A0I(new C20703Wxa(A002, 18), wxa, new C41566AwY(11, (Object) null, A002), DbS.A0z(C46736DkP.class));
        this.A00 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-832530684);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.story_highlights_to_reels_layout, false);
        AnonymousClass0fD.A09(1044676425, A022);
        return A0D;
    }
}
