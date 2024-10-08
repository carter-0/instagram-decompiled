package X;

import java.util.List;

/* renamed from: X.XwQ  reason: case insensitive filesystem */
public final class C22161XwQ implements Y9E {
    public static final List A00 = 0sr.A1P(new String[]{"pgpgin", "pgpgout", "pswpin", "pswpout", "pgfault", "pgmajfault"});

    /* JADX WARNING: type inference failed for: r2v0, types: [X.XSz, java.lang.Object, X.XIY] */
    public final /* bridge */ /* synthetic */ C21292XSz BSt() {
        ? obj = new Object();
        List list = A00;
        long[] jArr = new long[list.size()];
        if (0JE.A02("/proc/vmstat", jArr, (String[]) list.toArray(new String[0]))) {
            obj.A02 = jArr[list.indexOf("pgpgin")];
            obj.A03 = jArr[list.indexOf("pgpgout")];
            obj.A04 = jArr[list.indexOf("pswpin")];
            obj.A05 = jArr[list.indexOf("pswpout")];
            obj.A00 = jArr[list.indexOf("pgfault")];
            obj.A01 = jArr[list.indexOf("pgmajfault")];
        }
        return obj;
    }
}
