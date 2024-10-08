package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatortools.api.CreatorToolsMonetizationApi;
import java.util.ArrayList;

/* renamed from: X.DlQ  reason: case insensitive filesystem */
public final class C46791DlQ extends 2YL {
    public String A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final UserSession A07;
    public final CreatorToolsMonetizationApi A08;
    public final C249513ju A09;
    public final AnonymousClass0r6 A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;

    public C46791DlQ(UserSession userSession, CreatorToolsMonetizationApi creatorToolsMonetizationApi) {
        0qQ.A0B(creatorToolsMonetizationApi, 2);
        this.A07 = userSession;
        this.A08 = creatorToolsMonetizationApi;
        1HR r0 = new 1HR(0);
        this.A09 = r0;
        this.A0A = 0u9.A04(r0);
        0sn r2 = 0sn.A00;
        02z A012 = 106.A01(r2);
        this.A0E = A012;
        19B r1 = 19B.A00;
        this.A04 = C226292g8.A00(r1, A012);
        02z A10 = DbS.A10(false);
        this.A0B = A10;
        this.A01 = C226292g8.A00(r1, A10);
        02z A013 = 106.A01(r2);
        this.A0F = A013;
        this.A05 = C226292g8.A00(r1, A013);
        02z A014 = 106.A01(r2);
        this.A0G = A014;
        this.A06 = C226292g8.A00(r1, A014);
        02z A102 = DbS.A10("");
        this.A0C = A102;
        this.A02 = C226292g8.A00(r1, A102);
        02z A103 = DbS.A10(false);
        this.A0D = A103;
        this.A03 = C226292g8.A00(r1, A103);
    }

    public static final void A00(C62484KgZ kgZ, C62484KgZ kgZ2, C46791DlQ dlQ) {
        C62484KgZ kgZ3 = C62484KgZ.FETCHING;
        if (kgZ != kgZ3 && kgZ2 != kgZ3) {
            AnonymousClass7TF.A1O(dlQ.A0D, false);
        }
    }

    public static final void A01(C46791DlQ dlQ) {
        05G r3 = dlQ.A0E;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C49324Etf(2131965488));
        r3.Epw(A1C);
        AnonymousClass7TF.A1O(dlQ.A0D, false);
    }

    public static final void A02(C46791DlQ dlQ) {
        05G r3 = dlQ.A0F;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C49324Etf(2131965488));
        r3.Epw(A1C);
        AnonymousClass7TF.A1O(dlQ.A0D, false);
    }
}
