package X;

import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.40u  reason: invalid class name and case insensitive filesystem */
public abstract class C2592040u extends AnonymousClass40B {
    public final SerialDescriptor A00;

    public Object A08() {
        return new float[0];
    }

    public void A09(Object obj, AnonymousClass484 r5, int i) {
        float[] fArr = (float[]) obj;
        0qQ.A0B(r5, 0);
        0qQ.A0B(fArr, 1);
        for (int i2 = 0; i2 < i; i2++) {
            r5.ARz(this.A00, fArr[i2], i2);
        }
    }

    public C2592040u(C255463uA r3) {
        super(r3);
        this.A00 = new C2592340x(r3.getDescriptor());
    }
}
