package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.4UC  reason: invalid class name */
public class AnonymousClass4UC extends AnonymousClass4UD implements AnonymousClass4UE {
    public int A00;
    public int A01;
    public long A02;
    public long A03 = System.currentTimeMillis();
    public long A04;
    public long A05;
    public QuickPromotionSurface A06 = QuickPromotionSurface.A0J;
    public AnonymousClass4VK A07;
    public AnonymousClass4V7 A08 = new AnonymousClass4V7();
    public AnonymousClass4VA A09 = new AnonymousClass4VA();
    public AnonymousClass4VB A0A = new AnonymousClass4VB();
    public String A0B;
    public String A0C;
    public String A0D = "";
    public String A0E = "";
    public List A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            AnonymousClass4UC r5 = (AnonymousClass4UC) obj;
            if (!0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0D, r5.A0D)) {
                return false;
            }
        }
        return true;
    }

    public final AnonymousClass5Jm A00() {
        AnonymousClass5Jm r2 = new AnonymousClass5Jm();
        r2.A05 = this.A0D;
        r2.A03 = this.A0C;
        r2.A04 = this.A0B;
        r2.A02 = Integer.valueOf(this.A00);
        r2.A07 = new ArrayList(CA0());
        r2.A0B = this.A0K;
        r2.A00 = this.A07;
        r2.A01 = this.A09;
        r2.A0A = this.A0J;
        r2.A08 = this.A0G;
        r2.A09 = this.A0M;
        r2.A0C = this.A0H;
        return r2;
    }

    public final Set CA0() {
        Set copyOf;
        List list = this.A0F;
        0qQ.A0A(list);
        if (list.isEmpty()) {
            copyOf = Collections.emptySet();
        } else {
            copyOf = EnumSet.copyOf(this.A0F);
        }
        0qQ.A0A(copyOf);
        return copyOf;
    }

    public final int hashCode() {
        return (this.A0E.hashCode() * 31) + this.A0D.hashCode();
    }

    public AnonymousClass4UC(QuickPromotionSurface quickPromotionSurface, AnonymousClass4V7 r4, AnonymousClass5Jm r5, AnonymousClass4VB r6, String str, int i, long j, long j2, long j3, boolean z, boolean z2) {
        int i2;
        this.A08 = r4;
        this.A09 = r5.A01;
        0sn r0 = r5.A07;
        this.A0F = r0 == null ? 0sn.A00 : r0;
        this.A0C = r5.A03;
        String str2 = r5.A05;
        0qQ.A0B(str2, 0);
        this.A0D = str2;
        this.A06 = quickPromotionSurface;
        this.A0E = str;
        this.A04 = j;
        this.A02 = j2;
        this.A05 = j3;
        Integer num = r5.A02;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        this.A00 = i2;
        this.A01 = i;
        this.A0A = r6;
        this.A0L = z;
        this.A0I = z2;
        this.A0B = r5.A04;
        this.A07 = r5.A00;
        this.A0J = r5.A0A;
        this.A0M = r5.A09;
        this.A0K = r5.A0B;
        this.A0H = r5.A0C;
        this.A0G = r5.A08;
    }

    public AnonymousClass4UC() {
    }
}
