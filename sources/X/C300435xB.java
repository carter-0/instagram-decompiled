package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5xB  reason: invalid class name and case insensitive filesystem */
public abstract class C300435xB {
    public static LightweightQuickPerformanceLogger A00;
    public static C300435xB A01;
    public static C300445xC A02;
    public static final AtomicInteger A03 = new AtomicInteger();
    public static final AtomicInteger A04 = new AtomicInteger();

    /* JADX INFO: finally extract failed */
    public void A0Q(Long l, String str, String str2, int i, boolean z) {
        0fh.A01("MsysBootstrapperPerformanceLoggerImpl.markerCreateMailboxStart", -1785101235);
        try {
            0fh.A01("markerStart", 965901212);
            A00.markerStartWithCancelPolicy(53084161, false, 0, -1, TimeUnit.NANOSECONDS);
            0fh.A00(1073611576);
            A00.markerAnnotate(53084161, "PARAM_HAS_MAILBOX_BEEN_INIT", false);
            A00.markerAnnotate(53084161, "PARAM_BOOTSTRAPPER_VERSION", 3);
            A00.markerAnnotate(53084161, "PARAM_IS_FOREGROUND", 0LA.A07());
            A00.markerAnnotate(53084161, "STARTUP_IN_BACKGROUND", false);
            A00.markerAnnotate(53084161, "PARAM_SEQUENCE_ID", A04.incrementAndGet());
            A00.markerAnnotate(53084161, "PARAM_ACTIVE_MAILBOX_COUNT", A03.incrementAndGet());
            A00.markerAnnotate(53084161, "PARAM_DATABASEFILE_EXIST", new File(str).exists());
            A00.markerPoint(936448891, "BOOTSTRAP_START");
            if (l != null) {
                A00.markerAnnotate(53084161, "TIME_SINCE_STARTUP_MS", l.longValue());
            }
            if (str2 != null) {
                A00.markerAnnotate(53084161, "PARAM_CALLSITE", str2);
            }
            0LA.A05(AnonymousClass0LO.A7T, "started");
            0LA.A05(AnonymousClass0LO.A7S, String.valueOf(3));
            0fh.A00(1416033058);
        } catch (Throwable th) {
            0fh.A00(154555218);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.5xB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.5xB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.5xB} */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.5xC, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C300435xB A00(com.facebook.quicklog.LightweightQuickPerformanceLogger r1) {
        /*
            X.5xB r0 = A01
            if (r0 != 0) goto L_0x001c
            if (r1 == 0) goto L_0x001d
            A00 = r1
            X.5xC r0 = X.C300445xC.A00
            if (r0 != 0) goto L_0x0013
            X.5xC r0 = new X.5xC
            r0.<init>()
            X.C300445xC.A00 = r0
        L_0x0013:
            A02 = r0
            X.5xD r0 = new X.5xD
            r0.<init>()
        L_0x001a:
            A01 = r0
        L_0x001c:
            return r0
        L_0x001d:
            X.NA2 r0 = new X.NA2
            r0.<init>()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C300435xB.A00(com.facebook.quicklog.LightweightQuickPerformanceLogger):X.5xB");
    }

    public void A01() {
        A00.markerEnd(53084161, 2);
        0LA.A05(AnonymousClass0LO.A7T, "succeeded");
    }

    public void A02() {
        A00.markerPoint(53084161, "CLEAN_UP_COMPLETE");
        A03.decrementAndGet();
    }

    public void A03() {
        A00.markerPoint(53084161, "CLEAN_UP_START");
    }

    public void A04() {
        A00.markerPoint(53084161, "CONFIGURE_PROXIES");
    }

    public void A05() {
        A00.markerPoint(53084161, "CONFIGURE_SYNC_PARAMS");
    }

    public void A06() {
        A00.markerPoint(53084161, "CONNECT_MQTT");
    }

    public void A07() {
        A00.markerPoint(53084161, "CREATE_DATABASE");
    }

    public void A08() {
        A00.markerPoint(53084161, "CREATE_MAILBOX");
        A00.markerPoint(936448891, "BOOTSTRAP_END");
    }

    public void A09() {
        A00.markerPoint(53084161, "EXECUTION_JOB_START");
    }

    public void A0A() {
        A00.markerPoint(53084161, "MAILBOX_HEALTH_FILE_CREATE_FAILED");
    }

    public void A0B() {
        A00.markerPoint(53084161, "MAILBOX_OBJECT_CREATE");
    }

    public void A0C() {
        A00.markerPoint(53084161, "PROC_MAPPING_COMPLETE");
    }

    public void A0D() {
        A00.markerPoint(53084161, "PROC_MAPPING_START");
    }

    public void A0E() {
        A00.markerPoint(53084161, "CREATE_NETWORK_SESSION");
    }

    public void A0F() {
        A00.markerPoint(53084161, "CREATE_NOTIFICATION_CENTER");
    }

    public void A0G() {
        A00.markerPoint(53084161, "CREATE_SLIM_MAILBOX_END");
    }

    public void A0H() {
        A00.markerPoint(53084161, "CREATE_SLIM_MAILBOX_START");
    }

    public void A0I() {
        A00.markerPoint(53084161, "EXECUTION_INIT_COMPLETE");
    }

    public void A0J() {
        A00.markerPoint(53084161, "FIRST_SYNC");
    }

    public void A0K() {
        A00.markerPoint(53084161, "IN_MEMORY_SCHEMA_UPGRADE_START");
        0LA.A05(AnonymousClass0LO.A7X, "started");
    }

    public void A0L() {
        A00.markerPoint(53084161, "PERSISTENT_SCHEMA_UPGRADE_START");
        0LA.A05(AnonymousClass0LO.A7Y, "started");
    }

    public void A0M() {
        A00.markerPoint(53084161, "DEPLOY_EARLY_DB_CONNECTION_END");
    }

    public void A0N() {
        A00.markerPoint(53084161, "DEPLOY_EARLY_DB_CONNECTION_START");
    }

    public void A0O(int i) {
        String str;
        A00.markerPoint(53084161, "IN_MEMORY_SCHEMA_UPGRADE_COMPLETE");
        A00.markerAnnotate(53084161, "PARAM_IN_MEMORY_SCHEMA_UPGRADE_RESULT", i);
        0i1 r1 = AnonymousClass0LO.A7X;
        if (i == 0) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        0LA.A05(r1, str);
    }

    public void A0P(int i) {
        String str;
        A00.markerPoint(53084161, "PERSISTENT_SCHEMA_UPGRADE_COMPLETE");
        A00.markerAnnotate(53084161, "PARAM_PERSISTENT_SCHEMA_UPGRADE_RESULT", i);
        0i1 r1 = AnonymousClass0LO.A7Y;
        if (i == 0) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        0LA.A05(r1, str);
    }

    public void A0R(String str) {
        A00.markerAnnotate(53084161, "PARAM_FAIL_TYPE", str);
        A00.markerEnd(53084161, 3);
        0LA.A05(AnonymousClass0LO.A7T, "failed");
        0LA.A05(AnonymousClass0LO.A7V, str);
    }

    public void A0S(boolean z) {
        A00.markerPoint(53084161, "OPEN_DATABASE");
        A00.markerAnnotate(53084161, "PARAM_DID_CREATE_DATABASE", z);
        0LA.A05(AnonymousClass0LO.A7W, String.valueOf(z));
    }
}
