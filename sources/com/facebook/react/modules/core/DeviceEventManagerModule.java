package com.facebook.react.modules.core;

import X.0Sd;
import X.0qQ;
import X.C13571Tcr;
import X.C9539Rcc;
import X.Pxe;
import X.QZK;
import X.TCM;
import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "DeviceEventManager")
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final C9539Rcc Companion = new Object();
    public static final String NAME = "DeviceEventManager";
    public final Runnable invokeDefaultBackPressRunnable;

    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public void emitNewIntentReceived(Uri uri) {
        0qQ.A0B(uri, 0);
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("url", uri.toString());
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("url", A0U);
        }
    }

    public DeviceEventManagerModule(QZK qzk, C13571Tcr tcr) {
        super(qzk);
        this.invokeDefaultBackPressRunnable = new TCM(tcr);
    }

    public void emitHardwareBackPressed() {
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("hardwareBackPress", (Object) null);
        }
    }

    public void invokeDefaultBackPressHandler() {
        QZK A0T = Pxe.A0T(this);
        Runnable runnable = this.invokeDefaultBackPressRunnable;
        MessageQueueThread messageQueueThread = A0T.A05;
        0Sd.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }
}
