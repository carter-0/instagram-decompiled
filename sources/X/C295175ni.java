package X;

import java.util.Arrays;

/* renamed from: X.5ni  reason: invalid class name and case insensitive filesystem */
public final class C295175ni {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final AnonymousClass4RL A06;
    public final Object A07;
    public final Object A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C295175ni r7 = (C295175ni) obj;
            if (!(this.A02 == r7.A02 && this.A03 == r7.A03 && this.A05 == r7.A05 && this.A04 == r7.A04 && this.A00 == r7.A00 && this.A01 == r7.A01 && 2PP.A00(this.A08, r7.A08) && 2PP.A00(this.A07, r7.A07) && 2PP.A00(this.A06, r7.A06))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A08, Integer.valueOf(this.A02), this.A06, this.A07, Integer.valueOf(this.A03), Long.valueOf(this.A05), Long.valueOf(this.A04), Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public C295175ni(AnonymousClass4RL r1, Object obj, Object obj2, int i, int i2, int i3, int i4, long j, long j2) {
        this.A08 = obj;
        this.A02 = i;
        this.A06 = r1;
        this.A07 = obj2;
        this.A03 = i2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
