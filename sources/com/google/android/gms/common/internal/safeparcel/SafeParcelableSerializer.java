package com.google.android.gms.common.internal.safeparcel;

import X.AnonymousClass3Qk;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class SafeParcelableSerializer {
    public static SafeParcelable A00(Parcelable.Creator creator, byte[] bArr) {
        AnonymousClass3Qk.A02(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }
}
