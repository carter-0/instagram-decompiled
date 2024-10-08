package X;

import android.widget.HorizontalScrollView;
import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;

/* renamed from: X.U4t  reason: case insensitive filesystem */
public final class C14726U4t extends HorizontalScrollView {
    public int A00;
    public X1K A01;
    public Runnable A02;
    public boolean A03;

    public final void setFlingListener(X1K x1k) {
        this.A01 = x1k;
    }

    public final void fling(int i) {
        super.fling(i);
        if (!this.A03) {
            this.A03 = true;
            X1K x1k = this.A01;
            if (x1k != null) {
                ScrollingTimelineView scrollingTimelineView = ((WTG) x1k).A00;
                if (!scrollingTimelineView.A00) {
                    scrollingTimelineView.A00 = true;
                }
            }
            post(this.A02);
        }
    }
}
