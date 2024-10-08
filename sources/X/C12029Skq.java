package X;

import java.lang.ref.WeakReference;

/* renamed from: X.Skq  reason: case insensitive filesystem */
public final class C12029Skq implements C274924pJ {
    public static WeakReference A00;

    public final String getName() {
        return "litho_layout_thread";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        Thread thread;
        WeakReference weakReference = A00;
        if (weakReference != null && (thread = (Thread) weakReference.get()) != null) {
            for (StackTraceElement methodName : stackTraceElementArr) {
                if ("runAndGet".equals(methodName.getMethodName())) {
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    QJT qjt = (QJT) s3x;
                    int length = stackTrace.length;
                    String[] strArr = new String[length];
                    for (int i = 0; i < length; i++) {
                        strArr[i] = stackTrace[i].toString();
                    }
                    qjt.A07 = thread.getName();
                    qjt.A0D = strArr;
                    return;
                }
            }
        }
    }
}
