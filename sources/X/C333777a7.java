package X;

import com.instagram.api.schemas.IGCommentSheetMoreInfo;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.7a7  reason: invalid class name and case insensitive filesystem */
public final class C333777a7 extends AnonymousClass0T0 {
    public final int A00;
    public final IGCommentSheetMoreInfo A01;
    public final TestimonialDict A02;
    public final ImageUrl A03;
    public final AnonymousClass3QO A04;
    public final 1iA A05;
    public final 1sw A06;
    public final ProductType A07;
    public final C272034jz A08;
    public final C272034jz A09;
    public final User A0A;
    public final Integer A0B;
    public final Long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final Map A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C333777a7) {
                C333777a7 r5 = (C333777a7) obj;
                if (!(this.A0B == r5.A0B && this.A0S == r5.A0S && this.A0Y == r5.A0Y && 0qQ.A0K(this.A0H, r5.A0H) && this.A0T == r5.A0T && this.A0W == r5.A0W && this.A0Z == r5.A0Z && this.A0U == r5.A0U && this.A0g == r5.A0g && this.A0a == r5.A0a && this.A0b == r5.A0b && this.A0c == r5.A0c && this.A0d == r5.A0d && this.A0e == r5.A0e && this.A0f == r5.A0f && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A0I, r5.A0I) && this.A05 == r5.A05 && 0qQ.A0K(this.A0J, r5.A0J) && 0qQ.A0K(this.A0K, r5.A0K) && this.A07 == r5.A07 && 0qQ.A0K(this.A0L, r5.A0L) && 0qQ.A0K(this.A0O, r5.A0O) && 0qQ.A0K(this.A0P, r5.A0P) && 0qQ.A0K(this.A0D, r5.A0D) && this.A0h == r5.A0h && 0qQ.A0K(this.A0E, r5.A0E) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A0F, r5.A0F) && this.A0V == r5.A0V && this.A06 == r5.A06 && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A08, r5.A08) && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A0R == r5.A0R && 0qQ.A0K(this.A0Q, r5.A0Q) && 0qQ.A0K(this.A03, r5.A03) && this.A0X == r5.A0X && 0qQ.A0K(this.A0G, r5.A0G) && 0qQ.A0K(this.A0M, r5.A0M) && 0qQ.A0K(this.A0N, r5.A0N) && 0qQ.A0K(this.A02, r5.A02) && 0qQ.A0K(this.A01, r5.A01))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        Integer num = this.A0B;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "ORGANIC";
                    break;
                case 2:
                    str = "UNKNOWN";
                    break;
                default:
                    str = "AD";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A0S) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0Y) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        String str2 = this.A0H;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i7 = (i6 + hashCode2) * 31;
        int i8 = 1237;
        if (this.A0T) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0W) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0Z) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0U) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0g) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0a) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0b) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0c) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0d) {
            i24 = 1231;
        }
        int i25 = (i23 + i24) * 31;
        int i26 = 1237;
        if (this.A0e) {
            i26 = 1231;
        }
        int i27 = (i25 + i26) * 31;
        int i28 = 1237;
        if (this.A0f) {
            i28 = 1231;
        }
        int i29 = (i27 + i28) * 31;
        User user = this.A0A;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int hashCode21 = (((((i29 + hashCode3) * 31) + this.A0I.hashCode()) * 31) + this.A05.hashCode()) * 31;
        String str3 = this.A0J;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int hashCode22 = (((hashCode21 + hashCode4) * 31) + this.A0K.hashCode()) * 31;
        ProductType productType = this.A07;
        if (productType == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = productType.hashCode();
        }
        int i30 = (hashCode22 + hashCode5) * 31;
        String str4 = this.A0L;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i31 = (i30 + hashCode6) * 31;
        String str5 = this.A0O;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i32 = (i31 + hashCode7) * 31;
        String str6 = this.A0P;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i33 = (i32 + hashCode8) * 31;
        String str7 = this.A0D;
        if (str7 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str7.hashCode();
        }
        int i34 = (i33 + hashCode9) * 31;
        int i35 = 1237;
        if (this.A0h) {
            i35 = 1231;
        }
        int i36 = (i34 + i35) * 31;
        String str8 = this.A0E;
        if (str8 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str8.hashCode();
        }
        int i37 = (i36 + hashCode10) * 31;
        Long l = this.A0C;
        if (l == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = l.hashCode();
        }
        int i38 = (i37 + hashCode11) * 31;
        String str9 = this.A0F;
        if (str9 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = str9.hashCode();
        }
        int i39 = (i38 + hashCode12) * 31;
        int i40 = 1237;
        if (this.A0V) {
            i40 = 1231;
        }
        int hashCode23 = (((i39 + i40) * 31) + this.A06.hashCode()) * 31;
        C272034jz r0 = this.A09;
        if (r0 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = r0.hashCode();
        }
        int i41 = (hashCode23 + hashCode13) * 31;
        C272034jz r02 = this.A08;
        if (r02 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = r02.hashCode();
        }
        int hashCode24 = (((((i41 + hashCode14) * 31) + this.A04.hashCode()) * 31) + this.A00) * 31;
        int i42 = 1237;
        if (this.A0R) {
            i42 = 1231;
        }
        int i43 = (hashCode24 + i42) * 31;
        Map map = this.A0Q;
        if (map == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = map.hashCode();
        }
        int i44 = (i43 + hashCode15) * 31;
        ImageUrl imageUrl = this.A03;
        if (imageUrl == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = imageUrl.hashCode();
        }
        int i45 = (i44 + hashCode16) * 31;
        int i46 = 1237;
        if (this.A0X) {
            i46 = 1231;
        }
        int i47 = (i45 + i46) * 31;
        String str10 = this.A0G;
        if (str10 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = str10.hashCode();
        }
        int i48 = (i47 + hashCode17) * 31;
        String str11 = this.A0M;
        if (str11 == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = str11.hashCode();
        }
        int i49 = (i48 + hashCode18) * 31;
        String str12 = this.A0N;
        if (str12 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str12.hashCode();
        }
        int i50 = (i49 + hashCode19) * 31;
        TestimonialDict testimonialDict = this.A02;
        if (testimonialDict == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = testimonialDict.hashCode();
        }
        int i51 = (i50 + hashCode20) * 31;
        IGCommentSheetMoreInfo iGCommentSheetMoreInfo = this.A01;
        if (iGCommentSheetMoreInfo != null) {
            i = iGCommentSheetMoreInfo.hashCode();
        }
        return i51 + i;
    }

    public C333777a7(IGCommentSheetMoreInfo iGCommentSheetMoreInfo, TestimonialDict testimonialDict, ImageUrl imageUrl, AnonymousClass3QO r5, 1iA r6, 1sw r7, ProductType productType, C272034jz r9, C272034jz r10, User user, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        0qQ.A0B(r7, 31);
        0qQ.A0B(r5, 34);
        this.A0B = num;
        this.A0S = z;
        this.A0Y = z2;
        this.A0H = str;
        this.A0T = z3;
        this.A0W = z4;
        this.A0Z = z5;
        this.A0U = z6;
        this.A0g = z7;
        this.A0a = z8;
        this.A0b = z9;
        this.A0c = z10;
        this.A0d = z11;
        this.A0e = z12;
        this.A0f = z13;
        this.A0A = user;
        this.A0I = str2;
        this.A05 = r6;
        this.A0J = str3;
        this.A0K = str4;
        this.A07 = productType;
        this.A0L = str5;
        this.A0O = str6;
        this.A0P = str7;
        this.A0D = str8;
        this.A0h = z14;
        this.A0E = str9;
        this.A0C = l;
        this.A0F = str10;
        this.A0V = z15;
        this.A06 = r7;
        this.A09 = r9;
        this.A08 = r10;
        this.A04 = r5;
        this.A00 = i;
        this.A0R = z16;
        this.A0Q = map;
        this.A03 = imageUrl;
        this.A0X = z17;
        this.A0G = str11;
        this.A0M = str12;
        this.A0N = str13;
        this.A02 = testimonialDict;
        this.A01 = iGCommentSheetMoreInfo;
    }
}
