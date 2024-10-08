package X;

/* renamed from: X.5Xj  reason: invalid class name and case insensitive filesystem */
public abstract class C286685Xj {
    public static final void A00(C286535Wu r4, int i, int i2) {
        int i3 = 1 << i;
        int i4 = r4.A03;
        if ((i4 & i3) == 0) {
            r4.A03 = i4 | i3;
            int[] iArr = r4.A05;
            int i5 = r4.A00;
            C286545Wv r0 = r4.A06[r4.A02 - 1];
            0qQ.A0A(r0);
            iArr[(i5 - r0.A00) + i] = i2;
            return;
        }
        C286545Wv r02 = r4.A06[r4.A02 - 1];
        0qQ.A0A(r02);
        C18086VlG.A01(002.A0R("Already pushed argument ", r02.A00(i)));
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C286535Wu r4, Object obj, int i) {
        int i2 = 1 << i;
        int i3 = r4.A04;
        if ((i3 & i2) == 0) {
            r4.A04 = i3 | i2;
            Object[] objArr = r4.A07;
            int i4 = r4.A01;
            C286545Wv r0 = r4.A06[r4.A02 - 1];
            0qQ.A0A(r0);
            objArr[(i4 - r0.A01) + i] = obj;
            return;
        }
        C286545Wv r02 = r4.A06[r4.A02 - 1];
        0qQ.A0A(r02);
        C18086VlG.A01(002.A0R("Already pushed argument ", r02.A01(i)));
        throw AnonymousClass00P.createAndThrow();
    }
}
