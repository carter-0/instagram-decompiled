package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.MtR  reason: case insensitive filesystem */
public final class C67712MtR extends C361478gI {
    public 05G A00;
    public final 2Fk A01;
    public final 1aU A02;
    public final 1a8 A03;
    public final UserSession A04;
    public final NUG A05;
    public final C68714NUa A06;
    public final C72203OyT A07;
    public final Integer A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67712MtR(Application application, AnonymousClass12V r12, 1aU r13, UserSession userSession, C68714NUa nUa, C72203OyT oyT, Integer num) {
        super(application);
        AnonymousClass7TF.A1B(userSession, 1, nUa);
        C72203OyT oyT2 = oyT;
        Integer num2 = num;
        C51974G9v.A0d(3, num2, r13, oyT2, r12);
        0qQ.A0B(application, 7);
        this.A04 = userSession;
        this.A06 = nUa;
        this.A08 = num2;
        this.A02 = r13;
        this.A07 = oyT2;
        0sn r8 = 0sn.A00;
        this.A00 = 106.A01(r8);
        this.A03 = new 1a8((C269794fh) null);
        this.A0E = C51970G9q.A10(false);
        02z A012 = 106.A01((Object) null);
        this.A0D = A012;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
        this.A0A = A1G;
        this.A0B = 0u9.A04(A1G);
        02z A10 = DbS.A10(new O6C(false));
        this.A0F = A10;
        02z A102 = DbS.A10(new O6C(true));
        this.A0C = A102;
        this.A0G = DbS.A10("");
        this.A05 = C69896Nty.A00(userSession);
        AnonymousClass0r6 A0o = C66583MXo.A0o(r12, AnonymousClass10H.A01(C73581PgF.A00, A10, A012, this.A00, A102), 1705805791, 3);
        this.A01 = C66582MXn.A0G(new C68138N2e((C69352Njr) null, new O6C(false), new O6C(true), r8), C318116oQ.A00(this), A0o, AnonymousClass10A.A00);
    }

    public final void A0E(boolean z) {
        0KC.A0D("EncryptedBackupsOneTimeCodeEnterCodeViewModel", "sendOtcNotifications start");
        this.A03.A02(this.A02.A0L(new C72026Ov0(0, this, z)), C73011PSu.A00);
    }

    public final void onCleared() {
        this.A03.A01();
        this.A09.clear();
    }
}
