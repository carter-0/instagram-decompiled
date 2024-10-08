package X;

/* renamed from: X.5UR  reason: invalid class name */
public final class AnonymousClass5UR extends 0Yg implements 0sP {
    public static final AnonymousClass5UR A00 = new AnonymousClass5UR();

    public AnonymousClass5UR() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long intValue;
        if (0qQ.A0K(obj, false)) {
            intValue = AnonymousClass5RW.A08;
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((long) ((Number) obj).intValue()) << 32;
        }
        return new AnonymousClass5RW(intValue);
    }
}
