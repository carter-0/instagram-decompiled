package com.instagram.model.upcomingeventsmetadata;

import X.17P;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C3035269k;
import X.C41845B3m;
import X.C41847B3o;
import X.C44951Cnl;
import X.CTA;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.ImmutablePandoVideoVersion;
import com.instagram.model.shopping.productimagecontainer.ImmutablePandoProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoUpcomingEventMedia extends 17P implements UpcomingEventMedia {
    public static final C3035269k CREATOR = CTA.A00(68);

    public final ProductImageContainer BFw() {
        return (ProductImageContainer) A05(100313435, ImmutablePandoProductImageContainer.class);
    }

    public final ImageInfo BGO() {
        return (ImageInfo) A05(-1876344045, ImmutablePandoImageInfo.class);
    }

    public final List CEY() {
        return A08(713258463, ImmutablePandoVideoVersion.class);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.upcomingeventsmetadata.UpcomingEventMedia, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44951Cnl.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    public final String AXm() {
        return A0i(-363605003);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final Boolean B2w() {
        return getOptionalBooleanValueByHashCode(-1305025969);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final Boolean BAZ() {
        return getOptionalBooleanValueByHashCode(53851633);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final Double CDz() {
        return getOptionalDoubleValueByHashCode(706299096);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.facebook.pando.TreeJNI, X.17P, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final UpcomingEventMediaImpl FG4() {
        ProductImageContainerImpl productImageContainerImpl;
        ImageInfoImpl imageInfoImpl;
        String A0i = A0i(-363605003);
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(-1305025969);
        Boolean optionalBooleanValueByHashCode2 = getOptionalBooleanValueByHashCode(53851633);
        String A0e = A0e();
        ProductImageContainer BFw = BFw();
        ArrayList arrayList = null;
        if (BFw != null) {
            productImageContainerImpl = BFw.FFc();
        } else {
            productImageContainerImpl = null;
        }
        ImageInfo BGO = BGO();
        if (BGO != null) {
            imageInfoImpl = BGO.FEa();
        } else {
            imageInfoImpl = null;
        }
        String A0i2 = A0i(1014577290);
        Double optionalDoubleValueByHashCode = getOptionalDoubleValueByHashCode(706299096);
        List CEY = CEY();
        if (CEY != null) {
            arrayList = AnonymousClass7TG.A0r(CEY);
            Iterator it = CEY.iterator();
            while (it.hasNext()) {
                C41847B3o.A1Z(arrayList, it);
            }
        }
        return new UpcomingEventMediaImpl(imageInfoImpl, productImageContainerImpl, optionalBooleanValueByHashCode, optionalBooleanValueByHashCode2, optionalDoubleValueByHashCode, A0i, A0e, A0i2, arrayList);
    }

    public final String getId() {
        return A0e();
    }

    public final String getProductType() {
        return A0i(1014577290);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.model.upcomingeventsmetadata.ImmutablePandoUpcomingEventMedia] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
