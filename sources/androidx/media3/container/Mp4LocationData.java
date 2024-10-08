package androidx.media3.container;

import X.002;
import X.AnonymousClass7TE;
import X.C66583MXo;
import X.C7216Pzk;
import X.Xo1;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;

public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(21);
    public final float A00;
    public final float A01;

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
            Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
            if (!(this.A00 == mp4LocationData.A00 && this.A01 == mp4LocationData.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(Float.valueOf(this.A01), C66583MXo.A01(Float.valueOf(this.A00).hashCode()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r4 > 180.0f) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Mp4LocationData(float r3, float r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x001c
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x001c
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            java.lang.String r0 = "Invalid latitude or longitude"
            X.C11366SPh.A03(r1, r0)
            r2.A00 = r3
            r2.A01 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.Mp4LocationData.<init>(float, float):void");
    }

    public final String toString() {
        return 002.A0a("xyz: latitude=", ", longitude=", this.A00, this.A01);
    }

    public Mp4LocationData(Parcel parcel) {
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
    }
}
