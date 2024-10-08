package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.camera.effect.models.CameraAREffect;

/* renamed from: X.8qf  reason: invalid class name and case insensitive filesystem */
public final class C367388qf implements C367398qg {
    public CameraAREffect A00;
    public final C368528sn A01;
    public final C367378qe A02;

    public final synchronized void ENO(CameraAREffect cameraAREffect) {
        C366438ov r0;
        this.A00 = cameraAREffect;
        C368528sn r02 = this.A01;
        if (r02 != null) {
            r02.A0D(cameraAREffect);
        }
        C367378qe r03 = this.A02;
        boolean z = false;
        if (cameraAREffect != null) {
            z = true;
        }
        C344207rU r1 = r03.A00;
        if (!(r1 == null || !r1.A08() || (r0 = (C366438ov) r1.A02(C366438ov.A00)) == null)) {
            ((C366428ou) r0).A00.A00 = Boolean.valueOf(z);
        }
    }

    public final void A9X(AnonymousClass82C r2) {
        C368528sn r0 = this.A01;
        if (r0 != null) {
            r0.A0G.add(r2);
        }
    }

    public final EffectAttribution Azz() {
        C361848gv r0;
        C368528sn r2 = this.A01;
        if (r2 == null || (r0 = r2.A01) == null || r0.A0D() == null) {
            return null;
        }
        return r2.A01.A0D().mAttribution;
    }

    public final void E22() {
        C367448ql r0;
        C368528sn r02 = this.A01;
        if (r02 != null && (r0 = r02.A03) != null) {
            r0.pause();
        }
    }

    public final void EEG(AnonymousClass82C r2) {
        C368528sn r0 = this.A01;
        if (r0 != null) {
            r0.A0G.remove(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.7sc] */
    public final void EHv() {
        C367448ql r2;
        C368528sn r0 = this.A01;
        if (r0 != null && (r2 = r0.A03) != null) {
            ? obj = new Object();
            C361848gv r02 = r0.A01;
            if (r02 != null) {
                r2.EMY(obj, r02);
            } else {
                r2.EMX(obj);
            }
        }
    }

    public final void EJ2() {
        C368528sn r0 = this.A01;
        if (r0 != null) {
            r0.A0B();
        }
    }

    public C367388qf(C368528sn r1, C367378qe r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
