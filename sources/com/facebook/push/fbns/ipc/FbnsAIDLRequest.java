package com.facebook.push.fbns.ipc;

import X.AnonymousClass0Wh;
import android.os.Parcel;
import android.os.Parcelable;

public final class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Parcelable.Creator CREATOR = new AnonymousClass0Wh();
    public int A00;

    public final void A00(Parcel parcel, int i) {
        super.A00(parcel, i);
        parcel.writeInt(this.A00);
    }
}
