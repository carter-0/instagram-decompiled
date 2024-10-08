package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.GiK  reason: case insensitive filesystem */
public final class C53086GiK extends C231402rc implements C252243on {
    public ShimmerFrameLayout A00;
    public RecyclerView A01;
    public final C320516sV A02;
    public final C52998Ggp A03;
    public final AnonymousClass4DH A04;
    public final 2el A05;

    public C53086GiK(AnonymousClass4DH r2, 2el r3, C320516sV r4, C52998Ggp ggp) {
        0qQ.A0B(ggp, 1);
        this.A03 = ggp;
        this.A04 = r2;
        this.A02 = r4;
        this.A05 = r3;
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
        this.A00 = null;
        this.A01 = null;
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
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.videos_list_shimmer_container);
        RecyclerView A0I = DbT.A0I(view, R.id.videos_list);
        AnonymousClass4DH r5 = this.A04;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(r5.requireContext(), 3);
        C320516sV r4 = this.A02;
        C51971G9r.A14(gridLayoutManager, r4);
        A0I.setLayoutManager(gridLayoutManager);
        C51972G9s.A13(r5, A0I);
        A0I.setAdapter(r4.A0I);
        A0I.A15(new C3251871j(A0I.A0D, new ISY(this, 8), C3251771i.A06, true, false));
        this.A01 = A0I;
        this.A05.A08(this.A01, AnonymousClass3DZ.A00(r5), new AnonymousClass2eo[0]);
        r4.A04(9);
        ShimmerFrameLayout shimmerFrameLayout = this.A00;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.A02();
        }
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public final void onChanged() {
        int childCount;
        C252553pI r1;
        RecyclerView recyclerView = this.A01;
        if (recyclerView != null && 1 <= (childCount = recyclerView.getChildCount()) && childCount < 13) {
            RecyclerView recyclerView2 = this.A01;
            C252553pI r0 = null;
            if (recyclerView2 != null) {
                r1 = recyclerView2.A0D;
            } else {
                r1 = null;
            }
            int A012 = C240113Jq.A01(r1);
            RecyclerView recyclerView3 = this.A01;
            if (recyclerView3 != null) {
                r0 = recyclerView3.A0D;
            }
            int A022 = C240113Jq.A02(r0);
            if (A012 == 0 && childCount - 1 == A022) {
                C51972G9s.A19(this.A03.A03.A01);
            }
        }
    }

    public final void onCreate() {
        this.A02.A0I.registerAdapterDataObserver(this);
    }

    public final void onDestroy() {
        this.A02.A0I.unregisterAdapterDataObserver(this);
    }
}
