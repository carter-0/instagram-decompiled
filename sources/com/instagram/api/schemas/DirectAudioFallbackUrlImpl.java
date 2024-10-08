package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class DirectAudioFallbackUrlImpl extends AnonymousClass0T0 implements Parcelable, DirectAudioFallbackUrl {
    public static final Parcelable.Creator CREATOR = new C376409Hw(94);
    public final String A00;

    public DirectAudioFallbackUrlImpl(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final DirectAudioFallbackUrlImpl F2e() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DirectAudioFallbackUrlImpl) && 0qQ.A0K(this.A00, ((DirectAudioFallbackUrlImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final String Adp() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.A00;
        if (str != null) {
            linkedHashMap.put("audio_src", str);
        }
        return new TreeUpdaterJNI("XDTDirectAudioFallbackUrl", 0Yt.A0B(linkedHashMap));
    }
}
