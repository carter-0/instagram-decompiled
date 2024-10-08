package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum BrandedContentProjectAction implements Parcelable {
    UNRECOGNIZED("BrandedContentProjectAction_unspecified"),
    ADD_MEDIA_TO_PROJECT("add_media_to_project"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    REMOVE_MEDIA_FROM_PROJECT("remove_media_from_project");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        BrandedContentProjectAction[] brandedContentProjectActionArr;
        A02 = 0oU.A00(brandedContentProjectActionArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (BrandedContentProjectAction brandedContentProjectAction : values()) {
            A0x.put(brandedContentProjectAction.A00, brandedContentProjectAction);
        }
        A01 = A0x;
        CREATOR = new SWT(70);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    BrandedContentProjectAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
