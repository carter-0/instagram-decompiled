package X;

import java.util.List;

/* renamed from: X.Gmk  reason: case insensitive filesystem */
public final class C53360Gmk extends AnonymousClass0T0 {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public C53360Gmk(String str, String str2, String str3, List list, List list2, List list3) {
        0qQ.A0B(str, 1);
        C51974G9v.A1S(list, str2, list2, str3, list3);
        this.A04 = str;
        this.A01 = list;
        this.A06 = str2;
        this.A03 = list2;
        this.A05 = str3;
        this.A02 = list3;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53360Gmk)) {
                return false;
            }
            C53360Gmk gmk = (C53360Gmk) obj;
            if (gmk.A00 != 1 || !0qQ.A0K(this.A04, gmk.A04) || !0qQ.A0K(this.A01, gmk.A01) || !0qQ.A0K(this.A06, gmk.A06) || !0qQ.A0K(this.A03, gmk.A03) || !0qQ.A0K(this.A05, gmk.A05)) {
                return false;
            }
            obj2 = this.A02;
            obj3 = gmk.A02;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C53360Gmk)) {
                return false;
            }
            C53360Gmk gmk2 = (C53360Gmk) obj;
            if (gmk2.A00 != 0 || !0qQ.A0K(this.A04, gmk2.A04) || !0qQ.A0K(this.A01, gmk2.A01) || !0qQ.A0K(this.A05, gmk2.A05) || !0qQ.A0K(this.A06, gmk2.A06) || !0qQ.A0K(this.A02, gmk2.A02)) {
                return false;
            }
            obj2 = this.A03;
            obj3 = gmk2.A03;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            return (((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
        }
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0O(this.A04))))));
    }

    public C53360Gmk(Integer num, Integer num2, String str, String str2, String str3, List list) {
        this.A04 = str;
        this.A01 = num;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = list;
        this.A03 = num2;
    }
}
