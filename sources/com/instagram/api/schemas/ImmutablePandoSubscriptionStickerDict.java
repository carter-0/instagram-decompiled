package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41848B3p;
import X.C44478Cfa;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class ImmutablePandoSubscriptionStickerDict extends 17P implements SubscriptionStickerDictIntf {
    public static final C3035269k CREATOR = CTA.A00(5);
    public User A00;

    public final User AsS() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.SubscriptionStickerDictIntf, com.instagram.api.schemas.ImmutablePandoSubscriptionStickerDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44478Cfa.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AsX() {
        return A0j(1379332622);
    }

    public final String Asb() {
        return A0i(-858044783);
    }

    public final String Asi() {
        return A0i(-2060473463);
    }

    public final SubscriptionStickerDictIntf E9E(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, 1028554796);
        return this;
    }

    public final SubscriptionStickerDict FC2(1E9 r6) {
        User user;
        User A0b;
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, 1028554796);
        if (A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new SubscriptionStickerDict(user, A0j(1379332622), A0i(-858044783), A0i(-2060473463));
    }

    public final SubscriptionStickerDict FC3(1E6 r2) {
        return FC2(C41846B3n.A0S(r2));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoSubscriptionStickerDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
