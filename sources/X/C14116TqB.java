package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.TqB  reason: case insensitive filesystem */
public final class C14116TqB implements C231302rO {
    public final /* synthetic */ C14074TpO A00;

    public C14116TqB(C14074TpO tpO) {
        this.A00 = tpO;
    }

    public final void EZ4(int i) {
        C14074TpO tpO = this.A00;
        DiscoveryRecyclerView discoveryRecyclerView = tpO.A04;
        if (discoveryRecyclerView != null) {
            discoveryRecyclerView.setPadding(discoveryRecyclerView.getPaddingLeft(), i, discoveryRecyclerView.getPaddingRight(), discoveryRecyclerView.getPaddingBottom());
        }
        AnonymousClass3AD r0 = tpO.A07;
        if (r0 != null) {
            r0.Eou(i);
        }
    }
}
