package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class N3R extends AnonymousClass0T0 {
    public final int A00;
    public final GMQ A01;
    public final C68193N5i A02;
    public final C69285Nil A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final ArrayList A0B;
    public final List A0C;
    public final List A0D;
    public final List A0E;
    public final List A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3R) {
                N3R n3r = (N3R) obj;
                if (!0qQ.A0K(this.A0E, n3r.A0E) || !0qQ.A0K(this.A0C, n3r.A0C) || !0qQ.A0K(this.A0F, n3r.A0F) || !0qQ.A0K(this.A0D, n3r.A0D) || !0qQ.A0K(this.A0A, n3r.A0A) || !0qQ.A0K(this.A09, n3r.A09) || !0qQ.A0K(this.A04, n3r.A04) || !0qQ.A0K(this.A06, n3r.A06) || !0qQ.A0K(this.A07, n3r.A07) || !0qQ.A0K(this.A02, n3r.A02) || !0qQ.A0K(this.A01, n3r.A01) || this.A03 != n3r.A03 || this.A00 != n3r.A00 || this.A0G != n3r.A0G || this.A0H != n3r.A0H || !0qQ.A0K(this.A08, n3r.A08) || !0qQ.A0K(this.A0B, n3r.A0B) || !0qQ.A0K(this.A05, n3r.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0C, AnonymousClass7TE.A0K(this.A0E));
        return ((((AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0G, (((((((((((((((((((AnonymousClass7TF.A07(this.A0F, A072) + AnonymousClass7TG.A0C(this.A0D)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A00) * 31)) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TE.A0L(this.A05);
    }

    public N3R(GMQ gmq, C68193N5i n5i, C69285Nil nil, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, ArrayList arrayList, List list, List list2, List list3, List list4, int i, boolean z, boolean z2) {
        this.A0E = list;
        this.A0C = list2;
        this.A0F = list3;
        this.A0D = list4;
        this.A0A = str;
        this.A09 = str2;
        this.A04 = user;
        this.A06 = bool;
        this.A07 = bool2;
        this.A02 = n5i;
        this.A01 = gmq;
        this.A03 = nil;
        this.A00 = i;
        this.A0G = z;
        this.A0H = z2;
        this.A08 = bool3;
        this.A0B = arrayList;
        this.A05 = bool4;
    }
}
