package X;

import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JxP  reason: case insensitive filesystem */
public final class C61113JxP extends AnonymousClass0T0 implements MWK {
    public final int A00;
    public final long A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final Boolean A09;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61113JxP) {
                C61113JxP jxP = (C61113JxP) obj;
                if (this.A01 != jxP.A01 || !0qQ.A0K(this.A03, jxP.A03) || this.A07 != jxP.A07 || !0qQ.A0K(this.A02, jxP.A02) || this.A08 != jxP.A08 || !0qQ.A0K(this.A09, jxP.A09) || this.A00 != jxP.A00 || !0qQ.A0K(this.A04, jxP.A04) || !0qQ.A0K(this.A05, jxP.A05) || !0qQ.A0K(this.A06, jxP.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C61113JxP(Boolean bool, Boolean bool2, String str, String str2, List list, List list2, int i, long j, boolean z, boolean z2) {
        AnonymousClass7TF.A1G(str2, 8, list);
        this.A01 = j;
        this.A03 = str;
        this.A07 = z;
        this.A02 = bool;
        this.A08 = z2;
        this.A09 = bool2;
        this.A00 = i;
        this.A04 = str2;
        this.A05 = list;
        this.A06 = list2;
    }

    public final int hashCode() {
        boolean z = this.A07;
        boolean z2 = this.A08;
        return AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A08(this.A04, (((AnonymousClass7TF.A09(z2, (AnonymousClass7TF.A09(z, (C51975G9x.A03(this.A01) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A09)) * 31) + this.A00) * 31)) + AnonymousClass7TE.A0L(this.A06);
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        C61113JxP jxP = (C61113JxP) ((MWK) it.next());
        abstractCollection.add(new AudienceListViewModel(String.valueOf(jxP.A01), jxP.A04, jxP.A05, jxP.A00, jxP.A07, jxP.A08, false));
    }
}
