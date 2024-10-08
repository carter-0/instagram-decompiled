package org.webrtc;

import X.Pxf;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.RenderSynchronizer;

public class EglThread implements RenderSynchronizer.Listener {
    public final EglBase.EglConnection eglConnection;
    public final HandlerWithExceptionCallbacks handler;
    public final List pendingRenderUpdates = new ArrayList();
    public final ReleaseMonitor releaseMonitor;
    public final RenderSynchronizer renderSynchronizer;
    public boolean renderWindowOpen = true;

    public class HandlerWithExceptionCallbacks extends Handler {
        public final Object callbackLock = new Object();
        public final List exceptionCallbacks = new ArrayList();

        public void addExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.add(runnable);
            }
        }

        public void removeExceptionCallback(Runnable runnable) {
            synchronized (this.callbackLock) {
                this.exceptionCallbacks.remove(runnable);
            }
        }

        public HandlerWithExceptionCallbacks(Looper looper) {
            super(looper);
        }

        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
                return;
            } catch (Exception e) {
                e = e;
                Logging.e("EglThread", "Exception on EglThread", e);
                synchronized (this.callbackLock) {
                    for (Runnable run : this.exceptionCallbacks) {
                        run.run();
                    }
                }
            } catch (Throwable th) {
                e = th;
            }
            throw e;
        }
    }

    public interface ReleaseMonitor {
        boolean onRelease(EglThread eglThread);
    }

    public interface RenderUpdate {
        void update(boolean z);
    }

    public static EglThread create(ReleaseMonitor releaseMonitor2, EglBase.Context context, int[] iArr) {
        return create(releaseMonitor2, context, iArr, (RenderSynchronizer) null);
    }

    public static /* synthetic */ boolean lambda$create$1(EglThread eglThread) {
        return true;
    }

    /* renamed from: lambda$onRenderWindowClose$3$org-webrtc-EglThread  reason: not valid java name */
    public /* synthetic */ void m44lambda$onRenderWindowClose$3$orgwebrtcEglThread() {
        this.renderWindowOpen = false;
    }

    /* renamed from: lambda$onRenderWindowOpen$2$org-webrtc-EglThread  reason: not valid java name */
    public /* synthetic */ void m45lambda$onRenderWindowOpen$2$orgwebrtcEglThread() {
        this.renderWindowOpen = true;
        for (RenderUpdate update : this.pendingRenderUpdates) {
            update.update(false);
        }
        this.pendingRenderUpdates.clear();
    }

    public static /* synthetic */ EglBase.EglConnection lambda$create$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return new EglBase10Impl.EglConnection((EGLContext) null, iArr);
        }
        return EglBase.EglConnection.CC.create(context, iArr);
    }

    public void addExceptionCallback(Runnable runnable) {
        this.handler.addExceptionCallback(runnable);
    }

    public EglBase createEglBaseWithSharedConnection() {
        return EglBase.CC.create(this.eglConnection);
    }

    public Handler getHandler() {
        return this.handler;
    }

    public void onRenderWindowClose() {
        this.handler.post(new EglThread$$ExternalSyntheticLambda1(this));
    }

    public void onRenderWindowOpen() {
        this.handler.post(new EglThread$$ExternalSyntheticLambda4(this));
    }

    public void release() {
        if (this.releaseMonitor.onRelease(this)) {
            RenderSynchronizer renderSynchronizer2 = this.renderSynchronizer;
            if (renderSynchronizer2 != null) {
                renderSynchronizer2.removeListener(this);
            }
            HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = this.handler;
            EglBase.EglConnection eglConnection2 = this.eglConnection;
            eglConnection2.getClass();
            handlerWithExceptionCallbacks.post(new EglThread$$ExternalSyntheticLambda0(eglConnection2));
            this.handler.getLooper().quitSafely();
        }
    }

    public void removeExceptionCallback(Runnable runnable) {
        this.handler.removeExceptionCallback(runnable);
    }

    public void scheduleRenderUpdate(RenderUpdate renderUpdate) {
        if (this.renderWindowOpen) {
            renderUpdate.update(true);
        } else {
            this.pendingRenderUpdates.add(renderUpdate);
        }
    }

    public EglThread(ReleaseMonitor releaseMonitor2, HandlerWithExceptionCallbacks handlerWithExceptionCallbacks, EglBase.EglConnection eglConnection2, RenderSynchronizer renderSynchronizer2) {
        this.releaseMonitor = releaseMonitor2;
        this.handler = handlerWithExceptionCallbacks;
        this.eglConnection = eglConnection2;
        this.renderSynchronizer = renderSynchronizer2;
        if (renderSynchronizer2 != null) {
            renderSynchronizer2.registerListener(this);
        }
    }

    public static EglThread create(ReleaseMonitor releaseMonitor2, EglBase.Context context, int[] iArr, RenderSynchronizer renderSynchronizer2) {
        HandlerThread A0I = Pxf.A0I("EglThread");
        A0I.start();
        HandlerWithExceptionCallbacks handlerWithExceptionCallbacks = new HandlerWithExceptionCallbacks(A0I.getLooper());
        EglBase.EglConnection eglConnection2 = (EglBase.EglConnection) ThreadUtils.invokeAtFrontUninterruptibly((Handler) handlerWithExceptionCallbacks, (Callable) new EglThread$$ExternalSyntheticLambda2(context, iArr));
        if (releaseMonitor2 == null) {
            new EglThread$$ExternalSyntheticLambda3
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r3v2 ? I:org.webrtc.EglThread$$ExternalSyntheticLambda3) =  call: org.webrtc.EglThread$$ExternalSyntheticLambda3.<init>():void type: CONSTRUCTOR in method: org.webrtc.EglThread.create(org.webrtc.EglThread$ReleaseMonitor, org.webrtc.EglBase$Context, int[], org.webrtc.RenderSynchronizer):org.webrtc.EglThread, dex: classes11.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v2 ?
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	... 34 more
                */
            /*
                java.lang.String r0 = "EglThread"
                android.os.HandlerThread r0 = X.Pxf.A0I(r0)
                r0.start()
                android.os.Looper r0 = r0.getLooper()
                org.webrtc.EglThread$HandlerWithExceptionCallbacks r2 = new org.webrtc.EglThread$HandlerWithExceptionCallbacks
                r2.<init>(r0)
                org.webrtc.EglThread$$ExternalSyntheticLambda2 r0 = new org.webrtc.EglThread$$ExternalSyntheticLambda2
                r0.<init>(r4, r5)
                java.lang.Object r1 = org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly((android.os.Handler) r2, (java.util.concurrent.Callable) r0)
                org.webrtc.EglBase$EglConnection r1 = (org.webrtc.EglBase.EglConnection) r1
                if (r3 != 0) goto L_0x0024
                org.webrtc.EglThread$$ExternalSyntheticLambda3 r3 = new org.webrtc.EglThread$$ExternalSyntheticLambda3
                r3.<init>()
            L_0x0024:
                org.webrtc.EglThread r0 = new org.webrtc.EglThread
                r0.<init>(r3, r2, r1, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.EglThread.create(org.webrtc.EglThread$ReleaseMonitor, org.webrtc.EglBase$Context, int[], org.webrtc.RenderSynchronizer):org.webrtc.EglThread");
        }
    }
