package X;

import android.content.Context;

/* renamed from: X.9Im  reason: invalid class name and case insensitive filesystem */
public final class C376569Im extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03 = 0;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public C376569Im(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
        this.A00 = bool;
        this.A01 = bool2;
        this.A05 = bool3;
        this.A07 = bool4;
        this.A06 = bool5;
        this.A08 = bool6;
        this.A04 = bool7;
        this.A02 = bool8;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A03 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376569Im)) {
                return false;
            }
            C376569Im r3 = (C376569Im) obj;
            if (r3.A03 != 1 || !0qQ.A0K(this.A00, r3.A00) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A05, r3.A05) || !0qQ.A0K(this.A07, r3.A07) || !0qQ.A0K(this.A06, r3.A06) || !0qQ.A0K(this.A08, r3.A08) || !0qQ.A0K(this.A04, r3.A04)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = r3.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376569Im)) {
                return false;
            }
            C376569Im r32 = (C376569Im) obj;
            if (r32.A03 != 0 || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A07, r32.A07) || !0qQ.A0K(this.A04, r32.A04)) {
                return false;
            }
            obj2 = this.A06;
            obj3 = r32.A06;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode;
        int hashCode2;
        int i2;
        Object obj;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        if (this.A03 != 0) {
            Object obj2 = this.A00;
            i = 0;
            if (obj2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = obj2.hashCode();
            }
            int i3 = hashCode3 * 31;
            Object obj3 = this.A01;
            if (obj3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = obj3.hashCode();
            }
            int i4 = (i3 + hashCode4) * 31;
            Object obj4 = this.A05;
            if (obj4 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = obj4.hashCode();
            }
            int i5 = (i4 + hashCode5) * 31;
            Object obj5 = this.A07;
            if (obj5 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = obj5.hashCode();
            }
            int i6 = (i5 + hashCode6) * 31;
            Object obj6 = this.A06;
            if (obj6 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = obj6.hashCode();
            }
            int i7 = (i6 + hashCode7) * 31;
            Object obj7 = this.A08;
            if (obj7 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = obj7.hashCode();
            }
            int i8 = (i7 + hashCode8) * 31;
            Object obj8 = this.A04;
            if (obj8 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = obj8.hashCode();
            }
            i2 = (i8 + hashCode9) * 31;
            obj = this.A02;
        } else {
            int hashCode10 = this.A05.hashCode() * 31;
            Object obj9 = this.A07;
            i = 0;
            if (obj9 == null) {
                hashCode = 0;
            } else {
                hashCode = obj9.hashCode();
            }
            int i9 = (hashCode10 + hashCode) * 31;
            Object obj10 = this.A04;
            if (obj10 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = obj10.hashCode();
            }
            i2 = (i9 + hashCode2) * 31;
            obj = this.A06;
        }
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public C376569Im(Context context, C58840Ae r3, 1vo r4, 1vl r5) {
        this.A05 = context;
        this.A07 = r3;
        this.A04 = r5;
        this.A06 = r4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C376569Im(java.lang.Boolean r11, java.lang.Boolean r12, java.lang.Boolean r13, java.lang.Boolean r14, java.lang.Boolean r15, java.lang.Boolean r16, java.lang.Boolean r17, int r18) {
        /*
            r10 = this;
            r8 = r17
            r7 = r16
            r6 = r15
            r5 = r14
            r4 = r13
            r3 = r12
            r2 = r11
            r9 = 0
            r0 = 1
            r1 = r10
            r10.A03 = r0
            r0 = r18 & 1
            if (r0 == 0) goto L_0x0013
            r2 = r9
        L_0x0013:
            r0 = r18 & 2
            if (r0 == 0) goto L_0x0018
            r3 = r9
        L_0x0018:
            r0 = r18 & 4
            if (r0 == 0) goto L_0x001d
            r4 = r9
        L_0x001d:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0022
            r5 = r9
        L_0x0022:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0027
            r6 = r9
        L_0x0027:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x002c
            r7 = r9
        L_0x002c:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x0031
            r8 = r9
        L_0x0031:
            r1.<init>((java.lang.Boolean) r2, (java.lang.Boolean) r3, (java.lang.Boolean) r4, (java.lang.Boolean) r5, (java.lang.Boolean) r6, (java.lang.Boolean) r7, (java.lang.Boolean) r8, (java.lang.Boolean) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376569Im.<init>(java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean, int):void");
    }
}
