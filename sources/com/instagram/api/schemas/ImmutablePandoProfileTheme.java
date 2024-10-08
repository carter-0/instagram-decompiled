package com.instagram.api.schemas;

import X.0qQ;
import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C44281CcP;
import X.C46075DLg;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class ImmutablePandoProfileTheme extends 17P implements ProfileTheme {
    public static final C3035269k CREATOR = CTB.A00(65);

    public final ProfileThemeType C5x() {
        return (ProfileThemeType) A0M(549259248, C46075DLg.A00);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfileTheme, com.instagram.api.schemas.ProfileTheme] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44281CcP.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AbJ() {
        return A0i(-1358800464);
    }

    public final String AbK() {
        return A0i(-65374582);
    }

    public final String Aev() {
        return A0i(1427833566);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfileTheme] */
    public final List B9h() {
        ImmutableList stringListByHashCode = getStringListByHashCode(-1476702881);
        0qQ.A07(stringListByHashCode);
        return stringListByHashCode;
    }

    public final String C5u() {
        return A0h(1108949841);
    }

    public final String C75() {
        return A0i(1825632156);
    }

    public final ProfileThemeImpl F8D() {
        String A0i = A0i(-1358800464);
        String A0i2 = A0i(-65374582);
        String A0i3 = A0i(1427833566);
        List B9h = B9h();
        return new ProfileThemeImpl(C5x(), A0i, A0i2, A0i3, A0h(1108949841), A0i(1825632156), B9h);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoProfileTheme] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
