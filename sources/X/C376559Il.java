package X;

import com.instagram.api.schemas.RIXUChainingSourceType;
import com.instagram.api.schemas.RIXUCoverChainingType;
import java.util.List;

/* renamed from: X.9Il  reason: invalid class name and case insensitive filesystem */
public final class C376559Il extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public C376559Il(RIXUChainingSourceType rIXUChainingSourceType, RIXUCoverChainingType rIXUCoverChainingType, Boolean bool, Boolean bool2, Boolean bool3, Integer num, List list) {
        0qQ.A0B(list, 6);
        this.A01 = rIXUCoverChainingType;
        this.A02 = rIXUChainingSourceType;
        this.A03 = bool;
        this.A04 = bool2;
        this.A05 = bool3;
        this.A06 = list;
        this.A07 = num;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C376559Il)) {
                return false;
            }
            C376559Il r3 = (C376559Il) obj;
            if (r3.A00 != 1 || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A05, r3.A05) || !0qQ.A0K(this.A06, r3.A06) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A07, r3.A07) || !0qQ.A0K(this.A04, r3.A04)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = r3.A03;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C376559Il)) {
                return false;
            }
            C376559Il r32 = (C376559Il) obj;
            if (r32.A00 != 0 || this.A01 != r32.A01 || this.A02 != r32.A02 || !0qQ.A0K(this.A03, r32.A03) || !0qQ.A0K(this.A04, r32.A04) || !0qQ.A0K(this.A05, r32.A05) || !0qQ.A0K(this.A06, r32.A06)) {
                return false;
            }
            obj2 = this.A07;
            obj3 = r32.A07;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        if (this.A00 != 0) {
            return (((((((((((this.A02.hashCode() * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode();
        }
        Object obj = this.A01;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        Object obj2 = this.A02;
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Object obj3 = this.A03;
        if (obj3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj4 = this.A04;
        if (obj4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Object obj5 = this.A05;
        if (obj5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = obj5.hashCode();
        }
        int hashCode6 = (((i5 + hashCode5) * 31) + this.A06.hashCode()) * 31;
        Object obj6 = this.A07;
        if (obj6 != null) {
            i = obj6.hashCode();
        }
        return hashCode6 + i;
    }

    public C376559Il(C62320sa r2, C62320sa r3, C62320sa r4, 0sP r5, 0sL r6, 0sL r7, 0sL r8) {
        this.A02 = r2;
        this.A05 = r5;
        this.A06 = r3;
        this.A01 = r6;
        this.A07 = r7;
        this.A04 = r8;
        this.A03 = r4;
    }
}
