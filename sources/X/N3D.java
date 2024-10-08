package X;

import com.instagram.api.schemas.ThreadThemeType;
import java.util.List;

public final class N3D extends AnonymousClass0T0 {
    public final long A00;
    public final AnonymousClass9JL A01;
    public final ThreadThemeType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final C370668wr A09;
    public final boolean A0A;

    public N3D(AnonymousClass9JL r2, C370668wr r3, ThreadThemeType threadThemeType, String str, String str2, String str3, String str4, List list, List list2, long j, boolean z) {
        AnonymousClass7TG.A0w(1, list, str, list2);
        AnonymousClass7TF.A1F(str2, 6, str3);
        0qQ.A0B(threadThemeType, 11);
        this.A07 = list;
        this.A01 = r2;
        this.A03 = str;
        this.A08 = list2;
        this.A09 = r3;
        this.A04 = str2;
        this.A0A = z;
        this.A05 = str3;
        this.A06 = str4;
        this.A00 = j;
        this.A02 = threadThemeType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3D) {
                N3D n3d = (N3D) obj;
                if (!0qQ.A0K(this.A07, n3d.A07) || !0qQ.A0K(this.A01, n3d.A01) || !0qQ.A0K(this.A03, n3d.A03) || !0qQ.A0K(this.A08, n3d.A08) || !0qQ.A0K(this.A09, n3d.A09) || !0qQ.A0K(this.A04, n3d.A04) || this.A0A != n3d.A0A || !0qQ.A0K(this.A05, n3d.A05) || !0qQ.A0K(this.A06, n3d.A06) || this.A00 != n3d.A00 || this.A02 != n3d.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A082 = AnonymousClass7TF.A08(this.A03, (AnonymousClass7TE.A0K(this.A07) + AnonymousClass7TG.A0C(this.A01)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A08(this.A04, (AnonymousClass7TF.A07(this.A08, A082) + AnonymousClass7TG.A0C(this.A09)) * 31));
        return AnonymousClass7TE.A0N(this.A02, C51972G9s.A07(this.A00, (AnonymousClass7TF.A08(this.A05, A092) + C41845B3m.A00(this.A06)) * 31));
    }
}
