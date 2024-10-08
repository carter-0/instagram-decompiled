package com.facebook.location.signalpackage.parcelable;

import X.AnonymousClass7TF;
import X.C10546Ru0;
import X.PzX;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class ParcelableActivityRecognitionResult extends C10546Ru0 implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(23);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C10546Ru0)) {
            C10546Ru0 ru0 = (C10546Ru0) obj;
            if (this.A01 == ru0.A01 && this.A00 == ru0.A00) {
                List list = this.A02;
                List list2 = ru0.A02;
                if (list != null) {
                    return list.equals(list2);
                }
                return list2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long j = this.A01;
        int A01 = AnonymousClass7TF.A01(this.A00, ((int) (j ^ (j >>> 32))) * 31);
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return A01 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList A01;
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        List list = this.A02;
        if (list == null) {
            A01 = null;
        } else {
            A01 = PzX.A01(PzX.A00(list), 7);
        }
        parcel.writeTypedList(A01);
    }
}
