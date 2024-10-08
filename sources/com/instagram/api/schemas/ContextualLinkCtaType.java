package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE7;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum ContextualLinkCtaType implements Parcelable {
    UNRECOGNIZED("ContextualLinkCtaType_unspecified"),
    CONTENT_APPRECIATION("content_appreciation"),
    CREATOR_PICK("creator_pick"),
    MASHUP("mashup"),
    SEE_MORE_PROMPTS("see_more_prompts"),
    SEQUENCE("sequence"),
    TEMPLATE("template");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        ContextualLinkCtaType[] contextualLinkCtaTypeArr;
        A02 = 0oU.A00(contextualLinkCtaTypeArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (ContextualLinkCtaType contextualLinkCtaType : values()) {
            A0x.put(contextualLinkCtaType.A00, contextualLinkCtaType);
        }
        A01 = A0x;
        CREATOR = new DE7(28);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    ContextualLinkCtaType(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
