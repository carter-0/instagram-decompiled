package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadKey;

/* renamed from: X.Mko  reason: case insensitive filesystem */
public final class C67254Mko implements C74515PwA {
    public final UserSession A00;
    public final C67098MiI A01;
    public final C74515PwA A02;
    public final Context A03;

    public final void ANa(DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 0);
        this.A01.ANa(directThreadKey);
    }

    public final void A74(C74396PuC puC, AnonymousClass2Ep r3, C254743sy r4, boolean z) {
        if (r4 instanceof DirectThreadKey) {
            this.A01.A74(puC, r3, r4, z);
        } else if (r4 instanceof MsysThreadId) {
            this.A02.A74(puC, r3, r4, z);
        }
    }

    public final void ADw(AnonymousClass2Ep r2) {
        this.A01.ADw(r2);
    }

    public final void AOb(C74396PuC puC, C254743sy r7, boolean z) {
        if (r7 instanceof DirectThreadKey) {
            this.A01.AOb(puC, r7, z);
        } else if (r7 instanceof MsysThreadId) {
            UserSession userSession = this.A00;
            if (182.A06(0Tu.A06, userSession, 2342156064350996112L)) {
                C70266Nzw.A00(this.A03, userSession, new C72649PEc(0, this, r7), r7, AnonymousClass05K.A00);
            } else {
                this.A02.AOb(puC, r7, z);
            }
        } else if (r7 instanceof DirectMsysMixedThreadKey) {
            C70266Nzw.A00(this.A03, this.A00, new C72649PEc(1, this, r7), ((DirectMsysMixedThreadKey) r7).A00, AnonymousClass05K.A00);
        }
    }

    public final void APa(AnonymousClass2Ep r2) {
        this.A01.APa(r2);
    }

    public final void AVn(C254743sy r2, boolean z) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.AVn(r2, z);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.AVn(r2, z);
    }

    public final void CLI(C254743sy r2, boolean z) {
        this.A01.CLI(r2, z);
    }

    public final void Cm4(C254743sy r2, Integer num, boolean z) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.Cm4(r2, num, z);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.Cm4(r2, num, z);
    }

    public final void Cn3(N4G n4g, C254743sy r3, Integer num, boolean z) {
        C67098MiI miI;
        if (r3 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r3 instanceof MsysThreadId) {
            this.A02.Cn3(n4g, r3, num, z);
            return;
        } else if (r3 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r3 = ((DirectMsysMixedThreadKey) r3).A00;
        } else {
            return;
        }
        miI.Cn3(n4g, r3, num, z);
    }

    public final void Cov(C254743sy r2) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.Cov(r2);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.Cov(r2);
    }

    public final void Cox(C254743sy r2) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.Cox(r2);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.Cox(r2);
    }

    public final void Coy(C254743sy r2, int i) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.Coy(r2, i);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.Coy(r2, i);
    }

    public final void Cp1(C254743sy r2) {
        if (r2 instanceof DirectThreadKey) {
            this.A01.Cp1(r2);
            return;
        }
        throw C66583MXo.A0Z();
    }

    public final void Cp6(C254743sy r2, int i) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.Cp6(r2, i);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.Cp6(r2, i);
    }

    public final void E1K(AnonymousClass2Ep r2) {
        this.A01.E1K(r2);
    }

    public final void E1N(C254743sy r3, boolean z) {
        C67098MiI miI;
        if (r3 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r3 instanceof MsysThreadId) {
            this.A02.E1N(r3, z);
            return;
        } else if (r3 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r3 = ((DirectMsysMixedThreadKey) r3).A00;
        } else {
            throw C51973G9u.A0g(r3, "Debug info don't support ", AnonymousClass7TE.A1A());
        }
        miI.E1N(r3, z);
    }

    public final void E2j(AnonymousClass2Ep r2) {
        this.A01.E2j(r2);
    }

    public final void EEU(AnonymousClass2Ep r2) {
        this.A01.EEU(r2);
    }

    public final void EEk(AnonymousClass2Ep r2, Integer num) {
        this.A01.EEk(r2, num);
    }

    public final void EGL(AnonymousClass2Ep r2) {
        this.A01.EGL(r2);
    }

    public final void EIw(AnonymousClass2Ep r2) {
        this.A01.EIw(r2);
    }

    public final void Ev7(AnonymousClass2Ep r2) {
        this.A01.Ev7(r2);
    }

    public final void FHL(AnonymousClass2Ep r2, boolean z) {
        this.A01.FHL(r2, z);
    }

    public final void FIW(C254743sy r2, boolean z) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.FIW(r2, z);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.FIW(r2, z);
    }

    public final void FIh(C254743sy r2) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.FIh(r2);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.FIh(r2);
    }

    public final void FIj(C254743sy r2) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.FIj(r2);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.FIj(r2);
    }

    public final void FIl(C254743sy r2) {
        if (r2 instanceof DirectThreadKey) {
            this.A01.FIl(r2);
            return;
        }
        throw C66583MXo.A0Z();
    }

    public final void FIo(C254743sy r2) {
        C67098MiI miI;
        if (r2 instanceof DirectThreadKey) {
            miI = this.A01;
        } else if (r2 instanceof MsysThreadId) {
            this.A02.FIo(r2);
            return;
        } else if (r2 instanceof DirectMsysMixedThreadKey) {
            miI = this.A01;
            r2 = ((DirectMsysMixedThreadKey) r2).A00;
        } else {
            return;
        }
        miI.FIo(r2);
    }

    public C67254Mko(Context context, UserSession userSession, C67098MiI miI, C74515PwA pwA) {
        C51972G9s.A1D(miI, pwA);
        this.A03 = context;
        this.A00 = userSession;
        this.A01 = miI;
        this.A02 = pwA;
    }

    public final void AOc(C254743sy r2) {
        throw C66583MXo.A0Z();
    }
}
