package X;

import android.os.Process;
import com.facebook.backtrace.NativeBacktrace;

/* renamed from: X.Skv  reason: case insensitive filesystem */
public final class C12034Skv implements C274924pJ {
    public static final String[] A00 = {"android.", "java.", "dalvik.", "com.android.", "sun."};

    public final String getName() {
        return "native_stack";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        if ((s3x instanceof QJT) && stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            QJT qjt = (QJT) s3x;
            StackTraceElement stackTraceElement = stackTraceElementArr[0];
            if (stackTraceElement.isNativeMethod()) {
                String className = stackTraceElement.getClassName();
                String[] strArr = A00;
                int i = 0;
                while (!className.startsWith(strArr[i])) {
                    i++;
                    if (i >= 5) {
                        qjt.A08 = NativeBacktrace.getBacktraceNative((long) Process.myPid(), 32, true, false);
                        return;
                    }
                }
            }
        }
    }
}
