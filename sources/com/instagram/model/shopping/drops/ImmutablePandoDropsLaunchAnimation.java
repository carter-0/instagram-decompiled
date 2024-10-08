package com.instagram.model.shopping.drops;

import X.17P;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class ImmutablePandoDropsLaunchAnimation extends 17P implements DropsLaunchAnimationIntf {
    public static final C3035269k CREATOR = CTA.A00(45);

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation] */
    public final DropsLaunchAnimation FFR() {
        return new DropsLaunchAnimation(getOptionalBooleanValueByHashCode(-769779518));
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation] */
    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        if (getOptionalBooleanValueByHashCode(-769779518) != null) {
            A0t.put("show_animation", getOptionalBooleanValueByHashCode(-769779518));
        }
        return C41846B3n.A0P(this, A0t);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.shopping.drops.ImmutablePandoDropsLaunchAnimation] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
