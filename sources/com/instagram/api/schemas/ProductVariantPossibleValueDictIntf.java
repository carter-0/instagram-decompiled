package com.instagram.api.schemas;

import X.D6R;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;

public interface ProductVariantPossibleValueDictIntf extends Parcelable {
    public static final D6R A00 = D6R.A00;

    ProductVariantVisualStyle CFr();

    ProductVariantPossibleValueDict F86();

    TreeUpdaterJNI FHC();

    String getId();

    String getName();

    String getNormalizedValue();

    String getValue();

    boolean isPreselected();
}
