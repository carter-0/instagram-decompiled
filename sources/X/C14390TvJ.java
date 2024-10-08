package X;

import com.instagram.autoplay.models.AutoplayPlaybackState;
import java.util.List;

/* renamed from: X.TvJ  reason: case insensitive filesystem */
public final class C14390TvJ {
    public final X8M A00;
    public final C14336TuJ A01;
    public final C14352Tuh A02;
    public final C14082TpW A03;
    public final C14083TpX A04;
    public final List A05 = 0sr.A1P(new AutoplayPlaybackState[]{AutoplayPlaybackState.PLAYING, AutoplayPlaybackState.PLAYING_AND_LOOPED_ONCE, AutoplayPlaybackState.PLAYBACK_REQUESTED, AutoplayPlaybackState.BUFFERING});

    public C14390TvJ(X8M x8m, C14336TuJ tuJ, C14352Tuh tuh, C14082TpW tpW, C14083TpX tpX) {
        this.A02 = tuh;
        this.A04 = tpX;
        this.A03 = tpW;
        this.A00 = x8m;
        this.A01 = tuJ;
    }
}
