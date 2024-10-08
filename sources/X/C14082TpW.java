package X;

import com.instagram.autoplay.models.AutoplayPlaybackHistory;
import com.instagram.autoplay.models.AutoplayPlaybackSegment;
import com.instagram.autoplay.models.AutoplayPlaybackState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.TpW  reason: case insensitive filesystem */
public final class C14082TpW {
    public C14083TpX A00;
    public final C14078TpS A01;
    public final X8M A02;
    public final List A03 = new ArrayList();
    public final C61410nE A04;
    public final HashMap A05 = new HashMap();

    public C14082TpW(C14078TpS tpS, X8M x8m, C61410nE r4) {
        0qQ.A0B(r4, 1);
        this.A04 = r4;
        this.A01 = tpS;
        this.A02 = x8m;
    }

    public final AutoplayPlaybackHistory A01(1Xj r11) {
        AutoplayPlaybackState autoplayPlaybackState;
        1Xj r5 = r11;
        0qQ.A0B(r11, 0);
        String id = r11.getId();
        HashMap hashMap = this.A05;
        AutoplayPlaybackHistory autoplayPlaybackHistory = (AutoplayPlaybackHistory) hashMap.get(id);
        if (autoplayPlaybackHistory == null) {
            autoplayPlaybackHistory = new AutoplayPlaybackHistory(r5, AutoplayPlaybackState.UNKNOWN, System.currentTimeMillis(), new ArrayList());
        }
        if (id != null) {
            boolean isPlaying = autoplayPlaybackHistory.currentState.isPlaying();
            boolean BJE = this.A02.BJE(r11);
            if (isPlaying == BJE) {
                return autoplayPlaybackHistory;
            }
            if (BJE) {
                if (isPlaying) {
                    return autoplayPlaybackHistory;
                }
                autoplayPlaybackState = AutoplayPlaybackState.PLAYING;
            } else if (!isPlaying) {
                return autoplayPlaybackHistory;
            } else {
                autoplayPlaybackState = AutoplayPlaybackState.PAUSED;
            }
            A02(autoplayPlaybackState, r11);
            AutoplayPlaybackHistory autoplayPlaybackHistory2 = (AutoplayPlaybackHistory) hashMap.get(id);
            if (autoplayPlaybackHistory2 == null) {
                return new AutoplayPlaybackHistory(r5, AutoplayPlaybackState.UNKNOWN, System.currentTimeMillis(), new ArrayList());
            }
            return autoplayPlaybackHistory2;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(AutoplayPlaybackState autoplayPlaybackState, 1Xj r15) {
        1Xj r3 = r15;
        String id = r15.getId();
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = this.A05;
        AutoplayPlaybackHistory autoplayPlaybackHistory = (AutoplayPlaybackHistory) hashMap.get(id);
        AutoplayPlaybackState autoplayPlaybackState2 = autoplayPlaybackState;
        if (autoplayPlaybackHistory == null) {
            autoplayPlaybackHistory = new AutoplayPlaybackHistory(r3, autoplayPlaybackState2, currentTimeMillis, new ArrayList());
            if (id != null) {
                hashMap.put(id, autoplayPlaybackHistory);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            AutoplayPlaybackState autoplayPlaybackState3 = autoplayPlaybackHistory.currentState;
            if (autoplayPlaybackState3 != autoplayPlaybackState) {
                List list = autoplayPlaybackHistory.historicalPlaybackSegments;
                long j = autoplayPlaybackHistory.currentStateStartTime;
                list.add(new AutoplayPlaybackSegment(autoplayPlaybackState3, j, currentTimeMillis - j));
                autoplayPlaybackHistory.currentStateStartTime = currentTimeMillis;
                autoplayPlaybackHistory.currentState = autoplayPlaybackState;
            }
        }
        JTR.A1T(autoplayPlaybackHistory, this.A03);
    }

    public static final void A00(C14082TpW tpW) {
        List list = tpW.A03;
        C59099J6h j6h = new C59099J6h(tpW, 13);
        0qQ.A0B(list, 0);
        018.A1B(list, j6h, false);
    }
}
