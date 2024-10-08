package X;

import android.os.Bundle;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: X.HqO  reason: case insensitive filesystem */
public final class C55957HqO {
    public final /* synthetic */ View A00;
    public final /* synthetic */ SwipeRefreshLayout A01;
    public final /* synthetic */ C227232is A02;

    public C55957HqO(View view, SwipeRefreshLayout swipeRefreshLayout, C227232is r3) {
        this.A02 = r3;
        this.A00 = view;
        this.A01 = swipeRefreshLayout;
    }

    public final void A00() {
        C227232is r8 = this.A02;
        C267324bN A002 = GD9.A00(r8);
        if (A002 != null && A002.A02 != null) {
            GBE gbe = r8.A09;
            String str = "clipsViewerFragmentViewModel";
            if (gbe != null) {
                if (gbe.A0B == null) {
                    GNH A0D = gbe.A0D();
                    SwipeRefreshLayout swipeRefreshLayout = this.A01;
                    View view = this.A00;
                    A0D.A04 = r8;
                    C52012GBj gBj = r8.A0N;
                    if (gBj == null) {
                        str = "clipsViewerViewPager";
                    } else {
                        C56042Hrp hrp = r8.A0J;
                        if (hrp == null) {
                            str = "overlayFragmentController";
                        } else {
                            GBE gbe2 = r8.A09;
                            if (gbe2 != null) {
                                A0D.A0B(swipeRefreshLayout, gbe2.A14, hrp, gBj);
                                A0D.onViewCreated(view, (Bundle) null);
                                return;
                            }
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
