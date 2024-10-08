package X;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.PZS  reason: case insensitive filesystem */
public final class C73248PZS implements Runnable {
    public final /* synthetic */ C68462NJa A00;
    public final /* synthetic */ C69030NdG A01;

    public C73248PZS(C68462NJa nJa, C69030NdG ndG) {
        this.A00 = nJa;
        this.A01 = ndG;
    }

    public final void run() {
        ViewPager2 viewPager2 = this.A00.A0B;
        if (viewPager2 == null) {
            0qQ.A0F("presenceHScrollPager");
            throw AnonymousClass00P.createAndThrow();
        } else {
            viewPager2.A03(this.A01.A00, true);
        }
    }
}
