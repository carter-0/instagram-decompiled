package X;

import android.graphics.Rect;

/* renamed from: X.3cC  reason: invalid class name and case insensitive filesystem */
public final class C245043cC {
    public int A00;
    public int A01;
    public long A02;
    public 2Tf A03;
    public AnonymousClass2TY A04;
    public 2Tg A05;
    public 2Tg A06;
    public 2Tg A07;
    public 2Tg A08;
    public 2Tg A09;
    public AnonymousClass2Ta A0A;
    public Object A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public final float A0H;
    public final float A0I;
    public final Rect A0J;
    public final C245003c8 A0K;

    public C245043cC(Rect rect, 2Tf r5, AnonymousClass2TY r6, 2Tg r7, 2Tg r8, 2Tg r9, 2Tg r10, 2Tg r11, AnonymousClass2Ta r12, C245003c8 r13, Object obj, float f, float f2, int i, int i2, long j, boolean z, boolean z2) {
        this.A0K = r13;
        this.A0I = f;
        this.A0H = f2;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = j;
        this.A0D = z;
        this.A0B = obj;
        this.A0G = false;
        this.A0C = z2;
        this.A0F = false;
        this.A07 = r7;
        this.A09 = r8;
        this.A05 = r9;
        this.A08 = r10;
        this.A06 = r11;
        this.A03 = r5;
        this.A0A = r12;
        this.A04 = r6;
        this.A0J = rect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C245043cC) {
                C245043cC r8 = (C245043cC) obj;
                if (!0qQ.A0K(this.A0K, r8.A0K) || Float.compare(this.A0I, r8.A0I) != 0 || Float.compare(this.A0H, r8.A0H) != 0 || this.A01 != r8.A01 || this.A00 != r8.A00 || this.A02 != r8.A02 || this.A0D != r8.A0D || this.A0E != r8.A0E || !0qQ.A0K(this.A0B, r8.A0B) || this.A0G != r8.A0G || this.A0C != r8.A0C || this.A0F != r8.A0F || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A0A, r8.A0A) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A0J, r8.A0J)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("YogaLayoutOutput(yogaNode=");
        sb.append(this.A0K);
        sb.append(", widthFromStyle=");
        sb.append(this.A0I);
        sb.append(", heightFromStyle=");
        sb.append(this.A0H);
        sb.append(", _widthSpec=");
        sb.append(this.A01);
        sb.append(", _heightSpec=");
        sb.append(this.A00);
        sb.append(", _lastMeasuredSize=");
        sb.append(this.A02);
        sb.append(", _isCachedLayout=");
        sb.append(this.A0D);
        sb.append(", _isDiffedLayout=");
        sb.append(this.A0E);
        sb.append(", _layoutData=");
        sb.append(this.A0B);
        sb.append(", _wasMeasured=");
        sb.append(this.A0G);
        sb.append(", _cachedMeasuresValid=");
        sb.append(this.A0C);
        sb.append(", _measureHadExceptions=");
        sb.append(this.A0F);
        sb.append(", _contentRenderUnit=");
        sb.append(this.A07);
        sb.append(", _hostRenderUnit=");
        sb.append(this.A09);
        sb.append(", _backgroundRenderUnit=");
        sb.append(this.A05);
        sb.append(", _foregroundRenderUnit=");
        sb.append(this.A08);
        sb.append(", _borderRenderUnit=");
        sb.append(this.A06);
        sb.append(", _diffNode=");
        sb.append(this.A03);
        sb.append(", _delegate=");
        sb.append(this.A0A);
        sb.append(", _nestedResult=");
        sb.append(this.A04);
        sb.append(", _adjustedBounds=");
        sb.append(this.A0J);
        sb.append(')');
        return sb.toString();
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
        long j = this.A02;
        int hashCode9 = ((((((((((this.A0K.hashCode() * 31) + Float.floatToIntBits(this.A0I)) * 31) + Float.floatToIntBits(this.A0H)) * 31) + this.A01) * 31) + this.A00) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i = 1237;
        if (this.A0D) {
            i = 1231;
        }
        int i2 = (hashCode9 + i) * 31;
        int i3 = 1237;
        if (this.A0E) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        Object obj = this.A0B;
        int i5 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i6 = (i4 + hashCode) * 31;
        int i7 = 1237;
        if (this.A0G) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A0C) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A0F) {
            i11 = 1231;
        }
        int i12 = (i10 + i11) * 31;
        2Tg r0 = this.A07;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        2Tg r02 = this.A09;
        if (r02 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = r02.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        2Tg r03 = this.A05;
        if (r03 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = r03.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        2Tg r04 = this.A08;
        if (r04 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r04.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        2Tg r05 = this.A06;
        if (r05 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = r05.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        2Tf r06 = this.A03;
        if (r06 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = r06.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        AnonymousClass2Ta r07 = this.A0A;
        if (r07 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r07.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        AnonymousClass2TY r08 = this.A04;
        if (r08 != null) {
            i5 = r08.hashCode();
        }
        return ((i19 + i5) * 31) + this.A0J.hashCode();
    }
}
