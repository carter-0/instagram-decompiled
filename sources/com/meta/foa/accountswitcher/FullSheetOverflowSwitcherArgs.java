package com.meta.foa.accountswitcher;

import X.0qQ;
import X.AnonymousClass7TG;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.foa.session.FoaUserSession;

public final class FullSheetOverflowSwitcherArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(22);
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public FullSheetOverflowSwitcherArgs(FoaUserSession foaUserSession, String str, String str2) {
        AnonymousClass7TG.A1U(foaUserSession, str, str2);
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
