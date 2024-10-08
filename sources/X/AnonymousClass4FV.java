package X;

/* renamed from: X.4FV  reason: invalid class name */
public final class AnonymousClass4FV extends 0Yg implements 0sP {
    public static final AnonymousClass4FV A00 = new AnonymousClass4FV();

    public AnonymousClass4FV() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        int intValue = ((Number) obj).intValue();
        if (intValue < 0) {
            i = 10;
        } else {
            i = 5;
            if (intValue == 0) {
                i = 1;
            }
        }
        return Integer.valueOf(i);
    }
}
