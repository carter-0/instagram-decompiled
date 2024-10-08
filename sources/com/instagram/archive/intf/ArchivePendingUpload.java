package com.instagram.archive.intf;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.DbS;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;

public final class ArchivePendingUpload extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FK6(81);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ArchivePendingUpload) {
                ArchivePendingUpload archivePendingUpload = (ArchivePendingUpload) obj;
                if (!(0qQ.A0K(this.A03, archivePendingUpload.A03) && this.A05 == archivePendingUpload.A05 && this.A02 == archivePendingUpload.A02 && this.A00 == archivePendingUpload.A00 && this.A01 == archivePendingUpload.A01 && this.A04 == archivePendingUpload.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A03) * 31;
        return DbS.A06(this.A04, (((((AnonymousClass7TF.A09(this.A05, A0E) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31);
    }

    public ArchivePendingUpload(String str, int i, int i2, int i3, boolean z, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z2;
    }
}
