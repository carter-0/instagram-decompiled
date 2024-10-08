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

public enum LinkAttachmentDisallowedReason implements Parcelable {
    UNRECOGNIZED("LinkAttachmentDisallowedReason_unspecified"),
    C18_REGULATED("c18_regulated");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        LinkAttachmentDisallowedReason[] linkAttachmentDisallowedReasonArr;
        A02 = 0oU.A00(linkAttachmentDisallowedReasonArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (LinkAttachmentDisallowedReason linkAttachmentDisallowedReason : values()) {
            A0x.put(linkAttachmentDisallowedReason.A00, linkAttachmentDisallowedReason);
        }
        A01 = A0x;
        CREATOR = FK5.A00(50);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    LinkAttachmentDisallowedReason(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
