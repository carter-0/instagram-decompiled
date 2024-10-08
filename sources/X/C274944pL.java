package X;

/* renamed from: X.4pL  reason: invalid class name and case insensitive filesystem */
public final class C274944pL implements C274924pJ {
    public final String getName() {
        return "heap";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        s3x.A08 = Runtime.getRuntime().totalMemory();
        s3x.A03 = Runtime.getRuntime().freeMemory();
        s3x.A07 = Runtime.getRuntime().maxMemory();
    }
}
