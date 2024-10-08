package com.facebook.iabadscontext;

import X.0qQ;
import X.0sn;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Replace with the right context instead. This serve as a placeholder")
public final class IABDummyContext extends AnonymousClass0T0 implements Parcelable, IabOrganicTrait {
    public static final Parcelable.Creator CREATOR = SWZ.A01(1);
    public final List A00;

    public IABDummyContext(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof IABDummyContext) && 0qQ.A0K(this.A00, ((IABDummyContext) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeStringList(this.A00);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABDummyContext(clickIds=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public IABDummyContext() {
        this(0sn.A00);
    }
}
