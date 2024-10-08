package X;

import java.util.List;
import java.util.Set;

/* renamed from: X.WyZ  reason: case insensitive filesystem */
public final class C20762WyZ extends 0Yg implements 0sP {
    public static final C20762WyZ A00 = new C20762WyZ();

    public C20762WyZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C53382GnE gnE = (C53382GnE) obj;
        0qQ.A0B(gnE, 0);
        String str = gnE.A03;
        List list = (List) gnE.A02;
        Set set = (Set) gnE.A01;
        0qQ.A0B(str, 0);
        AnonymousClass7TF.A1B(list, 1, set);
        return new C53382GnE(str, list, set, false, true, false);
    }
}
