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

public enum ClipsTextFormatType implements Parcelable {
    UNRECOGNIZED("ClipsTextFormatType_unspecified"),
    ALUMNI_SANS("alumni_sans"),
    AVENY("aveny"),
    BOLD_ITALIC("bold_italic"),
    CAPRASIMO("caprasimo"),
    CLASSIC("classic"),
    CLASSIC_V2("classic_v2"),
    DEFAULT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    DIRECTIONAL("directional"),
    DYNAPUFF("dynapuff"),
    ELEGANT("elegant"),
    HALLOWEEN("halloween"),
    HEPTA_SLAB("hepta_slab"),
    IG_BUBBLE("ig_bubble"),
    IG_CLASSIC("ig_classic"),
    IG_DECO("ig_deco"),
    IG_EDITOR("ig_editor"),
    IG_LITERATURE("ig_literature"),
    IG_POSTER("ig_poster"),
    IG_SIGNATURE("ig_signature"),
    IG_SQUEEZE("ig_squeeze"),
    LITERATURE("literature"),
    MEME("meme"),
    MODERN("modern"),
    MODERN_REFRESHED("modern_refreshed"),
    MODERN_REFRESHED_V2("modern_refreshed_v2"),
    MODERN_V2("modern_v2"),
    MONO("mono"),
    NEON("neon"),
    NEON_V2("neon_v2"),
    POPPINS("poppins"),
    SCRIPT("script"),
    SECRET_MEME("secret_meme"),
    SPARK_APP("spark_app"),
    STRONG("strong"),
    STRONG_V2("strong_v2"),
    TYPEWRITER("typewriter");
    
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
        ClipsTextFormatType[] clipsTextFormatTypeArr;
        A02 = 0oU.A00(clipsTextFormatTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (ClipsTextFormatType clipsTextFormatType : values()) {
            linkedHashMap.put(clipsTextFormatType.A00, clipsTextFormatType);
        }
        A01 = linkedHashMap;
        CREATOR = new C376409Hw(78);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTextFormatType(String str) {
        this.A00 = str;
    }
}
