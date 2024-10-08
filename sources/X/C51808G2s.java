package X;

import java.util.Map;

/* renamed from: X.G2s  reason: case insensitive filesystem */
public final class C51808G2s extends 0Yg implements 0sP {
    public static final C51808G2s A00 = new C51808G2s();

    public C51808G2s() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        0qQ.A0B(entry, 0);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("  ");
        A1A.append(((AnonymousClass5Ka) entry.getKey()).A00);
        A1A.append(" = ");
        return AnonymousClass7TF.A0i(entry.getValue(), A1A);
    }
}
