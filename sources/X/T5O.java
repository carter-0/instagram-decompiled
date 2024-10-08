package X;

public final class T5O implements C13748TgK {
    public C13748TgK[] A00;

    public final boolean Ccs(Class cls) {
        for (C13748TgK Ccs : this.A00) {
            if (Ccs.Ccs(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C10705Rwj CoI(Class cls) {
        for (C13748TgK tgK : this.A00) {
            if (tgK.Ccs(cls)) {
                return tgK.CoI(cls);
            }
        }
        throw AnonymousClass7TE.A1B(Pxf.A0e(cls, "No factory is available for message type: "));
    }
}
