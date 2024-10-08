package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWT;
import X.V73;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class AiAgentMetadataDictImpl extends AnonymousClass0T0 implements Parcelable, AiAgentMetadataDict {
    public static final Parcelable.Creator CREATOR = new SWT(38);
    public final IGAIAgentType A00;
    public final String A01;
    public final String A02;

    public final AiAgentMetadataDictImpl F0Q() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AiAgentMetadataDictImpl) {
                AiAgentMetadataDictImpl aiAgentMetadataDictImpl = (AiAgentMetadataDictImpl) obj;
                if (!0qQ.A0K(this.A01, aiAgentMetadataDictImpl.A01) || !0qQ.A0K(this.A02, aiAgentMetadataDictImpl.A02) || this.A00 != aiAgentMetadataDictImpl.A00) {
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
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }

    public final String AaN() {
        return this.A01;
    }

    public final String AaT() {
        return this.A02;
    }

    public final IGAIAgentType AaX() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAiAgentMetadataDict", V73.A00(this));
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public AiAgentMetadataDictImpl(IGAIAgentType iGAIAgentType, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = iGAIAgentType;
    }
}
