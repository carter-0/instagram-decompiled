package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MusicProduct implements Parcelable {
    UNRECOGNIZED("MusicProduct_unspecified"),
    IG_AUDIO_FILTERS("audio_filters"),
    IG_GLOBAL_SEARCH("audio_global_search"),
    BOOST_AUDIO_BROWSER("boost_audio_browser"),
    CLIPS_CAMERA_FORMAT("clips_camera_format"),
    CLIPS_CAMERA_FORMAT_V2("clips_camera_format_v2"),
    CLIPS_EDIT_METADATA("clips_edit_metadata"),
    MEMORY_RESHARE("memory_reshare"),
    MENTION_RESHARE("mention_reshare"),
    MUSIC_AR_EFFECT("music_ar_effect"),
    MUSIC_AR_EFFECT_DEMO("music_ar_effect_demo"),
    MUSIC_CAMERA_FORMAT("music_camera_format"),
    MUSIC_FIRST("music_first"),
    MUSIC_IN_FEED("music_in_feed"),
    MUSIC_NOTES("music_notes"),
    MUSIC_ON_PROFILE("music_on_profile"),
    MUSIC_PICK("music_pick"),
    MUSIC_STICKER_SEND("music_sticker_send"),
    POST_CAPTURE_STICKER("post_capture_sticker"),
    QUESTION_RESPONSE("question_response"),
    QUESTION_RESPONSE_RESHARE("question_response_reshare"),
    STATUS(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS),
    UNSET("unset");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(ordinal());
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MusicProduct[] musicProductArr;
        A02 = 0oU.A00(musicProductArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MusicProduct musicProduct : values()) {
            linkedHashMap.put(musicProduct.A00, musicProduct);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(77);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MusicProduct(String str) {
        this.A00 = str;
    }
}
