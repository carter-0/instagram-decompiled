package com.google.android.gms.location;

import X.AnonymousClass3Qk;
import X.C301145yd;
import X.Pxf;
import X.SWR;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(62);
    public Bundle A00 = null;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((ActivityTransitionResult) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public ActivityTransitionResult(List list, Bundle bundle) {
        AnonymousClass3Qk.A03(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                AnonymousClass3Qk.A07(Pxf.A1R((((ActivityTransitionEvent) list.get(i)).A02 > ((ActivityTransitionEvent) list.get(i - 1)).A02 ? 1 : (((ActivityTransitionEvent) list.get(i)).A02 == ((ActivityTransitionEvent) list.get(i - 1)).A02 ? 0 : -1))));
            }
        }
        this.A01 = Collections.unmodifiableList(list);
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0E(parcel, this.A01, 1, false);
        C301145yd.A02(this.A00, parcel, 2);
        C301145yd.A06(parcel, A03);
    }
}
