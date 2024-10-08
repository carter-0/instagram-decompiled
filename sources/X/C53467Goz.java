package X;

import com.instagram.api.schemas.LineType;
import com.instagram.api.schemas.ThreadItemType;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Goz  reason: case insensitive filesystem */
public final class C53467Goz extends AnonymousClass0T0 implements C59639JRh {
    public final LineType A00;
    public final ThreadItemType A01;
    public final 1Xj A02;
    public final User A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53467Goz) {
                C53467Goz goz = (C53467Goz) obj;
                if (this.A09 != goz.A09 || !0qQ.A0K(this.A07, goz.A07) || !0qQ.A0K(this.A04, goz.A04) || !0qQ.A0K(this.A05, goz.A05) || this.A00 != goz.A00 || !0qQ.A0K(this.A02, goz.A02) || !0qQ.A0K(this.A08, goz.A08) || !0qQ.A0K(this.A03, goz.A03) || this.A0A != goz.A0A || !0qQ.A0K(this.A06, goz.A06) || this.A01 != goz.A01 || !0qQ.A0K(this.A0B, goz.A0B)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A00, (((((C51965G9l.A05(this.A09) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31));
        boolean z = this.A0A;
        return AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A08, A072) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + C41845B3m.A00(this.A0B);
    }

    public C53467Goz(LineType lineType, ThreadItemType threadItemType, 1Xj r4, User user, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, List list, boolean z, boolean z2) {
        C51974G9v.A1N(lineType, r4, list);
        0qQ.A0B(threadItemType, 11);
        this.A09 = z;
        this.A07 = str;
        this.A04 = bool;
        this.A05 = bool2;
        this.A00 = lineType;
        this.A02 = r4;
        this.A08 = list;
        this.A03 = user;
        this.A0A = z2;
        this.A06 = bool3;
        this.A01 = threadItemType;
        this.A0B = str2;
    }
}
