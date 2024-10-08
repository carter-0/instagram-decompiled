package com.instagram.user.model;

import X.1E9;
import X.D9U;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ScheduledLiveAffiliateInfo;
import com.instagram.api.schemas.ScheduledLiveDiscountInfo;
import java.util.List;

public interface ScheduledLiveProductsMetadataIntf extends Parcelable {
    public static final D9U A00 = D9U.A00;

    ScheduledLiveAffiliateInfo AaE();

    ProductCollection Aoo();

    ScheduledLiveDiscountInfo Axt();

    User BRo();

    List Bga();

    ScheduledLiveProductsMetadataIntf EAb(1E9 r1);

    ScheduledLiveProductsMetadata FGv(1E9 r1);

    TreeUpdaterJNI FHC();
}
