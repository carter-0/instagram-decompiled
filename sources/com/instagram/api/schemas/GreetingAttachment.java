package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.DE7;
import X.V7E;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class GreetingAttachment extends AnonymousClass0T0 implements Parcelable, GreetingAttachmentIntf {
    public static final Parcelable.Creator CREATOR = new DE7(88);
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    public final GreetingAttachment F3T() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GreetingAttachment) {
                GreetingAttachment greetingAttachment = (GreetingAttachment) obj;
                if (!0qQ.A0K(this.A00, greetingAttachment.A00) || !0qQ.A0K(this.A02, greetingAttachment.A02) || !0qQ.A0K(this.A01, greetingAttachment.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.A01;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A02);
        Integer num2 = this.A01;
        if (num2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num2.intValue());
    }

    public final Integer BCu() {
        return this.A00;
    }

    public final Integer CGY() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTGreetingAttachment", V7E.A00(this));
    }

    public final String getUrl() {
        return this.A02;
    }

    public GreetingAttachment(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
