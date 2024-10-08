package com.instagram.model.reels.netego;

import X.0oU;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ShoppingNetegoInStoryIconType implements Parcelable {
    UNRECOGNIZED("ShoppingNetegoInStoryIconType_unspecified"),
    GIFT_CARD("gift_card"),
    SHOPPING_BAG("shopping_bag");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ShoppingNetegoInStoryIconType[] shoppingNetegoInStoryIconTypeArr;
        A02 = 0oU.A00(shoppingNetegoInStoryIconTypeArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (ShoppingNetegoInStoryIconType shoppingNetegoInStoryIconType : values()) {
            linkedHashMap.put(shoppingNetegoInStoryIconType.A00, shoppingNetegoInStoryIconType);
        }
        A01 = linkedHashMap;
        CREATOR = new C71269Ogb(67);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ShoppingNetegoInStoryIconType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
