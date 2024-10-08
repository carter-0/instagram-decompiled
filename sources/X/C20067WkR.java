package X;

import android.view.View;
import com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView;

/* renamed from: X.WkR  reason: case insensitive filesystem */
public final class C20067WkR implements Runnable {
    public final /* synthetic */ C15286UZq A00;

    public C20067WkR(C15286UZq uZq) {
        this.A00 = uZq;
    }

    public final void run() {
        int i;
        C15286UZq uZq = this.A00;
        if (uZq.mView != null) {
            String str = C13989Tnp.A0b(uZq).A00;
            C67757MuC A07 = uZq.A07();
            A07.A0C.A04(A07.A0F, A07.A0G, "");
            1Xj A0U = DbV.A0U(AnonymousClass7TE.A0l(uZq.A0m), str);
            if (A0U != null) {
                C14074TpO tpO = uZq.A06;
                String str2 = "grid";
                if (tpO != null) {
                    DiscoveryRecyclerView discoveryRecyclerView = tpO.A04;
                    if (discoveryRecyclerView != null) {
                        C15940UlA ulA = uZq.A0F;
                        if (ulA == null) {
                            str2 = "dataSource";
                        } else {
                            C296965qw A072 = ulA.A07(A0U);
                            if (A072 != null) {
                                C14074TpO tpO2 = uZq.A06;
                                if (tpO2 != null) {
                                    int AVI = tpO2.A0E.AVI(A072);
                                    if (AVI != -1) {
                                        int height = discoveryRecyclerView.getHeight() / 2;
                                        C252553pI r1 = discoveryRecyclerView.A0D;
                                        if (r1 != null) {
                                            View A1D = r1.A1D(AVI);
                                            if (A1D != null) {
                                                i = A1D.getHeight() / 2;
                                            } else {
                                                i = 0;
                                            }
                                            C240113Jq.A05(r1, AVI, i - height);
                                            return;
                                        }
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
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }
}
