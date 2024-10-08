package X;

import java.util.ArrayList;

/* renamed from: X.5jj  reason: invalid class name and case insensitive filesystem */
public final class C292915jj extends AnonymousClass0T0 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final String A06;
    public final String A07;
    public final ArrayList A08;

    public C292915jj() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535);
    }

    public /* synthetic */ C292915jj(Long l, String str, String str2, String str3, String str4, String str5, int i) {
        ArrayList arrayList;
        String str6 = "";
        str = (i & 1) != 0 ? str6 : str;
        str6 = (i & 2) == 0 ? str2 : str6;
        if ((i & 4) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        l = (i & 8) != 0 ? 0L : l;
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 1024) != 0 ? null : str5;
        0qQ.A0B(str, 1);
        0qQ.A0B(str6, 2);
        this.A07 = str;
        this.A03 = str6;
        this.A08 = arrayList;
        this.A00 = l;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = null;
        this.A06 = str5;
        this.A04 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C292915jj) {
                C292915jj r5 = (C292915jj) obj;
                if (!0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A07.hashCode() * 31) + this.A03.hashCode()) * 31;
        ArrayList arrayList = this.A08;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Long l = this.A00;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A02;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31 * 31 * 31 * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31 * 31 * 31 * 31;
        String str5 = this.A04;
        return (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
    }
}
