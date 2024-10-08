package com.facebookpay.form.fragment.model;

import X.0qQ;
import X.0sP;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.C8946RGo;
import X.Pxi;
import X.Pxj;
import X.RH3;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWV.A00(89);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CellParams A07;
    public final FeatureConfiguration A08;
    public final FormLoggingEvents A09;
    public final ListCellParams A0A;
    public final RH3 A0B;
    public final C8946RGo A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final ArrayList A0I;
    public final List A0J;
    public final 0sP A0K;
    public final boolean A0L;

    public FormParams(CellParams cellParams, FeatureConfiguration featureConfiguration, FormLoggingEvents formLoggingEvents, ListCellParams listCellParams, RH3 rh3, C8946RGo rGo, Integer num, Integer num2, Integer num3, Integer num4, String str, ArrayList arrayList, List list, 0sP r15, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        0qQ.A0B(arrayList, 6);
        this.A04 = i;
        this.A0H = str;
        this.A06 = i2;
        this.A0F = num;
        this.A0E = num2;
        this.A0I = arrayList;
        this.A09 = formLoggingEvents;
        this.A0B = rh3;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
        this.A01 = i6;
        this.A0A = listCellParams;
        this.A08 = featureConfiguration;
        this.A0G = num3;
        this.A0J = list;
        this.A07 = cellParams;
        this.A0D = num4;
        this.A05 = i7;
        this.A0C = rGo;
        this.A0L = z;
        this.A0K = r15;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A06);
        AnonymousClass7TG.A16(parcel, this.A0F, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A0E, 0, 1);
        Iterator A0l = Pxi.A0l(parcel, this.A0I);
        while (A0l.hasNext()) {
            C41847B3o.A1I(parcel, A0l, i);
        }
        FormLoggingEvents formLoggingEvents = this.A09;
        if (formLoggingEvents == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formLoggingEvents.writeToParcel(parcel, i);
        }
        Pxj.A1A(parcel, this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        ListCellParams listCellParams = this.A0A;
        if (listCellParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listCellParams.writeToParcel(parcel, i);
        }
        FeatureConfiguration featureConfiguration = this.A08;
        if (featureConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureConfiguration.writeToParcel(parcel, i);
        }
        AnonymousClass7TG.A16(parcel, this.A0G, 0, 1);
        List list = this.A0J;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                parcel.writeInt(AnonymousClass7TG.A0F(A1G));
            }
        }
        parcel.writeParcelable(this.A07, i);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            if (1 - num.intValue() != 0) {
                str = "ECP_ADD_ADDRESS";
            } else {
                str = "ECP_EDIT_ADDRESS";
            }
            parcel.writeString(str);
        }
        parcel.writeInt(this.A05);
        Pxj.A1A(parcel, this.A0C);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeSerializable(this.A0K);
    }
}
