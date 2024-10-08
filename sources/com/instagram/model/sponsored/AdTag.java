package com.instagram.model.sponsored;

import X.0qQ;
import X.C257563xb;
import X.C376399Hv;
import android.graphics.PointF;
import android.os.Parcel;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

public final class AdTag extends Tag {
    public AdTagModel A00;
    public final Integer A01;

    public final class AdTagModel implements TaggableModel {
        public static final C376399Hv CREATOR = new C376399Hv(57);
        public C257563xb A00;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            0qQ.A0B(parcel, 0);
            C257563xb r1 = this.A00;
            parcel.writeValue(r1.AZ4());
            parcel.writeString(r1.getTitle());
            parcel.writeString(r1.getSubtitle());
        }

        public final String getId() {
            return String.valueOf(this.A00.AZ4());
        }
    }

    public AdTag(PointF pointF, AdTagModel adTagModel, Integer num) {
        this.A00 = adTagModel;
        this.A01 = num;
        this.A00 = pointF;
    }
}
