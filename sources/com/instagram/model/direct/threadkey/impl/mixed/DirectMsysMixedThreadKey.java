package com.instagram.model.direct.threadkey.impl.mixed;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C254743sy;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import kotlin.Deprecated;

@Deprecated(message = "Replaced by DirectMsysMixedThreadTarget and DirectMsysMixedThreadId")
public final class DirectMsysMixedThreadKey extends AnonymousClass0T0 implements Parcelable, C254743sy {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(48);
    public final DirectThreadKey A00;
    public final MsysThreadId A01;

    public DirectMsysMixedThreadKey(DirectThreadKey directThreadKey, MsysThreadId msysThreadId) {
        0qQ.A0B(directThreadKey, 1);
        0qQ.A0B(msysThreadId, 2);
        this.A00 = directThreadKey;
        this.A01 = msysThreadId;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectMsysMixedThreadKey) {
                DirectMsysMixedThreadKey directMsysMixedThreadKey = (DirectMsysMixedThreadKey) obj;
                if (!0qQ.A0K(this.A00, directMsysMixedThreadKey.A00) || !0qQ.A0K(this.A01, directMsysMixedThreadKey.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
