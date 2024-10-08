package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTC;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoIGCommentSheetMoreInfo extends 17P implements IGCommentSheetMoreInfo {
    public static final C3035269k CREATOR = CTC.A00(97);

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.IGCommentSheetMoreInfo, com.instagram.api.schemas.ImmutablePandoIGCommentSheetMoreInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        if (C5e() != null) {
            A1H.put("text_source", C5e());
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String C5e() {
        return A0i(-692624531);
    }

    public final IGCommentSheetMoreInfoImpl F4A() {
        return new IGCommentSheetMoreInfoImpl(A0X(), A0i(-692624531));
    }

    public final String getText() {
        return A0X();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoIGCommentSheetMoreInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
