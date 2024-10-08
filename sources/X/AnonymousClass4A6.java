package X;

import java.util.List;

/* renamed from: X.4A6  reason: invalid class name */
public final class AnonymousClass4A6 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final AnonymousClass4A5 A04;
    public final List A05;
    public final List A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4A6) {
                AnonymousClass4A6 r8 = (AnonymousClass4A6) obj;
                if (!(this.A04 == r8.A04 && this.A03 == r8.A03 && this.A07 == r8.A07 && this.A00 == r8.A00 && this.A01 == r8.A01 && 0qQ.A0K(this.A06, r8.A06) && this.A02 == r8.A02 && 0qQ.A0K(this.A05, r8.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A03;
        int hashCode = ((this.A04.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        return ((((((((((hashCode + i) * 31) + this.A00) * 31) + this.A01) * 31) + this.A06.hashCode()) * 31) + this.A02) * 31) + this.A05.hashCode();
    }

    public AnonymousClass4A6(AnonymousClass4A5 r1, List list, List list2, int i, int i2, int i3, long j, boolean z) {
        this.A04 = r1;
        this.A03 = j;
        this.A07 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A06 = list;
        this.A02 = i3;
        this.A05 = list2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4A6() {
        /*
            r10 = this;
            X.4A5 r1 = X.AnonymousClass4A5.UNSET
            r7 = 0
            r4 = 0
            X.0sn r2 = X.0sn.A00
            r0 = r10
            r3 = r2
            r5 = r4
            r6 = r4
            r9 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4A6.<init>():void");
    }
}
