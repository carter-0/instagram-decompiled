package com.facebook.smartcapture.capture;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.Pxf;
import X.SWZ;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class DefaultEvidenceRecorderProvider implements SelfieEvidenceRecorderProvider {
    public static final Parcelable.Creator CREATOR = SWZ.A01(52);
    public int A00 = 224;
    public long A01;
    public RectF A02;
    public Integer A03 = AnonymousClass05K.A00;
    public String A04;
    public String A05;
    public final ArrayList A06 = AnonymousClass7TE.A1C();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeStringList(this.A06);
        parcel.writeInt(this.A00);
        Pxf.A19(parcel, this.A03);
        parcel.writeParcelable(this.A02, i);
    }
}
