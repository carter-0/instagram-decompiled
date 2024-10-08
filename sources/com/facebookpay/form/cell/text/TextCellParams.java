package com.facebookpay.form.cell.text;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.C10782Ry3;
import X.C11087S9i;
import X.C41847B3o;
import X.C8029QfJ;
import X.Pxe;
import X.Pxg;
import X.Pxi;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.cell.text.formatter.TextFormatter;
import com.facebookpay.form.cell.text.util.TextFieldHandler;
import com.fbpay.theme.FBPayIcon;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

public class TextCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(75);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final TextFormatter A04;
    public final TextFieldHandler A05;
    public final FBPayIcon A06;
    public final ImmutableList A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(C11087S9i.A01(this.A08));
        parcel.writeList(this.A07);
        parcel.writeValue(this.A05);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeValue(this.A04);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
    }

    public TextCellParams(Parcel parcel) {
        super(parcel);
        this.A0B = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0A = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        String readString = parcel.readString();
        if (readString != null) {
            this.A08 = C11087S9i.A00(readString);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Pxe.A1O(parcel, TextValidatorParams.class, A1C);
            this.A07 = ImmutableList.copyOf((Collection) A1C);
            this.A05 = (TextFieldHandler) Pxi.A0U(parcel, TextFieldHandler.class);
            this.A06 = (FBPayIcon) C41847B3o.A03(parcel, FBPayIcon.class);
            this.A0E = Pxg.A1U(parcel);
            this.A02 = parcel.readInt();
            this.A0F = Pxg.A1U(parcel);
            this.A04 = (TextFormatter) Pxi.A0U(parcel, TextFormatter.class);
            this.A09 = parcel.readString();
            this.A0C = Pxg.A1U(parcel);
            this.A0D = Pxg.A1U(parcel);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public TextCellParams(C8029QfJ qfJ) {
        super((C10782Ry3) qfJ);
        this.A0B = qfJ.A0B;
        this.A03 = qfJ.A03;
        this.A0A = qfJ.A0A;
        this.A00 = qfJ.A00;
        this.A01 = qfJ.A01;
        this.A08 = qfJ.A08;
        ImmutableList immutableList = qfJ.A07;
        if (immutableList != null) {
            this.A07 = immutableList;
            this.A05 = qfJ.A05;
            this.A06 = qfJ.A06;
            this.A0E = qfJ.A0E;
            this.A02 = qfJ.A02;
            this.A0F = qfJ.A0F;
            this.A04 = qfJ.A04;
            this.A09 = qfJ.A09;
            this.A0C = qfJ.A0C;
            this.A0D = qfJ.A0D;
            return;
        }
        0qQ.A0F("validators");
        throw AnonymousClass00P.createAndThrow();
    }
}
