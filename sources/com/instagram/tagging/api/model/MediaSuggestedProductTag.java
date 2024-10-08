package com.instagram.tagging.api.model;

import X.C14502TxO;
import X.C376399Hv;
import X.C62565Khv;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.tagging.model.Tag;
import com.instagram.user.model.Product;
import java.util.List;

public final class MediaSuggestedProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = new C376399Hv(77);
    public PointF A00;
    public C62565Khv A01;
    public List A02;

    public final Product A07() {
        List list = this.A02;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return C14502TxO.A00(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01);
    }

    public final Float A08() {
        List list = this.A02;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return Float.valueOf(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A00);
    }

    public final boolean A09() {
        if (this.A01 == C62565Khv.AUTO_PLACE) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01.A00);
    }
}
