package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41846B3n;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;

public final class OriginalitySourceMediaInfoImpl extends AnonymousClass0T0 implements Parcelable, OriginalitySourceMediaInfo {
    public static final Parcelable.Creator CREATOR = DE6.A00(3);
    public final User A00;
    public final String A01;

    public final OriginalitySourceMediaInfoImpl F7J(1E9 r1) {
        return this;
    }

    public final OriginalitySourceMediaInfoImpl F7K(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OriginalitySourceMediaInfoImpl) {
                OriginalitySourceMediaInfoImpl originalitySourceMediaInfoImpl = (OriginalitySourceMediaInfoImpl) obj;
                if (!0qQ.A0K(this.A01, originalitySourceMediaInfoImpl.A01) || !0qQ.A0K(this.A00, originalitySourceMediaInfoImpl.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final User CCd() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getPk() != null) {
            A1H.put("pk", getPk());
        }
        C41846B3n.A1J(CCd(), A1H);
        return C41845B3m.A0T("XDTROriginalitySourceMediaInfo", 0Yt.A0B(A1H));
    }

    public final String getPk() {
        return this.A01;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public OriginalitySourceMediaInfoImpl(User user, String str) {
        this.A01 = str;
        this.A00 = user;
    }

    public final OriginalitySourceMediaInfo E7s(1E9 r1) {
        return this;
    }
}
