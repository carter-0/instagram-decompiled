package X;

import android.view.View;
import java.io.File;
import java.util.List;

/* renamed from: X.AUb  reason: case insensitive filesystem */
public final class C40161AUb implements B30 {
    public final B30 A00;

    public final void A07(B2M b2m, File file) {
        ACk("LiteCameraController must be initialized before taking video.");
        C345687tv r6 = (C345687tv) ((C345697tw) this.A00.Ape(C345697tw.A00));
        if (r6.A00.CZk()) {
            ALI.A04(b2m, AnonymousClass7TE.A0z("Cannot start video recording while camera is paused."));
            return;
        }
        synchronized (r6.A03) {
            Integer num = r6.A05;
            Integer num2 = AnonymousClass05K.A01;
            if (num == num2) {
                ALI.A04(b2m, AnonymousClass7TE.A0z("Cannot start video recording. Another recording already in progress"));
            } else {
                C343937r3 r1 = C344037rD.A00;
                C343837qt r0 = r6.A00;
                r0.getClass();
                C393079vr.A00((C344037rD) r0.Apf(r1), "OpticVideoCaptureCoordinator", AnonymousClass7TE.A0Q(r6));
                C382569du r2 = new C382569du(r6, 0);
                r6.A05 = num2;
                r6.A04 = b2m;
                List list = r6.A02.A00;
                if (0 < list.size()) {
                    list.get(0);
                    throw AnonymousClass7TE.A11("onVideoCaptureStarted");
                }
                r6.A00.Exq(r2, file, (File) null);
            }
        }
    }

    public static C345607tn A00(C40161AUb aUb) {
        return (C345607tn) aUb.A00.Ape(C345607tn.A00);
    }

    public final View A01() {
        return ((C345547th) this.A00.Ape(C345547th.A00)).AqN();
    }

    public final void A02() {
        ACk("LiteCameraController must be initialized when stop recording.");
        ((C345697tw) this.A00.Ape(C345697tw.A00)).EyR(false);
    }

    public final void A06(A7O a7o, C41807B1m b1m) {
        ACk("LiteCameraController must be initialized before taking photo.");
        ((C345677tu) this.A00.Ape(C345677tu.A00)).EzW(a7o, b1m, (A3F) null);
    }

    public final void ACk(String str) {
        this.A00.ACk(str);
    }

    public final C343697qe Ape(C343717qg r2) {
        return this.A00.Ape(r2);
    }

    public final C343917r1 Apf(C343937r3 r2) {
        return this.A00.Apf(r2);
    }

    public final boolean CQN(C343717qg r2) {
        return this.A00.CQN(r2);
    }

    public final boolean CQO(C343937r3 r2) {
        return this.A00.CQO(r2);
    }

    public final void EIx() {
        this.A00.EIx();
    }

    public final void ESb(C342927pO r2, Object obj) {
        this.A00.ESb(r2, obj);
    }

    public final void destroy() {
        this.A00.destroy();
    }

    public final void pause() {
        this.A00.pause();
    }

    public C40161AUb(B30 b30) {
        this.A00 = b30;
        C343937r3 r1 = C344037rD.A00;
        if (b30.CQO(r1)) {
            ((C344037rD) this.A00.Apf(r1)).EQW(3);
        }
    }

    public final void A03(int i) {
        A00(this).setInitialCameraFacing(i);
    }

    public final void A04(C41825B2g b2g) {
        C345597tm r0 = (C345597tm) A00(this);
        if (b2g != null) {
            r0.A01.A01(b2g);
        }
    }

    public final void A05(C41825B2g b2g) {
        C345597tm r0 = (C345597tm) A00(this);
        if (b2g != null) {
            r0.A01.A02(b2g);
        }
    }
}
