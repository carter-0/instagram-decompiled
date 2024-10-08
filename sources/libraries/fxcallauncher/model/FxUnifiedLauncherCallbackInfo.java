package libraries.fxcallauncher.model;

import X.0qQ;
import X.0sn;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class FxUnifiedLauncherCallbackInfo implements Parcelable {
    public String A00;
    public String A01 = "";
    public String A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelableArray((Parcelable[]) this.A03.toArray(new FxUnifiedLauncherAddedAccount[0]), i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public FxUnifiedLauncherCallbackInfo() {
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 2);
        this.A03 = r1;
        this.A02 = "";
        this.A00 = "";
    }
}
