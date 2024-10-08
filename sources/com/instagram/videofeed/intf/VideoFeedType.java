package com.instagram.videofeed.intf;

import X.0oU;
import X.0qQ;
import X.AnonymousClass7TE;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;

public enum VideoFeedType implements Parcelable {
    EXPLORE_CHANNEL,
    EXPLORE_MEDIA_VIDEO_CHAINING,
    EXPLORE_IGTV_PREVIEW,
    KEYWORD_CHANNEL;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* access modifiers changed from: public */
    static {
        VideoFeedType[] videoFeedTypeArr;
        A00 = 0oU.A00(videoFeedTypeArr);
        CREATOR = new W6F(98);
    }
}
