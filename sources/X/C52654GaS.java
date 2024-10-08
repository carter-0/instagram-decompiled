package X;

import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsMidCardSubtype;
import com.instagram.api.schemas.InstagramMidcardType;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GaS  reason: case insensitive filesystem */
public final class C52654GaS implements C59620JQo, C59627JQv, C59619JQn, JQ1, JQ2, JQ4 {
    public C62320sa A00;
    public 0sP A01;
    public 0sP A02;
    public 0sL A03;
    public 0sL A04;
    public 0sJ A05;
    public final UserSession A06;
    public final GDI A07;
    public final C51979GAc A08;
    public final /* synthetic */ C55568Hjo A09 = new Object();
    public final /* synthetic */ C57669IeY A0A = new Object();
    public final /* synthetic */ C59627JQv A0B;
    public final /* synthetic */ JQ1 A0C;
    public final /* synthetic */ JQ2 A0D;
    public final /* synthetic */ GZ3 A0E;
    public final /* synthetic */ JQ4 A0F;

    public final C62320sa Aiq(C53451Goj goj, AnonymousClass0iw r11, UserSession userSession, Long l, String str, String str2, List list, C62320sa r17) {
        AnonymousClass7TG.A1N(r11, userSession);
        C51972G9s.A1E(str, str2);
        return this.A0A.Aiq(goj, r11, userSession, l, str, str2, list, r17);
    }

    public final C62320sa BZo(C53451Goj goj, AnonymousClass0iw r11, UserSession userSession, Long l, String str, String str2, List list, C62320sa r17) {
        AnonymousClass7TG.A1N(r11, userSession);
        C51972G9s.A1E(str, str2);
        return this.A0A.BZo(goj, r11, userSession, l, str, str2, list, r17);
    }

    public final void CIF(28D r2, ClipsCameraCommandAction clipsCameraCommandAction, C2606046i r4) {
        0qQ.A0B(r2, 1);
        this.A0B.CIF(r2, clipsCameraCommandAction, r4);
    }

    public final void CIG(AnonymousClass8ZN r7, C53452Gok gok, C2606046i r9, String str, List list) {
        0qQ.A0B(list, 1);
        this.A0B.CIG(r7, gok, r9, (String) null, list);
    }

    public final void CIQ(28D r2) {
        0qQ.A0B(r2, 0);
        this.A0C.CIQ(r2);
    }

    public final void CIT(28D r2) {
        0qQ.A0B(r2, 0);
        this.A0D.CIT(r2);
    }

    public final void CIf(28D r2, String str) {
        this.A0A.CIf(r2, str);
    }

    public final void CJ7(C53452Gok gok, C2606046i r8, List list, 05G r10, boolean z) {
        C51972G9s.A1B(list, r10);
        this.A0B.CJ7(gok, r8, list, r10, false);
    }

    public final void CJL(28D r2, 1Xj r3) {
        0qQ.A0B(r2, 1);
        this.A0F.CJL(r2, r3);
    }

    public final void CJP(ClipsMidCardSubtype clipsMidCardSubtype, InstagramMidcardType instagramMidcardType, C53332GmI gmI, String str, int i) {
        AnonymousClass7TG.A1T(instagramMidcardType, clipsMidCardSubtype, gmI);
        0qQ.A0B(str, 4);
        this.A0E.CJP(clipsMidCardSubtype, instagramMidcardType, gmI, str, i);
    }

    public final void Eb4(0sH r2) {
        this.A0B.Eb4(r2);
    }

    public final void Eb5(0sH r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A02 = r2;
    }

    public final void EbA(0sP r2) {
        this.A0C.EbA(r2);
    }

    public final void EbC(0sK r2) {
        this.A0B.EbC(r2);
    }

    public final void EbD(0sL r2) {
        this.A0F.EbD(r2);
    }

    public final void EbE(0sP r2) {
        this.A0D.EbE(r2);
    }

    public final void Ebd(0sJ r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A01 = r2;
    }

    public final void Ebk(0sL r2) {
        0qQ.A0B(r2, 0);
        this.A0E.A00 = r2;
    }

    public final void CJO(MidCardClipsClickedAction midCardClipsClickedAction, JSG jsg, AnonymousClass0iw r16, UserSession userSession, Long l, String str, String str2, String str3, String str4, List list, List list2, boolean z) {
        AnonymousClass0iw r3 = r16;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(r3, userSession2);
        String str5 = str2;
        0qQ.A0B(str5, 6);
        String str6 = str3;
        String str7 = str4;
        C51972G9s.A1F(str6, str7);
        this.A0A.CJO(midCardClipsClickedAction, jsg, r3, userSession2, l, str, str5, str6, str7, list, list2, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Hjo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.IeY, java.lang.Object] */
    public C52654GaS(UserSession userSession, C59627JQv jQv, JQ1 jq1, JQ2 jq2, JQ4 jq4, C52644GaI gaI, GDI gdi, C51979GAc gAc) {
        this.A0B = jQv;
        this.A0C = jq1;
        this.A0D = jq2;
        this.A0F = jq4;
        this.A0E = new GZ3(userSession, new C52073GDt(userSession), gAc, new C58703IwC(gaI, 38));
        this.A06 = userSession;
        this.A08 = gAc;
        this.A07 = gdi;
    }
}
