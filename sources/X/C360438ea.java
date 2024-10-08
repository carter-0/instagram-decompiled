package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.8ea  reason: invalid class name and case insensitive filesystem */
public final class C360438ea extends C2592040u implements C255463uA {
    public static final C360438ea A00 = new C360438ea();

    public final /* bridge */ /* synthetic */ Object A08() {
        return new byte[0];
    }

    public C360438ea() {
        super(C360418eY.A00);
    }

    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        byte[] bArr = (byte[]) obj;
        0qQ.A0B(bArr, 0);
        return bArr.length;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.B0H, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        byte[] bArr = (byte[]) obj;
        0qQ.A0B(bArr, 0);
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
        B0H b0h = (B0H) obj;
        0qQ.A0B(r6, 0);
        0qQ.A0B(b0h, 2);
        byte ANk = r6.ANk(this.A00, i);
        int A002 = b0h.A00() + 1;
        byte[] bArr = b0h.A01;
        int length = bArr.length;
        if (length < A002) {
            int i2 = length * 2;
            if (A002 < i2) {
                A002 = i2;
            }
            bArr = Arrays.copyOf(bArr, A002);
            0qQ.A07(bArr);
            b0h.A01 = bArr;
        }
        int i3 = b0h.A00;
        b0h.A00 = i3 + 1;
        bArr[i3] = ANk;
    }

    public final /* bridge */ /* synthetic */ void A09(Object obj, AnonymousClass484 r7, int i) {
        byte[] bArr = (byte[]) obj;
        0qQ.A0B(r7, 0);
        0qQ.A0B(bArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            SerialDescriptor serialDescriptor = this.A00;
            byte b = bArr[i2];
            AnonymousClass488 r1 = (AnonymousClass488) r7;
            0qQ.A0B(serialDescriptor, 0);
            r1.A00(serialDescriptor, i2);
            r1.ARu(b);
        }
    }
}
