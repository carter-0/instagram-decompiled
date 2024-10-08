package X;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6vT  reason: invalid class name and case insensitive filesystem */
public final class C322236vT {
    public final Handler A00;
    public final AnonymousClass0JR A01;
    public final C322216vR A02;
    public final C322216vR A03;
    public final Runnable A04 = new C322246vU(this);
    public final Map A05;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.0JR] */
    public C322236vT(C322216vR r3, C322216vR r4) {
        this.A03 = r3;
        this.A02 = r4;
        this.A01 = new Object();
        this.A05 = new HashMap();
        this.A00 = new Handler(Looper.getMainLooper());
    }
}
