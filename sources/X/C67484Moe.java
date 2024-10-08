package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Moe  reason: case insensitive filesystem */
public final class C67484Moe {
    public static final C70734OIr A08 = new Object();
    public static final List A09 = AnonymousClass7TE.A1D(0sr.A1P(new Integer[]{18, 19, 20, 21}));
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final C74515PwA A03;
    public final Mi5 A04;
    public final AnonymousClass0iw A05;
    public final C74456PvB A06;
    public final Q2C A07;

    public C67484Moe(Context context, Fragment fragment, AnonymousClass0iw r4, UserSession userSession, C74456PvB pvB, C74515PwA pwA, Mi5 mi5, Q2C q2c) {
        0qQ.A0B(userSession, 3);
        C51972G9s.A1E(mi5, q2c);
        this.A00 = context;
        this.A01 = fragment;
        this.A02 = userSession;
        this.A05 = r4;
        this.A03 = pwA;
        this.A04 = mi5;
        this.A07 = q2c;
        this.A06 = pvB;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v16, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v17, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Integer, android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (X.182.A06(X.0Tu.A06, r1.A02, 36319308607593595L) != false) goto L_0x001b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x021c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.RectF r39, android.view.View r40, X.C67058MhZ r41, X.C67484Moe r42, X.C74396PuC r43, X.2EM r44, X.AnonymousClass2Ep r45, com.instagram.model.direct.DirectShareTarget r46, X.C254743sy r47, java.lang.String r48, java.lang.String r49, java.util.List r50, boolean r51, boolean r52) {
        /*
            r0 = r47
            boolean r2 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            r38 = r52
            r1 = r42
            r4 = r50
            if (r2 != 0) goto L_0x001b
            com.instagram.common.session.UserSession r6 = r1.A02
            X.0Tu r5 = X.0Tu.A06
            r2 = 36319308607593595(0x810838000b1c7b, double:3.0318152373348667E-306)
            boolean r2 = X.182.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x006c
        L_0x001b:
            if (r52 == 0) goto L_0x006c
            r2 = 8
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            if (r2 == 0) goto L_0x006c
            r6 = 12
            boolean r2 = X.C66581MXm.A1W(r6, r4)
            if (r2 == 0) goto L_0x0049
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r4.iterator()
        L_0x0035:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r3 = r5.next()
            int r2 = X.AnonymousClass7TE.A0M(r3)
            if (r2 == r6) goto L_0x0035
            r7.add(r3)
            goto L_0x0035
        L_0x0049:
            r6 = 7
            boolean r2 = X.C66581MXm.A1W(r6, r4)
            if (r2 == 0) goto L_0x006c
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r4.iterator()
        L_0x0058:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r3 = r5.next()
            int r2 = X.AnonymousClass7TE.A0M(r3)
            if (r2 == r6) goto L_0x0058
            r7.add(r3)
            goto L_0x0058
        L_0x006c:
            r7 = r4
        L_0x006d:
            r2 = 34
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            r12 = 0
            r33 = r45
            if (r2 == 0) goto L_0x009e
            com.instagram.common.session.UserSession r3 = r1.A02
            X.0iw r2 = r1.A05
            X.7Cy r15 = new X.7Cy
            r15.<init>(r2, r3)
            if (r45 == 0) goto L_0x00fd
            java.util.List r2 = r33.BRZ()
            java.lang.Object r2 = X.00k.A0J(r2)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x00fd
            java.lang.String r16 = r2.getId()
        L_0x0093:
            java.lang.String r2 = r3.A06
            X.Nm6 r13 = X.C69462Nm6.IMPRESSION
            X.NmV r14 = X.C69487NmV.INBOX_THREAD_ACTION_SHEET_ENTRYPOINT
            r17 = r2
            X.C327977Cy.A00(r12, r13, r14, r15, r16, r17)
        L_0x009e:
            r2 = 41
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            if (r2 == 0) goto L_0x00e3
            com.instagram.common.session.UserSession r6 = r1.A02
            X.0iw r5 = r1.A05
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A03(r0)
            r2 = 2
            X.0qQ.A0B(r3, r2)
            java.lang.String r2 = "set_reminder_impression"
            X.OQ6.A00(r5, r6, r3, r2)
        L_0x00b7:
            r6 = 11
            boolean r2 = X.C66581MXm.A1W(r6, r4)
            if (r2 == 0) goto L_0x0100
            com.instagram.common.session.UserSession r2 = r1.A02
            boolean r2 = X.C66700Mb7.A01(r2)
            if (r2 != 0) goto L_0x0100
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r4.iterator()
        L_0x00cf:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0100
            java.lang.Object r3 = r5.next()
            int r2 = X.AnonymousClass7TE.A0M(r3)
            if (r2 == r6) goto L_0x00cf
            r7.add(r3)
            goto L_0x00cf
        L_0x00e3:
            r2 = 42
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            if (r2 == 0) goto L_0x00b7
            com.instagram.common.session.UserSession r6 = r1.A02
            X.0iw r5 = r1.A05
            com.instagram.model.direct.DirectThreadKey r3 = X.C66647MaG.A03(r0)
            r2 = 2
            X.0qQ.A0B(r3, r2)
            java.lang.String r2 = "remove_reminder_impression"
            X.OQ6.A00(r5, r6, r3, r2)
            goto L_0x00b7
        L_0x00fd:
            r16 = r12
            goto L_0x0093
        L_0x0100:
            r6 = 3
            boolean r2 = X.C66581MXm.A1W(r6, r4)
            if (r2 == 0) goto L_0x012b
            com.instagram.common.session.UserSession r2 = r1.A02
            boolean r2 = X.C66700Mb7.A01(r2)
            if (r2 != 0) goto L_0x012b
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r4.iterator()
        L_0x0117:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x012b
            java.lang.Object r3 = r5.next()
            int r2 = X.AnonymousClass7TE.A0M(r3)
            if (r2 == r6) goto L_0x0117
            r7.add(r3)
            goto L_0x0117
        L_0x012b:
            r2 = 43
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            if (r2 != 0) goto L_0x013b
            r2 = 44
            boolean r2 = X.C66581MXm.A1W(r2, r4)
            if (r2 == 0) goto L_0x0156
        L_0x013b:
            com.instagram.common.session.UserSession r3 = r1.A02
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A04(r0)
            if (r2 == 0) goto L_0x01cd
            java.lang.String r5 = r2.A00
        L_0x0145:
            java.lang.String r4 = "inbox"
            X.0Aj r3 = X.C66584MXp.A0B(r3)
            boolean r2 = r3.isSampled()
            if (r2 == 0) goto L_0x0156
            java.lang.String r2 = "show_locked_chat_toggle"
            X.C66584MXp.A0x(r3, r2, r4, r5)
        L_0x0156:
            X.OIr r2 = A08
            android.content.Context r4 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A02
            java.lang.String[] r10 = r2.A00(r4, r3, r7)
            boolean r2 = X.C66732Mbd.A03(r4, r3)
            r37 = r51
            r28 = r39
            r29 = r41
            r31 = r43
            r32 = r44
            r34 = r46
            if (r2 == 0) goto L_0x01ee
            r2 = r40
            if (r40 == 0) goto L_0x01ee
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r9 = r7.iterator()
            r8 = 0
        L_0x017f:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L_0x01d0
            java.lang.Object r7 = r9.next()
            int r6 = r8 + 1
            if (r8 >= 0) goto L_0x0195
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0195:
            int r36 = X.AnonymousClass7TE.A0M(r7)
            r17 = r10[r8]
            r7 = r12
            if (r17 == 0) goto L_0x01c7
            X.PHT r15 = new X.PHT
            r27 = r15
            r30 = r1
            r35 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r18 = 0
            r24 = 1
            X.8rI r11 = new X.8rI
            r13 = r12
            r14 = r12
            r16 = r12
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r23 = r18
            r25 = r18
            r26 = r18
            r27 = r18
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12 = r11
        L_0x01c7:
            r5.add(r12)
            r12 = r7
            r8 = r6
            goto L_0x017f
        L_0x01cd:
            r5 = r12
            goto L_0x0145
        L_0x01d0:
            java.util.List r0 = X.00k.A0X(r5)
            r5 = 0
            X.8Ov r1 = X.C66581MXm.A0c(r4, r3, r12, r0, r5)
            X.0eP r0 = r1.A00()
            int r0 = X.C51969G9p.A0A(r0)
            r1.setHeight(r0)
            int r0 = r2.getMeasuredWidth()
            int r0 = r0 / 4
            r1.showAsDropDown(r2, r0, r5)
            return
        L_0x01ee:
            X.Dg1 r8 = new X.Dg1
            r8.<init>(r4, r3)
            r3 = r48
            r2 = r49
            if (r49 == 0) goto L_0x021c
            r8.A0D(r3, r2)
        L_0x01fc:
            int r6 = r7.size()
            r5 = 0
        L_0x0201:
            if (r5 >= r6) goto L_0x0220
            int r36 = X.C51971G9r.A0I(r7, r5)
            r3 = r10[r5]
            if (r3 == 0) goto L_0x0219
            X.Ojc r2 = new X.Ojc
            r27 = r2
            r30 = r1
            r35 = r0
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r8.A0C(r3, r2)
        L_0x0219:
            int r5 = r5 + 1
            goto L_0x0201
        L_0x021c:
            r8.A08(r3)
            goto L_0x01fc
        L_0x0220:
            X.FFy r0 = new X.FFy
            r0.<init>(r8)
            r0.A05(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67484Moe.A00(android.graphics.RectF, android.view.View, X.MhZ, X.Moe, X.PuC, X.2EM, X.2Ep, com.instagram.model.direct.DirectShareTarget, X.3sy, java.lang.String, java.lang.String, java.util.List, boolean, boolean):void");
    }

    public static final void A01(C67484Moe moe, AnonymousClass2Ep r12, boolean z) {
        UserSession userSession = moe.A02;
        O7J o7j = new O7J(userSession);
        AnonymousClass2Ep r10 = r12;
        boolean z2 = z;
        if (z) {
            0xa r5 = o7j.A00;
            if (r5.getBoolean("key_should_show_locked_chat_nux", true)) {
                0rm A11 = C51965G9l.A11();
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A1J = true;
                Fragment fragment = moe.A01;
                A0W.A0g = fragment.getString(2131956706);
                A0W.A0v = true;
                A0W.A0K = new C71355OjA(2, A11, r10, moe, z2);
                A0W.A0h = fragment.getString(2131954722);
                A0W.A1N = true;
                A0W.A0w = true;
                H1W h1w = new H1W();
                C331157Pu A002 = A0W.A00();
                A11.A00 = A002;
                DbU.A1I(fragment, h1w, A002);
                0xY AR4 = r5.AR4();
                AR4.E5T("key_should_show_locked_chat_nux", false);
                AR4.apply();
                String C6C = r10.C6C();
                0Aj A0B = C66584MXp.A0B(userSession);
                if (A0B.isSampled()) {
                    C66584MXp.A0x(A0B, "show_locked_chat_NUX", "inbox", C6C);
                    return;
                }
                return;
            }
        }
        OWM.A00.A00(userSession, "inbox", r10.C6C());
        Q2C q2c = moe.A07;
        if (q2c.A01()) {
            q2c.A00(moe.A01, new P4J(moe, r10, z), z);
            return;
        }
        C358248ab A0H = Dba.A0H(moe.A01);
        A0H.A09(2131963799);
        A0H.A08(2131963797);
        Dba.A0t(C71249OgE.A00(moe, 48), A0H, 2131963798);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.3Tu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r0 == 6) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0158, code lost:
        if (r17 == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015a, code lost:
        r8 = java.lang.Integer.valueOf(r9.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0160, code lost:
        r3.Cn3(r1, r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0163, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x017c, code lost:
        X.C48837Ekz.A00(r4, r3, new X.P3L(r5, r2, r15), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0184, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.graphics.RectF r16, X.C67058MhZ r17, X.C74396PuC r18, X.2EM r19, X.AnonymousClass2Ep r20, com.instagram.model.direct.DirectShareTarget r21, X.C254743sy r22, int r23, boolean r24, boolean r25) {
        /*
            r15 = this;
            r1 = r19
            r2 = r22
            r5 = 2
            java.util.List r3 = A09
            r0 = r23
            boolean r7 = X.C66581MXm.A1W(r0, r3)
            r6 = 0
            r4 = 1
            r3 = r20
            if (r7 != 0) goto L_0x0039
            if (r20 == 0) goto L_0x0039
            android.content.Context r9 = r15.A00
            java.lang.String r7 = X.Pxd.A00(r6)
            X.0qQ.A0C(r9, r7)
            r8 = r9
            android.app.Activity r8 = (android.app.Activity) r8
            com.instagram.common.session.UserSession r11 = r15.A02
            X.0iw r10 = r15.A05
            int r13 = r3.B6d()
            r12 = 0
            r7 = 5
            if (r0 == r7) goto L_0x0031
            r7 = 6
            r14 = 0
            if (r0 != r7) goto L_0x0032
        L_0x0031:
            r14 = 1
        L_0x0032:
            boolean r7 = X.C71118OdC.A03(r8, r9, r10, r11, r12, r13, r14)
            if (r7 == 0) goto L_0x0039
        L_0x0038:
            return
        L_0x0039:
            r8 = 0
            r10 = r21
            r7 = r24
            r9 = r17
            r11 = r18
            switch(r23) {
                case 2: goto L_0x0126;
                case 3: goto L_0x0135;
                case 4: goto L_0x013b;
                case 5: goto L_0x0151;
                case 6: goto L_0x0149;
                case 7: goto L_0x0164;
                case 8: goto L_0x0172;
                case 9: goto L_0x0045;
                case 10: goto L_0x016a;
                case 11: goto L_0x018b;
                case 12: goto L_0x0191;
                case 13: goto L_0x0197;
                case 14: goto L_0x0197;
                case 15: goto L_0x019d;
                case 16: goto L_0x004d;
                case 17: goto L_0x005b;
                case 18: goto L_0x0065;
                case 19: goto L_0x0065;
                case 20: goto L_0x006d;
                case 21: goto L_0x0045;
                case 22: goto L_0x01a3;
                case 23: goto L_0x0075;
                case 24: goto L_0x00bc;
                case 25: goto L_0x00bc;
                case 26: goto L_0x00c4;
                case 27: goto L_0x00cc;
                case 28: goto L_0x0164;
                case 29: goto L_0x0191;
                case 30: goto L_0x01a9;
                case 31: goto L_0x01af;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x00da;
                case 35: goto L_0x01b5;
                case 36: goto L_0x01b5;
                case 37: goto L_0x01bb;
                case 38: goto L_0x01bb;
                case 39: goto L_0x01c1;
                case 40: goto L_0x01d1;
                case 41: goto L_0x00e2;
                case 42: goto L_0x00fa;
                case 43: goto L_0x0112;
                case 44: goto L_0x0118;
                case 45: goto L_0x01e8;
                case 46: goto L_0x011e;
                case 47: goto L_0x011e;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = "DirectInboxThreadDialogController"
            java.lang.String r0 = "unsupported dialog option for dialog listener"
            X.0wb.A03(r1, r0)
            return
        L_0x004d:
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0038
            X.PvB r0 = r15.A06
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            r1 = r16
            r0.EFQ(r1, r2)
            return
        L_0x005b:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r1 = r25
            r0.A74(r11, r3, r2, r1)
            return
        L_0x0065:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.ADw(r3)
            return
        L_0x006d:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.EGL(r3)
            return
        L_0x0075:
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x00b7
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            java.lang.String r4 = r2.A00
            if (r4 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r3 = r15.A02
            X.OBq r0 = X.C70089Nx5.A00(r3)
            X.0xa r0 = r0.A01
            java.lang.String r2 = "msys_linked_thread_igid"
            java.lang.String r0 = r0.getString(r2, r8)
            boolean r1 = X.0mp.A0B(r0)
            X.OBq r0 = X.C70089Nx5.A00(r3)
            X.0xa r0 = r0.A01
            if (r1 != 0) goto L_0x00ab
            X.0xY r0 = r0.AR4()
            r0.ED3(r2)
            r0.apply()
            android.content.Context r1 = r15.A00
            java.lang.String r0 = "Prototype cutover thread id removed"
        L_0x00a7:
            X.C59689JTv.A00(r1, r0, r8, r6)
            return
        L_0x00ab:
            X.DbX.A1U(r0, r2, r4)
            android.content.Context r1 = r15.A00
            java.lang.String r0 = "Prototype cutover thread id set to "
            java.lang.String r0 = X.002.A0R(r0, r4)
            goto L_0x00a7
        L_0x00b7:
            android.content.Context r1 = r15.A00
            java.lang.String r0 = "Can't use thread as linked cutover thread"
            goto L_0x00a7
        L_0x00bc:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.E2j(r3)
            return
        L_0x00c4:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.APa(r3)
            return
        L_0x00cc:
            if (r20 == 0) goto L_0x0038
            X.PwA r2 = r15.A03
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.EEk(r3, r0)
            return
        L_0x00da:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.E1K(r3)
            return
        L_0x00e2:
            if (r20 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r6 = r15.A02
            X.0iw r4 = r15.A05
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r2)
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = "set_reminder_tap"
            X.OQ6.A00(r4, r6, r1, r0)
            X.PwA r0 = r15.A03
            r0.Ev7(r3)
            return
        L_0x00fa:
            if (r20 == 0) goto L_0x0038
            com.instagram.common.session.UserSession r6 = r15.A02
            X.0iw r4 = r15.A05
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r2)
            X.0qQ.A0B(r1, r5)
            java.lang.String r0 = "remove_reminder_tap"
            X.OQ6.A00(r4, r6, r1, r0)
            X.PwA r0 = r15.A03
            r0.EEU(r3)
            return
        L_0x0112:
            if (r20 == 0) goto L_0x0038
            A01(r15, r3, r4)
            return
        L_0x0118:
            if (r20 == 0) goto L_0x0038
            A01(r15, r3, r6)
            return
        L_0x011e:
            if (r20 == 0) goto L_0x0038
            X.PwA r0 = r15.A03
            r0.EIw(r3)
            return
        L_0x0126:
            X.PwA r1 = r15.A03
            if (r20 == 0) goto L_0x0131
            boolean r0 = r3.isPending()
            if (r0 != r4) goto L_0x0131
            r6 = 1
        L_0x0131:
            r1.AOb(r11, r2, r6)
            return
        L_0x0135:
            X.PwA r0 = r15.A03
            r0.AVn(r2, r7)
            return
        L_0x013b:
            X.PwA r1 = r15.A03
            if (r17 == 0) goto L_0x0145
            int r0 = r9.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0145:
            r1.Cm4(r2, r8, r7)
            return
        L_0x0149:
            X.PwA r3 = r15.A03
            X.N4G r1 = new X.N4G
            r1.<init>(r6)
            goto L_0x0158
        L_0x0151:
            X.PwA r3 = r15.A03
            X.N4G r1 = new X.N4G
            r1.<init>(r4)
        L_0x0158:
            if (r17 == 0) goto L_0x0160
            int r0 = r9.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x0160:
            r3.Cn3(r1, r2, r8, r7)
            return
        L_0x0164:
            X.PwA r0 = r15.A03
            r0.Cov(r2)
            return
        L_0x016a:
            android.content.Context r4 = r15.A00
            com.instagram.common.session.UserSession r3 = r15.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r5 = 3
            goto L_0x017c
        L_0x0172:
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0185
            android.content.Context r4 = r15.A00
            com.instagram.common.session.UserSession r3 = r15.A02
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x017c:
            X.P3L r0 = new X.P3L
            r0.<init>(r5, r2, r15)
            X.C48837Ekz.A00(r4, r3, r0, r1)
            return
        L_0x0185:
            X.PwA r0 = r15.A03
            r0.Cox(r2)
            return
        L_0x018b:
            X.PwA r0 = r15.A03
            r0.FIW(r2, r7)
            return
        L_0x0191:
            X.PwA r0 = r15.A03
            r0.FIh(r2)
            return
        L_0x0197:
            X.PwA r0 = r15.A03
            r0.FIj(r2)
            return
        L_0x019d:
            X.PwA r0 = r15.A03
            r0.FIo(r2)
            return
        L_0x01a3:
            X.PvB r0 = r15.A06
            r0.E0o(r10, r2)
            return
        L_0x01a9:
            X.PwA r0 = r15.A03
            r0.Cp1(r2)
            return
        L_0x01af:
            X.PwA r0 = r15.A03
            r0.FIl(r2)
            return
        L_0x01b5:
            X.PwA r0 = r15.A03
            r0.CLI(r2, r4)
            return
        L_0x01bb:
            X.PwA r0 = r15.A03
            r0.CLI(r2, r6)
            return
        L_0x01c1:
            if (r20 == 0) goto L_0x01c7
            X.3Tu r8 = r3.AiM()
        L_0x01c7:
            boolean r1 = X.C331057Pi.A02(r8)
            X.PwA r0 = r15.A03
            r0.E1N(r2, r1)
            return
        L_0x01d1:
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A03(r2)
            X.PwA r0 = r15.A03
            r0.ANa(r2)
            X.PvB r1 = r15.A06
            if (r17 == 0) goto L_0x01e4
            int r0 = r9.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x01e4:
            r1.D1R(r10, r2, r8)
            return
        L_0x01e8:
            if (r17 == 0) goto L_0x01f0
            int r0 = r9.A00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
        L_0x01f0:
            com.instagram.common.session.UserSession r6 = r15.A02
            androidx.fragment.app.Fragment r0 = r15.A01
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            X.2EY r0 = X.AnonymousClass2EY.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0214
            if (r20 == 0) goto L_0x0214
            java.lang.String r4 = r3.Aus()
            if (r4 == 0) goto L_0x021d
            r3 = 7
        L_0x0209:
            r1 = 15
            X.N4G r0 = new X.N4G
            r0.<init>((int) r3, (java.lang.String) r4, (int) r1)
            X.2EM r1 = X.OPR.A00(r0)
        L_0x0214:
            X.PFC r0 = new X.PFC
            r0.<init>(r15, r2, r8, r7)
            X.C70886OQd.A01(r5, r6, r1, r0)
            return
        L_0x021d:
            int r3 = r3.B6d()
            goto L_0x0209
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67484Moe.A02(android.graphics.RectF, X.MhZ, X.PuC, X.2EM, X.2Ep, com.instagram.model.direct.DirectShareTarget, X.3sy, int, boolean, boolean):void");
    }
}
