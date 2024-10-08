package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C44210CZx;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class LiveNoteResponseInfo extends AnonymousClass0T0 implements Parcelable, LiveNoteResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new FK5(56);
    public final long A00;
    public final List A01;

    public final LiveNoteResponseInfo F5W(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveNoteResponseInfo) {
                LiveNoteResponseInfo liveNoteResponseInfo = (LiveNoteResponseInfo) obj;
                if (!0qQ.A0K(this.A01, liveNoteResponseInfo.A01) || this.A00 != liveNoteResponseInfo.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List<Parcelable> list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeLong(this.A00);
    }

    public final List C2Q() {
        return this.A01;
    }

    public final long C7V() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTLiveNoteResponseInfo", C44210CZx.A00(this));
    }

    public final int hashCode() {
        int hashCode;
        List list = this.A01;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        long j = this.A00;
        return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
    }

    public LiveNoteResponseInfo(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }
}
