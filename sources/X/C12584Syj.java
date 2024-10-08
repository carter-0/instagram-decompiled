package X;

/* renamed from: X.Syj  reason: case insensitive filesystem */
public final class C12584Syj implements C13743TgF {
    public final C13743TgF[] A00;

    public C12584Syj(C13743TgF... tgFArr) {
        this.A00 = tgFArr;
    }

    public final C13786Th1 FPE(Class cls) {
        int i = 0;
        do {
            C13743TgF tgF = this.A00[i];
            if (tgF.FPQ(cls)) {
                return tgF.FPE(cls);
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
