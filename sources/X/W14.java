package X;

import android.util.ArrayMap;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;

public abstract class W14 {
    public static final W00 A00;
    public static final 02m A01;
    public static final UserSession A02 = C16707V2q.A00;
    public static final AnonymousClass0vF A03;
    public static volatile boolean A04;

    public static final void A01(ArrayMap arrayMap, String str, String str2) {
        0qQ.A0B(str2, 1);
        if (A04) {
            W00 w00 = A00;
            w00.A03(new C20321WpG(arrayMap, w00, str, str2));
        }
    }

    static {
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "BaymaxExecutor";
        AnonymousClass0vF r2 = new AnonymousClass0vF(A002);
        A03 = r2;
        02m r1 = 02m.A0p;
        0qQ.A07(r1);
        A01 = r1;
        A00 = new W00(r1, r2);
    }

    public static final Integer A00(long j, long j2) {
        if (j == 0) {
            return AnonymousClass05K.A00;
        }
        if (j2 <= 0 && j > 0) {
            return AnonymousClass05K.A01;
        }
        if (j > j2) {
            return AnonymousClass05K.A0C;
        }
        if (j == j2) {
            return AnonymousClass05K.A0N;
        }
        return AnonymousClass05K.A0Y;
    }

    public static final void A02(C256243vS r6, HeroPlayerSetting heroPlayerSetting) {
        if (A04) {
            long currentMonotonicTimestamp = A01.currentMonotonicTimestamp();
            C255653uU r5 = r6.A0D;
            int A002 = SKX.A00(r5.A0G, String.valueOf(r6.A0L));
            W00 w00 = A00;
            0qQ.A06("");
            w00.A03(new C20322WpH(w00, A002, currentMonotonicTimestamp));
            A03.ATE(new C15875Ujz(r6, r5, heroPlayerSetting, A002));
        }
    }
}
