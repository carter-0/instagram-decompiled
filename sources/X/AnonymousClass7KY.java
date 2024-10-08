package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7KY  reason: invalid class name */
public class AnonymousClass7KY {
    public final UserSession A00;
    public final 2Er A01;
    public final C331617Rr A02;
    public final C329797Kg A03;
    public final C254783t2 A04;
    public final C62320sa A05;
    public final C62320sa A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7KY(X.AnonymousClass7KY r11) {
        /*
            r10 = this;
            com.instagram.common.session.UserSession r1 = r11.A00
            boolean r8 = r11.A08
            boolean r9 = r11.A07
            X.0sa r6 = r11.A05
            X.0sa r7 = r11.A06
            X.3t2 r5 = r11.A04
            X.7Rr r3 = r11.A02
            X.2Er r2 = r11.A01
            X.7Kg r4 = r11.A03
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7KY.<init>(X.7KY):void");
    }

    public final 2FW A00() {
        C70726OHv oHv;
        C329797Kg r0 = this.A03;
        if (r0 == null || (oHv = r0.A09) == null) {
            return null;
        }
        return oHv.A02.A01.A0F;
    }

    public final boolean A01() {
        2Er r0 = this.A01;
        if (r0 == null || !r0.CVb()) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        C329797Kg r0 = this.A03;
        if (r0 == null || !r0.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        DirectThreadKey directThreadKey;
        2Er r0 = this.A01;
        C254743sy r1 = null;
        if (r0 != null) {
            r1 = r0.BJz();
        }
        if (!(r1 instanceof DirectThreadKey) || (directThreadKey = (DirectThreadKey) r1) == null || directThreadKey.A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A04(Integer num) {
        DirectThreadKey directThreadKey;
        2Er r0 = this.A01;
        C254743sy r2 = null;
        if (r0 != null) {
            r2 = r0.BJz();
        }
        if ((r2 instanceof DirectThreadKey) && (directThreadKey = (DirectThreadKey) r2) != null) {
            if (AnonymousClass796.A02(this.A00, directThreadKey, Boolean.valueOf(this.A07), num, ((Boolean) this.A06.invoke()).booleanValue(), false, false) == AnonymousClass797.OPEN_ONLY) {
                return false;
            }
            return true;
        }
        return false;
    }

    public AnonymousClass7KY(UserSession userSession, 2Er r3, C331617Rr r4, C329797Kg r5, C254783t2 r6, C62320sa r7, C62320sa r8, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r6, 6);
        0qQ.A0B(r4, 7);
        this.A00 = userSession;
        this.A08 = z;
        this.A07 = z2;
        this.A05 = r7;
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
    }
}
