package com.instagram.user.model;

import X.1E6;
import X.1E9;
import X.D9R;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProductCollectionV2Type;
import com.instagram.model.shopping.businessintegrity.ProductCollectionReviewStatus;
import com.instagram.model.shopping.productcollection.ProductCollectionCover;
import com.instagram.model.shopping.productcollection.ProductCollectionDropsMetadata;
import java.util.List;

public interface ProductCollection extends Parcelable {
    public static final D9R A00 = D9R.A00;

    String Aoi();

    ProductCollectionReviewStatus Aor();

    ProductCollectionV2Type Aou();

    ProductCollectionCover Arp();

    ProductCollectionDropsMetadata AzC();

    String BRr();

    List CD6();

    ProductCollection EAX(1E9 r1);

    ProductCollectionImpl FGo(1E9 r1);

    ProductCollectionImpl FGp(1E6 r1);

    TreeUpdaterJNI FHC();

    String getDescription();

    String getSubtitle();

    String getTitle();
}
