package X;

public final /* synthetic */ class TG3 implements Runnable {
    public final /* synthetic */ C10553Ru7 A00;
    public final /* synthetic */ SSW A01;

    public /* synthetic */ TG3(C10553Ru7 ru7, SSW ssw) {
        this.A01 = ssw;
        this.A00 = ru7;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.QZK, X.Q6H, X.QZJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [com.facebook.react.bridge.ReactInstanceManagerInspectorTarget$TargetDelegate, java.lang.Object, X.XyK] */
    /* JADX WARNING: type inference failed for: r8v21, types: [com.instagram.react.impl.IgReactPackage$$ReactModuleInfoProvider, java.lang.Object] */
    /* JADX WARNING: CFG modification limit reached, blocks count: 239 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x000e */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x000e A[LOOP:0: B:2:0x000e->B:134:0x000e, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r0 = r30
            X.SSW r4 = r0.A01
            X.Ru7 r2 = r0.A00
            X.RH1 r0 = X.RH1.A1Y
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)
            java.lang.Boolean r1 = r4.A0H
            monitor-enter(r1)
        L_0x000e:
            java.lang.Boolean r0 = r4.A0H     // Catch:{ all -> 0x02db }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x02db }
            if (r0 == 0) goto L_0x001c
            java.lang.Boolean r0 = r4.A0H     // Catch:{ InterruptedException -> 0x000e }
            r0.wait()     // Catch:{ InterruptedException -> 0x000e }
            goto L_0x000e
        L_0x001c:
            monitor-exit(r1)     // Catch:{ all -> 0x02db }
            r10 = 1
            r4.A0K = r10
            r0 = -4
            r7 = 0
            android.os.Process.setThreadPriority(r0)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r0 = X.RH1.A1r     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)     // Catch:{ Exception -> 0x02cf }
            r0 = 0
            X.0JC.A00()     // Catch:{ Exception -> 0x02cf }
            com.facebook.jni.HybridData r1 = com.facebook.hermes.reactexecutor.HermesExecutor.initHybridDefaultConfig(r7, r0)     // Catch:{ Exception -> 0x02cf }
            com.facebook.hermes.reactexecutor.HermesExecutor r17 = new com.facebook.hermes.reactexecutor.HermesExecutor     // Catch:{ Exception -> 0x02cf }
            r0 = r17
            r0.<init>(r1)     // Catch:{ Exception -> 0x02cf }
            X.Rzc r0 = r2.A01     // Catch:{ Exception -> 0x02cf }
            r29 = r0
            X.RH1 r1 = X.RH1.A0P     // Catch:{ Exception -> 0x02cf }
            java.lang.String r0 = "HermesExecutor"
            r9 = 0
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r1, (java.lang.String) r0, (int) r9)     // Catch:{ Exception -> 0x02cf }
            android.content.Context r0 = r4.A05     // Catch:{ Exception -> 0x02cf }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x02cf }
            X.QZJ r3 = new X.QZJ     // Catch:{ Exception -> 0x02cf }
            r3.<init>(r0)     // Catch:{ Exception -> 0x02cf }
            r3.A01 = r9     // Catch:{ Exception -> 0x02cf }
            X.Tcn r6 = r4.A09     // Catch:{ Exception -> 0x02cf }
            if (r6 != 0) goto L_0x0059
            X.Tlt r6 = r4.A0A     // Catch:{ Exception -> 0x02cf }
        L_0x0059:
            r3.A01 = r6     // Catch:{ Exception -> 0x02cf }
            java.util.List r11 = r4.A0E     // Catch:{ Exception -> 0x02cf }
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ Exception -> 0x02cf }
            X.RH1 r0 = X.RH1.A1R     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)     // Catch:{ Exception -> 0x02cf }
            monitor-enter(r11)     // Catch:{ Exception -> 0x02cf }
            java.util.Iterator r16 = r11.iterator()     // Catch:{ all -> 0x02bf }
        L_0x006b:
            boolean r2 = r16.hasNext()     // Catch:{ all -> 0x02bf }
            r0 = 8192(0x2000, double:4.0474E-320)
            if (r2 == 0) goto L_0x0172
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x02bf }
            X.Tff r2 = (X.C13716Tff) r2     // Catch:{ all -> 0x02bf }
            java.lang.String r12 = "createAndProcessCustomReactPackage"
            r8 = -224461906(0xfffffffff29efbae, float:-6.2979704E30)
            X.0fc.A01(r0, r12, r8)     // Catch:{ all -> 0x02bf }
            java.lang.String r12 = "processPackage"
            X.0eu r8 = com.facebook.systrace.SystraceMessage.A00     // Catch:{ all -> 0x016a }
            X.0et r13 = com.facebook.systrace.SystraceMessage.A00(r8, r12, r0)     // Catch:{ all -> 0x016a }
            java.lang.String r12 = X.C51968G9o.A16(r2)     // Catch:{ all -> 0x016a }
            java.lang.String r8 = "className"
            r13.A00(r12, r8)     // Catch:{ all -> 0x016a }
            r13.A02()     // Catch:{ all -> 0x016a }
            boolean r12 = r2 instanceof com.facebook.react.CoreModulesPackage     // Catch:{ all -> 0x016a }
            if (r12 == 0) goto L_0x009f
            X.RH1 r8 = X.RH1.A1N     // Catch:{ all -> 0x016a }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r8)     // Catch:{ all -> 0x016a }
        L_0x009f:
            boolean r8 = r2 instanceof com.facebook.react.LazyReactPackage     // Catch:{ all -> 0x016a }
            if (r8 == 0) goto L_0x00e2
            com.facebook.react.LazyReactPackage r2 = (com.facebook.react.LazyReactPackage) r2     // Catch:{ all -> 0x016a }
            com.instagram.react.impl.IgReactPackage$$ReactModuleInfoProvider r8 = new com.instagram.react.impl.IgReactPackage$$ReactModuleInfoProvider     // Catch:{ all -> 0x016a }
            r8.<init>()     // Catch:{ all -> 0x016a }
            java.util.Map r14 = r8.Bjl()     // Catch:{ all -> 0x016a }
            java.util.ArrayList r8 = r2.A01(r3)     // Catch:{ all -> 0x016a }
            X.TAK r13 = new X.TAK     // Catch:{ all -> 0x016a }
            r13.<init>(r10, r2, r14, r8)     // Catch:{ all -> 0x016a }
        L_0x00b7:
            java.util.Iterator r15 = r13.iterator()     // Catch:{ all -> 0x016a }
        L_0x00bb:
            boolean r2 = r15.hasNext()     // Catch:{ all -> 0x016a }
            if (r2 == 0) goto L_0x0145
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x016a }
            com.facebook.react.bridge.ModuleHolder r14 = (com.facebook.react.bridge.ModuleHolder) r14     // Catch:{ all -> 0x016a }
            java.lang.String r8 = r14.mName     // Catch:{ all -> 0x016a }
            boolean r2 = r5.containsKey(r8)     // Catch:{ all -> 0x016a }
            if (r2 == 0) goto L_0x00de
            java.lang.Object r13 = r5.get(r8)     // Catch:{ all -> 0x016a }
            com.facebook.react.bridge.ModuleHolder r13 = (com.facebook.react.bridge.ModuleHolder) r13     // Catch:{ all -> 0x016a }
            X.SFW r2 = r14.mReactModuleInfo     // Catch:{ all -> 0x016a }
            boolean r2 = r2.A02     // Catch:{ all -> 0x016a }
            if (r2 == 0) goto L_0x0157
            r5.remove(r13)     // Catch:{ all -> 0x016a }
        L_0x00de:
            r5.put(r8, r14)     // Catch:{ all -> 0x016a }
            goto L_0x00bb
        L_0x00e2:
            boolean r8 = r2 instanceof X.Sp1     // Catch:{ all -> 0x016a }
            if (r8 == 0) goto L_0x013a
            X.Sp1 r2 = (X.Sp1) r2     // Catch:{ all -> 0x016a }
            boolean r8 = r2 instanceof com.facebook.react.DebugCorePackage     // Catch:{ all -> 0x016a }
            if (r8 == 0) goto L_0x010c
            java.lang.Class<com.facebook.react.devsupport.JSCHeapCapture> r8 = com.facebook.react.devsupport.JSCHeapCapture.class
            java.lang.Class[] r8 = new java.lang.Class[]{r8}     // Catch:{ all -> 0x016a }
            java.util.HashMap r13 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x016a }
            X.Sp1.A00(r13, r8, r9)     // Catch:{ all -> 0x016a }
            X.SpX r8 = new X.SpX     // Catch:{ all -> 0x016a }
            r8.<init>(r13)     // Catch:{ all -> 0x016a }
        L_0x00fe:
            java.util.Map r8 = r8.Bjl()     // Catch:{ all -> 0x016a }
            java.util.Iterator r8 = X.AnonymousClass7TF.A0u(r8)     // Catch:{ all -> 0x016a }
            X.TAK r13 = new X.TAK     // Catch:{ all -> 0x016a }
            r13.<init>(r9, r2, r3, r8)     // Catch:{ all -> 0x016a }
            goto L_0x00b7
        L_0x010c:
            r13 = 11
            java.lang.Class<com.facebook.react.modules.systeminfo.AndroidInfoModule> r18 = com.facebook.react.modules.systeminfo.AndroidInfoModule.class
            r8 = 0
            java.lang.Class<com.facebook.react.modules.core.DeviceEventManagerModule> r19 = com.facebook.react.modules.core.DeviceEventManagerModule.class
            java.lang.Class<com.facebook.react.modules.deviceinfo.DeviceInfoModule> r20 = com.facebook.react.modules.deviceinfo.DeviceInfoModule.class
            java.lang.Class<com.facebook.react.modules.debug.DevMenuModule> r21 = com.facebook.react.modules.debug.DevMenuModule.class
            java.lang.Class<com.facebook.react.modules.debug.DevSettingsModule> r22 = com.facebook.react.modules.debug.DevSettingsModule.class
            java.lang.Class<com.facebook.react.modules.core.ExceptionsManagerModule> r23 = com.facebook.react.modules.core.ExceptionsManagerModule.class
            java.lang.Class<com.facebook.react.devsupport.LogBoxModule> r24 = com.facebook.react.devsupport.LogBoxModule.class
            java.lang.Class<com.facebook.react.modules.core.HeadlessJsTaskSupportModule> r25 = com.facebook.react.modules.core.HeadlessJsTaskSupportModule.class
            java.lang.Class<com.facebook.react.modules.debug.SourceCodeModule> r26 = com.facebook.react.modules.debug.SourceCodeModule.class
            java.lang.Class<com.facebook.react.modules.core.TimingModule> r27 = com.facebook.react.modules.core.TimingModule.class
            java.lang.Class<com.facebook.react.uimanager.UIManagerModule> r28 = com.facebook.react.uimanager.UIManagerModule.class
            java.lang.Class[] r15 = new java.lang.Class[]{r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28}     // Catch:{ all -> 0x016a }
            java.util.HashMap r14 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x016a }
        L_0x012d:
            X.Sp1.A00(r14, r15, r8)     // Catch:{ all -> 0x016a }
            int r8 = r8 + 1
            if (r8 < r13) goto L_0x012d
            X.SpW r8 = new X.SpW     // Catch:{ all -> 0x016a }
            r8.<init>(r14)     // Catch:{ all -> 0x016a }
            goto L_0x00fe
        L_0x013a:
            java.util.List r2 = r2.AMR(r3)     // Catch:{ all -> 0x016a }
            X.Wh6 r13 = new X.Wh6     // Catch:{ all -> 0x016a }
            r13.<init>(r2)     // Catch:{ all -> 0x016a }
            goto L_0x00b7
        L_0x0145:
            if (r12 == 0) goto L_0x014c
            X.RH1 r2 = X.RH1.A1M     // Catch:{ all -> 0x016a }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ all -> 0x016a }
        L_0x014c:
            X.Pxg.A1A()     // Catch:{ all -> 0x016a }
            r2 = -1777810285(0xffffffff9608c493, float:-1.104802E-25)
            X.0fc.A00(r0, r2)     // Catch:{ all -> 0x02bf }
            goto L_0x006b
        L_0x0157:
            java.lang.String r6 = "Native module "
            java.lang.String r5 = " tried to override "
            X.SFW r2 = r13.mReactModuleInfo     // Catch:{ all -> 0x016a }
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x016a }
            java.lang.String r2 = ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild."
            java.lang.String r2 = X.002.A11(r6, r8, r5, r3, r2)     // Catch:{ all -> 0x016a }
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ all -> 0x016a }
            throw r2     // Catch:{ all -> 0x016a }
        L_0x016a:
            r3 = move-exception
            r2 = 2141200563(0x7fa020b3, float:NaN)
            X.0fc.A00(r0, r2)     // Catch:{ all -> 0x02bf }
            throw r3     // Catch:{ all -> 0x02bf }
        L_0x0172:
            monitor-exit(r11)     // Catch:{ all -> 0x02bf }
            X.RH1 r2 = X.RH1.A1Q     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r2 = X.RH1.A07     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            java.lang.String r8 = "buildNativeModuleRegistry"
            r2 = -1765264759(0xffffffff96c83289, float:-3.2343635E-25)
            X.0fc.A01(r0, r8, r2)     // Catch:{ Exception -> 0x02cf }
            X.Rrl r9 = new X.Rrl     // Catch:{ all -> 0x02b5 }
            r9.<init>(r3, r5)     // Catch:{ all -> 0x02b5 }
            r2 = -1175681537(0xffffffffb9ec85ff, float:-4.5113263E-4)
            X.0fc.A00(r0, r2)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r2 = X.RH1.A06     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            java.lang.String r2 = "native_modules"
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x02cf }
            X.SEQ r8 = new X.SEQ     // Catch:{ Exception -> 0x02cf }
            r8.<init>(r11, r2)     // Catch:{ Exception -> 0x02cf }
            java.lang.String r5 = "js"
            X.SEQ r2 = new X.SEQ     // Catch:{ Exception -> 0x02cf }
            r2.<init>(r11, r5)     // Catch:{ Exception -> 0x02cf }
            X.Rrn r12 = new X.Rrn     // Catch:{ Exception -> 0x02cf }
            r12.<init>(r8, r2)     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactInstanceManagerInspectorTarget r2 = r4.A02     // Catch:{ Exception -> 0x02cf }
            if (r2 != 0) goto L_0x01c9
            boolean r2 = com.facebook.react.devsupport.InspectorFlags.getFuseboxEnabled()     // Catch:{ Exception -> 0x02cf }
            if (r2 == 0) goto L_0x01c9
            com.facebook.react.bridge.ReactInstanceManagerInspectorTarget r2 = com.facebook.react.bridge.ReactInstanceManagerInspectorTarget.$redex_init_class     // Catch:{ Exception -> 0x02cf }
            X.XyK r5 = new X.XyK     // Catch:{ Exception -> 0x02cf }
            r5.<init>()     // Catch:{ Exception -> 0x02cf }
            java.lang.ref.WeakReference r2 = X.C51965G9l.A0v(r4)     // Catch:{ Exception -> 0x02cf }
            r5.A00 = r2     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactInstanceManagerInspectorTarget r2 = new com.facebook.react.bridge.ReactInstanceManagerInspectorTarget     // Catch:{ Exception -> 0x02cf }
            r2.<init>(r5)     // Catch:{ Exception -> 0x02cf }
            r4.A02 = r2     // Catch:{ Exception -> 0x02cf }
        L_0x01c9:
            com.facebook.react.bridge.ReactInstanceManagerInspectorTarget r8 = r4.A02     // Catch:{ Exception -> 0x02cf }
            X.RH1 r2 = X.RH1.A0F     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            r5 = 1387698763(0x52b69a4b, float:3.92136327E11)
            java.lang.String r2 = "createCatalystInstance"
            X.0fc.A01(r0, r2, r5)     // Catch:{ Exception -> 0x02cf }
            java.util.concurrent.atomic.AtomicInteger r2 = com.facebook.react.bridge.CatalystInstanceImpl.sNextInstanceIdForTrace     // Catch:{ all -> 0x02c2 }
            X.0Sd.A00(r29)     // Catch:{ all -> 0x02c2 }
            X.0Sd.A00(r6)     // Catch:{ all -> 0x02c2 }
            X.Tcn r6 = (X.C13567Tcn) r6     // Catch:{ all -> 0x02c2 }
            com.facebook.react.bridge.CatalystInstanceImpl r11 = new com.facebook.react.bridge.CatalystInstanceImpl     // Catch:{ all -> 0x02c2 }
            r13 = r17
            r14 = r9
            r15 = r29
            r16 = r6
            r17 = r8
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x02c2 }
            r2 = 60289572(0x397f224, float:8.930575E-37)
            X.0fc.A00(r0, r2)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r2 = X.RH1.A0E     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.CatalystInstance r2 = r3.A00     // Catch:{ Exception -> 0x02cf }
            if (r2 != 0) goto L_0x02ae
            boolean r2 = r3.A01     // Catch:{ Exception -> 0x02cf }
            if (r2 == 0) goto L_0x020e
            java.lang.String r2 = "Cannot initialize ReactContext after it has been destroyed."
            java.lang.IllegalStateException r5 = X.AnonymousClass7TE.A0z(r2)     // Catch:{ Exception -> 0x02cf }
            java.lang.String r2 = "BridgeReactContext"
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r2, r5)     // Catch:{ Exception -> 0x02cf }
        L_0x020e:
            r3.A00 = r11     // Catch:{ Exception -> 0x02cf }
            X.Ru8 r2 = r11.mReactQueueConfiguration     // Catch:{ Exception -> 0x02cf }
            r3.A0B(r2)     // Catch:{ Exception -> 0x02cf }
            X.Roi r2 = new X.Roi     // Catch:{ Exception -> 0x02cf }
            r2.<init>()     // Catch:{ Exception -> 0x02cf }
            r3.A02 = r2     // Catch:{ Exception -> 0x02cf }
            r11.getRuntimeScheduler()     // Catch:{ Exception -> 0x02cf }
            X.XyL r2 = X.C18401Vr3.A00     // Catch:{ Exception -> 0x02cf }
            r2.useTurboModules()     // Catch:{ Exception -> 0x02cf }
            r5 = 134348800(0x8020000, double:6.63771266E-316)
            boolean r2 = com.facebook.systrace.Systrace.A0E(r5)     // Catch:{ Exception -> 0x02cf }
            if (r2 == 0) goto L_0x0235
            java.lang.String r5 = "__RCTProfileIsProfiling"
            java.lang.String r2 = "true"
            r11.setGlobalVariable(r5, r2)     // Catch:{ Exception -> 0x02cf }
        L_0x0235:
            X.RH1 r2 = X.RH1.A1J     // Catch:{ Exception -> 0x02cf }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r2)     // Catch:{ Exception -> 0x02cf }
            r5 = -1779549206(0xffffffff95ee3bea, float:-9.622196E-26)
            java.lang.String r2 = "runJSBundle"
            X.0fc.A01(r0, r2, r5)     // Catch:{ Exception -> 0x02cf }
            boolean r2 = r11.mJSBundleHasLoaded     // Catch:{ Exception -> 0x02cf }
            r5 = r2 ^ 1
            java.lang.String r2 = "JS bundle was already loaded!"
            X.0Sd.A03(r5, r2)     // Catch:{ Exception -> 0x02cf }
            X.Rzc r2 = r11.mJSBundleLoader     // Catch:{ Exception -> 0x02cf }
            r2.A00(r11)     // Catch:{ Exception -> 0x02cf }
            java.lang.Object r9 = r11.mJSCallsPendingInitLock     // Catch:{ Exception -> 0x02cf }
            monitor-enter(r9)     // Catch:{ Exception -> 0x02cf }
            r11.mAcceptCalls = r10     // Catch:{ all -> 0x02ab }
            java.util.ArrayList r2 = r11.mJSCallsPendingInit     // Catch:{ all -> 0x02ab }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x02ab }
        L_0x025c:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x02ab }
            if (r2 == 0) goto L_0x0279
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x02ab }
            X.RR7 r2 = (X.RR7) r2     // Catch:{ all -> 0x02ab }
            com.facebook.react.bridge.NativeArray r6 = r2.A00     // Catch:{ all -> 0x02ab }
            if (r6 != 0) goto L_0x0271
            com.facebook.react.bridge.WritableNativeArray r6 = new com.facebook.react.bridge.WritableNativeArray     // Catch:{ all -> 0x02ab }
            r6.<init>()     // Catch:{ all -> 0x02ab }
        L_0x0271:
            java.lang.String r5 = r2.A02     // Catch:{ all -> 0x02ab }
            java.lang.String r2 = r2.A01     // Catch:{ all -> 0x02ab }
            r11.jniCallJSFunction(r5, r2, r6)     // Catch:{ all -> 0x02ab }
            goto L_0x025c
        L_0x0279:
            java.util.ArrayList r2 = r11.mJSCallsPendingInit     // Catch:{ all -> 0x02ab }
            r2.clear()     // Catch:{ all -> 0x02ab }
            r11.mJSBundleHasLoaded = r10     // Catch:{ all -> 0x02ab }
            monitor-exit(r9)     // Catch:{ all -> 0x02ab }
            X.0f6 r2 = r11.mTraceListener     // Catch:{ Exception -> 0x02cf }
            X.0ez.A01(r2)     // Catch:{ Exception -> 0x02cf }
            r2 = 428111720(0x19847768, float:1.3696708E-23)
            X.0fc.A00(r0, r2)     // Catch:{ Exception -> 0x02cf }
            r4.A0J = r7     // Catch:{ Exception -> 0x02a4 }
            X.RH1 r0 = X.RH1.A1L     // Catch:{ Exception -> 0x02a4 }
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)     // Catch:{ Exception -> 0x02a4 }
            X.TC7 r1 = new X.TC7     // Catch:{ Exception -> 0x02a4 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x02a4 }
            X.TG2 r0 = new X.TG2     // Catch:{ Exception -> 0x02a4 }
            r0.<init>(r4, r3)     // Catch:{ Exception -> 0x02a4 }
            r3.A0D(r0)     // Catch:{ Exception -> 0x02a4 }
            X.C18773W0w.A01(r1)     // Catch:{ Exception -> 0x02a4 }
            return
        L_0x02a4:
            r1 = move-exception
            X.Tlt r0 = r4.A0A
            r0.handleException(r1)
            throw r7
        L_0x02ab:
            r3 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x02ab }
            goto L_0x02ce
        L_0x02ae:
            java.lang.String r0 = "ReactContext has been already initialized"
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x02cf }
            goto L_0x02ce
        L_0x02b5:
            r3 = move-exception
            r2 = 1025245346(0x3d1c00a2, float:0.03808654)
            X.0fc.A00(r0, r2)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r0 = X.RH1.A06     // Catch:{ Exception -> 0x02cf }
            goto L_0x02cb
        L_0x02bf:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x02bf }
            goto L_0x02ce
        L_0x02c2:
            r3 = move-exception
            r2 = -1765565825(0xffffffff96c39a7f, float:-3.160145E-25)
            X.0fc.A00(r0, r2)     // Catch:{ Exception -> 0x02cf }
            X.RH1 r0 = X.RH1.A0E     // Catch:{ Exception -> 0x02cf }
        L_0x02cb:
            com.facebook.react.bridge.ReactMarker.logMarker((X.RH1) r0)     // Catch:{ Exception -> 0x02cf }
        L_0x02ce:
            throw r3     // Catch:{ Exception -> 0x02cf }
        L_0x02cf:
            r1 = move-exception
            r0 = 0
            r4.A0K = r0
            r4.A0J = r7
            X.Tlt r0 = r4.A0A
            r0.handleException(r1)
            throw r7
        L_0x02db:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02db }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TG3.run():void");
    }
}
