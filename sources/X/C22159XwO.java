package X;

/* renamed from: X.XwO  reason: case insensitive filesystem */
public final class C22159XwO implements Y9E {
    public static final int[] A00 = {8224};

    /* JADX WARNING: type inference failed for: r5v0, types: [X.XIT, X.XSz, java.lang.Object] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        ? obj = new Object();
        long[] jArr = new long[1];
        int[] iArr = A00;
        if (0JE.A01("/proc/self/oom_score", iArr, jArr)) {
            obj.A00 = Long.valueOf(jArr[0]);
        }
        if (0JE.A01("/proc/self/oom_score_adj", iArr, jArr)) {
            obj.A01 = Long.valueOf(jArr[0]);
        }
        return obj;
    }
}
