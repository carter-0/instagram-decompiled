package X;

import com.instagram.api.schemas.OpenDraftGalleryCommand;
import com.instagram.api.schemas.OpenInspirationHubCommand;

/* renamed from: X.Goj  reason: case insensitive filesystem */
public final class C53451Goj extends AnonymousClass0T0 implements C59653JRv {
    public final C53455Gon A00;
    public final JSB A01;
    public final JSC A02;
    public final JSD A03;
    public final OpenDraftGalleryCommand A04;
    public final JS7 A05;
    public final OpenInspirationHubCommand A06;
    public final C53459Gor A07;
    public final Boolean A08;
    public final String A09;
    public final String A0A;
    public final Boolean A0B;

    public final C53451Goj F6J() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53451Goj) {
                C53451Goj goj = (C53451Goj) obj;
                if (!0qQ.A0K(this.A0B, goj.A0B) || !0qQ.A0K(this.A00, goj.A00) || !0qQ.A0K(this.A01, goj.A01) || !0qQ.A0K(this.A02, goj.A02) || !0qQ.A0K(this.A03, goj.A03) || !0qQ.A0K(this.A04, goj.A04) || !0qQ.A0K(this.A05, goj.A05) || !0qQ.A0K(this.A06, goj.A06) || !0qQ.A0K(this.A07, goj.A07) || !0qQ.A0K(this.A09, goj.A09) || !0qQ.A0K(this.A0A, goj.A0A) || !0qQ.A0K(this.A08, goj.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((((((AnonymousClass7TG.A0C(this.A0B) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TE.A0L(this.A08);
    }

    public C53451Goj(C53455Gon gon, JSB jsb, JSC jsc, JSD jsd, OpenDraftGalleryCommand openDraftGalleryCommand, JS7 js7, OpenInspirationHubCommand openInspirationHubCommand, C53459Gor gor, Boolean bool, Boolean bool2, String str, String str2) {
        this.A0B = bool;
        this.A00 = gon;
        this.A01 = jsb;
        this.A02 = jsc;
        this.A03 = jsd;
        this.A04 = openDraftGalleryCommand;
        this.A05 = js7;
        this.A06 = openInspirationHubCommand;
        this.A07 = gor;
        this.A09 = str;
        this.A0A = str2;
        this.A08 = bool2;
    }
}
