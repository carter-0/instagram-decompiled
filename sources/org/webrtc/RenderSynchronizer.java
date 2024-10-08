package org.webrtc;

import X.AnonymousClass7TF;
import X.JTO;
import android.os.Handler;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

public final class RenderSynchronizer {
    public static final float DEFAULT_TARGET_FPS = 30.0f;
    public static final String TAG = "RenderSynchronizer";
    public Choreographer choreographer;
    public boolean isListening;
    public long lastOpenedTimeNanos;
    public long lastRefreshTimeNanos;
    public final List listeners;
    public final Object lock;
    public final Handler mainThreadHandler;
    public boolean renderWindowOpen;
    public final long targetFrameIntervalNanos;

    public interface Listener {
        void onRenderWindowClose();

        void onRenderWindowOpen();
    }

    private void closeRenderWindow() {
        this.renderWindowOpen = false;
        for (Listener onRenderWindowClose : this.listeners) {
            onRenderWindowClose.onRenderWindowClose();
        }
    }

    private void openRenderWindow() {
        this.renderWindowOpen = true;
        for (Listener onRenderWindowOpen : this.listeners) {
            onRenderWindowOpen.onRenderWindowOpen();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (java.lang.Math.abs(r7) >= java.lang.Math.abs(r7 + r5)) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        r9.lastOpenedTimeNanos = r10;
        openRenderWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r9.renderWindowOpen == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        closeRenderWindow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r9.choreographer.postFrameCallback(new org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda0(r9));
        r7 = r10 - r9.lastOpenedTimeNanos;
        r5 = r10 - r9.lastRefreshTimeNanos;
        r9.lastRefreshTimeNanos = r10;
        r7 = r7 - r9.targetFrameIntervalNanos;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDisplayRefreshCycleBegin(long r10) {
        /*
            r9 = this;
            java.lang.Object r1 = r9.lock
            monitor-enter(r1)
            java.util.List r0 = r9.listeners     // Catch:{ all -> 0x0045 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x0012
            boolean r0 = org.webrtc.Logging.loggingEnabled     // Catch:{ all -> 0x0045 }
            r0 = 0
            r9.isListening = r0     // Catch:{ all -> 0x0045 }
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            return
        L_0x0012:
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            android.view.Choreographer r1 = r9.choreographer
            org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda0 r0 = new org.webrtc.RenderSynchronizer$$ExternalSyntheticLambda0
            r0.<init>(r9)
            r1.postFrameCallback(r0)
            long r0 = r9.lastOpenedTimeNanos
            long r7 = r10 - r0
            long r0 = r9.lastRefreshTimeNanos
            long r5 = r10 - r0
            r9.lastRefreshTimeNanos = r10
            long r0 = r9.targetFrameIntervalNanos
            long r7 = r7 - r0
            long r3 = java.lang.Math.abs(r7)
            long r7 = r7 + r5
            long r1 = java.lang.Math.abs(r7)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x003d
            r9.lastOpenedTimeNanos = r10
            r9.openRenderWindow()
        L_0x003c:
            return
        L_0x003d:
            boolean r0 = r9.renderWindowOpen
            if (r0 == 0) goto L_0x003c
            r9.closeRenderWindow()
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.RenderSynchronizer.onDisplayRefreshCycleBegin(long):void");
    }

    /* renamed from: lambda$registerListener$1$org-webrtc-RenderSynchronizer  reason: not valid java name */
    public /* synthetic */ void m49lambda$registerListener$1$orgwebrtcRenderSynchronizer() {
        this.choreographer.postFrameCallback(new RenderSynchronizer$$ExternalSyntheticLambda0(this));
    }

    public void registerListener(Listener listener) {
        this.listeners.add(listener);
        synchronized (this.lock) {
            if (!this.isListening) {
                boolean z = Logging.loggingEnabled;
                this.isListening = true;
                this.mainThreadHandler.post(new RenderSynchronizer$$ExternalSyntheticLambda1(this));
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    public RenderSynchronizer(float f) {
        this.lock = new Object();
        this.listeners = new CopyOnWriteArrayList();
        this.targetFrameIntervalNanos = (long) JTO.A04((float) TimeUnit.SECONDS.toNanos(1), f);
        Handler A0D = AnonymousClass7TF.A0D();
        this.mainThreadHandler = A0D;
        A0D.post(new RenderSynchronizer$$ExternalSyntheticLambda2(this));
        boolean z = Logging.loggingEnabled;
    }

    /* renamed from: lambda$new$0$org-webrtc-RenderSynchronizer  reason: not valid java name */
    public /* synthetic */ void m48lambda$new$0$orgwebrtcRenderSynchronizer() {
        this.choreographer = Choreographer.getInstance();
    }

    public RenderSynchronizer() {
        this(30.0f);
    }
}
