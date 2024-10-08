package X;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.DeR  reason: case insensitive filesystem */
public final class C46404DeR implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C46463DfR A01;

    public C46404DeR(View view, C46463DfR dfR) {
        this.A01 = dfR;
        this.A00 = view;
    }

    public final void run() {
        C46463DfR dfR = this.A01;
        C46544Dgl dgl = C46544Dgl.TOOLTIP_HYPER_CARD;
        dfR.A01.put(dgl, new WeakReference(this.A00));
        dfR.A02.get(dgl);
    }
}
