package com.instagram.api.schemas;

import X.0Yv;
import X.0qQ;
import X.17P;
import X.1E6;
import X.1E9;
import X.1aC;
import X.C3035269k;
import X.C44235Caw;
import X.CTB;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeParcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoNoteChatResponseInfo extends 17P implements NoteChatResponseInfo {
    public static final C3035269k CREATOR = new CTB(24);

    public final NoteChatResponseInfoImpl F6p(1E6 r4) {
        0qQ.A0B(r4, 0);
        return F6o(new 1E9(r4, 6, false));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        TreeParcelable.A01(parcel, this);
    }

    public final List BxY() {
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'socialContextUsers' field.");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.NoteChatResponseInfo, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44235Caw.A00(this), this);
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String B9v() {
        return A0h(-689546283);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final Integer BLC() {
        return getOptionalIntValueByHashCode(548468023);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final int BWz() {
        return getIntValueByHashCode(-2045299360);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final boolean CXA() {
        return getBooleanValueByHashCode(-613730481);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoNoteChatResponseInfo] */
    public final NoteChatResponseInfoImpl F6o(1E9 r11) {
        String A0h = A0h(-689546283);
        boolean booleanValueByHashCode = getBooleanValueByHashCode(-613730481);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(548468023);
        int intValueByHashCode = getIntValueByHashCode(-2045299360);
        List<ImmutablePandoUserDict> A0o = A0o(-1766928858, ImmutablePandoUserDict.class);
        ArrayList<User> arrayList = new ArrayList<>(0Yv.A1E(A0o, 10));
        for (ImmutablePandoUserDict A01 : A0o) {
            Parcelable.Creator creator = User.CREATOR;
            arrayList.add(1aC.A01(r11, A01));
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (User A00 : arrayList) {
            arrayList2.add(r11.A00(A00));
        }
        return new NoteChatResponseInfoImpl(optionalIntValueByHashCode, A0h, arrayList2, intValueByHashCode, booleanValueByHashCode);
    }
}
