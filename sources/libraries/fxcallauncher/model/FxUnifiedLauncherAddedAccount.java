package libraries.fxcallauncher.model;

import X.002;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C41845B3m;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;

public final class FxUnifiedLauncherAddedAccount implements Parcelable {
    public static final Parcelable.Creator A03 = new SWU(62);
    public String A00 = "";
    public String A01 = "";
    public String A02 = "";

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FxUnifiedLauncherAddedAccount) {
                FxUnifiedLauncherAddedAccount fxUnifiedLauncherAddedAccount = (FxUnifiedLauncherAddedAccount) obj;
                if (!0qQ.A0K(this.A02, fxUnifiedLauncherAddedAccount.A02) || !0qQ.A0K(this.A01, fxUnifiedLauncherAddedAccount.A01) || !0qQ.A0K(this.A00, fxUnifiedLauncherAddedAccount.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("FxUnifiedLauncherAddedAccount(userId_DEPRECATED_DO_NOT_USE=", this.A02, ", obId=", this.A01, ", accountType=", this.A00, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A00, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02)));
    }
}
