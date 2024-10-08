package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class GCK implements C250603lj {
    public boolean A00;
    public C267324bN A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final C52012GBj A05;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        if (X.182.A06(r7, r4, 36323702358879639L) != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r18, X.C252093oY r19) {
        /*
            r17 = this;
            r2 = 0
            r3 = r18
            r1 = r19
            boolean r5 = X.AnonymousClass7TF.A1U(r2, r3, r1)
            int r0 = X.C51968G9o.A0A(r3, r1)
            r11 = 0
            r6 = r17
            if (r0 == r2) goto L_0x01ab
            if (r0 == r5) goto L_0x0064
            java.lang.Object r0 = r3.A04
            X.GDe r0 = (X.C52058GDe) r0
            X.3W1 r1 = r0.A0E
            if (r1 == 0) goto L_0x0021
            boolean r0 = r1.A1m
            if (r0 != r5) goto L_0x0021
        L_0x0020:
            return
        L_0x0021:
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0020
            if (r1 == 0) goto L_0x0020
            X.3W8 r0 = r1.A3T
            X.C51966G9m.A1N(r0, r1, r2)
            r1.A2L = r2
            r0 = 0
            r1.A1L = r0
            com.instagram.common.session.UserSession r0 = r6.A04
            X.Hr1 r4 = X.C55258Hen.A00(r0)
            int r0 = r1.hashCode()
            java.util.HashMap r2 = r4.A05
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.get(r3)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0051
            android.os.Handler r0 = r4.A00
            r0.removeCallbacks(r1)
            r2.remove(r3)
        L_0x0051:
            java.util.HashMap r2 = r4.A04
            java.lang.Object r1 = r2.get(r3)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            if (r1 == 0) goto L_0x0020
            android.os.Handler r0 = r4.A00
            r0.removeCallbacks(r1)
            r2.remove(r3)
            return
        L_0x0064:
            float r1 = r1.CFe(r3)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x0020
            r6.A02 = r5
            java.lang.Object r8 = r3.A04
            r2 = r8
            X.GDe r2 = (X.C52058GDe) r2
            X.3W1 r13 = r2.A0E
            if (r13 == 0) goto L_0x0020
            X.71K r3 = X.GJ7.A00
            com.instagram.common.session.UserSession r4 = r6.A04
            X.0Tu r7 = X.0Tu.A06
            r0 = 2342160552589727013(0x2081069d000b1525, double:4.063502871502981E-152)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x009a
            r0 = 36323702358879639(0x810c3700072d97, double:3.034593863340377E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            r10 = 1
            if (r0 == 0) goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            r0 = 36317543376360743(0x81069d00101527, double:3.0306988979951954E-306)
            boolean r15 = X.182.A06(r7, r4, r0)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36317543378720056(0x81069d00341538, double:3.0306988994872345E-306)
            boolean r16 = X.182.A06(r9, r4, r0)
            X.4bN r0 = r6.A01
            X.0qQ.A06(r8)
            long r0 = r3.A0E(r0, r2, r4, r15)
            X.4bN r3 = r6.A01
            if (r15 == 0) goto L_0x0185
            X.Hr1 r2 = X.C55258Hen.A00(r4)
            boolean r2 = r2.A00(r3)
            if (r2 == 0) goto L_0x0185
            r2 = 36599018353266018(0x82069d00130d62, double:3.2087048067988494E-306)
        L_0x00cb:
            long r8 = X.182.A01(r7, r4, r2)
            X.4bN r3 = r6.A01
            if (r15 == 0) goto L_0x017e
            X.Hr1 r2 = X.C55258Hen.A00(r4)
            boolean r2 = r2.A00(r3)
            if (r2 == 0) goto L_0x017e
            r2 = 36317543376426280(0x81069d00111528, double:3.030698898036641E-306)
        L_0x00e2:
            boolean r7 = X.182.A06(r7, r4, r2)
            X.4bN r3 = r6.A01
            androidx.fragment.app.FragmentActivity r2 = r6.A03
            boolean r2 = X.C55257Hem.A00(r2, r3, r4)
            if (r2 == 0) goto L_0x0020
            X.4bN r2 = r6.A01
            if (r2 == 0) goto L_0x015c
            X.1Xj r2 = X.C51966G9m.A0s(r2)
            if (r2 == 0) goto L_0x015c
            boolean r2 = r2.A5o()
            if (r2 != r5) goto L_0x015c
        L_0x0100:
            r11 = 1
        L_0x0101:
            if (r7 != 0) goto L_0x0105
            if (r11 != 0) goto L_0x0020
        L_0x0105:
            X.4bN r12 = r6.A01
            if (r12 == 0) goto L_0x0020
            X.Hr1 r14 = X.C55258Hen.A00(r4)
            if (r10 != 0) goto L_0x0117
            if (r15 == 0) goto L_0x0125
            boolean r2 = r14.A00(r12)
            if (r2 == 0) goto L_0x0125
        L_0x0117:
            boolean r2 = r13.A2L
            if (r2 != 0) goto L_0x0125
            if (r16 == 0) goto L_0x013e
            X.HqE r2 = r14.A03
            boolean r2 = r2.A00(r12)
            if (r2 != 0) goto L_0x013e
        L_0x0125:
            X.Hr1 r5 = X.C55258Hen.A00(r4)
            if (r10 != 0) goto L_0x0133
            if (r15 == 0) goto L_0x0020
            boolean r2 = r5.A00(r12)
            if (r2 == 0) goto L_0x0020
        L_0x0133:
            if (r16 == 0) goto L_0x018c
            X.HqE r2 = r5.A03
            boolean r2 = r2.A00(r12)
            if (r2 != 0) goto L_0x018c
            return
        L_0x013e:
            X.IjT r11 = new X.IjT
            r11.<init>(r12, r13, r14, r15, r16)
            java.util.HashMap r3 = r14.A05
            java.lang.Integer r2 = X.C51969G9p.A0q(r13)
            boolean r2 = r3.containsKey(r2)
            if (r2 != 0) goto L_0x0125
            java.lang.Integer r2 = X.C51969G9p.A0q(r13)
            r3.put(r2, r11)
            android.os.Handler r2 = r14.A00
            r2.postDelayed(r11, r0)
            goto L_0x0125
        L_0x015c:
            X.4bN r2 = r6.A01
            if (r2 == 0) goto L_0x016d
            X.1Xj r2 = X.C51966G9m.A0s(r2)
            if (r2 == 0) goto L_0x016d
            boolean r2 = r2.A5n()
            if (r2 != r5) goto L_0x016d
            goto L_0x0100
        L_0x016d:
            X.4bN r2 = r6.A01
            if (r2 == 0) goto L_0x0101
            X.1Xj r2 = X.C51966G9m.A0s(r2)
            if (r2 == 0) goto L_0x0101
            boolean r2 = r2.A5e()
            if (r2 != r5) goto L_0x0101
            goto L_0x0100
        L_0x017e:
            r2 = 36317543376164134(0x81069d000d1526, double:3.030698897870859E-306)
            goto L_0x00e2
        L_0x0185:
            r2 = 36599018352938335(0x82069d000e0d5f, double:3.2087048065916213E-306)
            goto L_0x00cb
        L_0x018c:
            X.IgH r4 = new X.IgH
            r4.<init>(r13)
            java.util.HashMap r3 = r5.A04
            java.lang.Integer r2 = X.C51969G9p.A0q(r13)
            boolean r2 = r3.containsKey(r2)
            if (r2 != 0) goto L_0x0020
            java.lang.Integer r2 = X.C51969G9p.A0q(r13)
            r3.put(r2, r4)
            android.os.Handler r2 = r5.A00
            long r0 = r0 + r8
            r2.postDelayed(r4, r0)
            return
        L_0x01ab:
            X.GBj r1 = r6.A05
            X.4bN r0 = X.C52012GBj.A04(r1)
            r6.A01 = r0
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r0.CcK()
            if (r0 != 0) goto L_0x01c5
            int r0 = X.C52012GBj.A00(r1, r5)
            X.4bN r0 = r1.A0C(r0)
            r6.A01 = r0
        L_0x01c5:
            r6.A02 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GCK.ATF(X.30Y, X.3oY):void");
    }

    public GCK(FragmentActivity fragmentActivity, UserSession userSession, C52012GBj gBj) {
        AnonymousClass7TG.A1U(userSession, gBj, fragmentActivity);
        this.A04 = userSession;
        this.A05 = gBj;
        this.A03 = fragmentActivity;
    }
}
