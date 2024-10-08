package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class IGRFSurveyInfoDictImpl extends AnonymousClass0T0 implements Parcelable, IGRFSurveyInfoDict {
    public static final Parcelable.Creator CREATOR = new FK5(31);
    public final IGRFSurveyContextDict A00;

    public final IGRFSurveyInfoDictImpl F51() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IGRFSurveyInfoDictImpl) && 0qQ.A0K(this.A00, ((IGRFSurveyInfoDictImpl) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public final IGRFSurveyContextDict B59() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public IGRFSurveyInfoDictImpl(IGRFSurveyContextDict iGRFSurveyContextDict) {
        this.A00 = iGRFSurveyContextDict;
    }

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
        return C41845B3m.A0T("XDTIGRFSurveyInfoDict", 0Yt.A0B(A0t));
    }
}
