package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44161CYa;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class IABPostClickDataDictImpl extends AnonymousClass0T0 implements Parcelable, IABPostClickDataDict {
    public static final Parcelable.Creator CREATOR = DE7.A00(97);
    public final IGBWPIABPostClickDataExtensionDict A00;
    public final List A01;

    public final IABPostClickDataDictImpl F3l() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABPostClickDataDictImpl) {
                IABPostClickDataDictImpl iABPostClickDataDictImpl = (IABPostClickDataDictImpl) obj;
                if (!0qQ.A0K(this.A00, iABPostClickDataDictImpl.A00) || !0qQ.A0K(this.A01, iABPostClickDataDictImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final IGBWPIABPostClickDataExtensionDict Aj6() {
        return this.A00;
    }

    public final List B0f() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIABPostClickDataDict", C44161CYa.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public IABPostClickDataDictImpl(IGBWPIABPostClickDataExtensionDict iGBWPIABPostClickDataExtensionDict, List list) {
        this.A00 = iGBWPIABPostClickDataExtensionDict;
        this.A01 = list;
    }
}
