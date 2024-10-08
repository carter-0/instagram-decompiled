package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImageURIDictImpl extends AnonymousClass0T0 implements Parcelable, ImageURIDict {
    public static final Parcelable.Creator CREATOR = new FK5(36);
    public final String A00;

    public ImageURIDictImpl(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final ImageURIDictImpl F5B() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof ImageURIDictImpl) && 0qQ.A0K(this.A00, ((ImageURIDictImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String getUri() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("uri", str);
        }
        return C41845B3m.A0T("XDTImageURIDict", 0Yt.A0B(A0t));
    }
}
