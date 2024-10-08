package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.List;

public final class LDY {
    public final C17969Vj5 A00 = new Object();
    public final LB8 A01;
    public final KI7 A02;
    public final AnonymousClass0iw A03;

    public final void A00(List list) {
        ReboundViewPager reboundViewPager;
        AnonymousClass3TG r0;
        KI7 ki7 = this.A02;
        ki7.A00.addAll(list);
        0fE.A00(ki7, 2040035095);
        int count = ki7.getCount();
        LB8 lb8 = this.A01;
        if (count > 1) {
            CirclePageIndicator circlePageIndicator = lb8.A09;
            circlePageIndicator.setVisibility(0);
            circlePageIndicator.A01(0, ki7.getCount());
            reboundViewPager = lb8.A06;
            r0 = AnonymousClass3TG.DISCRETE_PAGING;
        } else {
            lb8.A09.setVisibility(8);
            reboundViewPager = lb8.A06;
            r0 = AnonymousClass3TG.DISABLED;
        }
        reboundViewPager.setScrollMode(r0);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Vj5, java.lang.Object] */
    public LDY(View view, AnonymousClass0iw r3) {
        this.A03 = r3;
        this.A02 = new KI7(r3);
        this.A01 = new LB8(view);
    }
}
