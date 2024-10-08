package X;

/* renamed from: X.5WZ  reason: invalid class name */
public final class AnonymousClass5WZ implements AnonymousClass5Wa {
    public static Boolean A00;
    public static final AnonymousClass5WZ A01 = new Object();

    public final /* synthetic */ void EVU(0sP r1) {
    }

    public final /* synthetic */ void EVe(0sP r1) {
    }

    public final boolean AkA() {
        Boolean bool = A00;
        if (bool != null) {
            return bool.booleanValue();
        }
        I2E.A02("canFocus is read before it is written");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EQj(boolean z) {
        A00 = Boolean.valueOf(z);
    }
}
