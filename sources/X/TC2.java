package X;

import android.os.Bundle;

public final /* synthetic */ class TC2 implements Runnable {
    public final /* synthetic */ C11000S4u A00;

    public /* synthetic */ TC2(C11000S4u s4u) {
        this.A00 = s4u;
    }

    public final void run() {
        C8991RKj rKj;
        C11000S4u s4u = this.A00;
        if (s4u.A02.A00 instanceof C13423Ta9) {
            C11183SEj sEj = s4u.A05;
            try {
                SO5 so5 = sEj.A00;
                String A002 = sEj.A02.A01.A02.A00();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("package_name", A002);
                SO5.A00(A0a, so5, "cancel");
                return;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                rKj = new C8991RKj(RFF.INTERNAL_UNRECOVERABLE, e);
            } catch (IllegalStateException e2) {
                rKj = new C8991RKj(RFF.UNKNOWN, (Throwable) e2);
            } catch (C8991RKj e3) {
                throw e3;
            } catch (Exception e4) {
                rKj = new C8991RKj(RFF.UNKNOWN, (Throwable) e4);
            } catch (C8991RKj e5) {
                sEj.A01.Ew3("OxygenInstallSDK_UNEXPECTED_CANCEL_EXCEPTION", e5);
                sEj.A02.A01(C11183SEj.A00(e5, sEj));
                return;
            }
        } else {
            return;
        }
        throw rKj;
    }
}
