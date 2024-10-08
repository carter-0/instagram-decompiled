package X;

/* renamed from: X.Nc5  reason: case insensitive filesystem */
public final class C68976Nc5 extends C3260875i {
    public final String A00;
    public final int A01;
    public final AnonymousClass7OS A02;
    public final AnonymousClass7OR A03;
    public final Integer A04;
    public final String A05;

    public C68976Nc5(AnonymousClass7OS r2, AnonymousClass7OR r3, Integer num, String str, String str2, int i) {
        C51973G9u.A0r(1, str, r2, r3);
        this.A00 = str;
        this.A05 = str2;
        this.A01 = i;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68976Nc5) {
                C68976Nc5 nc5 = (C68976Nc5) obj;
                if (!0qQ.A0K(this.A00, nc5.A00) || !0qQ.A0K(this.A05, nc5.A05) || this.A01 != nc5.A01 || this.A02 != nc5.A02 || this.A03 != nc5.A03 || !0qQ.A0K(this.A04, nc5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int A00() {
        return this.A01;
    }

    public final AnonymousClass7OS A01() {
        return this.A02;
    }

    public final AnonymousClass7OR A02() {
        return this.A03;
    }

    public final Integer A03() {
        return this.A04;
    }

    public final String A04() {
        return this.A05;
    }

    public final String A05() {
        return this.A00;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A02, (((AnonymousClass7TE.A0O(this.A00) + AnonymousClass7TG.A0E(this.A05)) * 31) + this.A01) * 31)) + AnonymousClass7TE.A0L(this.A04)) * 31) + C54732HQn.A00();
    }
}
