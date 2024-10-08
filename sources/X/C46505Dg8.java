package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Dg8  reason: case insensitive filesystem */
public final class C46505Dg8 {
    public C54034GyJ A00;
    public 1wn A01;
    public C309426Yf A02;
    public Integer A03;
    public final long A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final String A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);

    public static final void A00(C46505Dg8 dg8) {
        F2N f2n;
        C309426Yf r0 = dg8.A02;
        if (r0 != null && (f2n = r0.A0R) != null && f2n.A02 == AnonymousClass05K.A01) {
            long j = f2n.A01;
            if (dg8.A03 == AnonymousClass05K.A00) {
                j -= dg8.A04;
                if (j < 0) {
                    j = 0;
                }
            }
            C54034GyJ gyJ = dg8.A00;
            if (gyJ != null) {
                gyJ.Ckv(j);
            }
        }
    }

    public final void A01() {
        C309426Yf r1 = this.A02;
        if (r1 != null) {
            r1.A0R = null;
        }
        this.A02 = null;
        1wn r2 = this.A01;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A06).A02(r2, C57060INa.class);
        }
        this.A01 = null;
    }

    public C46505Dg8(AnonymousClass0iw r5, UserSession userSession, String str) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A06 = userSession;
        this.A07 = str;
        this.A05 = r5;
        this.A04 = (long) (182.A00(0Tu.A06, userSession, 37168170238214610L) * 1000.0d);
        this.A03 = AnonymousClass05K.A00;
    }
}
