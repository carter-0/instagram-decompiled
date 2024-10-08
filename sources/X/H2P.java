package X;

import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.settings.audience.AudienceRepository;
import com.instagram.creator.agent.settings.audience.SelectAccountsUseCase$uiState$1;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class H2P extends C247303g7 {
    public C262204Co A00;
    public final UserSession A01;
    public final AudienceRepository A02;
    public final String A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A00(0eO.A02, C58702IwB.A01(this, 29));
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;

    public H2P(UserSession userSession, AudienceRepository audienceRepository, String str, 05G r16, 05G r17) {
        0qQ.A0B(str, 1);
        05G r6 = r16;
        05G r0 = r17;
        C51973G9u.A0r(2, userSession, r6, r0);
        this.A03 = str;
        this.A01 = userSession;
        this.A02 = audienceRepository;
        this.A08 = r6;
        this.A09 = r0;
        0sn r02 = 0sn.A00;
        02z A012 = 106.A01(r02);
        this.A0A = A012;
        02z A013 = 106.A01(r02);
        this.A07 = A013;
        02z A10 = DbS.A10(C54617HLa.SUCCESS);
        this.A06 = A10;
        02z A102 = DbS.A10(C54617HLa.LOADING);
        this.A0B = A102;
        02z A014 = 106.A01(I1C.A00);
        this.A05 = A014;
        this.A0C = 10b.A03(A014);
        0pp A022 = AnonymousClass10H.A02(new SelectAccountsUseCase$uiState$1((AnonymousClass4D7) null), r6, A012, A013, A10, A102);
        this.A0D = 10b.A02(new C53400GnX((C54617HLa) null, (C54617HLa) null, (DefaultConstructorMarker) null, (AnonymousClass62P) null, (AnonymousClass62P) null, (AnonymousClass62P) null, 31, 2), A03(), A022, AnonymousClass10A.A01);
    }
}
