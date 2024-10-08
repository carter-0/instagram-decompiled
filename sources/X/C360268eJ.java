package X;

import java.util.Arrays;

/* renamed from: X.8eJ  reason: invalid class name and case insensitive filesystem */
public final class C360268eJ extends C2592040u implements C255463uA {
    public static final C360268eJ A00 = new C360268eJ();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new C360258eI(new long[0]);
    }

    public C360268eJ() {
        super(C360248eH.A01);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C360258eI) obj).A00.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0P, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        long[] jArr = ((C360258eI) obj).A00;
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
        B0P b0p = (B0P) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(b0p, 2);
        long AO1 = r7.ANx(this.A00, i).AO1();
        int A002 = b0p.A00() + 1;
        long[] jArr = b0p.A01;
        int length = jArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            jArr = Arrays.copyOf(jArr, A002);
            0qQ.A07(jArr);
            b0p.A01 = jArr;
        }
        int i3 = b0p.A00;
        b0p.A00 = i3 + 1;
        jArr[i3] = AO1;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r7, int i) {
        long[] jArr = ((C360258eI) obj).A00;
        0qQ.A0B(r7, 0);
        for (int i2 = 0; i2 < i; i2++) {
            r7.AS1(this.A00, i2).AS4(jArr[i2]);
        }
    }
}
