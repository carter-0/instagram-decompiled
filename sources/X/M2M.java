package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.PhotoSession;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public final class M2M implements Runnable {
    public final /* synthetic */ AnonymousClass8ZV A00;

    public M2M(AnonymousClass8ZV r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8ZV r12 = this.A00;
        if (((JWE) AnonymousClass8ZV.A00(r12)).A01.A0C != null) {
            JW1.A00(r12.getSession()).A05(r12.A01);
            List A05 = r12.AsK().A05();
            0qQ.A07(A05);
            if (AnonymousClass7TE.A1b(A05)) {
                List<PhotoSession> A052 = r12.AsK().A05();
                0qQ.A07(A052);
                r12.A0E = new AtomicInteger(A052.size());
                for (PhotoSession photoSession : A052) {
                    String str = photoSession.A0B;
                    JWH jwh = r12.A07;
                    String str2 = "mediaCaptureRenderController";
                    if (jwh != null) {
                        jwh.A03((C10954S2m) null, str);
                        FragmentActivity activity = r12.getActivity();
                        if (activity != null) {
                            UserSession A02 = r12.getSession();
                            C3499682q A002 = AnonymousClass8ZV.A00(r12);
                            JWG jwg = r12.A03;
                            if (jwg == null) {
                                str2 = "dialogHelper";
                            } else {
                                C65161LoQ loQ = new C65161LoQ(activity, A02, new C64911LkB(r12, 0), photoSession, jwg, A002, r12, ((JWE) AnonymousClass8ZV.A00(r12)).A01.A09, r12, (CountDownLatch) null, photoSession.A02);
                                JWH jwh2 = r12.A07;
                                if (jwh2 != null) {
                                    jwh2.A02((C10954S2m) null, str).Cmo(loQ, photoSession.A07, new C62461KgB[]{C62461KgB.UPLOAD}, true);
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    0qQ.A0F(str2);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            }
            AnonymousClass8ZV.A01(r12);
        }
    }
}
