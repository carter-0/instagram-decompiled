package com.instagram.simplewebview;

import X.0qQ;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class SimpleWebViewConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(64);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SimpleWebViewConfig(java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, java.lang.String r32, java.lang.String r33) {
        /*
            r17 = this;
            r2 = 0
            r6 = 0
            r11 = r29
            r10 = r28
            r1 = r33
            r16 = r20
            r3 = r32
            r0 = r17
            r4 = r18
            r5 = r31
            r14 = r21
            r7 = r22
            r15 = r23
            r13 = r24
            r12 = r25
            r8 = r26
            r9 = r27
            r0.<init>((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r5, (boolean) r6, (boolean) r7, (boolean) r8, (boolean) r9, (boolean) r10, (boolean) r11, (boolean) r12, (boolean) r13, (boolean) r14, (boolean) r15, (boolean) r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.simplewebview.SimpleWebViewConfig.<init>(java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SimpleWebViewConfig(X.C11225SFz r34) {
        /*
            r33 = this;
            r0 = r34
            java.lang.String r15 = r0.A0F
            java.lang.String r14 = r0.A01
            java.lang.String r13 = r0.A02
            boolean r12 = r0.A0E
            boolean r11 = r0.A0D
            boolean r10 = r0.A05
            boolean r9 = r0.A09
            boolean r8 = r0.A0A
            boolean r7 = r0.A0B
            boolean r6 = r0.A0C
            boolean r5 = r0.A08
            boolean r4 = r0.A07
            boolean r3 = r0.A04
            boolean r2 = r0.A06
            boolean r1 = r0.A03
            java.lang.String r0 = r0.A00
            r16 = r33
            r32 = r1
            r31 = r2
            r30 = r3
            r29 = r4
            r28 = r5
            r27 = r6
            r26 = r7
            r25 = r8
            r24 = r9
            r23 = r10
            r22 = r11
            r21 = r12
            r20 = r0
            r19 = r13
            r18 = r14
            r17 = r15
            r16.<init>((java.lang.String) r17, (java.lang.String) r18, (java.lang.String) r19, (java.lang.String) r20, (boolean) r21, (boolean) r22, (boolean) r23, (boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (boolean) r28, (boolean) r29, (boolean) r30, (boolean) r31, (boolean) r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.simplewebview.SimpleWebViewConfig.<init>(X.SFz):void");
    }

    public SimpleWebViewConfig(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A0F = z;
        this.A0E = z2;
        this.A06 = z3;
        this.A0A = z4;
        this.A0B = z5;
        this.A0C = z6;
        this.A0D = z7;
        this.A09 = z8;
        this.A08 = z9;
        this.A05 = z10;
        this.A07 = z11;
        this.A04 = z12;
        this.A00 = str4;
    }
}
