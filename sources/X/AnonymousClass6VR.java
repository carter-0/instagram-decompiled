package X;

import com.instagram.common.session.UserSession;
import java.util.Set;
import kotlin.Deprecated;

@Deprecated(message = "Sync all changes with the Kotlin implementation of @ReelTimeRuleCountingActionKt")
/* renamed from: X.6VR  reason: invalid class name */
public final class AnonymousClass6VR extends C252333ow {
    public C233172vA A00;
    public boolean A01;
    public final int A02;
    public final C233402vf A03;
    public final C233532vs A04;
    public final boolean A05;

    public final int A01(int i, int i2) {
        return -1;
    }

    public final int A03(C233472vm r11, int i, int i2, int i3) {
        if (this.A01) {
            boolean z = this.A05;
            r11.A01 = z;
            this.A00.A05 = Boolean.valueOf(z);
        }
        int i4 = this.A02;
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

    public AnonymousClass6VR(UserSession userSession, C233172vA r11, C233402vf r12, C249863kU r13, C233522vr r14, C233532vs r15, Boolean bool, int i, boolean z) {
        super(new C233672wA(), r12, r13, r14, z);
        this.A03 = r12;
        this.A02 = i;
        this.A04 = r15;
        this.A05 = bool.booleanValue();
        this.A01 = 182.A06(0Tu.A05, userSession, 36326949353699419L);
        this.A00 = r11;
    }

    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return ((AnonymousClass6YY) obj).A02.A0I;
    }

    public final /* bridge */ /* synthetic */ C233472vm A09(Object obj) {
        return ((C250973mM) obj).A0H.A0b;
    }

    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return ((AnonymousClass6YY) obj).A00;
    }

    public final /* bridge */ /* synthetic */ boolean A0I(C252093oY r3, C233472vm r4, Object obj, int i, int i2, int i3, int i4, int i5) {
        if (i3 <= ((C250973mM) obj).A0E) {
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

    public final boolean A0Q(String str) {
        return this.A04.A00(str);
    }

    public final boolean A0H(C252093oY r3, 1PW r4, C233472vm r5, int i, int i2, int i3) {
        Set set;
        int A06 = r5.A06();
        if (i > i2) {
            set = this.A0D;
        } else {
            if (i2 > i) {
                set = this.A0E;
            }
            r4.A01("min_media_gap_rule_did_meet");
            return true;
        }
        if (set.size() < A06) {
            return false;
        }
        r4.A01("min_media_gap_rule_did_meet");
        return true;
    }
}
