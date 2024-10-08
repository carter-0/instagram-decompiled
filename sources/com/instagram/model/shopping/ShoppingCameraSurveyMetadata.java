package com.instagram.model.shopping;

import X.0qQ;
import X.28D;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.User;
import java.util.HashSet;

public final class ShoppingCameraSurveyMetadata extends AnonymousClass0T0 implements Parcelable {
    public static final C71269Ogb CREATOR = new C71269Ogb(90);
    public int A00;
    public long A01;
    public 28D A02;
    public User A03;
    public String A04;
    public String A05;
    public final HashSet A06 = AnonymousClass7TE.A1F();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ShoppingCameraSurveyMetadata) {
                ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = (ShoppingCameraSurveyMetadata) obj;
                if (!0qQ.A0K(this.A04, shoppingCameraSurveyMetadata.A04) || !0qQ.A0K(this.A03, shoppingCameraSurveyMetadata.A03) || !0qQ.A0K(this.A05, shoppingCameraSurveyMetadata.A05) || this.A02 != shoppingCameraSurveyMetadata.A02 || this.A00 != shoppingCameraSurveyMetadata.A00 || this.A01 != shoppingCameraSurveyMetadata.A01) {
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
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A05);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A01);
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A05, (AnonymousClass7TE.A0O(this.A04) + AnonymousClass7TG.A0C(this.A03)) * 31);
        long j = this.A01;
        return ((AnonymousClass7TF.A07(this.A02, A08) + this.A00) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public ShoppingCameraSurveyMetadata(28D r2, User user, String str, String str2, int i, long j) {
        AnonymousClass7TG.A1P(str, str2);
        this.A04 = str;
        this.A03 = user;
        this.A05 = str2;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = j;
    }
}
