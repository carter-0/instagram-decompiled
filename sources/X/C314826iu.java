package X;

import com.instagram.common.session.UserSession;
import java.util.UUID;

/* renamed from: X.6iu  reason: invalid class name and case insensitive filesystem */
public final class C314826iu {
    public String A00;
    public final C314816it A01;
    public final 0wc A02;
    public final UserSession A03;
    public final boolean A04;

    public final void A00() {
        String str = this.A00;
        if (str != null && this.A04) {
            0wc r2 = this.A02;
            0Aj A002 = r2.A00(r2.A00, "aud_block_impression");
            A002.A8M(this.A01, "qp_position");
            A002.A8M(EZU.NOT_NOW, "button_action");
            A002.AAJ(Dbg.A00(), str);
            A002.Cgf();
        }
    }

    public final void A01() {
        String str = this.A00;
        if (str == null) {
            str = UUID.randomUUID().toString();
            this.A00 = str;
            if (str == null) {
                return;
            }
        }
        if (this.A04) {
            0wc r2 = this.A02;
            0Aj A002 = r2.A00(r2.A00, "aud_block_impression");
            A002.A8M(this.A01, "qp_position");
            A002.A8M(EZU.VIEW, "button_action");
            A002.AAJ(Dbg.A00(), str);
            A002.Cgf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (X.182.A06(r2, r5, 36322473997904071L) != false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C314826iu(X.C314816it r4, com.instagram.common.session.UserSession r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A03 = r5
            r3.A01 = r4
            X.0Tu r2 = X.0Tu.A05
            r0 = 36318015822763779(0x81070b00101703, double:3.0309976750028644E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0020
            r0 = 36322473997904071(0x810b19000228c7, double:3.0338170429132154E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 1
        L_0x0021:
            r3.A04 = r0
            java.lang.String r1 = "aud_block_impression"
            X.0xG r0 = new X.0xG
            r0.<init>(r1)
            X.0wc r0 = X.AnonymousClass0kN.A01(r0, r5)
            r3.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C314826iu.<init>(X.6it, com.instagram.common.session.UserSession):void");
    }
}
