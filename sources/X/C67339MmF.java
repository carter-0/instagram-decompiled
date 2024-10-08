package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MmF  reason: case insensitive filesystem */
public final class C67339MmF {
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public long A03 = -1;
    public long A04 = -1;
    public long A05 = -1;
    public long A06 = -1;
    public String A07 = "unknown";
    public String A08 = "unknown";
    public boolean A09;
    public final 0wc A0A;
    public final String A0B;
    public final Map A0C = AnonymousClass7TE.A1H();

    public final void A00(long j, long j2) {
        long valueOf;
        if (!this.A09) {
            return;
        }
        if (j != this.A03 || j2 != this.A02) {
            if (this.A01 == -1) {
                this.A01 = j;
            }
            if (this.A00 == -1) {
                this.A00 = j2;
            }
            this.A03 = j;
            this.A02 = j2;
            Map map = this.A0C;
            AnonymousClass59G r7 = (AnonymousClass59G) map.get(Long.valueOf(j));
            Long valueOf2 = Long.valueOf(this.A03);
            Long valueOf3 = Long.valueOf(j2);
            if (r7 == null) {
                valueOf = 1L;
            } else {
                valueOf = Long.valueOf(AnonymousClass7TE.A0R(r7.A02) + 1);
            }
            map.put(Long.valueOf(this.A03), new AnonymousClass59G(valueOf2, valueOf3, valueOf));
        }
    }

    public C67339MmF(UserSession userSession, String str) {
        this.A0B = str;
        this.A0A = AnonymousClass0kN.A02(userSession);
    }
}
