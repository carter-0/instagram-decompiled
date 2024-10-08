package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44147CXm;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;

public final class ImmutablePandoFileCandidate extends 17P implements FileCandidate {
    public static final C3035269k CREATOR = CTC.A00(69);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFileCandidate, com.instagram.api.schemas.FileCandidate] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44147CXm.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B41() {
        return A0i(243764420);
    }

    public final String B5e() {
        return A0i(1376149820);
    }

    public final String B5i() {
        return A0i(-1316310812);
    }

    public final String Bd4() {
        return A0i(752641086);
    }

    public final Long Bd5() {
        return A0L(-1618220034);
    }

    public final String Bd6() {
        return A0i(-1755162173);
    }

    public final String C7x() {
        return A0i(-1773366604);
    }

    public final FileCandidateImpl F3C() {
        return new FileCandidateImpl(A0L(-1618220034), A0i(243764420), A0i(1376149820), A0i(-1316310812), A0i(752641086), A0i(-1755162173), A0i(-1773366604));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoFileCandidate] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
