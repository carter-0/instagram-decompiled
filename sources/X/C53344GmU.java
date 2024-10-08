package X;

import java.util.List;

/* renamed from: X.GmU  reason: case insensitive filesystem */
public final class C53344GmU extends AnonymousClass0T0 {
    public final Integer A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public C53344GmU(Integer num, List list, List list2, List list3, boolean z, boolean z2) {
        0qQ.A0B(list, 1);
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        this.A04 = z;
        this.A00 = num;
        this.A05 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53344GmU) {
                C53344GmU gmU = (C53344GmU) obj;
                if (!0qQ.A0K(this.A03, gmU.A03) || !0qQ.A0K(this.A02, gmU.A02) || !0qQ.A0K(this.A01, gmU.A01) || this.A04 != gmU.A04 || !0qQ.A0K(this.A00, gmU.A00) || this.A05 != gmU.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07 = AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A03)));
        return DbS.A06(this.A05, (AnonymousClass7TF.A09(this.A04, A07) + AnonymousClass7TG.A0C(this.A00)) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ViewState(upcomingEvents=");
        A1A.append(this.A03);
        A1A.append(", suggestedLives=");
        A1A.append(this.A02);
        A1A.append(", postLives=");
        A1A.append(this.A01);
        A1A.append(", showLoadingAtEndOfUpcomingEventsList=");
        A1A.append(this.A04);
        A1A.append(", backgroundAttrRes=");
        A1A.append(this.A00);
        A1A.append(", useIGDSListCellForActionRows=");
        return G9t.A1C(A1A, this.A05);
    }
}
