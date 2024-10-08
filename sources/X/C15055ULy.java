package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.ULy  reason: case insensitive filesystem */
public final class C15055ULy extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public final int A09;

    public C15055ULy(C61079JwH jwH, int i) {
        this.A09 = 1;
        jwH = (i & 32) != 0 ? null : jwH;
        this.A09 = 1;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = jwH;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A09 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C15055ULy)) {
                return false;
            }
            C15055ULy uLy = (C15055ULy) obj;
            if (uLy.A09 != 1 || !0qQ.A0K(this.A08, uLy.A08) || !0qQ.A0K(this.A02, uLy.A02) || !0qQ.A0K(this.A01, uLy.A01) || !0qQ.A0K(this.A04, uLy.A04) || !0qQ.A0K(this.A03, uLy.A03) || !0qQ.A0K(this.A00, uLy.A00) || !0qQ.A0K(this.A07, uLy.A07) || !0qQ.A0K(this.A06, uLy.A06)) {
                return false;
            }
            obj2 = this.A05;
            obj3 = uLy.A05;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C15055ULy)) {
                return false;
            }
            C15055ULy uLy2 = (C15055ULy) obj;
            if (uLy2.A09 != 0 || !0qQ.A0K(this.A01, uLy2.A01) || !0qQ.A0K(this.A02, uLy2.A02) || !0qQ.A0K(this.A03, uLy2.A03) || !0qQ.A0K(this.A04, uLy2.A04) || !0qQ.A0K(this.A07, uLy2.A07) || !0qQ.A0K(this.A08, uLy2.A08) || !0qQ.A0K(this.A00, uLy2.A00) || !0qQ.A0K(this.A05, uLy2.A05)) {
                return false;
            }
            obj2 = this.A06;
            obj3 = uLy2.A06;
        }
        if (!0qQ.A0K(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072;
        int A0L;
        if (this.A09 != 0) {
            A072 = ((((((((((((((AnonymousClass7TG.A0C(this.A08) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A05);
        } else {
            A072 = (((AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, AnonymousClass7TG.A0C(this.A01) * 31))))) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31;
            A0L = AnonymousClass7TE.A0L(this.A06);
        }
        return A072 + A0L;
    }

    public C15055ULy(Integer num, Long l, Long l2, Long l3, List list, List list2, List list3, List list4, Map map) {
        this.A09 = 0;
        C51974G9v.A1S(map, list, list2, list3, list4);
        this.A01 = num;
        this.A02 = map;
        this.A03 = list;
        this.A04 = list2;
        this.A07 = list3;
        this.A08 = list4;
        this.A00 = l;
        this.A05 = l2;
        this.A06 = l3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15055ULy(java.lang.Integer r2, java.lang.Long r3, java.lang.Long r4, java.lang.Long r5, java.util.List r6, java.util.List r7, java.util.List r8, java.util.List r9, java.util.Map r10, kotlin.jvm.internal.DefaultConstructorMarker r11, int r12, int r13) {
        /*
            r1 = this;
            r0 = 0
            r1.A09 = r0
            r2 = 0
            X.0sm r10 = X.0Yt.A0E()
            X.0sn r6 = X.0sn.A00
            r3 = r2
            r4 = r2
            r5 = r2
            r7 = r6
            r8 = r6
            r9 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15055ULy.<init>(java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Long, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, kotlin.jvm.internal.DefaultConstructorMarker, int, int):void");
    }

    public C15055ULy() {
        this.A09 = 1;
        this.A09 = 1;
        this.A09 = 1;
        this.A08 = null;
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
    }
}
