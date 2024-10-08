package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.GatingResponseType;
import java.util.List;

/* renamed from: X.4wE  reason: invalid class name and case insensitive filesystem */
public final class C278074wE extends AnonymousClass0T0 implements C278084wF {
    public final GatingResponseType A00;
    public final Boolean A01;
    public final Integer A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;

    public final C278074wE F3K() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C278074wE) {
                C278074wE r5 = (C278074wE) obj;
                if (!0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || this.A00 != r5.A00 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0F, r5.A0F)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A0G;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A05;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A06;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.A0H;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.A07;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A08;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A09;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        GatingResponseType gatingResponseType = this.A00;
        int hashCode9 = (hashCode8 + (gatingResponseType == null ? 0 : gatingResponseType.hashCode())) * 31;
        Long l = this.A03;
        int hashCode10 = (hashCode9 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.A02;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.A0A;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0B;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0C;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode15 = (hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str10 = this.A0D;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0E;
        int hashCode17 = (hashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.A0F;
        if (str12 != null) {
            i = str12.hashCode();
        }
        return hashCode17 + i;
    }

    public final List Aac() {
        return this.A0G;
    }

    public final String Aad() {
        return this.A04;
    }

    public final String Aae() {
        return this.A05;
    }

    public final String Ag9() {
        return this.A06;
    }

    public final List Aj1() {
        return this.A0H;
    }

    public final String AmR() {
        return this.A07;
    }

    public final String AvR() {
        return this.A08;
    }

    public final GatingResponseType B8x() {
        return this.A00;
    }

    public final Long BQK() {
        return this.A03;
    }

    public final Integer BTS() {
        return this.A02;
    }

    public final String BZb() {
        return this.A0A;
    }

    public final String BeH() {
        return this.A0B;
    }

    public final Boolean Bvh() {
        return this.A01;
    }

    public final String C7K() {
        return this.A0D;
    }

    public final String CBI() {
        return this.A0F;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGatingDict", C44160CXz.A00(this));
    }

    public final String getDescription() {
        return this.A09;
    }

    public final String getSessionId() {
        return this.A0C;
    }

    public final String getTitle() {
        return this.A0E;
    }

    public C278074wE(GatingResponseType gatingResponseType, Boolean bool, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, List list, List list2) {
        this.A0G = list;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A0H = list2;
        this.A07 = str4;
        this.A08 = str5;
        this.A09 = str6;
        this.A00 = gatingResponseType;
        this.A03 = l;
        this.A02 = num;
        this.A0A = str7;
        this.A0B = str8;
        this.A0C = str9;
        this.A01 = bool;
        this.A0D = str10;
        this.A0E = str11;
        this.A0F = str12;
    }
}
