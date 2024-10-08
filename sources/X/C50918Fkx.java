package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;
import java.util.Collection;

/* renamed from: X.Fkx  reason: case insensitive filesystem */
public final class C50918Fkx implements C337267fz {
    public Boolean A00;
    public String A01 = "";
    public final C14221Ts1 A02;
    public final AnonymousClass0r6 A03;
    public final 05G A04;
    public final C61770pa A05;
    public final AnonymousClass0Ud A06;
    public final UserSession A07;
    public final FanClubApi A08;
    public final C337287g2 A09;
    public final 0V2 A0A;
    public final 05G A0B;

    public C50918Fkx(UserSession userSession) {
        UserSession userSession2 = userSession;
        this.A07 = userSession2;
        02z A012 = 106.A01(0sn.A00);
        this.A04 = A012;
        Integer num = AnonymousClass05K.A00;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0A = A013;
        02z A10 = DbS.A10(0);
        this.A0B = A10;
        this.A06 = 10b.A03(A012);
        this.A05 = new 0V1((C262204Co) null, A013);
        this.A03 = new C51623FxC((AnonymousClass0r6) A10, 4);
        AnonymousClass7g1 r8 = new AnonymousClass7g1();
        this.A09 = r8;
        this.A02 = C14225Ts5.A00(userSession2, (AnonymousClass4D6) null, this, (G9d) null, r8, num, 0, 200, true, true);
        this.A08 = new FanClubApi(userSession2);
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        0qQ.A0B(str, 0);
        1NY A0b = AnonymousClass7TG.A0b(this.A07);
        A0b.A0A("fan_club/members/");
        A0b.A0Q(CGX.class, D1F.class);
        if (str2 != null) {
            A0b.A9m("max_id", str2);
        }
        1OC A0T = DbT.A0T(A0b, "query", str);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FanClubMembersResponse>, com.instagram.api.response.IgResponse>");
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.fanclub.api.FanClubMembersResponse, com.instagram.api.response.IgResponse>");
        return A0T;
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeM(C268654dm r3, String str) {
        this.A0A.FIA(C60340gF.A00);
    }

    public final void DeW(String str) {
        05G r1 = this.A0B;
        r1.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r1.getValue()) - 1));
    }

    public final void Dem(String str) {
        05G r1 = this.A0B;
        r1.Epw(Integer.valueOf(AnonymousClass7TE.A0M(r1.getValue()) + 1));
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r5, String str) {
        CGX cgx = (CGX) r5;
        0qQ.A0B(cgx, 1);
        0sn r3 = cgx.A03;
        if (r3 == null) {
            r3 = 0sn.A00;
        }
        05G r2 = this.A04;
        r2.Epw(00k.A0S(00k.A0e(r3, 00k.A0k((Iterable) r2.getValue())), (Collection) r2.getValue()));
        this.A00 = cgx.A00;
    }

    public final AnonymousClass4D6 Bpf() {
        return 1ES.A01();
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
