package X;

public final class T5G implements C13747TgJ {
    public C13747TgJ[] A00;

    public final boolean Ccs(Class cls) {
        for (C13747TgJ Ccs : this.A00) {
            if (Ccs.Ccs(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C10704Rwi CoH(Class cls) {
        for (C13747TgJ tgJ : this.A00) {
            if (tgJ.Ccs(cls)) {
                return tgJ.CoH(cls);
            }
        }
        throw AnonymousClass7TE.A1B(Pxf.A0e(cls, "No factory is available for message type: "));
    }
}
