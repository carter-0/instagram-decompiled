package com.facebookpay.form.cell.creditcard;

import X.00k;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C10782Ry3;
import X.C41847B3o;
import X.C8023QfD;
import X.C8946RGo;
import X.Pxe;
import X.Pxg;
import X.REC;
import X.REP;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.address.AddressCellParams;
import com.facebookpay.form.model.CardFormFieldConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class CreditCardCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(66);
    public boolean A00 = true;
    public final int A01;
    public final int A02;
    public final int A03;
    public final REP A04;
    public final AddressCellParams A05;
    public final REC A06;
    public final CardFormFieldConfig A07;
    public final C8946RGo A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final Map A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public CreditCardCellParams(Parcel parcel) {
        super(parcel);
        Enum valueOf;
        Enum valueOf2;
        Enum valueOf3;
        this.A09 = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A0F = parcel.readString();
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0B = parcel.readString();
        Class cls = C8946RGo.class;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = Enum.valueOf(cls, readString);
        }
        this.A08 = (C8946RGo) valueOf;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Pxe.A1O(parcel, cls, A1C);
        this.A0G = 00k.A0a(A1C);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Pxe.A1O(parcel, Integer.TYPE, A1C2);
        this.A0H = 00k.A0a(A1C2);
        this.A0N = Pxg.A1U(parcel);
        this.A0M = Pxg.A1U(parcel);
        this.A00 = Pxg.A1U(parcel);
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        this.A0I = !(readHashMap instanceof Map) ? null : readHashMap;
        this.A02 = parcel.readInt();
        Class cls2 = REC.class;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = null;
        } else {
            valueOf2 = Enum.valueOf(cls2, readString2);
        }
        REC rec = (REC) valueOf2;
        this.A06 = rec == null ? REC.NONE : rec;
        this.A0K = Pxg.A1U(parcel);
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A05 = (AddressCellParams) C41847B3o.A03(parcel, AddressCellParams.class);
        Class cls3 = REP.class;
        String readString3 = parcel.readString();
        if (readString3 == null) {
            valueOf3 = null;
        } else {
            valueOf3 = Enum.valueOf(cls3, readString3);
        }
        this.A04 = (REP) valueOf3;
        this.A0L = Pxg.A1U(parcel);
        this.A07 = (CardFormFieldConfig) C41847B3o.A03(parcel, CardFormFieldConfig.class);
        this.A0J = Pxg.A1U(parcel);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String name;
        String name2;
        String name3;
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        C8946RGo rGo = this.A08;
        if (rGo == null) {
            name = null;
        } else {
            name = rGo.name();
        }
        parcel.writeString(name);
        parcel.writeList(this.A0G);
        parcel.writeList(this.A0H);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeMap(this.A0I);
        parcel.writeInt(this.A02);
        REC rec = this.A06;
        if (rec == null) {
            name2 = null;
        } else {
            name2 = rec.name();
        }
        parcel.writeString(name2);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        parcel.writeParcelable(this.A05, i);
        REP rep = this.A04;
        if (rep == null) {
            name3 = null;
        } else {
            name3 = rep.name();
        }
        parcel.writeString(name3);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeParcelable(this.A07, i);
        parcel.writeInt(this.A0J ? 1 : 0);
    }

    public CreditCardCellParams(C8023QfD qfD) {
        super((C10782Ry3) qfD);
        this.A09 = qfD.A0A;
        this.A0E = qfD.A0F;
        this.A0D = qfD.A0E;
        this.A0F = qfD.A0G;
        this.A0A = qfD.A0B;
        this.A0C = qfD.A0D;
        this.A0B = qfD.A0C;
        this.A08 = qfD.A07;
        this.A0G = qfD.A08;
        this.A0H = qfD.A09;
        this.A0N = qfD.A0M;
        this.A0M = qfD.A0L;
        this.A00 = qfD.A0N;
        this.A0I = qfD.A0H;
        this.A02 = qfD.A00;
        this.A06 = qfD.A05;
        this.A0K = qfD.A0J;
        this.A01 = qfD.A02;
        this.A03 = qfD.A01;
        this.A05 = qfD.A04;
        this.A04 = qfD.A03;
        this.A0L = qfD.A0K;
        this.A07 = qfD.A06;
        this.A0J = qfD.A0I;
    }
}
