package X;

import android.content.Context;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6fb  reason: invalid class name and case insensitive filesystem */
public final class C313006fb implements C313016fc {
    public final Context A00;
    public final 1vo A01;
    public final C278504wz A02;
    public final Map A03;

    public C313006fb(Context context, 1vo r3, C278504wz r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(context, 2);
        this.A01 = r3;
        this.A00 = context;
        this.A02 = r4;
        Map synchronizedMap = Collections.synchronizedMap(new HashMap());
        0qQ.A07(synchronizedMap);
        this.A03 = synchronizedMap;
    }
}
