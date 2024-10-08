package com.instagram.model.direct;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import X.DbS;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

public final class DirectPendingLayeredXma extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(34);
    public final ExtendedImageUrl A00;
    public final ExtendedImageUrl A01;
    public final User A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DirectPendingLayeredXma) {
                DirectPendingLayeredXma directPendingLayeredXma = (DirectPendingLayeredXma) obj;
                if (!0qQ.A0K(this.A04, directPendingLayeredXma.A04) || !0qQ.A0K(this.A03, directPendingLayeredXma.A03) || !0qQ.A0K(this.A02, directPendingLayeredXma.A02) || this.A05 != directPendingLayeredXma.A05 || !0qQ.A0K(this.A01, directPendingLayeredXma.A01) || !0qQ.A0K(this.A00, directPendingLayeredXma.A00) || this.A06 != directPendingLayeredXma.A06) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public final int hashCode() {
        boolean z = this.A05;
        return DbS.A06(this.A06, (((AnonymousClass7TF.A09(z, ((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00)) * 31);
    }

    public DirectPendingLayeredXma(ExtendedImageUrl extendedImageUrl, ExtendedImageUrl extendedImageUrl2, User user, String str, String str2, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = str2;
        this.A02 = user;
        this.A05 = z;
        this.A01 = extendedImageUrl;
        this.A00 = extendedImageUrl2;
        this.A06 = z2;
    }
}
