package X;

import java.util.List;

/* renamed from: X.79c  reason: invalid class name */
public final class AnonymousClass79c extends AnonymousClass7FV implements AnonymousClass7FF, C3270379d, AnonymousClass7FW {
    public final AnonymousClass5FV A00;
    public final C67065Mhg A01;
    public final AnonymousClass7FT A02;
    public final AnonymousClass7FE A03;
    public final CharSequence A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass79c(AnonymousClass5FV r2, C67065Mhg mhg, AnonymousClass7FT r4, AnonymousClass7FE r5, CharSequence charSequence, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(r4);
        0qQ.A0B(charSequence, 2);
        this.A04 = charSequence;
        this.A0D = z;
        this.A0B = z2;
        this.A0G = z3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
        this.A08 = list;
        this.A06 = str;
        this.A0E = z4;
        this.A0A = z5;
        this.A0F = z6;
        this.A09 = z7;
        this.A01 = mhg;
        this.A0C = z8;
        this.A07 = str2;
        this.A05 = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass79c) {
                AnonymousClass79c r5 = (AnonymousClass79c) obj;
                if (!(0qQ.A0K(this.A04, r5.A04) && this.A0D == r5.A0D && this.A0B == r5.A0B && this.A0G == r5.A0G && 0qQ.A0K(this.A03, r5.A03) && 0qQ.A0K(this.A02, r5.A02) && this.A00 == r5.A00 && 0qQ.A0K(this.A08, r5.A08) && 0qQ.A0K(this.A06, r5.A06) && this.A0E == r5.A0E && this.A0A == r5.A0A && this.A0F == r5.A0F && this.A09 == r5.A09 && 0qQ.A0K(this.A01, r5.A01) && this.A0C == r5.A0C && 0qQ.A0K(this.A07, r5.A07))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        0qQ.A0B(obj, 0);
        return equals(obj);
    }

    public final String ArN() {
        return this.A05;
    }

    public final boolean CUQ() {
        return this.A03.A00;
    }

    public final boolean CUR() {
        return this.A03.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (38347 + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode4 + i) * 31;
        int i3 = 1237;
        if (this.A0B) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0G) {
            i5 = 1231;
        }
        int hashCode5 = (((((((i4 + i5) * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A00.hashCode()) * 31;
        List list = this.A08;
        int i6 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i7 = (hashCode5 + hashCode) * 31;
        String str = this.A06;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i8 = (i7 + hashCode2) * 31;
        int i9 = 1237;
        if (this.A0E) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0A) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        int i13 = 1237;
        if (this.A0F) {
            i13 = 1231;
        }
        int i14 = (i12 + i13) * 31;
        int i15 = 1237;
        if (this.A09) {
            i15 = 1231;
        }
        int i16 = (i14 + i15) * 31;
        C67065Mhg mhg = this.A01;
        if (mhg == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = mhg.hashCode();
        }
        int i17 = (i16 + hashCode3) * 31;
        int i18 = 1237;
        if (this.A0C) {
            i18 = 1231;
        }
        int i19 = (i17 + i18) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i6 = str2.hashCode();
        }
        return i19 + i6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass79c(X.AnonymousClass5FV r18, X.AnonymousClass7FT r19, X.AnonymousClass7FE r20, java.lang.CharSequence r21, java.lang.String r22, boolean r23, boolean r24, boolean r25, boolean r26) {
        /*
            r17 = this;
            r11 = 0
            r0 = 2
            r5 = r21
            X.0qQ.A0B(r5, r0)
            r2 = 0
            r0 = r17
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r13 = r26
            r7 = r2
            r8 = r2
            r14 = r11
            r15 = r11
            r16 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass79c.<init>(X.5FV, X.7FT, X.7FE, java.lang.CharSequence, java.lang.String, boolean, boolean, boolean, boolean):void");
    }
}
