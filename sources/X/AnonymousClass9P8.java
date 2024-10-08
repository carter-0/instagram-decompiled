package X;

import java.util.List;

/* renamed from: X.9P8  reason: invalid class name */
public final class AnonymousClass9P8 extends AnonymousClass0T0 {
    public Boolean A00;
    public List A01;
    public final long A02;
    public final C379289Tg A03;
    public final AnonymousClass804 A04;
    public final AnonymousClass804 A05;
    public final AnonymousClass8JI A06;
    public final C369458un A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public AnonymousClass9P8(C379289Tg r2, AnonymousClass804 r3, AnonymousClass8JI r4, C369458un r5, Boolean bool, String str, String str2, String str3, List list, long j) {
        AnonymousClass7TG.A0w(1, str, str2, r2);
        0qQ.A0B(str3, 5);
        this.A09 = str;
        this.A02 = j;
        this.A0A = str2;
        this.A03 = r2;
        this.A08 = str3;
        this.A00 = bool;
        this.A01 = list;
        this.A06 = r4;
        this.A05 = r3;
        this.A07 = r5;
        this.A04 = r3 == null ? null : r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9P8) {
                AnonymousClass9P8 r8 = (AnonymousClass9P8) obj;
                if (!0qQ.A0K(this.A09, r8.A09) || this.A02 != r8.A02 || !0qQ.A0K(this.A0A, r8.A0A) || this.A03 != r8.A03 || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A00, r8.A00) || !0qQ.A0K(this.A01, r8.A01) || this.A06 != r8.A06 || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A01(this.A02, AnonymousClass7TE.A0O(this.A09))))) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }
}
