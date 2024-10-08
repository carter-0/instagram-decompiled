package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class GJW {
    public static final AnonymousClass0eM A03 = AnonymousClass0eN.A01(GJX.A00);
    public GJT A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final Map A02 = AnonymousClass7TE.A1H();

    public final void A00(C267324bN r5, UserSession userSession, AnonymousClass3W1 r7, long j) {
        GJT gjt;
        if (!182.A06(0Tu.A05, userSession, 36321739558364837L) || (((gjt = this.A00) == null || !gjt.A03(r5)) && !r7.A2A)) {
            A01(r7);
            C57833IhC ihC = new C57833IhC(this, r7);
            this.A02.put(C51969G9p.A0q(r7), ihC);
            this.A01.postDelayed(ihC, j);
        }
    }

    public final void A01(AnonymousClass3W1 r5) {
        int hashCode = r5.hashCode();
        Map map = this.A02;
        Integer valueOf = Integer.valueOf(hashCode);
        Runnable runnable = (Runnable) map.get(valueOf);
        if (runnable != null) {
            this.A01.removeCallbacks(runnable);
            map.remove(valueOf);
        }
    }
}
