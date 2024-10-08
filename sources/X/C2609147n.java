package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.47n  reason: invalid class name and case insensitive filesystem */
public final class C2609147n extends AnonymousClass0T0 implements C2609247o {
    public final C2609047m A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Integer A04;
    public final Integer A05;
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

    public final C2609147n F1J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2609147n) {
                C2609147n r5 = (C2609147n) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0F, r5.A0F)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C2609047m r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        String str = this.A06;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str6 = this.A0B;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.A0C;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0D;
        int hashCode13 = (((hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.A0E.hashCode()) * 31;
        Integer num2 = this.A05;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((hashCode13 + i) * 31) + this.A0F.hashCode();
    }

    public C2609147n(C2609047m r4, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        String str11 = str9;
        0qQ.A0B(str11, 14);
        String str12 = str10;
        0qQ.A0B(str12, 16);
        this.A00 = r4;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A01 = bool;
        this.A02 = bool2;
        this.A04 = num;
        this.A03 = bool3;
        this.A0B = str6;
        this.A0C = str7;
        this.A0D = str8;
        this.A0E = str11;
        this.A05 = num2;
        this.A0F = str12;
    }

    public final C2609047m AsV() {
        return this.A00;
    }

    public final String AsY() {
        return this.A06;
    }

    public final String Asi() {
        return this.A07;
    }

    public final String B9y() {
        return this.A08;
    }

    public final String B9z() {
        return this.A09;
    }

    public final String BIn() {
        return this.A0A;
    }

    public final Integer BXU() {
        return this.A04;
    }

    public final Boolean Btz() {
        return this.A03;
    }

    public final String BxL() {
        return this.A0B;
    }

    public final String BxX() {
        return this.A0C;
    }

    public final String C6E() {
        return this.A0E;
    }

    public final Integer C6b() {
        return this.A05;
    }

    public final Boolean CQt() {
        return this.A01;
    }

    public final Boolean CX9() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTChannelsPreviewDict", C66963Mfw.A00(this));
    }

    public final String getSubtitle() {
        return this.A0D;
    }

    public final String getTitle() {
        return this.A0F;
    }
}
