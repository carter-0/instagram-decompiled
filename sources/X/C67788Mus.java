package X;

import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.Mus  reason: case insensitive filesystem */
public final class C67788Mus extends C349087zZ {
    public Scroller A00;

    public final void A07(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.A00 = new Scroller(recyclerView.getContext(), new DecelerateInterpolator());
        }
        super.A07(recyclerView);
    }

    public final int[] A08(int i, int i2) {
        Scroller scroller = this.A00;
        int i3 = i;
        int i4 = i2;
        if (scroller == null) {
            return super.A08(i, i2);
        }
        scroller.fling(0, 0, i3, i4, -1000, IgNetworkConsentStorage.MAX_ENTRIES, 0, 0);
        return new int[]{scroller.getFinalX(), scroller.getFinalY()};
    }
}
