package X;

import android.view.View;
import com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout;

public final class Mf4 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ CyclicSubtitleLayout A00;

    public Mf4(CyclicSubtitleLayout cyclicSubtitleLayout) {
        this.A00 = cyclicSubtitleLayout;
    }

    public final void onViewAttachedToWindow(View view) {
        this.A00.setAnimating(true);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A00.setAnimating(false);
    }
}
