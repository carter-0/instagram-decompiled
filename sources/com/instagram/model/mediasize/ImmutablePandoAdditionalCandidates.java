package com.instagram.model.mediasize;

import X.0qQ;
import X.17P;
import X.AnonymousClass9GA;
import X.B4I;
import X.C3035269k;
import X.C376379Ht;
import android.os.Parcel;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoAdditionalCandidates extends 17P implements AdditionalCandidates {
    public static final C3035269k CREATOR = new C376379Ht(6);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.ImmutablePandoAdditionalCandidates] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final ExtendedImageUrl B63() {
        AnonymousClass9GA r1 = (AnonymousClass9GA) A05(-702473442, AnonymousClass9GA.class);
        if (r1 != null) {
            return new ExtendedImageUrl(r1);
        }
        return null;
    }

    public final ExtendedImageUrl BFm() {
        AnonymousClass9GA r1 = (AnonymousClass9GA) A05(-1509059201, AnonymousClass9GA.class);
        if (r1 != null) {
            return new ExtendedImageUrl(r1);
        }
        return null;
    }

    public final ExtendedImageUrl Bwv() {
        AnonymousClass9GA r1 = (AnonymousClass9GA) A05(-159946889, AnonymousClass9GA.class);
        if (r1 != null) {
            return new ExtendedImageUrl(r1);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.mediasize.AdditionalCandidates, com.instagram.model.mediasize.ImmutablePandoAdditionalCandidates] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(B4I.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final AdditionalCandidatesImpl FEZ() {
        return new AdditionalCandidatesImpl(B63(), BFm(), Bwv());
    }
}
