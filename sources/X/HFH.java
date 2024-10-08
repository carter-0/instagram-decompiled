package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class HFH extends C252333ow {
    public boolean A00;
    public final int A01;
    public final C233172vA A02;
    public final C233402vf A03;
    public final C233532vs A04;
    public final boolean A05;

    public final int A01(int i, int i2) {
        return -1;
    }

    public final int A03(C233472vm r11, int i, int i2, int i3) {
        0qQ.A0B(r11, 0);
        if (this.A00) {
            boolean z = this.A05;
            r11.A01 = z;
            this.A02.A05 = Boolean.valueOf(z);
        }
        int i4 = this.A01;
        int A032 = r11.A03();
        int A022 = A02(i, i2, i3, Math.max(i4 + A032, A032 + i3), r11.A07(), r11.A08());
        if (Float.compare(this.A03.AuH(), (float) i3) > 0) {
            return A022 + 1;
        }
        return A022;
    }

    public final boolean A0K(C233472vm r2) {
        return false;
    }

    public final boolean A0O(AnonymousClass30Y r2, C252093oY r3) {
        return true;
    }

    public final boolean A0Q(String str) {
        0qQ.A0B(str, 0);
        return this.A04.A00(str);
    }

    public HFH(UserSession userSession, C233172vA r11, C233402vf r12, C249863kU r13, C233522vr r14, C233532vs r15, int i, boolean z, boolean z2) {
        super(new C233672wA(), r12, r13, r14, z);
        this.A03 = r12;
        this.A01 = i;
        this.A04 = r15;
        this.A05 = z2;
        this.A02 = r11;
        this.A00 = 182.A06(0Tu.A05, userSession, 36326949353699419L);
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        AnonymousClass6YY r2 = (AnonymousClass6YY) obj;
        0qQ.A0B(r2, 0);
        return r2.A02.A0I;
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        C250973mM r2 = (C250973mM) obj;
        0qQ.A0B(r2, 0);
        return r2.A0H.A0b;
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        AnonymousClass6YY r2 = (AnonymousClass6YY) obj;
        0qQ.A0B(r2, 0);
        return r2.A00;
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r3, C233472vm r4, Object obj, int i, int i2, int i3, int i4, int i5) {
        C250973mM r5 = (C250973mM) obj;
        AnonymousClass7TG.A1S(r4, r5);
        if (i3 <= r5.A0E) {
            return false;
        }
        int A06 = r4.A06();
        if (i <= i2) {
            if (i2 > i) {
                i4 = i5;
            }
            return true;
        }
        if (i4 >= A06) {
            return true;
        }
        return false;
    }

    public final boolean A0H(C252093oY r3, 1PW r4, C233472vm r5, int i, int i2, int i3) {
        Set set;
        C51972G9s.A1D(r5, r4);
        int A06 = r5.A06();
        if (i > i2) {
            set = this.A0D;
        } else {
            if (i2 > i) {
                set = this.A0E;
            }
            r4.A01(C273654mx.A00(3034));
            return true;
        }
        if (set.size() < A06) {
            return false;
        }
        r4.A01(C273654mx.A00(3034));
        return true;
    }
}
