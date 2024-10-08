package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.clips.audio.model.AudioPageAssetModel;
import com.instagram.common.session.UserSession;

/* renamed from: X.GiL  reason: case insensitive filesystem */
public final class C53087GiL extends C231402rc implements C252243on {
    public RecyclerView A00;
    public ShimmerFrameLayout A01;
    public final UserSession A02;
    public final C53044Ghc A03;
    public final C320516sV A04;
    public final AnonymousClass4DH A05;
    public final 2el A06;

    public C53087GiL(AnonymousClass4DH r2, UserSession userSession, 2el r4, C53044Ghc ghc, C320516sV r6) {
        0qQ.A0B(userSession, 4);
        this.A03 = ghc;
        this.A05 = r2;
        this.A04 = r6;
        this.A02 = userSession;
        this.A06 = r4;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final void onDestroyView() {
        this.A01 = null;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setAdapter((2Rw) null);
        }
        this.A00 = null;
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        this.A01 = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
        AnonymousClass4DH r2 = this.A05;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(r2.requireContext(), 3);
        C320516sV r3 = this.A04;
        C51971G9r.A14(gridLayoutManager, r3);
        RecyclerView A0I = DbT.A0I(view, R.id.videos_list);
        this.A00 = A0I;
        if (A0I != null) {
            A0I.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            C51972G9s.A13(r2, recyclerView);
        }
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(r3.A0I);
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            recyclerView3.A15(new C3251871j(gridLayoutManager, new ISY(this, 4), C3251771i.A06, true, false));
        }
        this.A06.A08(this.A00, AnonymousClass3DZ.A00(r2), new AnonymousClass2eo[0]);
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onChanged() {
        int childCount;
        C252553pI r0;
        C252553pI r02;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && 1 <= (childCount = recyclerView.getChildCount()) && childCount < 13) {
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null) {
                r0 = recyclerView2.A0D;
            } else {
                r0 = null;
            }
            int A012 = C240113Jq.A01(r0);
            RecyclerView recyclerView3 = this.A00;
            if (recyclerView3 != null) {
                r02 = recyclerView3.A0D;
            } else {
                r02 = null;
            }
            int A022 = C240113Jq.A02(r02);
            if (A012 == 0 && childCount - 1 == A022) {
                this.A03.A03((AudioPageAssetModel) null);
            }
        }
    }

    public final void onCreate() {
        this.A04.A0I.registerAdapterDataObserver(this);
    }

    public final void onDestroy() {
        this.A04.A0I.unregisterAdapterDataObserver(this);
    }
}
