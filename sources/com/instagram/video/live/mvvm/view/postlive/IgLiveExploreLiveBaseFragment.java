package com.instagram.video.live.mvvm.view.postlive;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0wW;
import X.AnonymousClass1Nd;
import X.AnonymousClass2t9;
import X.AnonymousClass4DH;
import X.C227642jf;
import X.C268594df;
import X.C273504mg;
import X.C60366JkE;
import X.C60459Jlr;
import X.C62260Kcu;
import X.C62261Kcv;
import X.C63686L2w;
import X.C64671Lfx;
import X.C66519MUx;
import X.DbS;
import X.DbY;
import X.DbZ;
import X.Dbb;
import X.JTP;
import X.LOO;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.lifecycleannotations.LifecycleUtil;
import com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager;

public abstract class IgLiveExploreLiveBaseFragment extends AnonymousClass4DH implements AnonymousClass0iw, C268594df, C273504mg {
    public C63686L2w A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final boolean A02 = true;
    public RecyclerView recyclerView;

    public final int AqL() {
        return -1;
    }

    public final float CMx() {
        return 0.6f;
    }

    public final float Cmb() {
        return 1.0f;
    }

    public final void DMt() {
    }

    public final void DMu(int i) {
    }

    public final boolean Erf() {
        return true;
    }

    public final boolean doNotDismissOnDraggingDown() {
        return true;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetClosed() {
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ boolean AB6() {
        return false;
    }

    public final /* synthetic */ boolean ANU() {
        return false;
    }

    public final View C4U() {
        return this.mView;
    }

    public final int C8P() {
        return 0;
    }

    public final boolean CPc() {
        return this.A02;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final boolean isScrolledToBottom() {
        RecyclerView recyclerView2 = this.recyclerView;
        boolean z = false;
        if (recyclerView2 != null && recyclerView2.canScrollVertically(1)) {
            z = true;
        }
        return !z;
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView2 = this.recyclerView;
        boolean z = false;
        if (recyclerView2 != null && JTP.A1Y(recyclerView2)) {
            z = true;
        }
        return !z;
    }

    public final int AhP(Context context) {
        return Dbb.A02(context);
    }

    public final /* synthetic */ float CoU() {
        return 0.6f;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C66519MUx mUx;
        int A022 = AnonymousClass0fD.A02(845230479);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_iglive_post_live, viewGroup, false);
        RecyclerView A0F = DbZ.A0F(inflate, R.id.recycler_view);
        this.recyclerView = A0F;
        FastScrollingGridLayoutManager fastScrollingGridLayoutManager = new FastScrollingGridLayoutManager(requireContext(), 2);
        int A012 = DbY.A01(requireContext());
        if (A0F != null) {
            A0F.setLayoutManager(fastScrollingGridLayoutManager);
        }
        if (this instanceof C62261Kcv) {
            mUx = ((C62261Kcv) this).A01;
        } else {
            mUx = ((C62260Kcu) this).A03;
        }
        if (mUx != null) {
            AnonymousClass2t9 BkO = mUx.BkO();
            if (A0F != null) {
                A0F.setAdapter(BkO);
            }
            fastScrollingGridLayoutManager.A01 = new C60366JkE(mUx, 7);
            if (A0F != null) {
                A0F.A11(new C60459Jlr(mUx, A012, 1));
            }
        }
        AnonymousClass0fD.A09(241661152, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(79482366);
        super.onDestroy();
        C63686L2w l2w = this.A00;
        if (l2w != null) {
            LOO loo = l2w.A00;
            AnonymousClass1Nd.A00(loo.A0G).A02(loo.A0F, C64671Lfx.class);
        }
        AnonymousClass0fD.A09(721433301, A022);
    }

    public void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1144914344);
        super.onDestroyView();
        LifecycleUtil.cleanupReferences(this);
        this.A00 = null;
        AnonymousClass0fD.A09(-100624689, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1217100203);
        IgLiveExploreLiveBaseFragment.super.onPause();
        AnonymousClass0fD.A09(-1290818822, A022);
    }

    public void onResume() {
        int A022 = AnonymousClass0fD.A02(-1962124633);
        super.onResume();
        AnonymousClass0fD.A09(-848784005, A022);
    }
}
