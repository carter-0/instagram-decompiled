package com.facebook.traffic.nts.providers.background;

import X.0KC;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass385;
import X.AnonymousClass38M;
import X.AnonymousClass7TG;
import X.C11028S6g;
import X.C2379139t;
import X.C2379539x;
import X.C255343ty;
import X.C375569Ed;
import X.C375589Ef;
import X.C375679Ep;
import X.C375689Eq;
import X.C7485QFt;
import X.QG8;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BackgroundV2TaskSchedulerAppLayerUpcallsImpl implements BackgroundV2TaskSchedulerAppLayerUpcalls {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSBackgroundV2TaskSchedulerAppLayerUpcallsImpl";
    public static Context _appContext;
    public static BackgroundV2TaskSchedulerConfig _backgroundTaskSchedulerConfig;
    public static BackgroundV2TaskSchedulerAppLayer _backgroundTaskSchedulerImpl;
    public static final C2379539x _backgroundTaskSchedulerImplFuture = new Object();

    public final class Companion {
        public static /* synthetic */ void getAppContext$annotations() {
        }

        public static /* synthetic */ void getBackgroundTaskSchedulerConfig$annotations() {
        }

        public static /* synthetic */ void getBackgroundTaskSchedulerImpl$annotations() {
        }

        /* JADX WARNING: type inference failed for: r0v8, types: [X.39x, java.util.concurrent.Future, java.lang.Object] */
        /* JADX WARNING: type inference failed for: r0v26, types: [X.39x, java.util.concurrent.Future] */
        /* access modifiers changed from: private */
        public final synchronized void scheduleJob(long j) {
            C2379139t r1;
            boolean z;
            Class cls;
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
            try {
                Context appContext = getAppContext();
                if (appContext != null) {
                    AnonymousClass385 A00 = AnonymousClass385.A00(appContext);
                    String str = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG;
                    QG8 qg8 = new QG8(A00, str);
                    ((AnonymousClass38M) A00.A06).A01.execute(qg8);
                    ? r0 = qg8.A00;
                    0qQ.A07(r0);
                    Object obj = r0.get();
                    0qQ.A07(obj);
                    Iterable iterable = (Iterable) obj;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C11028S6g s6g = (C11028S6g) it.next();
                            if (s6g != null) {
                                r1 = s6g.A05;
                            } else {
                                r1 = null;
                            }
                            if (r1 == C2379139t.ENQUEUED) {
                                break;
                            }
                        }
                    }
                    C375569Ed r2 = new C375569Ed();
                    r2.A02 = true;
                    Companion companion2 = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig = companion2.getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig != null) {
                        z = backgroundTaskSchedulerConfig.getExecuteIfIdleEnabled();
                    } else {
                        z = true;
                    }
                    r2.A04 = z;
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig2 = companion2.getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig2 != null && backgroundTaskSchedulerConfig2.getExecuteIfNetworkConnectedEnabled()) {
                        r2.A01(AnonymousClass05K.A01);
                    }
                    C255343ty A002 = r2.A00();
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig3 = getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig3 == null || !backgroundTaskSchedulerConfig3.getAsyncBackgroundJobEnabled()) {
                        cls = AndroidBackgroundJob.class;
                    } else {
                        cls = AndroidAsyncBackgroundJob.class;
                    }
                    C375589Ef r12 = new C375589Ef(cls);
                    r12.A01(j, TimeUnit.SECONDS);
                    r12.A02(A002);
                    r12.A04(str);
                    C7485QFt qFt = (C7485QFt) r12.A00();
                    Context appContext2 = getAppContext();
                    if (appContext2 != null) {
                        C375689Eq A03 = AnonymousClass385.A00(appContext2).A03(Collections.singletonList(qFt));
                        0qQ.A07(A03);
                        ((C375679Ep) A03).A00.get();
                    }
                }
            } catch (Exception e) {
                0KC.A0F(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG, "Failed to schedule Traffic NTS background job", e);
            }
            return;
        }

        public final void executeReadyTasksAsyncAndReschedule(C2379539x r3) {
            0qQ.A0B(r3, 0);
            new Thread(new BackgroundV2TaskSchedulerAppLayerUpcallsImpl$Companion$executeReadyTasksAsyncAndReschedule$1(r3)).start();
        }

        public final synchronized Context getAppContext() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._appContext;
        }

        public final synchronized BackgroundV2TaskSchedulerConfig getBackgroundTaskSchedulerConfig() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerConfig;
        }

        public final synchronized BackgroundV2TaskSchedulerAppLayer getBackgroundTaskSchedulerImpl() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl;
        }

        public final synchronized void setAppContext(Context context) {
            BackgroundV2TaskSchedulerAppLayerUpcallsImpl._appContext = context;
        }

        public final synchronized void setBackgroundTaskSchedulerConfig(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerConfig = backgroundV2TaskSchedulerConfig;
        }

        public final synchronized void setBackgroundTaskSchedulerImpl(BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer) {
            if (BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl == null && backgroundV2TaskSchedulerAppLayer != null) {
                BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl = backgroundV2TaskSchedulerAppLayer;
                BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImplFuture.A07(backgroundV2TaskSchedulerAppLayer);
            }
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [X.39x, java.util.concurrent.Future] */
        /* access modifiers changed from: private */
        public final void cancelAllJob() {
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
            Context appContext = getAppContext();
            if (appContext != null) {
                C375679Ep A04 = AnonymousClass385.A00(appContext).A04(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG);
                0qQ.A07(A04);
                A04.A00.get();
            }
        }

        public final void executeReadyTasksAndReschedule() {
            if (getBackgroundTaskSchedulerImpl() == null) {
                0KC.A0C(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG, "backgroundTaskSchedulerImpl is null");
                return;
            }
            BackgroundV2TaskSchedulerAppLayer backgroundTaskSchedulerImpl = getBackgroundTaskSchedulerImpl();
            if (backgroundTaskSchedulerImpl != null) {
                backgroundTaskSchedulerImpl.executeReadyTasksAndReschedule();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public static final void cancelAllJob() {
        Companion.cancelAllJob();
    }

    public static final void executeReadyTasksAndReschedule() {
        Companion.executeReadyTasksAndReschedule();
    }

    public static final void executeReadyTasksAsyncAndReschedule(C2379539x r1) {
        Companion.executeReadyTasksAsyncAndReschedule(r1);
    }

    public static final synchronized Context getAppContext() {
        Context appContext;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            appContext = Companion.getAppContext();
        }
        return appContext;
    }

    public static final synchronized BackgroundV2TaskSchedulerConfig getBackgroundTaskSchedulerConfig() {
        BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            backgroundTaskSchedulerConfig = Companion.getBackgroundTaskSchedulerConfig();
        }
        return backgroundTaskSchedulerConfig;
    }

    public static final synchronized BackgroundV2TaskSchedulerAppLayer getBackgroundTaskSchedulerImpl() {
        BackgroundV2TaskSchedulerAppLayer backgroundTaskSchedulerImpl;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            backgroundTaskSchedulerImpl = Companion.getBackgroundTaskSchedulerImpl();
        }
        return backgroundTaskSchedulerImpl;
    }

    public static final synchronized void scheduleJob(long j) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.scheduleJob(j);
        }
    }

    public static final synchronized void setAppContext(Context context) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setAppContext(context);
        }
    }

    public static final synchronized void setBackgroundTaskSchedulerConfig(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setBackgroundTaskSchedulerConfig(backgroundV2TaskSchedulerConfig);
        }
    }

    public static final synchronized void setBackgroundTaskSchedulerImpl(BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setBackgroundTaskSchedulerImpl(backgroundV2TaskSchedulerAppLayer);
        }
    }

    public void cancel() {
        Companion.cancelAllJob();
    }

    public void refresh(long j) {
        if (j > 0) {
            Companion.scheduleJob(j);
        }
    }

    public BackgroundV2TaskSchedulerAppLayerUpcallsImpl(Context context, BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer, BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        AnonymousClass7TG.A1U(context, backgroundV2TaskSchedulerAppLayer, backgroundV2TaskSchedulerConfig);
        Companion companion = Companion;
        companion.setAppContext(context);
        companion.setBackgroundTaskSchedulerImpl(backgroundV2TaskSchedulerAppLayer);
        companion.setBackgroundTaskSchedulerConfig(backgroundV2TaskSchedulerConfig);
    }
}
