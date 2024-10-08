package X;

import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.List;

/* renamed from: X.GcO  reason: case insensitive filesystem */
public final class C52771GcO implements JRI {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final void Dex(String str, String str2, List list, boolean z, boolean z2) {
        0qQ.A0B(list, 1);
        if (z2) {
            HDB hdb = this.A00.A0N;
            if (hdb != null) {
                hdb.A05();
            }
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HDB hdb2 = contextualFeedFragment.A0N;
        if (hdb2 != null) {
            if (hdb2 instanceof C52766GcJ) {
                C52766GcJ gcJ = (C52766GcJ) hdb2;
                ((AnonymousClass2rW) gcJ.A00).A0A(list);
                C52766GcJ.A00(gcJ);
            }
            C51974G9v.A1D(contextualFeedFragment);
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public C52771GcO(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void A8o(List list) {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        GAR gar = contextualFeedFragment.A0B;
        if (gar == null) {
            str = "contextualFeedController";
        } else {
            boolean A0a = gar.A0a();
            str = "adapter";
            HDB hdb = contextualFeedFragment.A0N;
            if (A0a) {
                if (hdb != null) {
                    if (!(hdb instanceof GAP)) {
                        ((AnonymousClass2rW) hdb.A00).A0A(list);
                        return;
                    }
                    return;
                }
            } else if (hdb != null) {
                if (hdb instanceof C52766GcJ) {
                    C52766GcJ gcJ = (C52766GcJ) hdb;
                    ((AnonymousClass2rW) gcJ.A00).A0A(list);
                    C52766GcJ.A00(gcJ);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void AVB(User user) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.A09(user);
        }
    }

    public final List AZL() {
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A03();
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3W1 BQs(Object obj) {
        1Xg r3 = (1Xg) obj;
        0qQ.A0B(r3, 0);
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj A0o = C51965G9l.A0o(r3);
        if (A0o != null) {
            return hdb.BQr(A0o);
        }
        throw AnonymousClass7TE.A0y();
    }

    public final AnonymousClass3W1 BQt(String str) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (hdb instanceof C52766GcJ) {
            return (AnonymousClass3W1) ((C52766GcJ) hdb).A0B.get(str);
        } else {
            return null;
        }
    }

    public final void Cs9(1Xj r2) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.Cs9(r2);
        }
    }

    public final void DEt(String str) {
        this.A00.A04("favorites_feed_nav_bar");
    }

    public final void DeI() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HDB hdb = contextualFeedFragment.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        hdb.Cs9((1Xj) null);
        C51974G9v.A1D(contextualFeedFragment);
    }

    public final void DeS() {
        C51974G9v.A1D(this.A00);
    }

    public final void Dei() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.Cs9((1Xj) null);
        }
    }

    public final /* bridge */ /* synthetic */ void EDn(Object obj) {
        1Xg r3 = (1Xg) obj;
        0qQ.A0B(r3, 0);
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else if (!(hdb instanceof GAP)) {
            C52766GcJ gcJ = (C52766GcJ) hdb;
            ((AnonymousClass2rW) gcJ.A00).A0C(r3);
            C52766GcJ.A00(gcJ);
        }
    }

    public final void FIY(String str) {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.A0A(str);
        }
    }

    public final void FK4() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.FK4();
        }
    }
}
