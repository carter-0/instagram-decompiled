package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Vm  reason: invalid class name and case insensitive filesystem */
public final class C308756Vm extends C252233om implements C311546cr {
    public final UserSession A00;
    public final AnonymousClass6VS A01;
    public final C57363IYu A02;
    public final C233812wV A03;
    public final C249863kU A04;
    public final C233432vi A05;
    public final List A06;

    public C308756Vm(UserSession userSession, AnonymousClass6VS r10, C233812wV r11, 1Ph r12, AnonymousClass2vG r13, C249863kU r14, C233432vi r15, List list) {
        0qQ.A0B(r14, 4);
        1Ph r6 = r12;
        0qQ.A0B(r12, 7);
        UserSession userSession2 = userSession;
        this.A00 = userSession;
        C233812wV r5 = r11;
        this.A03 = r11;
        this.A05 = r15;
        this.A04 = r14;
        AnonymousClass6VS r4 = r10;
        this.A01 = r10;
        this.A06 = list;
        List list2 = r14.A00;
        if (!list2.contains(r10)) {
            list2.add(0, r10);
        }
        r15.A7t(r10);
        if (182.A06(0Tu.A06, userSession, 36321666544117366L)) {
            C57363IYu iYu = new C57363IYu(userSession2, r4, r5, r6, r13);
            this.A02 = iYu;
            AnonymousClass3DV.A00(userSession).A00(iYu);
        }
    }

    public final void CsI(0sP r3, int i, int i2, int i3, int i4) {
        boolean z = false;
        boolean z2 = false;
        if (i < i4) {
            z2 = true;
        }
        if (i3 > i4) {
            z = true;
        }
        if (z2 || z) {
            C233812wV r0 = this.A03;
            if (!z) {
                i3 = i2 - 1;
            }
            r0.A0C(i3);
        }
    }

    public final void DMD(C255773uh r1) {
    }

    public final void DMU(C255773uh r2, int i) {
        0qQ.A0B(r2, 0);
        if (!r2.CcK() && !r2.A1P()) {
            this.A03.A02 = i;
        }
    }

    public final void DW0(int i) {
    }

    public final void DW9(int i, int i2, boolean z) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }

    public final void DhS(AnonymousClass3TF r1, AnonymousClass3TF r2) {
    }

    public final void Dpz(int i, int i2) {
    }

    public final /* synthetic */ void Dwb(int i, float f) {
    }

    public final void DzE(View view) {
    }

    public final void E26(String str) {
        0qQ.A0B(str, 0);
        C233532vs r1 = this.A03.A0a;
        if (r1.A00) {
            r1.A01.add(str);
        }
    }

    public final void EJ7(String str) {
        0qQ.A0B(str, 0);
        C233532vs r1 = this.A03.A0a;
        if (r1.A00) {
            r1.A01.remove(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36323779668815332L) == false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer BHD() {
        /*
            r5 = this;
            X.2wV r0 = r5.A03
            X.2vf r4 = r0.A0U
            X.0qQ.A07(r4)
            com.instagram.common.session.UserSession r3 = r5.A00
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Boolean r0 = X.AnonymousClass1P8.A00(r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0025
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323779668815332(0x810c49000f2de4, double:3.0346427544550116E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            r1 = 0
            if (r0 == 0) goto L_0x0036
            boolean r0 = r4 instanceof X.C57331IXo
            if (r0 == 0) goto L_0x0035
            X.IXo r4 = (X.C57331IXo) r4
            int r0 = r4.A00
        L_0x0031:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0035:
            return r1
        L_0x0036:
            boolean r0 = r4 instanceof X.AnonymousClass6VO
            if (r0 == 0) goto L_0x0035
            X.6VO r4 = (X.AnonymousClass6VO) r4
            int r0 = r4.A00
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308756Vm.BHD():java.lang.Integer");
    }

    public final C270424gi Bkm() {
        return this.A01;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DVx(int i, int i2) {
        this.A03.A0D(i, i2);
    }

    public final void DVz(int i) {
        this.A03.A0C(i);
    }

    public final void Dnn(C250973mM r5, String str) {
        C233812wV r2 = this.A03;
        if (r2.A0U.FIZ(r5, str, (Map) null)) {
            r2.A0W.AWG(C54608HKr.A04, new 1PW(AnonymousClass05K.A00), r5);
        }
    }

    public final void Dpa() {
        C233432vi r0 = this.A05;
        AnonymousClass6VS r1 = this.A01;
        r0.EDQ(r1);
        C249863kU r4 = this.A04;
        r4.A00.remove(r1);
        List list = this.A06;
        for (Object next : list) {
            0qQ.A0C(next, "null cannot be cast to non-null type com.instagram.sponsored.asyncads.pool.SponsoredContentPool.PoolProximityListener<com.instagram.model.reels.ReelViewModel>");
            r4.A04.remove(next);
        }
        list.clear();
        C57363IYu iYu = this.A02;
        if (iYu != null) {
            AnonymousClass3DV.A00(this.A00).A01(iYu);
        }
        this.A03.A0B();
    }

    public final void onPause() {
        this.A03.A0Z.Dpe();
    }

    public final void onResume() {
        this.A03.A0Z.Dpk();
    }

    public final void onDestroy() {
        Dpa();
    }
}
