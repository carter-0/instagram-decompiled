package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

public final class M6R implements Runnable {
    public final /* synthetic */ ReboundViewPager A00;
    public final /* synthetic */ JY9 A01;

    public M6R(ReboundViewPager reboundViewPager, JY9 jy9) {
        this.A01 = jy9;
        this.A00 = reboundViewPager;
    }

    public final void run() {
        CirclePageIndicator circlePageIndicator = this.A01.A0S;
        if (circlePageIndicator != null) {
            0nA.A0e(this.A00, circlePageIndicator.getHeight());
        }
    }
}
