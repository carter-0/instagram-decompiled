package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ClipsBreakingCreatorInfoImpl extends AnonymousClass0T0 implements Parcelable, ClipsBreakingCreatorInfo {
    public static final Parcelable.Creator CREATOR = new SWT(95);
    public final String A00;

    public ClipsBreakingCreatorInfoImpl(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final ClipsBreakingCreatorInfoImpl F1S() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ClipsBreakingCreatorInfoImpl) && 0qQ.A0K(this.A00, ((ClipsBreakingCreatorInfoImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("display_label", str);
        }
        return C41845B3m.A0T("XDTClipsBreakingCreatorInfo", 0Yt.A0B(A0t));
    }
}
