package com.instagram.api.schemas;

import X.0qQ;
import X.1E9;
import X.AnonymousClass0T0;
import X.C44207CZu;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ListeningNowResponseInfo extends AnonymousClass0T0 implements Parcelable, ListeningNowResponseInfoIntf {
    public static final Parcelable.Creator CREATOR = new FK5(54);
    public final ListeningNowState A00;
    public final MusicInfo A01;
    public final Boolean A02;
    public final Integer A03;

    public ListeningNowResponseInfo(ListeningNowState listeningNowState, MusicInfo musicInfo, Boolean bool, Integer num) {
        0qQ.A0B(listeningNowState, 2);
        this.A02 = bool;
        this.A00 = listeningNowState;
        this.A01 = musicInfo;
        this.A03 = num;
    }

    public final ListeningNowResponseInfo F5U(1E9 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ListeningNowResponseInfo) {
                ListeningNowResponseInfo listeningNowResponseInfo = (ListeningNowResponseInfo) obj;
                if (!0qQ.A0K(this.A02, listeningNowResponseInfo.A02) || this.A00 != listeningNowResponseInfo.A00 || !0qQ.A0K(this.A01, listeningNowResponseInfo.A01) || !0qQ.A0K(this.A03, listeningNowResponseInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A02;
        int i = 0;
        int hashCode = (((bool == null ? 0 : bool.hashCode()) * 31) + this.A00.hashCode()) * 31;
        MusicInfo musicInfo = this.A01;
        int hashCode2 = (hashCode + (musicInfo == null ? 0 : musicInfo.hashCode())) * 31;
        Integer num = this.A03;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Boolean bool = this.A02;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public final ListeningNowState BNC() {
        return this.A00;
    }

    public final MusicInfo BUr() {
        return this.A01;
    }

    public final Integer BXH() {
        return this.A03;
    }

    public final Boolean CcP() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTListeningNowResponseInfo", C44207CZu.A00(this));
    }
}
