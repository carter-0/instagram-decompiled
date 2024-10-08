package X;

import android.os.Handler;
import android.util.LruCache;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Hr1  reason: case insensitive filesystem */
public final class C55995Hr1 {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final LruCache A01 = new LruCache(64);
    public final 0xa A02;
    public final C55950HqE A03;
    public final HashMap A04 = AnonymousClass7TE.A1E();
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final UserSession A06;

    public final boolean A00(C267324bN r6) {
        if (r6 == null || !r6.CcK()) {
            return false;
        }
        0xa r3 = this.A02;
        return r3.getInt("KEY_NUX_SHOWN_COUNT", 0) < 2 || (r3.getInt("KEY_NUX_SHOWN_COUNT", 0) == 2 && this.A01.get(C51966G9m.A1B(r6)) != null);
    }

    public C55995Hr1(UserSession userSession) {
        this.A06 = userSession;
        0xa A032 = 1Al.A01(userSession).A03(1An.A0n);
        this.A02 = A032;
        this.A03 = new C55950HqE(userSession);
        int A042 = DbS.A04(0Tu.A06, userSession, 36599018354314599L);
        if (A042 > DbT.A00(A032, "KEY_NUX_DATA_VERSION")) {
            0xY AR4 = A032.AR4();
            AR4.ED3("KEY_NUX_SHOWN_COUNT");
            AR4.E5Z("KEY_NUX_DATA_VERSION", A042);
            AR4.apply();
        }
    }
}
