package com.instagram.model.barcelonashare;

import X.AnonymousClass00P;
import X.C62630Kj1;
import android.graphics.PointF;
import android.os.Parcel;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;

public final class BarcelonaTag extends Tag {
    public BarcelonaTagModel A00;

    public final class BarcelonaTagModel implements TaggableModel {
        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
        }

        public final String getId() {
            return "";
        }
    }

    public final String A03() {
        return "";
    }

    public final String A04() {
        return "";
    }

    public final PointF A00() {
        return this.A00;
    }

    public final C62630Kj1 A01() {
        return C62630Kj1.BARCELONA_SHARE;
    }

    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ void A06(TaggableModel taggableModel) {
        throw AnonymousClass00P.createAndThrow();
    }
}
