package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MlK  reason: case insensitive filesystem */
public final class C67285MlK {
    public static final long A05 = TimeUnit.SECONDS.toMillis(5);
    public int A00;
    public final C74257Prl A01;
    public final AnonymousClass34Y A02;
    public final C67286MlL A03 = new C67286MlL(this);
    public final List A04 = new ArrayList();

    public static void A00(C67285MlK mlK) {
        List list = mlK.A04;
        list.get(mlK.A00);
        if (list.size() > 1) {
            mlK.A00 = (mlK.A00 + 1) % list.size();
        }
    }

    public C67285MlK(C74257Prl prl, AnonymousClass34Y r3) {
        this.A02 = r3;
        this.A01 = prl;
    }
}
