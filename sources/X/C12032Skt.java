package X;

import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.Skt  reason: case insensitive filesystem */
public final class C12032Skt implements C274924pJ {
    public int A00 = -1;

    public final String getName() {
        return "render_thread_stack";
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        if ((s3x instanceof QJT) && this.A00 != -1 && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            QJT qjt = (QJT) s3x;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod() && "nSyncAndDrawFrame".equals(stackTraceElement.getMethodName())) {
                qjt.A0A = NativeBacktrace.getBacktraceNative((long) this.A00, 32, true, false);
            }
        }
    }

    public final void update() {
        int A002;
        if (this.A00 == -1 && (A002 = AnonymousClass15N.A00()) >= 0) {
            this.A00 = A002;
        }
    }
}
