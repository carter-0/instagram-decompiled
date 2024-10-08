package com.instagram.creation.capture.quickcapture.aspectratioutil;

import X.0qQ;
import X.AnonymousClass81V;
import X.AnonymousClass81W;
import X.C376419Hx;
import X.Pxd;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

public class NineSixteenLayoutConfigImpl implements Parcelable, CreationLayoutConfig, TargetViewSizeProvider {
    public static final Parcelable.Creator CREATOR = new C376419Hx(82);
    public int A00;
    public int A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final AnonymousClass81W A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A0O);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A0J);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0L ? 1 : 0);
    }

    public final int A00() {
        boolean z = this instanceof FullHeightLayoutConfigImpl;
        int i = (this.A08 - this.A07) - this.A0I;
        if (!z) {
            return i - this.A0E;
        }
        int height = i - this.A0K.getHeight();
        if (height >= 0) {
            return this.A0A;
        }
        return height;
    }

    public final int BQc() {
        return this.A0P;
    }

    public final boolean CTv() {
        return this.A0M;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append("NineSixteenLayoutConfigImpl{displayWidth=");
        sb.append(this.A0O);
        sb.append(", displayHeight=");
        sb.append(this.A08);
        sb.append(", displayAspectRatio=");
        sb.append(this.A02);
        sb.append(", stableStatusBarHeight=");
        sb.append(this.A0J);
        sb.append(", stableNavBarHeight=");
        sb.append(this.A0I);
        sb.append(", cutoutHeight=");
        sb.append(this.A07);
        sb.append(", nineSixteenViewWidth=");
        sb.append(this.A0Q);
        sb.append(", nineSixteenViewHeight=");
        sb.append(this.A0E);
        sb.append(Pxd.A00(313));
        sb.append(this.A06);
        sb.append(Pxd.A00(312));
        sb.append(this.A04);
        sb.append(", containerTopMargin=");
        sb.append(this.A05);
        sb.append(", containerBottomMargin=");
        sb.append(this.A03);
        sb.append(", containerStartMargin=");
        sb.append(this.A01);
        sb.append(", containerEndMargin=");
        sb.append(this.A00);
        sb.append(", marginBetweenNavBarTopAndFooterContainerBottom=");
        if (this instanceof FullHeightLayoutConfigImpl) {
            i = 0;
        } else {
            i = this.A0C;
        }
        sb.append(i);
        sb.append(", mediaOverlapOnCutoutHeight=");
        sb.append(this.A0D);
        sb.append(", mediaOverlapOnNavBarHeight=");
        sb.append(this.A0P);
        sb.append(", spaceBetweenScreenBottomAndContainerBottom=");
        sb.append(this.A0G);
        sb.append(", spaceBetweenScreenBottomAndMediaBottom=");
        sb.append(this.A0H);
        sb.append(", spaceBetweenNavBarTopAndMediaBottom=");
        sb.append(this.A0F);
        sb.append(", footerContainerHeight=");
        sb.append(this.A0A);
        sb.append(", footerContainerTop=");
        sb.append(this.A0B);
        sb.append(", footerContainerBottom=");
        sb.append(this.A09);
        sb.append(", isMediaOverlappingSystemWindows=");
        sb.append(this.A0N);
        sb.append(", isFooterBelowMedia=");
        sb.append(this.A0M);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NineSixteenLayoutConfigImpl(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            int r2 = X.AnonymousClass0nB.A01(r10)
            int r3 = X.AnonymousClass0nB.A00(r10)
            boolean r0 = X.C226122ff.A03()
            if (r0 == 0) goto L_0x003b
            int r4 = X.C226122ff.A01()
        L_0x0012:
            boolean r0 = X.C226122ff.A03()
            if (r0 == 0) goto L_0x0039
            int r5 = X.C226122ff.A00()
        L_0x001c:
            boolean r0 = X.C61290mR.A07()
            if (r0 == 0) goto L_0x0037
            int r6 = X.C61290mR.A00()
        L_0x0026:
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131165232(0x7f070030, float:1.7944675E38)
            int r7 = r1.getDimensionPixelSize(r0)
            r1 = r9
            r8 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0037:
            r6 = 0
            goto L_0x0026
        L_0x0039:
            r5 = 0
            goto L_0x001c
        L_0x003b:
            r4 = 0
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl.<init>(android.content.Context, boolean):void");
    }

    public NineSixteenLayoutConfigImpl(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        this.A0O = i;
        this.A08 = i2;
        this.A0J = i3;
        this.A0I = i4;
        this.A07 = i5;
        this.A0A = i6;
        this.A0L = z;
        AnonymousClass81V r2 = new AnonymousClass81V(i, i2);
        this.A0K = r2;
        int i16 = 0;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalStateException("Display dimensions have not been initialized");
        }
        float f = ((float) i) / ((float) i2);
        this.A02 = f;
        int i17 = r2.A01;
        this.A0Q = i17;
        int i18 = r2.A00;
        this.A0E = i18;
        if (f <= 0.5625f) {
            int A002 = A00();
            if (A002 < 0) {
                this.A0C = 0;
                i10 = 0;
                this.A0N = true;
                this.A0M = false;
                z2 = false;
                int i19 = i2 - i18;
                i8 = i5 > i19 ? i19 : i5;
                this.A05 = i8;
                int i20 = i5 - i8;
                this.A0D = 0 < i20 ? i20 : 0;
                i7 = (i2 - i8) - i18;
                this.A03 = i7;
                i9 = i4 - i7;
                this.A0P = i9;
                if (i9 < 0) {
                    throw new IllegalArgumentException(toString());
                }
            } else {
                this.A0N = false;
                this.A0P = 0;
                i9 = 0;
                this.A0D = 0;
                z2 = A002 >= i6;
                this.A0M = z2;
                int i21 = A002 - (z2 ? i6 : 0);
                if (i3 > i5) {
                    i15 = Math.min(i21, i3 - i5);
                } else {
                    i15 = 0;
                }
                i10 = i21 - i15;
                this.A0C = i10;
                int i22 = i5 + i15;
                this.A05 = i22;
                i8 = i22;
                i7 = i10 + i4;
                this.A03 = i7;
            }
        } else {
            this.A0C = 0;
            i10 = 0;
            this.A0N = true;
            this.A0M = false;
            z2 = false;
            int i23 = i2 - i18;
            i8 = i23 / 2;
            this.A05 = i8;
            i7 = i23 - i8;
            this.A03 = i7;
            int i24 = i5 - i8;
            this.A0D = 0 < i24 ? i24 : 0;
            int i25 = i4 - i7;
            i9 = 0 < i25 ? i25 : 0;
            this.A0P = i9;
        }
        int i26 = i - i17;
        if (this.A0L) {
            i12 = 0;
            this.A01 = 0;
            i11 = 0;
        } else {
            i11 = i26 / 2;
            this.A01 = i11;
            i12 = i26 - i11;
        }
        this.A00 = i12;
        this.A06 = (i - i11) - i12;
        int i27 = (this.A08 - i8) - i7;
        this.A04 = i27;
        int i28 = i4 - i9;
        if (i28 >= 0) {
            int i29 = i28 + i10;
            this.A0G = i29;
            this.A0H = i29 + (z2 ? i6 : 0);
            if (i9 > 0) {
                i13 = -i9;
            } else {
                i13 = i10 + (z2 ? i6 : i16);
            }
            this.A0F = i13;
            if (!z2) {
                i14 = (i18 - i6) - i9;
            } else if (this instanceof FullHeightLayoutConfigImpl) {
                i14 = i27 - this.A0A;
            } else {
                i14 = this.A0E;
            }
            this.A0B = i14;
            this.A09 = i14 + i6;
            return;
        }
        throw new IllegalArgumentException(toString());
    }
}
