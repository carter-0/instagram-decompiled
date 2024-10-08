package com.fbpay.hub.form.params;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41847B3o;
import X.Pxe;
import X.SOR;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

public class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWW.A00(21);
    public FBPayLoggerData A00;
    public FormDialogParams A01;
    public FormLogEvents A02;
    public String A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public FormParams(FBPayLoggerData fBPayLoggerData, FormLogEvents formLogEvents, ImmutableList immutableList, String str) {
        this.A04 = 1;
        this.A07 = immutableList;
        this.A06 = 0;
        this.A0A = str;
        this.A08 = null;
        this.A05 = 0;
        this.A0B = false;
        this.A00 = fBPayLoggerData;
        this.A02 = formLogEvents;
        this.A01 = null;
        this.A09 = null;
        this.A03 = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeList(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A03);
    }

    public FormParams(Parcel parcel) {
        this.A04 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A08 = parcel.readString();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Pxe.A1O(parcel, CellParams.class, A1C);
        this.A07 = ImmutableList.copyOf((Collection) A1C);
        this.A05 = parcel.readInt();
        this.A0B = AnonymousClass7TF.A1P(parcel.readByte());
        this.A00 = (FBPayLoggerData) C41847B3o.A03(parcel, FBPayLoggerData.class);
        this.A02 = (FormLogEvents) C41847B3o.A03(parcel, FormLogEvents.class);
        this.A01 = (FormDialogParams) C41847B3o.A03(parcel, FormDialogParams.class);
        this.A09 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public FormParams(SOR sor) {
        this.A04 = sor.A06;
        this.A07 = sor.A03;
        this.A06 = sor.A08;
        this.A0A = sor.A0B;
        String str = sor.A0A;
        this.A08 = str;
        this.A05 = sor.A07;
        this.A0B = true;
        this.A00 = sor.A00;
        this.A02 = sor.A02;
        this.A01 = sor.A01;
        this.A09 = sor.A05;
        String str2 = sor.A04;
        this.A03 = str2 == null ? str : str2;
    }
}
