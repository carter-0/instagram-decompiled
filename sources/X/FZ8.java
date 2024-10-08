package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class FZ8 implements AnonymousClass11X {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FZ8(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    public final String getName() {
        switch (this.A00) {
            case 0:
                return "CreateBusinessAccountOnSuccess";
            case 1:
                return "FacebookLoginOnSuccess";
            default:
                return null;
        }
    }

    public final int getRunnableId() {
        switch (this.A00) {
            case 0:
                return 289;
            case 1:
                return 248;
            default:
                return 0;
        }
    }

    public final void onCancel() {
    }

    public final void onFinish() {
        switch (this.A00) {
            case 0:
                EDZ.A00((EDZ) this.A01, (UserSession) this.A03, (DwQ) this.A02);
                return;
            case 1:
                C47669ECd eCd = (C47669ECd) this.A01;
                User user = (User) this.A02;
                EEK eek = eCd.A07;
                if (eek != null) {
                    eek.A00();
                }
                eCd.A01.post(new C51384FtG(eCd, user));
                return;
            default:
                return;
        }
    }

    public final void onStart() {
    }

    public final void run() {
        183.A01.A04((UserSession) this.A03);
    }
}
