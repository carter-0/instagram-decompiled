package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;

public final class ImmutablePandoIGRFSurveyContextMappingDict extends 17P implements IGRFSurveyContextMappingDict {
    public static final C3035269k CREATOR = CTB.A00(2);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IGRFSurveyContextMappingDict, com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextMappingDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getName() != null) {
            C41845B3m.A0z(getName(), A1H);
        }
        if (getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, getValue());
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final IGRFSurveyContextMappingDictImpl F50() {
        return new IGRFSurveyContextMappingDictImpl(A0W(), A0i(111972721));
    }

    public final String getName() {
        return A0W();
    }

    public final String getValue() {
        return A0i(111972721);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGRFSurveyContextMappingDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
