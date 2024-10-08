package X;

import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

/* renamed from: X.WjB  reason: case insensitive filesystem */
public final class C19990WjB implements Runnable {
    public final /* synthetic */ C14726U4t A00;

    public C19990WjB(C14726U4t u4t) {
        this.A00 = u4t;
    }

    public final void run() {
        C14726U4t u4t = this.A00;
        if (u4t.A03) {
            int scrollX = u4t.getScrollX();
            if (u4t.A00 == scrollX) {
                u4t.A03 = false;
                X1K x1k = u4t.A01;
                if (x1k != null) {
                    ScrollingTimelineView scrollingTimelineView = ((WTG) x1k).A00;
                    if (scrollingTimelineView.A00) {
                        scrollingTimelineView.A00 = false;
                    }
                }
            } else {
                u4t.A00 = scrollX;
                u4t.postDelayed(u4t.A02, 10);
                return;
            }
        }
        u4t.removeCallbacks(u4t.A02);
    }
}
