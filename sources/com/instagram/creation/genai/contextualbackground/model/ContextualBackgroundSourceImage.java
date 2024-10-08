package com.instagram.creation.genai.contextualbackground.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;

public final class ContextualBackgroundSourceImage extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(39);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ContextualBackgroundSourceImage) {
                ContextualBackgroundSourceImage contextualBackgroundSourceImage = (ContextualBackgroundSourceImage) obj;
                if (!0qQ.A0K(this.A01, contextualBackgroundSourceImage.A01) || !0qQ.A0K(this.A00, contextualBackgroundSourceImage.A00) || !0qQ.A0K(this.A02, contextualBackgroundSourceImage.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public ContextualBackgroundSourceImage(ImageUrl imageUrl, String str, String str2) {
        AnonymousClass7TG.A1U(str, imageUrl, str2);
        this.A01 = str;
        this.A00 = imageUrl;
        this.A02 = str2;
    }
}
