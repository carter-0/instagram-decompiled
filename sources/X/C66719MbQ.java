package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.MbQ  reason: case insensitive filesystem */
public final class C66719MbQ implements C74566PxF {
    public 2EM A00;
    public C254743sy A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AnonymousClass1aS A0A = 1aF.A00();
    public final UserSession A0B;
    public final C66687Mau A0C;
    public final 1aU A0D;
    public final 1a8 A0E = C66581MXm.A0P();
    public final C67103MiN A0F;

    public C66719MbQ(1aU r7, UserSession userSession, C66687Mau mau, 2EM r10, boolean z, boolean z2, boolean z3) {
        this.A0B = userSession;
        this.A0C = mau;
        this.A0D = r7;
        this.A00 = r10;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A0F = new C67103MiN(AnonymousClass436.A00.A00(userSession).A01(), AnonymousClass7TF.A0D(), new C67105MiP(this), new C67104MiO(this));
        this.A08 = true;
    }

    public final void FMO(Set set) {
        List list = this.A02;
        if (list != null) {
            AnonymousClass1aS r6 = this.A0A;
            Collection collection = (Collection) r6.A0X();
            if (collection != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(collection);
                if (!A1D.isEmpty() && list.size() == A1D.size()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        AnonymousClass2Ep r1 = (AnonymousClass2Ep) list.get(i);
                        if (r1.BRV().size() == 1 && set.contains(r1.BRV().get(0))) {
                            A1D.set(i, A00(r1, i));
                        }
                    }
                    r6.accept(A1D);
                }
            }
        }
    }

    public final void cancel() {
        this.A09 = false;
        C67103MiN miN = this.A0F;
        C66728MbZ mbZ = miN.A00;
        if (mbZ != null) {
            mbZ.A00 = true;
        }
        miN.A02.removeCallbacksAndMessages((Object) null);
        miN.A01.removeCallbacksAndMessages((Object) null);
        this.A0E.A01();
    }

    private final C66702Mb9 A00(AnonymousClass2Ep r13, int i) {
        return this.A0C.A00(this.A00, r13, 1bJ.A00(this.A0B), i, this.A03, this.A06, this.A04, this.A05, 0qQ.A0K(this.A01, r13.BJy()));
    }

    public static final void A01(C66719MbQ mbQ) {
        List list = mbQ.A02;
        if (list == null) {
            return;
        }
        if (!mbQ.A07 || mbQ.A08) {
            C67103MiN miN = mbQ.A0F;
            Handler handler = miN.A01;
            handler.removeCallbacksAndMessages((Object) null);
            C66728MbZ mbZ = new C66728MbZ(miN, list);
            miN.A00 = mbZ;
            handler.post(mbZ);
        }
    }

    public final C67307Mlh AF9() {
        List list = this.A02;
        int i = 0;
        if (list == null) {
            return new C67307Mlh(0, 0, 0, 0);
        }
        Iterator it = list.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            AnonymousClass2Ep A0c = C66580MXl.A0c(it);
            if (A0c.Cdv(this.A0B)) {
                i++;
                if (A0c.CVb()) {
                    i3++;
                } else {
                    i2++;
                }
                if (!A0c.isMuted()) {
                    i4++;
                }
            }
        }
        return new C67307Mlh(i, i2, i3, i4);
    }

    @Deprecated(message = "Use viewModelObservable() instead")
    public final List Auh() {
        return (List) this.A0A.A0X();
    }

    public final int CBm() {
        List list = this.A02;
        if (list == null) {
            return 0;
        }
        UserSession userSession = this.A0B;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (((2Eu) list.get(i2)).Cdv(userSession)) {
                i++;
            }
        }
        return i;
    }

    public final void EaE(boolean z) {
        if (this.A03 != z) {
            this.A03 = z;
            A01(this);
        }
    }

    public final void EaI(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            A01(this);
        }
    }

    public final void EaJ(boolean z) {
        if (this.A05 != z) {
            this.A05 = z;
            A01(this);
        }
    }

    public final void EaT(boolean z) {
        if (this.A06 != z) {
            this.A06 = z;
            A01(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r5 == false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EaU(boolean r5) {
        /*
            r4 = this;
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0007
            r0 = 1
            if (r5 != 0) goto L_0x0008
        L_0x0007:
            r0 = 0
        L_0x0008:
            r4.A08 = r5
            if (r0 == 0) goto L_0x0013
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0013
            A01(r4)
        L_0x0013:
            com.instagram.common.session.UserSession r3 = r4.A0B
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325892791743823(0x810e350000354f, double:3.0359791019038524E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66719MbQ.EaU(boolean):void");
    }

    public final void Eji(2EM r2) {
        if (!0qQ.A0K(this.A00, r2)) {
            this.A00 = r2;
            A01(this);
        }
    }

    public final void Ejj(C254743sy r2) {
        if (!r2.equals(this.A01)) {
            this.A01 = r2;
            A01(this);
        }
    }

    public final void FMN(AnonymousClass2Ep r7) {
        if (this.A02 != null) {
            DirectThreadKey BJy = r7.BJy();
            AnonymousClass1aS r4 = this.A0A;
            Collection collection = (Collection) r4.A0X();
            if (collection != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(collection);
                int size = A1D.size();
                for (int i = 0; i < size; i++) {
                    if (0qQ.A0K(((C66702Mb9) A1D.get(i)).A0I, BJy)) {
                        A1D.set(i, A00(r7, i));
                        r4.accept(A1D);
                        return;
                    }
                }
            }
        }
    }

    public final 1aU FN4() {
        AnonymousClass1aS r4 = this.A0A;
        if (!182.A06(0Tu.A05, this.A0B, 36325892791940434L)) {
            return r4;
        }
        1aU A0I = r4.A0I(new C67578MqC(C66734Mbf.A00, 0));
        0qQ.A0A(A0I);
        return A0I;
    }

    public final void start() {
        if (this.A09) {
            if (182.A06(0Tu.A05, this.A0B, 36329131197087558L)) {
                return;
            }
        }
        this.A09 = true;
        PU8.A00(this.A0D, this.A0E, this, 49);
        this.A07 = 182.A06(0Tu.A05, this.A0B, 36325892791743823L);
    }

    public final void AWs() {
        A01(this);
    }
}
