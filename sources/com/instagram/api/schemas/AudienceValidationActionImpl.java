package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class AudienceValidationActionImpl extends AnonymousClass0T0 implements Parcelable, AudienceValidationAction {
    public static final Parcelable.Creator CREATOR = new SWT(47);
    public final AudienceValidationActionType A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudienceValidationActionImpl) {
                AudienceValidationActionImpl audienceValidationActionImpl = (AudienceValidationActionImpl) obj;
                if (this.A00 != audienceValidationActionImpl.A00 || !0qQ.A0K(this.A01, audienceValidationActionImpl.A01) || !0qQ.A0K(this.A02, audienceValidationActionImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public final String getCtaText() {
        return this.A01;
    }

    public final String getUrl() {
        return this.A02;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)) + AnonymousClass7TG.A0E(this.A02);
    }

    public AudienceValidationActionImpl(AudienceValidationActionType audienceValidationActionType, String str, String str2) {
        AnonymousClass7TG.A1O(audienceValidationActionType, str);
        this.A00 = audienceValidationActionType;
        this.A01 = str;
        this.A02 = str2;
    }
}
