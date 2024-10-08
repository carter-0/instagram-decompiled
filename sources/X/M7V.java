package X;

import androidx.viewpager2.widget.ViewPager2;

public final class M7V implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ K4J A01;

    public M7V(K4J k4j, int i) {
        this.A00 = i;
        this.A01 = k4j;
    }

    public final void run() {
        int i = this.A00;
        K4J k4j = this.A01;
        if (i < k4j.A00 - 1) {
            ViewPager2 viewPager2 = k4j.A02;
            if (viewPager2 != null) {
                viewPager2.A03(i + 1, true);
                return;
            }
        } else {
            k4j.A06 = false;
            ViewPager2 viewPager22 = k4j.A02;
            if (viewPager22 != null) {
                viewPager22.A03(0, true);
                String str = k4j.A04;
                if (str != null) {
                    AnonymousClass0eM r2 = k4j.A08;
                    DbX.A1T(AnonymousClass7TE.A0p(DbX.A0h(r2)), C273654mx.A00(2424), str, true);
                    DbX.A0R(r2).A00(new AY4(str));
                    return;
                }
                return;
            }
        }
        0qQ.A0F("viewPager");
        throw AnonymousClass00P.createAndThrow();
    }
}
