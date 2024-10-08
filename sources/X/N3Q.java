package X;

import com.facebook.android.maps.model.LatLng;
import com.instagram.user.model.User;

public final class N3Q extends AnonymousClass0T0 {
    public final int A00;
    public final long A01;
    public final LatLng A02;
    public final AnonymousClass4AB A03;
    public final User A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        N3Q n3q;
        if (obj instanceof N3Q) {
            n3q = (N3Q) obj;
        } else {
            n3q = null;
        }
        if (n3q != null && 0qQ.A0K(this.A09, n3q.A09) && this.A0E == n3q.A0E && this.A0C == n3q.A0C && this.A0B == n3q.A0B && this.A05 == n3q.A05) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        LatLng latLng = this.A02;
        int A092 = AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0D, C51972G9s.A07(this.A01, AnonymousClass7TF.A07(this.A04, (AnonymousClass7TF.A07(latLng, (AnonymousClass7TE.A0O(this.A09) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31))))));
        return ((AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0B, (((AnonymousClass7TF.A09(this.A0C, A092) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31)) + C41845B3m.A00(this.A06)) * 31) + C48908Em8.A00(this.A05);
    }

    public N3Q(LatLng latLng, AnonymousClass4AB r3, User user, Integer num, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A09 = str;
        this.A08 = str2;
        this.A02 = latLng;
        this.A03 = r3;
        this.A04 = user;
        this.A01 = j;
        this.A0D = z;
        this.A0E = z2;
        this.A0F = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A00 = i;
        this.A07 = str3;
        this.A0B = z6;
        this.A0G = z7;
        this.A06 = str4;
        this.A05 = num;
    }
}
