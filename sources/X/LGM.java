package X;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public final class LGM {
    public LWW A00;
    public Runnable A01;
    public final Choreographer A02;
    public final TiltShiftOverlayFilter A03;
    public final FilterGroupModel A04;
    public final Handler A05 = AnonymousClass7TF.A0D();

    public final void A01(C353998Kg r10) {
        A00();
        this.A04.EWl(21, true);
        float f = this.A03.A00;
        LWW lww = new LWW(this, r10, f, 0.9f, (long) (((0.9f - f) * 1.5E8f) / 0.9f));
        this.A00 = lww;
        this.A02.postFrameCallback(lww);
    }

    public final void A03(C353998Kg r9) {
        A00();
        float f = this.A03.A00;
        LWW lww = new LWW(this, r9, f, 0.0f, (long) ((7.5E8f * f) / 0.9f));
        this.A00 = lww;
        this.A02.postFrameCallback(lww);
    }

    public final void A00() {
        LWW lww = this.A00;
        if (lww != null) {
            lww.A06.A04.EWl(21, false);
            lww.A01 = true;
            this.A02.removeFrameCallback(lww);
            this.A00 = null;
        }
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A05.removeCallbacks(runnable);
            this.A01 = null;
        }
    }

    public LGM(FilterGroupModel filterGroupModel) {
        this.A04 = filterGroupModel;
        TiltShiftOverlayFilter A002 = C64002LIe.A00(filterGroupModel);
        this.A03 = A002;
        Choreographer instance = Choreographer.getInstance();
        0qQ.A07(instance);
        this.A02 = instance;
        A002.A00 = 0.0f;
    }

    public final void A02(C353998Kg r5) {
        A01(r5);
        M7E m7e = new M7E(this, r5);
        this.A01 = m7e;
        this.A05.postDelayed(m7e, 650);
    }
}
