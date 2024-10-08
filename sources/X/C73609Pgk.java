package X;

import java.util.LinkedHashMap;

/* renamed from: X.Pgk  reason: case insensitive filesystem */
public final /* synthetic */ class C73609Pgk extends 03J implements 0sL {
    public static final C73609Pgk A00 = new C73609Pgk();

    public C73609Pgk() {
        super(2, C70364O3q.class, "rpReducerAggregator", "rpReducerAggregator(Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;Ljava/lang/Object;)Lcom/facebook/rp/platform/statemanagement/rpstate/RpState;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C70404O5h o5h;
        N4A n4a = (N4A) obj;
        AnonymousClass7TG.A1N(n4a, obj2);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        0qQ.A07(C70366O3s.A00);
        Class<C70404O5h> cls = C70404O5h.class;
        Object A002 = n4a.A00(cls);
        if (A002 == null) {
            o5h = null;
            if (!(obj2 instanceof OSS)) {
                if (obj2 instanceof C70404O5h) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            o5h = NCJ.A00;
        } else if (A002 instanceof C70404O5h) {
            C70404O5h o5h2 = (C70404O5h) A002;
            if (!(obj2 instanceof OSS)) {
                o5h = o5h2;
                if (obj2 instanceof C70404O5h) {
                    if (o5h2 == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    } else if (o5h2.A00) {
                        C71004OWb oWb = C71004OWb.A00;
                        StringBuilder A0n = AnonymousClass7TF.A0n("MultiCallState update received while in terminal state. Update: ");
                        A0n.append(obj2);
                        oWb.A00("MultiCallReducer", AnonymousClass7TG.A0m(o5h2, " | current: ", A0n));
                        o5h = o5h2;
                    } else {
                        o5h = obj2;
                    }
                }
            }
            o5h = NCJ.A00;
        } else {
            throw AnonymousClass7TE.A0z("Incorrect class passed to reducer.  Relying on RpStore to maintain class<>instance map - check this c ode");
        }
        A1H.put(cls, o5h);
        return new N4A(n4a.A00, 0Yt.A0B(A1H));
    }
}
