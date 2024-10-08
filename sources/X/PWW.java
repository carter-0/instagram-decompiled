package X;

import android.widget.Adapter;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class PWW implements Runnable {
    public final /* synthetic */ AnonymousClass3TR A00;

    public PWW(AnonymousClass3TR r1) {
        this.A00 = r1;
    }

    public final void run() {
        ReboundViewPager reboundViewPager = this.A00.A09;
        Adapter adapter = reboundViewPager.getAdapter();
        if (adapter != null) {
            int count = adapter.getCount();
            int floor = ((int) Math.floor((double) reboundViewPager.A01)) + 1;
            if (floor < count) {
                reboundViewPager.A0G((float) floor);
                AnonymousClass2S0.A01.A04();
                return;
            }
            return;
        }
        throw DbU.A0h();
    }
}
