package X;

import com.instagram.feed.ui.rows.mediaheader.layout.CyclicSubtitleLayout;
import java.util.TimerTask;

/* renamed from: X.Mqp  reason: case insensitive filesystem */
public final class C67617Mqp extends TimerTask {
    public final /* synthetic */ CyclicSubtitleLayout A00;

    public C67617Mqp(CyclicSubtitleLayout cyclicSubtitleLayout) {
        this.A00 = cyclicSubtitleLayout;
    }

    public final void run() {
        CyclicSubtitleLayout cyclicSubtitleLayout = this.A00;
        cyclicSubtitleLayout.setVisibleIndex(cyclicSubtitleLayout.A00 + 1);
    }
}
