package X;

import java.util.List;

/* renamed from: X.493  reason: invalid class name */
public final class AnonymousClass493 extends AnonymousClass0T0 implements C258043yN {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final AnonymousClass493 F1F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass493) {
                AnonymousClass493 r5 = (AnonymousClass493) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.A05;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.A02;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode5 + i;
    }

    public final Integer AzJ() {
        return this.A01;
    }

    public final String BGw() {
        return this.A03;
    }

    public final Boolean Bu4() {
        return this.A00;
    }

    public final List Bw6() {
        return this.A05;
    }

    public final String C71() {
        return this.A04;
    }

    public final Integer C77() {
        return this.A02;
    }

    public AnonymousClass493(Boolean bool, Integer num, Integer num2, String str, String str2, List list) {
        this.A01 = num;
        this.A03 = str;
        this.A00 = bool;
        this.A05 = list;
        this.A04 = str2;
        this.A02 = num2;
    }
}
