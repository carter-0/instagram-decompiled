package com.instagram.settings.controlcenter.api;

import X.1XP;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class DataDownloadStatusCheckResponse extends 1XP implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(28);
    public JobStatus A00;
    public String A01;
    public String A02;
    public String A03;

    public enum JobStatus implements Parcelable {
        HAS_VALID_DOWNLOADABLE,
        JOB_IN_PROGRESS,
        NO_VALID_DOWNLOADABLE;
        
        public static final Parcelable.Creator CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        /* access modifiers changed from: public */
        static {
            CREATOR = new W6F(29);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, 0);
    }
}
