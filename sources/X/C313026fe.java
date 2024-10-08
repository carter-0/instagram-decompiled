package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6fe  reason: invalid class name and case insensitive filesystem */
public final class C313026fe implements C313036ff {
    public final 1vo A00;
    public final Map A01;

    public C313026fe(1vo r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        0qQ.A07(synchronizedMap);
        this.A01 = synchronizedMap;
    }
}
