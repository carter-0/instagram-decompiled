package com.instagram.util.gallery;

import X.0qQ;
import X.AnonymousClass7TE;
import X.C273654mx;
import X.W6F;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class ImageManager$ImageListParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6F(96);
    public int A00;
    public int A01;
    public Uri A02;
    public Integer A03;
    public String A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A03;
        if (num != null) {
            parcel.writeInt(num.intValue());
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01);
            parcel.writeString(this.A04);
            parcel.writeParcelable(this.A02, i);
            parcel.writeInt(this.A05 ? 1 : 0);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImageListParam{loc=");
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "INTERNAL";
                    break;
                case 2:
                    str = C273654mx.A00(478);
                    break;
                case 3:
                    str = "ALL";
                    break;
                default:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
            }
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(",inc=");
        A1A.append(this.A00);
        A1A.append(",sort=");
        A1A.append(this.A01);
        A1A.append(",bucket=");
        A1A.append(this.A04);
        A1A.append(",empty=");
        A1A.append(this.A05);
        A1A.append(",single=");
        A1A.append(this.A02);
        A1A.append('}');
        return A1A.toString();
    }
}
