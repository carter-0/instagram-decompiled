package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.MfW  reason: case insensitive filesystem */
public final class C66937MfW implements C74566PxF {
    public boolean A00;
    public final AnonymousClass1aS A01;
    public final AnonymousClass1aS A02;
    public final AnonymousClass1aS A03;
    public final AnonymousClass1aS A04;
    public final AnonymousClass1aS A05;
    public final AnonymousClass1aS A06 = 1aF.A01(new C67248Mki());
    public final AnonymousClass1aS A07;
    public final AnonymousClass1aS A08;
    public final 1aU A09;
    public final UserSession A0A;
    public final C67250Mkk A0B;
    public final 1aU A0C;
    public final C269794fh A0D;
    public final 1a8 A0E;

    public C66937MfW(1aU r4, 1aU r5, C269794fh r6, UserSession userSession, C67250Mkk mkk, 2EM r9, boolean z, boolean z2, boolean z3) {
        this.A0A = userSession;
        this.A0B = mkk;
        this.A0C = r4;
        this.A09 = r5;
        this.A0D = r6;
        AnonymousClass1aS A002 = 1aF.A00();
        this.A07 = A002;
        this.A05 = 1aF.A01(r9);
        this.A01 = 1aF.A01(Boolean.valueOf(z));
        this.A04 = 1aF.A01(AnonymousClass7TE.A0u());
        this.A02 = 1aF.A01(Boolean.valueOf(z2));
        this.A03 = 1aF.A01(Boolean.valueOf(z3));
        this.A08 = 1aF.A01(true);
        this.A0E = C66581MXm.A0P();
        A002.accept(C2612848z.A00);
    }

    public final void AWs() {
    }

    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Auh() {
        return null;
    }

    public final int CBm() {
        return 0;
    }

    public final void FMN(AnonymousClass2Ep r1) {
    }

    public final void FMO(Set set) {
    }

    public final C67307Mlh AF9() {
        C74549Pwi pwi;
        C257443xP r0 = (C257443xP) this.A07.A0X();
        if (r0 == null || (pwi = (C74549Pwi) r0.A04()) == null) {
            return new C67307Mlh(0, 0, 0, 0);
        }
        int count = pwi.getCount();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < count; i3++) {
            if (pwi.Cdu(i3)) {
                i++;
                if (!pwi.CXv(i3)) {
                    i2++;
                }
            }
        }
        return new C67307Mlh(i, 0, i, i2);
    }

    public final void EaE(boolean z) {
        C66580MXl.A1O(this.A01, z);
    }

    public final void EaI(boolean z) {
        C66580MXl.A1O(this.A02, z);
    }

    public final void EaJ(boolean z) {
        C66580MXl.A1O(this.A03, z);
    }

    public final void EaT(boolean z) {
        C66580MXl.A1O(this.A04, z);
    }

    public final void EaU(boolean z) {
        if (182.A06(0Tu.A05, this.A0A, 36325892791743823L)) {
            this.A00 = false;
            C66580MXl.A1O(this.A08, z);
            return;
        }
        this.A00 = true;
    }

    public final void Eji(2EM r2) {
        this.A05.accept(r2);
    }

    public final void Ejj(C254743sy r3) {
        AnonymousClass1aS r1 = this.A06;
        if (!r3.equals(r1.A0X())) {
            r1.accept(r3);
        }
    }

    public final 1aU FN4() {
        AnonymousClass1aS r9 = this.A07;
        1aU A0D2 = this.A05.A0D();
        1aU A0D3 = this.A01.A0D();
        1aU A0D4 = this.A04.A0D();
        1aU A0D5 = this.A02.A0D();
        1aU A0D6 = this.A03.A0D();
        1aU A0D7 = this.A06.A0D();
        1aU r1 = this.A09;
        C67257Mkr mkr = C67257Mkr.A00;
        1aJ r92 = r9.A00;
        1aJ r10 = A0D2.A00;
        1aJ r11 = A0D3.A00;
        1aJ r12 = A0D4.A00;
        1aJ r13 = A0D5.A00;
        1aJ r14 = A0D6.A00;
        1aJ r15 = A0D7.A00;
        C65071aK r3 = r1.A00;
        mkr.getClass();
        C67282MlH mlH = new C67282MlH(mkr);
        1aP.A01(r92, "source1 is null");
        1aP.A01(r10, "source2 is null");
        1aP.A01(r11, "source3 is null");
        1aP.A01(r12, "source4 is null");
        1aP.A01(r13, "source5 is null");
        1aP.A01(r14, "source6 is null");
        1aP.A01(r15, "source7 is null");
        1aP.A01(r3, "source8 is null");
        1aU r32 = new 1aU(1aJ.A00(new Mf5(mlH), new C65071aK[]{r92, r10, r11, r12, r13, r14, r15, r3}, XCq.A00));
        UserSession userSession = this.A0A;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession, 36325892791743823L)) {
            r32 = C72120Owf.A02(1aU.A01(C67530MpP.A00, r32, this.A08.A0D()), new C74182PqO(this, 1), 32);
            0qQ.A0A(r32);
        }
        C269794fh r2 = this.A0D;
        C67253Mkn mkn = new C67253Mkn(new C67255Mkp(r32.A00));
        C318206oZ r22 = r2.A00;
        1aP.A01(r22, "scheduler is null");
        1aU A002 = C72120Owf.A00(new 1aU(new C21107XEx(new C67228MkO(mkn, r22))), this, 33);
        if (!182.A06(r5, userSession, 36325892791940434L)) {
            return A002;
        }
        1aU A0I = A002.A0I(new C67578MqC(C66734Mbf.A00, 1));
        0qQ.A0A(A0I);
        return A0I;
    }

    public final void cancel() {
        this.A0E.A01();
    }

    public final void start() {
        this.A0E.A02(this.A0C, this.A07);
    }
}
