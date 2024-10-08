package com.instagram.model.upcomingeventsmetadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44951Cnl;
import X.LVO;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.Iterator;
import java.util.List;

public final class UpcomingEventMediaImpl extends AnonymousClass0T0 implements UpcomingEventMedia, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(41);
    public final ImageInfo A00;
    public final ProductImageContainer A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Double A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final UpcomingEventMediaImpl FG4() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UpcomingEventMediaImpl) {
                UpcomingEventMediaImpl upcomingEventMediaImpl = (UpcomingEventMediaImpl) obj;
                if (!0qQ.A0K(this.A05, upcomingEventMediaImpl.A05) || !0qQ.A0K(this.A02, upcomingEventMediaImpl.A02) || !0qQ.A0K(this.A03, upcomingEventMediaImpl.A03) || !0qQ.A0K(this.A06, upcomingEventMediaImpl.A06) || !0qQ.A0K(this.A01, upcomingEventMediaImpl.A01) || !0qQ.A0K(this.A00, upcomingEventMediaImpl.A00) || !0qQ.A0K(this.A07, upcomingEventMediaImpl.A07) || !0qQ.A0K(this.A04, upcomingEventMediaImpl.A04) || !0qQ.A0K(this.A08, upcomingEventMediaImpl.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A05);
        C41848B3p.A1I(parcel, this.A02);
        C41848B3p.A1I(parcel, this.A03);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        Double d = this.A04;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        List list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator A1G = C41848B3p.A1G(parcel, list);
        while (A1G.hasNext()) {
            C41847B3o.A1I(parcel, A1G, i);
        }
    }

    public final String AXm() {
        return this.A05;
    }

    public final Boolean B2w() {
        return this.A02;
    }

    public final Boolean BAZ() {
        return this.A03;
    }

    public final ProductImageContainer BFw() {
        return this.A01;
    }

    public final ImageInfo BGO() {
        return this.A00;
    }

    public final Double CDz() {
        return this.A04;
    }

    public final List CEY() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTUpcomingEventMedia", C44951Cnl.A00(this));
    }

    public final String getId() {
        return this.A06;
    }

    public final String getProductType() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((((AnonymousClass7TG.A0E(this.A05) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public UpcomingEventMediaImpl(ImageInfo imageInfo, ProductImageContainer productImageContainer, Boolean bool, Boolean bool2, Double d, String str, String str2, String str3, List list) {
        this.A05 = str;
        this.A02 = bool;
        this.A03 = bool2;
        this.A06 = str2;
        this.A01 = productImageContainer;
        this.A00 = imageInfo;
        this.A07 = str3;
        this.A04 = d;
        this.A08 = list;
    }
}
