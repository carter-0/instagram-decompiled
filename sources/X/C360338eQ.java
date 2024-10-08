package X;

import java.util.Arrays;

/* renamed from: X.8eQ  reason: invalid class name and case insensitive filesystem */
public final class C360338eQ extends C2592040u implements C255463uA {
    public static final C360338eQ A00 = new C360338eQ();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new C360328eP(new int[0]);
    }

    public C360338eQ() {
        super(C360318eO.A01);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C360328eP) obj).A00.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0O, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        int[] iArr = ((C360328eP) obj).A00;
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
        B0O b0o = (B0O) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0o, 2);
        int ANy = r6.ANx(this.A00, i).ANy();
        int A002 = b0o.A00() + 1;
        int[] iArr = b0o.A01;
        int length = iArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            iArr = Arrays.copyOf(iArr, A002);
            0qQ.A07(iArr);
            b0o.A01 = iArr;
        }
        int i3 = b0o.A00;
        b0o.A00 = i3 + 1;
        iArr[i3] = ANy;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r6, int i) {
        int[] iArr = ((C360328eP) obj).A00;
        0qQ.A0B(r6, 0);
        for (int i2 = 0; i2 < i; i2++) {
            r6.AS1(this.A00, i2).AS2(iArr[i2]);
        }
    }
}
