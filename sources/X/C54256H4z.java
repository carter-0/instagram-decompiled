package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.H4z  reason: case insensitive filesystem */
public final class C54256H4z extends 1P0 {
    public long A00;
    public final /* synthetic */ AnonymousClass540 A01;
    public final /* synthetic */ 0tp A02;
    public final /* synthetic */ C228842mQ A03;
    public final /* synthetic */ 1FS A04;
    public final /* synthetic */ C278734xR A05;
    public final /* synthetic */ boolean A06;

    public C54256H4z(AnonymousClass540 r3, 0tp r4, C228842mQ r5, 1FS r6, C278734xR r7, boolean z) {
        this.A05 = r7;
        this.A03 = r5;
        this.A06 = z;
        this.A02 = r4;
        this.A04 = r6;
        this.A01 = r3;
        this.A00 = DbW.A06(AnonymousClass7TE.A0q(r7.A04), C273654mx.A00(794));
    }

    private final void A00(boolean z) {
        AnonymousClass3PH r1 = AnonymousClass3PH.A00;
        C278734xR r0 = this.A05;
        r1.A00(r0.A03, r0.A04, AnonymousClass05K.A00, this.A03.A00.A09, this.A00, z);
    }

    public final void onFail(C268654dm r6) {
        int i;
        int A032 = AnonymousClass0fD.A03(-1417902034);
        0qQ.A0B(r6, 0);
        this.A01.AVX(C273654mx.A00(697));
        1XQ r0 = (1XQ) r6.A00();
        if (r0 != null) {
            i = r0.mStatusCode;
        } else {
            i = -1;
        }
        C228482lk.A00(this.A05.A04).A04(r6, this.A03, i);
        A00(false);
        AnonymousClass0fD.A0A(-595160048, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-175300603);
        C278734xR r5 = this.A05;
        UserSession userSession = r5.A04;
        C228482lk.A00(userSession).A09(this.A04);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36328529902189977L) || 182.A06(r2, userSession, 36328529902124440L)) {
            C55048HbJ.A00(DbT.A05(r5.A03), userSession).A03();
        }
        AnonymousClass0fD.A0A(-2117549716, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1039059691);
        UserSession userSession = this.A05.A04;
        C228482lk.A00(userSession).A08(this.A03, "background_prefetcher", this.A06);
        1Av A002 = 1Au.A00(userSession);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c(C273654mx.A00(794), currentTimeMillis);
        A0p.apply();
        AnonymousClass0fD.A0A(-489383750, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Map map;
        int A032 = AnonymousClass0fD.A03(307975164);
        1XM r11 = (1XM) obj;
        int A0D = AnonymousClass7TG.A0D(r11, -196023736);
        ArrayList A1D = AnonymousClass7TE.A1D(r11.A00());
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(A1D);
        C278734xR r7 = this.A05;
        C278734xR.A03(this.A01, r7, 00k.A0a(00k.A0j(A1C)));
        UserSession userSession = r7.A04;
        C228492ll A002 = C228482lk.A00(userSession);
        1FS r9 = this.A04;
        A002.A0A(r9, r11, AnonymousClass3PG.NETWORK);
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36323839797440060L)) {
            1Av A003 = 1Au.A00(userSession);
            String name = this.A03.A00.A04.name();
            0xY A0p = AnonymousClass7TE.A0p(A003);
            A0p.E5g("last_feed_head_load_fetch_reason", name);
            A0p.apply();
        }
        A00(true);
        this.A02.DeY(r9.A03, A1D, true);
        r7.A01 = A1D;
        C278734xR.A07(r7);
        if (182.A06(r6, userSession, 36328701700423195L) && (map = r11.A0M) != null) {
            C55041HbC.A00(userSession).A01(map);
        }
        if (r11.A0B != null) {
            AnonymousClass7TE.A0q(userSession).getBoolean("is_ifr_eligible", true);
        }
        AnonymousClass0fD.A0A(2024399337, A0D);
        AnonymousClass0fD.A0A(-331525203, A032);
    }
}
