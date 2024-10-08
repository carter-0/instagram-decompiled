package X;

import java.util.List;

/* renamed from: X.IXp  reason: case insensitive filesystem */
public final class C57332IXp implements C228812mN {
    public final Integer Ahi(Object obj) {
        1Xj r2;
        0qQ.A0B(obj, 0);
        if (obj instanceof GV8) {
            r2 = ((AnonymousClass3OA) obj).A0K;
        } else if (!(obj instanceof 1Xj)) {
            return null;
        } else {
            r2 = (1Xj) obj;
        }
        return r2.A2I();
    }

    public final Integer Ahl(Object obj) {
        1Xj r2;
        0qQ.A0B(obj, 0);
        if (obj instanceof GV8) {
            r2 = ((AnonymousClass3OA) obj).A0K;
        } else if (!(obj instanceof 1Xj)) {
            return null;
        } else {
            r2 = (1Xj) obj;
        }
        return r2.A2J();
    }

    public final String BEb(Object obj) {
        String str;
        0qQ.A0B(obj, 0);
        if (obj instanceof GV8) {
            str = ((AnonymousClass3OA) obj).A0K.getId();
            if (str == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (obj instanceof 1Xj) {
            str = C51966G9m.A1E(obj);
            if (str == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to getIdFromItem due to unsupported type: ");
            Class<?> cls = obj.getClass();
            0wb.A03("DiscoveryChainingModelIdentifier", AnonymousClass7TF.A0i(DbS.A0z(cls), A1A));
            throw AnonymousClass7TE.A1B(AnonymousClass7TF.A0i(DbS.A0z(cls), AnonymousClass7TF.A0n("Failed to getIdFromItem due to unsupported type: ")));
        }
        return str;
    }

    public final String BJS(Object obj) {
        0qQ.A0B(obj, 0);
        return BEb(obj);
    }

    public final boolean CVw(Object obj) {
        return false;
    }

    public final boolean CVx(Object obj) {
        return false;
    }

    public final boolean CVy(Object obj) {
        0qQ.A0B(obj, 0);
        if (obj instanceof GV8) {
            return true;
        }
        if (obj instanceof 1Xj) {
            return C51966G9m.A1Y(obj);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Failed to check isItemSponsored due to unsupported type: ");
        0wb.A03("DiscoveryChainingModelIdentifier", AnonymousClass7TF.A0i(C51969G9p.A0x(obj), A1A));
        return false;
    }

    public final /* bridge */ /* synthetic */ C271744jW AMS(Object obj) {
        GV8 gv8 = (GV8) obj;
        0qQ.A0B(gv8, 0);
        return new C54451HEf(gv8);
    }

    public final /* synthetic */ boolean ACJ(Object obj, Object obj2) {
        return false;
    }

    public final /* synthetic */ boolean ACN(Object obj, Object obj2) {
        return false;
    }

    public final /* bridge */ /* synthetic */ int AZx(Object obj) {
        return AnonymousClass7TF.A1V(obj) ? 1 : 0;
    }

    public final /* bridge */ /* synthetic */ String BEZ(Object obj) {
        return C51969G9p.A0m(obj).A0S;
    }

    public final /* bridge */ /* synthetic */ boolean CcL(Object obj) {
        return AnonymousClass7TF.A1V(obj);
    }

    public final /* synthetic */ int AZD(Object obj) {
        return -1;
    }

    public final /* synthetic */ List BUO(Object obj) {
        return 0sn.A00;
    }

    public final /* bridge */ /* synthetic */ Integer BUT(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ 1Pi BXm(Object obj) {
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean CXm(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CYA(Object obj) {
        return false;
    }

    public final /* bridge */ /* synthetic */ boolean CcM(Object obj) {
        return false;
    }
}
