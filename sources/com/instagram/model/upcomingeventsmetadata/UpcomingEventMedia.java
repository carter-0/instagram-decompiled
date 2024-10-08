package com.instagram.model.upcomingeventsmetadata;

import X.D99;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import java.util.List;

public interface UpcomingEventMedia extends Parcelable {
    public static final D99 A00 = D99.A00;

    String AXm();

    Boolean B2w();

    Boolean BAZ();

    ProductImageContainer BFw();

    ImageInfo BGO();

    Double CDz();

    List CEY();

    UpcomingEventMediaImpl FG4();

    TreeUpdaterJNI FHC();

    String getId();

    String getProductType();
}
