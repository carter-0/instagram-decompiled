package libraries.access.src.main.base.common;

import X.C368108s5;
import X.C62447Kfx;
import X.SWU;
import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;

public class FXAccessLibraryDeviceRequestItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(60);
    public final C368108s5 A00;
    public final C62447Kfx A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A01.toString());
        parcel.writeString(this.A02);
    }

    public FXAccessLibraryDeviceRequestItem(Parcel parcel) {
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        if (readString == null || readString2 == null || readString3 == null) {
            throw new ParcelFormatException("Did not find expected field");
        }
        this.A00 = C368108s5.valueOf(readString);
        this.A01 = C62447Kfx.valueOf(readString2);
        this.A02 = readString3;
    }

    public FXAccessLibraryDeviceRequestItem(C368108s5 r2, C62447Kfx kfx) {
        this.A00 = r2;
        this.A01 = kfx;
        this.A02 = "";
    }
}
