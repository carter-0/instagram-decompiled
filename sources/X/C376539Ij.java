package X;

import com.instagram.model.showreel.IgShowreelComposition;
import java.util.List;

/* renamed from: X.9Ij  reason: invalid class name and case insensitive filesystem */
public final class C376539Ij extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376539Ij(java.lang.Integer r9, java.lang.Integer r10, java.lang.Integer r11, java.lang.Integer r12, int r13) {
        /*
            r8 = this;
            r7 = r12
            r6 = r11
            r5 = r10
            r4 = r9
            r2 = 0
            r0 = 0
            r1 = r8
            r8.A00 = r0
            r3 = r2
            r0 = r13 & 1
            if (r0 == 0) goto L_0x000f
            r4 = r2
        L_0x000f:
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0014
            r5 = r2
        L_0x0014:
            r0 = r13 & 4
            if (r0 == 0) goto L_0x0019
            r6 = r2
        L_0x0019:
            r0 = r13 & 8
            if (r0 == 0) goto L_0x001e
            r7 = r2
        L_0x001e:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x0024
            X.7QM r3 = X.AnonymousClass7QM.UNSPECIFIED
        L_0x0024:
            r1.<init>((X.AnonymousClass7QO) r2, (X.AnonymousClass7QM) r3, (java.lang.Integer) r4, (java.lang.Integer) r5, (java.lang.Integer) r6, (java.lang.Integer) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376539Ij.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, int):void");
    }

    public final boolean equals(Object obj) {
        C376539Ij r3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C376539Ij)) {
                    return false;
                }
                C376539Ij r32 = (C376539Ij) obj;
                if (r32.A00 != 0 || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A02, r32.A02) || !0qQ.A0K(this.A05, r32.A05) || this.A06 != r32.A06) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376539Ij) {
                    r3 = (C376539Ij) obj;
                    if (r3.A00 == 1 && 0qQ.A0K(this.A01, r3.A01) && 0qQ.A0K(this.A04, r3.A04) && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A02, r3.A02)) {
                        obj2 = this.A06;
                        obj3 = r3.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376539Ij) {
                    r3 = (C376539Ij) obj;
                    if (r3.A00 == 2 && 0qQ.A0K(this.A06, r3.A06) && 0qQ.A0K(this.A02, r3.A02) && 0qQ.A0K(this.A03, r3.A03) && 0qQ.A0K(this.A01, r3.A01)) {
                        obj2 = this.A04;
                        obj3 = r3.A04;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C376539Ij) {
                    C376539Ij r33 = (C376539Ij) obj;
                    if (r33.A00 == 3 && 0qQ.A0K(this.A06, r33.A06) && 0qQ.A0K(this.A05, r33.A05) && 0qQ.A0K(this.A02, r33.A02) && 0qQ.A0K(this.A04, r33.A04) && 0qQ.A0K(this.A03, r33.A03)) {
                        obj4 = this.A01;
                        obj5 = r33.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        obj4 = this.A05;
        obj5 = r3.A05;
        if (!0qQ.A0K(obj4, obj5)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        switch (this.A00) {
            case 0:
                Object obj2 = this.A04;
                int i2 = 0;
                if (obj2 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = obj2.hashCode();
                }
                int i3 = hashCode6 * 31;
                Object obj3 = this.A01;
                if (obj3 == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = obj3.hashCode();
                }
                int i4 = (i3 + hashCode7) * 31;
                Object obj4 = this.A03;
                if (obj4 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = obj4.hashCode();
                }
                int i5 = (i4 + hashCode8) * 31;
                Object obj5 = this.A02;
                if (obj5 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = obj5.hashCode();
                }
                int i6 = (i5 + hashCode9) * 31;
                Object obj6 = this.A05;
                if (obj6 != null) {
                    i2 = obj6.hashCode();
                }
                hashCode = (i6 + i2) * 31;
                obj = this.A06;
                break;
            case 1:
                int hashCode12 = this.A01.hashCode() * 31;
                Object obj7 = this.A04;
                hashCode = 0;
                if (obj7 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = obj7.hashCode();
                }
                int i7 = (hashCode12 + hashCode2) * 31;
                Object obj8 = this.A03;
                if (obj8 == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = obj8.hashCode();
                }
                int i8 = (i7 + hashCode3) * 31;
                Object obj9 = this.A02;
                if (obj9 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = obj9.hashCode();
                }
                int i9 = (i8 + hashCode4) * 31;
                Object obj10 = this.A06;
                if (obj10 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = obj10.hashCode();
                }
                i = (i9 + hashCode5) * 31;
                Object obj11 = this.A05;
                if (obj11 != null) {
                    hashCode = obj11.hashCode();
                    break;
                }
                break;
            case 2:
                hashCode = ((((((((this.A06.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31;
                obj = this.A05;
                break;
            default:
                Object obj12 = this.A06;
                int i10 = 0;
                if (obj12 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = obj12.hashCode();
                }
                int i11 = hashCode10 * 31;
                Object obj13 = this.A05;
                if (obj13 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = obj13.hashCode();
                }
                int hashCode13 = (((((i11 + hashCode11) * 31) + this.A02.hashCode()) * 31) + this.A04.hashCode()) * 31;
                Object obj14 = this.A03;
                if (obj14 != null) {
                    i10 = obj14.hashCode();
                }
                hashCode = (hashCode13 + i10) * 31;
                obj = this.A01;
                break;
        }
        i = obj.hashCode();
        return i + hashCode;
    }

    public C376539Ij(AnonymousClass7QO r2, AnonymousClass7QM r3, Integer num, Integer num2, Integer num3, Integer num4) {
        0qQ.A0B(r3, 6);
        this.A04 = num;
        this.A01 = num2;
        this.A03 = num3;
        this.A02 = num4;
        this.A05 = r2;
        this.A06 = r3;
    }

    public C376539Ij(C61063Jw1 jw1, AnonymousClass4A9 r3, AnonymousClass4AS r4, Integer num, List list, List list2) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = num;
        this.A06 = jw1;
        this.A05 = list2;
    }

    public C376539Ij(C62320sa r2, 0sP r3, 0sP r4, 0sP r5, 0sP r6, 0sP r7) {
        this.A06 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r2;
        this.A04 = r6;
        this.A05 = r7;
    }

    public C376539Ij(AnonymousClass9J3 r2, C53400GnX gnX, AnonymousClass6L7 r4, 1Xj r5, AnonymousClass3W1 r6, IgShowreelComposition igShowreelComposition) {
        this.A06 = r4;
        this.A05 = igShowreelComposition;
        this.A02 = r5;
        this.A04 = r6;
        this.A03 = r2;
        this.A01 = gnX;
    }
}
