package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.WnO  reason: case insensitive filesystem */
public final class C20224WnO implements Runnable {
    public final /* synthetic */ C15937Ul4 A00;
    public final /* synthetic */ C15381Ube A01;

    public C20224WnO(C15937Ul4 ul4, C15381Ube ube) {
        this.A01 = ube;
        this.A00 = ul4;
    }

    public final void run() {
        1Xj A0U;
        C15381Ube ube = this.A01;
        if (ube.mView != null && (A0U = DbV.A0U(AnonymousClass7TE.A0l(ube.A0i), this.A00.A02)) != null) {
            C14074TpO tpO = ube.A07;
            String str = "grid";
            if (tpO != null) {
                if (tpO.A04 != null) {
                    HAI hai = ube.A08;
                    if (hai == null) {
                        str = "dataSource";
                    } else {
                        C296935qt A04 = HAI.A00(hai.A00, hai).A04(A0U);
                        if (A04 != null) {
                            C14227TsA tsA = ube.A06;
                            if (tsA == null) {
                                str = "adapter";
                            } else {
                                int AVI = tsA.AVI(A04);
                                if (AVI != -1) {
                                    C14074TpO tpO2 = ube.A07;
                                    if (tpO2 != null) {
                                        DiscoveryRecyclerView discoveryRecyclerView = tpO2.A04;
                                        if (discoveryRecyclerView != null) {
                                            discoveryRecyclerView.A0p(AVI);
                                            return;
                                        }
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
