package X;

import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.Wnj  reason: case insensitive filesystem */
public final class C20244Wnj implements Runnable {
    public final /* synthetic */ C15358UbA A00;
    public final /* synthetic */ C15936Ul3 A01;

    public C20244Wnj(C15358UbA ubA, C15936Ul3 ul3) {
        this.A00 = ubA;
        this.A01 = ul3;
    }

    public final void run() {
        String str;
        C15358UbA ubA = this.A00;
        if (ubA.mView != null) {
            String str2 = this.A01.A02;
            0qQ.A0A(str2);
            1Xj A02 = DbX.A0d(ubA.A0N).A02(str2);
            if (A02 != null) {
                C14074TpO tpO = ubA.A03;
                if (tpO == null) {
                    str = "grid";
                } else {
                    DiscoveryRecyclerView discoveryRecyclerView = tpO.A04;
                    if (discoveryRecyclerView != null) {
                        GWW gww = ubA.A04;
                        if (gww == null) {
                            str = "dataSource";
                        } else {
                            C296935qt A04 = gww.A01.A04(A02);
                            if (A04 != null) {
                                C14227TsA tsA = ubA.A02;
                                if (tsA == null) {
                                    str = "adapter";
                                } else {
                                    int AVI = tsA.AVI(A04);
                                    if (AVI != -1) {
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
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
