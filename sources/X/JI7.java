package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;

public final class JI7 extends 0Yg implements 0sK {
    public static final JI7 A00 = new JI7();

    public JI7() {
        super(3);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C268004cb r8 = (C268004cb) obj;
        C268074ci r9 = (C268074ci) obj2;
        long j = ((Constraints) obj3).A00;
        AnonymousClass7TG.A1N(r8, r9);
        Modifier modifier = C55311Hfe.A00;
        int EJS = r8.EJS(22.0f);
        int A02 = Constraints.A02(j) + EJS;
        int A002 = Constraints.A00(j);
        int i = 0;
        if (A002 != Integer.MAX_VALUE) {
            i = EJS;
        }
        C267974cY Cnz = r9.Cnz(Constraints.A04(Constraints.A03(j), Constraints.A01(j), A02, A002 + i));
        return C51969G9p.A0a(r8, new C58735Iwi(EJS, 7, Cnz), Cnz.A01, Cnz.A00 - EJS);
    }
}
