package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.77t  reason: invalid class name and case insensitive filesystem */
public final class C3266877t extends AnonymousClass0T0 implements C328617Fm {
    public final int A00;
    public final C376679Ix A01;
    public final C376679Ix A02;
    public final UserSession A03;
    public final AnonymousClass7AE A04;
    public final AnonymousClass7AD A05;
    public final C3266777s A06;
    public final C3266677r A07;
    public final AnonymousClass7AB A08;
    public final C3262275x A09;
    public final C3265777i A0A;
    public final AnonymousClass7AC A0B;
    public final C331547Rk A0C;
    public final AnonymousClass7AF A0D;
    public final C328557Fg A0E;
    public final AnonymousClass7AG A0F;
    public final AnonymousClass7AA A0G;
    public final AnonymousClass7A9 A0H;
    public final AnonymousClass79G A0I;
    public final C328567Fh A0J;
    public final String A0K;
    public final String A0L;
    public final boolean A0M = true;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C3266877t(C376679Ix r3, C376679Ix r4, UserSession userSession, AnonymousClass7AE r6, AnonymousClass7AD r7, C3266777s r8, C3266677r r9, AnonymousClass7AB r10, C3262275x r11, C3265777i r12, AnonymousClass7AC r13, C331547Rk r14, AnonymousClass7AF r15, C328557Fg r16, AnonymousClass7AG r17, AnonymousClass7AA r18, AnonymousClass7A9 r19, AnonymousClass79G r20, C328567Fh r21, String str, String str2, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = userSession;
        this.A07 = r9;
        this.A0L = str;
        this.A0Q = z;
        this.A0P = z2;
        this.A0N = z3;
        this.A0C = r14;
        this.A0E = r16;
        this.A0H = r19;
        this.A0I = r20;
        this.A0J = r21;
        this.A0G = r18;
        this.A09 = r11;
        this.A08 = r10;
        this.A0B = r13;
        this.A01 = r3;
        this.A0A = r12;
        this.A05 = r7;
        this.A02 = r4;
        this.A04 = r6;
        this.A0D = r15;
        this.A06 = r8;
        this.A00 = i;
        this.A0F = r17;
        this.A0K = str2;
        this.A0O = z4;
        this.A0R = z5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3266877t) {
                C3266877t r5 = (C3266877t) obj;
                if (!0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0L, r5.A0L) || this.A0Q != r5.A0Q || this.A0P != r5.A0P || this.A0N != r5.A0N || this.A0M != r5.A0M || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A06, r5.A06) || this.A00 != r5.A00 || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0K, r5.A0K) || this.A0O != r5.A0O || this.A0R != r5.A0R) {
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
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16 = ((((this.A03.hashCode() * 31) + this.A07.hashCode()) * 31) + this.A0L.hashCode()) * 31;
        int i = 1237;
        if (this.A0Q) {
            i = 1231;
        }
        int i2 = (hashCode16 + i) * 31;
        int i3 = 1237;
        if (this.A0P) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0N) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A0M) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        C331547Rk r0 = this.A0C;
        int i9 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int hashCode17 = (((i8 + hashCode) * 31) + this.A0E.hashCode()) * 31;
        AnonymousClass7A9 r02 = this.A0H;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i10 = (hashCode17 + hashCode2) * 31;
        AnonymousClass79G r03 = this.A0I;
        if (r03 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r03.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        C328567Fh r04 = this.A0J;
        if (r04 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r04.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        AnonymousClass7AA r05 = this.A0G;
        if (r05 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r05.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        C3262275x r06 = this.A09;
        if (r06 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r06.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        AnonymousClass7AB r07 = this.A08;
        if (r07 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r07.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        AnonymousClass7AC r08 = this.A0B;
        if (r08 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r08.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        C376679Ix r09 = this.A01;
        if (r09 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = r09.hashCode();
        }
        int i17 = (i16 + hashCode9) * 31;
        C3265777i r010 = this.A0A;
        if (r010 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = r010.hashCode();
        }
        int i18 = (i17 + hashCode10) * 31;
        AnonymousClass7AD r011 = this.A05;
        if (r011 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = r011.hashCode();
        }
        int i19 = (i18 + hashCode11) * 31;
        C376679Ix r012 = this.A02;
        if (r012 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = r012.hashCode();
        }
        int i20 = (i19 + hashCode12) * 31;
        AnonymousClass7AE r013 = this.A04;
        if (r013 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = r013.hashCode();
        }
        int i21 = (i20 + hashCode13) * 31;
        AnonymousClass7AF r014 = this.A0D;
        if (r014 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = r014.hashCode();
        }
        int hashCode18 = (((((i21 + hashCode14) * 31) + this.A06.hashCode()) * 31) + this.A00) * 31;
        AnonymousClass7AG r015 = this.A0F;
        if (r015 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = r015.hashCode();
        }
        int i22 = (hashCode18 + hashCode15) * 31;
        String str = this.A0K;
        if (str != null) {
            i9 = str.hashCode();
        }
        int A002 = (((i22 + i9) * 31) + C54732HQn.A00()) * 31;
        int i23 = 1237;
        if (this.A0O) {
            i23 = 1231;
        }
        int i24 = (A002 + i23) * 31;
        int i25 = 1237;
        if (this.A0R) {
            i25 = 1231;
        }
        return i24 + i25;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
