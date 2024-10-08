package X;

/* renamed from: X.9IS  reason: invalid class name */
public final class AnonymousClass9IS extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;
    public final Object A0D;
    public final Object A0E;
    public final Object A0F;
    public final Object A0G;

    public AnonymousClass9IS(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, int i) {
        this.A00 = i;
        this.A04 = obj;
        this.A03 = obj2;
        this.A08 = obj3;
        this.A05 = obj4;
        this.A09 = obj5;
        this.A0G = obj6;
        this.A06 = obj7;
        this.A07 = obj8;
        this.A0F = obj9;
        this.A02 = obj10;
        this.A0E = obj11;
        this.A01 = obj12;
        this.A0B = obj13;
        this.A0A = obj14;
        this.A0C = obj15;
        this.A0D = obj16;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnonymousClass9IS)) {
                return false;
            }
            AnonymousClass9IS r3 = (AnonymousClass9IS) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A04, r3.A04) || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A08, r3.A08) || !0qQ.A0K(this.A05, r3.A05) || !0qQ.A0K(this.A09, r3.A09) || !0qQ.A0K(this.A0G, r3.A0G) || !0qQ.A0K(this.A06, r3.A06) || !0qQ.A0K(this.A07, r3.A07) || !0qQ.A0K(this.A0F, r3.A0F) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A0E, r3.A0E) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A0B, r3.A0B) || !0qQ.A0K(this.A0A, r3.A0A) || !0qQ.A0K(this.A0C, r3.A0C)) {
                return false;
            }
            obj2 = this.A0D;
            obj3 = r3.A0D;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AnonymousClass9IS)) {
                return false;
            }
            AnonymousClass9IS r32 = (AnonymousClass9IS) obj;
            if (r32.A00 != 0 || !0qQ.A0K(this.A07, r32.A07) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A08, r32.A08) || !0qQ.A0K(this.A09, r32.A09) || !0qQ.A0K(this.A06, r32.A06) || !0qQ.A0K(this.A0A, r32.A0A) || !0qQ.A0K(this.A0C, r32.A0C) || !0qQ.A0K(this.A0D, r32.A0D) || !0qQ.A0K(this.A01, r32.A01) || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A0G, r32.A0G) || !0qQ.A0K(this.A0B, r32.A0B) || !0qQ.A0K(this.A0E, r32.A0E) || !0qQ.A0K(this.A0F, r32.A0F)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = r32.A02;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        Object obj;
        if (this.A00 != 0) {
            hashCode = ((((((((((((((((((((((((((((this.A04.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0G.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0C.hashCode()) * 31;
            obj = this.A0D;
        } else {
            hashCode = ((((((((((((((((((((((((((((this.A07.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0C.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A0G.hashCode()) * 31) + this.A0B.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A0F.hashCode()) * 31;
            obj = this.A02;
        }
        return hashCode + obj.hashCode();
    }
}
