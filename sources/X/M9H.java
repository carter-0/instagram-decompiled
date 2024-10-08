package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

public final class M9H implements Runnable {
    public final /* synthetic */ LiveStreamingError A00;
    public final /* synthetic */ BroadcastFailureType A01;
    public final /* synthetic */ C62423KfY A02;

    public M9H(LiveStreamingError liveStreamingError, BroadcastFailureType broadcastFailureType, C62423KfY kfY) {
        this.A02 = kfY;
        this.A01 = broadcastFailureType;
        this.A00 = liveStreamingError;
    }

    public final void run() {
        Context context;
        int i;
        Integer num;
        String str;
        0xF r8;
        C65816M0i m0i = this.A02.A0E;
        if (m0i != null) {
            BroadcastFailureType broadcastFailureType = this.A01;
            LiveStreamingError liveStreamingError = this.A00;
            0qQ.A0B(broadcastFailureType, 0);
            0qQ.A0B(liveStreamingError, 1);
            ((02m) AnonymousClass7TE.A14(((L5N) m0i.A0V.A01.getValue()).A01)).markerEnd(29241390, 3);
            XPM xpm = m0i.A04;
            if (xpm != null && xpm.A0K) {
                LRP lrp = m0i.A0U;
                String str2 = liveStreamingError.description;
                if (lrp.A06 != null) {
                    lrp.A01 = AnonymousClass05K.A15;
                    if (str2 != null) {
                        r8 = new 0xF();
                        0xF.A00(r8, str2, "e");
                        str = "ERROR";
                    } else {
                        str = "INFO";
                        r8 = null;
                    }
                    LRP.A00(r8, lrp, "END", str, "BROADCASTER");
                    lrp.A06 = null;
                }
            }
            boolean z = true;
            try {
                int ordinal = broadcastFailureType.ordinal();
                if (ordinal == 2) {
                    num = AnonymousClass05K.A15;
                } else if (ordinal != 6) {
                    num = AnonymousClass05K.A0u;
                } else {
                    num = AnonymousClass05K.A1F;
                }
                m0i.A02(num, liveStreamingError.reason, m0i.A05.A00());
            } catch (RuntimeException e) {
                C64139LPo.A01(m0i.A0P, m0i.A0R).A00();
                LKF.A00(e);
            }
            C62635Kj6 kj6 = m0i.A05;
            if (kj6.A00() || kj6 == C62635Kj6.STOPPED_SUMMARY || kj6 == C62635Kj6.STOPPED_BLOCKED) {
                z = false;
            }
            M0Y m0y = m0i.A08;
            if (m0y != null) {
                String str3 = liveStreamingError.reason;
                0qQ.A0B(str3, 1);
                if (z) {
                    int ordinal2 = broadcastFailureType.ordinal();
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            context = m0y.A04;
                            i = 2131965219;
                            if (ordinal2 != 6) {
                                i = 2131965190;
                            }
                        } else {
                            context = m0y.A04;
                            i = 2131965233;
                        }
                        str3 = AnonymousClass7TE.A16(context, i);
                    }
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString(C273654mx.A00(110), str3);
                    m0y.A0I.invoke(false, A0a);
                }
            }
        }
    }
}
