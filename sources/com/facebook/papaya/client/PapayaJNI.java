package com.facebook.papaya.client;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C51966G9m;
import X.C51974G9v;
import X.DbT;
import X.RFG;
import android.content.ComponentName;
import android.content.Context;
import android.os.Looper;
import com.facebook.jni.HybridClassBase;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;
import java.util.Set;

public final class PapayaJNI extends HybridClassBase {
    public static final PapayaJNI INSTANCE = new HybridClassBase();

    public static final native void nativeAddLogSink(String str, int i, LogSink logSink);

    public static final native void nativeCancelAllExecutors();

    public static final native void nativeCancelExecutor(String str, String str2);

    public static final native void nativeInitialize(String str, Set set, Context context, ComponentName componentName, String str2, String str3, Map map);

    public static final native void nativeRegisterEngine(String str, IEngineFactory iEngineFactory);

    public static final native void nativeReset();

    public static final native void nativeResetScheduler();

    public static final native void nativeRun(Map map);

    public static final native void nativeSetCallback(ICallback iCallback);

    public static final native void nativeStop();

    public static final native void nativeSubmitExecutor(String str, String str2);

    public static final native void nativeUninitialize();

    public static final void run(PapayaRestrictions papayaRestrictions) {
        0qQ.A0B(papayaRestrictions, 0);
        if (C51966G9m.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            nativeRun(papayaRestrictions.A00());
            return;
        }
        throw AnonymousClass7TE.A0z("Papaya.run() may only be invoked from background thread!");
    }

    public static final void setCallback(ICallback iCallback) {
        0qQ.A0B(iCallback, 0);
        nativeSetCallback(iCallback);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.jni.HybridClassBase, com.facebook.papaya.client.PapayaJNI] */
    static {
        0dV.A0C("papaya");
    }

    public static final synchronized void initialize(String str, ImmutableSet immutableSet, Context context, ComponentName componentName, String str2, String str3, ImmutableMap immutableMap) {
        synchronized (PapayaJNI.class) {
            C51974G9v.A1O(str, immutableSet, context, componentName);
            0qQ.A0B(immutableMap, 6);
            nativeInitialize(str, immutableSet, DbT.A05(context), componentName, str2, str3, immutableMap);
        }
    }

    public static final void addLogSink(String str, RFG rfg, LogSink logSink) {
        AnonymousClass7TG.A1T(str, rfg, logSink);
        nativeAddLogSink(str, rfg.A00, logSink);
    }

    public static final void cancelAllExecutors() {
        nativeCancelAllExecutors();
    }

    public static final void cancelExecutor(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        nativeCancelExecutor(str, str2);
    }

    public static final void registerEngine(String str, IEngineFactory iEngineFactory) {
        AnonymousClass7TG.A1N(str, iEngineFactory);
        nativeRegisterEngine(str, iEngineFactory);
    }

    public static final void reset() {
        nativeReset();
    }

    public static final void resetScheduler() {
        nativeResetScheduler();
    }

    public static final void stop() {
        if (C51966G9m.A1a(Looper.myLooper(), Looper.getMainLooper())) {
            nativeStop();
            return;
        }
        throw AnonymousClass7TE.A0z("Papaya.stop() may only be invoked from background thread!");
    }

    public static final void submitExecutor(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        nativeSubmitExecutor(str, str2);
    }

    public static final void uninitialize() {
        nativeUninitialize();
    }
}
