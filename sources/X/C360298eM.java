package X;

import java.util.Arrays;

/* renamed from: X.8eM  reason: invalid class name and case insensitive filesystem */
public final class C360298eM extends C2592040u implements C255463uA {
    public static final C360298eM A00 = new C360298eM();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new int[0];
    }

    public C360298eM() {
        super(C360278eK.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        int[] iArr = (int[]) obj;
        0qQ.A0B(iArr, 0);
        return iArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.B0K] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        int[] iArr = (int[]) obj;
        0qQ.A0B(iArr, 0);
        ? obj2 = new Object();
        obj2.A01 = iArr;
        int length = iArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r6, int i, boolean z) {
        B0K b0k = (B0K) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0k, 2);
        int ANz = r6.ANz(this.A00, i);
        int A002 = b0k.A00() + 1;
        int[] iArr = b0k.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = Arrays.copyOf(iArr, A002);
            0qQ.A07(iArr);
            b0k.A01 = iArr;
        }
        int i3 = b0k.A00;
        b0k.A00 = i3 + 1;
        iArr[i3] = ANz;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r5, int i) {
        int[] iArr = (int[]) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(iArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            r5.AS3(this.A00, i2, iArr[i2]);
        }
    }
}
