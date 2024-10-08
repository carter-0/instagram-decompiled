package com.facebook.react.modules.camera;

import X.0qQ;
import X.AnonymousClass7TG;
import X.C13049TJf;
import X.C9537Rca;
import X.QZK;
import com.facebook.fbreact.specs.NativeImageStoreAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.concurrent.Executors;

@ReactModule(name = "ImageStoreManager")
public final class ImageStoreManager extends NativeImageStoreAndroidSpec {
    public static final int BUFFER_SIZE = 8192;
    public static final C9537Rca Companion = new Object();
    public static final String NAME = "ImageStoreManager";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageStoreManager(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
    }

    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        AnonymousClass7TG.A1T(str, callback, callback2);
        Executors.newSingleThreadExecutor().execute(new C13049TJf(callback, callback2, this, str));
    }
}
