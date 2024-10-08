package com.instagram.creator.agent.suggestedreplies.constants;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C62652KkE;
import X.LVP;
import android.os.Parcel;
import android.os.Parcelable;

public final class SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = LVP.A00(54);
    public final C62652KkE A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) {
                SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext = (SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext) obj;
                if (!0qQ.A0K(this.A03, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A03) || !0qQ.A0K(this.A02, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A02) || !0qQ.A0K(this.A01, suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A01) || this.A00 != suggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext.A00) {
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
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        C62652KkE kkE = this.A00;
        if (kkE == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        AnonymousClass7TE.A1T(parcel, kkE);
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public SuggestedRepliesLoggingConstants$SuggestedRepliesLoggingContext(C62652KkE kkE, String str, String str2, String str3) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = kkE;
    }
}
