package com.instagram.api.schemas;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.CTB;
import X.CbS;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.ArrayList;
import java.util.List;

public final class ImmutablePandoPhrase extends 17P implements PhraseIntf {
    public static final C3035269k CREATOR = CTB.A00(39);

    public final List CGh() {
        return A08(108130827, ImmutablePandoWordOffset.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPhrase, com.instagram.api.schemas.PhraseIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, CbS.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPhrase] */
    public final Integer B1f() {
        return getOptionalIntValueByHashCode(506856690);
    }

    public final String BcF() {
        return A0i(-988963143);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPhrase] */
    public final Integer Byo() {
        return getOptionalIntValueByHashCode(-673702133);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.api.schemas.ImmutablePandoPhrase] */
    public final Phrase F7V() {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(506856690);
        String A0i = A0i(-988963143);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(-673702133);
        List<WordOffset> CGh = CGh();
        if (CGh != null) {
            arrayList = AnonymousClass7TG.A0r(CGh);
            for (WordOffset FDS : CGh) {
                arrayList.add(FDS.FDS());
            }
        } else {
            arrayList = null;
        }
        return new Phrase(optionalIntValueByHashCode, optionalIntValueByHashCode2, A0i, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoPhrase] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
