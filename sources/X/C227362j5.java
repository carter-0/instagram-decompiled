package X;

import android.content.IntentFilter;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeClientManager;

/* renamed from: X.2j5  reason: invalid class name and case insensitive filesystem */
public final class C227362j5 extends 0vM {
    public final /* synthetic */ 2DV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C227362j5(2DV r7) {
        super("DirectUserScopedInitializer.initOnMainAppUiCreated", 318, 5, false, false);
        this.A00 = r7;
    }

    public final void loggedRun() {
        AnonymousClass1p0 r1;
        2DU A002 = 2DU.A00(this.A00.A01);
        UserSession userSession = A002.A09;
        if (182.A06(0Tu.A05, userSession, 36316237706760337L)) {
            AnonymousClass1HI.A02.Eym(new C68675NSh(A002));
        } else {
            0nY.A00().ATE(new AnonymousClass90K(A002));
        }
        AnonymousClass92E.A00(userSession).A06();
        0qQ.A0B(userSession, 0);
        C333687Zx r8 = (C333687Zx) userSession.A01(C333687Zx.class, new C73914Plp(userSession, 17));
        UserSession userSession2 = r8.A03;
        0Tu r4 = 0Tu.A06;
        if (182.A06(r4, userSession2, 36315906992770739L) && (r1 = AnonymousClass1p0.A00) != null && !r8.A02) {
            r8.A00 = r1.A00(r8.A04);
            AnonymousClass1p0 r0 = AnonymousClass1p0.A00;
            if (r0 != null) {
                r8.A01 = r0;
                C262224Cq r6 = r8.A06;
                1Eo.A05(19B.A00, new MHE((Object) r8, (AnonymousClass4D7) null, 5, 42), r6);
            } else {
                0qQ.A0F("instance");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        if (!2HM.A00(userSession).A05()) {
            2DU.A05(A002, AnonymousClass05K.A00);
        }
        if (AnonymousClass5HM.A01(userSession) && 182.A06(r4, userSession, 2342157872530918248L) && O1V.A00(userSession)) {
            int intValue = new Long(182.A01(r4, userSession, 36596338293868939L)).intValue();
            C47368Dwe dwe = new C47368Dwe(userSession);
            1OC A003 = F7X.A00(userSession, C273654mx.A00(306));
            A003.A00 = dwe;
            if (intValue > 0) {
                1ES.A04(A003, 365916736, 3, intValue, true, true);
            } else {
                1ES.A03(A003);
            }
            C47369Dwf dwf = new C47369Dwf(userSession);
            1OC A004 = F7X.A00(userSession, "notifications");
            A004.A00 = dwf;
            if (intValue > 0) {
                1ES.A04(A004, 365916736, 3, intValue, true, true);
            } else {
                1ES.A03(A004);
            }
            AnonymousClass4kA A005 = AnonymousClass4k9.A00(userSession);
            A005.A0Q.Epx(A005, Long.valueOf(System.currentTimeMillis() / 1000), AnonymousClass4kA.A0c[14]);
        }
        if (2El.A0C(userSession) && 182.A06(r4, userSession, 36316688676885086L)) {
            IntentFilter intentFilter = AnonymousClass439.A0I;
            AnonymousClass439 A006 = C261854Be.A00(userSession);
            synchronized (A006) {
                AnonymousClass43G r5 = A006.A09;
                UserSession userSession3 = r5.A07;
                1NY r3 = new 1NY(userSession3);
                r3.A08(AnonymousClass05K.A0N);
                r3.A0A("direct_v2/should_show_ad_responses_tab/");
                r3.A0R(C375909Fs.class, C375919Ft.class);
                1OC A0M = r3.A0M();
                A0M.A00 = new C375929Fu(userSession3, r5);
                AnonymousClass43G.A00(A0M, r5);
            }
        }
        RealtimeClientManager.getInstance(userSession).initOnMainAppUiCreated();
    }
}
