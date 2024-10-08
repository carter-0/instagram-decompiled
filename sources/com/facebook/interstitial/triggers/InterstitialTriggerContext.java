package com.facebook.interstitial.triggers;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.DbT;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.HashMap;

public final class InterstitialTriggerContext implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWZ.A01(15);
    public final ImmutableMap A00;
    public final boolean A01;

    public InterstitialTriggerContext(Parcel parcel) {
        HashMap readHashMap = parcel.readHashMap(HashMap.class.getClassLoader());
        0qQ.A0C(readHashMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        this.A00 = ImmutableMap.copyOf(readHashMap);
        this.A01 = parcel.readInt() != 1 ? false : true;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeMap(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        ImmutableMap immutableMap;
        if ((obj instanceof InterstitialTriggerContext) && (immutableMap = this.A00) != null) {
            InterstitialTriggerContext interstitialTriggerContext = (InterstitialTriggerContext) obj;
            if (!immutableMap.equals(interstitialTriggerContext.A00) || this.A01 != interstitialTriggerContext.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ImmutableMap immutableMap = this.A00;
        Boolean valueOf = Boolean.valueOf(this.A01);
        return ((AnonymousClass7TG.A0C(immutableMap) + 31) * 31) + AnonymousClass7TE.A0L(valueOf);
    }

    public final String toString() {
        return DbT.A10(this.A00);
    }

    public InterstitialTriggerContext() {
        this.A00 = RegularImmutableMap.A02;
        this.A01 = false;
    }
}
