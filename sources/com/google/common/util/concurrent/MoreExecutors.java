package com.google.common.util.concurrent;

import X.1K2;
import X.1Lf;
import X.AnonymousClass00P;
import X.C13165TNx;
import X.C258473z8;
import X.C258483z9;
import X.C258493zA;
import X.C258503zB;
import X.C635813i;
import X.C7262Q1m;
import X.C8706R1x;
import X.R26;
import X.R27;
import X.SS5;
import X.THH;
import X.TJ6;
import X.TO5;
import X.TOL;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class MoreExecutors {
    public static Executor directExecutor() {
        return 1Lf.A01;
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        useDaemonThreadFactory(threadPoolExecutor);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        threadPoolExecutor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(threadPoolExecutor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TJ6(threadPoolExecutor, 120, timeUnit)));
        return unconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        useDaemonThreadFactory(scheduledThreadPoolExecutor);
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        scheduledThreadPoolExecutor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(scheduledThreadPoolExecutor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TJ6(scheduledThreadPoolExecutor, 120, timeUnit)));
        return unconfigurableScheduledExecutorService;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: long} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r0 = new java.util.concurrent.TimeoutException();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ ExecutionException -> 0x0099, InterruptedException -> 0x00be, Exception -> 0x0092, all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object invokeAnyImpl(X.C258483z9 r18, java.util.Collection r19, boolean r20, long r21, java.util.concurrent.TimeUnit r23) {
        /*
            r11 = r18
            r11.getClass()
            r2 = r23
            r2.getClass()
            int r5 = r19.size()
            r4 = 1
            r0 = 0
            if (r5 <= 0) goto L_0x0013
            r0 = 1
        L_0x0013:
            X.17k.A0E(r0)
            java.lang.String r0 = "initialArraySize"
            X.1J2.A00(r5, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r5)
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r0 = r21
            long r2 = r2.toNanos(r0)
            if (r20 == 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            r17 = 0
            goto L_0x0035
        L_0x0031:
            long r17 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00c0 }
        L_0x0035:
            java.util.Iterator r16 = r19.iterator()     // Catch:{ all -> 0x00c0 }
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ all -> 0x00c0 }
            com.google.common.util.concurrent.ListenableFuture r0 = submitAndAddQueueListener(r11, r0, r9)     // Catch:{ all -> 0x00c0 }
            r10.add(r0)     // Catch:{ all -> 0x00c0 }
            int r15 = r5 + -1
            r12 = 0
            r0 = r12
            r14 = 1
        L_0x004b:
            java.lang.Object r13 = r9.poll()     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x00c0 }
            if (r13 != 0) goto L_0x0087
            if (r15 <= 0) goto L_0x0065
            int r15 = r15 + -1
            java.lang.Object r1 = r16.next()     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ all -> 0x00c0 }
            com.google.common.util.concurrent.ListenableFuture r1 = submitAndAddQueueListener(r11, r1, r9)     // Catch:{ all -> 0x00c0 }
            r10.add(r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x0085
        L_0x0065:
            if (r14 != 0) goto L_0x006a
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a3
        L_0x006a:
            if (r20 == 0) goto L_0x007e
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x00c0 }
            java.lang.Object r13 = r9.poll(r2, r1)     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x009d
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00c0 }
            long r5 = r7 - r17
            long r2 = r2 - r5
            goto L_0x0089
        L_0x007e:
            java.lang.Object r13 = r9.take()     // Catch:{ all -> 0x00c0 }
            java.util.concurrent.Future r13 = (java.util.concurrent.Future) r13     // Catch:{ all -> 0x00c0 }
            goto L_0x0087
        L_0x0085:
            int r14 = r14 + 1
        L_0x0087:
            r7 = r17
        L_0x0089:
            if (r13 == 0) goto L_0x009a
            int r14 = r14 + -1
            java.lang.Object r2 = r13.get()     // Catch:{ ExecutionException -> 0x0099, InterruptedException -> 0x00be, Exception -> 0x0092 }
            goto L_0x00a9
        L_0x0092:
            r1 = move-exception
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x00c0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00c0 }
            goto L_0x009a
        L_0x0099:
            r0 = move-exception
        L_0x009a:
            r17 = r7
            goto L_0x004b
        L_0x009d:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x00c0 }
            r0.<init>()     // Catch:{ all -> 0x00c0 }
            goto L_0x00a8
        L_0x00a3:
            java.util.concurrent.ExecutionException r0 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x00c0 }
            r0.<init>(r12)     // Catch:{ all -> 0x00c0 }
        L_0x00a8:
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00a9:
            java.util.Iterator r1 = r10.iterator()
        L_0x00ad:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r0.cancel(r4)
            goto L_0x00ad
        L_0x00bd:
            return r2
        L_0x00be:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r2 = move-exception
            java.util.Iterator r1 = r10.iterator()
        L_0x00c5:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r0 = r1.next()
            java.util.concurrent.Future r0 = (java.util.concurrent.Future) r0
            r0.cancel(r4)
            goto L_0x00c5
        L_0x00d5:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.invokeAnyImpl(X.3z9, java.util.Collection, boolean, long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return false;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:7:0x0011] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isAppEngineWithApiClasses() {
        /*
            java.lang.String r0 = "com.google.appengine.runtime.environment"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r3 = 0
            if (r0 != 0) goto L_0x000a
            return r3
        L_0x000a:
            java.lang.String r0 = "com.google.appengine.api.utils.SystemProperty"
            java.lang.Class.forName(r0)     // Catch:{  }
            java.lang.String r0 = "com.google.apphosting.api.ApiProxy"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.String r1 = "getCurrentEnvironment"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.reflect.Method r2 = r2.getMethod(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027, ClassNotFoundException -> 0x0027 }
            if (r0 == 0) goto L_0x0027
            r3 = 1
        L_0x0027:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.MoreExecutors.isAppEngineWithApiClasses():boolean");
    }

    public static C258483z9 listeningDecorator(ExecutorService executorService) {
        if (executorService instanceof C258483z9) {
            return (C258483z9) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new C258493zA((ScheduledExecutorService) executorService);
        }
        return new C258503zB(executorService);
    }

    public static C258483z9 newDirectExecutorService() {
        return new C8706R1x();
    }

    public static Executor newSequentialExecutor(Executor executor) {
        return new TO5(executor);
    }

    public static void addDelayedShutdownHook(ExecutorService executorService, long j, TimeUnit timeUnit) {
        executorService.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(executorService);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TJ6(executorService, j, timeUnit)));
    }

    public static Thread newThread(String str, Runnable runnable) {
        str.getClass();
        runnable.getClass();
        Thread newThread = platformThreadFactory().newThread(runnable);
        newThread.getClass();
        try {
            newThread.setName(str);
        } catch (SecurityException unused) {
        }
        return newThread;
    }

    public static ThreadFactory platformThreadFactory() {
        if (!isAppEngineWithApiClasses()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory) Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", e);
        } catch (InvocationTargetException e2) {
            SS5.A02(e2.getCause());
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static Executor rejectionPropagatingExecutor(Executor executor, 1K2 r2) {
        executor.getClass();
        r2.getClass();
        if (executor == 1Lf.A01) {
            return executor;
        }
        return new C7262Q1m(r2, executor);
    }

    public static Executor renamingDecorator(Executor executor, C635813i r2) {
        executor.getClass();
        r2.getClass();
        return new C13165TNx(r2, executor);
    }

    public static boolean shutdownAndAwaitTermination(ExecutorService executorService, long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j) / 2;
        executorService.shutdown();
        try {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (!executorService.awaitTermination(nanos, timeUnit2)) {
                executorService.shutdownNow();
                executorService.awaitTermination(nanos, timeUnit2);
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    public static ListenableFuture submitAndAddQueueListener(C258483z9 r1, Callable callable, BlockingQueue blockingQueue) {
        ListenableFuture Eyk = r1.Eyk(callable);
        Eyk.addListener(new THH(Eyk, blockingQueue), 1Lf.A01);
        return Eyk;
    }

    public static void useDaemonThreadFactory(ThreadPoolExecutor threadPoolExecutor) {
        ThreadFactory threadFactory = threadPoolExecutor.getThreadFactory();
        threadFactory.getClass();
        threadPoolExecutor.setThreadFactory(new TOL(threadFactory));
    }

    public static ExecutorService getExitingExecutorService(ThreadPoolExecutor threadPoolExecutor, long j, TimeUnit timeUnit) {
        useDaemonThreadFactory(threadPoolExecutor);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
        threadPoolExecutor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(threadPoolExecutor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TJ6(threadPoolExecutor, j, timeUnit)));
        return unconfigurableExecutorService;
    }

    public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long j, TimeUnit timeUnit) {
        useDaemonThreadFactory(scheduledThreadPoolExecutor);
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(scheduledThreadPoolExecutor);
        scheduledThreadPoolExecutor.getClass();
        timeUnit.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("DelayedShutdownHook-for-");
        sb.append(scheduledThreadPoolExecutor);
        Runtime.getRuntime().addShutdownHook(newThread(sb.toString(), new TJ6(scheduledThreadPoolExecutor, j, timeUnit)));
        return unconfigurableScheduledExecutorService;
    }

    public static C258473z8 listeningDecorator(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof C258473z8) {
            return (C258473z8) scheduledExecutorService;
        }
        return new C258493zA(scheduledExecutorService);
    }

    public static ExecutorService renamingDecorator(ExecutorService executorService, C635813i r2) {
        executorService.getClass();
        r2.getClass();
        return new R26(r2, executorService);
    }

    public static ScheduledExecutorService renamingDecorator(ScheduledExecutorService scheduledExecutorService, C635813i r2) {
        scheduledExecutorService.getClass();
        r2.getClass();
        return new R27(r2, scheduledExecutorService);
    }
}
