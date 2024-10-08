package X;

import java.util.Arrays;

/* renamed from: X.8ef  reason: invalid class name and case insensitive filesystem */
public final class C360488ef extends C2592040u implements C255463uA {
    public static final C360488ef A00 = new C360488ef();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new boolean[0];
    }

    public C360488ef() {
        super(AnonymousClass40E.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        0qQ.A0B(zArr, 0);
        return zArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.B0G] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        0qQ.A0B(zArr, 0);
        ? obj2 = new Object();
        obj2.A01 = zArr;
        int length = zArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r6, int i, boolean z) {
        B0G b0g = (B0G) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0g, 2);
        boolean ANi = r6.ANi(this.A00, i);
        int A002 = b0g.A00() + 1;
        boolean[] zArr = b0g.A01;
        int length = zArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            zArr = Arrays.copyOf(zArr, A002);
            0qQ.A07(zArr);
            b0g.A01 = zArr;
        }
        int i3 = b0g.A00;
        b0g.A00 = i3 + 1;
        zArr[i3] = ANi;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r5, int i) {
        boolean[] zArr = (boolean[]) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(zArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            r5.ARt(this.A00, i2, zArr[i2]);
        }
    }
}
