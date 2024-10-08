package X;

import android.graphics.Bitmap;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;

public final class JW5 implements C348257y9 {
    public final /* synthetic */ C376529Ii A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C59739JVx A02;
    public final /* synthetic */ C343317q1 A03;

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        return medium.equals(this.A02.A00);
    }

    public final void DLY(Medium medium, String str) {
        0qQ.A0B(medium, 0);
        UserSession userSession = this.A01;
        02m.A0p.markerAnnotate(18949957, medium.A05, AnonymousClass000.A00(283), str);
        C279294yP A0J = 27p.A01(userSession).A0J();
        if (A0J != null) {
            02m.A0p.markerAnnotate(18949957, medium.A05, "camera_destination", A0J.A00);
        }
        02m.A0p.markerEnd(18949957, medium.A05, 87);
        C343317q1 r3 = this.A03;
        if (r3 != null) {
            1Jk.A08.A0G(DbS.A0V(medium.A02().toString()), r3.A00);
        }
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        Medium medium2 = medium;
        0qQ.A0B(medium2, 0);
        Bitmap bitmap2 = bitmap;
        0qQ.A0B(bitmap2, 2);
        C59739JVx jVx = this.A02;
        C376529Ii r6 = this.A00;
        UserSession userSession = this.A01;
        C343317q1 r3 = this.A03;
        C59738JVw jVw = jVx.A03;
        jVw.A03 = new C61081JwJ(bitmap2, medium2.A0X);
        JXQ.A00.A03(bitmap2, r6, jVw, new C59733JVr(1, jVx, r3, bitmap2, userSession, r6, medium2, z), medium2.A07);
    }

    public JW5(C376529Ii r1, UserSession userSession, C59739JVx jVx, C343317q1 r4) {
        this.A02 = jVx;
        this.A00 = r1;
        this.A01 = userSession;
        this.A03 = r4;
    }
}
