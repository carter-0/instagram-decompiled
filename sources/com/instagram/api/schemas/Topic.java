package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44542Cgc;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class Topic extends AnonymousClass0T0 implements Parcelable, TopicIntf {
    public static final Parcelable.Creator CREATOR = new FK6(47);
    public final String A00;
    public final String A01;

    public Topic(String str, String str2) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public final Topic FCu() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Topic) {
                Topic topic = (Topic) obj;
                if (!0qQ.A0K(this.A00, topic.A00) || !0qQ.A0K(this.A01, topic.A01)) {
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

    public final String C8W() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTopic", C44542Cgc.A00(this));
    }

    public final String getStatus() {
        return this.A00;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TG.A0E(this.A00) * 31);
    }
}
