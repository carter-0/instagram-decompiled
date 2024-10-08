package X;

public abstract class JVB {
    public static final AnonymousClass5GP A00(AnonymousClass5GP r1, Object obj) {
        if (r1 instanceof AnonymousClass5GO) {
            return AnonymousClass5GO.A00;
        }
        if (r1 instanceof AnonymousClass5GR) {
            return new AnonymousClass5GR(obj);
        }
        if (r1 instanceof AnonymousClass5GQ) {
            if (obj != null) {
                return new AnonymousClass5GQ(obj);
            }
            return new AnonymousClass5GQ(((AnonymousClass5GQ) r1).A00);
        } else if (r1 instanceof KWO) {
            return new KWO(obj, ((KWO) r1).A00);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
