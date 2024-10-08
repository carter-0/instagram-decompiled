package X;

import java.util.Arrays;

/* renamed from: X.8eX  reason: invalid class name and case insensitive filesystem */
public final class C360408eX extends C2592040u implements C255463uA {
    public static final C360408eX A00 = new C360408eX();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new C360398eW(new short[0]);
    }

    public C360408eX() {
        super(C360388eV.A01);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C360398eW) obj).A00.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0Q, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        short[] sArr = ((C360398eW) obj).A00;
        ? obj2 = new Object();
        obj2.A01 = sArr;
        int length = sArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r6, int i, boolean z) {
        B0Q b0q = (B0Q) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0q, 2);
        short AO7 = r6.ANx(this.A00, i).AO7();
        int A002 = b0q.A00() + 1;
        short[] sArr = b0q.A01;
        int length = sArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            sArr = Arrays.copyOf(sArr, A002);
            0qQ.A07(sArr);
            b0q.A01 = sArr;
        }
        int i3 = b0q.A00;
        b0q.A00 = i3 + 1;
        sArr[i3] = AO7;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r6, int i) {
        short[] sArr = ((C360398eW) obj).A00;
        0qQ.A0B(r6, 0);
        for (int i2 = 0; i2 < i; i2++) {
            r6.AS1(this.A00, i2).ASA(sArr[i2]);
        }
    }
}
