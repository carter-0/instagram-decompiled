package com.instagram.api.schemas;

import X.0Yv;
import X.0qQ;
import X.17P;
import X.1E9;
import X.1aC;
import X.C3035269k;
import X.C44210CZx;
import X.CTB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoLiveNoteResponseInfo extends 17P implements LiveNoteResponseInfoIntf {
    public static final C3035269k CREATOR = new CTB(11);

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoLiveNoteResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final List C2Q() {
        return null;
    }

    public final LiveNoteResponseInfo F5W(1E9 r6) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1946775069, ImmutablePandoUserDict.class);
        if (A08 != null) {
            ArrayList<User> arrayList2 = new ArrayList<>(0Yv.A1E(A08, 10));
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                0qQ.A0A(immutablePandoUserDict);
                arrayList2.add(1aC.A01(r6, immutablePandoUserDict));
            }
            arrayList = new ArrayList(0Yv.A1E(arrayList2, 10));
            for (User A00 : arrayList2) {
                arrayList.add(r6.A00(A00));
            }
        } else {
            arrayList = null;
        }
        return new LiveNoteResponseInfo(arrayList, A03(953406264));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.LiveNoteResponseInfoIntf, com.instagram.api.schemas.ImmutablePandoLiveNoteResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44210CZx.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final long C7V() {
        return A03(953406264);
    }
}
