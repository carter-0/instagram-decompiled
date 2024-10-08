package com.facebook.common.math.matrix;

import X.0qQ;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.FloatBuffer;

public final class Matrix3 implements Parcelable {
    public static final float[] A02 = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public static final Parcelable.Creator CREATOR = SWS.A00(66);
    public final FloatBuffer A00;
    public final float[] A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeFloatArray(this.A00.array());
    }

    public Matrix3(Parcel parcel) {
        float[] fArr = new float[9];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        0qQ.A07(wrap);
        this.A00 = wrap;
        parcel.readFloatArray(fArr);
    }

    public Matrix3() {
        float[] fArr = new float[9];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        0qQ.A07(wrap);
        this.A00 = wrap;
        wrap.position(0);
        wrap.put(A02);
        wrap.position(0);
    }
}
