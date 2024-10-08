package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C20724Wxx;
import X.C3035269k;
import X.CTC;
import X.V73;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAiAgentMetadataDict extends 17P implements AiAgentMetadataDict {
    public static final C3035269k CREATOR = new CTC(4);

    public final IGAIAgentType AaX() {
        return (IGAIAgentType) A0N(-2115714901, C20724Wxx.A00);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAiAgentMetadataDict, com.instagram.api.schemas.AiAgentMetadataDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(V73.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AaN() {
        return A0j(898037404);
    }

    public final String AaT() {
        return A0j(1862787067);
    }

    public final AiAgentMetadataDictImpl F0Q() {
        return new AiAgentMetadataDictImpl(AaX(), A0j(898037404), A0j(1862787067));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoAiAgentMetadataDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
