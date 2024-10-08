package X;

import android.animation.AnimatorSet;

/* renamed from: X.Mfk  reason: case insensitive filesystem */
public abstract class C66951Mfk {
    public static final void A03(C74500Pvu pvu, Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            C309426Yf Bkh = pvu.Bkh();
            if (Bkh != null && !Bkh.A0j) {
                pvu.start();
                return;
            }
        } else if (intValue != 2) {
            A00(pvu);
            return;
        }
        pvu.Eu9();
    }

    public static final void A00(C74500Pvu pvu) {
        AnimatorSet Abq = pvu.Abq();
        if (Abq != null) {
            Abq.cancel();
        }
        C309426Yf Bkh = pvu.Bkh();
        if (Bkh != null) {
            Bkh.A0j = false;
        }
    }

    public static final void A01(C74500Pvu pvu) {
        AnimatorSet Abq = pvu.Abq();
        if (Abq != null) {
            Abq.cancel();
        }
        pvu.Eqh();
        C309426Yf Bkh = pvu.Bkh();
        if (Bkh != null) {
            Bkh.A0j = true;
        }
    }

    public static final void A02(C74500Pvu pvu) {
        AnimatorSet Abq = pvu.Abq();
        if (Abq == null) {
            pvu.EOh();
            Abq = pvu.Abq();
        } else {
            Abq.cancel();
        }
        pvu.EIN();
        if (Abq != null) {
            Abq.start();
        }
    }
}
