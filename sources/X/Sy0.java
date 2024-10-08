package X;

public final class Sy0 implements C13742TgE {
    public final C13742TgE[] A00;

    public Sy0(C13742TgE... tgEArr) {
        this.A00 = tgEArr;
    }

    public final C13474Tb1 FPD(Class cls) {
        int i = 0;
        do {
            C13742TgE tgE = this.A00[i];
            if (tgE.FPQ(cls)) {
                return tgE.FPD(cls);
            }
            i++;
        } while (i < 2);
        throw AnonymousClass7TE.A1B("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean FPQ(Class cls) {
        int i = 0;
        while (!this.A00[i].FPQ(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
