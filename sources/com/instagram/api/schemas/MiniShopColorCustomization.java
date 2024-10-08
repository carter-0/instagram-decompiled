package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;

public final class MiniShopColorCustomization extends AnonymousClass0T0 implements Parcelable, MiniShopColorCustomizationIntf {
    public static final Parcelable.Creator CREATOR = new FK5(80);
    public final MiniShopColorPaletteCustomization A00;
    public final MiniShopColorPaletteCustomization A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MiniShopColorCustomization) {
                MiniShopColorCustomization miniShopColorCustomization = (MiniShopColorCustomization) obj;
                if (!0qQ.A0K(this.A00, miniShopColorCustomization.A00) || !0qQ.A0K(this.A01, miniShopColorCustomization.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public MiniShopColorCustomization(MiniShopColorPaletteCustomization miniShopColorPaletteCustomization, MiniShopColorPaletteCustomization miniShopColorPaletteCustomization2) {
        AnonymousClass7TG.A1O(miniShopColorPaletteCustomization, miniShopColorPaletteCustomization2);
        this.A00 = miniShopColorPaletteCustomization;
        this.A01 = miniShopColorPaletteCustomization2;
    }
}
