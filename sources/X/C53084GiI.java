package X;

import androidx.recyclerview.widget.RecyclerView;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;

/* renamed from: X.GiI  reason: case insensitive filesystem */
public final class C53084GiI extends C231402rc {
    public final /* synthetic */ EffectsPageFragment A00;

    public C53084GiI(EffectsPageFragment effectsPageFragment) {
        this.A00 = effectsPageFragment;
    }

    public final void onChanged() {
        int childCount;
        C252553pI r1;
        C320416sL r0;
        EffectsPageFragment effectsPageFragment = this.A00;
        RecyclerView recyclerView = effectsPageFragment.mClipsRecyclerView;
        if (recyclerView != null && (childCount = recyclerView.getChildCount()) > 0 && childCount < 9 && (r1 = effectsPageFragment.mClipsRecyclerView.A0D) != null) {
            int A01 = C240113Jq.A01(r1);
            int A02 = C240113Jq.A02(r1);
            if (A01 == 0 && childCount - 1 == A02 && (r0 = effectsPageFragment.A06) != null) {
                ((C229132mt) r0).ACw();
            }
        }
    }
}
