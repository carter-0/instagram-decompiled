package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8eD  reason: invalid class name and case insensitive filesystem */
public final class C360208eD extends C2592040u implements C255463uA {
    public static final C360208eD A00 = new C360208eD();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new char[0];
    }

    public C360208eD() {
        super(C360188eB.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        char[] cArr = (char[]) obj;
        0qQ.A0B(cArr, 0);
        return cArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0I, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        char[] cArr = (char[]) obj;
        0qQ.A0B(cArr, 0);
        ? obj2 = new Object();
        obj2.A01 = cArr;
        int length = cArr.length;
        obj2.A00 = length;
        if (length < 10) {
            int i = length * 2;
            int i2 = 10;
            if (10 < i) {
                i2 = i;
            }
            char[] copyOf = Arrays.copyOf(cArr, i2);
            0qQ.A07(copyOf);
            obj2.A01 = copyOf;
        }
        return obj2;
    }

    public final /* bridge */ /* synthetic */ void A06(Object obj, C2590240b r6, int i, boolean z) {
        B0I b0i = (B0I) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0i, 2);
        char ANm = r6.ANm(this.A00, i);
        int A002 = b0i.A00() + 1;
        char[] cArr = b0i.A01;
        int length = cArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            cArr = Arrays.copyOf(cArr, A002);
            0qQ.A07(cArr);
            b0i.A01 = cArr;
        }
        int i3 = b0i.A00;
        b0i.A00 = i3 + 1;
        cArr[i3] = ANm;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r7, int i) {
        char[] cArr = (char[]) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(cArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = this.A00;
            char c = cArr[i2];
            AnonymousClass488 r1 = (AnonymousClass488) r7;
            0qQ.A0B(serialDescriptor, 0);
            r1.A00(serialDescriptor, i2);
            r1.ARv(c);
        }
    }
}
