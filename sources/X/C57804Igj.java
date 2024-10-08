package X;

import androidx.viewpager.widget.ViewPager;
import java.util.List;

/* renamed from: X.Igj  reason: case insensitive filesystem */
public final class C57804Igj implements Runnable {
    public final /* synthetic */ ViewPager A00;
    public final /* synthetic */ C53158GjU A01;

    public C57804Igj(ViewPager viewPager, C53158GjU gjU) {
        this.A00 = viewPager;
        this.A01 = gjU;
    }

    public final void run() {
        ViewPager viewPager = this.A00;
        C53158GjU gjU = this.A01;
        List list = viewPager.A0B;
        if (list != null) {
            list.remove(gjU);
        }
    }
}
