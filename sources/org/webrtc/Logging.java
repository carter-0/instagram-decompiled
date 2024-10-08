package org.webrtc;

import X.002;
import X.AnonymousClass7TE;
import X.C249703kE;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {
    public static final Logger fallbackLogger = createFallbackLogger();
    public static Loggable loggable;
    public static Severity loggableSeverity;
    public static volatile boolean loggingEnabled;

    public enum Severity {
        LS_VERBOSE,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_NONE
    }

    public static void deleteInjectedLoggable() {
        loggable = null;
    }

    @Deprecated
    public static void enableTracing(String str, EnumSet enumSet) {
    }

    public static native void nativeEnableLogThreads();

    public static native void nativeEnableLogTimeStamps();

    public static native void nativeEnableLogToDebugOutput(int i);

    public static native void nativeLog(int i, String str, String str2);

    /* renamed from: org.webrtc.Logging$1  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$org$webrtc$Logging$Severity;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001b */
        static {
            /*
                org.webrtc.Logging$Severity[] r0 = org.webrtc.Logging.Severity.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$org$webrtc$Logging$Severity = r2
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_WARNING     // Catch:{ NoSuchFieldError -> 0x001b }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x001b }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                org.webrtc.Logging$Severity r0 = org.webrtc.Logging.Severity.LS_INFO     // Catch:{ NoSuchFieldError -> 0x0024 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0024 }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.Logging.AnonymousClass1.<clinit>():void");
        }
    }

    @Deprecated
    public enum TraceLevel {
        TRACE_NONE(0),
        TRACE_STATEINFO(1),
        TRACE_WARNING(2),
        TRACE_ERROR(4),
        TRACE_CRITICAL(8),
        TRACE_APICALL(16),
        TRACE_DEFAULT(255),
        TRACE_MODULECALL(32),
        TRACE_MEMORY(256),
        TRACE_TIMER(512),
        TRACE_STREAM(1024),
        TRACE_DEBUG(C249703kE.FLAG_MOVED),
        TRACE_INFO(4096),
        TRACE_TERSEINFO(8192),
        TRACE_ALL(65535);
        
        public final int level;

        /* access modifiers changed from: public */
        TraceLevel(int i) {
            this.level = i;
        }
    }

    public static synchronized void enableLogToDebugOutput(Severity severity) {
        synchronized (Logging.class) {
            if (loggable == null) {
                nativeEnableLogToDebugOutput(severity.ordinal());
                loggingEnabled = true;
            } else {
                throw AnonymousClass7TE.A0z("Logging to native debug output not supported while Loggable is injected. Delete the Loggable before calling this method.");
            }
        }
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void injectLoggable(Loggable loggable2, Severity severity) {
        if (loggable2 != null) {
            loggable = loggable2;
            loggableSeverity = severity;
        }
    }

    public static void log(Severity severity, String str, String str2) {
        Level level;
        if (str == null || str2 == null) {
            throw AnonymousClass7TE.A0w("Logging tag or message may not be null.");
        }
        Loggable loggable2 = loggable;
        if (loggable2 != null) {
            if (severity.ordinal() >= loggableSeverity.ordinal()) {
                loggable2.onLogMessage(str2, severity, str);
            }
        } else if (loggingEnabled) {
            nativeLog(severity.ordinal(), str, str2);
        } else {
            int ordinal = severity.ordinal();
            if (ordinal == 3) {
                level = Level.SEVERE;
            } else if (ordinal == 2) {
                level = Level.WARNING;
            } else if (ordinal != 1) {
                level = Level.FINE;
            } else {
                level = Level.INFO;
            }
            fallbackLogger.log(level, 002.A0g(str, ": ", str2));
        }
    }

    public static Logger createFallbackLogger() {
        Logger logger = Logger.getLogger("org.webrtc.Logging");
        logger.setLevel(Level.ALL);
        return logger;
    }

    public static void d(String str, String str2) {
    }

    public static void e(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }

    public static void enableLogThreads() {
        nativeEnableLogThreads();
    }

    public static void enableLogTimeStamps() {
        nativeEnableLogTimeStamps();
    }

    public static void v(String str, String str2) {
    }

    public static void w(String str, String str2, Throwable th) {
        th.toString();
        getStackTraceString(th);
    }

    public static void e(String str, String str2) {
    }

    public static void w(String str, String str2) {
    }
}
