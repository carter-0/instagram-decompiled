package com.instagram.model.shopping.drops;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41848B3p;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class DropsLaunchAnimation extends AnonymousClass0T0 implements Parcelable, DropsLaunchAnimationIntf {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(96);
    public final Boolean A00;

    public final DropsLaunchAnimation FFR() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof DropsLaunchAnimation) && 0qQ.A0K(this.A00, ((DropsLaunchAnimation) obj).A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(C41848B3p.A1Y(parcel, this.A00) ? 1 : 0);
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public DropsLaunchAnimation(Boolean bool) {
        this.A00 = bool;
    }

    public final TreeUpdaterJNI FHC() {
        LinkedHashMap A0t = C41845B3m.A0t();
        Boolean bool = this.A00;
        if (bool != null) {
            A0t.put("show_animation", bool);
        }
        return C41845B3m.A0T("XDTDropsLaunchAnimation", 0Yt.A0B(A0t));
    }
}
