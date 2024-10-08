package X;

/* renamed from: X.9Cb  reason: invalid class name and case insensitive filesystem */
public final class C375059Cb implements Runnable {
    public final /* synthetic */ AnonymousClass1I8 A00;

    public C375059Cb(AnonymousClass1I8 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass1I8 r10 = this.A00;
        for (int i : r10.A05.A04) {
            AnonymousClass1Hv r6 = (AnonymousClass1Hv) r10.A00.get(i);
            if (r6 != null) {
                for (C375039Bz r1 : r6.A07) {
                    try {
                        AnonymousClass1Hv.A00(r6, r1);
                    } catch (Error | Exception e) {
                        14y r0 = r6.A06;
                        int i2 = r1.A04;
                        14y.A01(r0, e);
                        r0.A00.Ew3(14y.A00("BoosterInitializationWithException", e.getMessage(), i2), e);
                    }
                }
            }
        }
    }
}
