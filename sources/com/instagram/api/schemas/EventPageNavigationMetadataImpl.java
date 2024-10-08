package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.CXR;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class EventPageNavigationMetadataImpl extends AnonymousClass0T0 implements Parcelable, EventPageNavigationMetadata {
    public static final Parcelable.Creator CREATOR = DE7.A00(63);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final EventPageNavigationMetadataImpl F2m() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EventPageNavigationMetadataImpl) {
                EventPageNavigationMetadataImpl eventPageNavigationMetadataImpl = (EventPageNavigationMetadataImpl) obj;
                if (!0qQ.A0K(this.A01, eventPageNavigationMetadataImpl.A01) || !0qQ.A0K(this.A00, eventPageNavigationMetadataImpl.A00) || !0qQ.A0K(this.A02, eventPageNavigationMetadataImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        parcel.writeString(this.A02);
    }

    public final Integer BlS() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTEventPageNavigationMetadata", CXR.A00(this));
    }

    public final String getDescription() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A02);
    }

    public EventPageNavigationMetadataImpl(String str, Integer num, String str2) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = str2;
    }
}
