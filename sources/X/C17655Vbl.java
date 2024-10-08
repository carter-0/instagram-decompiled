package X;

import android.util.SparseIntArray;
import com.facebook.common.dextricks.Constants;

/* renamed from: X.Vbl  reason: case insensitive filesystem */
public final class C17655Vbl {
    public final AnonymousClass1Jg A00;
    public final C17405VUk A01;
    public final C17405VUk A02;
    public final C17405VUk A03;
    public final X9i A04;
    public final X9i A05;
    public final C17405VUk A06;
    public final X9i A07;

    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Object, X.WGk] */
    public C17655Vbl() {
        int i;
        C19009WGk wGk;
        int i2;
        int i3;
        AnonymousClass1Sz.A00();
        SparseIntArray sparseIntArray = VJZ.A00;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        this.A06 = new C17405VUk(VJZ.A00, 0, i, -1);
        this.A07 = WI6.A00();
        int i4 = VJa.A00;
        int i5 = i4 * 4194304;
        int i6 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        do {
            sparseIntArray2.put(i6, i4);
            i6 *= 2;
        } while (i6 <= 4194304);
        this.A01 = new C17405VUk(sparseIntArray2, 4194304, i5, i4);
        synchronized (C19009WGk.class) {
            C19009WGk wGk2 = C19009WGk.A00;
            wGk = wGk2;
            if (wGk2 == null) {
                ? obj = new Object();
                C19009WGk.A00 = obj;
                wGk = obj;
            }
        }
        this.A00 = wGk;
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(1024, 5);
        sparseIntArray3.put(C249703kE.FLAG_MOVED, 5);
        sparseIntArray3.put(4096, 5);
        sparseIntArray3.put(8192, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_PGO, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_PGO_ATTEMPTED, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP, 5);
        sparseIntArray3.put(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, 2);
        sparseIntArray3.put(Constants.LOAD_RESULT_WITH_VDEX_ODEX, 2);
        sparseIntArray3.put(Constants.LOAD_RESULT_NEED_REOPTIMIZATION, 2);
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (min2 < 33554432) {
                i2 = 6291456;
            }
        }
        int min3 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min3 < 16777216) {
            i3 = min3 / 2;
        } else {
            i3 = (min3 / 4) * 3;
        }
        this.A02 = new C17405VUk(sparseIntArray3, i2, i3, -1);
        this.A04 = WI6.A00();
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        sparseIntArray4.put(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, 5);
        this.A03 = new C17405VUk(sparseIntArray4, 81920, Constants.LOAD_RESULT_NEED_REOPTIMIZATION, -1);
        this.A05 = WI6.A00();
        AnonymousClass1Sz.A00();
    }
}
