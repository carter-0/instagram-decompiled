package X;

/* renamed from: X.8Vp  reason: invalid class name and case insensitive filesystem */
public final class C356888Vp {
    public final C63968LFv A00;
    public final LG4 A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final int A0C;
    public final int A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C356888Vp) {
                C356888Vp r5 = (C356888Vp) obj;
                if (!0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || this.A03 != r5.A03 || this.A0D != r5.A0D || this.A0C != r5.A0C || this.A02 != r5.A02 || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0B, r5.A0B) || this.A0H != r5.A0H || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((((((this.A04.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A07.hashCode()) * 31;
        String str = this.A09;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        String str2 = this.A0A;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        Integer num = this.A03;
        Integer num2 = this.A02;
        int hashCode9 = (((((((((((i2 + hashCode2) * 31) + C49259Es2.A00(num).hashCode() + num.intValue()) * 31) + this.A0D) * 31) + this.A0C) * 31) + LKT.A01(num2).hashCode() + num2.intValue()) * 31) + this.A0E.hashCode()) * 31;
        String str3 = this.A0G;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (hashCode9 + hashCode3) * 31;
        String str4 = this.A0B;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        int i5 = 1237;
        if (this.A0H) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str5 = this.A0F;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i7 = (i6 + hashCode5) * 31;
        C63968LFv lFv = this.A00;
        if (lFv == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = lFv.hashCode();
        }
        int i8 = (i7 + hashCode6) * 31;
        LG4 lg4 = this.A01;
        if (lg4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = lg4.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        String str6 = this.A08;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ImagineCreateImage(imageId=");
        sb.append(this.A04);
        sb.append(C66579MXk.A00(46));
        sb.append(this.A06);
        sb.append(", imageRemoteUrl=");
        sb.append(this.A05);
        sb.append(AnonymousClass000.A00(2040));
        sb.append(this.A07);
        sb.append(Pxd.A00(10));
        sb.append(this.A09);
        sb.append(AnonymousClass000.A00(851));
        sb.append(this.A0A);
        sb.append(C66579MXk.A00(48));
        sb.append(C49259Es2.A00(this.A03));
        sb.append(AnonymousClass000.A00(2034));
        sb.append(this.A0D);
        sb.append(AnonymousClass000.A00(2033));
        sb.append(this.A0C);
        sb.append(AnonymousClass000.A00(845));
        sb.append(LKT.A01(this.A02));
        sb.append(AnonymousClass000.A00(2004));
        sb.append(this.A0E);
        sb.append(C273654mx.A00(101));
        sb.append(this.A0G);
        sb.append(AnonymousClass000.A00(2052));
        sb.append(this.A0B);
        sb.append(", hasBeenEdited=");
        sb.append(this.A0H);
        sb.append(AnonymousClass000.A00(2041));
        sb.append(this.A0F);
        sb.append(", promptSummaryData=");
        sb.append(this.A00);
        sb.append(", storyPromptMetadata=");
        sb.append(this.A01);
        sb.append(", recipeCaption=");
        sb.append(this.A08);
        sb.append(')');
        return sb.toString();
    }

    public C356888Vp(C63968LFv lFv, LG4 lg4, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, int i2, boolean z) {
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A03 = num;
        this.A0D = i;
        this.A0C = i2;
        this.A02 = num2;
        this.A0E = str7;
        this.A0G = str8;
        this.A0B = str9;
        this.A0H = z;
        this.A0F = str10;
        this.A00 = lFv;
        this.A01 = lg4;
        this.A08 = str11;
    }
}
