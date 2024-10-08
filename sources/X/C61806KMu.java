package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KMu  reason: case insensitive filesystem */
public final class C61806KMu extends C60098Jfe {
    public int A00;
    public int A01;
    public int A02;
    public String A03;
    public final int A04;
    public final Context A05 = JTR.A0P(this);
    public final A9J A06;
    public final C3501583m A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass8RF A09;
    public final C62320sa A0A;
    public final 0V2 A0B;
    public final 0V2 A0C;
    public final 0V2 A0D;
    public final 05G A0E;
    public final C61770pa A0F;
    public final C61770pa A0G;
    public final C61770pa A0H;
    public final C61770pa A0I;
    public final AnonymousClass0Ud A0J;
    public final LC0 A0K;

    public final void A0T(int i) {
        AnonymousClass7TE.A1Z(new JTZ(this, (Object) null, (AnonymousClass4D7) null, i, 7), C318116oQ.A00(this));
    }

    public final void A0V(int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A00 = i2 + i;
        Iterator it = this.A01.A0J(new C66208MIp(this, 3), i, i2, z, z2, z3, false).iterator();
        while (it.hasNext()) {
            A0I(AnonymousClass7TG.A0F(it));
        }
        A00(this);
    }

    public final boolean A0Y(int i, int i2, int i3, boolean z, boolean z2) {
        LTY lty = this.A01;
        int A032 = JTS.A03(lty);
        List list = 0sn.A00;
        if (lty.A0V(i, A032)) {
            C61194Jyn A0G2 = lty.A0G(i, A032);
            int i4 = i2;
            int i5 = i3;
            boolean z3 = z;
            if (!z) {
                A03(this, A0G2.A0B, i2, i3);
                this.A0E.Epw(C62478KgT.Idle);
            }
            list = lty.A0I(i, A032, i2, i3);
            AnonymousClass7TE.A1Z(new MEj(this, (AnonymousClass4D7) null, i4, i5, 1, z3, z2), C318116oQ.A00(this));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A0I(AnonymousClass7TG.A0F(it));
            }
        }
        return AnonymousClass7TE.A1b(list);
    }

    public static final void A00(C61806KMu kMu) {
        int A052 = DbS.A05(kMu.A01.A09.getValue());
        for (int i = 0; i < A052; i++) {
            kMu.A0T(i);
        }
    }

    public static final void A01(C61806KMu kMu) {
        UserSession userSession = kMu.A00;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36322169055094764L)) {
            LTY lty = kMu.A01;
            if (lty.A0V(0, 0) && lty.A0G(0, 0).A0A == AnonymousClass05K.A15) {
                lty.A0X(lty.A0G(0, 0));
                kMu.A0I(0);
            }
        }
    }

    public static void A02(C61806KMu kMu, int i) {
        kMu.A01 = i;
        kMu.A0G();
        A00(kMu);
    }

    public static final void A03(C61806KMu kMu, String str, int i, int i2) {
        Object obj;
        ClipsCreationViewModel clipsCreationViewModel = kMu.A08;
        0qQ.A0B(str, 0);
        C3500783d r5 = clipsCreationViewModel.A0N;
        List list = r5.A02;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass5MI) obj).getId(), str)) {
                break;
            }
        }
        AnonymousClass5MI r3 = (AnonymousClass5MI) obj;
        if (r3 != null) {
            C65107LnV lnV = new C65107LnV(r3);
            r3.Eog(i, i2);
            05G r1 = r5.A0C;
            JTO.A16(r1).remove(r3);
            r1.Epw(new ArrayList(list));
            r5.A09.FIA(AnonymousClass7TE.A1L(lnV, r3));
        }
    }

    public final C61193Jym A0M() {
        LTY lty = this.A01;
        int i = lty.A00;
        if (i != -1) {
            return (C61193Jym) C51966G9m.A19(lty.A09.getValue(), i);
        }
        return null;
    }

    public final void A0N() {
        int i;
        LTY lty = this.A01;
        String A0d = AnonymousClass7TF.A0d(this.A05.getResources(), 2131955850);
        int A072 = JTO.A07(this.A08);
        C62320sa r4 = this.A0A;
        int A0H2 = JTR.A0H(r4);
        int i2 = this.A04 / 2;
        if (A0H2 > i2) {
            i = JTR.A0H(r4) - i2;
        } else {
            i = 0;
        }
        C61194Jyn jyn = new C61194Jyn((C61080JwI) null, (N49) null, (C60997Jut) null, C62529KhL.TEXT, AnonymousClass05K.A15, A0d, A0d, 0, A072, 0, A072, 0, i, false, false);
        05G r1 = lty.A08;
        if (JTR.A0J(r1) == 0) {
            lty.A0M();
        }
        int A0J2 = JTR.A0J(r1) - 1;
        LTY.A00(jyn, lty, A0J2, false);
        if (A0J2 != -1) {
            A0I(A0J2);
        }
    }

    public final void A0O() {
        LTY lty = this.A01;
        do {
        } while (!JTS.A1Z(lty.A08));
        do {
        } while (!JTS.A1Z(lty.A07));
        LTY.A06(lty);
        LTY.A07(lty);
        A0G();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r2 = r3.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0P() {
        /*
            r3 = this;
            X.05G r1 = r3.A0E
            X.KgT r0 = X.C62478KgT.Idle
            r1.Epw(r0)
            X.8RF r0 = r3.A09
            X.8RH r0 = r0.A0E()
            boolean r0 = r0 instanceof X.C355728Rd
            if (r0 == 0) goto L_0x0023
            X.LTY r2 = r3.A01
            int r1 = r2.A00
            r0 = -1
            if (r1 == r0) goto L_0x0023
            r0 = 1
            r2.A0T(r1, r0)
            r0 = 0
            r2.A0S(r1, r0)
            r3.A0T(r1)
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61806KMu.A0P():void");
    }

    public final void A0Q() {
        AnonymousClass8RH A0E2 = this.A09.A0E();
        this.A0E.Epw(C62478KgT.Idle);
        if (A0E2 instanceof C355718Rb) {
            LTY lty = this.A01;
            if (C51966G9m.A1a(lty.A04, LTY.A0C)) {
                0eP r0 = lty.A04;
                int A0B2 = C51970G9q.A0B(r0);
                int A0A2 = C51969G9p.A0A(r0);
                lty.A0R(A0B2, A0A2, true);
                lty.A0Q(A0B2, A0A2, false);
                A0I(A0B2);
            }
        }
    }

    public final void A0R() {
        LTY lty = this.A01;
        0eP r8 = lty.A03;
        if (lty.A0V(C51970G9q.A0B(r8), C51969G9p.A0A(lty.A03))) {
            int A0B2 = C51970G9q.A0B(lty.A03);
            int A0A2 = C51969G9p.A0A(lty.A03);
            05G r6 = lty.A08;
            while (true) {
                Object value = r6.getValue();
                AbstractList abstractList = (AbstractList) value;
                if (!lty.A0V(A0B2, A0A2)) {
                    break;
                }
                AbstractList A12 = JTO.A12(abstractList, A0B2);
                C61194Jyn A0L = JTS.A0L(abstractList, A0B2, A0A2);
                Integer num = A0L.A0A;
                if (num == AnonymousClass05K.A0C) {
                    num = AnonymousClass05K.A00;
                }
                A12.set(A0A2, C61194Jyn.A00((C61080JwI) null, (N49) null, (C60997Jut) null, A0L, num, (String) null, 0, 0, 0, 0, 32511, false));
                if (r6.AIY(value, abstractList)) {
                    break;
                }
            }
        } else {
            lty.A03 = LTY.A0C;
        }
        if (!0qQ.A0K(r8, LTY.A0C)) {
            A0I(C51970G9q.A0B(r8));
        }
    }

    public final void A0S() {
        LTY lty = this.A01;
        int A0E2 = JTR.A0E(lty);
        int i = lty.A00;
        LTY.A06(lty);
        LTY.A07(lty);
        if (A0E2 != C51970G9q.A0B(LTY.A0C)) {
            A0I(A0E2);
        }
        if (i != -1) {
            A0T(i);
        }
    }

    public final void A0U(int i) {
        LTY lty = this.A01;
        int A0E2 = JTR.A0E(lty);
        int i2 = lty.A00;
        lty.A0T(i, true);
        if (A0E2 != C51970G9q.A0B(LTY.A0C)) {
            A0I(A0E2);
        }
        if (!(i2 == -1 || i2 == i)) {
            A0T(i2);
        }
        A0T(i);
    }

    public final void A0W(boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        LTY lty = this.A01;
        int i = lty.A00;
        if (i != -1) {
            05G r3 = lty.A07;
            do {
                value = r3.getValue();
                abstractList = (AbstractList) value;
                if (lty.A0U(i)) {
                    C61193Jym jym = (C61193Jym) abstractList.get(i);
                    if (z) {
                        num = AnonymousClass05K.A0N;
                    } else if (jym.CFq() == AnonymousClass05K.A0N) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = jym.A03;
                    }
                    C62529KhL khL = jym.A02;
                    String str = jym.A04;
                    C268714ds r9 = jym.A00;
                    boolean z2 = jym.A05;
                    int i2 = jym.A01;
                    AnonymousClass7TG.A1N(khL, str);
                    0qQ.A0B(num, 4);
                    abstractList.set(i, new C61193Jym(khL, r9, num, str, i2, z2));
                }
            } while (!r3.AIY(value, abstractList));
            A0T(lty.A00);
        }
    }

    public final void A0X(boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        LTY lty = this.A01;
        if (C51966G9m.A1a(lty.A04, LTY.A0C)) {
            int A0E2 = JTR.A0E(lty);
            int A032 = JTS.A03(lty);
            05G r6 = lty.A08;
            do {
                value = r6.getValue();
                abstractList = (AbstractList) value;
                if (lty.A0V(A0E2, A032)) {
                    AbstractList A12 = JTO.A12(abstractList, A0E2);
                    C61194Jyn A0L = JTS.A0L(abstractList, A0E2, A032);
                    if (z) {
                        num = AnonymousClass05K.A0N;
                    } else if (A0L.CFq() == AnonymousClass05K.A0N) {
                        num = AnonymousClass05K.A00;
                    } else {
                        num = A0L.A0A;
                    }
                    A12.set(A032, C61194Jyn.A00((C61080JwI) null, (N49) null, (C60997Jut) null, A0L, num, (String) null, 0, 0, 0, 0, 32511, false));
                }
            } while (!r6.AIY(value, abstractList));
            A0I(JTR.A0E(lty));
        }
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.A9J, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61806KMu(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r7, C62320sa r8, int i) {
        super(application, userSession, new MMR(clipsCreationViewModel, 42), false);
        C51974G9v.A1M(userSession, r7, clipsCreationViewModel);
        0qQ.A0B(r8, 6);
        this.A09 = r7;
        this.A08 = clipsCreationViewModel;
        this.A04 = i;
        this.A0A = r8;
        02z A10 = DbS.A10(C62478KgT.Idle);
        this.A0E = A10;
        this.A0J = A10;
        this.A0H = this.A03;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A0C = A012;
        this.A0G = A012;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0B = A013;
        this.A0F = A013;
        this.A00 = JTO.A07(clipsCreationViewModel);
        AnonymousClass1Q2.A02();
        this.A06 = new Object();
        05D A014 = 10D.A01(num, 0, 0);
        this.A0D = A014;
        this.A0I = A014;
        LC0 lc0 = new LC0(this);
        this.A0K = lc0;
        this.A07 = clipsCreationViewModel.A0Q;
        this.A01.A01 = lc0;
    }
}
