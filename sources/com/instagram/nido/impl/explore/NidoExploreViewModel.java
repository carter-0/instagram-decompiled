package com.instagram.nido.impl.explore;

import X.00k;
import X.02z;
import X.05G;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.AnonymousClass8ZA;
import X.C318116oQ;
import X.C46461DfP;
import X.C46554Dgw;
import X.C46556Dgy;
import X.C46558Dh0;
import X.C51645Fy4;
import X.C51797G2g;
import X.C59823JZy;
import X.C60111Jfs;
import X.DbS;
import X.MJ7;
import com.instagram.common.session.UserSession;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class NidoExploreViewModel extends C60111Jfs {
    public String A00;
    public final UserSession A01;
    public final Set A02 = DbS.A0y();
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;

    public NidoExploreViewModel(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        02z A10 = DbS.A10(C59823JZy.Loading);
        this.A08 = A10;
        C46554Dgw dgw = new C46554Dgw(userSession);
        this.A03 = AnonymousClass0eN.A01(new MJ7(22, dgw, new AnonymousClass8ZA(dgw.A00)));
        C46461DfP dfP = new C46461DfP(userSession);
        this.A07 = AnonymousClass0eN.A01(new MJ7(23, dfP, new AnonymousClass8ZA(dfP.A00)));
        this.A09 = A10;
        this.A05 = C51797G2g.A00(this, 33);
        this.A04 = C51797G2g.A00(this, 30);
        this.A06 = C51797G2g.A00(this, 34);
        C51645Fy4.A01(this, C318116oQ.A00(this), 41);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.nido.impl.explore.NidoExploreViewModel r12, X.AnonymousClass4D7 r13) {
        /*
            r4 = 7
            boolean r0 = X.C66138MDq.A02(r4, r13)
            if (r0 == 0) goto L_0x006d
            r2 = r13
            X.MDq r2 = (X.C66138MDq) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x006d
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0015:
            java.lang.Object r4 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 != r3) goto L_0x0073
            java.lang.Object r12 = r2.A01
            com.instagram.nido.impl.explore.NidoExploreViewModel r12 = (com.instagram.nido.impl.explore.NidoExploreViewModel) r12
            X.0eS.A00(r4)
        L_0x0027:
            X.0eM r0 = r12.A03
            java.lang.Object r0 = r0.getValue()
            X.Dgy r0 = (X.C46556Dgy) r0
            r0.A02()
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0035:
            X.0eS.A00(r4)
            com.instagram.common.session.UserSession r0 = r12.A01
            java.lang.String r0 = r0.A06
            X.Dbr r7 = new X.Dbr
            r7.<init>(r0)
            X.0eM r0 = r12.A07
            java.lang.Object r4 = r0.getValue()
            X.Dd7 r4 = (X.Dd7) r4
            r5 = 0
            r11 = 0
            X.6wt r6 = new X.6wt
            r6.<init>(r5, r3, r11, r11)
            java.lang.String r8 = "NidoExploreViewModel"
            java.lang.String r9 = "explore"
            r10 = -1
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r0 = r0.getValue()
            X.Dd7 r0 = (X.Dd7) r0
            X.0r6 r0 = r0.A02(r7)
            r2.A01 = r12
            r2.A00 = r3
            java.lang.Object r0 = X.AnonymousClass10c.A02(r2, r0)
            if (r0 != r1) goto L_0x0027
            return r1
        L_0x006d:
            X.MDq r2 = new X.MDq
            r2.<init>(r12, r13, r4)
            goto L_0x0015
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nido.impl.explore.NidoExploreViewModel.A00(com.instagram.nido.impl.explore.NidoExploreViewModel, X.4D7):java.lang.Object");
    }

    public static final void A01(ExploreTopicCluster exploreTopicCluster, NidoExploreViewModel nidoExploreViewModel, Integer num, Integer num2) {
        AnonymousClass0eM r0;
        Integer num3;
        int intValue = num2.intValue();
        if (intValue == 0) {
            r0 = nidoExploreViewModel.A04;
        } else if (intValue == 1) {
            r0 = nidoExploreViewModel.A05;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        ArrayList A0U = 00k.A0U((Collection) ((AnonymousClass0Ud) r0.getValue()).getValue());
        int i = 0;
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            if (!0qQ.A0K(((C46558Dh0) it.next()).A03, exploreTopicCluster.A09)) {
                i++;
            } else if (i != -1) {
                C46558Dh0 dh0 = (C46558Dh0) A0U.get(i);
                String str = dh0.A02;
                String str2 = dh0.A03;
                ExploreTopicCluster exploreTopicCluster2 = dh0.A00;
                0qQ.A0B(str2, 1);
                A0U.set(i, new C46558Dh0(exploreTopicCluster2, num, str, str2));
                C46556Dgy dgy = (C46556Dgy) nidoExploreViewModel.A03.getValue();
                if (intValue != 0) {
                    num3 = AnonymousClass05K.A01;
                } else {
                    num3 = AnonymousClass05K.A00;
                }
                C46556Dgy.A01(dgy, num3, A0U);
                return;
            } else {
                return;
            }
        }
    }
}
