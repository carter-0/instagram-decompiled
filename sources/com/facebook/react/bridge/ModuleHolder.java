package com.facebook.react.bridge;

import X.0Sd;
import X.0et;
import X.AnonymousClass0eK;
import X.Pxg;
import X.RH1;
import X.SFW;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.systrace.SystraceMessage;
import java.util.concurrent.atomic.AtomicInteger;

public class ModuleHolder {
    public static final AtomicInteger sInstanceKeyCounter = new AtomicInteger(1);
    public boolean mInitializable;
    public final int mInstanceKey = sInstanceKeyCounter.getAndIncrement();
    public boolean mIsCreating;
    public boolean mIsInitializing;
    public NativeModule mModule;
    public final String mName;
    public AnonymousClass0eK mProvider;
    public final SFW mReactModuleInfo;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
        if (r1 == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r1 = create();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0019, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.mIsCreating = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = r3.mModule;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0027, code lost:
        if (r1 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        wait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.0Sd.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0034, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0035, code lost:
        return r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.facebook.react.bridge.NativeModule getModule() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.facebook.react.bridge.NativeModule r1 = r3.mModule     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0007:
            boolean r2 = r3.mIsCreating     // Catch:{ all -> 0x0039 }
            r1 = 1
            r0 = 0
            if (r2 != 0) goto L_0x0011
            r3.mIsCreating = r1     // Catch:{ all -> 0x0039 }
        L_0x000f:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            goto L_0x0013
        L_0x0011:
            r1 = 0
            goto L_0x000f
        L_0x0013:
            if (r1 == 0) goto L_0x0024
            com.facebook.react.bridge.NativeModule r1 = r3.create()
            monitor-enter(r3)
            r3.mIsCreating = r0     // Catch:{ all -> 0x0021 }
            r3.notifyAll()     // Catch:{ all -> 0x0021 }
            monitor-exit(r3)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x0021:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0021 }
            throw r0
        L_0x0024:
            monitor-enter(r3)
        L_0x0025:
            com.facebook.react.bridge.NativeModule r1 = r3.mModule     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0031
            boolean r0 = r3.mIsCreating     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            r3.wait()     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0031:
            X.0Sd.A00(r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            return r1
        L_0x0036:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ModuleHolder.getModule():com.facebook.react.bridge.NativeModule");
    }

    public void markInitializable() {
        boolean z;
        NativeModule nativeModule;
        synchronized (this) {
            z = true;
            this.mInitializable = true;
            boolean z2 = false;
            if (this.mModule != null) {
                if (!this.mIsInitializing) {
                    z2 = true;
                }
                0Sd.A02(z2);
                nativeModule = this.mModule;
            } else {
                nativeModule = null;
                z = false;
            }
        }
        if (z) {
            doInitialize(nativeModule);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0041, code lost:
        if (r6.mIsInitializing != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.react.bridge.NativeModule create() {
        /*
            r6 = this;
            com.facebook.react.bridge.NativeModule r0 = r6.mModule
            boolean r1 = X.DbW.A1a(r0)
            java.lang.String r0 = "Creating an already created module."
            X.S9A.A00(r1, r0)
            X.RH1 r2 = X.RH1.A0N
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2, (java.lang.String) r1, (int) r0)
            java.lang.String r3 = "ModuleHolder.createModule"
            r1 = 8192(0x2000, double:4.0474E-320)
            X.0eu r0 = com.facebook.systrace.SystraceMessage.A00
            X.0et r2 = com.facebook.systrace.SystraceMessage.A00(r0, r3, r1)
            java.lang.String r1 = "name"
            java.lang.String r0 = r6.mName
            r2.A00(r0, r1)
            r2.A02()
            X.0eK r0 = r6.mProvider     // Catch:{ all -> 0x005a }
            X.0Sd.A00(r0)     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x005a }
            com.facebook.react.bridge.NativeModule r3 = (com.facebook.react.bridge.NativeModule) r3     // Catch:{ all -> 0x005a }
            r0 = 0
            r6.mProvider = r0     // Catch:{ all -> 0x005a }
            monitor-enter(r6)     // Catch:{ all -> 0x005a }
            r6.mModule = r3     // Catch:{ all -> 0x0057 }
            boolean r0 = r6.mInitializable     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0043
            boolean r1 = r6.mIsInitializing     // Catch:{ all -> 0x0057 }
            r0 = 1
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x004a
            r6.doInitialize(r3)     // Catch:{ all -> 0x005a }
        L_0x004a:
            X.RH1 r2 = X.RH1.A0M
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2, (java.lang.String) r1, (int) r0)
            X.Pxg.A1A()
            return r3
        L_0x0057:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0057 }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r5 = move-exception
            java.lang.String r4 = "ReactNative"
            java.lang.String r3 = "Failed to create NativeModule '%s'"
            java.lang.String r0 = r6.mName     // Catch:{ all -> 0x0076 }
            java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x0076 }
            X.0I2 r1 = X.0I1.A00     // Catch:{ all -> 0x0076 }
            r0 = 6
            boolean r0 = r1.isLoggable(r0)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = X.Pxf.A0m(r3, r2)     // Catch:{ all -> 0x0076 }
            r1.e(r4, r0, r5)     // Catch:{ all -> 0x0076 }
        L_0x0075:
            throw r5     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r3 = move-exception
            X.RH1 r2 = X.RH1.A0M
            java.lang.String r1 = r6.mName
            int r0 = r6.mInstanceKey
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2, (java.lang.String) r1, (int) r0)
            X.Pxg.A1A()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.bridge.ModuleHolder.create():com.facebook.react.bridge.NativeModule");
    }

    private void doInitialize(NativeModule nativeModule) {
        boolean z;
        0et A00 = SystraceMessage.A00(SystraceMessage.A00, "ModuleHolder.initialize", 8192);
        A00.A00(this.mName, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        A00.A02();
        ReactMarker.logMarker(RH1.A0w, this.mName, this.mInstanceKey);
        try {
            synchronized (this) {
                try {
                    z = true;
                    if (!this.mInitializable || this.mIsInitializing) {
                        z = false;
                    } else {
                        this.mIsInitializing = true;
                    }
                } catch (Throwable th) {
                    while (true) {
                        th = th;
                    }
                    throw th;
                }
            }
            if (z) {
                nativeModule.initialize();
                synchronized (this) {
                    try {
                        this.mIsInitializing = false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } finally {
            ReactMarker.logMarker(RH1.A0v, this.mName, this.mInstanceKey);
            Pxg.A1A();
        }
    }

    public String getName() {
        return this.mName;
    }

    public ModuleHolder(SFW sfw, AnonymousClass0eK r3) {
        this.mName = sfw.A01;
        this.mProvider = r3;
        this.mReactModuleInfo = sfw;
        if (sfw.A03) {
            this.mModule = create();
        }
    }

    public ModuleHolder(NativeModule nativeModule) {
        this.mName = nativeModule.getName();
        String name = nativeModule.getName();
        Class<?> cls = nativeModule.getClass();
        this.mReactModuleInfo = new SFW(name, cls.getSimpleName(), nativeModule.canOverrideExistingModule(), true, CxxModuleWrapper.class.isAssignableFrom(cls), TurboModule.class.isAssignableFrom(cls));
        this.mModule = nativeModule;
    }
}
