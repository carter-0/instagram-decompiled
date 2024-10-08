package X;

import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.Wop  reason: case insensitive filesystem */
public final class C20300Wop implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UZ2 A02;

    public C20300Wop(UZ2 uz2, int i, int i2) {
        this.A02 = uz2;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void run() {
        UZ2 uz2 = this.A02;
        if (uz2.isResumed()) {
            RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = uz2.A02;
            refreshableRecyclerViewLayout.getClass();
            int i = this.A00;
            int i2 = this.A01;
            RefreshableRecyclerViewLayout.A07(refreshableRecyclerViewLayout);
            refreshableRecyclerViewLayout.A0R.A08(0.0d, true);
            if (i2 != -1) {
                C252553pI r1 = refreshableRecyclerViewLayout.A0P.A0D;
                U9b u9b = refreshableRecyclerViewLayout.A0S;
                u9b.A00 = i2;
                u9b.A00 = i;
                if (r1 != null) {
                    r1.A0t(u9b);
                    return;
                }
                return;
            }
            refreshableRecyclerViewLayout.A0P.A0p(i);
        }
    }
}
