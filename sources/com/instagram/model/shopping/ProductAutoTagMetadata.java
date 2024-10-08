package com.instagram.model.shopping;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

public final class ProductAutoTagMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(82);
    public final PointF A00;
    public final Float A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductAutoTagMetadata) {
                ProductAutoTagMetadata productAutoTagMetadata = (ProductAutoTagMetadata) obj;
                if (!0qQ.A0K(this.A01, productAutoTagMetadata.A01) || !0qQ.A0K(this.A00, productAutoTagMetadata.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        parcel.writeParcelable(this.A00, i);
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public ProductAutoTagMetadata(PointF pointF, Float f) {
        this.A01 = f;
        this.A00 = pointF;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ProductAutoTagMetadata(confidenceLevel=");
        A1A.append(this.A01);
        A1A.append(", originalCoordinates=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
