package X;

import com.google.common.collect.ImmutableList;

public final class DGV implements AnonymousClass2hV {
    public static final DGV A00 = new DGV();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C45265CtU ctU;
        String str;
        C250663lr r10 = (C250663lr) obj;
        if (r10 != null) {
            try {
                C250663lr reinterpretRequired = r10.reinterpretRequired(0, BV1.class, -1284681296);
                ctU = new C45265CtU();
                Class<BV0> cls = BV0.class;
                if (reinterpretRequired.A03(cls, "transaction_hub_history_query(pagination:$pagination)", -1855094489) != null) {
                    str = reinterpretRequired.A03(cls, "transaction_hub_history_query(pagination:$pagination)", -1855094489).A08("last_transaction_index");
                } else {
                    str = null;
                }
                ctU.A01 = str;
                ImmutableList.Builder builder = new ImmutableList.Builder();
                if (reinterpretRequired.A03(cls, "transaction_hub_history_query(pagination:$pagination)", -1855094489) != null) {
                    C249803kO it = reinterpretRequired.A03(cls, "transaction_hub_history_query(pagination:$pagination)", -1855094489).getRequiredCompactedTreeListField(0, "transactions", C7796QXh.class, 1809617422).iterator();
                    while (it.hasNext()) {
                        C250663lr A0V = C41845B3m.A0V(it);
                        if (!(A0V.A09(Pxd.A00(83)) == null || A0V.A07(Pxd.A00(261)) == null || A0V.A08(Pxd.A00(848)) == null || A0V.A0A(Pxd.A00(904)) == null || A0V.getOptionalStringField(6, Pxd.A00(44)) == null || A0V.A0C(Pxd.A00(905)) == null)) {
                            builder.add(A0V);
                        }
                    }
                }
                ImmutableList build = builder.build();
                ctU.A00 = build;
                C11367SPk.A03(build, "transactions");
            } catch (ClassNotFoundException e) {
                throw C41845B3m.A0j(e);
            }
        } else {
            ctU = new C45265CtU();
        }
        return new C45887D9l(ctU);
    }
}
