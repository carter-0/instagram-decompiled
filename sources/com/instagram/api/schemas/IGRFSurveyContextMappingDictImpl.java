package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;

public final class IGRFSurveyContextMappingDictImpl extends AnonymousClass0T0 implements Parcelable, IGRFSurveyContextMappingDict {
    public static final Parcelable.Creator CREATOR = new FK5(30);
    public final String A00;
    public final String A01;

    public final IGRFSurveyContextMappingDictImpl F50() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGRFSurveyContextMappingDictImpl) {
                IGRFSurveyContextMappingDictImpl iGRFSurveyContextMappingDictImpl = (IGRFSurveyContextMappingDictImpl) obj;
                if (!0qQ.A0K(this.A00, iGRFSurveyContextMappingDictImpl.A00) || !0qQ.A0K(this.A01, iGRFSurveyContextMappingDictImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getName() != null) {
            C41845B3m.A0z(getName(), A1H);
        }
        if (getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, getValue());
        }
        return C41845B3m.A0T("XDTIGRFSurveyContextMappingDict", 0Yt.A0B(A1H));
    }

    public final String getName() {
        return this.A00;
    }

    public final String getValue() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public IGRFSurveyContextMappingDictImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
