package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.direct.ui.collections.DirectThreadDetailsCollectionRowViewModel;
import java.util.List;

/* renamed from: X.NId  reason: case insensitive filesystem */
public final class C68440NId extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ThreadDetailsCollectionsFragment";
    public RecyclerView A00;
    public O7E A01;
    public C67802Mv6 A02;
    public DirectThreadDetailsCollectionRowViewModel A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbT.A0I(view, R.id.collections_grid);
        O7E o7e = this.A01;
        if (o7e != null) {
            C67802Mv6 mv6 = new C67802Mv6(o7e);
            DirectThreadDetailsCollectionRowViewModel directThreadDetailsCollectionRowViewModel = this.A03;
            if (directThreadDetailsCollectionRowViewModel != null) {
                List list = directThreadDetailsCollectionRowViewModel.A01;
                0qQ.A0B(list, 0);
                DbW.A0z(mv6, list, mv6.A00);
                this.A02 = mv6;
                if (this.A00 == null) {
                    DbT.A1Q(0wj.A01, "ThreadDetailsCollectionsFragment - recycler view is null", 20134884);
                }
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(this.A02);
                        return;
                    }
                }
                0qQ.A0F("recyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A022 = AnonymousClass0fD.A02(1484051978);
        C68440NId.super.onCreate(bundle);
        if (requireArguments().getString("ThreadDetailsCollectionsFragment_threadId") != null) {
            DirectThreadDetailsCollectionRowViewModel directThreadDetailsCollectionRowViewModel = (DirectThreadDetailsCollectionRowViewModel) requireArguments().getParcelable("ThreadDetailsCollectionsFragment_collectionsViewModel");
            if (directThreadDetailsCollectionRowViewModel != null) {
                this.A03 = directThreadDetailsCollectionRowViewModel;
                this.A01 = new O7E(this);
                AnonymousClass0fD.A09(-1297890043, A022);
                return;
            }
            illegalArgumentException = AnonymousClass7TE.A0w("collections view model can't be null");
            i = -1358957864;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w("thread id can't be null");
            i = -1548312861;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1686821707);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_details_collections_fragment, false);
        AnonymousClass0fD.A09(905970812, A022);
        return A0D;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(173966548);
        super.onDestroy();
        this.A03 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-551871464, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-68617306);
        super.onDestroyView();
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            C66580MXl.A19();
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.setAdapter((2Rw) null);
        this.A02 = null;
        AnonymousClass0fD.A09(128032274, A022);
    }
}
