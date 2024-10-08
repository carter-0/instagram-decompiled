package com.instagram.feed.media;

import X.1E6;
import X.1E9;
import X.C21886Xkx;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.List;

public interface CreativeConfigIntf extends Parcelable {
    public static final C21886Xkx A00 = C21886Xkx.A00;

    AttributionUser AdD();

    List Ajq();

    List AsN();

    String Ayr();

    String Ays();

    List B02();

    EffectPreviewIntf B0A();

    ProductItemWithARIntf B0B();

    String B30();

    String B3W();

    String B7Y();

    List B92();

    String Bbn();

    CreativeConfigIntf E9f(1E9 r1);

    CreativeConfig FDy(1E9 r1);

    CreativeConfig FDz(1E6 r1);

    TreeUpdaterJNI FHC();

    String getCaptureType();

    String getFailureReason();
}
