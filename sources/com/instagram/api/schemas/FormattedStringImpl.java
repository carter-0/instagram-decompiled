package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class FormattedStringImpl extends AnonymousClass0T0 implements Parcelable, FormattedString {
    public static final Parcelable.Creator CREATOR = DE7.A00(73);
    public final String A00;

    public FormattedStringImpl(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final FormattedStringImpl F3F() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof FormattedStringImpl) && 0qQ.A0K(this.A00, ((FormattedStringImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String getText() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            C41845B3m.A10(str, A0t);
        }
        return C41845B3m.A0T("XDTFormattedString", 0Yt.A0B(A0t));
    }
}
