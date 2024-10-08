package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext$RCTDeviceEventEmitter;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class Q6H extends ContextWrapper {
    public C13567Tcn A00;
    public C13567Tcn A01;
    public C10224Roi A02;
    public MessageQueueThread A03;
    public MessageQueueThread A04;
    public MessageQueueThread A05;
    public C10554Ru8 A06;
    public Integer A07 = AnonymousClass05K.A00;
    public WeakReference A08;
    public boolean A09 = false;
    public LayoutInflater A0A;
    public final CopyOnWriteArraySet A0B = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0C = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A0D = new CopyOnWriteArraySet();

    public final synchronized void A0B(C10554Ru8 ru8) {
        if (this.A05 == null && this.A04 == null && this.A03 == null) {
            this.A06 = ru8;
            this.A05 = ru8.A02;
            this.A04 = ru8.A01;
            this.A03 = ru8.A00;
            this.A09 = true;
        } else {
            throw AnonymousClass7TE.A0z("Message queue threads already initialized");
        }
    }

    public final Activity A00() {
        if (this instanceof QZL) {
            return ((QZL) this).A01.A00();
        }
        WeakReference weakReference = this.A08;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final CatalystInstance A01() {
        if (!(this instanceof QZJ)) {
            return ((QZL) this).A01.A01();
        }
        CatalystInstance catalystInstance = ((QZJ) this).A00;
        0Sd.A00(catalystInstance);
        return catalystInstance;
    }

    public final JavaScriptModule A02(Class cls) {
        if (!(this instanceof QZJ)) {
            return ((QZL) this).A01.A02(cls);
        }
        QZJ qzj = (QZJ) this;
        if (qzj.A00 != null) {
            C10224Roi roi = qzj.A02;
            if (roi != null) {
                C22263XyL xyL = C18401Vr3.A00;
                if (xyL.enableFabricRenderer() && xyL.useFabricInterop() && roi.A00.containsKey(cls)) {
                    C10224Roi roi2 = qzj.A02;
                    if (!xyL.enableFabricRenderer() || !xyL.useFabricInterop()) {
                        return null;
                    }
                    return (JavaScriptModule) roi2.A00.get(cls);
                }
            }
            return qzj.A00.getJSModule(cls);
        } else if (qzj.A01) {
            throw AnonymousClass7TE.A0z("Tried to access a JS module after the React instance was destroyed.");
        } else {
            throw AnonymousClass7TE.A0z("Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.");
        }
    }

    public final NativeModule A03(Class cls) {
        String str;
        if (!(this instanceof QZJ)) {
            return ((QZL) this).A01.A03(cls);
        }
        QZJ qzj = (QZJ) this;
        CatalystInstance catalystInstance = qzj.A00;
        if (catalystInstance != null) {
            return catalystInstance.getNativeModule(cls);
        }
        if (qzj.A01) {
            str = "Trying to call native module after CatalystInstance has been destroyed!";
        } else {
            str = "Trying to call native module before CatalystInstance has been set!";
        }
        throw AnonymousClass7TE.A0z(str);
    }

    public final X9N A04() {
        if (this instanceof QZL) {
            return ((QZL) this).A01.A04();
        }
        return null;
    }

    public final void A05() {
        if (this instanceof QZL) {
            ((QZL) this).A01.A05();
            return;
        }
        QZJ qzj = (QZJ) this;
        qzj.A01 = true;
        CatalystInstance catalystInstance = qzj.A00;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public final void A06() {
        if (this.A09) {
            MessageQueueThread messageQueueThread = this.A04;
            0Sd.A00(messageQueueThread);
            messageQueueThread.assertIsOnThread();
            return;
        }
        throw AnonymousClass7TE.A0z("Tried to call assertOnNativeModulesQueueThread() on an uninitialized ReactContext");
    }

    public final void A07() {
        this.A07 = AnonymousClass05K.A01;
        ReactMarker.logMarker(RH1.A1D);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            try {
                ((C13773Tgo) it.next()).onHostPause();
            } catch (RuntimeException e) {
                A0C(e);
            }
        }
        ReactMarker.logMarker(RH1.A1C);
    }

    public final void A08(Activity activity) {
        this.A07 = AnonymousClass05K.A0C;
        this.A08 = C51965G9l.A0v(activity);
        ReactMarker.logMarker(RH1.A1F);
        Iterator it = this.A0C.iterator();
        while (it.hasNext()) {
            try {
                ((C13773Tgo) it.next()).onHostResume();
            } catch (RuntimeException e) {
                A0C(e);
            }
        }
        ReactMarker.logMarker(RH1.A1E);
    }

    public final void A09(C13773Tgo tgo) {
        int intValue;
        if (this instanceof QZL) {
            ((QZL) this).A01.A09(tgo);
            return;
        }
        this.A0C.add(tgo);
        if ((A0F() || A0I()) && (intValue = this.A07.intValue()) != 0 && intValue != 1) {
            if (intValue == 2) {
                TG5 tg5 = new TG5(tgo, this);
                MessageQueueThread messageQueueThread = this.A05;
                0Sd.A00(messageQueueThread);
                messageQueueThread.runOnQueue(tg5);
                return;
            }
            throw AnonymousClass7TE.A0z("Unhandled lifecycle state.");
        }
    }

    public final void A0A(C13773Tgo tgo) {
        if (this instanceof QZL) {
            ((QZL) this).A01.A0A(tgo);
        } else {
            this.A0C.remove(tgo);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (((com.facebook.react.bridge.CatalystInstanceImpl) r0).mDestroyed != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.Exception r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.QZL
            if (r0 == 0) goto L_0x000d
            r0 = r5
            X.QZL r0 = (X.QZL) r0
            X.QZK r0 = r0.A01
            r0.A0C(r6)
            return
        L_0x000d:
            r1 = r5
            X.QZJ r1 = (X.QZJ) r1
            com.facebook.react.bridge.CatalystInstance r0 = r1.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001e
            r3 = 1
            com.facebook.react.bridge.CatalystInstanceImpl r0 = (com.facebook.react.bridge.CatalystInstanceImpl) r0
            boolean r0 = r0.mDestroyed
            r2 = 1
            if (r0 == 0) goto L_0x001f
        L_0x001e:
            r2 = 0
        L_0x001f:
            X.Tcn r0 = r1.A01
            if (r0 != 0) goto L_0x0024
            r4 = 0
        L_0x0024:
            if (r2 == 0) goto L_0x002c
            if (r4 == 0) goto L_0x002c
            r0.handleException(r6)
            return
        L_0x002c:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unable to handle Exception - catalystInstanceVariableExists: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " - isCatalystInstanceAlive: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " - hasExceptionHandler: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ReactNative"
            X.0I1.A05(r0, r1, r6)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q6H.A0C(java.lang.Exception):void");
    }

    public final void A0D(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.A04;
        0Sd.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public final void A0E(String str, Object obj) {
        ReactContext$RCTDeviceEventEmitter reactContext$RCTDeviceEventEmitter = (ReactContext$RCTDeviceEventEmitter) A02(ReactContext$RCTDeviceEventEmitter.class);
        if (reactContext$RCTDeviceEventEmitter != null) {
            reactContext$RCTDeviceEventEmitter.emit(str, obj);
        }
    }

    public final boolean A0F() {
        if (!(this instanceof QZJ)) {
            return ((QZL) this).A01.A0F();
        }
        CatalystInstance catalystInstance = ((QZJ) this).A00;
        if (catalystInstance == null || ((CatalystInstanceImpl) catalystInstance).mDestroyed) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final boolean A0G() {
        if (this instanceof QZJ) {
            return AnonymousClass7TF.A1V(((QZJ) this).A00);
        }
        return ((QZL) this).A01.A0G();
    }

    public final boolean A0H() {
        if (this instanceof QZL) {
            return ((QZL) this).A01.A0H();
        }
        return AnonymousClass7TF.A1V(((QZJ) this).A00);
    }

    @Deprecated
    public final boolean A0I() {
        if (this instanceof QZJ) {
            return false;
        }
        return ((QZL) this).A01.A0I();
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.A0A;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.A0A = cloneInContext;
        return cloneInContext;
    }

    public Q6H(Context context) {
        super(context);
    }
}
