package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.M4c  reason: case insensitive filesystem */
public final class C65913M4c implements Runnable {
    public final /* synthetic */ KVJ A00;

    public C65913M4c(KVJ kvj) {
        this.A00 = kvj;
    }

    public final void run() {
        KVJ kvj = this.A00;
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        ViewPager2 viewPager2 = kvj.A04;
        if (viewPager2.A08.A02 == 0) {
            viewPager2.A03((kvj.A00 + 1) % kvj.A06.A00.size(), true);
        }
    }
}
