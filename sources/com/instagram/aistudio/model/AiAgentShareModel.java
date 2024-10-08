package com.instagram.aistudio.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWT;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.api.schemas.IGAIAgentVisibilityStatus;

public final class AiAgentShareModel extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWT(14);
    public final IGAIAgentType A00;
    public final String A01;
    public final IGAIAgentVisibilityStatus A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiAgentShareModel) {
                AiAgentShareModel aiAgentShareModel = (AiAgentShareModel) obj;
                if (!(0qQ.A0K(this.A01, aiAgentShareModel.A01) && this.A00 == aiAgentShareModel.A00 && this.A02 == aiAgentShareModel.A02)) {
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
        parcel.writeParcelable(this.A02, i);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public AiAgentShareModel(IGAIAgentType iGAIAgentType, IGAIAgentVisibilityStatus iGAIAgentVisibilityStatus, String str) {
        AnonymousClass7TG.A1U(str, iGAIAgentType, iGAIAgentVisibilityStatus);
        this.A01 = str;
        this.A00 = iGAIAgentType;
        this.A02 = iGAIAgentVisibilityStatus;
    }
}
