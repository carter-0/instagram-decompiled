package com.instagram.model.shopping.incentives.igfunded;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;

public final class IgFundedIncentiveDetailImpl extends AnonymousClass0T0 implements Parcelable, IgFundedIncentiveDetail {
    public static final Parcelable.Creator CREATOR = new LVO(3);
    public final String A00;
    public final String A01;

    public final IgFundedIncentiveDetailImpl FFX() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IgFundedIncentiveDetailImpl) {
                IgFundedIncentiveDetailImpl igFundedIncentiveDetailImpl = (IgFundedIncentiveDetailImpl) obj;
                if (!0qQ.A0K(this.A00, igFundedIncentiveDetailImpl.A00) || !0qQ.A0K(this.A01, igFundedIncentiveDetailImpl.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, getDescription());
        }
        if (getName() != null) {
            C41845B3m.A0z(getName(), A1H);
        }
        return C41845B3m.A0T("XDTShoppingIGFundedIncentiveBannerBottomsheetContent", 0Yt.A0B(A1H));
    }

    public final String getDescription() {
        return this.A00;
    }

    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public IgFundedIncentiveDetailImpl(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
