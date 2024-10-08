package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.M8r  reason: case insensitive filesystem */
public final class C66032M8r implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ RecyclerView A01;
    public final /* synthetic */ C63877LAg A02;

    public C66032M8r(View view, RecyclerView recyclerView, C63877LAg lAg) {
        this.A02 = lAg;
        this.A00 = view;
        this.A01 = recyclerView;
    }

    public final void run() {
        C63877LAg lAg = this.A02;
        ((LFL) lAg.A04.getValue()).A01(this.A00, true);
        ((C63926LDj) lAg.A06.getValue()).A00(this.A01, lAg.A00);
    }
}
