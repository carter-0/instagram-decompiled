package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MidCardClipsClickedAction implements Parcelable {
    UNRECOGNIZED("MidCardClipsClickedAction_unspecified"),
    NOT_CLICKABLE("not_clickable"),
    OPEN_IN_CLIPS_VIEWER("open_in_clips_viewer"),
    OPEN_IN_DRAFT_PUBLISH_SCREEN("open_in_draft_publish_screen"),
    OPEN_IN_STORY_VIEWER("open_in_story_viewer"),
    OPEN_IN_STORY_VIEWER_WITH_CHAIN("open_in_story_viewer_with_chain");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MidCardClipsClickedAction[] midCardClipsClickedActionArr;
        A02 = 0oU.A00(midCardClipsClickedActionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MidCardClipsClickedAction midCardClipsClickedAction : values()) {
            A0x.put(midCardClipsClickedAction.A00, midCardClipsClickedAction);
        }
        A01 = A0x;
        CREATOR = new FK5(76);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MidCardClipsClickedAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
