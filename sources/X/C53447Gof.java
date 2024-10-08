package X;

import com.instagram.api.schemas.LimitedInteractionsVersions;

/* renamed from: X.Gof  reason: case insensitive filesystem */
public final class C53447Gof extends AnonymousClass0T0 implements C59633JRb {
    public final C294475mW A00;
    public final C53446Goe A01;
    public final LimitedInteractionsVersions A02;
    public final Boolean A03;
    public final Long A04;
    public final Long A05;

    public C53447Gof(C294475mW r2, C53446Goe goe, LimitedInteractionsVersions limitedInteractionsVersions, Boolean bool, Long l, Long l2) {
        DbW.A1O(goe, 3, limitedInteractionsVersions);
        this.A03 = bool;
        this.A00 = r2;
        this.A01 = goe;
        this.A04 = l;
        this.A05 = l2;
        this.A02 = limitedInteractionsVersions;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53447Gof) {
                C53447Gof gof = (C53447Gof) obj;
                if (!0qQ.A0K(this.A03, gof.A03) || !0qQ.A0K(this.A00, gof.A00) || !0qQ.A0K(this.A01, gof.A01) || !0qQ.A0K(this.A04, gof.A04) || !0qQ.A0K(this.A05, gof.A05) || this.A02 != gof.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C53446Goe goe = this.A01;
        return AnonymousClass7TE.A0N(this.A02, (((AnonymousClass7TF.A07(goe, ((AnonymousClass7TG.A0C(this.A03) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31);
    }
}
