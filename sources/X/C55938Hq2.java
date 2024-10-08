package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Hq2  reason: case insensitive filesystem */
public final class C55938Hq2 {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final Map A01 = AnonymousClass7TE.A1H();

    public final void A00(C267324bN r5, UserSession userSession, AnonymousClass3W1 r7, long j) {
        C54659HMq hMq;
        if (!182.A06(0Tu.A05, userSession, 36323169782475723L)) {
            1Xj r0 = r5.A02;
            C54659HMq hMq2 = null;
            if (r0 != null) {
                hMq = r0.A1s();
            } else {
                hMq = null;
            }
            if (hMq != C54659HMq.TOP_MAIN_BOTTOM_SCROLLABLE_THUMBNAILS) {
                1Xj r02 = r5.A02;
                if (r02 != null) {
                    hMq2 = r02.A1s();
                }
                if (hMq2 != C54659HMq.TOP_MAIN_BOTTOM_THREE_TAPPABLE_THUMBNAILS) {
                    return;
                }
            }
        }
        int hashCode = r7.hashCode();
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A00.removeCallbacks(runnable);
            map.remove(valueOf);
        }
        C57834IhD ihD = new C57834IhD(this, r7);
        map.put(C51969G9p.A0q(r7), ihD);
        this.A00.postDelayed(ihD, j);
    }
}
