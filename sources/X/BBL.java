package X;

import com.instagram.api.schemas.ThreadContainerType;
import com.instagram.api.schemas.ThreadHeaderStyle;
import java.util.List;

public final class BBL extends AnonymousClass0T0 {
    public final ThreadContainerType A00;
    public final DRX A01;
    public final ThreadHeaderStyle A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final String A06;
    public final boolean A07;

    public BBL(ThreadContainerType threadContainerType, DRX drx, ThreadHeaderStyle threadHeaderStyle, String str, String str2, String str3, List list, boolean z) {
        0qQ.A0B(str2, 3);
        0qQ.A0B(list, 6);
        0qQ.A0B(threadContainerType, 7);
        this.A03 = str;
        this.A02 = threadHeaderStyle;
        this.A04 = str2;
        this.A07 = z;
        this.A01 = drx;
        this.A05 = list;
        this.A00 = threadContainerType;
        this.A06 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof BBL) {
                BBL bbl = (BBL) obj;
                if (!0qQ.A0K(this.A03, bbl.A03) || this.A02 != bbl.A02 || !0qQ.A0K(this.A04, bbl.A04) || this.A07 != bbl.A07 || !0qQ.A0K(this.A01, bbl.A01) || !0qQ.A0K(this.A05, bbl.A05) || this.A00 != bbl.A00 || !0qQ.A0K(this.A06, bbl.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A04, ((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31);
        return AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A05, (AnonymousClass7TF.A09(this.A07, A08) + AnonymousClass7TG.A0C(this.A01)) * 31)) + C41845B3m.A00(this.A06);
    }
}
