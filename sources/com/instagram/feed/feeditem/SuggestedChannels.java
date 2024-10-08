package com.instagram.feed.feeditem;

import X.0qQ;
import X.0wb;
import X.1UQ;
import X.AnonymousClass05K;
import X.AnonymousClass3O9;
import X.AnonymousClass7TG;
import X.C67241sS;
import X.N33;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;

public final class SuggestedChannels implements Parcelable, AnonymousClass3O9 {
    public static final Parcelable.Creator CREATOR = new W6E(42);
    public final N33 A00;

    public SuggestedChannels(N33 n33) {
        0qQ.A0B(n33, 1);
        this.A00 = n33;
    }

    public final C67241sS BJP() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeValue(this.A00);
    }

    public final 1UQ B5J() {
        return 1UQ.A0b;
    }

    public final Integer B9V() {
        return this.A00.A00;
    }

    public final /* synthetic */ Integer BVp() {
        return null;
    }

    public final String C9L() {
        return this.A00.A06;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return this.A00.A01;
    }

    public final String getId() {
        String str = this.A00.A02;
        if (str != null) {
            return str;
        }
        0wb.A03("SuggestedChannels", "SuggestedChannels Id is null at time of getId()");
        return AnonymousClass7TG.A0j();
    }
}
