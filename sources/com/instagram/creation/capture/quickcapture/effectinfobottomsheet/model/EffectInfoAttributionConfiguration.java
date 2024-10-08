package com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model;

import X.C306106Ku;
import X.C62622Kit;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.model.effect.AREffect;
import com.instagram.model.shopping.ProductAREffectContainer;

public class EffectInfoAttributionConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(21);
    public EffectAttribution A00;
    public EffectInfoBottomSheetMode A01;
    public C306106Ku A02;
    public C62622Kit A03;
    public AREffect A04;
    public ProductAREffectContainer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A00, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        C306106Ku r0 = this.A02;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A00;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A05, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, 0);
        parcel.writeSerializable(this.A03);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
    }

    public EffectInfoAttributionConfiguration(AREffect aREffect, String str) {
        this.A04 = aREffect;
        this.A06 = str;
    }
}
