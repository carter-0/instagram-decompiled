package X;

import java.util.List;

/* renamed from: X.7P6  reason: invalid class name */
public final class AnonymousClass7P6 extends AnonymousClass0T0 {
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final AnonymousClass0eM A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7P6) {
                AnonymousClass7P6 r5 = (AnonymousClass7P6) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A02;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A04;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Long l = this.A01;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A00;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A05;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode5 + i;
    }

    public AnonymousClass7P6(Long l, Long l2, String str, String str2, List list, List list2) {
        this.A02 = str;
        this.A04 = list;
        this.A01 = l;
        this.A00 = l2;
        this.A03 = str2;
        this.A05 = list2;
        this.A06 = AnonymousClass0eN.A01(new AnonymousClass9L9(this, 5));
    }

    public AnonymousClass7P6() {
        this((Long) null, (Long) null, (String) null, (String) null, (List) null, (List) null);
    }
}
