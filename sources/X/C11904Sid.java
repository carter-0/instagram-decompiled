package X;

import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sid  reason: case insensitive filesystem */
public final class C11904Sid implements C13766Tge, C13695TfD {
    public final C13766Tge A00;
    public final S77 A01;
    public volatile int A02;
    public volatile C11882SiF A03;
    public volatile C11854Shg A04;
    public volatile C10528Rth A05;
    public volatile Object A06;

    public final void D7l(C13892TjF tjF, C13812Thf thf, Exception exc, Integer num) {
        this.A00.D7l(tjF, thf, exc, this.A05.A01.AvP());
    }

    public final void D7m(C13892TjF tjF, C13892TjF tjF2, C13812Thf thf, Integer num, Object obj) {
        C13892TjF tjF3 = tjF;
        this.A00.D7m(tjF, tjF3, thf, this.A05.A01.AvP(), obj);
    }

    public final boolean ExI() {
        S77 s77;
        C13529Tc1 tc1;
        boolean z = true;
        if (this.A06 != null) {
            Object obj = this.A06;
            this.A06 = null;
            try {
                SystemClock.elapsedRealtimeNanos();
                try {
                    S77 s772 = this.A01;
                    C13694TfC A002 = C13882Tj5.A00(s772).A00(obj);
                    Object EJO = A002.EJO();
                    C10176Rnr rnr = C13882Tj5.A00(s772).A03;
                    Class<?> cls = EJO.getClass();
                    synchronized (rnr) {
                        Iterator it = rnr.A00.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                tc1 = null;
                                break;
                            }
                            C10369Rr6 rr6 = (C10369Rr6) it.next();
                            if (rr6.A01.isAssignableFrom(cls)) {
                                tc1 = rr6.A00;
                                break;
                            }
                        }
                    }
                    if (tc1 != null) {
                        VUR vur = new VUR(tc1, s772.A05, EJO);
                        C11854Shg shg = new C11854Shg(this.A05.A00, s772.A04);
                        C13696TfE A003 = s772.A07.A00();
                        A003.E5J(shg, vur);
                        if (Log.isLoggable("SourceGenerator", 2)) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        if (A003.AXD(shg) != null) {
                            this.A04 = shg;
                            this.A03 = new C11882SiF(this, s772, Collections.singletonList(this.A05.A00));
                            this.A05.A01.cleanup();
                        } else {
                            Log.isLoggable("SourceGenerator", 3);
                            try {
                                C13766Tge tge = this.A00;
                                C13892TjF tjF = this.A05.A00;
                                Object EJO2 = A002.EJO();
                                tge.D7m(tjF, this.A05.A00, this.A05.A01, this.A05.A01.AvP(), EJO2);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    } else {
                        th = new RuntimeException(AnonymousClass7TG.A0m(cls, "Failed to find source encoder for data class: ", AnonymousClass7TE.A1A()));
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.A05.A01.cleanup();
                    throw th;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.A03 == null || !this.A03.ExI()) {
            this.A03 = null;
            this.A05 = null;
            z = false;
            while (true) {
                int i = this.A02;
                s77 = this.A01;
                if (i >= s77.A03().size()) {
                    break;
                }
                List A032 = s77.A03();
                int i2 = this.A02;
                this.A02 = i2 + 1;
                this.A05 = (C10528Rth) A032.get(i2);
                if (this.A05 != null) {
                    C10112Rmo rmo = s77.A06;
                    Integer AvP = this.A05.A01.AvP();
                    if (!(rmo instanceof QH3)) {
                        if (!(!(rmo instanceof QH2) || AvP == AnonymousClass05K.A0C || AvP == AnonymousClass05K.A0Y)) {
                            break;
                        }
                    } else if (AnonymousClass7TF.A1W(AvP, AnonymousClass05K.A01)) {
                        break;
                    }
                    if (s77.A01(this.A05.A01.AvH()) != null) {
                        break;
                    }
                }
            }
            this.A05.A01.CgB(s77.A03, new C11881SiE(this, this.A05));
            return true;
        }
        return z;
    }

    public final void cancel() {
        C10528Rth rth = this.A05;
        if (rth != null) {
            rth.A01.cancel();
        }
    }

    public C11904Sid(C13766Tge tge, S77 s77) {
        this.A01 = s77;
        this.A00 = tge;
    }

    public final void EHo() {
        throw C66580MXl.A11();
    }
}
