package androidx.media3.extractor.metadata.emsg;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C7216Pzk;
import X.JTR;
import X.Pxe;
import X.Pxh;
import X.SJM;
import X.SOW;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Util;
import java.util.Arrays;

public final class EventMessage implements Metadata.Entry {
    public static final SJM A06;
    public static final SJM A07;
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(28);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public final /* synthetic */ void E36(Xo1 xo1) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !Util.A0E(this.A03, eventMessage.A03) || !Util.A0E(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int A0D = Pxh.A0D(this.A05, AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A01(this.A01, (((527 + JTR.A0G(this.A03)) * 31) + Pxh.A0B(this.A04)) * 31)));
        this.A00 = A0D;
        return A0D;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    static {
        SOW A002 = SOW.A00();
        A002.A01("application/id3");
        A06 = Pxe.A0O(A002);
        SOW A003 = SOW.A00();
        A003.A01("application/x-scte35");
        A07 = Pxe.A0O(A003);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("EMSG: scheme=");
        A1A.append(this.A03);
        A1A.append(", id=");
        A1A.append(this.A02);
        A1A.append(", durationMs=");
        A1A.append(this.A01);
        A1A.append(", value=");
        return AnonymousClass7TF.A0l(this.A04, A1A);
    }
}
