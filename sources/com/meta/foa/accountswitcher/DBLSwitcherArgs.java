package com.meta.foa.accountswitcher;

import X.0qQ;
import X.C41848B3p;
import X.C51974G9v;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.foa.session.FoaUserSession;
import java.util.Iterator;
import java.util.List;

public final class DBLSwitcherArgs implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(21);
    public final FoaUserSession A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Iterator A1F = C41848B3p.A1F(parcel, this.A03);
        while (A1F.hasNext()) {
            ((UserAccountInfo) A1F.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public DBLSwitcherArgs(FoaUserSession foaUserSession, String str, String str2, List list) {
        C51974G9v.A1M(foaUserSession, str, str2);
        this.A03 = list;
        this.A00 = foaUserSession;
        this.A01 = str;
        this.A02 = str2;
    }
}
