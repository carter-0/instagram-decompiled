package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CXM;
import X.DE7;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class EntityImpl extends AnonymousClass0T0 implements Parcelable, Entity {
    public static final Parcelable.Creator CREATOR = DE7.A00(58);
    public final String A00;
    public final String A01;
    public final String A02;

    public EntityImpl(String str, String str2, String str3) {
        0qQ.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public final EntityImpl F2k() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EntityImpl) {
                EntityImpl entityImpl = (EntityImpl) obj;
                if (!0qQ.A0K(this.A00, entityImpl.A00) || !0qQ.A0K(this.A01, entityImpl.A01) || !0qQ.A0K(this.A02, entityImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final String CAs() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTEntity", CXM.A00(this));
    }

    public final String getId() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A02);
    }
}
