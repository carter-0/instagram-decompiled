package com.instagram.business.promote.model;

import X.0oU;
import X.0qQ;
import X.Pxg;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.textwithentities.model.TextWithEntities;

public final class PromoteIntegrityCheckMessage implements Parcelable {
    public static final W6D CREATOR = new W6D(45);
    public Type A00;
    public TextWithEntities A01;
    public String A02;
    public String A03;

    public enum Type implements Parcelable {
        ACTIVE_FEEDBACK,
        ERROR,
        WARNING,
        TIP;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            Type[] typeArr;
            A00 = 0oU.A00(typeArr);
            CREATOR = new W6D(46);
        }

        public final String toString() {
            return name();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            Pxg.A1G(parcel, this);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
