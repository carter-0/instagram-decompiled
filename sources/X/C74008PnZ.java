package X;

import java.util.Map;

/* renamed from: X.PnZ  reason: case insensitive filesystem */
public final class C74008PnZ extends 0Yg implements 0sP {
    public static final C74008PnZ A00 = new C74008PnZ();

    public C74008PnZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        StringBuilder A0l = C51975G9x.A0l(entry);
        A0l.append("'<cls>");
        A0l.append(((Class) entry.getKey()).getName());
        A0l.append("</cls>':");
        return AnonymousClass7TF.A0i(entry.getValue(), A0l);
    }
}
