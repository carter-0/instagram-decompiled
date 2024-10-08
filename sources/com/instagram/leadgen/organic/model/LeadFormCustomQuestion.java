package com.instagram.leadgen.organic.model;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C16534Uwe;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class LeadFormCustomQuestion extends AnonymousClass0T0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6E(98);
    public final C16534Uwe A00;
    public final String A01;
    public final List A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LeadFormCustomQuestion) {
                LeadFormCustomQuestion leadFormCustomQuestion = (LeadFormCustomQuestion) obj;
                if (!0qQ.A0K(this.A01, leadFormCustomQuestion.A01) || this.A00 != leadFormCustomQuestion.A00 || !0qQ.A0K(this.A02, leadFormCustomQuestion.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        AnonymousClass7TE.A1T(parcel, this.A00);
        parcel.writeStringList(this.A02);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public LeadFormCustomQuestion(C16534Uwe uwe, String str, List list) {
        AnonymousClass7TG.A1U(str, uwe, list);
        this.A01 = str;
        this.A00 = uwe;
        this.A02 = list;
    }
}
