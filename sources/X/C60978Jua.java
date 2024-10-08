package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.Jua  reason: case insensitive filesystem */
public final class C60978Jua extends AnonymousClass0T0 {
    public final JXP A00;
    public final C266444Yx A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final boolean A0C;

    public C60978Jua(JXP jxp, C266444Yx r3, User user, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, List list6, boolean z) {
        0qQ.A0B(list4, 5);
        this.A02 = user;
        this.A06 = list;
        this.A0A = list2;
        this.A08 = list3;
        this.A07 = list4;
        this.A00 = jxp;
        this.A0B = list5;
        this.A09 = list6;
        this.A03 = str;
        this.A0C = z;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60978Jua) {
                C60978Jua jua = (C60978Jua) obj;
                if (!0qQ.A0K(this.A02, jua.A02) || !0qQ.A0K(this.A06, jua.A06) || !0qQ.A0K(this.A0A, jua.A0A) || !0qQ.A0K(this.A08, jua.A08) || !0qQ.A0K(this.A07, jua.A07) || this.A00 != jua.A00 || !0qQ.A0K(this.A0B, jua.A0B) || !0qQ.A0K(this.A09, jua.A09) || !0qQ.A0K(this.A03, jua.A03) || this.A0C != jua.A0C || !0qQ.A0K(this.A04, jua.A04) || !0qQ.A0K(this.A05, jua.A05) || !0qQ.A0K(this.A01, jua.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0B, AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A0A, AnonymousClass7TF.A07(this.A06, AnonymousClass7TG.A0C(this.A02) * 31))))));
        return ((((AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A07(this.A09, A072) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A01);
    }
}
