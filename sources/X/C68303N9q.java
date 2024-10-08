package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.N9q  reason: case insensitive filesystem */
public final class C68303N9q extends AnonymousClass0T0 implements AnonymousClass170 {
    public final User A00;
    public final String A01;
    public final AnonymousClass0eM A02 = C73907Pli.A00(this, 23);
    public final AnonymousClass0eM A03 = C73907Pli.A00(this, 24);
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C68303N9q(User user, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        0qQ.A0B(user, 1);
        this.A00 = user;
        this.A07 = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A04 = z4;
        this.A09 = z5;
        this.A0D = z6;
        this.A0C = z7;
        this.A0B = z8;
        this.A05 = z9;
        this.A0F = z10;
        this.A0E = z11;
        this.A06 = z12;
        this.A01 = str;
    }

    public final FollowStatus B6o() {
        return this.A00.B6o();
    }

    public final String B8Q() {
        return this.A00.B8Q();
    }

    public final int BIW() {
        return this.A00.BIW();
    }

    public final Long BST() {
        return this.A00.BST();
    }

    public final ImageUrl Bh3() {
        return this.A00.Bh3();
    }

    public final Integer Bjj() {
        return this.A00.Bjj();
    }

    public final boolean CPV() {
        return this.A00.CPV();
    }

    public final boolean CPm() {
        return this.A00.CPm();
    }

    public final boolean CQp(C317986oA r2) {
        return this.A00.CQp(r2);
    }

    public final boolean CXO() {
        return this.A00.CXO();
    }

    public final boolean CXR() {
        return this.A00.CXR();
    }

    public final boolean Cdl() {
        return this.A00.Cdl();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68303N9q) {
                C68303N9q n9q = (C68303N9q) obj;
                if (!(0qQ.A0K(this.A00, n9q.A00) && this.A07 == n9q.A07 && this.A08 == n9q.A08 && this.A0A == n9q.A0A && this.A04 == n9q.A04 && this.A09 == n9q.A09 && this.A0D == n9q.A0D && this.A0C == n9q.A0C && this.A0B == n9q.A0B && this.A05 == n9q.A05 && this.A0F == n9q.A0F && this.A0E == n9q.A0E && this.A06 == n9q.A06 && 0qQ.A0K(this.A01, n9q.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getFullName() {
        return this.A00.getFullName();
    }

    public final String getId() {
        return this.A00.getId();
    }

    public final String getShortName() {
        return this.A00.getShortName();
    }

    public final String getUsername() {
        return this.A00.getUsername();
    }

    public final boolean isConnected() {
        return this.A00.isConnected();
    }

    public final boolean isRestricted() {
        return this.A00.isRestricted();
    }

    public final boolean isVerified() {
        return this.A00.isVerified();
    }

    public final boolean COa() {
        return this.A00.A06;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A09, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A08, AnonymousClass7TF.A09(this.A07, AnonymousClass7TE.A0K(this.A00))))))))))))) + AnonymousClass7TG.A0E(this.A01);
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C68303N9q) it.next()).A00);
    }
}
