package com.instagram.debug.devoptions.vtd;

import X.0sP;
import X.AnonymousClass7TG;
import X.C231402rc;
import X.C249703kE;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;

public final class VtdRecyclerViewAdapterDataObserver extends C231402rc {
    public final 0sP attachToView;
    public final 0sP detachFromView;
    public final Set recyclers;

    public void onItemRangeInserted(int i, int i2) {
        View view;
        for (RecyclerView recyclerView : this.recyclers) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                C249703kE A0W = recyclerView.A0W(i4);
                if (!(A0W == null || (view = A0W.itemView) == null)) {
                    this.attachToView.invoke(view);
                }
            }
        }
    }

    public void onItemRangeRemoved(int i, int i2) {
        View view;
        for (RecyclerView recyclerView : this.recyclers) {
            int i3 = i + i2;
            for (int i4 = i; i4 < i3; i4++) {
                C249703kE A0W = recyclerView.A0W(i4);
                if (!(A0W == null || (view = A0W.itemView) == null)) {
                    this.detachFromView.invoke(view);
                }
            }
        }
    }

    public VtdRecyclerViewAdapterDataObserver(Set set, 0sP r2, 0sP r3) {
        AnonymousClass7TG.A1U(set, r2, r3);
        this.recyclers = set;
        this.attachToView = r2;
        this.detachFromView = r3;
    }
}
