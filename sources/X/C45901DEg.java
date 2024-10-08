package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.DEg  reason: case insensitive filesystem */
public final class C45901DEg implements 1MD {
    public static final C45901DEg A00 = new C45901DEg();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr A03;
        ImmutableList A06;
        C250663lr A01;
        C250663lr A02 = ((C250663lr) obj).A02(C42193BUo.class, "pay_financial_entity_wrapper(id:$id)", 1158022666);
        if (A02 == null || (A03 = A02.A03(C42192BUn.class, "payout_records(after:$after,batch_item_id:$batch_item_id,first:$first)", 1636922197)) == null || (A06 = A03.A06(C42191BUm.class, "edges", 1387448488)) == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            C250663lr A032 = C41845B3m.A0V(it).A03(C42190BUl.class, "node", 70020053);
            if (!(A032 == null || (A01 = A032.A01(QV6.class, -173343578)) == null)) {
                A1C.add(A01);
            }
        }
        return ImmutableList.copyOf((Collection) A1C);
    }
}
