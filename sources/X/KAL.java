package X;

import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.util.Collection;
import java.util.Iterator;

public final class KAL extends 1P0 {
    public final Collection A00;
    public final Collection A01;
    public final /* synthetic */ K68 A02;

    public KAL(K68 k68, Collection collection, Collection collection2) {
        AnonymousClass7TG.A1Q(collection, collection2);
        this.A02 = k68;
        this.A00 = collection;
        this.A01 = collection2;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-136020972);
        K68 k68 = this.A02;
        11Z.A03(new C65846M1m(k68));
        C59689JTv.A03(k68.requireContext(), k68.getString(2131975944), "HighlightsReel_unknown_error_occured", 0);
        AnonymousClass0fD.A0A(1792436694, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(124185373);
        K14 k14 = (K14) obj;
        int A032 = AnonymousClass0fD.A03(787934861);
        0qQ.A0B(k14, 0);
        K68 k68 = this.A02;
        11Z.A03(new C65846M1m(k68));
        if (k14.A00 != null) {
            AnonymousClass0eM r8 = k68.A0A;
            if (!AnonymousClass7TF.A1Z(r8)) {
                DbZ.A0w(k68.requireContext(), k68, 2131963475);
            }
            AnonymousClass0eM r7 = k68.A0C;
            ReelStore A05 = 1OP.A05(AnonymousClass7TE.A0l(r7));
            AnonymousClass3HX r1 = k14.A00;
            if (r1 != null) {
                Reel A0I = A05.A0I(r1, true);
                if (AnonymousClass7TF.A1Z(r8)) {
                    A05.A0c(DbS.A0t(k68.A0B));
                }
                Iterator it = this.A00.iterator();
                while (it.hasNext()) {
                    C51966G9m.A0t(it).A4E(DbS.A0t(k68.A0B));
                }
                Iterator it2 = this.A01.iterator();
                while (it2.hasNext()) {
                    C51966G9m.A0t(it2).A4F(DbS.A0t(k68.A0B));
                }
                DbX.A0R(r7).A05(new AnonymousClass376(A0I));
                k68.requireActivity().setResult(-1);
                DbT.A1K(k68);
            } else {
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0A(-921607039, A032);
                throw A0y;
            }
        } else {
            C59689JTv.A03(k68.requireContext(), k68.getString(2131975944), "HighlightsReel_unknown_error_occured", 0);
        }
        AnonymousClass0fD.A0A(-1495505383, A032);
        AnonymousClass0fD.A0A(850238905, A03);
    }
}
