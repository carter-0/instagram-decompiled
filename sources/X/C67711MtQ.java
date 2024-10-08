package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.MtQ  reason: case insensitive filesystem */
public final class C67711MtQ extends C361478gI {
    public 1xN A00;
    public 05G A01;
    public final 2Fk A02;
    public final 1aU A03;
    public final 1aU A04;
    public final 1a8 A05 = C66581MXm.A0P();
    public final UserSession A06;
    public final C68714NUa A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final 05G A0B;
    public final AnonymousClass12V A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67711MtQ(Application application, AnonymousClass12V r10, 1aU r11, 1aU r12, UserSession userSession, C68714NUa nUa) {
        super(application);
        C51974G9v.A0d(2, r11, nUa, r10, application);
        this.A06 = userSession;
        this.A04 = r11;
        this.A03 = r12;
        this.A07 = nUa;
        this.A0C = r10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
        this.A08 = A1G;
        this.A09 = 0u9.A04(A1G);
        02z A10 = C51970G9q.A10(false);
        this.A0B = A10;
        0sn r6 = 0sn.A00;
        this.A01 = 106.A01(r6);
        02z A102 = DbS.A10(new O6D(true));
        this.A0A = A102;
        AnonymousClass0r6 A0o = C66583MXo.A0o(r10, AnonymousClass10H.A00(C73578PgC.A00, A10, this.A01, A102), 1705805791, 3);
        this.A02 = C66582MXn.A0G(new N2X(new O6D(true), r6, false), C318116oQ.A00(this), A0o, AnonymousClass10A.A00);
    }

    public final void A0E(boolean z) {
        0KC.A0D("EncryptedBackupsOneTimeCodeWaitViewModel", "sendOtcNotifications start");
        this.A05.A02(this.A04.A0L(new C72026Ov0(1, this, z)), C73013PSw.A00);
    }

    public final void onCleared() {
        this.A05.A01();
    }
}
