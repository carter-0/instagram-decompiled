package X;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.M6h  reason: case insensitive filesystem */
public final class C65970M6h implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K7Z A01;

    public C65970M6h(K7Z k7z, int i) {
        this.A01 = k7z;
        this.A00 = i;
    }

    public final void run() {
        K7Z k7z = this.A01;
        RecyclerView recyclerView = k7z.A00;
        if (recyclerView != null) {
            recyclerView.measure(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(0, 0));
            int i = this.A00;
            RecyclerView recyclerView2 = k7z.A00;
            if (recyclerView2 != null) {
                ValueAnimator A05 = JTQ.A05(i, recyclerView2.getMeasuredHeight());
                C64205LTv.A01(A05, k7z, 5);
                A05.start();
                return;
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
