package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.MfV  reason: case insensitive filesystem */
public final class C66936MfV implements C74566PxF {
    public final UserSession A00;
    public final C74480Pva A01;
    public final C74566PxF A02;
    public final C74566PxF A03;

    public final C67307Mlh AF9() {
        C67307Mlh AF9 = this.A02.AF9();
        C67307Mlh AF92 = this.A03.AF9();
        return new C67307Mlh(AF9.A02 + AF92.A02, AF9.A01 + AF92.A01, AF9.A00 + AF92.A00, AF9.A03 + AF92.A03);
    }

    public final void AWs() {
        this.A02.AWs();
        this.A03.AWs();
    }

    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Auh() {
        return this.A02.Auh();
    }

    public final int CBm() {
        return this.A02.CBm() + this.A03.CBm();
    }

    public final void EaE(boolean z) {
        this.A02.EaE(z);
        this.A03.EaE(z);
    }

    public final void EaI(boolean z) {
        this.A02.EaI(z);
        this.A03.EaI(z);
    }

    public final void EaJ(boolean z) {
        this.A02.EaJ(z);
        this.A03.EaJ(z);
    }

    public final void EaT(boolean z) {
        this.A02.EaT(z);
        this.A03.EaT(z);
    }

    public final void EaU(boolean z) {
        this.A02.EaU(z);
        this.A03.EaU(z);
    }

    public final void Eji(2EM r2) {
        this.A02.Eji(r2);
        this.A03.Eji(r2);
    }

    public final void Ejj(C254743sy r2) {
        this.A02.Ejj(r2);
        this.A03.Ejj(r2);
    }

    public final void FMN(AnonymousClass2Ep r2) {
        this.A02.FMN(r2);
        this.A03.FMN(r2);
    }

    public final void FMO(Set set) {
        this.A02.FMO(set);
        this.A03.FMO(set);
    }

    public final 1aU FN4() {
        1aU A032;
        boolean A06 = 182.A06(0Tu.A05, this.A00, 36313055140447923L);
        1aU FN4 = this.A02.FN4();
        1aU FN42 = this.A03.FN4();
        1aU ANW = this.A01.ANW();
        if (A06) {
            A032 = 1aU.A03(C71997OuX.A00, FN4, FN42, ANW).A0S(new PU8(this, 50)).A0L(C72096Ow9.A00);
        } else {
            A032 = 1aU.A03(C66747Mbs.A00, FN4, FN42, ANW);
        }
        0qQ.A0A(A032);
        return A032;
    }

    public final void cancel() {
        this.A02.cancel();
        this.A03.cancel();
        this.A01.stop();
    }

    public final void start() {
        this.A02.start();
        this.A03.start();
        C74480Pva pva = this.A01;
        pva.start();
        pva.CgG();
    }

    public C66936MfV(UserSession userSession, C74566PxF pxF, C74566PxF pxF2) {
        AnonymousClass7TG.A1O(pxF, pxF2);
        this.A02 = pxF;
        this.A03 = pxF2;
        this.A00 = userSession;
        this.A01 = C67252Mkm.A00(userSession);
    }
}
