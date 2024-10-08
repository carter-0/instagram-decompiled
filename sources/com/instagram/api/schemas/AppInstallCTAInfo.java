package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.CUW;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AppInstallCTAInfo extends AnonymousClass0T0 implements Parcelable, AppInstallCTAInfoIntf {
    public static final Parcelable.Creator CREATOR = new SWT(40);
    public final String A00;
    public final String A01;

    public final AppInstallCTAInfo F0R() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppInstallCTAInfo) {
                AppInstallCTAInfo appInstallCTAInfo = (AppInstallCTAInfo) obj;
                if (!0qQ.A0K(this.A00, appInstallCTAInfo.A00) || !0qQ.A0K(this.A01, appInstallCTAInfo.A01)) {
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
    }

    public final String Abd() {
        return this.A00;
    }

    public final String BIv() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTAppInstallCTAInfo", CUW.A00(this));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public AppInstallCTAInfo(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
