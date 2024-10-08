package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ieb  reason: case insensitive filesystem */
public final class C57672Ieb implements C59620JQo, JQ3 {
    public C62320sa A00;
    public C62320sa A01;
    public final UserSession A02;
    public final C52674Gam A03;
    public final C51979GAc A04;
    public final C61083JwL A05;
    public final /* synthetic */ C59620JQo A06;

    public final void CJP(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C53332GmI gmI, String str, int i) {
        AnonymousClass7TG.A1T(instagramMidcardType, clipsMidCardSubtype, gmI);
        0qQ.A0B(str, 4);
        this.A06.CJP(clipsMidCardSubtype, instagramMidcardType, gmI, str, i);
    }

    public final void Eb5(0sH r2) {
        0qQ.A0B(r2, 0);
        this.A06.Eb5(r2);
    }

    public final void Ebd(0sJ r2) {
        0qQ.A0B(r2, 0);
        this.A06.Ebd(r2);
    }

    public final void Ebk(0sL r2) {
        0qQ.A0B(r2, 0);
        this.A06.Ebk(r2);
    }

    public final C61083JwL BfW() {
        return this.A05;
    }

    public final C61083JwL Bqb() {
        return null;
    }

    public C57672Ieb(UserSession userSession, C52674Gam gam, C59620JQo jQo, C51979GAc gAc) {
        this.A06 = jQo;
        this.A02 = userSession;
        this.A04 = gAc;
        this.A03 = gam;
        this.A05 = new C61083JwL((C62320sa) new C58133Imz(this, 56), gam.A02 ? 2131963725 : 2131963565);
    }
}
