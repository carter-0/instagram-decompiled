package com.instagram.model.payments;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class DeliveryWindowInfoImpl extends AnonymousClass0T0 implements Parcelable, DeliveryWindowInfo {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(61);
    public final long A00;
    public final long A01;

    public final DeliveryWindowInfoImpl FEf() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeliveryWindowInfoImpl) {
                DeliveryWindowInfoImpl deliveryWindowInfoImpl = (DeliveryWindowInfoImpl) obj;
                if (!(this.A00 == deliveryWindowInfoImpl.A00 && this.A01 == deliveryWindowInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
    }

    public final long BPW() {
        return this.A00;
    }

    public final long BTN() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BPW();
        A1H.put("maximum_date", Long.valueOf(BPW()));
        BTN();
        return C41845B3m.A0T("XDTDeliveryWindowDict", C41845B3m.A0u("minimum_date", Long.valueOf(BTN()), A1H));
    }

    public final int hashCode() {
        long j = this.A00;
        long j2 = this.A01;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public DeliveryWindowInfoImpl(long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
    }
}
