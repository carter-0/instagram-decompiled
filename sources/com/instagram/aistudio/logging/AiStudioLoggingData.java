package com.instagram.aistudio.logging;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;

public final class AiStudioLoggingData extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(13);
    public final IGAIAgentType A00;
    public final String A01;

    public AiStudioLoggingData(IGAIAgentType iGAIAgentType, String str) {
        0qQ.A0B(str, 1);
        this.A01 = str;
        this.A00 = iGAIAgentType;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiStudioLoggingData) {
                AiStudioLoggingData aiStudioLoggingData = (AiStudioLoggingData) obj;
                if (!0qQ.A0K(this.A01, aiStudioLoggingData.A01) || this.A00 != aiStudioLoggingData.A00) {
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
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0O(this.A01) + AnonymousClass7TG.A0C(this.A00);
    }
}
