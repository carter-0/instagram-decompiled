package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.instagram.common.session.UserSession;
import java.util.Queue;

public final class QGH extends RRD implements C13514Tbj {
    public Handler A00;
    public C13794ThC A01;
    public C11039S6r A02;
    public C13685Tf2 A03;
    public 2IR A04;
    public AnonymousClass3Q2 A05;
    public Handler A06;
    public final UserSession A07;
    public final HandlerThread A08;
    public final HandlerThread A09;
    public final RRN A0A;
    public final Queue A0B = Pxe.A1A();

    public QGH(RRN rrn, UserSession userSession) {
        this.A07 = userSession;
        this.A0A = rrn;
        HandlerThread A0I = Pxf.A0I("polling_thread_segment_anything");
        this.A08 = A0I;
        HandlerThread A0I2 = Pxf.A0I("creation_timeout_segment_anything");
        this.A09 = A0I2;
        A0I.start();
        this.A06 = Pxg.A0N(A0I2);
        this.A00 = Pxf.A0H(A0I);
    }

    public final void Dge(String str, String str2) {
    }
}
