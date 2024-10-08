package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C63032KqN;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

public final class ImmutablePandoTestimonialDict extends 17P implements TestimonialDict {
    public static final C3035269k CREATOR = CTA.A00(6);
    public User A00;

    public final User Adx() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTestimonialDict, com.instagram.api.schemas.TestimonialDict] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C63032KqN.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final Long AsC() {
        return A0L(1369680106);
    }

    public final String BQH() {
        return A0i(66353792);
    }

    public final TestimonialDict E9M(1E9 r2) {
        this.A00 = C41848B3p.A1B(r2, this, -1406328437);
        return this;
    }

    public final TestimonialDictImpl FCN(1E9 r6) {
        User user;
        User A0b;
        ImmutablePandoUserDict A0Z = C41845B3m.A0Z(this, -1406328437);
        if (A0Z == null || (A0b = C41845B3m.A0b(r6, A0Z)) == null) {
            user = null;
        } else {
            user = C41846B3n.A0b(r6, A0b);
        }
        return new TestimonialDictImpl(user, A0L(1369680106), A0i(66353792), A0X());
    }

    public final TestimonialDictImpl FCO(1E6 r2) {
        return FCN(C41847B3o.A0q(r2));
    }

    public final String getText() {
        return A0X();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoTestimonialDict] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
