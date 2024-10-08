package X;

/* renamed from: X.IYw  reason: case insensitive filesystem */
public final class C57365IYw implements AnonymousClass4lJ {
    public final int A00;
    public final Object A01;

    public C57365IYw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void EC5(AnonymousClass3DW r3) {
        if (this.A00 != 0) {
            r3.A00((IZ2) this.A01);
            return;
        }
        for (C233022up A002 : ((IZ1) this.A01).A01) {
            r3.A00(A002);
        }
    }

    public final void FJ5(AnonymousClass3DW r3) {
        if (this.A00 != 0) {
            r3.A01((IZ2) this.A01);
            return;
        }
        for (C233022up A012 : ((IZ1) this.A01).A01) {
            r3.A01(A012);
        }
    }
}
