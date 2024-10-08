package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.Pqf  reason: case insensitive filesystem */
public final class C74199Pqf extends 0Yg implements 0sL {
    public static final C74199Pqf A00 = new C74199Pqf();

    public C74199Pqf() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        OKP okp = (OKP) obj2;
        OKP okp2 = (OKP) ((0eP) obj).A01;
        0qQ.A0A(okp);
        AnonymousClass7TG.A1N(okp2, okp);
        List A002 = okp2.A00();
        List<C232262tL> A003 = okp.A00();
        HashSet A1F = AnonymousClass7TE.A1F();
        ArrayList A0r = AnonymousClass7TG.A0r(A003);
        for (C232262tL key : A003) {
            Object key2 = key.getKey();
            0qQ.A07(key2);
            DbY.A1U(key2, A1F, A0r);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A002) {
            DbV.A1U(next, A1C, A1F.contains(((C232262tL) next).getKey()) ? 1 : 0);
        }
        return AnonymousClass7TE.A1L(A1C, okp);
    }
}
