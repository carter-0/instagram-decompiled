package X;

/* renamed from: X.75h  reason: invalid class name and case insensitive filesystem */
public final class C3260775h extends C3260875i {
    public final int A00;
    public final AnonymousClass7OS A01;
    public final AnonymousClass7OR A02;
    public final Integer A03;
    public final String A04;
    public final String A05;

    public C3260775h(AnonymousClass7OS r2, AnonymousClass7OR r3, Integer num, String str, String str2, int i) {
        0qQ.A0B(str, 1);
        0qQ.A0B(r2, 4);
        0qQ.A0B(r3, 5);
        this.A05 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3260775h) {
                C3260775h r5 = (C3260775h) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A00) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        Integer num = this.A03;
        return (hashCode + (num == null ? 0 : num.hashCode())) * 31;
    }
}
