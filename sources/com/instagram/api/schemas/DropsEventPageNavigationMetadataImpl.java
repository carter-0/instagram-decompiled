package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class DropsEventPageNavigationMetadataImpl extends AnonymousClass0T0 implements Parcelable, DropsEventPageNavigationMetadata {
    public static final Parcelable.Creator CREATOR = DE7.A00(52);
    public final String A00;

    public final DropsEventPageNavigationMetadataImpl F2h() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DropsEventPageNavigationMetadataImpl) && 0qQ.A0K(this.A00, ((DropsEventPageNavigationMetadataImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0E(this.A00);
    }

    public DropsEventPageNavigationMetadataImpl(String str) {
        this.A00 = str;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        String str = this.A00;
        if (str != null) {
            A0t.put("upcoming_event_id", str);
        }
        return C41845B3m.A0T("XDTDropsEventPageNavigationMetadata", 0Yt.A0B(A0t));
    }
}
