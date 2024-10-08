package X;

/* renamed from: X.Wyq  reason: case insensitive filesystem */
public final class C20779Wyq extends 0Yg implements 0sP {
    public static final C20779Wyq A00 = new C20779Wyq();

    public C20779Wyq() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass2YQ r8 = (AnonymousClass2YQ) obj;
        0qQ.A0B(r8, 0);
        C17647Vbd vbd = (C17647Vbd) r8.A00(WEK.A00);
        if (vbd != null) {
            VX8 vx8 = vbd.A01;
            L8S l8s = vbd.A03;
            return new AnonymousClass6SY(vx8, vbd.A02, l8s, vbd.A04, vbd.A05, vbd.A06);
        }
        throw new IllegalStateException("No use case provider found");
    }
}
