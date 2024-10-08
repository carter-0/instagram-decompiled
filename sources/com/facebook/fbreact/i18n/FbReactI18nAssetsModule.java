package com.facebook.fbreact.i18n;

import X.0dV;
import android.content.Context;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.instagram.android.R;

@ReactModule(canOverrideExistingModule = true, isCxxModule = true, name = "I18nAssets")
public class FbReactI18nAssetsModule extends CxxModuleWrapper implements TurboModule {
    public static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "I18nAssets";

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC, Splitter:B:25:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004d A[SYNTHETIC, Splitter:B:32:0x004d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer getAsset(android.content.Context r6, int r7) {
        /*
            r5 = 0
            if (r7 != 0) goto L_0x0004
            return r5
        L_0x0004:
            android.content.res.Resources r0 = r6.getResources()     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            java.io.InputStream r4 = r0.openRawResource(r7)     // Catch:{ IOException -> 0x003a, all -> 0x0038 }
            int r0 = r4.available()     // Catch:{ IOException -> 0x0036 }
            int r3 = r0 + 1
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ IOException -> 0x0036 }
            byte[] r1 = r2.array()     // Catch:{ IOException -> 0x0036 }
            int r0 = r2.arrayOffset()     // Catch:{ IOException -> 0x0036 }
            int r0 = r4.read(r1, r0, r3)     // Catch:{ IOException -> 0x0036 }
            int r1 = r3 + -1
            if (r0 != r1) goto L_0x002e
            r0 = 0
            r2.put(r1, r0)     // Catch:{ IOException -> 0x0036 }
            r4.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r2
        L_0x002e:
            java.lang.String r0 = "stream.available is incorrect and so are your assumptions"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ IOException -> 0x0036 }
            throw r0     // Catch:{ IOException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            goto L_0x003c
        L_0x0038:
            r0 = move-exception
            goto L_0x004b
        L_0x003a:
            r2 = move-exception
            r4 = r5
        L_0x003c:
            java.lang.String r1 = "ReactNative"
            java.lang.String r0 = "Unable to process I18n asset"
            X.0I1.A06(r1, r0, r2)     // Catch:{ all -> 0x0049 }
            if (r4 == 0) goto L_0x0048
            r4.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            return r5
        L_0x0049:
            r0 = move-exception
            r5 = r4
        L_0x004b:
            if (r5 == 0) goto L_0x0050
            r5.close()     // Catch:{ IOException -> 0x0050 }
        L_0x0050:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fbreact.i18n.FbReactI18nAssetsModule.getAsset(android.content.Context, int):java.nio.ByteBuffer");
    }

    public static native HybridData initHybrid(Context context, int i, int i2, int i3, int i4, int i5, String str);

    public boolean canOverrideExistingModule() {
        return true;
    }

    static {
        0dV.A0C("fbreact-i18nassetsmodule");
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2) {
        this(context, i, i2, "");
    }

    public FbReactI18nAssetsModule(Context context, int i) {
        this(context, 0, i, "");
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2, String str) {
        super(initHybrid(context, i, R.raw.currency_format_config, R.raw.date_format_config, R.raw.number_format_config, i2, str));
    }
}
