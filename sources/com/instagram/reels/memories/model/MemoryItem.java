package com.instagram.reels.memories.model;

import X.17W;
import X.AnonymousClass15o;
import X.C45388CvU;
import X.C62558Kho;
import X.D2C;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.StringWriter;

public final class MemoryItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(97);
    public C62558Kho A00;
    public C45388CvU A01 = new Object();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A00);
        try {
            C45388CvU cvU = this.A01;
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            D2C.A00(A0A, cvU);
            A0A.close();
            parcel.writeString(stringWriter.toString());
        } catch (IOException unused) {
        }
    }
}
