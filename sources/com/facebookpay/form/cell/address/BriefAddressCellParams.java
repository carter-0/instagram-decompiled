package com.facebookpay.form.cell.address;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C10782Ry3;
import X.C41847B3o;
import X.C8022QfC;
import X.SWV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebookpay.form.cell.CellParams;
import com.facebookpay.form.model.AddressFormFieldsConfig;

public final class BriefAddressCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = SWV.A00(59);
    public final Country A00;
    public final AddressFormFieldsConfig A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public BriefAddressCellParams(Parcel parcel) {
        super(parcel);
        this.A00 = (Country) C41847B3o.A03(parcel, Country.class);
        this.A02 = parcel.readString();
        AddressFormFieldsConfig addressFormFieldsConfig = (AddressFormFieldsConfig) C41847B3o.A03(parcel, AddressFormFieldsConfig.class);
        if (addressFormFieldsConfig != null) {
            this.A01 = addressFormFieldsConfig;
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public BriefAddressCellParams(C8022QfC qfC) {
        super((C10782Ry3) qfC);
        this.A00 = qfC.A00;
        this.A02 = qfC.A02;
        this.A01 = qfC.A01;
    }
}
