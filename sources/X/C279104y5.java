package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.4y5  reason: invalid class name and case insensitive filesystem */
public final class C279104y5 extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final AnonymousClass9IQ A02;
    public final AnonymousClass9IS A03;
    public final AnonymousClass9IV A04;
    public final AnonymousClass9J3 A05;
    public final 1Xj A06;
    public final C246953fX A07;
    public final C245853da A08;
    public final AnonymousClass3QO A09;
    public final C262744Fv A0A;
    public final AnonymousClass3TO A0B;
    public final User A0C;
    public final User A0D;
    public final Float A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
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
    public final float A0Z;
    public final float A0a;
    public final int A0b;
    public final int A0c;
    public final String A0d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279104y5) {
                C279104y5 r5 = (C279104y5) obj;
                if (!(0qQ.A0K(this.A0H, r5.A0H) && 0qQ.A0K(this.A0G, r5.A0G) && this.A0b == r5.A0b && this.A0c == r5.A0c && this.A01 == r5.A01 && this.A0B == r5.A0B && this.A08 == r5.A08 && this.A0P == r5.A0P && this.A0X == r5.A0X && 0qQ.A0K(this.A0L, r5.A0L) && 0qQ.A0K(this.A0K, r5.A0K) && 0qQ.A0K(this.A0M, r5.A0M) && 0qQ.A0K(this.A0d, r5.A0d) && this.A0O == r5.A0O && Float.compare(this.A0a, r5.A0a) == 0 && Float.compare(this.A0Z, r5.A0Z) == 0 && 0qQ.A0K(this.A07, r5.A07) && 0qQ.A0K(this.A0A, r5.A0A) && 0qQ.A0K(this.A04, r5.A04) && this.A0Y == r5.A0Y && 0qQ.A0K(this.A02, r5.A02) && this.A0V == r5.A0V && this.A0U == r5.A0U && this.A0Q == r5.A0Q && 0qQ.A0K(this.A03, r5.A03) && this.A0R == r5.A0R && this.A0T == r5.A0T && this.A0S == r5.A0S && 0qQ.A0K(this.A0D, r5.A0D) && 0qQ.A0K(this.A0C, r5.A0C) && 0qQ.A0K(this.A0J, r5.A0J) && Float.compare(this.A00, r5.A00) == 0 && 0qQ.A0K(this.A0I, r5.A0I) && this.A09 == r5.A09 && this.A0W == r5.A0W && 0qQ.A0K(this.A0F, r5.A0F) && this.A0N == r5.A0N && 0qQ.A0K(this.A06, r5.A06) && 0qQ.A0K(this.A05, r5.A05) && 0qQ.A0K(this.A0E, r5.A0E))) {
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
        int hashCode8 = ((((((((((((this.A0H.hashCode() * 31) + this.A0G.hashCode()) * 31) + this.A0b) * 31) + this.A0c) * 31) + this.A01) * 31) + this.A0B.hashCode()) * 31) + this.A08.hashCode()) * 31;
        int i = 1237;
        if (this.A0P) {
            i = 1231;
        }
        int i2 = (hashCode8 + i) * 31;
        int i3 = 1237;
        if (this.A0X) {
            i3 = 1231;
        }
        int hashCode9 = (((((((i2 + i3) * 31) + this.A0L.hashCode()) * 31) + this.A0K.hashCode()) * 31) + this.A0M.hashCode()) * 31;
        String str = this.A0d;
        int i4 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode9 + hashCode) * 31;
        int i6 = 1237;
        if (this.A0O) {
            i6 = 1231;
        }
        int floatToIntBits = (((((((i5 + i6) * 31) + Float.floatToIntBits(this.A0a)) * 31) + Float.floatToIntBits(this.A0Z)) * 31) + this.A07.hashCode()) * 31;
        C262744Fv r0 = this.A0A;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int hashCode10 = (((floatToIntBits + hashCode2) * 31) + this.A04.hashCode()) * 31;
        int i7 = 1237;
        if (this.A0Y) {
            i7 = 1231;
        }
        int hashCode11 = (((hashCode10 + i7) * 31) + this.A02.hashCode()) * 31;
        int i8 = 1237;
        if (this.A0V) {
            i8 = 1231;
        }
        int i9 = (hashCode11 + i8) * 31;
        int i10 = 1237;
        if (this.A0U) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0Q) {
            i12 = 1231;
        }
        int hashCode12 = (((i11 + i12) * 31) + this.A03.hashCode()) * 31;
        int i13 = 1237;
        if (this.A0R) {
            i13 = 1231;
        }
        int i14 = (hashCode12 + i13) * 31;
        int i15 = 1237;
        if (this.A0T) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        int i17 = 1237;
        if (this.A0S) {
            i17 = 1231;
        }
        int i18 = (i16 + i17) * 31;
        User user = this.A0D;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i19 = (i18 + hashCode3) * 31;
        User user2 = this.A0C;
        if (user2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = user2.hashCode();
        }
        int hashCode13 = (((((i19 + hashCode4) * 31) + this.A0J.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        String str2 = this.A0I;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int hashCode14 = (((hashCode13 + hashCode5) * 31) + this.A09.hashCode()) * 31;
        int i20 = 1237;
        if (this.A0W) {
            i20 = 1231;
        }
        int i21 = (hashCode14 + i20) * 31;
        Integer num = this.A0F;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i22 = (i21 + hashCode6) * 31;
        int i23 = 1237;
        if (this.A0N) {
            i23 = 1231;
        }
        int hashCode15 = (((i22 + i23) * 31) + this.A06.hashCode()) * 31;
        AnonymousClass9J3 r02 = this.A05;
        if (r02 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r02.hashCode();
        }
        int i24 = (hashCode15 + hashCode7) * 31;
        Float f = this.A0E;
        if (f != null) {
            i4 = f.hashCode();
        }
        return i24 + i4;
    }

    public C279104y5(AnonymousClass9IQ r3, AnonymousClass9IS r4, AnonymousClass9IV r5, AnonymousClass9J3 r6, 1Xj r7, C246953fX r8, C245853da r9, AnonymousClass3QO r10, C262744Fv r11, AnonymousClass3TO r12, User user, User user2, Float f, Integer num, String str, String str2, String str3, String str4, String str5, Map map, Map map2, Map map3, float f2, float f3, float f4, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        String str6 = str4;
        0qQ.A0B(str6, 31);
        0qQ.A0B(r10, 34);
        this.A0H = str;
        this.A0G = str2;
        this.A0b = i;
        this.A0c = i2;
        this.A01 = i3;
        this.A0B = r12;
        this.A08 = r9;
        this.A0P = z;
        this.A0X = z2;
        this.A0L = map;
        this.A0K = map2;
        this.A0M = map3;
        this.A0d = str3;
        this.A0O = z3;
        this.A0a = f2;
        this.A0Z = f3;
        this.A07 = r8;
        this.A0A = r11;
        this.A04 = r5;
        this.A0Y = z4;
        this.A02 = r3;
        this.A0V = z5;
        this.A0U = z6;
        this.A0Q = z7;
        this.A03 = r4;
        this.A0R = z8;
        this.A0T = z9;
        this.A0S = z10;
        this.A0D = user;
        this.A0C = user2;
        this.A0J = str6;
        this.A00 = f4;
        this.A0I = str5;
        this.A09 = r10;
        this.A0W = z11;
        this.A0F = num;
        this.A0N = z12;
        this.A06 = r7;
        this.A05 = r6;
        this.A0E = f;
    }
}
