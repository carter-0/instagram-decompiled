package com.facebookpay.expresscheckout.models;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C51972G9s;
import X.C51974G9v;
import X.C8924RFs;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;

public final class EcpUIConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(43);
    public final AuthScreenStyle A00;
    public final C8924RFs A01;
    public final C8924RFs A02;
    public final C8924RFs A03;
    public final C8924RFs A04;
    public final C8924RFs A05;
    public final C8924RFs A06;
    public final C8924RFs A07;
    public final EcpNuxLearnMoreScreenStyle A08;
    public final ItemDetails A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this.A04);
        AnonymousClass7TE.A1T(parcel, this.A02);
        AnonymousClass7TE.A1T(parcel, this.A05);
        AnonymousClass7TE.A1T(parcel, this.A06);
        AnonymousClass7TE.A1T(parcel, this.A01);
        AnonymousClass7TE.A1T(parcel, this.A07);
        this.A09.writeToParcel(parcel, i);
        AuthScreenStyle authScreenStyle = this.A00;
        if (authScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authScreenStyle.writeToParcel(parcel, i);
        }
        EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = this.A08;
        if (ecpNuxLearnMoreScreenStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            ecpNuxLearnMoreScreenStyle.writeToParcel(parcel, i);
        }
        AnonymousClass7TE.A1T(parcel, this.A03);
    }

    public EcpUIConfiguration(AuthScreenStyle authScreenStyle, C8924RFs rFs, C8924RFs rFs2, C8924RFs rFs3, C8924RFs rFs4, C8924RFs rFs5, C8924RFs rFs6, C8924RFs rFs7, EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle, ItemDetails itemDetails) {
        C51974G9v.A1P(rFs, rFs2, rFs3, rFs4);
        0qQ.A0B(rFs5, 5);
        C51972G9s.A1E(rFs6, itemDetails);
        0qQ.A0B(rFs7, 10);
        this.A04 = rFs;
        this.A02 = rFs2;
        this.A05 = rFs3;
        this.A06 = rFs4;
        this.A01 = rFs5;
        this.A07 = rFs6;
        this.A09 = itemDetails;
        this.A00 = authScreenStyle;
        this.A08 = ecpNuxLearnMoreScreenStyle;
        this.A03 = rFs7;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EcpUIConfiguration() {
        /*
            r11 = this;
            r1 = 0
            X.RFs r2 = X.C8924RFs.A0D
            X.RFs r3 = X.C8924RFs.A0B
            X.RFs r4 = X.C8924RFs.A0E
            X.RFs r5 = X.C8924RFs.A0F
            X.RFs r6 = X.C8924RFs.A0A
            X.RFs r7 = X.C8924RFs.A0c
            com.facebookpay.expresscheckout.models.ItemDetails r10 = X.Pxh.A0V()
            r0 = r11
            r8 = r2
            r9 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebookpay.expresscheckout.models.EcpUIConfiguration.<init>():void");
    }
}
