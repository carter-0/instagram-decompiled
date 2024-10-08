package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44524CgK;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class TextPostAppUserFediverseInfoImpl extends AnonymousClass0T0 implements Parcelable, TextPostAppUserFediverseInfo {
    public static final Parcelable.Creator CREATOR = new FK6(39);
    public final Integer A00;
    public final Integer A01;

    public final TextPostAppUserFediverseInfoImpl FCh() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextPostAppUserFediverseInfoImpl) {
                TextPostAppUserFediverseInfoImpl textPostAppUserFediverseInfoImpl = (TextPostAppUserFediverseInfoImpl) obj;
                if (!0qQ.A0K(this.A00, textPostAppUserFediverseInfoImpl.A00) || !0qQ.A0K(this.A01, textPostAppUserFediverseInfoImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TG.A16(parcel, this.A00, 0, 1);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
    }

    public final Integer C5L() {
        return this.A00;
    }

    public final Integer C5M() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextPostAppUserFediverseInfo", C44524CgK.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public TextPostAppUserFediverseInfoImpl(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
