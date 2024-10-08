package libraries.access.src.main.base.common;

import X.C368108s5;
import X.C62447Kfx;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class FXDeviceItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(61);
    public C368108s5 A00;
    public final Long A01;
    public final String A02;
    public final C62447Kfx A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FXDeviceItem fXDeviceItem = (FXDeviceItem) obj;
            if (this.A00 != fXDeviceItem.A00) {
                return false;
            }
            String str = this.A02;
            String str2 = fXDeviceItem.A02;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.A03 != fXDeviceItem.A03) {
                return false;
            }
            Long l = this.A01;
            Long l2 = fXDeviceItem.A01;
            return l == null ? l2 == null : l.equals(l2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A03, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        long longValue;
        C368108s5 r0 = this.A00;
        String str = null;
        if (r0 == null) {
            obj = null;
        } else {
            obj = r0.toString();
        }
        parcel.writeString(obj);
        C62447Kfx kfx = this.A03;
        if (kfx != null) {
            str = kfx.toString();
        }
        parcel.writeString(str);
        parcel.writeString(this.A02);
        Long l = this.A01;
        if (l == null) {
            longValue = -1;
        } else {
            longValue = l.longValue();
        }
        parcel.writeLong(longValue);
    }

    public FXDeviceItem(Parcel parcel) {
        C368108s5 valueOf;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        C62447Kfx kfx = null;
        if (readString == null) {
            valueOf = null;
        } else {
            valueOf = C368108s5.valueOf(readString);
        }
        this.A00 = valueOf;
        this.A03 = readString2 != null ? C62447Kfx.valueOf(readString2) : kfx;
        this.A02 = parcel.readString();
        this.A01 = Long.valueOf(parcel.readLong());
    }

    public FXDeviceItem(Long l, String str, C368108s5 r3, C62447Kfx kfx) {
        this.A00 = r3;
        this.A03 = kfx;
        this.A02 = str;
        this.A01 = l;
    }
}
