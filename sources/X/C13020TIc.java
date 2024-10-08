package X;

import android.os.Bundle;

/* renamed from: X.TIc  reason: case insensitive filesystem */
public final /* synthetic */ class C13020TIc implements Runnable {
    public final /* synthetic */ SOK A00;
    public final /* synthetic */ C11000S4u A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C13020TIc(SOK sok, C11000S4u s4u, boolean z) {
        this.A01 = s4u;
        this.A02 = z;
        this.A00 = sok;
    }

    public final void run() {
        C8991RKj rKj;
        C11000S4u s4u = this.A01;
        boolean z = this.A02;
        SOK sok = this.A00;
        C10405Rrh rrh = s4u.A02;
        C13425TaB taB = rrh.A00;
        if (taB instanceof C13424TaA) {
            if (taB instanceof C13945Tlr) {
                s4u.A04.A01(C66580MXl.A1b(rrh.A01));
            }
            C11183SEj sEj = s4u.A05;
            try {
                SO5 so5 = sEj.A00;
                String A002 = sEj.A02.A01.A02.A00();
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("package_name", A002);
                A0a.putBoolean("allow_download_over_metered_network", z);
                A0a.putBundle("utm", sok.A02());
                SO5.A00(A0a, so5, "install");
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
                sEj.A01.Ew3("OxygenInstallSDK_UNEXPECTED_INSTALL_EXCEPTION", e5);
                sEj.A02.A01(C11183SEj.A00(e5, sEj));
                return;
            }
        } else {
            return;
        }
        throw rKj;
    }
}
