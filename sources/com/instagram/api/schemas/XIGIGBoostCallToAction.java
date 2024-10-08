package com.instagram.api.schemas;

import X.0oU;
import X.C16851V8g;
import X.DbY;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum XIGIGBoostCallToAction implements Parcelable {
    UNRECOGNIZED("XIGIGBoostCallToAction_unspecified"),
    APPLY_NOW("APPLY_NOW"),
    ASK_ABOUT_SERVICES("ASK_ABOUT_SERVICES"),
    ASK_FOR_MORE_INFO("ASK_FOR_MORE_INFO"),
    BOOK_A_CONSULTATION("BOOK_A_CONSULTATION"),
    BOOK_NOW("BOOK_NOW"),
    BOOK_TRAVEL("BOOK_TRAVEL"),
    BUY_VIA_MESSAGE("BUY_VIA_MESSAGE"),
    CHAT_ON_WHATSAPP("CHAT_ON_WHATSAPP"),
    CHAT_WITH_US("CHAT_WITH_US"),
    CHECK_AVAILABILITY("CHECK_AVAILABILITY"),
    CONTACT_US("CONTACT_US"),
    GET_A_QUOTE("GET_A_QUOTE"),
    GET_OFFER("GET_OFFER"),
    GET_QUOTE("GET_QUOTE"),
    INSTAGRAM_MESSAGE("INSTAGRAM_MESSAGE"),
    JOIN_CHANNEL("JOIN_CHANNEL"),
    LEARN_MORE("LEARN_MORE"),
    MAKE_AN_APPOINTMENT("MAKE_AN_APPOINTMENT"),
    NO_BUTTON("NO_BUTTON"),
    ORDER_NOW("ORDER_NOW"),
    SHOP_NOW("SHOP_NOW"),
    SIGN_UP("SIGN_UP"),
    SUBSCRIBE("SUBSCRIBE"),
    VIEW_INSTAGRAM_PROFILE("VIEW_INSTAGRAM_PROFILE"),
    VIEW_PRODUCT("VIEW_PRODUCT"),
    WATCH_MORE("WATCH_MORE"),
    WHATSAPP_MESSAGE("WHATSAPP_MESSAGE");
    
    public static final C16851V8g A01 = null;
    public static final Map A02 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v30, types: [X.V8g, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        int i;
        XIGIGBoostCallToAction[] xIGIGBoostCallToActionArr;
        A03 = 0oU.A00(xIGIGBoostCallToActionArr);
        A01 = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(r4));
        for (XIGIGBoostCallToAction xIGIGBoostCallToAction : values()) {
            linkedHashMap.put(xIGIGBoostCallToAction.A00, xIGIGBoostCallToAction);
        }
        A02 = linkedHashMap;
        CREATOR = new FK6(73);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    XIGIGBoostCallToAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
