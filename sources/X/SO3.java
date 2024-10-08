package X;

public final class SO3 {
    public static SO3 A01;
    public static final Object A02 = Pxe.A0p();
    public C3734895r A00;

    public static SO3 A00() {
        SO3 so3;
        synchronized (A02) {
            AnonymousClass3Qk.A09(AnonymousClass7TF.A1V(A01), "MlKitContext has not been initialized");
            so3 = A01;
            AnonymousClass3Qk.A02(so3);
        }
        return so3;
    }

    public final Object A01(Class cls) {
        AnonymousClass3Qk.A09(AnonymousClass7TF.A1W(A01, this), "MlKitContext has been deleted");
        C3734895r r0 = this.A00;
        AnonymousClass3Qk.A02(r0);
        return r0.A03(cls);
    }
}
