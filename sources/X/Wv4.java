package X;

import com.instagram.video.player.common.LiveVideoDebugStatsView;
import java.util.TimerTask;

public final class Wv4 extends TimerTask {
    public final /* synthetic */ LiveVideoDebugStatsView A00;

    public Wv4(LiveVideoDebugStatsView liveVideoDebugStatsView) {
        this.A00 = liveVideoDebugStatsView;
    }

    public final void run() {
        LiveVideoDebugStatsView liveVideoDebugStatsView = this.A00;
        synchronized (liveVideoDebugStatsView) {
            C17547Va0[] va0Arr = liveVideoDebugStatsView.A0A;
            int i = liveVideoDebugStatsView.A01;
            va0Arr[i] = new C17547Va0(liveVideoDebugStatsView.A06, liveVideoDebugStatsView.A03, liveVideoDebugStatsView.A04, liveVideoDebugStatsView.A02, liveVideoDebugStatsView.A05);
            int length = va0Arr.length;
            int i2 = (i + 1) % length;
            liveVideoDebugStatsView.A01 = i2;
            int i3 = liveVideoDebugStatsView.A00;
            if (i2 == i3) {
                liveVideoDebugStatsView.A00 = (i3 + 1) % length;
            }
        }
        liveVideoDebugStatsView.postInvalidate();
    }
}
