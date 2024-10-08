package X;

import java.util.Arrays;

/* renamed from: X.8eE  reason: invalid class name and case insensitive filesystem */
public final class C360218eE extends C2592040u implements C255463uA {
    public static final C360218eE A00 = new C360218eE();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new double[0];
    }

    public C360218eE() {
        super(C258703zV.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        double[] dArr = (double[]) obj;
        0qQ.A0B(dArr, 0);
        return dArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.B0J] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        double[] dArr = (double[]) obj;
        0qQ.A0B(dArr, 0);
        ? obj2 = new Object();
        obj2.A01 = dArr;
        int length = dArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            double[] copyOf = Arrays.copyOf(dArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r7, int i, boolean z) {
        B0J b0j = (B0J) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(b0j, 2);
        double ANo = r7.ANo(this.A00, i);
        int A002 = b0j.A00() + 1;
        double[] dArr = b0j.A01;
        int length = dArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            dArr = Arrays.copyOf(dArr, A002);
            0qQ.A07(dArr);
            b0j.A01 = dArr;
        }
        int i3 = b0j.A00;
        b0j.A00 = i3 + 1;
        dArr[i3] = ANo;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r6, int i) {
        double[] dArr = (double[]) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(dArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            r6.ARx(this.A00, dArr[i2], i2);
        }
    }
}
