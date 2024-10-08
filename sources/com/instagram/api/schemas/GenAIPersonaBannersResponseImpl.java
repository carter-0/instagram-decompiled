package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CY4;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class GenAIPersonaBannersResponseImpl extends AnonymousClass0T0 implements Parcelable, GenAIPersonaBannersResponse {
    public static final Parcelable.Creator CREATOR = DE7.A00(82);
    public final List A00;

    public GenAIPersonaBannersResponseImpl(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final GenAIPersonaBannersResponseImpl F3N() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof GenAIPersonaBannersResponseImpl) && 0qQ.A0K(this.A00, ((GenAIPersonaBannersResponseImpl) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A00);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
    }

    public final List AfJ() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTGenAIPersonaBannersResponse", CY4.A00(this));
    }
}
