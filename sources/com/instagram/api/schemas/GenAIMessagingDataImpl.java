package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CY0;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GenAIMessagingDataImpl extends AnonymousClass0T0 implements Parcelable, GenAIMessagingData {
    public static final Parcelable.Creator CREATOR = DE7.A00(80);
    public final String A00;
    public final String A01;

    public final GenAIMessagingDataImpl F3L() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GenAIMessagingDataImpl) {
                GenAIMessagingDataImpl genAIMessagingDataImpl = (GenAIMessagingDataImpl) obj;
                if (!0qQ.A0K(this.A00, genAIMessagingDataImpl.A00) || !0qQ.A0K(this.A01, genAIMessagingDataImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final String AhB() {
        return this.A00;
    }

    public final String C6C() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGenAIMessagingData", CY0.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public GenAIMessagingDataImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
