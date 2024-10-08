package X;

import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2v0  reason: invalid class name and case insensitive filesystem */
public final class C233132v0 implements C233012uo, C233102ux {
    public C233072uu A00;
    public final long A01;
    public final AnonymousClass2v1 A02;
    public final AnonymousClass2v3 A03;
    public final C233142v4 A04;
    public final UserSession A05;
    public final Map A06 = new LinkedHashMap();

    public final boolean A7L(C233632w4 r2, C233042ur r3, C233072uu r4) {
        0qQ.A0B(r4, 0);
        this.A00 = r4;
        this.A02.A00 = r4;
        this.A03.A01 = r4;
        this.A04.A01 = r4;
        return true;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final boolean CTb() {
        return false;
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r1, C238523Ce r2, boolean z) {
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r2, C233632w4 r3, C238523Ce r4, String str, String str2, double d, boolean z) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(r4, 3);
    }

    public final void Cn9(int i) {
    }

    public final void Cui(AFI_TYPE afi_type, 1Xj r5, AnonymousClass3W1 r6, Integer num, int i) {
        0qQ.A0B(r5, 0);
        0qQ.A0B(num, 3);
        int ordinal = afi_type.ordinal();
        if (ordinal == 2) {
            this.A03.CNK(r5, num, i);
        } else if (ordinal == 1) {
            this.A04.CNK(r5, num, i);
        } else if (ordinal == 10) {
            this.A02.CNK(r5, num, i);
        }
        this.A06.put(afi_type, Long.valueOf(System.currentTimeMillis()));
    }

    public final boolean D69(int i, int i2) {
        return false;
    }

    public final void DsJ(int i) {
    }

    public final void EUa(AFI_TYPE afi_type, long j) {
        int ordinal = afi_type.ordinal();
        if (ordinal == 2) {
            this.A03.A00 = j;
        } else if (ordinal == 1) {
            this.A04.A00 = j;
        }
    }

    public final boolean EsX(AFI_TYPE afi_type, 1Xj r11, Integer num) {
        Number number;
        if (r11 != null && r11.CcK() && ((number = (Number) 00k.A04(this.A06.values())) == null || System.currentTimeMillis() >= number.longValue() + this.A01)) {
            if (182.A06(0Tu.A05, this.A05, 36314670042188533L)) {
                int ordinal = afi_type.ordinal();
                if (ordinal == 2) {
                    return this.A03.EsQ(r11);
                }
                if (ordinal == 1) {
                    return this.A04.EsQ(r11);
                }
                if (ordinal == 10) {
                    return this.A02.EsQ(r11);
                }
            }
        }
        return false;
    }

    public final void deactivate() {
        this.A00 = null;
        this.A02.A00 = null;
        this.A03.A01 = null;
        this.A04.A01 = null;
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final /* synthetic */ Set Bsw() {
        return new HashSet();
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw new UnsupportedOperationException(AnonymousClass000.A00(110));
    }

    public C233132v0(UserSession userSession) {
        this.A05 = userSession;
        this.A02 = new AnonymousClass2v1(userSession);
        this.A03 = new AnonymousClass2v3(userSession);
        this.A04 = new C233142v4(userSession);
        this.A01 = 182.A01(0Tu.A06, userSession, 36607711365961332L);
    }
}
