package X;

import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.XIGIGBoostDestination;
import java.util.List;

/* renamed from: X.JvH  reason: case insensitive filesystem */
public final class C61017JvH extends AnonymousClass0T0 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C61017JvH(BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        0qQ.A0B(list, 5);
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = z4;
        this.A02 = list;
        this.A01 = brandedContentProjectMetadataIntf;
        this.A08 = z5;
        this.A06 = z6;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61017JvH)) {
                return false;
            }
            C61017JvH jvH = (C61017JvH) obj;
            if (jvH.A00 != 1 || this.A03 != jvH.A03 || this.A04 != jvH.A04 || this.A05 != jvH.A05 || this.A07 != jvH.A07 || !0qQ.A0K(this.A02, jvH.A02) || !0qQ.A0K(this.A01, jvH.A01) || this.A08 != jvH.A08) {
                return false;
            }
            z = this.A06;
            z2 = jvH.A06;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof C61017JvH)) {
                return false;
            }
            C61017JvH jvH2 = (C61017JvH) obj;
            if (jvH2.A00 != 0 || this.A02 != jvH2.A02 || !0qQ.A0K(this.A01, jvH2.A01) || this.A06 != jvH2.A06 || this.A04 != jvH2.A04 || this.A05 != jvH2.A05 || this.A03 != jvH2.A03 || this.A07 != jvH2.A07) {
                return false;
            }
            z = this.A08;
            z2 = jvH2.A08;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        boolean z;
        if (this.A00 != 0) {
            int A092 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, C51965G9l.A05(this.A03))));
            A09 = AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A07(this.A02, A092) + AnonymousClass7TG.A0C(this.A01)) * 31);
            z = this.A06;
        } else {
            A09 = AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A02)))))));
            z = this.A08;
        }
        return DbS.A06(z, A09);
    }

    public final String toString() {
        if (1 - this.A00 != 0) {
            return super.toString();
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AdvancedSettings(areCaptionsEnabled=");
        A1A.append(this.A03);
        A1A.append(", areCommentsDisabled=");
        A1A.append(this.A04);
        A1A.append(", isFundedContentDeal=");
        A1A.append(this.A05);
        A1A.append(", isPaidPartnership=");
        A1A.append(this.A07);
        A1A.append(", brandedContentTags=");
        A1A.append(this.A02);
        A1A.append(", brandedContentProjectMetadata=");
        A1A.append(this.A01);
        A1A.append(", partnerBoostEnabled=");
        A1A.append(this.A08);
        A1A.append(", isLikeAndViewCountsDisabled=");
        return G9t.A1C(A1A, this.A06);
    }

    public C61017JvH(XIGIGBoostDestination xIGIGBoostDestination, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = xIGIGBoostDestination;
        this.A01 = list;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A03 = z4;
        this.A07 = z5;
        this.A08 = z6;
    }
}
