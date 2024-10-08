package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class PWX implements Runnable {
    public final /* synthetic */ AnonymousClass3TR A00;

    public PWX(AnonymousClass3TR r1) {
        this.A00 = r1;
    }

    public final void run() {
        ReboundViewPager reboundViewPager = this.A00.A09;
        int floor = ((int) Math.floor((double) reboundViewPager.A01)) - 1;
        if (floor >= 0) {
            reboundViewPager.A0G((float) floor);
            AnonymousClass2S0.A01.A04();
        }
    }
}
