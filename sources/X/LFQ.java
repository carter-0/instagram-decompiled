package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.instagram.common.session.UserSession;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

public final class LFQ {
    public long A00 = 17633831;
    public final long A01;
    public final 29E A02;
    public final String A03;
    public final String A04;
    public final AtomicBoolean A05 = new AtomicBoolean(false);
    public final AtomicBoolean A06 = new AtomicBoolean(false);
    public final UserSession A07;

    public LFQ(UserSession userSession, String str, String str2) {
        0qQ.A0B(str2, 3);
        this.A07 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = new 29E(userSession);
        this.A01 = 182.A01(0Tu.A06, userSession, 36599048417316224L);
    }

    public final void A01(String str) {
        if (this.A06.getAndSet(false) && this.A05.getAndSet(false)) {
            29E r2 = this.A02;
            String str2 = str;
            if (r2.A0E(17633831, this.A00)) {
                this.A00 = r2.A06(CancelReason.USER_CANCELLED, str2, 17633831, this.A00);
                return;
            }
            int hashCode = UUID.randomUUID().hashCode();
            29E r6 = r2;
            r2.A06(CancelReason.USER_CANCELLED, 002.A0R(str, AnonymousClass000.A00(4289)), 17633831, r6.A04(Integer.valueOf(hashCode), (String) null, 17633831, this.A01));
        }
    }

    public final void A00() {
        if (this.A06.get() && this.A05.getAndSet(false)) {
            this.A00 = this.A02.A02(17633831, this.A00);
        }
    }
}
