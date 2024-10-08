package X;

import android.animation.Animator;
import android.content.Context;

public final class WK1 implements C253183qL {
    public final /* synthetic */ C18434Vrd A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ String A03;

    public WK1(C18434Vrd vrd, C307786Rm r2, C276544tV r3, String str) {
        this.A00 = vrd;
        this.A02 = r3;
        this.A03 = str;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        U0H u0h;
        C18434Vrd vrd = this.A00;
        UKL ukl = vrd.A01;
        String str = ukl.A03;
        boolean z = ukl.A04;
        int i = ukl.A01;
        float f = ukl.A00;
        0qQ.A0B(str, 0);
        C276544tV r4 = this.A02;
        C277014uI A08 = r4.A08();
        if (A08 != null) {
            u0h = new U0H(0, this.A01, r4, A08);
        } else {
            u0h = null;
        }
        String str2 = this.A03;
        if (!0qQ.A0K(str2, ukl.A03)) {
            z = r4.A0R(35, true);
            i = r4.A03(38, 1);
            f = 0.0f;
        }
        ukl.A03 = str2;
        ukl.A04 = z;
        ukl.A01 = i;
        ukl.A02 = u0h;
        ukl.A00 = f;
        if (vrd.A00 != null) {
            C18434Vrd.A00(vrd);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        float BhR;
        C18434Vrd vrd = this.A00;
        C226492gu r3 = vrd.A00;
        if (r3 != null) {
            UKL ukl = vrd.A01;
            if (r3.isFinished()) {
                ukl.A04 = false;
                BhR = 1.0f;
            } else {
                ukl.A04 = r3.isPlaying();
                if (ukl.A01 != 0) {
                    ukl.A01 = r3.Bm3();
                }
                BhR = r3.BhR();
            }
            ukl.A00 = BhR;
            Animator.AnimatorListener animatorListener = ukl.A02;
            if (animatorListener != null) {
                r3.EDp(animatorListener);
            }
            r3.pause();
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
