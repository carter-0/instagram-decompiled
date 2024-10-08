package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GUb  reason: case insensitive filesystem */
public final class C52475GUb implements 27S {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C52475GUb(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        FWN fwn = (FWN) obj;
        0qQ.A0B(fwn, 0);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A0E(fwn.A00);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(356425135);
        FWN fwn = (FWN) obj;
        int A0D = AnonymousClass7TG.A0D(fwn, -1539565521);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HDB hdb = contextualFeedFragment.A0N;
        if (hdb != null) {
            hdb.Cs9(fwn.A00);
            HDB hdb2 = contextualFeedFragment.A0N;
            if (hdb2 != null) {
                hdb2.AV9();
                AnonymousClass0fD.A0A(768002969, A0D);
                AnonymousClass0fD.A0A(-1595416584, A03);
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }
}
