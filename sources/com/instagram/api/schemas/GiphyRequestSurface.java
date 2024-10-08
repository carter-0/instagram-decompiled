package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.LinkedHashMap;
import java.util.Map;

public enum GiphyRequestSurface implements Parcelable {
    UNRECOGNIZED("GiphyRequestSurface_unspecified"),
    STORIES_ASSET_SEARCH_TRAY("stories_asset_search_tray"),
    CREATE_MODE("create_mode"),
    DIRECT(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING),
    THREADS_DIRECT("threads_direct"),
    THREADS_STORIES_ASSET_SEARCH_TRAY("threads_stories_asset_search_tray"),
    CLIPS_V2("clips_v2"),
    SMART_GIF("smart_gif"),
    EMOJI_PICKER_SHEET("emoji_picker_sheet"),
    COMMENT(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        GiphyRequestSurface[] giphyRequestSurfaceArr;
        A02 = 0oU.A00(giphyRequestSurfaceArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r4));
        for (GiphyRequestSurface giphyRequestSurface : values()) {
            A0x.put(giphyRequestSurface.A00, giphyRequestSurface);
        }
        A01 = A0x;
        CREATOR = new DE7(84);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    GiphyRequestSurface(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
