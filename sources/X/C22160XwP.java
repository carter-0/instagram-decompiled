package X;

import java.util.List;

/* renamed from: X.XwP  reason: case insensitive filesystem */
public final class C22160XwP implements Y9E {
    public static final List A00 = 0sr.A1P(new String[]{"VmHWM:", "VmRSS:", "VmData:", "VmLib:", "Threads:"});

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XSz, java.lang.Object, X.XIW] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        ? obj = new Object();
        List list = A00;
        long[] jArr = new long[list.size()];
        0JE.A02(AnonymousClass000.A00(2064), jArr, (String[]) list.toArray(new String[0]));
        obj.A02 = jArr[list.indexOf("VmHWM:")];
        obj.A04 = jArr[list.indexOf("VmRSS:")];
        obj.A01 = jArr[list.indexOf("VmData:")];
        obj.A03 = jArr[list.indexOf("VmLib:")];
        obj.A00 = jArr[list.indexOf("Threads:")];
        return obj;
    }
}
