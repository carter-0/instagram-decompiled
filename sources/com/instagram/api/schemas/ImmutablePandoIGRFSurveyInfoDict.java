package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoIGRFSurveyInfoDict extends 17P implements IGRFSurveyInfoDict {
    public static final C3035269k CREATOR = CTB.A00(3);

    public final IGRFSurveyContextDict B59() {
        return (IGRFSurveyContextDict) A05(-536984562, ImmutablePandoIGRFSurveyContextDict.class);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IGRFSurveyInfoDictImpl F51() {
        IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl;
        IGRFSurveyContextDict B59 = B59();
        if (B59 != null) {
            iGRFSurveyContextDictImpl = B59.F4z();
        } else {
            iGRFSurveyContextDictImpl = null;
        }
        return new IGRFSurveyInfoDictImpl(iGRFSurveyContextDictImpl);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict, com.instagram.api.schemas.IGRFSurveyInfoDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0t = C41845B3m.A0t();
        if (B59() != null) {
            IGRFSurveyContextDict B59 = B59();
            if (B59 != null) {
                treeUpdaterJNI = B59.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A0t.put("feed_context", treeUpdaterJNI);
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGRFSurveyInfoDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
