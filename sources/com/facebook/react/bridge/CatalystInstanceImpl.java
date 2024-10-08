package com.facebook.react.bridge;

import X.002;
import X.0I1;
import X.0Sd;
import X.0ez;
import X.0fc;
import X.AnonymousClass00P;
import X.AnonymousClass0f6;
import X.AnonymousClass0f8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10222Rod;
import X.C10223Rof;
import X.C10409Rrl;
import X.C10411Rrn;
import X.C10554Ru8;
import X.C10876Rzc;
import X.C12291Sqp;
import X.C13431TaJ;
import X.C13567Tcn;
import X.C18401Vr3;
import X.C51965G9l;
import X.C9012RLj;
import X.Pxe;
import X.RH1;
import X.SBO;
import X.SEQ;
import X.TC8;
import X.TCA;
import X.TCE;
import X.TCF;
import X.TLO;
import android.content.res.AssetManager;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.NativeMethodCallInvokerHolderImpl;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.systrace.Systrace;
import java.lang.ref.WeakReference;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class CatalystInstanceImpl implements CatalystInstance {
    public static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    public volatile boolean mAcceptCalls = false;
    public final CopyOnWriteArrayList mBridgeIdleListeners;
    public volatile boolean mDestroyed = false;
    public final HybridData mHybridData;
    public boolean mInitialized = false;
    public ReactInstanceManagerInspectorTarget mInspectorTarget;
    public boolean mJSBundleHasLoaded;
    public final C10876Rzc mJSBundleLoader;
    public final ArrayList mJSCallsPendingInit = AnonymousClass7TE.A1C();
    public final Object mJSCallsPendingInitLock = Pxe.A0p();
    public final C13567Tcn mJSExceptionHandler;
    public final C10223Rof mJSModuleRegistry;
    public C9012RLj mJavaScriptContextHolder;
    public final String mJsPendingCallsTitleForTrace = 002.A0O("pending_js_calls_instance", sNextInstanceIdForTrace.getAndIncrement());
    public final C10409Rrl mNativeModuleRegistry;
    public final MessageQueueThread mNativeModulesQueueThread;
    public final AtomicInteger mPendingJSCalls = new AtomicInteger(0);
    public final C10554Ru8 mReactQueueConfiguration;
    public String mSourceURL;
    public final AnonymousClass0f6 mTraceListener;

    public class InstanceCallback {
        public final WeakReference mOuter;

        public static /* synthetic */ void lambda$onBatchComplete$0(CatalystInstanceImpl catalystInstanceImpl) {
            boolean A1V;
            AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
            ModuleHolder moduleHolder = (ModuleHolder) catalystInstanceImpl.mNativeModuleRegistry.A01.get(UIManagerModule.NAME);
            if (moduleHolder != null) {
                synchronized (moduleHolder) {
                    A1V = AnonymousClass7TF.A1V(moduleHolder.mModule);
                }
                if (A1V) {
                    ((UIManagerModule) moduleHolder.getModule()).onBatchComplete();
                }
            }
        }

        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                int decrementAndGet = catalystInstanceImpl.mPendingJSCalls.decrementAndGet();
                boolean A1Q = AnonymousClass7TF.A1Q(decrementAndGet);
                Systrace.A08(8192, catalystInstanceImpl.mJsPendingCallsTitleForTrace, decrementAndGet);
                if (A1Q && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                    catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new TCA(catalystInstanceImpl));
                }
            }
        }

        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                int andIncrement = catalystInstanceImpl.mPendingJSCalls.getAndIncrement();
                boolean A1Q = AnonymousClass7TF.A1Q(andIncrement);
                Systrace.A08(8192, catalystInstanceImpl.mJsPendingCallsTitleForTrace, andIncrement + 1);
                if (A1Q && !catalystInstanceImpl.mBridgeIdleListeners.isEmpty()) {
                    catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new TCE(catalystInstanceImpl));
                }
            }
        }

        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                AtomicInteger atomicInteger = CatalystInstanceImpl.sNextInstanceIdForTrace;
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new TCF(catalystInstanceImpl));
            }
        }

        public InstanceCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = C51965G9l.A0v(catalystInstanceImpl);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.RLj, java.lang.Object] */
    public CatalystInstanceImpl(C10411Rrn rrn, JavaScriptExecutor javaScriptExecutor, C10409Rrl rrl, C10876Rzc rzc, C13567Tcn tcn, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget) {
        0fc.A01(8192, "createCatalystInstanceImpl", -1708221279);
        this.mHybridData = initHybrid();
        C10222Rod rod = new C10222Rod(this);
        C10554Ru8 ru8 = new C10554Ru8(MessageQueueThreadImpl.A00(rod, SEQ.A02), MessageQueueThreadImpl.A00(rod, rrn.A01), MessageQueueThreadImpl.A00(rod, rrn.A00));
        this.mReactQueueConfiguration = ru8;
        this.mBridgeIdleListeners = new CopyOnWriteArrayList();
        C10409Rrl rrl2 = rrl;
        this.mNativeModuleRegistry = rrl2;
        this.mJSModuleRegistry = new C10223Rof();
        this.mJSBundleLoader = rzc;
        this.mJSExceptionHandler = tcn;
        MessageQueueThreadImpl messageQueueThreadImpl = ru8.A01;
        this.mNativeModulesQueueThread = messageQueueThreadImpl;
        this.mTraceListener = new C12291Sqp(this);
        this.mInspectorTarget = reactInstanceManagerInspectorTarget;
        0fc.A00(8192, -104626886);
        0fc.A01(8192, "initializeCxxBridge", 1677961192);
        InstanceCallback instanceCallback = new InstanceCallback(this);
        MessageQueueThreadImpl messageQueueThreadImpl2 = ru8.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Map map = rrl2.A01;
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (!((ModuleHolder) A1J.getValue()).mReactModuleInfo.A04) {
                A1C.add(new JavaModuleWrapper(this, (ModuleHolder) A1J.getValue()));
            }
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A0u2 = AnonymousClass7TF.A0u(map);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            if (((ModuleHolder) A1J2.getValue()).mReactModuleInfo.A04) {
                A1C2.add(A1J2.getValue());
            }
        }
        initializeBridge(instanceCallback, javaScriptExecutor, messageQueueThreadImpl2, messageQueueThreadImpl, A1C, A1C2, this.mInspectorTarget);
        0fc.A00(8192, 992871011);
        getJavaScriptContext();
        this.mJavaScriptContextHolder = new Object();
    }

    private native long getJavaScriptContext();

    public static native HybridData initHybrid();

    private native void initializeBridge(InstanceCallback instanceCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Collection collection, Collection collection2, ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    /* access modifiers changed from: private */
    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection collection, Collection collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    private native void unregisterFromInspector();

    public native CallInvokerHolderImpl getJSCallInvokerHolder();

    public native NativeMethodCallInvokerHolderImpl getNativeMethodCallInvokerHolder();

    public native RuntimeExecutor getRuntimeExecutor();

    public native RuntimeScheduler getRuntimeScheduler();

    public native void setGlobalVariable(String str, String str2);

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.RR7] */
    public void callFunction(String str, String str2, NativeArray nativeArray) {
        ? obj = new Object();
        obj.A02 = str;
        obj.A01 = str2;
        obj.A00 = nativeArray;
        if (this.mDestroyed) {
            0I1.A04("ReactNative", 002.A0R("Calling JS function after bridge has been destroyed: ", obj.toString()));
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(obj);
                    return;
                }
            }
        }
        NativeArray nativeArray2 = obj.A00;
        if (nativeArray2 == null) {
            nativeArray2 = new WritableNativeArray();
        }
        jniCallJSFunction(obj.A02, obj.A01, nativeArray2);
    }

    public void destroy() {
        if (!this.mDestroyed) {
            ReactInstanceManagerInspectorTarget reactInstanceManagerInspectorTarget = this.mInspectorTarget;
            if (reactInstanceManagerInspectorTarget != null) {
                0Sd.A03(reactInstanceManagerInspectorTarget.mHybridData.isValid(), "ReactInstanceManager inspector target destroyed before instance was unregistered");
            }
            unregisterFromInspector();
            ReactMarker.logMarker(RH1.A0X);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new TC8(this));
            AnonymousClass0f6 r3 = this.mTraceListener;
            String[][] strArr = Systrace.A03;
            AnonymousClass0f8 r2 = 0ez.A01;
            synchronized (r2.A01) {
                r2.A02.remove(r3);
                if (r2.A00) {
                    r3.Dsr();
                }
            }
        }
    }

    public JavaScriptModule getJSModule(Class cls) {
        JavaScriptModule javaScriptModule;
        C10223Rof rof = this.mJSModuleRegistry;
        synchronized (rof) {
            HashMap hashMap = rof.A00;
            javaScriptModule = (JavaScriptModule) hashMap.get(cls);
            if (javaScriptModule == null) {
                javaScriptModule = (JavaScriptModule) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new TLO(this, cls));
                hashMap.put(cls, javaScriptModule);
            }
        }
        return javaScriptModule;
    }

    public NativeModule getNativeModule(Class cls) {
        ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
        if (reactModule != null) {
            String name = reactModule.name();
            if (C18401Vr3.A00.useTurboModules()) {
                0Sd.A01((Object) null, "TurboModules are enabled, but mTurboModuleRegistry hasn't been set.");
                throw AnonymousClass00P.createAndThrow();
            } else if (!this.mNativeModuleRegistry.A01.containsKey(name)) {
                return null;
            } else {
                Object obj = this.mNativeModuleRegistry.A01.get(name);
                0Sd.A01(obj, 002.A0R("Could not find module with name ", name));
                return ((ModuleHolder) obj).getModule();
            }
        } else {
            throw AnonymousClass7TF.A0W("Could not find @ReactModule annotation in ", cls.getCanonicalName());
        }
    }

    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    public void invokeCallback(int i, C13431TaJ taJ) {
        if (this.mDestroyed) {
            0I1.A04("ReactNative", "Invoking JS callback after bridge has been destroyed.");
        } else {
            jniCallJSCallback(i, (NativeArray) taJ);
        }
    }

    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = "Ig4aBundle.js.hbc";
        jniLoadScriptFromFile(str, "Ig4aBundle.js.hbc", false);
    }

    static {
        SBO.A00();
    }

    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }
}
