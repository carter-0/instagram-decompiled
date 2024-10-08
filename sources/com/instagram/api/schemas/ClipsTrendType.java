package com.instagram.api.schemas;

import X.0oU;
import X.0se;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

public enum ClipsTrendType implements Parcelable {
    UNRECOGNIZED("ClipsTrendType_unspecified"),
    AUDIO(MediaStreamTrack.AUDIO_TRACK_KIND),
    AUTHOR("author"),
    CONSUMPTION_AUDIO("consumption_audio"),
    DAT("dat"),
    DVT("dvt"),
    EFFECT("effect"),
    EMPTY(""),
    GDT_AUDIO("gdt_audio"),
    HASHTAG("hashtag"),
    ID2("id2"),
    INTERESTFM_ENTITY("interestfm_entity"),
    JSTM_DVT("jstm_dvt"),
    LOCATION("location"),
    MEDIA("media"),
    P92_TRENDS_INTERESTFM_ENTITY("p92_trends_interestfm_entity"),
    P92_TRENDS_INTERESTFM_ENTITY_HIGH_RECALL("p92_trends_interestfm_entity_high_recall"),
    P92_TRENDS_TOKEN_ENTITY("p92_trends_token_entity"),
    P92_TRENDS_TOKEN_ENTITY_FAST("p92_trends_token_entity_fast"),
    P92_TRENDS_TOP_SEARCH_ENTITY("p92_trends_top_search_entity"),
    T3_EMBEDDING("t3_embedding"),
    TUTORIAL("tutorial");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ClipsTrendType[] clipsTrendTypeArr;
        A02 = 0oU.A00(clipsTrendTypeArr);
        int A0L = 0se.A0L(r3);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap A0x = DbS.A0x(A0L);
        for (ClipsTrendType clipsTrendType : values()) {
            A0x.put(clipsTrendType.A00, clipsTrendType);
        }
        A01 = A0x;
        CREATOR = new DE7(7);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ClipsTrendType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
