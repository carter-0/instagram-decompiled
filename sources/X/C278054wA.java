package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.4wA  reason: invalid class name and case insensitive filesystem */
public final class C278054wA extends AnonymousClass0T0 implements C278064wB {
    public final C42122BIa A00;
    public final User A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public final C278054wA F3G(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C278054wA) {
                C278054wA r5 = (C278054wA) obj;
                if (!0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        User user = this.A01;
        int i = 0;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        C42122BIa bIa = this.A00;
        int hashCode2 = (hashCode + (bIa == null ? 0 : bIa.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.A06;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0B;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0C;
        int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0D;
        int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l = this.A04;
        int hashCode13 = (hashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.A05;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode13 + i;
    }

    public final User Amy() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C46303DUg AqE() {
        return this.A00;
    }

    public final Integer AyY() {
        return this.A02;
    }

    public final Integer AyZ() {
        return this.A03;
    }

    public final String B7a() {
        return this.A07;
    }

    public final String B7b() {
        return this.A08;
    }

    public final String B7c() {
        return this.A09;
    }

    public final String B7e() {
        return this.A0A;
    }

    public final String B7f() {
        return this.A0B;
    }

    public final Long BNI() {
        return this.A04;
    }

    public final Long ByZ() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFundRaiser", C44156CXv.A00(this));
    }

    public final String getFormattedAmountRaised() {
        return this.A06;
    }

    public final String getFormattedGoalAmount() {
        return this.A0C;
    }

    public final String getFundraiserTitle() {
        return this.A0D;
    }

    public C278054wA(C42122BIa bIa, User user, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A01 = user;
        this.A00 = bIa;
        this.A02 = num;
        this.A03 = num2;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A04 = l;
        this.A05 = l2;
    }

    public final C278064wB E7R(1E9 r1) {
        return this;
    }
}
