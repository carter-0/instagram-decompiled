package com.facebook.iabadscontext;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41848B3p;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

public final class DisclaimerText extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWS.A00(95);
    public final String A00;
    public final List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisclaimerText) {
                DisclaimerText disclaimerText = (DisclaimerText) obj;
                if (!0qQ.A0K(this.A00, disclaimerText.A00) || !0qQ.A0K(this.A01, disclaimerText.A01)) {
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
        List list = this.A01;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            ((DisclaimerBodyUrlRanges) A1G.next()).writeToParcel(parcel, i);
        }
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TE.A0L(this.A01);
    }

    public DisclaimerText(String str, List list) {
        this.A00 = str;
        this.A01 = list;
    }
}
