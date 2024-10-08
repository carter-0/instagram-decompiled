package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.585  reason: invalid class name */
public final class AnonymousClass585 implements C61110lV, AnonymousClass0lh {
    public final 1NH A00;
    public final UserSession A01;
    public final C61480nO A02;
    public final Map A03;
    public final C262224Cq A04;
    public final boolean A05;

    public /* synthetic */ AnonymousClass585(UserSession userSession) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36312930580432427L)) {
            linkedHashMap.put(AnonymousClass586.EXPLORE_TAIL_LOAD_DECISION_MAKER, new AnonymousClass58A(userSession2, AnonymousClass589.EXPLORE, new C379709Uz(userSession), 12, 18));
        }
        if (182.A06(r3, userSession, 36319278542101600L)) {
            linkedHashMap.put(AnonymousClass586.MAINFEED_TAIL_LOAD_DECISION_MAKER, new AnonymousClass58A(userSession2, AnonymousClass589.IG_FEED_TIMELINE, new AnonymousClass587(userSession), 4, 4));
        }
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "PersonalizationControl";
        AnonymousClass0vF r7 = new AnonymousClass0vF(A002);
        1NH r6 = new 1NH(userSession.A03.A06(), new AnonymousClass58D(), 1640735657);
        boolean z = false;
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(r7).AOJ(251381144, 3));
        z = (182.A06(r3, userSession, 36312930580497964L) || 182.A06(r3, userSession, 36319278542101600L)) ? true : z;
        0qQ.A0B(A022, 5);
        this.A01 = userSession;
        this.A03 = linkedHashMap;
        this.A02 = r7;
        this.A00 = r6;
        this.A04 = A022;
        this.A05 = z;
        if (z) {
            14i.A04(15Y.A02, this, false, false);
            if (this.A05) {
                C262224Cq r32 = this.A04;
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, new C376879Jr(this, (AnonymousClass4D7) null, 33), r32);
            }
        }
    }

    public final AnonymousClass583 A00(AnonymousClass586 r3) {
        if (this.A05) {
            Map map = this.A03;
            if (map.containsKey(r3)) {
                Object obj = map.get(r3);
                0qQ.A0C(obj, "null cannot be cast to non-null type T of com.instagram.signal.IgSignalManager.getDecisionMaker");
                return (AnonymousClass583) obj;
            }
            throw new IllegalStateException(002.A0R("cannot get surface signal for ", r3.name()));
        }
        throw new IllegalStateException("IgSignalManager is not enabled");
    }

    public final void A01(AnonymousClass58F r5) {
        if (this.A05) {
            C262224Cq r3 = this.A04;
            AnonymousClass9K0 r2 = new AnonymousClass9K0(r5, this, (AnonymousClass4D7) null, 4);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(988533240);
        if (this.A05) {
            C262224Cq r3 = this.A04;
            C376879Jr r2 = new C376879Jr(this, (AnonymousClass4D7) null, 34);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
        AnonymousClass0fD.A0A(749110750, A032);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(1331415526, AnonymousClass0fD.A03(-109057298));
    }

    public final void onSessionWillEnd() {
        14i.A07(this);
    }
}
