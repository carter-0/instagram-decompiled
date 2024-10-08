package X;

import java.util.Arrays;

/* renamed from: X.8eF  reason: invalid class name and case insensitive filesystem */
public final class C360228eF extends C2592040u implements C255463uA {
    public static final C360228eF A00 = new C360228eF();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new long[0];
    }

    public C360228eF() {
        super(C258663zR.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        long[] jArr = (long[]) obj;
        0qQ.A0B(jArr, 0);
        return jArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0L, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        long[] jArr = (long[]) obj;
        0qQ.A0B(jArr, 0);
        ? obj2 = new Object();
        obj2.A01 = jArr;
        int length = jArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r7, int i, boolean z) {
        B0L b0l = (B0L) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(b0l, 2);
        long AO2 = r7.AO2(this.A00, i);
        int A002 = b0l.A00() + 1;
        long[] jArr = b0l.A01;
        int length = jArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            jArr = Arrays.copyOf(jArr, A002);
            0qQ.A07(jArr);
            b0l.A01 = jArr;
        }
        int i3 = b0l.A00;
        b0l.A00 = i3 + 1;
        jArr[i3] = AO2;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r6, int i) {
        long[] jArr = (long[]) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(jArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            r6.AS5(this.A00, i2, jArr[i2]);
        }
    }
}
