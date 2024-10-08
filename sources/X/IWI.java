package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public final class IWI implements AnonymousClass2rX {
    public C228382la A00;
    public List A01;
    public int A02;
    public final UserSession A03;
    public final List A04 = AnonymousClass7TE.A1C();
    public final Set A05;
    public final boolean A06;
    public final AnonymousClass0iw A07;
    public final C55626Hkl A08;
    public final C322186vO A09;
    public final AnonymousClass4DU A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.IWI r14, java.lang.Object r15, java.util.List r16, int r17) {
        /*
            r2 = r15
            boolean r0 = r15 instanceof X.1Xj
            r4 = r16
            r1 = r17
            if (r0 == 0) goto L_0x0032
            r8 = r2
            X.1Xj r8 = (X.1Xj) r8
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L_0x0031
            java.util.Set r7 = r14.A05
            java.lang.String r0 = r8.getId()
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = r8.getId()
        L_0x0022:
            r7.add(r0)
        L_0x0025:
            java.util.List r0 = r14.A04
            r0.add(r1, r15)
            X.2la r0 = r14.A00
            if (r0 == 0) goto L_0x0031
            r0.DLo(r15, r1)
        L_0x0031:
            return
        L_0x0032:
            boolean r0 = r15 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x006c
            r0 = r2
            X.3OA r0 = (X.AnonymousClass3OA) r0
            X.1Xj r6 = r0.A0K
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L_0x0031
            java.util.Set r7 = r14.A05
            java.lang.String r0 = r6.getId()
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x0067
            boolean r0 = r14.A0C
            if (r0 != 0) goto L_0x0067
            com.instagram.common.session.UserSession r3 = r14.A03
            X.1Av r0 = X.1Au.A00(r3)
            boolean r0 = X.C228342lQ.A08(r3, r0)
            if (r0 != 0) goto L_0x0067
            boolean r0 = X.C271854jh.A00(r3, r6)
            if (r0 != 0) goto L_0x0067
            r4.add(r6)
            return
        L_0x0067:
            java.lang.String r0 = r6.getId()
            goto L_0x0022
        L_0x006c:
            boolean r0 = r15 instanceof X.AnonymousClass3UH
            if (r0 == 0) goto L_0x0025
            int r0 = r14.A02
            if (r0 == 0) goto L_0x0078
            boolean r0 = r14.A0B
            if (r0 != 0) goto L_0x0031
        L_0x0078:
            java.util.List r0 = r14.A04
            r0.add(r1, r15)
            X.2la r0 = r14.A00
            if (r0 == 0) goto L_0x0084
            r0.DLo(r15, r1)
        L_0x0084:
            int r0 = r14.A02
            int r0 = r0 + 1
            r14.A02 = r0
            return
        L_0x008b:
            boolean r0 = r8.CcK()
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r14.A06
            if (r0 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r0 = r14.A03
            X.3VK r7 = X.AnonymousClass3VI.A00(r0)
            r6 = 0
            java.util.List r5 = r14.A04
            int r3 = r5.size()
        L_0x00a2:
            if (r6 >= r3) goto L_0x00e0
            java.lang.Object r0 = r5.get(r6)
            boolean r0 = r0 instanceof X.1Xj
            if (r0 == 0) goto L_0x00dd
            java.lang.String r10 = r8.getId()
            java.lang.Object r9 = r5.get(r6)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.media.Media"
            X.0qQ.A0C(r9, r0)
            X.1Xj r9 = (X.1Xj) r9
            boolean r0 = X.C51969G9p.A1Z(r9, r10)
            if (r0 == 0) goto L_0x00dd
            X.3VL r10 = X.AnonymousClass3VL.EXPLORE
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r14 = 0
            java.lang.String r17 = r8.getId()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            X.GXs r9 = new X.GXs
            r15 = r14
            r16 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r7.A07(r9)
        L_0x00dd:
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00e0:
            r4.add(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IWI.A00(X.IWI, java.lang.Object, java.util.List, int):void");
    }

    public static final void A01(IWI iwi, List list) {
        C55626Hkl hkl = iwi.A08;
        if (hkl != null && AnonymousClass7TE.A1b(list)) {
            UserSession userSession = hkl.A00;
            list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                1Xj A0t = C51966G9m.A0t(it);
                if (A0t.CcK()) {
                    C233822wX.A0O(userSession, new C271794jb(userSession, A0t), A0t, hkl.A01, Integer.valueOf(A0t.A0m()), "duplicate_ad_received", A0t.A2p(), AnonymousClass7TE.A1I("duplicate_ad_inserted"), AnonymousClass7TE.A1I("duplicate_ad_received"));
                }
            }
        }
    }

    public final void A02() {
        List list = this.A04;
        ArrayList A0m = C51970G9q.A0m(list);
        for (Object next : list) {
            if (next instanceof 1Xj) {
                if (!this.A09.Esp((1Xj) next)) {
                }
            } else if (next instanceof AnonymousClass3OA) {
                1Xj r5 = ((AnonymousClass3OA) next).A0K;
                if (!this.A09.Esp(r5)) {
                    1sx.A0C(this.A03, r5, this.A0A, this.A0C);
                }
            } else if (next instanceof C268364dG) {
                C268364dG r0 = (C268364dG) next;
                String str = r0.A07;
                String str2 = r0.A06;
                if (!(str == null || str2 == null)) {
                    AtomicBoolean atomicBoolean = 1Xj.A0i;
                    String A0T = 002.A0T(str, str2, '_');
                    if (A0T != null && 1sd.A00(this.A03).A00.getBoolean(A0T, false)) {
                    }
                }
            }
            A0m.add(next);
        }
        this.A01 = A0m;
    }

    public final Iterator Eaa(C228382la r2) {
        this.A00 = r2;
        return this.A04.iterator();
    }

    public IWI(AnonymousClass0iw r4, UserSession userSession, C55626Hkl hkl, AnonymousClass4DU r7, boolean z) {
        AnonymousClass7TG.A1P(userSession, r4);
        0qQ.A0B(r7, 5);
        this.A03 = userSession;
        this.A0B = z;
        this.A07 = r4;
        this.A08 = hkl;
        this.A0A = r7;
        this.A09 = new C322186vO(userSession);
        this.A01 = AnonymousClass7TE.A1C();
        this.A05 = AnonymousClass7TE.A1F();
        0Tu r2 = 0Tu.A05;
        this.A0C = 182.A06(r2, userSession, 36312879040955741L);
        this.A06 = 182.A06(r2, userSession, 36317027979236109L);
    }

    public final void A03(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object A002 : list) {
            A00(this, A002, A1C, this.A04.size());
        }
        A01(this, A1C);
    }
}
