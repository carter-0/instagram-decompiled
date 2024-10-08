package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;

/* renamed from: X.4o7  reason: invalid class name and case insensitive filesystem */
public final class C274324o7 extends AnonymousClass0T0 implements C274334o8 {
    public final RepostRestrictedReason A00;
    public final XDTTextAppQuoteAttachmentEligibility A01;
    public final 1Xj A02;
    public final 1Xj A03;
    public final 1Xj A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Integer A0D;
    public final String A0E;

    public final C274324o7 FEI(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274324o7) {
                C274324o7 r5 = (C274324o7) obj;
                if (this.A01 != r5.A01 || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0E, r5.A0E) || this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility = this.A01;
        int i = 0;
        int hashCode = (xDTTextAppQuoteAttachmentEligibility == null ? 0 : xDTTextAppQuoteAttachmentEligibility.hashCode()) * 31;
        Boolean bool = this.A05;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A08;
        int hashCode5 = (hashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A09;
        int hashCode6 = (hashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A0A;
        int hashCode7 = (hashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A0B;
        int hashCode8 = (hashCode7 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        1Xj r0 = this.A02;
        int hashCode9 = (hashCode8 + (r0 == null ? 0 : r0.hashCode())) * 31;
        Boolean bool8 = this.A0C;
        int hashCode10 = (hashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Integer num = this.A0D;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        1Xj r02 = this.A03;
        int hashCode12 = (hashCode11 + (r02 == null ? 0 : r02.hashCode())) * 31;
        String str = this.A0E;
        int hashCode13 = (hashCode12 + (str == null ? 0 : str.hashCode())) * 31;
        RepostRestrictedReason repostRestrictedReason = this.A00;
        int hashCode14 = (hashCode13 + (repostRestrictedReason == null ? 0 : repostRestrictedReason.hashCode())) * 31;
        1Xj r03 = this.A04;
        if (r03 != null) {
            i = r03.hashCode();
        }
        return hashCode14 + i;
    }

    public final XDTTextAppQuoteAttachmentEligibility AkL() {
        return this.A01;
    }

    public final Boolean AkM() {
        return this.A05;
    }

    public final Boolean AkS() {
        return this.A06;
    }

    public final Boolean Ako() {
        return this.A07;
    }

    public final Boolean Akp() {
        return this.A08;
    }

    public final Boolean Biz() {
        return this.A0B;
    }

    public final 1Xj Bj0() {
        return this.A02;
    }

    public final Boolean Bj1() {
        return this.A0C;
    }

    public final Integer Bj2() {
        return this.A0D;
    }

    public final 1Xj Bj4() {
        return this.A03;
    }

    public final String Bj5() {
        return this.A0E;
    }

    public final RepostRestrictedReason Bmz() {
        return this.A00;
    }

    public final 1Xj Bn2() {
        return this.A04;
    }

    public final Boolean Caj() {
        return this.A09;
    }

    public final Boolean Cap() {
        return this.A0A;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTShareInfo", C54996HaT.A00(this));
    }

    public C274324o7(RepostRestrictedReason repostRestrictedReason, XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility, 1Xj r3, 1Xj r4, 1Xj r5, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, String str) {
        this.A01 = xDTTextAppQuoteAttachmentEligibility;
        this.A05 = bool;
        this.A06 = bool2;
        this.A07 = bool3;
        this.A08 = bool4;
        this.A09 = bool5;
        this.A0A = bool6;
        this.A0B = bool7;
        this.A02 = r3;
        this.A0C = bool8;
        this.A0D = num;
        this.A03 = r4;
        this.A0E = str;
        this.A00 = repostRestrictedReason;
        this.A04 = r5;
    }

    public final C274334o8 E9o(1E9 r1) {
        return this;
    }
}
