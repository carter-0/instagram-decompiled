package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Iec  reason: case insensitive filesystem */
public final class C57673Iec implements C59620JQo, JQ3 {
    public 0sL A00;
    public 0sK A01;
    public final C61083JwL A02;
    public final UserSession A03;
    public final C361598gU A04;
    public final GZ3 A05;
    public final C53585Gr0 A06;
    public final C51979GAc A07;

    public final void CJP(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C53332GmI gmI, String str, int i) {
        AnonymousClass7TG.A1T(instagramMidcardType, clipsMidCardSubtype, gmI);
        0qQ.A0B(str, 4);
        this.A05.CJP(clipsMidCardSubtype, instagramMidcardType, gmI, str, i);
    }

    public final void Eb5(0sH r2) {
        0qQ.A0B(r2, 0);
        this.A05.A02 = r2;
    }

    public final void Ebd(0sJ r2) {
        0qQ.A0B(r2, 0);
        this.A05.A01 = r2;
    }

    public final void Ebk(0sL r2) {
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.8gU] */
    public /* synthetic */ C57673Iec(UserSession userSession, GZ3 gz3, C53585Gr0 gr0, C51979GAc gAc) {
        List list;
        C276014sL r1;
        1Xj r12;
        ? obj = new Object();
        this.A07 = gAc;
        this.A03 = userSession;
        this.A06 = gr0;
        this.A05 = gz3;
        this.A04 = obj;
        C53461Got got = gr0.A01.A07;
        C61083JwL jwL = null;
        if (!(got == null || (list = got.A03) == null || (r1 = (C276014sL) 00k.A0O(list, 0)) == null || (r12 = r1.A00) == null)) {
            jwL = new C61083JwL((C62320sa) C58692Iw1.A00(r12, this, 37), this.A06.A03 ? 2131963567 : 2131963556);
        }
        this.A02 = jwL;
    }

    public final C61083JwL BfW() {
        return this.A02;
    }

    public final C61083JwL Bqb() {
        return null;
    }
}
