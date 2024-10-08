package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;

public final class AchievementButtonInfoImpl extends AnonymousClass0T0 implements Parcelable, AchievementButtonInfo {
    public static final Parcelable.Creator CREATOR = new SWT(20);
    public final AchievementButtonAction A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AchievementButtonInfoImpl) {
                AchievementButtonInfoImpl achievementButtonInfoImpl = (AchievementButtonInfoImpl) obj;
                if (this.A00 != achievementButtonInfoImpl.A00 || !0qQ.A0K(this.A01, achievementButtonInfoImpl.A01) || !0qQ.A0K(this.A02, achievementButtonInfoImpl.A02)) {
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

    public final String Air() {
        return this.A01;
    }

    public final String Avk() {
        return this.A02;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0K(this.A00)));
    }

    public AchievementButtonInfoImpl(AchievementButtonAction achievementButtonAction, String str, String str2) {
        AnonymousClass7TG.A1U(achievementButtonAction, str, str2);
        this.A00 = achievementButtonAction;
        this.A01 = str;
        this.A02 = str2;
    }
}
