package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.B54;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class MediaReminderImpl extends AnonymousClass0T0 implements Parcelable, MediaReminder {
    public static final Parcelable.Creator CREATOR = new C376389Hu(61);
    public final Boolean A00;
    public final Integer A01;

    public final MediaReminderImpl F60() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaReminderImpl) {
                MediaReminderImpl mediaReminderImpl = (MediaReminderImpl) obj;
                if (!0qQ.A0K(this.A01, mediaReminderImpl.A01) || !0qQ.A0K(this.A00, mediaReminderImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.A00;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A01;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.A00;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public final Integer B2f() {
        return this.A01;
    }

    public final Boolean Cac() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdMediaReminderInfo", B54.A00(this));
    }

    public MediaReminderImpl(Boolean bool, Integer num) {
        this.A01 = num;
        this.A00 = bool;
    }
}
