package com.instagram.leadgen.core.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C13990Tnq;
import X.JTS;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class LeadGenConditionalAnswerInfo extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(87);
    public final List A00;
    public final Map A01;

    public LeadGenConditionalAnswerInfo(List list, Map map) {
        0qQ.A0B(list, 1);
        this.A00 = list;
        this.A01 = map;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadGenConditionalAnswerInfo) {
                LeadGenConditionalAnswerInfo leadGenConditionalAnswerInfo = (LeadGenConditionalAnswerInfo) obj;
                if (!0qQ.A0K(this.A00, leadGenConditionalAnswerInfo.A00) || !0qQ.A0K(this.A01, leadGenConditionalAnswerInfo.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
        Map map = this.A01;
        C13990Tnq.A0r(parcel, map);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            ((LeadGenConditionalAnswerInfo) JTS.A0f(parcel, A0u)).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }
}
