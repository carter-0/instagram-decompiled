package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.incentiveplatform.api.IncentivePlatformApi;
import com.instagram.monetization.repository.MonetizationRepository;

/* renamed from: X.DlB  reason: case insensitive filesystem */
public final class C46783DlB extends 2YL {
    public final Context A00;
    public final 2Fk A01;
    public final IncentivePlatformApi A02;
    public final MonetizationRepository A03;
    public final C249513ju A04;
    public final AnonymousClass0r6 A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final UserSession A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final AnonymousClass0Ud A0E;

    public static final void A00(C46783DlB dlB, String str) {
        AnonymousClass7TE.A1Z(new MEW(dlB, str, (AnonymousClass4D7) null, 10, false), C318116oQ.A00(dlB));
    }

    public C46783DlB(Context context, UserSession userSession, IncentivePlatformApi incentivePlatformApi, MonetizationRepository monetizationRepository) {
        AnonymousClass7TG.A1U(context, userSession, monetizationRepository);
        0qQ.A0B(incentivePlatformApi, 4);
        this.A00 = context;
        this.A0A = userSession;
        this.A03 = monetizationRepository;
        this.A02 = incentivePlatformApi;
        02z A10 = DbS.A10(false);
        this.A07 = A10;
        this.A0C = A10;
        02z A102 = DbS.A10(false);
        this.A08 = A102;
        this.A0D = A102;
        02z A103 = DbS.A10(false);
        this.A09 = A103;
        this.A0E = A103;
        0sn r1 = 0sn.A00;
        02z A104 = DbS.A10(new C47190Dsc(false, r1, r1, r1));
        this.A06 = A104;
        this.A0B = A104;
        this.A01 = DbT.A0G(AnonymousClass10H.A02(new C51650FyC(this), A103, monetizationRepository.A0F, A10, A102, A104));
        1HR r0 = new 1HR(0);
        this.A04 = r0;
        this.A05 = 0u9.A04(r0);
    }
}
