package com.instagram.debug.devoptions.debughead.data.provider;

import java.lang.Thread;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DebugHeadExceptionHandler implements Thread.UncaughtExceptionHandler {
    public static final Companion Companion = new Object();
    public static final Class TAG = DebugHeadExceptionHandler.class;
    public static DebugHeadExceptionHandler handler;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Thread$UncaughtExceptionHandler, com.instagram.debug.devoptions.debughead.data.provider.DebugHeadExceptionHandler, java.lang.Object] */
    public final void init() {
        if (handler == null) {
            ? obj = new Object();
            handler = obj;
            Thread.setDefaultUncaughtExceptionHandler(obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void uncaughtException(java.lang.Thread r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            X.AnonymousClass7TG.A1N(r6, r7)
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ RuntimeException -> 0x001b }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x001b }
            r7.printStackTrace(r2)     // Catch:{ all -> 0x0014 }
            r2.close()     // Catch:{ RuntimeException -> 0x001b }
            goto L_0x0023
        L_0x0014:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ RuntimeException -> 0x001b }
            throw r0     // Catch:{ RuntimeException -> 0x001b }
        L_0x001b:
            r2 = move-exception
            java.lang.Class r1 = TAG
            java.lang.String r0 = "error with DebugExceptionHandler PrintWriter"
            X.0KC.A05(r1, r0, r2)
        L_0x0023:
            X.0xi r0 = X.0tS.A4E
            X.0tS r4 = r0.A00()
            java.lang.String r3 = r3.toString()
            X.0s0 r2 = r4.A0S
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 87
            X.DbS.A1a(r4, r3, r2, r1, r0)
            java.lang.Thread$UncaughtExceptionHandler r0 = java.lang.Thread.getDefaultUncaughtExceptionHandler()
            if (r0 == 0) goto L_0x003f
            r0.uncaughtException(r6, r7)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.debughead.data.provider.DebugHeadExceptionHandler.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
