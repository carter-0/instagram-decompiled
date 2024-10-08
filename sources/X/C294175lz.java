package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.5lz  reason: invalid class name and case insensitive filesystem */
public final class C294175lz extends AnonymousClass0T0 {
    public final C263944Ny A00;
    public final Boolean A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;

    public C294175lz(C263944Ny r2, Boolean bool, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, Map map5) {
        0qQ.A0B(map, 2);
        this.A03 = list;
        this.A07 = map;
        this.A08 = map2;
        this.A09 = map3;
        this.A0A = map4;
        this.A02 = list2;
        this.A04 = list3;
        this.A05 = list4;
        this.A00 = r2;
        this.A01 = bool;
        this.A06 = map5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C294175lz) {
                C294175lz r5 = (C294175lz) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A03;
        int i = 0;
        int hashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.A07.hashCode()) * 31;
        Map map = this.A08;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.A09;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.A0A;
        int hashCode4 = (hashCode3 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list2 = this.A02;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A04;
        int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A05;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        C263944Ny r0 = this.A00;
        int hashCode8 = (hashCode7 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map map4 = this.A06;
        if (map4 != null) {
            i = map4.hashCode();
        }
        return hashCode9 + i;
    }
}
