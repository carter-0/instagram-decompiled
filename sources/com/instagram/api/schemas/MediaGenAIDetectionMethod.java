package com.instagram.api.schemas;

import X.0oU;
import X.0qQ;
import X.0se;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaGenAIDetectionMethod implements Parcelable {
    UNRECOGNIZED("MediaGenAIDetectionMethod_unspecified"),
    C2PA_METADATA("C2PA_METADATA"),
    C2PA_METADATA_EDITED("C2PA_METADATA_EDITED"),
    IPTC_METADATA("IPTC_METADATA"),
    IPTC_METADATA_EDITED("IPTC_METADATA_EDITED"),
    MANUAL_OVERRIDE_LABEL_OFF("MANUAL_OVERRIDE_LABEL_OFF"),
    MANUAL_OVERRIDE_LABEL_ON("MANUAL_OVERRIDE_LABEL_ON"),
    META_INVISIBLE_WATERMARK("META_INVISIBLE_WATERMARK"),
    A0B(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED),
    SELF_DISCLOSURE_FLOW("SELF_DISCLOSURE_FLOW");
    
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
        MediaGenAIDetectionMethod[] mediaGenAIDetectionMethodArr;
        A02 = 0oU.A00(mediaGenAIDetectionMethodArr);
        int A0L = 0se.A0L(r4);
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (MediaGenAIDetectionMethod mediaGenAIDetectionMethod : values()) {
            linkedHashMap.put(mediaGenAIDetectionMethod.A00, mediaGenAIDetectionMethod);
        }
        A01 = linkedHashMap;
        CREATOR = new C376389Hu(55);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaGenAIDetectionMethod(String str) {
        this.A00 = str;
    }
}
