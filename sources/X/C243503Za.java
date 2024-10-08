package X;

import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.3Za  reason: invalid class name and case insensitive filesystem */
public final class C243503Za extends AnonymousClass0T0 implements C243513Zb {
    public final AnonymousClass9IP A00;
    public final AnonymousClass9IP A01;
    public final AnonymousClass9IT A02;
    public final AnonymousClass9IZ A03;
    public final AnonymousClass9IZ A04;
    public final C376499If A05;
    public final C59671JTb A06;
    public final C61042Jvg A07;
    public final C381829cQ A08;
    public final AnonymousClass3ZH A09;
    public final AnonymousClass3YB A0A;
    public final AnonymousClass3ZU A0B;
    public final AnonymousClass3ZE A0C;
    public final AnonymousClass3W1 A0D;
    public final Reel A0E;
    public final User A0F;
    public final User A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C243503Za) {
                C243503Za r5 = (C243503Za) obj;
                if (!0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A09, r5.A09) || this.A0K != r5.A0K || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0F, r5.A0F) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A01, r5.A01) || this.A0M != r5.A0M || this.A0N != r5.A0N || this.A0O != r5.A0O || !0qQ.A0K(this.A0B, r5.A0B) || this.A0P != r5.A0P || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0H, r5.A0H) || this.A0Q != r5.A0Q || this.A0J != r5.A0J || !0qQ.A0K(this.A0I, r5.A0I) || this.A0L != r5.A0L) {
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
        int hashCode5 = ((this.A0D.hashCode() * 31) + this.A09.hashCode()) * 31;
        int i = 1237;
        if (this.A0K) {
            i = 1231;
        }
        int hashCode6 = (((((hashCode5 + i) * 31) + this.A04.hashCode()) * 31) + this.A00.hashCode()) * 31;
        C381829cQ r0 = this.A08;
        int i2 = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i3 = (hashCode6 + hashCode) * 31;
        Reel reel = this.A0E;
        if (reel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = reel.hashCode();
        }
        int hashCode7 = (((((i3 + hashCode2) * 31) + this.A0C.hashCode()) * 31) + this.A0F.hashCode()) * 31;
        User user = this.A0G;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int hashCode8 = (((((((hashCode7 + hashCode3) * 31) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0M) {
            i4 = 1231;
        }
        int i5 = (hashCode8 + i4) * 31;
        int i6 = 1237;
        if (this.A0N) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0O) {
            i8 = 1231;
        }
        int hashCode9 = (((i7 + i8) * 31) + this.A0B.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0P) {
            i9 = 1231;
        }
        int hashCode10 = (((((((((hashCode9 + i9) * 31) + this.A0A.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A03.hashCode()) * 31;
        String str = this.A0H;
        if (str == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str.hashCode();
        }
        int i10 = (hashCode10 + hashCode4) * 31;
        int i11 = 1237;
        if (this.A0Q) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0J) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        String str2 = this.A0I;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        int i15 = (i14 + i2) * 31;
        int i16 = 1237;
        if (this.A0L) {
            i16 = 1231;
        }
        return i15 + i16;
    }

    public C243503Za(AnonymousClass9IP r2, AnonymousClass9IP r3, AnonymousClass9IT r4, AnonymousClass9IZ r5, AnonymousClass9IZ r6, C376499If r7, C59671JTb jTb, C61042Jvg jvg, C381829cQ r10, AnonymousClass3ZH r11, AnonymousClass3YB r12, AnonymousClass3ZU r13, AnonymousClass3ZE r14, AnonymousClass3W1 r15, Reel reel, User user, User user2, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0D = r15;
        this.A09 = r11;
        this.A0K = z;
        this.A04 = r5;
        this.A00 = r2;
        this.A08 = r10;
        this.A0E = reel;
        this.A0C = r14;
        this.A0F = user;
        this.A0G = user2;
        this.A07 = jvg;
        this.A06 = jTb;
        this.A01 = r3;
        this.A0M = z2;
        this.A0N = z3;
        this.A0O = z4;
        this.A0B = r13;
        this.A0P = z5;
        this.A0A = r12;
        this.A02 = r4;
        this.A05 = r7;
        this.A03 = r6;
        this.A0H = str;
        this.A0Q = z6;
        this.A0J = z7;
        this.A0I = str2;
        this.A0L = z8;
    }
}
