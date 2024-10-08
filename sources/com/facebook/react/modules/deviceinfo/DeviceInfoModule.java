package com.facebook.react.modules.deviceinfo;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C11414SSm;
import X.C13773Tgo;
import X.Pxf;
import X.QZK;
import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "DeviceInfo")
public final class DeviceInfoModule extends NativeDeviceInfoSpec implements C13773Tgo {
    public float fontScale;
    public ReadableMap previousDisplayMetrics;
    public QZK reactApplicationContext;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        C11414SSm.A04(qzk);
        this.fontScale = Pxf.A0G(qzk).fontScale;
        qzk.A09(this);
        this.reactApplicationContext = qzk;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public final void emitUpdateDimensionsEvent() {
        QZK qzk = this.reactApplicationContext;
        if (qzk == null) {
            return;
        }
        if (qzk.A0F()) {
            WritableNativeMap A01 = C11414SSm.A01((double) this.fontScale);
            ReadableMap readableMap = this.previousDisplayMetrics;
            if (readableMap == null) {
                this.previousDisplayMetrics = A01.copy();
            } else if (!0qQ.A0K(A01, readableMap)) {
                this.previousDisplayMetrics = A01.copy();
                qzk.A0E("didUpdateDimensions", A01);
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeDeviceInfoSpec.NAME, new RuntimeException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
        }
    }

    public Map getTypedExportedConstants() {
        WritableNativeMap A01 = C11414SSm.A01((double) this.fontScale);
        this.previousDisplayMetrics = A01.copy();
        return AnonymousClass7TF.A0w("Dimensions", A01.toHashMap());
    }

    public void invalidate() {
        QZK qzk = this.reactApplicationContext;
        if (qzk != null) {
            qzk.A0A(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r2 = r0.fontScale;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onHostResume() {
        /*
            r3 = this;
            X.QZK r0 = r3.reactApplicationContext
            if (r0 == 0) goto L_0x0025
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0025
            android.content.res.Configuration r0 = r0.getConfiguration()
            if (r0 == 0) goto L_0x0025
            float r2 = r0.fontScale
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            if (r1 == 0) goto L_0x0025
            float r0 = r3.fontScale
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 != 0) goto L_0x0025
            r3.fontScale = r2
            r3.emitUpdateDimensionsEvent()
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.deviceinfo.DeviceInfoModule.onHostResume():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceInfoModule(Context context) {
        super((QZK) null);
        0qQ.A0B(context, 1);
        this.reactApplicationContext = null;
        C11414SSm.A04(context);
        this.fontScale = Pxf.A0G(context).fontScale;
    }
}
