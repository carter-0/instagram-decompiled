package X;

import android.media.AudioManager;
import android.view.KeyEvent;

public final class IOD implements AnonymousClass4DM {
    public final int A00;
    public final Object A01;

    public IOD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r7, KeyEvent keyEvent) {
        switch (this.A00) {
            case 0:
                boolean A1U = AnonymousClass7TF.A1U(0, r7, keyEvent);
                AnonymousClass6D9 r2 = (AnonymousClass6D9) this.A01;
                if (!AnonymousClass6D9.A00(r2).A0F()) {
                    return false;
                }
                if (r2.A06()) {
                    if (r7 != AnonymousClass5FQ.VOLUME_UP) {
                        return false;
                    }
                    r2.A02(Integer.valueOf(keyEvent.getKeyCode()), false);
                    return true;
                } else if (r7 != AnonymousClass5FQ.VOLUME_DOWN) {
                    return false;
                } else {
                    AudioManager audioManager = r2.A03;
                    0qQ.A0B(audioManager, 0);
                    if (audioManager.getStreamVolume(3) != 0) {
                        return false;
                    }
                    r2.A02(Integer.valueOf(keyEvent.getKeyCode()), A1U);
                    return true;
                }
            case 1:
                0qQ.A0B(r7, 0);
                C55870Hor hor = (C55870Hor) this.A01;
                C14044Tol tol = hor.A04;
                if (!tol.A0F()) {
                    return false;
                }
                C284945Oz r1 = hor.A00;
                if (!C51971G9r.A1W(r1) || r7 != AnonymousClass5FQ.VOLUME_UP) {
                    return false;
                }
                C51967G9n.A16(r1, !C51971G9r.A1W(r1));
                tol.A03(C51970G9q.A01(C51971G9r.A1W(r1) ? 1 : 0), 0);
                return true;
            default:
                boolean A1Z = AnonymousClass7TG.A1Z(r7, keyEvent);
                C52016GBn gBn = (C52016GBn) this.A01;
                C267324bN A002 = C52016GBn.A00(gBn);
                if (A002 == null) {
                    return true;
                }
                int i = 25;
                if (r7 == AnonymousClass5FQ.VOLUME_UP) {
                    i = 24;
                }
                if (keyEvent.getAction() != 0) {
                    return true;
                }
                int i2 = -1;
                if (i == 24) {
                    i2 = 1;
                }
                gBn.A07 = A1Z;
                if (!AnonymousClass3ZJ.A0D(gBn.A0E, A002.A02)) {
                    0nY.A00().ATE(new C52360GPf(A002, gBn, i2, i));
                }
                for (JRF Dzr : gBn.A0I) {
                    Dzr.Dzr(A002, gBn.A0B, gBn.A0V());
                }
                return true;
        }
    }
}
