package com.facebookpay.form.cell.selector;

import X.0qQ;
import X.C10782Ry3;
import X.C249803kO;
import X.C8026QfG;
import X.Pxi;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.FormCountry;
import com.google.common.collect.ImmutableList;

public final class CountrySelectorCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(73);
    public final int A00;
    public final Country A01;
    public final ImmutableList A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
        C249803kO A0P = Pxi.A0P(parcel, this.A02);
        0qQ.A07(A0P);
        while (A0P.hasNext()) {
            parcel.writeParcelable((FormCountry) A0P.next(), i);
        }
        parcel.writeInt(0);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public CountrySelectorCellParams(C8026QfG qfG) {
        super((C10782Ry3) qfG);
        this.A03 = qfG.A01;
        this.A00 = qfG.A00;
        this.A01 = qfG.A03;
        this.A02 = qfG.A04;
        this.A04 = qfG.A02;
    }
}
