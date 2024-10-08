package com.instagram.settings2.core.view;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public final class SettingsScreenConfirmBottomSheetFragment$Item extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(32);
    public final Integer A00;
    public final String A01;

    public SettingsScreenConfirmBottomSheetFragment$Item(String str, Integer num) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = num;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SettingsScreenConfirmBottomSheetFragment$Item) {
                SettingsScreenConfirmBottomSheetFragment$Item settingsScreenConfirmBottomSheetFragment$Item = (SettingsScreenConfirmBottomSheetFragment$Item) obj;
                if (!0qQ.A0K(this.A01, settingsScreenConfirmBottomSheetFragment$Item.A01) || !0qQ.A0K(this.A00, settingsScreenConfirmBottomSheetFragment$Item.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
