package androidx.media3.extractor.metadata.dvbsi;

import X.002;
import X.C7216Pzk;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(27);
    public final int A00;
    public final String A01;

    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return 002.A08(this.A00, "Ait(controlCode=", ",url=", this.A01, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }

    public AppInfoTable(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
