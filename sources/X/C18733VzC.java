package X;

import android.content.Context;

/* renamed from: X.VzC  reason: case insensitive filesystem */
public final class C18733VzC {
    public static C18733VzC A04;
    public final AnonymousClass1Sl A00;
    public final VLZ A01;
    public final C17736Vd5 A02;
    public final C17309VQo A03;

    public static synchronized void A00(Context context) {
        Class<C18733VzC> cls = C18733VzC.class;
        synchronized (cls) {
            AnonymousClass1Sz.A00();
            C17736Vd5 vd5 = new C17736Vd5(new VUf(context));
            if (A04 != null) {
                0I1.A00(cls, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            A04 = new C18733VzC(vd5);
            AnonymousClass1Sz.A00();
        }
    }

    public static synchronized boolean A01() {
        boolean A1V;
        synchronized (C18733VzC.class) {
            A1V = AnonymousClass7TF.A1V(A04);
        }
        return A1V;
    }

    public C18733VzC(C17736Vd5 vd5) {
        AnonymousClass1Sz.A00();
        this.A02 = vd5;
        this.A03 = new C17309VQo(((C64731Tf) vd5.A04).A02);
        this.A01 = new VLZ(vd5.A06);
        AnonymousClass1Sz.A00();
        this.A00 = vd5.A02;
    }
}
