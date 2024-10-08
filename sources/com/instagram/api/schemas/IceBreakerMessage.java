package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C16821V7c;
import X.C17480VXh;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IceBreakerMessage extends AnonymousClass0T0 implements Parcelable, IceBreakerMessageIntf {
    public static final Parcelable.Creator CREATOR = new C376389Hu(44);
    public final String A00;
    public final String A01;
    public final String A02;

    public final IceBreakerMessage F58() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IceBreakerMessage) {
                IceBreakerMessage iceBreakerMessage = (IceBreakerMessage) obj;
                if (!0qQ.A0K(this.A00, iceBreakerMessage.A00) || !0qQ.A0K(this.A01, iceBreakerMessage.A01) || !0qQ.A0K(this.A02, iceBreakerMessage.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final /* bridge */ /* synthetic */ C17480VXh AKF() {
        return new C17480VXh(this);
    }

    public final String BSH() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIceBreakerMessage", C16821V7c.A00(this));
    }

    public final String getActionUrl() {
        return this.A00;
    }

    public final String getMessage() {
        return this.A01;
    }

    public IceBreakerMessage(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
