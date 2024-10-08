package X;

import android.util.Pair;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.M0k  reason: case insensitive filesystem */
public final class C65818M0k implements MUT {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C62423KfY A01;

    public C65818M0k(UserSession userSession, C62423KfY kfY) {
        this.A01 = kfY;
        this.A00 = userSession;
    }

    public final void Cz4(C62683Kkj kkj, C66537MVr mVr) {
        UserSession userSession = this.A00;
        C62423KfY kfY = this.A01;
        C64139LPo.A01(kfY.A0Y, userSession).A00();
        LKF.A00(kkj);
        if (mVr.equals(kfY.A0F)) {
            BroadcastFailureType broadcastFailureType = kkj.A00;
            String str = kkj.A01;
            0qQ.A0B(str, 1);
            LPE.A0B(broadcastFailureType, kfY, str, (String) null, kkj);
            return;
        }
        0KC.A0H("IgLiveStreamingController", "Unexpected error from another LiveStreamingSession.", kkj);
    }

    public final void DBD() {
        C62423KfY kfY = this.A01;
        if (kfY.A0K != AnonymousClass05K.A0N) {
            long j = kfY.A05;
            C22371Y0z y0z = kfY.A0I;
            if (y0z != null) {
                j += y0z.C8j();
            }
            C65819M0l m0l = kfY.A0H;
            if (m0l != null) {
                j += m0l.A00;
            }
            kfY.A0a.A02 = j;
            11Z.A02(new M8A(kfY, j));
            LKG.A00(this.A00).A00((Pair) null, (Pair) null, (VideoBroadcastVideoStreamingConfig) null, (Double) null, (Integer) null, (Integer) null, Long.valueOf(j), (String) null);
        }
    }
}
