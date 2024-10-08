package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.CZK;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class IGRFSurveyContextDictImpl extends AnonymousClass0T0 implements Parcelable, IGRFSurveyContextDict {
    public static final Parcelable.Creator CREATOR = new FK5(29);
    public final String A00;
    public final List A01;

    public final IGRFSurveyContextDictImpl F4z() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGRFSurveyContextDictImpl) {
                IGRFSurveyContextDictImpl iGRFSurveyContextDictImpl = (IGRFSurveyContextDictImpl) obj;
                if (!0qQ.A0K(this.A01, iGRFSurveyContextDictImpl.A01) || !0qQ.A0K(this.A00, iGRFSurveyContextDictImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator A1G = C41848B3p.A1G(parcel, list);
            while (A1G.hasNext()) {
                C41847B3o.A1I(parcel, A1G, i);
            }
        }
        parcel.writeString(this.A00);
    }

    public final List Aqx() {
        return this.A01;
    }

    public final String BI8() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGRFSurveyContextDict", CZK.A00(this));
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + C41845B3m.A00(this.A00);
    }

    public IGRFSurveyContextDictImpl(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }
}
