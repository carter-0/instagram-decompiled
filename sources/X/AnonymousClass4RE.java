package X;

import android.net.Uri;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4RE  reason: invalid class name */
public final class AnonymousClass4RE {
    public static final Object A0H = new Object();
    public static final AnonymousClass4RL A0I;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public AnonymousClass4RO A08;
    public AnonymousClass4RL A09 = A0I;
    public Object A0A;
    @Deprecated
    public Object A0B;
    public Object A0C = A0H;
    public boolean A0D;
    @Deprecated
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public final void A00(AnonymousClass4RO r5, AnonymousClass4RL r6, Object obj, Object obj2, int i, long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2) {
        AnonymousClass4RL r0;
        Object obj3;
        AnonymousClass4RK r02;
        this.A0C = obj;
        if (r6 != null) {
            r0 = r6;
        } else {
            r0 = A0I;
        }
        this.A09 = r0;
        if (r6 == null || (r02 = r6.A03) == null) {
            obj3 = null;
        } else {
            obj3 = r02.A02;
        }
        this.A0B = obj3;
        this.A0A = obj2;
        this.A06 = j;
        this.A07 = j2;
        this.A04 = j3;
        this.A0G = z;
        this.A0D = z2;
        boolean z3 = false;
        if (r5 != null) {
            z3 = true;
        }
        this.A0E = z3;
        this.A08 = r5;
        this.A02 = j4;
        this.A03 = j5;
        this.A00 = 0;
        this.A01 = i;
        this.A05 = j6;
        this.A0F = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            AnonymousClass4RE r7 = (AnonymousClass4RE) obj;
            if (!(Util.A0I(this.A0C, r7.A0C) && Util.A0I(this.A09, r7.A09) && Util.A0I(this.A0A, r7.A0A) && Util.A0I(this.A08, r7.A08) && this.A06 == r7.A06 && this.A07 == r7.A07 && this.A04 == r7.A04 && this.A0G == r7.A0G && this.A0D == r7.A0D && this.A0F == r7.A0F && this.A02 == r7.A02 && this.A03 == r7.A03 && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A05 == r7.A05)) {
                return false;
            }
        }
        return true;
    }

    static {
        AnonymousClass4RF r1 = new AnonymousClass4RF();
        r1.A07 = "com.google.android.exoplayer2.Timeline";
        r1.A00 = Uri.EMPTY;
        A0I = r1.A00();
    }

    public final boolean A01() {
        boolean z = this.A0E;
        AnonymousClass4RO r3 = this.A08;
        boolean z2 = false;
        if (r3 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (z == z2) {
            z3 = true;
        }
        C256703wD.A04(z3);
        if (r3 == null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((217 + this.A0C.hashCode()) * 31) + this.A09.hashCode()) * 31;
        Object obj = this.A0A;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        AnonymousClass4RO r0 = this.A08;
        if (r0 != null) {
            i = r0.hashCode();
        }
        long j = this.A06;
        long j2 = this.A07;
        long j3 = this.A04;
        long j4 = this.A02;
        long j5 = this.A03;
        long j6 = this.A05;
        return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.A00) * 31) + this.A01) * 31) + ((int) (j6 ^ (j6 >>> 32)));
    }
}
