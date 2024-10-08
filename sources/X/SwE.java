package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

public final class SwE implements AnonymousClass5NJ {
    public int A00;
    public float A01 = 1.0f;
    public AnonymousClass5Mx A02;
    public final AudioManager A03;
    public final C11450SVm A04;

    public final int FJe(boolean z, int i) {
        if (this.A00 != 0) {
            A01(this, 0);
        }
        return z ? 1 : -1;
    }

    public final void release() {
        this.A02 = null;
        if (this.A00 != 0) {
            A01(this, 0);
        }
    }

    public static void A00(SwE swE, int i) {
        AnonymousClass5Mx r0 = swE.A02;
        if (r0 != null) {
            C284515Mu r2 = ((C284525Mv) r0).A00;
            boolean Bd1 = r2.Bd1();
            int i2 = 1;
            if (Bd1 && i != 1) {
                i2 = 2;
            }
            C284515Mu.A0F(r2, i, i2, Bd1);
        }
    }

    public static void A01(SwE swE, int i) {
        if (swE.A00 != i) {
            swE.A00 = i;
            float f = 1.0f;
            if (i == 3) {
                f = 0.2f;
            }
            if (swE.A01 != f) {
                swE.A01 = f;
                AnonymousClass5Mx r0 = swE.A02;
                if (r0 != null) {
                    C284515Mu r3 = ((C284525Mv) r0).A00;
                    C284515Mu r02 = C284515Mu.$redex_init_class;
                    C284515Mu.A0I(r3, Float.valueOf(r3.A00 * r3.A0Z.CFw()), 1, 2);
                }
            }
        }
    }

    public final float CFw() {
        return this.A01;
    }

    public SwE(Context context, Handler handler, AnonymousClass5Mx r5) {
        Object systemService = context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        systemService.getClass();
        this.A03 = (AudioManager) systemService;
        this.A02 = r5;
        this.A04 = new C11450SVm(handler, this);
        this.A00 = 0;
    }
}
