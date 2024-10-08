package X;

import java.util.Map;

/* renamed from: X.Pgj  reason: case insensitive filesystem */
public final /* synthetic */ class C73608Pgj extends 03J implements 0sL {
    public static final C73608Pgj A00 = new C73608Pgj();

    public C73608Pgj() {
        super(2, C70364O3q.class, "rsysAppModelReducer", "rsysAppModelReducer(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;Ljava/lang/Object;)Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        N4A n4a = (N4A) obj;
        boolean A1Z = AnonymousClass7TG.A1Z(n4a, obj2);
        if (!(obj2 instanceof C69662Npk)) {
            return n4a;
        }
        Map map = n4a.A01;
        0qQ.A0B(map, A1Z ? 1 : 0);
        return new N4A((C69662Npk) obj2, map);
    }
}
