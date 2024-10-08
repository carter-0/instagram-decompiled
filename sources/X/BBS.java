package X;

import com.instagram.api.schemas.ContextualAdResponseExtras;
import com.instagram.api.schemas.ContextualAdResponseOrganicInfo;
import java.util.List;

public final class BBS extends AnonymousClass0T0 {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BBS)) {
            return false;
        }
        BBS bbs = (BBS) obj;
        if (!0qQ.A0K(this.A00, bbs.A00) || !0qQ.A0K(this.A01, bbs.A01) || !0qQ.A0K(this.A08, bbs.A08) || !0qQ.A0K(this.A09, bbs.A09) || !0qQ.A0K(this.A05, bbs.A05) || !0qQ.A0K(this.A06, bbs.A06) || !0qQ.A0K(this.A02, bbs.A02) || !0qQ.A0K(this.A03, bbs.A03) || !0qQ.A0K(this.A07, bbs.A07) || !0qQ.A0K(this.A04, bbs.A04)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0E(this.A09)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TE.A0L(this.A04);
    }

    public BBS(ContextualAdResponseExtras contextualAdResponseExtras, ContextualAdResponseOrganicInfo contextualAdResponseOrganicInfo, C42049BFc bFc, C233492vo r4, Boolean bool, Long l, String str, String str2, List list, List list2) {
        this.A00 = list;
        this.A01 = r4;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = contextualAdResponseExtras;
        this.A06 = list2;
        this.A02 = bool;
        this.A03 = bFc;
        this.A07 = l;
        this.A04 = contextualAdResponseOrganicInfo;
    }

    public final String toString() {
        return super.toString();
    }
}
