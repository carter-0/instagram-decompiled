package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;

/* renamed from: X.2pM  reason: invalid class name */
public final class AnonymousClass2pM {
    public C228412ld A00;
    public AnonymousClass2xS A01;
    public AnonymousClass2pN A02 = new Object();
    public C230302pO A03 = new C230302pO();
    public final UserSession A04;
    public final 2el A05;
    public final C230292pL A06;
    public final C230362pV A07;
    public final C230282pK A08;
    public final C230352pU A09;
    public final C230492pi A0A;
    public final C230392pY A0B;
    public final C230342pT A0C;
    public final C230322pR A0D;
    public final C230512pk A0E;
    public final C230482ph A0F;
    public final AnonymousClass2pP A0G;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2pN, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.2pi, X.2pj] */
    public AnonymousClass2pM(UserSession userSession, 2el r6, AnonymousClass4DU r7, C230292pL r8, C230282pK r9, C249763kK r10) {
        0qQ.A0B(r10, 2);
        this.A04 = userSession;
        this.A08 = r9;
        this.A06 = r8;
        this.A05 = r6;
        AnonymousClass2pP r2 = new AnonymousClass2pP(C60510iO.A00(userSession), false);
        this.A0G = r2;
        C230322pR r1 = new C230322pR(r9);
        this.A0D = r1;
        this.A0C = new C230342pT(r1, r2);
        this.A09 = new C230352pU(userSession, r9, r2);
        this.A07 = new C230362pV(userSession, r9);
        this.A0B = new C230392pY(userSession, r9);
        this.A0F = new C230482ph(userSession, new C230462pf(userSession, new C230412pa(userSession, r10.getSessionId(), r7.getModuleName()), new C230442pd(), C230432pc.FEED), C230472pg.SPONSORED);
        this.A0A = new C230502pj(userSession);
        this.A0E = new C230512pk(userSession, r7);
    }

    public final void A00(View view, IntentAwareAdPivotState intentAwareAdPivotState, C54077Gz1 gz1, int i, boolean z) {
        String str;
        C53288Gla gla = new C53288Gla(intentAwareAdPivotState, (C230292pL) null, gz1, (AnonymousClass2pN) null, (C230302pO) null, i);
        C230512pk r5 = this.A0E;
        r5.A00.put(gla, view);
        Integer valueOf = Integer.valueOf(i);
        String id = ((C55923Hpk) gla.A03.A0B.get(i)).A00().getId();
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r3 = new C2354830a(gla, valueOf, id);
        r3.A00(this.A0B);
        r3.A00(this.A0C);
        r3.A00(this.A0F);
        if (z) {
            if (182.A06(0Tu.A05, this.A04, 36315155374148650L)) {
                r3.A00(r5);
            }
        }
        1Xj A002 = ((C55923Hpk) gz1.A0B.get(i)).A00();
        if ((!A002.A5D() || (A002 = A002.A1c(0)) != null) && A002.CeS()) {
            AnonymousClass2xS r2 = this.A01;
            if (r2 == null) {
                str = "feedVideoModule";
            } else {
                C228412ld r1 = this.A00;
                if (r1 == null) {
                    str = "mediaStateProvider";
                } else {
                    r3.A00(new IPJ(r1, r2));
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A05.A05(view, r3.A01());
    }
}
