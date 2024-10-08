package com.instagram.model.payments;

import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoDeliveryWindowInfo extends 17P implements DeliveryWindowInfo {
    public static final C3035269k CREATOR = CTA.A00(37);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoDeliveryWindowInfo, com.instagram.model.payments.DeliveryWindowInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        BPW();
        A1H.put("maximum_date", Long.valueOf(BPW()));
        BTN();
        return C41845B3m.A0S(this, C41845B3m.A0u("minimum_date", Long.valueOf(BTN()), A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final long BPW() {
        return A03(726451821);
    }

    public final long BTN() {
        return A03(1200877887);
    }

    public final DeliveryWindowInfoImpl FEf() {
        return new DeliveryWindowInfoImpl(A03(726451821), A03(1200877887));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.payments.ImmutablePandoDeliveryWindowInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
