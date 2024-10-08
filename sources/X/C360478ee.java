package X;

import java.util.Arrays;

/* renamed from: X.8ee  reason: invalid class name and case insensitive filesystem */
public final class C360478ee extends C2592040u implements C255463uA {
    public static final C360478ee A00 = new C360478ee();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new C360468ed(new byte[0]);
    }

    public C360478ee() {
        super(C360458ec.A01);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        return ((C360468ed) obj).A00.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0N, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        byte[] bArr = ((C360468ed) obj).A00;
        ? obj2 = new Object();
        obj2.A01 = bArr;
        int length = bArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r6, int i, boolean z) {
        B0N b0n = (B0N) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0n, 2);
        byte ANj = r6.ANx(this.A00, i).ANj();
        int A002 = b0n.A00() + 1;
        byte[] bArr = b0n.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            0qQ.A07(bArr);
            b0n.A01 = bArr;
        }
        int i3 = b0n.A00;
        b0n.A00 = i3 + 1;
        bArr[i3] = ANj;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r6, int i) {
        byte[] bArr = ((C360468ed) obj).A00;
        0qQ.A0B(r6, 0);
        for (int i2 = 0; i2 < i; i2++) {
            r6.AS1(this.A00, i2).ARu(bArr[i2]);
        }
    }
}
