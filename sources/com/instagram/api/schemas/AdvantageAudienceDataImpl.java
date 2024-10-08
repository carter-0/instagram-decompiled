package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41847B3o;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class AdvantageAudienceDataImpl extends AnonymousClass0T0 implements AdvantageAudienceData, Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(36);
    public final XFBTargetingAutomationAdvantageAudienceStatus A00;
    public final Integer A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AdvantageAudienceDataImpl) {
                AdvantageAudienceDataImpl advantageAudienceDataImpl = (AdvantageAudienceDataImpl) obj;
                if (this.A00 != advantageAudienceDataImpl.A00 || !0qQ.A0K(this.A01, advantageAudienceDataImpl.A01)) {
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
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
    }

    public final XFBTargetingAutomationAdvantageAudienceStatus Aa9() {
        return this.A00;
    }

    public final Integer BT2() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public AdvantageAudienceDataImpl(XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus, Integer num) {
        this.A00 = xFBTargetingAutomationAdvantageAudienceStatus;
        this.A01 = num;
    }
}
