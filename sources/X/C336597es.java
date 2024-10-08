package X;

import java.util.Arrays;

/* renamed from: X.7es  reason: invalid class name and case insensitive filesystem */
public final class C336597es extends AnonymousClass0T0 {
    public final float A00;
    public final float A01;
    public final C251263mp A02;
    public final Object A03;
    public final C62320sa A04;
    public final boolean A05;
    public final Object[] A06;

    public C336597es(C251263mp r2, Object obj, C62320sa r4, Object[] objArr, float f, float f2, boolean z) {
        0qQ.A0B(obj, 1);
        this.A03 = obj;
        this.A02 = r2;
        this.A04 = r4;
        this.A05 = z;
        this.A01 = f;
        this.A00 = f2;
        this.A06 = objArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C336597es) {
                C336597es r5 = (C336597es) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || this.A05 != r5.A05 || Float.compare(this.A01, r5.A01) != 0 || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.A03.hashCode() * 31;
        C251263mp r0 = this.A02;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i = (hashCode4 + hashCode) * 31;
        C62320sa r02 = this.A04;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int A002 = (((i + hashCode2) * 31) + C54732HQn.A00()) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int floatToIntBits = (((((A002 + i2) * 31 * 31) + Float.floatToIntBits(this.A01)) * 31) + Float.floatToIntBits(this.A00)) * 31;
        Object[] objArr = this.A06;
        if (objArr == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = Arrays.hashCode(objArr);
        }
        return (floatToIntBits + hashCode3) * 31 * 31;
    }
}
