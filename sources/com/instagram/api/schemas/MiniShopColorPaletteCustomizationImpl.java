package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class MiniShopColorPaletteCustomizationImpl extends AnonymousClass0T0 implements Parcelable, MiniShopColorPaletteCustomization {
    public static final Parcelable.Creator CREATOR = FK5.A00(81);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MiniShopColorPaletteCustomizationImpl) {
                MiniShopColorPaletteCustomizationImpl miniShopColorPaletteCustomizationImpl = (MiniShopColorPaletteCustomizationImpl) obj;
                if (!0qQ.A0K(this.A00, miniShopColorPaletteCustomizationImpl.A00) || !0qQ.A0K(this.A01, miniShopColorPaletteCustomizationImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public MiniShopColorPaletteCustomizationImpl(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
