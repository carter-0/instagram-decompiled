package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUX implements 27S {
    public final /* synthetic */ ContextualFeedFragment A00;

    public GUX(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        C57067INh iNh = (C57067INh) obj;
        0qQ.A0B(iNh, 0);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A0E(iNh.A00);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-486729371);
        C57067INh iNh = (C57067INh) obj;
        int A0D = AnonymousClass7TG.A0D(iNh, -1171131515);
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        hdb.notifyItemChanged(iNh.A00);
        AnonymousClass0fD.A0A(-849504462, A0D);
        AnonymousClass0fD.A0A(-1083560314, A03);
    }
}
