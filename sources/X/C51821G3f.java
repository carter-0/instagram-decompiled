package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.G3f  reason: case insensitive filesystem */
public final class C51821G3f extends 0Yg implements 0sP {
    public static final C51821G3f A00 = new C51821G3f();

    public C51821G3f() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        DdY ddY = (DdY) obj;
        0qQ.A0B(ddY, 0);
        List list = ddY.A0F;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (C46518DgL.A1a != ((C283155Gi) next).A04.A1D.getValue()) {
                A1C.add(next);
            }
        }
        return DdY.A00((C376619Ir) null, (JV5) null, (C53380GnA) null, (C61008Jv7) null, ddY, (Integer) null, A1C, (List) null, (List) null, 131069);
    }
}
