package com.facebook.imagepipeline.platform;

import X.C18723Vyx;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;

public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public final WebpBitmapFactoryImpl A00;

    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!C18723Vyx.A00) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            C18723Vyx.A00 = true;
        }
        this.A00 = webpBitmapFactoryImpl;
    }
}
