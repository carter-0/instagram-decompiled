package com.instagram.react.views.image;

import X.1NK;
import X.1OO;
import X.C13904TjR;
import X.C64617Lf3;
import X.Pxi;
import X.QZK;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.common.typedurl.SimpleImageUrl;

@ReactModule(name = "ImageLoader")
public class IgReactImageLoaderModule extends NativeImageLoaderAndroidSpec {
    public static final String ERROR_INVALID_URI = "E_INVALID_URI";
    public static final String MODULE_NAME = "ImageLoader";

    public void abortRequest(double d) {
    }

    public String getName() {
        return "ImageLoader";
    }

    public void getSizeWithHeaders(String str, ReadableMap readableMap, C13904TjR tjR) {
    }

    public void prefetchImage(String str, double d, C13904TjR tjR) {
    }

    public void queryCache(ReadableArray readableArray, C13904TjR tjR) {
    }

    public void getSize(String str, C13904TjR tjR) {
        if (TextUtils.isEmpty(str)) {
            Pxi.A1K(ERROR_INVALID_URI, tjR, "Cannot get the size of an image for an empty URI");
            return;
        }
        1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(str), (String) null);
        A0J.A0I = false;
        A0J.A02(new C64617Lf3(6, this, tjR));
        A0J.A00().E5t();
    }

    public IgReactImageLoaderModule(QZK qzk) {
        super(qzk);
    }
}
