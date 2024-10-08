package com.instagram.direct.model.mentions;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import android.os.Parcel;
import android.os.Parcelable;

public final class MentionedEntity extends AnonymousClass0T0 implements Parcelable {
    public static final C376419Hx CREATOR = new C376419Hx(97);
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public String A03 = "";

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MentionedEntity) {
                MentionedEntity mentionedEntity = (MentionedEntity) obj;
                if (!(0qQ.A0K(this.A03, mentionedEntity.A03) && this.A01 == mentionedEntity.A01 && this.A00 == mentionedEntity.A00 && this.A02 == mentionedEntity.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A03.hashCode() * 31) + this.A01) * 31) + this.A00) * 31) + this.A02;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
    }
}
