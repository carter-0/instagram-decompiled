package X;

import com.google.android.exoplayer2.util.Util;

/* renamed from: X.4Rc  reason: invalid class name and case insensitive filesystem */
public final class C264744Rc {
    public int A00;
    public long A01;
    public long A02;
    public C264754Rd A03 = C264754Rd.A01;
    public Object A04;
    public Object A05;
    public boolean A06;

    public final void A02(long j, Object obj, long j2, Object obj2) {
        C264754Rd r0 = C264754Rd.A01;
        this.A04 = obj;
        this.A05 = obj2;
        this.A00 = 0;
        this.A01 = j;
        this.A02 = j2;
        this.A03 = r0;
        this.A06 = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !getClass().equals(obj.getClass())) {
                return false;
            }
            C264744Rc r7 = (C264744Rc) obj;
            if (!(Util.A0I(this.A04, r7.A04) && Util.A0I(this.A05, r7.A05) && this.A00 == r7.A00 && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A06 == r7.A06 && Util.A0I(this.A03, r7.A03))) {
                return false;
            }
        }
        return true;
    }

    public final int A00(int i) {
        int i2;
        C264764Re A002 = this.A03.A00(i);
        int i3 = -1;
        do {
            i3++;
            int[] iArr = A002.A00;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                return i3;
            }
        } while (i2 != 1);
        return i3;
    }

    public final long A01(int i, int i2) {
        return this.A03.A00(i).A01[i2];
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A04;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (217 + hashCode) * 31;
        Object obj2 = this.A05;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        long j = this.A01;
        long j2 = this.A02;
        return ((((((((((i2 + i) * 31) + this.A00) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.A06 ? 1 : 0)) * 31) + this.A03.hashCode();
    }
}
