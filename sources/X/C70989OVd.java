package X;

import android.content.Context;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;

/* renamed from: X.OVd  reason: case insensitive filesystem */
public final class C70989OVd {
    public C67635MrO A00;
    public final Context A01;
    public final UserSession A02;
    public final OEO A03;
    public final C69113Nes A04;
    public final C69132NfD A05;
    public final Nf2 A06;
    public final C70583OCg A07 = new C70583OCg(C66580MXl.A15(this, 38));
    public final C69123Nf4 A08;
    public final C69122Nf3 A09;
    public final C69125Nf6 A0A;
    public final OLC A0B;
    public final C69116Nev A0C;
    public final OVL A0D;
    public final C69114Net A0E;
    public final C69127Nf8 A0F;
    public final C69115Neu A0G;
    public final C69129NfA A0H;
    public final C69118Nex A0I;
    public final O9M A0J;
    public final C71080Oaz A0K;
    public final C69119Ney A0L;
    public final C69120Nez A0M;
    public final C69138NfJ A0N;
    public final OHZ A0O;
    public final C69131NfC A0P;
    public final C69130NfB A0Q;
    public final C69133NfE A0R;
    public final C69124Nf5 A0S;
    public final C69128Nf9 A0T;
    public final C69121Nf0 A0U;
    public final C69135NfG A0V;
    public final Nf1 A0W;
    public final C69117New A0X;
    public final C69137NfI A0Y;
    public final C71143Odx A0Z;
    public final C69136NfH A0a;
    public final C69126Nf7 A0b;
    public final C69134NfF A0c;
    public final O9R A0d;
    public final C72192OyC A0e;
    public final AnonymousClass0eM A0f;
    public final C262224Cq A0g;
    public final 05G A0h;
    public final AnonymousClass0Ud A0i;

    public /* synthetic */ C70989OVd(Context context, DevXAgentApi devXAgentApi, UserSession userSession, RealtimeClientManager realtimeClientManager, OEO oeo, O9L o9l, O9R o9r, OWA owa, OWA owa2, C72192OyC oyC) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        AR0 ar0 = new AR0(context2, C312126dr.A01, userSession2, "instagram_vc");
        OEO oeo2 = oeo;
        0qQ.A0B(oeo2, 7);
        this.A01 = context2;
        this.A02 = userSession2;
        O9R o9r2 = o9r;
        this.A0d = o9r2;
        C72192OyC oyC2 = oyC;
        this.A0e = oyC2;
        this.A03 = oeo2;
        AnonymousClass19S A022 = 19E.A02(AnonymousClass199.A02(AnonymousClass12T.A00.A04, new AnonymousClass19G((C262204Co) null)));
        this.A0g = A022;
        C71080Oaz oaz = new C71080Oaz(userSession2, o9r2, C66580MXl.A15(this, 42));
        this.A0K = oaz;
        C69134NfF nfF = new C69134NfF(context2, o9r2);
        this.A0c = nfF;
        this.A0M = new C69120Nez(userSession2, o9r2);
        this.A09 = new C69122Nf3(userSession2, o9r2);
        OWA owa3 = owa;
        Context context3 = context2;
        this.A0N = new C69138NfJ(context3, ar0, userSession2, nfF, o9r2, owa3, new ONG(this), C73925Pm5.A01(this, 35));
        this.A04 = new C69113Nes(nfF, o9r2);
        this.A0I = new C69118Nex(userSession2, o9r2);
        O9L o9l2 = o9l;
        C69119Ney ney = new C69119Ney(userSession2, o9l2, new C70753OJz(userSession2), o9r2);
        this.A0L = ney;
        this.A0D = new OVL(context3, userSession2, C73925Pm5.A01(this, 41), C73925Pm5.A01(this, 42), C73925Pm5.A01(this, 43));
        this.A0E = new C69114Net(userSession2, o9r2);
        this.A0b = new C69126Nf7(context2, userSession2, o9r2, 10b.A03(oaz.A0A));
        this.A0C = new C69116Nev(nfF, o9r2);
        UserSession userSession3 = userSession2;
        this.A0H = new C69129NfA(userSession3, o9r2, C73925Pm5.A01(this, 46), C73925Pm5.A01(this, 47), C73925Pm5.A01(this, 48));
        this.A05 = new C69132NfD(nfF, o9r2, new O9S(this), C73925Pm5.A01(this, 36));
        this.A0B = new OLC(new O9X(this));
        this.A0A = new C69125Nf6(userSession2, nfF, o9r2, C73925Pm5.A01(this, 38));
        this.A0V = new C69135NfG(userSession2, o9r2);
        this.A0T = new C69128Nf9(userSession2, o9r2, new C70502O9b(this));
        this.A0U = new C69121Nf0(o9r2);
        C73852Pkp pkp = C73852Pkp.A00;
        Class<C72187Oxw> cls = C72187Oxw.class;
        this.A0X = new C69117New(nfF, (C72187Oxw) userSession2.A01(cls, pkp), o9r2);
        C69134NfF nfF2 = nfF;
        O9R o9r3 = o9r2;
        this.A0S = new C69124Nf5(userSession3, nfF2, o9r3, C73925Pm5.A01(this, 40), C66580MXl.A14(this, 36));
        this.A0W = new Nf1(nfF, o9r2, owa3);
        Context context4 = context2;
        UserSession userSession4 = userSession2;
        C69134NfF nfF3 = nfF;
        O9R o9r4 = o9r2;
        this.A06 = new Nf2(context4, userSession4, nfF3, o9r4, owa3);
        this.A0F = new C69127Nf8(context4, userSession4, nfF3, o9r4, C73925Pm5.A01(this, 44));
        OWA owa4 = owa3;
        this.A0Y = new C69137NfI(userSession2, oeo2, o9l2, o9r4, owa4, new O9W(this), C66580MXl.A15(this, 40), C66580MXl.A14(oyC2, 37));
        C73588PgO A15 = C66580MXl.A15(ney, 41);
        Context context5 = context2;
        this.A0Z = new C71143Odx(context5, devXAgentApi, ar0, userSession2, realtimeClientManager, owa4, new O9Y(this), A15, new C74180PqM(this, 13), A022);
        ONT ont = new ONT(userSession2);
        AvatarStore avatarStore = new AvatarStore(userSession2);
        ONT ont2 = ont;
        AvatarStore avatarStore2 = avatarStore;
        this.A0O = new OHZ(context5, ont2, avatarStore2, 26G.A00(userSession2), nfF, new O9U(this), new O9V(this));
        UserSession userSession5 = userSession2;
        this.A0P = new C69131NfC(context5, userSession5, nfF, o9r2, owa3, new O9T(this));
        this.A0a = new C69136NfH(context5, userSession5, new POR(this), nfF, o9r2, owa2, new C70503O9c(this));
        this.A0G = new C69115Neu(userSession2, o9r2);
        O9Z o9z = new O9Z(this);
        this.A0R = new C69133NfE(context5, userSession5, o9r2, owa3, o9z, new C70501O9a(this), C73925Pm5.A01(this, 39));
        this.A0Q = new C69130NfB(o9r2, C73925Pm5.A01(this, 37), C66580MXl.A15(this, 39));
        this.A08 = new C69123Nf4(context2, userSession2, (C72187Oxw) userSession2.A01(cls, pkp), o9r2);
        this.A0J = new O9M(new OK3(this));
        02z A10 = DbS.A10(new N4R((EngineModel) null, new N9J((RtcCallKey) null, AnonymousClass05K.A0Y, AnonymousClass05K.A01)));
        this.A0h = A10;
        this.A0i = 10b.A03(A10);
        this.A0f = AnonymousClass0eN.A00(0eO.A02, C73925Pm5.A01(this, 45));
        DbX.A1X(this, A022, 36);
    }

    public static final void A00(N4R n4r, C70989OVd oVd) {
        C66581MXm.A1T(n4r, oVd.A0h);
        for (C74475PvV DCG : oVd.A0d.A00) {
            DCG.DCG(n4r);
        }
        C70583OCg oCg = oVd.A07;
        C73925Pm5 A012 = C73925Pm5.A01(oVd, 49);
        if (((N9J) n4r.A02).A01 == AnonymousClass05K.A01 && A012.invoke() != null) {
            oCg.A00.postDelayed(oCg.A01, 500);
        }
    }

    public final IgCallModel A01() {
        EngineModel engineModel = (EngineModel) ((N4R) this.A0h.getValue()).A00;
        if (engineModel != null) {
            return engineModel.callModel;
        }
        return null;
    }
}
