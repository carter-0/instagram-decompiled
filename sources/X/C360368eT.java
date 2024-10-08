package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8eT  reason: invalid class name and case insensitive filesystem */
public final class C360368eT extends C2592040u implements C255463uA {
    public static final C360368eT A00 = new C360368eT();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new short[0];
    }

    public C360368eT() {
        super(C360348eR.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        short[] sArr = (short[]) obj;
        0qQ.A0B(sArr, 0);
        return sArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0M, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        short[] sArr = (short[]) obj;
        0qQ.A0B(sArr, 0);
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
        B0M b0m = (B0M) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0m, 2);
        short AO8 = r6.AO8(this.A00, i);
        int A002 = b0m.A00() + 1;
        short[] sArr = b0m.A01;
        int length = sArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            sArr = Arrays.copyOf(sArr, A002);
            0qQ.A07(sArr);
            b0m.A01 = sArr;
        }
        int i3 = b0m.A00;
        b0m.A00 = i3 + 1;
        sArr[i3] = AO8;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r7, int i) {
        short[] sArr = (short[]) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(sArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = this.A00;
            short s = sArr[i2];
            AnonymousClass488 r1 = (AnonymousClass488) r7;
            0qQ.A0B(serialDescriptor, 0);
            r1.A00(serialDescriptor, i2);
            r1.ASA(s);
        }
    }
}
