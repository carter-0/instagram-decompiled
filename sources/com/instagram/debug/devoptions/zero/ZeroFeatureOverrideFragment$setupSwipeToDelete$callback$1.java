package com.instagram.debug.devoptions.zero;

import X.0qQ;
import X.C249703kE;
import X.U9W;
import androidx.recyclerview.widget.RecyclerView;

public final class ZeroFeatureOverrideFragment$setupSwipeToDelete$callback$1 extends U9W {
    public final /* synthetic */ ZeroFeatureOverrideFragment this$0;

    public boolean onMove(RecyclerView recyclerView, C249703kE r3, C249703kE r4) {
        return false;
    }

    public void onSwiped(C249703kE r3, int i) {
        0qQ.A0B(r3, 0);
        int absoluteAdapterPosition = r3.getAbsoluteAdapterPosition();
        this.this$0.getEnabledFeaturesStore().remove(absoluteAdapterPosition);
        this.this$0.getFeaturesAdapter().notifyItemRemoved(absoluteAdapterPosition);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZeroFeatureOverrideFragment$setupSwipeToDelete$callback$1(ZeroFeatureOverrideFragment zeroFeatureOverrideFragment) {
        super(0, 48);
        this.this$0 = zeroFeatureOverrideFragment;
    }
}
