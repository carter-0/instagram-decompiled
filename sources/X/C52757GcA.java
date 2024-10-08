package X;

import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.GcA  reason: case insensitive filesystem */
public final class C52757GcA implements C59609JQd {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C52757GcA(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final Set AZN() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (hdb instanceof GAP) {
            return AnonymousClass7TE.A1F();
        } else {
            return ((C52766GcJ) hdb).A0C;
        }
    }

    public final List AZO() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (hdb instanceof GAP) {
            return DbU.A0K(((GAP) hdb).A0C);
        } else {
            return ((C52766GcJ) hdb).A09;
        }
    }

    public final Set B5K() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (hdb instanceof GAP) {
            return AnonymousClass7TE.A1F();
        } else {
            return ((C52766GcJ) hdb).A0D;
        }
    }

    public final HashMap C8M() {
        if (this.A00.A0N != null) {
            return AnonymousClass7TE.A1E();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }
}
