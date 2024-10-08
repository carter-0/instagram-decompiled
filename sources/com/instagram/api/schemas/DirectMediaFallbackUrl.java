package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class DirectMediaFallbackUrl extends AnonymousClass0T0 implements Parcelable, DirectMediaFallbackUrlIntf {
    public static final Parcelable.Creator CREATOR = new C376409Hw(95);
    public final String A00;

    public DirectMediaFallbackUrl(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final DirectMediaFallbackUrl F2f() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DirectMediaFallbackUrl) && 0qQ.A0K(this.A00, ((DirectMediaFallbackUrl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("url", str);
        }
        return new TreeUpdaterJNI("XDTDirectMediaFallbackUrl", 0Yt.A0B(linkedHashMap));
    }

    public final String getUrl() {
        return this.A00;
    }
}
