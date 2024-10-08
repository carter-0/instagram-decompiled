package com.instagram.shopping.intf.productpicker;

import X.0Yt;
import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.C41848B3p;
import X.JTS;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.ProductCollection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class MultiProductPickerResult extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(40);
    public final ProductCollectionFeedTaggingMeta A00;
    public final ProductCollection A01;
    public final List A02;
    public final Map A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MultiProductPickerResult) {
                MultiProductPickerResult multiProductPickerResult = (MultiProductPickerResult) obj;
                if (!0qQ.A0K(this.A02, multiProductPickerResult.A02) || !0qQ.A0K(this.A03, multiProductPickerResult.A03) || !0qQ.A0K(this.A01, multiProductPickerResult.A01) || !0qQ.A0K(this.A00, multiProductPickerResult.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A02);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        Map map = this.A03;
        parcel.writeInt(map.size());
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            parcel.writeParcelable((Parcelable) JTS.A0f(parcel, A0u), i);
        }
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A02)) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public MultiProductPickerResult(ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta, ProductCollection productCollection, List list, Map map) {
        AnonymousClass7TG.A1O(list, map);
        this.A02 = list;
        this.A03 = map;
        this.A01 = productCollection;
        this.A00 = productCollectionFeedTaggingMeta;
    }

    public MultiProductPickerResult() {
        this((ProductCollectionFeedTaggingMeta) null, (ProductCollection) null, 0sn.A00, 0Yt.A0E());
    }
}
