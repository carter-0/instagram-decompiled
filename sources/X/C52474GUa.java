package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GUa  reason: case insensitive filesystem */
public final class C52474GUa implements 27S {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C52474GUa(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C57066INg iNg = (C57066INg) obj;
        0qQ.A0B(iNg, 0);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A0E(iNg.A00);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(909479876);
        C57066INg iNg = (C57066INg) obj;
        int A0D = AnonymousClass7TG.A0D(iNg, -2036541997);
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        hdb.Cs9(iNg.A00);
        AnonymousClass0fD.A0A(1689138367, A0D);
        AnonymousClass0fD.A0A(837764033, A03);
    }
}
