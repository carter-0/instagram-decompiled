package com.facebook.smartcapture.resources.stringoverride.bloks;

import X.0qQ;
import X.C12281Sqe;
import X.C13582Td8;
import X.SWP;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.resources.stringoverride.StringOverrideFactory;
import java.util.Map;

public final class BloksStringOverrideFactory implements Parcelable, StringOverrideFactory {
    public static final SWP CREATOR = new Object();
    public final Map A00;

    public BloksStringOverrideFactory(Map map) {
        0qQ.A0B(map, 1);
        this.A00 = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeMap(this.A00);
    }

    public final C13582Td8 AL3() {
        return new C12281Sqe(this.A00);
    }
}
