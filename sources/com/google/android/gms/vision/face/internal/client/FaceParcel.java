package com.google.android.gms.vision.face.internal.client;

import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(92);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final LandmarkParcel[] A0C;
    public final zza[] A0D;
    public final int A0E;

    public FaceParcel(LandmarkParcel[] landmarkParcelArr, zza[] zzaArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, int i2) {
        this.A0E = i;
        this.A0B = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = f5;
        this.A05 = f6;
        this.A06 = f7;
        this.A0C = landmarkParcelArr;
        this.A07 = f8;
        this.A08 = f9;
        this.A09 = f10;
        this.A0D = zzaArr;
        this.A0A = f11;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A05(parcel, this.A0E);
        C301145yd.A07(parcel, 2, this.A0B);
        C301145yd.A04(parcel, this.A00, 3);
        C301145yd.A04(parcel, this.A01, 4);
        C301145yd.A04(parcel, this.A02, 5);
        C301145yd.A04(parcel, this.A03, 6);
        C301145yd.A04(parcel, this.A04, 7);
        C301145yd.A04(parcel, this.A05, 8);
        C301145yd.A0G(parcel, this.A0C, 9, i);
        C301145yd.A04(parcel, this.A07, 10);
        C301145yd.A04(parcel, this.A08, 11);
        C301145yd.A04(parcel, this.A09, 12);
        C301145yd.A0G(parcel, this.A0D, 13, i);
        C301145yd.A04(parcel, this.A06, 14);
        C301145yd.A04(parcel, this.A0A, 15);
        C301145yd.A06(parcel, A032);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceParcel(int r17, int r18, float r19, float r20, float r21, float r22, float r23, float r24, com.google.android.gms.vision.face.internal.client.LandmarkParcel[] r25, float r26, float r27, float r28) {
        /*
            r16 = this;
            r0 = 0
            com.google.android.gms.vision.face.internal.client.zza[] r2 = new com.google.android.gms.vision.face.internal.client.zza[r0]
            r9 = 0
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = r16
            r14 = r17
            r15 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r1 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.vision.face.internal.client.FaceParcel.<init>(int, int, float, float, float, float, float, float, com.google.android.gms.vision.face.internal.client.LandmarkParcel[], float, float, float):void");
    }
}
