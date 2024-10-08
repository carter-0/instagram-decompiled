package X;

import com.instagram.api.schemas.MetaPlaceDict;
import com.instagram.api.schemas.TextPostAppHeaderFollowVariant;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.5vP  reason: invalid class name and case insensitive filesystem */
public final class C299565vP extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final AnonymousClass9IC A01;
    public final MetaPlaceDict A02;
    public final TextPostAppHeaderFollowVariant A03;
    public final C299545vN A04;
    public final C299505vJ A05;
    public final ImageUrl A06;
    public final FollowStatus A07;
    public final Double A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C299565vP) {
                C299565vP r5 = (C299565vP) obj;
                if (!(0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A01, r5.A01) && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A0B, r5.A0B) && 0qQ.A0K(this.A0F, r5.A0F) && this.A00 == r5.A00 && this.A07 == r5.A07 && this.A0U == r5.A0U && this.A0O == r5.A0O && this.A0J == r5.A0J && this.A0Q == r5.A0Q && this.A04 == r5.A04 && this.A0P == r5.A0P && 0qQ.A0K(this.A08, r5.A08) && this.A0L == r5.A0L && this.A0G == r5.A0G && this.A0V == r5.A0V && this.A0I == r5.A0I && this.A0H == r5.A0H && this.A0X == r5.A0X && this.A0W == r5.A0W && this.A03 == r5.A03 && this.A0N == r5.A0N && this.A0M == r5.A0M && this.A0R == r5.A0R && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A0E, r5.A0E) && 0qQ.A0K(this.A0D, r5.A0D) && this.A0Y == r5.A0Y && 0qQ.A0K(this.A09, r5.A09) && 0qQ.A0K(this.A02, r5.A02) && this.A0K == r5.A0K && this.A0T == r5.A0T && this.A0S == r5.A0S && 0qQ.A0K(this.A0C, r5.A0C))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return C299615vU.A01(this, "header", this.A05.A03);
    }

    public final C299505vJ Be5() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((this.A05.hashCode() * 31) + this.A01.hashCode()) * 31;
        ImageUrl imageUrl = this.A06;
        int i = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int hashCode9 = (((((((((hashCode8 + hashCode) * 31) + this.A0B.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0U) {
            i2 = 1231;
        }
        int i3 = (hashCode9 + i2) * 31;
        int i4 = 1237;
        if (this.A0O) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0J) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0Q) {
            i8 = 1231;
        }
        int hashCode10 = (((i7 + i8) * 31) + this.A04.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int i10 = (hashCode10 + i9) * 31;
        Double d = this.A08;
        if (d == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        int i12 = 1237;
        if (this.A0L) {
            i12 = 1231;
        }
        int i13 = (i11 + i12) * 31;
        int i14 = 1237;
        if (this.A0G) {
            i14 = 1231;
        }
        int i15 = (i13 + i14) * 31;
        int i16 = 1237;
        if (this.A0V) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        int i18 = 1237;
        if (this.A0I) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        int i20 = 1237;
        if (this.A0H) {
            i20 = 1231;
        }
        int i21 = (i19 + i20) * 31;
        int i22 = 1237;
        if (this.A0X) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        int i24 = 1237;
        if (this.A0W) {
            i24 = 1231;
        }
        int hashCode11 = (((i23 + i24) * 31) + this.A03.hashCode()) * 31;
        int i25 = 1237;
        if (this.A0N) {
            i25 = 1231;
        }
        int i26 = (hashCode11 + i25) * 31;
        int i27 = 1237;
        if (this.A0M) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        int i29 = 1237;
        if (this.A0R) {
            i29 = 1231;
        }
        int i30 = (i28 + i29) * 31;
        String str = this.A0A;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i31 = (i30 + hashCode3) * 31;
        String str2 = this.A0E;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i32 = (i31 + hashCode4) * 31;
        String str3 = this.A0D;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i33 = (i32 + hashCode5) * 31;
        int i34 = 1237;
        if (this.A0Y) {
            i34 = 1231;
        }
        int i35 = (i33 + i34) * 31;
        Long l = this.A09;
        if (l == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = l.hashCode();
        }
        int i36 = (i35 + hashCode6) * 31;
        MetaPlaceDict metaPlaceDict = this.A02;
        if (metaPlaceDict == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = metaPlaceDict.hashCode();
        }
        int i37 = (i36 + hashCode7) * 31;
        int i38 = 1237;
        if (this.A0K) {
            i38 = 1231;
        }
        int i39 = (i37 + i38) * 31;
        int i40 = 1237;
        if (this.A0T) {
            i40 = 1231;
        }
        int i41 = (i39 + i40) * 31;
        int i42 = 1237;
        if (this.A0S) {
            i42 = 1231;
        }
        int i43 = (i41 + i42) * 31;
        String str4 = this.A0C;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i43 + i;
    }

    public C299565vP(AnonymousClass9IC r2, MetaPlaceDict metaPlaceDict, TextPostAppHeaderFollowVariant textPostAppHeaderFollowVariant, C299545vN r5, C299505vJ r6, ImageUrl imageUrl, FollowStatus followStatus, Double d, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.A05 = r6;
        this.A01 = r2;
        this.A06 = imageUrl;
        this.A0B = str;
        this.A0F = str2;
        this.A00 = i;
        this.A07 = followStatus;
        this.A0U = z;
        this.A0O = z2;
        this.A0J = z3;
        this.A0Q = z4;
        this.A04 = r5;
        this.A0P = z5;
        this.A08 = d;
        this.A0L = z6;
        this.A0G = z7;
        this.A0V = z8;
        this.A0I = z9;
        this.A0H = z10;
        this.A0X = z11;
        this.A0W = z12;
        this.A03 = textPostAppHeaderFollowVariant;
        this.A0N = z13;
        this.A0M = z14;
        this.A0R = z15;
        this.A0A = str3;
        this.A0E = str4;
        this.A0D = str5;
        this.A0Y = z16;
        this.A09 = l;
        this.A02 = metaPlaceDict;
        this.A0K = z17;
        this.A0T = z18;
        this.A0S = z19;
        this.A0C = str6;
    }
}
