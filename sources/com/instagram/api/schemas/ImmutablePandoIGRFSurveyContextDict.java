package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import X.CZK;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoIGRFSurveyContextDict extends 17P implements IGRFSurveyContextDict {
    public static final C3035269k CREATOR = CTB.A00(1);

    public final List Aqx() {
        return A08(1116448826, ImmutablePandoIGRFSurveyContextMappingDict.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextDict, com.instagram.api.schemas.IGRFSurveyContextDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CZK.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String BI8() {
        return A0j(-2092532683);
    }

    public final IGRFSurveyContextDictImpl F4z() {
        ArrayList arrayList;
        List<IGRFSurveyContextMappingDict> Aqx = Aqx();
        if (Aqx != null) {
            arrayList = AnonymousClass7TG.A0r(Aqx);
            for (IGRFSurveyContextMappingDict F50 : Aqx) {
                arrayList.add(F50.F50());
            }
        } else {
            arrayList = null;
        }
        return new IGRFSurveyContextDictImpl(arrayList, A0j(-2092532683));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
