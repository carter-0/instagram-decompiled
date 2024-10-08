package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo extends 17P implements XDTMetaAIMediaSuggestedPromptInfo {
    public static final C3035269k CREATOR = CTA.A00(21);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final XDTMetaAIMediaSuggestedPromptInfoImpl FDU() {
        return new XDTMetaAIMediaSuggestedPromptInfoImpl(A0i(1634460456));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (A0i(1634460456) != null) {
            A0t.put("prompt_text", A0i(1634460456));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoXDTMetaAIMediaSuggestedPromptInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
