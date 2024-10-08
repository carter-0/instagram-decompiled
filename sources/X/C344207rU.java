package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import java.util.Map;

/* renamed from: X.7rU  reason: invalid class name and case insensitive filesystem */
public final class C344207rU {
    public final C343827qs A00;

    public final void A03() {
        this.A00.AJF((C342937pP) null);
    }

    public static void A00(FilterModel filterModel, C344207rU r2) {
        C366418ot r0;
        C379089Sl r22 = (C379089Sl) ((AnonymousClass9U1) r2.A02(AnonymousClass9U1.A00));
        if (r22.A01 != filterModel && (r0 = r22.A02) != null) {
            r22.A01 = filterModel;
            r22.A03.A00 = r0.B5x().A00(filterModel);
        }
    }

    public final C345267tD A01(C345277tE r2) {
        C343817qr r0 = (C343817qr) this.A00;
        C343817qr.A01(r0);
        return (C345267tD) r0.A02.A00(r2);
    }

    public final C344277rb A02(C344287rc r2) {
        C343817qr r0 = (C343817qr) this.A00;
        C343817qr.A01(r0);
        return (C344277rb) r0.A02.A00(r2);
    }

    public final void A04() {
        this.A00.disconnect();
    }

    public final boolean A08() {
        C343817qr r2 = (C343817qr) this.A00;
        if (r2.A07 == 3 || r2.A07 == 4) {
            return true;
        }
        return false;
    }

    public C344207rU(C343827qs r1) {
        this.A00 = r1;
    }

    public final void A05() {
        if (A08()) {
            C343817qr r2 = (C343817qr) this.A00;
            synchronized (r2) {
                if (r2.A07 == 3) {
                    r2.A07 = 4;
                    r2.A01.pause();
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot pause in a disconnected state");
    }

    public final void A06() {
        if (A08()) {
            C343817qr r2 = (C343817qr) this.A00;
            if (r2.A07 == 4) {
                synchronized (r2) {
                    if (r2.A07 == 4) {
                        r2.A01.EIx();
                        r2.A07 = 3;
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Cannot resume in a disconnected state");
    }

    public final void A07(C342937pP r9) {
        if (A08()) {
            C343817qr r5 = (C343817qr) this.A00;
            synchronized (r5) {
                C343887qy r7 = r5.A03;
                C343937r3 r6 = C344037rD.A00;
                ((C344037rD) r7.A00(r6)).DD9(28);
                ((C344037rD) r7.A00(r6)).CvU(28, "action", "reconfigure");
                if (r5.A07 == 3 || r5.A07 == 4) {
                    r5.A00 = r9;
                    C342927pO r0 = C342937pP.A03;
                    Map map = r9.A00;
                    r7.A01((String) map.remove(r0), (String) map.remove(C342937pP.A04), (String) map.remove(C342937pP.A01));
                    r5.A01.EAf();
                }
                ((C344037rD) r7.A00(r6)).DD4(28);
            }
            return;
        }
        throw new IllegalStateException("Cannot reconfigure in a disconnected state");
    }
}
