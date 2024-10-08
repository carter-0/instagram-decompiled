package X;

import java.util.Set;

/* renamed from: X.3ty  reason: invalid class name and case insensitive filesystem */
public final class C255343ty {
    public static final C255343ty A08 = new C255343ty(AnonymousClass05K.A00, 0sl.A00, -1, -1, false, false, false, false);
    public final long A00;
    public final long A01;
    public final Integer A02;
    public final Set A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C255343ty(C255343ty r3) {
        0qQ.A0B(r3, 1);
        this.A05 = r3.A05;
        this.A06 = r3.A06;
        this.A02 = r3.A02;
        this.A04 = r3.A04;
        this.A07 = r3.A07;
        this.A03 = r3.A03;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
            return false;
        }
        C255343ty r7 = (C255343ty) obj;
        if (this.A05 == r7.A05 && this.A06 == r7.A06 && this.A04 == r7.A04 && this.A07 == r7.A07 && this.A01 == r7.A01 && this.A00 == r7.A00 && this.A02 == r7.A02) {
            return 0qQ.A0K(this.A03, r7.A03);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.A02;
        long j = this.A01;
        long j2 = this.A00;
        return ((((((((((((((AnonymousClass52X.A00(num).hashCode() + num.intValue()) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Constraints{requiredNetworkType=");
        Integer num = this.A02;
        if (num != null) {
            str = AnonymousClass52X.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", requiresCharging=");
        sb.append(this.A05);
        sb.append(", requiresDeviceIdle=");
        sb.append(this.A06);
        sb.append(", requiresBatteryNotLow=");
        sb.append(this.A04);
        sb.append(", requiresStorageNotLow=");
        sb.append(this.A07);
        sb.append(", contentTriggerUpdateDelayMillis=");
        sb.append(this.A01);
        sb.append(", contentTriggerMaxDelayMillis=");
        sb.append(this.A00);
        sb.append(", contentUriTriggers=");
        sb.append(this.A03);
        sb.append(", }");
        return sb.toString();
    }

    public C255343ty(Integer num, Set set, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 1);
        0qQ.A0B(set, 8);
        this.A02 = num;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A07 = z4;
        this.A01 = j;
        this.A00 = j2;
        this.A03 = set;
    }
}
