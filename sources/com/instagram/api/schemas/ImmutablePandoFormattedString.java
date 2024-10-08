package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoFormattedString extends 17P implements FormattedString {
    public static final C3035269k CREATOR = CTC.A00(70);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final FormattedStringImpl F3F() {
        return new FormattedStringImpl(A0P());
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFormattedString, X.17P] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (A0P() != null) {
            C41845B3m.A10(A0P(), A0t);
        }
        return C41846B3n.A0P(this, A0t);
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFormattedString] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
