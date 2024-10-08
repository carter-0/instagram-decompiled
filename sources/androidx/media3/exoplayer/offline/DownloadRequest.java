package androidx.media3.exoplayer.offline;

import X.002;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41848B3p;
import X.C7216Pzk;
import X.DbS;
import X.JTR;
import X.Pxh;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(25);
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final byte[] A05;
    public final byte[] A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.A02.equals(downloadRequest.A02) || !this.A00.equals(downloadRequest.A00) || !Util.A0E(this.A03, downloadRequest.A03) || !this.A04.equals(downloadRequest.A04) || !Arrays.equals(this.A06, downloadRequest.A06) || !Util.A0E(this.A01, downloadRequest.A01) || !Arrays.equals(this.A05, downloadRequest.A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A02) * 31;
        byte[] bArr = this.A06;
        return Pxh.A0D(this.A05, ((Pxh.A0D(bArr, (((AnonymousClass7TF.A07(this.A00, A0O) + JTR.A0G(this.A03)) * 31) + this.A04.hashCode()) * 31) * 31) + Pxh.A0B(this.A01)) * 31);
    }

    public final String toString() {
        return 002.A0g(this.A03, ":", this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A03);
        List list = this.A04;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.A06);
        parcel.writeString(this.A01);
        parcel.writeByteArray(this.A05);
    }

    public DownloadRequest(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = Uri.parse(parcel.readString());
        this.A03 = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList A0v = DbS.A0v(readInt);
        for (int i = 0; i < readInt; i++) {
            C41848B3p.A1J(parcel, StreamKey.class, A0v);
        }
        this.A04 = Collections.unmodifiableList(A0v);
        this.A06 = parcel.createByteArray();
        this.A01 = parcel.readString();
        this.A05 = parcel.createByteArray();
    }
}
