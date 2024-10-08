package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Ru  reason: invalid class name and case insensitive filesystem */
public abstract class C331647Ru {
    public final C331627Rs A00;

    public final void A04(View view) {
        if (this instanceof C331637Rt) {
            C331637Rt r1 = (C331637Rt) this;
            r1.A00 = view;
            if (r1.A03 != null && r1.A02 != null) {
                C331637Rt.A01(r1);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (r5.A0b.size() == 1) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            boolean r0 = r1 instanceof X.C331637Rt
            if (r0 != 0) goto L_0x014f
            boolean r0 = r1 instanceof X.C3027965h
            if (r0 == 0) goto L_0x017b
            r2 = r1
            X.65h r2 = (X.C3027965h) r2
            X.0sa r1 = r2.A04
            java.lang.Object r5 = r1.invoke()
            X.7SD r5 = (X.AnonymousClass7SD) r5
            X.0eM r0 = r2.A01
            java.lang.Object r4 = r0.getValue()
            X.7Ym r4 = (X.C333317Ym) r4
            java.util.Map r0 = r5.A0e
            r17 = 1
            if (r0 == 0) goto L_0x006b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x006b
            java.lang.Object r0 = r1.invoke()
            X.7SD r0 = (X.AnonymousClass7SD) r0
            java.util.List r0 = r0.A0b
            java.util.Iterator r3 = r0.iterator()
        L_0x0035:
            boolean r0 = r3.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0178
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            if (r0 != 0) goto L_0x0035
        L_0x004b:
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x006b
            java.lang.String r3 = r1.getId()
            X.0sa r0 = r2.A03
            java.lang.Object r1 = r0.invoke()
            X.7ZY r1 = (X.AnonymousClass7ZY) r1
            r0 = 20
            java.util.ArrayList r1 = r1.Bk1(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0156
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0156
        L_0x006b:
            r17 = 0
        L_0x006d:
            int r1 = r5.A08
            r11 = 1
            if (r1 != 0) goto L_0x0153
            java.util.List r0 = r5.A0b
            int r0 = r0.size()
            if (r0 != r11) goto L_0x012e
        L_0x007a:
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r1 == r0) goto L_0x0080
            if (r11 == 0) goto L_0x012e
        L_0x0080:
            java.util.List r0 = r5.A0b
            java.util.Iterator r7 = r0.iterator()
        L_0x0086:
            boolean r0 = r7.hasNext()
            r10 = 0
            if (r0 == 0) goto L_0x0150
            java.lang.Object r6 = r7.next()
            r3 = r6
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r1 = r3.getId()
            com.instagram.common.session.UserSession r0 = r4.A02
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0086
            X.6oA r0 = r4.A04
            boolean r0 = r3.CQp(r0)
            if (r0 == 0) goto L_0x0086
        L_0x00aa:
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            if (r6 == 0) goto L_0x012e
            java.lang.String r9 = r6.getId()
            com.instagram.common.session.UserSession r8 = r4.A02
            X.0Tu r7 = X.0Tu.A05
            r0 = 36323736718159283(0x810c3f00002db3, double:3.034615592287178E-306)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x012e
            X.05G r13 = r4.A06
        L_0x00c3:
            java.lang.Object r12 = r13.getValue()
            r6 = r12
            X.7PG r6 = (X.AnonymousClass7PG) r6
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r11)
            r16 = 1
            r0 = 2342166745932574141(0x20810c3f000b2dbd, double:4.0687543008708145E-152)
            boolean r0 = X.182.A06(r7, r8, r0)
            r14 = 0
            if (r0 == 0) goto L_0x010c
            boolean r0 = X.C71041OaE.A03(r8, r5)
            if (r0 == 0) goto L_0x010c
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = r0.A01(r8)
            X.4Cl r0 = r1.A03
            java.lang.Boolean r15 = r0.CeL()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            boolean r0 = X.0qQ.A0K(r15, r0)
            if (r0 != 0) goto L_0x010b
            X.4Cl r0 = r1.A03
            java.lang.Integer r0 = r0.B6v()
            if (r0 == 0) goto L_0x0109
            int r1 = r0.intValue()
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r1 > r0) goto L_0x010b
        L_0x0109:
            if (r17 == 0) goto L_0x010c
        L_0x010b:
            r14 = 1
        L_0x010c:
            X.7PF r15 = r6.A01
            X.N49 r1 = r6.A00
            java.lang.String r0 = r6.A03
            X.7PG r0 = X.AnonymousClass7PG.A00(r1, r15, r3, r0, r14)
            boolean r0 = r13.AIY(r12, r0)
            if (r0 == 0) goto L_0x00c3
            r4.A00 = r9
            X.6oS r3 = X.C318116oQ.A00(r4)
            r0 = 24
            X.ImO r1 = new X.ImO
            r1.<init>(r4, r10, r0)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r1, r3)
        L_0x012e:
            X.07U r7 = X.07U.A05
            X.7Rs r0 = r2.A00
            X.0sa r0 = r0.A01
            java.lang.Object r0 = r0.invoke()
            X.07Z r0 = (X.AnonymousClass07Z) r0
            X.0xx r3 = X.AnonymousClass07a.A00(r0)
            r8 = 0
            r9 = 43
            X.9KF r4 = new X.9KF
            r5 = r2
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0148:
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r4, r3)
        L_0x014f:
            return
        L_0x0150:
            r6 = r10
            goto L_0x00aa
        L_0x0153:
            r11 = 0
            goto L_0x007a
        L_0x0156:
            java.util.Iterator r1 = r1.iterator()
        L_0x015a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r0 = r1.next()
            X.7LQ r0 = (X.AnonymousClass7LQ) r0
            com.instagram.user.model.User r0 = r0.A0K
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = r0.getId()
        L_0x016e:
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x015a
            goto L_0x006d
        L_0x0176:
            r0 = r6
            goto L_0x016e
        L_0x0178:
            r1 = r6
            goto L_0x004b
        L_0x017b:
            boolean r0 = r1 instanceof X.AnonymousClass7S0
            if (r0 != 0) goto L_0x014f
            boolean r0 = r1 instanceof X.C331857Sq
            if (r0 == 0) goto L_0x01ba
            r6 = r1
            X.7Sq r6 = (X.C331857Sq) r6
            X.0sa r0 = r6.A0L
            java.lang.Object r2 = r0.invoke()
            X.7SD r2 = (X.AnonymousClass7SD) r2
            int r1 = r2.A08
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r1 != r0) goto L_0x014f
            X.7Rs r3 = r6.A00
            com.instagram.common.session.UserSession r0 = r3.A00
            boolean r0 = X.AnonymousClass9B8.A06(r0)
            if (r0 == 0) goto L_0x014f
            java.util.List r0 = r2.A0b
            java.lang.Object r1 = X.00k.A0J(r0)
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            if (r1 == 0) goto L_0x014f
            X.4Cl r0 = r1.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
            if (r0 == 0) goto L_0x01ff
            boolean r0 = r1.A1l()
            if (r0 != 0) goto L_0x01ff
            X.C331857Sq.A01(r6)
            return
        L_0x01ba:
            boolean r0 = r1 instanceof X.C3269178q
            if (r0 == 0) goto L_0x0286
            r7 = r1
            X.78q r7 = (X.C3269178q) r7
            X.7Rs r4 = r7.A00
            com.instagram.common.session.UserSession r3 = r4.A00
            X.9HW r2 = X.AnonymousClass9HV.A00(r3)
            X.0sa r0 = r7.A01
            java.lang.Object r0 = r0.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3t3 r1 = r0.CBU()
            r0 = 69
            boolean r0 = r2.A00(r1, r0)
            if (r0 == 0) goto L_0x014f
            boolean r0 = X.I5N.A03(r3)
            if (r0 == 0) goto L_0x014f
            X.07U r6 = X.07U.A05
            X.0sa r0 = r4.A01
            java.lang.Object r5 = r0.invoke()
            X.07Z r5 = (X.AnonymousClass07Z) r5
            X.0xx r3 = X.AnonymousClass07a.A00(r5)
            r8 = 0
            r9 = 11
            X.9KE r4 = new X.9KE
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0148
        L_0x01ff:
            java.lang.String r7 = r1.getId()
            X.7ZW r0 = r6.A0D
            java.lang.Boolean r1 = r0.A00(r7)
            r9 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0218
            X.C331857Sq.A00(r6)
            return
        L_0x0218:
            X.7Zq r5 = r6.A08
            X.02m r4 = r5.A01
            int r0 = r5.A00
            r2 = 814286340(0x30890604, float:9.969772E-10)
            boolean r0 = r4.isMarkerOn(r2, r0)
            if (r0 == 0) goto L_0x022d
            int r1 = r5.A00
            r0 = 4
            r4.markerEnd(r2, r1, r0)
        L_0x022d:
            X.2SP r0 = X.2SP.A01
            int r0 = r0.A03()
            r5.A00 = r0
            r4.markerStart(r2, r0)
            int r1 = r5.A00
            java.lang.String r0 = "thread_visible"
            r4.markerPoint(r2, r1, r0)
            int r1 = r5.A00
            java.lang.String r0 = "first_message_impression"
            r4.markerPoint(r2, r1, r0)
            int r0 = r5.A00
            boolean r0 = r4.isMarkerOn(r2, r0)
            if (r0 == 0) goto L_0x0255
            int r1 = r5.A00
            java.lang.String r0 = "bot_id"
            r4.markerAnnotate(r2, r1, r0, r7)
        L_0x0255:
            X.07U r5 = X.07U.A05
            X.0sa r0 = r3.A01
            java.lang.Object r4 = r0.invoke()
            X.07Z r4 = (X.AnonymousClass07Z) r4
            X.0xx r0 = X.AnonymousClass07a.A00(r4)
            r8 = 0
            X.9Ka r3 = new X.9Ka
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.19B r5 = X.19B.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.1Eo.A03(r4, r5, r3, r0)
            X.0eM r0 = r6.A0H
            java.lang.Object r3 = r0.getValue()
            X.2YL r3 = (X.2YL) r3
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 5
            X.9KX r0 = new X.9KX
            r0.<init>(r3, r7, r8, r1)
            X.1Eo.A03(r4, r5, r0, r2)
            return
        L_0x0286:
            r6 = r1
            X.7Rx r6 = (X.C331677Rx) r6
            r2 = 0
            r3 = r19
            X.0qQ.A0B(r3, r2)
            r0 = 2131431559(0x7f0b1087, float:1.848485E38)
            android.view.View r1 = r3.findViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131624072(0x7f0e0088, float:1.8875313E38)
            r1.setLayoutResource(r0)
            com.instagram.creator.agent.suggestedreplies.viewmodel.CreatorAgentSuggestedRepliesViewModel r0 = X.C331677Rx.A00(r6)
            r0.init()
            X.3oV r1 = X.2b1.A01(r1, r2, r2)
            r6.A06 = r1
            if (r1 != 0) goto L_0x02ba
            java.lang.String r0 = "containerStub"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02ba:
            X.OzE r0 = new X.OzE
            r0.<init>(r3, r6)
            r1.EeU(r0)
            X.07U r5 = X.07U.A05
            X.7Rs r0 = r6.A00
            X.0sa r0 = r0.A01
            java.lang.Object r4 = r0.invoke()
            X.07Z r4 = (X.AnonymousClass07Z) r4
            X.0xx r1 = X.AnonymousClass07a.A00(r4)
            r7 = 0
            r8 = 12
            X.MHF r2 = new X.MHF
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331647Ru.A05(android.view.View):void");
    }

    public final void A06(AnonymousClass07V r2) {
        AnonymousClass07Y r0;
        if (this instanceof C3027965h) {
            r0 = (C3027965h) this;
        } else if (this instanceof C331857Sq) {
            r0 = (C331667Rw) ((C331857Sq) this).A0H.getValue();
        } else if (this instanceof C331677Rx) {
            r0 = (C331677Rx) this;
        } else {
            return;
        }
        r2.A09(r0);
    }

    public final void A07(AnonymousClass07V r2) {
        AnonymousClass07Y r0;
        if (this instanceof C331857Sq) {
            r0 = (C331667Rw) ((C331857Sq) this).A0H.getValue();
        } else if (this instanceof C331677Rx) {
            r0 = (C331677Rx) this;
        } else {
            return;
        }
        r2.A0A(r0);
    }

    public boolean A08() {
        if (this instanceof C331637Rt) {
            C331637Rt r1 = (C331637Rt) this;
            if (r1.A05 || !AnonymousClass7S3.A00(r1.A00.A00)) {
                return false;
            }
            return true;
        } else if (this instanceof C331677Rx) {
            return 182.A06(0Tu.A06, this.A00.A00, 36321279997125860L);
        } else if ((this instanceof AnonymousClass7S0) || (this instanceof C3027965h)) {
            return true;
        } else {
            boolean z = this instanceof C331857Sq;
            UserSession userSession = this.A00.A00;
            if (z) {
                return AnonymousClass9B8.A07(userSession);
            }
            return I5N.A03(userSession);
        }
    }

    public C331647Ru(C331627Rs r1) {
        this.A00 = r1;
    }
}
