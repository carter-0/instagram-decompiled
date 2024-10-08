package X;

import android.view.View;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.6LB  reason: invalid class name */
public final class AnonymousClass6LB implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C306126Kw A01;

    public AnonymousClass6LB(View view, C306126Kw r2) {
        this.A01 = r2;
        this.A00 = view;
    }

    public final void run() {
        C306126Kw r3 = this.A01;
        ReboundViewPager.A02(this.A00, new AnonymousClass4GW(r3.A00), r3.A01);
    }
}
