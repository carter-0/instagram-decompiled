package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.WkQ  reason: case insensitive filesystem */
public final class C20066WkQ implements Runnable {
    public final /* synthetic */ C15286UZq A00;

    public C20066WkQ(C15286UZq uZq) {
        this.A00 = uZq;
    }

    public final void run() {
        C14074TpO tpO = this.A00.A06;
        if (tpO == null) {
            C13988Tno.A0n();
            throw AnonymousClass00P.createAndThrow();
        }
        DiscoveryRecyclerView discoveryRecyclerView = tpO.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.requestLayout();
        }
    }
}
