package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4RL  reason: invalid class name */
public final class AnonymousClass4RL {
    public static final AnonymousClass4RL A07 = new AnonymousClass4RF().A00();
    public final AnonymousClass4RN A00;
    @Deprecated
    public final AnonymousClass4RM A01;
    public final AnonymousClass4RO A02;
    public final AnonymousClass4RK A03;
    @Deprecated
    public final AnonymousClass4RJ A04;
    public final AnonymousClass4RP A05;
    public final String A06;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass4RL)) {
            return false;
        }
        AnonymousClass4RL r4 = (AnonymousClass4RL) obj;
        return Util.A0I(this.A06, r4.A06) && this.A00.equals(r4.A00) && Util.A0I(this.A03, r4.A03) && Util.A0I(this.A02, r4.A02) && Util.A0I(this.A05, r4.A05);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A06.hashCode() * 31;
        AnonymousClass4RK r0 = this.A03;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        return ((((((hashCode + i) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A05.hashCode();
    }

    public AnonymousClass4RL(AnonymousClass4RM r1, AnonymousClass4RO r2, AnonymousClass4RJ r3, AnonymousClass4RP r4, String str) {
        this.A06 = str;
        this.A03 = r3;
        this.A04 = r3;
        this.A02 = r2;
        this.A05 = r4;
        this.A00 = r1;
        this.A01 = r1;
    }
}
