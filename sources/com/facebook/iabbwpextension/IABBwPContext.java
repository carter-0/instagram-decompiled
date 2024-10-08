package com.facebook.iabbwpextension;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.SWZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class IABBwPContext extends AnonymousClass0T0 implements Parcelable, IabCommonTrait {
    public static final Parcelable.Creator CREATOR = SWZ.A01(11);
    public final IABBwPExtension A00;
    public final ImmutableList A01;
    public final List A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IABBwPContext) {
                IABBwPContext iABBwPContext = (IABBwPContext) obj;
                if (!0qQ.A0K(this.A01, iABBwPContext.A01) || !0qQ.A0K(this.A02, iABBwPContext.A02) || !0qQ.A0K(this.A00, iABBwPContext.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeSerializable(this.A01);
        parcel.writeStringList(this.A02);
        IABBwPExtension iABBwPExtension = this.A00;
        if (iABBwPExtension == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        iABBwPExtension.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TE.A0K(this.A01)) + AnonymousClass7TG.A0C(this.A00);
    }

    public IABBwPContext(IABBwPExtension iABBwPExtension, ImmutableList immutableList, List list) {
        AnonymousClass7TG.A1O(immutableList, list);
        this.A01 = immutableList;
        this.A02 = list;
        this.A00 = iABBwPExtension;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("IABBwPContext(eligibleExperienceType=");
        A1A.append(this.A01);
        A1A.append(", clickIds=");
        A1A.append(this.A02);
        A1A.append(", buyWithPrimeExtension=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
