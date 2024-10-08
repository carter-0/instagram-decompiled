package com.instagram.api.schemas;

import X.0Yt;
import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.CTB;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

public final class ImmutablePandoOriginalitySourceMediaInfo extends 17P implements OriginalitySourceMediaInfo {
    public static final C3035269k CREATOR = CTB.A00(36);
    public User A00;

    public final User CCd() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.OriginalitySourceMediaInfo, com.instagram.api.schemas.ImmutablePandoOriginalitySourceMediaInfo] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getPk() != null) {
            A1H.put("pk", getPk());
        }
        C41846B3n.A1J(CCd(), A1H);
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final OriginalitySourceMediaInfo E7s(1E9 r2) {
        this.A00 = C41847B3o.A0y(r2, this);
        return this;
    }

    public final OriginalitySourceMediaInfoImpl F7J(1E9 r4) {
        User user;
        User A0b;
        String A0o = C41845B3m.A0o(this);
        ImmutablePandoUserDict A0Z = C41846B3n.A0Z(this);
        if (A0Z == null || (A0b = C41845B3m.A0b(r4, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r4, A0b);
        }
        return new OriginalitySourceMediaInfoImpl(user, A0o);
    }

    public final OriginalitySourceMediaInfoImpl F7K(1E6 r2) {
        return F7J(C41847B3o.A0q(r2));
    }

    public final String getPk() {
        return C41845B3m.A0o(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoOriginalitySourceMediaInfo] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
