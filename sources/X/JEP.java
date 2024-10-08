package X;

public final class JEP extends 0Yg implements 0sL {
    public static final JEP A00 = new JEP();

    public JEP() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C52849Gdi A002 = I63.A00((AnonymousClass5R6) obj);
        int ordinal = ((AnonymousClass5Q8) obj2).ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw AnonymousClass7TE.A1K();
        }
        A002.setLayoutDirection(i);
        return C60340gF.A00;
    }
}
