package com.facebook.graphql.modelutil.parcel;

import X.17k;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11405SSc;
import X.C41847B3o;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;

public class ModelParcelHelper$LazyHolder implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(88);
    public final Parcelable A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        17k.A0F(AnonymousClass7TF.A1S(i2, 2));
        parcel.writeParcelable(this.A00, 0);
    }

    public ModelParcelHelper$LazyHolder(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        17k.A0F(AnonymousClass7TF.A1S(readInt, 2));
        this.A00 = C41847B3o.A03(parcel, C11405SSc.class);
    }

    public ModelParcelHelper$LazyHolder(Object obj) {
        if (obj instanceof Parcelable) {
            this.A00 = (Parcelable) obj;
            this.A01 = 2;
            return;
        }
        throw AnonymousClass7TE.A0w("Object param must implement a serialization format");
    }
}
