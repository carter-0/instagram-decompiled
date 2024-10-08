package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Map;

/* renamed from: X.4nn  reason: invalid class name and case insensitive filesystem */
public final class C274154nn extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AnonymousClass9IS A04;
    public final AnonymousClass9IV A05;
    public final AnonymousClass9J3 A06;
    public final C275664qi A07;
    public final C275654qh A08;
    public final ImageUrl A09;
    public final 1Xj A0A;
    public final 1Xj A0B;
    public final C246953fX A0C;
    public final AnonymousClass3QO A0D;
    public final C247083fk A0E;
    public final User A0F;
    public final User A0G;
    public final Float A0H;
    public final Integer A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final List A0N;
    public final Map A0O;
    public final Map A0P;
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
    public final String A0f;
    public final boolean A0g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C274154nn) {
                C274154nn r5 = (C274154nn) obj;
                if (!0qQ.A0K(this.A0K, r5.A0K) || !0qQ.A0K(this.A0J, r5.A0J) || Float.compare(this.A00, r5.A00) != 0 || this.A01 != r5.A01 || this.A0R != r5.A0R || !0qQ.A0K(this.A0P, r5.A0P) || !0qQ.A0K(this.A0O, r5.A0O) || !0qQ.A0K(this.A0Q, r5.A0Q) || this.A0T != r5.A0T || this.A0U != r5.A0U || this.A0V != r5.A0V || this.A0d != r5.A0d || this.A0a != r5.A0a || this.A02 != r5.A02 || this.A03 != r5.A03 || !0qQ.A0K(this.A0f, r5.A0f) || this.A0c != r5.A0c || this.A0X != r5.A0X || this.A0S != r5.A0S || this.A0W != r5.A0W || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A09, r5.A09) || this.A0g != r5.A0g || this.A0e != r5.A0e || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || this.A0Y != r5.A0Y || this.A0b != r5.A0b || this.A0Z != r5.A0Z || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0M, r5.A0M) || !0qQ.A0K(this.A0L, r5.A0L) || this.A0D != r5.A0D || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0N, r5.A0N) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0H, r5.A0H)) {
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
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12 = ((((((this.A0K.hashCode() * 31) + this.A0J.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A01) * 31;
        int i = 1237;
        if (this.A0R) {
            i = 1231;
        }
        int hashCode13 = (((((((hashCode12 + i) * 31) + this.A0P.hashCode()) * 31) + this.A0O.hashCode()) * 31) + this.A0Q.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0T) {
            i2 = 1231;
        }
        int i3 = (hashCode13 + i2) * 31;
        int i4 = 1237;
        if (this.A0U) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0V) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0d) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0a) {
            i10 = 1231;
        }
        int i11 = (((((i9 + i10) * 31) + this.A02) * 31) + this.A03) * 31;
        String str = this.A0f;
        int i12 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i13 = (i11 + hashCode) * 31;
        int i14 = 1237;
        if (this.A0c) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0X) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0S) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0W) {
            i20 = 1231;
        }
        int hashCode14 = (((i19 + i20) * 31) + this.A0C.hashCode()) * 31;
        C275654qh r0 = this.A08;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i21 = (hashCode14 + hashCode2) * 31;
        ImageUrl imageUrl = this.A09;
        if (imageUrl == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageUrl.hashCode();
        }
        int i22 = (i21 + hashCode3) * 31;
        int i23 = 1237;
        if (this.A0g) {
            i23 = 1231;
        }
        int i24 = (i22 + i23) * 31;
        int i25 = 1237;
        if (this.A0e) {
            i25 = 1231;
        }
        int hashCode15 = (((((((i24 + i25) * 31) + this.A0E.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode()) * 31;
        C275664qi r02 = this.A07;
        if (r02 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r02.hashCode();
        }
        int i26 = (hashCode15 + hashCode4) * 31;
        int i27 = 1237;
        if (this.A0Y) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0b) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        int i31 = 1237;
        if (this.A0Z) {
            i31 = 1231;
        }
        int i32 = (i30 + i31) * 31;
        User user = this.A0G;
        if (user == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = user.hashCode();
        }
        int i33 = (i32 + hashCode5) * 31;
        User user2 = this.A0F;
        if (user2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = user2.hashCode();
        }
        int hashCode16 = (((i33 + hashCode6) * 31) + this.A0M.hashCode()) * 31;
        String str2 = this.A0L;
        if (str2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str2.hashCode();
        }
        int hashCode17 = (((hashCode16 + hashCode7) * 31) + this.A0D.hashCode()) * 31;
        1Xj r03 = this.A0A;
        if (r03 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r03.hashCode();
        }
        int i34 = (hashCode17 + hashCode8) * 31;
        Integer num = this.A0I;
        if (num == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num.hashCode();
        }
        int i35 = (i34 + hashCode9) * 31;
        AnonymousClass9J3 r04 = this.A06;
        if (r04 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = r04.hashCode();
        }
        int i36 = (i35 + hashCode10) * 31;
        List list = this.A0N;
        if (list == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list.hashCode();
        }
        int hashCode18 = (((i36 + hashCode11) * 31) + this.A0B.hashCode()) * 31;
        Float f = this.A0H;
        if (f != null) {
            i12 = f.hashCode();
        }
        return hashCode18 + i12;
    }

    public C274154nn(AnonymousClass9IS r3, AnonymousClass9IV r4, AnonymousClass9J3 r5, C275664qi r6, C275654qh r7, ImageUrl imageUrl, 1Xj r9, 1Xj r10, C246953fX r11, AnonymousClass3QO r12, C247083fk r13, User user, User user2, Float f, Integer num, String str, String str2, String str3, String str4, String str5, List list, Map map, Map map2, Map map3, float f2, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        String str6 = str4;
        0qQ.A0B(str6, 35);
        0qQ.A0B(r12, 37);
        this.A0K = str;
        this.A0J = str2;
        this.A00 = f2;
        this.A01 = i;
        this.A0R = z;
        this.A0P = map;
        this.A0O = map2;
        this.A0Q = map3;
        this.A0T = z2;
        this.A0U = z3;
        this.A0V = z4;
        this.A0d = z5;
        this.A0a = z6;
        this.A02 = i2;
        this.A03 = i3;
        this.A0f = str3;
        this.A0c = z7;
        this.A0X = z8;
        this.A0S = z9;
        this.A0W = z10;
        this.A0C = r11;
        this.A08 = r7;
        this.A09 = imageUrl;
        this.A0g = z11;
        this.A0e = z12;
        this.A0E = r13;
        this.A05 = r4;
        this.A04 = r3;
        this.A07 = r6;
        this.A0Y = z13;
        this.A0b = z14;
        this.A0Z = z15;
        this.A0G = user;
        this.A0F = user2;
        this.A0M = str6;
        this.A0L = str5;
        this.A0D = r12;
        this.A0A = r9;
        this.A0I = num;
        this.A06 = r5;
        this.A0N = list;
        this.A0B = r10;
        this.A0H = f;
    }
}
