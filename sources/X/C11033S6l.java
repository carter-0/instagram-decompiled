package X;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: X.S6l  reason: case insensitive filesystem */
public abstract class C11033S6l {
    public final int A00;

    public C11033S6l(int i) {
        this.A00 = i;
    }

    public final void A00(Status status) {
        if (this instanceof C8385Qpq) {
            try {
                ((C8385Qpq) this).A00.A0A(status);
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else if (this instanceof C8382Qpn) {
            ((C8382Qpn) this).A01.A02(C9698RfG.A00(status));
        } else {
            ((C8381Qpm) this).A00.A02(new RKT(status));
        }
    }

    public final void A01(AnonymousClass64J r4, boolean z) {
        if (this instanceof C8382Qpn) {
            C365498nD r2 = ((C8382Qpn) this).A01;
            r4.A01.put(r2, Boolean.valueOf(z));
            r2.A00.A03(new C12597Syw(r4, r2));
        } else if (this instanceof C8385Qpq) {
            C8412Qts qts = ((C8385Qpq) this).A00;
            r4.A00.put(qts, Boolean.valueOf(z));
            qts.A02(new SxC(qts, r4));
        }
    }

    public final void A02(AnonymousClass63w r7) {
        C365498nD r0;
        if (this instanceof C8382Qpn) {
            C8382Qpn qpn = (C8382Qpn) this;
            try {
                SFC sfc = qpn.A00;
                sfc.A03.A01.accept(r7.A04, qpn.A01);
            } catch (DeadObjectException e) {
                throw e;
            } catch (RemoteException e2) {
                qpn.A00(new Status(19, 002.A0g(C51968G9o.A16(e2), ": ", e2.getLocalizedMessage())));
            } catch (RuntimeException e3) {
                e = e3;
                r0 = qpn.A01;
                r0.A02(e);
            }
        } else if (this instanceof C8385Qpq) {
            C8385Qpq qpq = (C8385Qpq) this;
            try {
                qpq.A00.A09(r7.A04);
            } catch (RuntimeException e4) {
                qpq.A03(e4);
            }
        } else {
            C8381Qpm qpm = (C8381Qpm) this;
            try {
                if (qpm instanceof C8383Qpo) {
                    C8383Qpo qpo = (C8383Qpo) qpm;
                    C10600Ruu ruu = (C10600Ruu) r7.A08.remove(qpo.A00);
                    if (ruu != null) {
                        ruu.A01.A01.A02.accept(r7.A04, qpo.A00);
                        C10598Rus rus = ruu.A00.A00;
                        rus.A02 = null;
                        rus.A01 = null;
                        return;
                    }
                    C365498nD r02 = qpo.A00;
                    r02.A00.A0F(AnonymousClass7TE.A0u());
                    return;
                }
                C8380Qpl qpl = (C8380Qpl) qpm;
                C10600Ruu ruu2 = qpl.A00;
                C10601Ruv ruv = ruu2.A00;
                ruv.A02.A01.accept(r7.A04, qpl.A00);
                S41 s41 = ruv.A00.A01;
                if (s41 != null) {
                    r7.A08.put(s41, ruu2);
                }
            } catch (DeadObjectException e5) {
                qpm.A00(new Status(19, 002.A0g(C51968G9o.A16(e5), ": ", e5.getLocalizedMessage())));
                throw e5;
            } catch (RemoteException e6) {
                qpm.A00(new Status(19, 002.A0g(C51968G9o.A16(e6), ": ", e6.getLocalizedMessage())));
            } catch (RuntimeException e7) {
                e = e7;
                r0 = qpm.A00;
                r0.A02(e);
            }
        }
    }

    public final void A03(Exception exc) {
        C365498nD r0;
        if (this instanceof C8385Qpq) {
            C8385Qpq qpq = (C8385Qpq) this;
            try {
                qpq.A00.A0A(new Status(10, 002.A0g(C51968G9o.A16(exc), ": ", exc.getLocalizedMessage())));
            } catch (IllegalStateException e) {
                Log.w("ApiCallRunner", "Exception reporting failure", e);
            }
        } else {
            if (this instanceof C8382Qpn) {
                r0 = ((C8382Qpn) this).A01;
            } else {
                r0 = ((C8381Qpm) this).A00;
            }
            r0.A02(exc);
        }
    }
}
