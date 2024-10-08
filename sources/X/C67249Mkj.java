package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.Mkj  reason: case insensitive filesystem */
public final class C67249Mkj implements C74515PwA {
    public C68966Nbt A00;
    public final UserSession A01;
    public final Context A02;
    public final AnonymousClass4DH A03;
    public final AnonymousClass0iw A04;
    public final 1a8 A05 = C66581MXm.A0P();
    public final AnonymousClass6EZ A06;

    public final void A74(C74396PuC puC, AnonymousClass2Ep r12, C254743sy r13, boolean z) {
        List list;
        List list2;
        Context context = this.A02;
        UserSession userSession = this.A01;
        String C6C = r12.C6C();
        if (C6C != null) {
            list = AnonymousClass7TE.A1I(C6C);
        } else {
            list = 0sn.A00;
        }
        AnonymousClass0iw r3 = this.A04;
        N4G n4g = new N4G(r12.B6d());
        C68998Nca nca = new C68998Nca(puC, r12);
        List AxI = r12.AxI();
        if (AxI != null) {
            list2 = AnonymousClass7TE.A1I(AxI);
        } else {
            list2 = 0sn.A00;
        }
        C71131OdU.A00(context, n4g, r3, userSession, nca, list, list2, true, z);
    }

    public final void AOc(C254743sy r4) {
        0qQ.A0B(r4, 0);
        UserSession userSession = this.A01;
        C3265677h.A0j(userSession, r4);
        C68966Nbt nbt = new C68966Nbt(this.A02, userSession);
        this.A00 = nbt;
        nbt.A05(r4, true);
    }

    public final void E1N(C254743sy r6, boolean z) {
        Activity rootActivity = this.A03.getRootActivity();
        0qQ.A0A(rootActivity);
        String valueOf = String.valueOf(C66647MaG.A00(r6));
        0qQ.A0B(rootActivity, 0);
        C358248ab A0X = DbS.A0X(rootActivity);
        A0X.A0d((DialogInterface.OnClickListener) null, "Ok");
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Is Instamadillo cutover thread: ");
        A1A.append(z);
        A1A.append("\nIs legacy Armadillo thread: ");
        A1A.append(true);
        A1A.append("\nThreadId: ");
        A0X.A0q(AnonymousClass7TF.A0l(valueOf, A1A));
        DbT.A1V(A0X);
    }

    public final void FIh(C254743sy r6) {
        C254793t3 A08 = C66647MaG.A08(r6);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A04(this.A04, A08, C66581MXm.A0l(A08), false);
        }
        this.A05.A02(C66582MXn.A0N(this.A06.A00.A01.A0M(new C72008Oui(C66647MaG.A00(r6))), "tam_unmute_thread_mentions"), PTL.A00);
    }

    public final void FIj(C254743sy r6) {
        C254793t3 A08 = C66647MaG.A08(r6);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A03(this.A04, A08, C66581MXm.A0l(A08), false);
        }
        UserSession userSession = this.A01;
        C71031OZi.A01(userSession).A02(C66647MaG.A00(r6));
    }

    public final void FIo(C254743sy r7) {
        UserSession userSession = this.A01;
        C71005OWe A002 = C70129Nxj.A00(userSession);
        AnonymousClass0iw r2 = this.A04;
        C254793t3 A08 = C66647MaG.A08(r7);
        if (A08 != null) {
            A002.A05(r2, A08, AnonymousClass7TE.A0v(), false);
            C66647MaG.A0D(userSession, r7);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void AOb(C74396PuC puC, C254743sy r6, boolean z) {
        C70266Nzw.A00(this.A02, this.A01, new C72649PEc(3, this, r6), r6, AnonymousClass05K.A0N);
    }

    public final void CLI(C254743sy r3, boolean z) {
        throw new C318126oR(002.A0R(AnonymousClass000.A00(418), "Not yet implemented"));
    }

    public final void Cm4(C254743sy r3, Integer num, boolean z) {
        MYY.A01("markThreadAsUnread").execute(new C73208PYm(this, r3));
    }

    public final void Cn3(N4G n4g, C254743sy r8, Integer num, boolean z) {
        int i = n4g.A00;
        boolean A1Q = AnonymousClass7TF.A1Q(i);
        this.A05.A02(C66582MXn.A0N(this.A06.A00.A01.A0M(new C72031Ov6(C66647MaG.A00(r8), A1Q ? 1 : 0, i)), "tam_move_ig_folder"), PTJ.A00);
    }

    public final void Cp6(C254743sy r8, int i) {
        UserSession userSession = this.A01;
        C71005OWe A002 = C70129Nxj.A00(userSession);
        AnonymousClass0iw r3 = this.A04;
        C254793t3 A08 = C66647MaG.A08(r8);
        if (A08 != null) {
            A002.A05(r3, A08, true, true);
            C70113NxT.A00(userSession).A00(C66647MaG.A00(r8), ((long) i) * 1000);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C67249Mkj(Context context, AnonymousClass4DH r3, UserSession userSession) {
        this.A02 = context;
        this.A03 = r3;
        this.A01 = userSession;
        this.A06 = AnonymousClass6EY.A00(userSession, "MsysInboxSecureThreadActionController");
        this.A04 = r3;
    }

    public final void ADw(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void ANa(DirectThreadKey directThreadKey) {
        throw C66583MXo.A0Z();
    }

    public final void APa(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void AVn(C254743sy r2, boolean z) {
        throw C66583MXo.A0Z();
    }

    public final void Cov(C254743sy r6) {
        C254793t3 A08 = C66647MaG.A08(r6);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A04(this.A04, A08, C66581MXm.A0l(A08), true);
        }
        this.A05.A02(C66582MXn.A0N(this.A06.A00.A01.A0M(new C72009Ouj(C66647MaG.A00(r6))), "tam_mute_thread_mentions"), PTK.A00);
    }

    public final void Cox(C254743sy r6) {
        C254793t3 A08 = C66647MaG.A08(r6);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A03(this.A04, A08, C66581MXm.A0l(A08), true);
        }
        C71031OZi.A01(this.A01).A02(C66647MaG.A00(r6));
    }

    public final void Coy(C254743sy r7, int i) {
        C254793t3 A08 = C66647MaG.A08(r7);
        if (A08 != null) {
            C70129Nxj.A00(this.A01).A01(this.A04, A08, C66581MXm.A0l(A08), (long) i);
        }
        C70948OSv.A01.A02(this.A01, i, C66647MaG.A00(r7));
    }

    public final void Cp1(C254743sy r2) {
        throw C66583MXo.A0Z();
    }

    public final void E1K(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void E2j(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void EEU(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void EEk(AnonymousClass2Ep r2, Integer num) {
        throw C66583MXo.A0Z();
    }

    public final void EGL(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void EIw(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void Ev7(AnonymousClass2Ep r2) {
        throw C66583MXo.A0Z();
    }

    public final void FHL(AnonymousClass2Ep r2, boolean z) {
        throw C66583MXo.A0Z();
    }

    public final void FIW(C254743sy r2, boolean z) {
        throw C66583MXo.A0Z();
    }

    public final void FIl(C254743sy r2) {
        throw C66583MXo.A0Z();
    }
}
