package X;

import android.util.Size;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.4Fw  reason: invalid class name and case insensitive filesystem */
public final class C262754Fw extends AnonymousClass0T0 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Size A06;
    public final AnonymousClass9I9 A07;
    public final AnonymousClass9IE A08;
    public final AnonymousClass9IQ A09;
    public final AnonymousClass9J0 A0A;
    public final AnonymousClass3TG A0B;
    public final C246653ex A0C;
    public final 1Xj A0D;
    public final AnonymousClass4Fs A0E;
    public final C245813dW A0F;
    public final AnonymousClass3W1 A0G;
    public final ExtendedImageUrl A0H;
    public final Float A0I;
    public final Integer A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final C376449Ia A0O;
    public final C247113fn A0P;
    public final boolean A0Q;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C262754Fw) {
                C262754Fw r5 = (C262754Fw) obj;
                if (!0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A0F, r5.A0F) || this.A04 != r5.A04 || !0qQ.A0K(this.A06, r5.A06) || this.A05 != r5.A05 || Float.compare(this.A00, r5.A00) != 0 || this.A0Q != r5.A0Q || this.A01 != r5.A01 || this.A0L != r5.A0L || !0qQ.A0K(this.A0H, r5.A0H) || !0qQ.A0K(this.A0J, r5.A0J) || !0qQ.A0K(this.A0I, r5.A0I) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A0P, r5.A0P) || this.A02 != r5.A02 || this.A0N != r5.A0N || !0qQ.A0K(this.A0K, r5.A0K) || this.A0M != r5.A0M || !0qQ.A0K(this.A0C, r5.A0C) || this.A03 != r5.A03 || !0qQ.A0K(this.A0O, r5.A0O) || this.A0B != r5.A0B) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C262754Fw(Size size, AnonymousClass9I9 r3, AnonymousClass9IE r4, AnonymousClass9IQ r5, C376449Ia r6, AnonymousClass9J0 r7, AnonymousClass3TG r8, C246653ex r9, C247113fn r10, 1Xj r11, AnonymousClass4Fs r12, C245813dW r13, AnonymousClass3W1 r14, ExtendedImageUrl extendedImageUrl, Float f, Integer num, String str, float f2, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(r8, 27);
        this.A0D = r11;
        this.A0G = r14;
        this.A0F = r13;
        this.A04 = i;
        this.A06 = size;
        this.A05 = i2;
        this.A00 = f2;
        this.A0Q = z;
        this.A01 = i3;
        this.A0L = z2;
        this.A0H = extendedImageUrl;
        this.A0J = num;
        this.A0I = f;
        this.A09 = r5;
        this.A08 = r4;
        this.A07 = r3;
        this.A0A = r7;
        this.A0E = r12;
        this.A0P = r10;
        this.A02 = i4;
        this.A0N = z3;
        this.A0K = str;
        this.A0M = z4;
        this.A0C = r9;
        this.A03 = i5;
        this.A0O = r6;
        this.A0B = r8;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((((((this.A0D.hashCode() * 31) + this.A0G.hashCode()) * 31) + this.A0F.hashCode()) * 31) + this.A04) * 31;
        Size size = this.A06;
        int i = 0;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        int floatToIntBits = (((((hashCode5 + hashCode) * 31) + this.A05) * 31) + Float.floatToIntBits(this.A00)) * 31;
        int i2 = 1237;
        if (this.A0Q) {
            i2 = 1231;
        }
        int i3 = (((floatToIntBits + i2) * 31) + this.A01) * 31;
        int i4 = 1237;
        if (this.A0L) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        ExtendedImageUrl extendedImageUrl = this.A0H;
        if (extendedImageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = extendedImageUrl.hashCode();
        }
        int i6 = (i5 + hashCode2) * 31;
        Integer num = this.A0J;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i7 = (i6 + hashCode3) * 31;
        Float f = this.A0I;
        if (f == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = f.hashCode();
        }
        int hashCode6 = (((((((((((((((i7 + hashCode4) * 31) + this.A09.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A0A.hashCode()) * 31) + this.A0E.hashCode()) * 31) + this.A0P.hashCode()) * 31) + this.A02) * 31;
        int i8 = 1237;
        if (this.A0N) {
            i8 = 1231;
        }
        int hashCode7 = (((hashCode6 + i8) * 31) + this.A0K.hashCode()) * 31;
        int i9 = 1237;
        if (this.A0M) {
            i9 = 1231;
        }
        int i10 = (hashCode7 + i9) * 31;
        C246653ex r0 = this.A0C;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((((((i10 + i) * 31) + this.A03) * 31) + this.A0O.hashCode()) * 31) + this.A0B.hashCode();
    }
}
