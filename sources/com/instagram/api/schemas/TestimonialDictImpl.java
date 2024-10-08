package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C63032KqN;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

public final class TestimonialDictImpl extends AnonymousClass0T0 implements Parcelable, TestimonialDict {
    public static final Parcelable.Creator CREATOR = new FK6(22);
    public final User A00;
    public final Long A01;
    public final String A02;
    public final String A03;

    public final TestimonialDictImpl FCN(1E9 r1) {
        return this;
    }

    public final TestimonialDictImpl FCO(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TestimonialDictImpl) {
                TestimonialDictImpl testimonialDictImpl = (TestimonialDictImpl) obj;
                if (!0qQ.A0K(this.A00, testimonialDictImpl.A00) || !0qQ.A0K(this.A01, testimonialDictImpl.A01) || !0qQ.A0K(this.A02, testimonialDictImpl.A02) || !0qQ.A0K(this.A03, testimonialDictImpl.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        AnonymousClass7TG.A15(parcel, this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }

    public final User Adx() {
        return this.A00;
    }

    public final Long AsC() {
        return this.A01;
    }

    public final String BQH() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTestimonialDict", C63032KqN.A00(this));
    }

    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + C41845B3m.A00(this.A03);
    }

    public TestimonialDictImpl(User user, Long l, String str, String str2) {
        this.A00 = user;
        this.A01 = l;
        this.A02 = str;
        this.A03 = str2;
    }

    public final TestimonialDict E9M(1E9 r1) {
        return this;
    }
}
