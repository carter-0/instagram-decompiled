package X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.cameracore.audiograph.AudioGraphClientProvider;
import com.facebook.cameracore.musiceffect.AudioServiceConfigurationAnnouncer;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7lB  reason: invalid class name and case insensitive filesystem */
public final class C340387lB implements C340397lC {
    public final C344207rU A00;
    public final C344227rW A01;
    public final C340407lD A02;
    public final C340297l2 A03;
    public final C340417lE A04;
    public final UserSession A05;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.7lD, java.lang.Object] */
    public C340387lB(View view, C344227rW r5, C340297l2 r6, C3496381d r7, UserSession userSession, boolean z) {
        0qQ.A0B(r6, 2);
        0qQ.A0B(r7, 4);
        this.A05 = userSession;
        this.A03 = r6;
        this.A01 = r5;
        C344207rU r0 = r6.A0G;
        0qQ.A07(r0);
        this.A00 = r0;
        WeakReference weakReference = new WeakReference(view);
        ? obj = new Object();
        obj.A00 = weakReference;
        this.A02 = obj;
        C340417lE r1 = new C340417lE(r7, this);
        this.A04 = r1;
        C340267kz.A02 = true;
        r6.A07 = z;
        r6.A0K.add(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r1 = (X.C382429dg) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A9i(X.AnonymousClass8KU r7) {
        /*
            r6 = this;
            r4 = 0
            X.7rU r0 = r6.A00
            X.7rc r1 = X.B3X.A00
            X.7qs r0 = r0.A00
            X.7qr r0 = (X.C343817qr) r0
            X.C343817qr.A01(r0)
            X.7qx r0 = r0.A02
            java.util.Map r0 = r0.A01
            java.lang.Object r1 = r0.get(r1)
            X.7qf r1 = (X.C343707qf) r1
            X.7rb r1 = (X.C344277rb) r1
            X.B3X r1 = (X.B3X) r1
            if (r1 == 0) goto L_0x005d
            X.9dg r1 = (X.C382429dg) r1
            X.7rv r5 = r1.A00
            if (r5 == 0) goto L_0x005d
            X.7ro r0 = r5.Abt()
            X.8me r3 = new X.8me
            r3.<init>(r7, r0)
            X.7qt r0 = r1.A00
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
            X.0qQ.A0C(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.view.Display r0 = r1.getDefaultDisplay()
            int r2 = r0.getRotation()
            r1 = 0
            if (r2 == 0) goto L_0x0054
            r0 = 1
            if (r2 == r0) goto L_0x0061
            r0 = 2
            if (r2 == r0) goto L_0x005e
            r0 = 3
            if (r2 != r0) goto L_0x0054
            r1 = 270(0x10e, float:3.78E-43)
        L_0x0054:
            r3.A00 = r1
            X.7sH r0 = r5.BQ8()
            r0.A8c(r3, r4)
        L_0x005d:
            return
        L_0x005e:
            r1 = 180(0xb4, float:2.52E-43)
            goto L_0x0054
        L_0x0061:
            r1 = 90
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340387lB.A9i(X.8KU):void");
    }

    public final GPUTimerImpl B8n() {
        return null;
    }

    public final C341047mF C3L() {
        return null;
    }

    public final boolean CL7(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        C345487tZ A002 = A00(this);
        if (A002 != null) {
            return A002.CL7(str, str2);
        }
        return true;
    }

    public final boolean CSz(String str) {
        0qQ.A0B(str, 0);
        return C345247tB.A01(str);
    }

    public final void Dza() {
    }

    public final void EEM(AnonymousClass8KU r4) {
        C344477rv r0;
        C344207rU r02 = this.A00;
        C344287rc r1 = B3X.A00;
        C343817qr r03 = (C343817qr) r02.A00;
        C343817qr.A01(r03);
        B3X b3x = (B3X) ((C344277rb) ((C343707qf) r03.A02.A01.get(r1)));
        if (b3x != null && (r0 = ((C382429dg) b3x).A00) != null) {
            r0.BQ8().EDi(0, r4);
        }
    }

    public static final C345487tZ A00(C340387lB r1) {
        C344207rU r0 = r1.A00;
        C344287rc r12 = C345487tZ.A00;
        C343817qr r02 = (C343817qr) r0.A00;
        C343817qr.A01(r02);
        return (C345487tZ) ((C344277rb) ((C343707qf) r02.A02.A01.get(r12)));
    }

    public final void AOq(boolean z) {
        this.A03.disconnect();
    }

    public final void ARO(boolean z) {
        throw new IllegalStateException();
    }

    public final void D0A() {
        this.A03.disconnect();
    }

    public final boolean DsV(MotionEvent motionEvent) {
        return this.A02.A02(motionEvent);
    }

    public final void EMW(ASJ asj) {
        throw new IllegalStateException();
    }

    public final void ErK(List list) {
        C345167t2 r0;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C368848tQ) it.next()).A05);
        }
        C345487tZ A002 = A00(this);
        if (!(A002 == null || (r0 = ((C345467tX) A002).A00) == null)) {
            ((C345157t1) r0).A03.A02(arrayList);
        }
        ELe(new C371588ye(this.A02));
    }

    public final void Eza(XBR xbr) {
        C344207rU r0 = this.A00;
        C345277tE r1 = C345397tQ.A00;
        C343817qr r02 = (C343817qr) r0.A00;
        C343817qr.A01(r02);
        C345397tQ r5 = (C345397tQ) ((C345267tD) ((C343707qf) r02.A02.A01.get(r1)));
        if (r5 != null) {
            C345387tP r52 = (C345387tP) r5;
            C344357rj r2 = r52.A02;
            C344037rD r4 = r52.A00;
            C363798kM.A00(r4, AnonymousClass05K.A00, "BasicPhotoCaptureCoordinator", r52.hashCode());
            if (r2 != null) {
                xbr.D16();
                C39769A8j a8j = new C39769A8j(xbr, r52);
                C344347ri r22 = (C344347ri) r2;
                C344477rv r03 = r22.A05;
                if (r03 == null) {
                    a8j.A00(new C391719tX(10015, "MediaGraphController is null."));
                } else {
                    r03.getHandler().post(new C40956Am2(a8j, r22));
                }
            } else {
                C391719tX r23 = new C391719tX(10015, "PhotoProcessorComponent is null");
                xbr.D0y(r23);
                C363808kN.A00(r23, r4, "BasicPhotoCaptureCoordinator", "high", r52.hashCode());
            }
        }
    }

    public final AudioServiceConfigurationAnnouncer Adn() {
        C345257tC r0;
        C341427mr r1;
        C345487tZ A002 = A00(this);
        if (A002 == null || (r0 = ((C345467tX) A002).A01) == null || (r1 = ((C345247tB) r0).A02) == null) {
            return null;
        }
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer = r1.A05;
        if (audioServiceConfigurationAnnouncer != null) {
            return audioServiceConfigurationAnnouncer;
        }
        AudioServiceConfigurationAnnouncer audioServiceConfigurationAnnouncer2 = new AudioServiceConfigurationAnnouncer();
        r1.A05 = audioServiceConfigurationAnnouncer2;
        return audioServiceConfigurationAnnouncer2;
    }

    public final void ELe(C344907sc r2) {
        C345167t2 r0;
        C345487tZ A002 = A00(this);
        if (A002 != null && (r0 = ((C345467tX) A002).A00) != null) {
            r0.Ddr(r2);
        }
    }

    public final AudioGraphClientProvider getAudioGraphClientProvider() {
        C345257tC r0;
        C341427mr r02;
        C345487tZ A002 = A00(this);
        if (A002 == null || (r0 = ((C345467tX) A002).A01) == null || (r02 = ((C345247tB) r0).A02) == null) {
            return null;
        }
        return r02.A02();
    }
}
