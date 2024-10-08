package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376409Hw;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ClipsCameraCommandAction implements Parcelable {
    UNRECOGNIZED("ClipsCameraCommandAction_unspecified"),
    COLLAB_EDUCATION("collab_education"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    GALLERY_FIRST("gallery_first"),
    GREEN_SCREEN_CAMERA_TOOL_OPEN("green_screen_camera_tool_open"),
    META_GALLERY("meta_gallery"),
    MWA_TOP_CAPTURES("mwa_top_captures"),
    PRELOAD_STORY("preload_story"),
    USE_AUDIO("use_audio"),
    USE_AUDIO_TRIMMING("use_audio_trimming");
    
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
        ClipsCameraCommandAction[] clipsCameraCommandActionArr;
        A02 = 0oU.A00(clipsCameraCommandActionArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ClipsCameraCommandAction clipsCameraCommandAction : values()) {
            linkedHashMap.put(clipsCameraCommandAction.A00, clipsCameraCommandAction);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsCameraCommandAction(String str) {
        this.A00 = str;
    }
}
