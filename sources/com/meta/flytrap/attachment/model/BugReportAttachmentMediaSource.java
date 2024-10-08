package com.meta.flytrap.attachment.model;

import X.0eO;
import X.0oU;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.C255463uA;
import X.C73891PlS;
import X.SWU;
import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.Serializable;

@Serializable
public enum BugReportAttachmentMediaSource implements Parcelable {
    BUG_REPORTER,
    CAMERA_ROLL,
    BUILT_IN_SCREENSHOT_CAPTURE,
    BUILT_IN_SCREENCAP_CAPTURE,
    NON_MEDIA,
    ANNOTATION;
    
    public static final AnonymousClass0eM A00 = null;
    public static final Parcelable.Creator CREATOR = null;
    public static final Companion Companion = null;

    public final class Companion {
        public final C255463uA serializer() {
            return (C255463uA) BugReportAttachmentMediaSource.A00.getValue();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        AnonymousClass7TE.A1T(parcel, this);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource$Companion, java.lang.Object] */
    /* access modifiers changed from: public */
    static {
        BugReportAttachmentMediaSource[] bugReportAttachmentMediaSourceArr;
        A01 = 0oU.A00(bugReportAttachmentMediaSourceArr);
        Companion = new Object();
        CREATOR = new SWU(20);
        A00 = AnonymousClass0eN.A00(0eO.A03, C73891PlS.A00);
    }
}
