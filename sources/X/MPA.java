package X;

public final class MPA extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.K8M} */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x067e: MOVE  (r1v79 X.3jo) = (r1v78 X.3jo)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            r9 = r15
            int r0 = r14.A00
            switch(r0) {
                case 0: goto L_0x0148;
                case 1: goto L_0x005f;
                case 2: goto L_0x0162;
                case 3: goto L_0x018b;
                case 4: goto L_0x027a;
                case 5: goto L_0x040a;
                case 6: goto L_0x0519;
                case 7: goto L_0x053f;
                case 8: goto L_0x0be4;
                case 9: goto L_0x0576;
                case 10: goto L_0x058a;
                case 11: goto L_0x05b2;
                case 12: goto L_0x05c6;
                case 13: goto L_0x064c;
                case 14: goto L_0x068d;
                case 15: goto L_0x0703;
                case 16: goto L_0x073e;
                case 17: goto L_0x07f0;
                case 18: goto L_0x0809;
                case 19: goto L_0x0828;
                case 20: goto L_0x084d;
                case 21: goto L_0x087b;
                case 22: goto L_0x0890;
                case 23: goto L_0x08a4;
                case 24: goto L_0x08bd;
                case 25: goto L_0x09ba;
                case 26: goto L_0x09dd;
                case 27: goto L_0x0a01;
                case 28: goto L_0x0a79;
                case 29: goto L_0x0a94;
                case 30: goto L_0x0aa9;
                case 31: goto L_0x0abf;
                case 32: goto L_0x0006;
                case 33: goto L_0x002f;
                case 34: goto L_0x0006;
                case 35: goto L_0x0051;
                case 36: goto L_0x0adb;
                case 37: goto L_0x0bf0;
                case 38: goto L_0x0b09;
                case 39: goto L_0x0b14;
                case 40: goto L_0x0b2a;
                case 41: goto L_0x0b3f;
                case 42: goto L_0x0b51;
                case 43: goto L_0x0b64;
                case 44: goto L_0x0b94;
                case 45: goto L_0x0be4;
                case 46: goto L_0x0be4;
                case 47: goto L_0x0ba7;
                case 48: goto L_0x0bc5;
                case 49: goto L_0x0bd9;
                default: goto L_0x0006;
            }
        L_0x0006:
            boolean r0 = X.AnonymousClass7TE.A1a(r15)
            java.lang.Object r4 = r14.A01
            X.JiF r4 = (X.C60258JiF) r4
            if (r0 == 0) goto L_0x0026
            com.instagram.common.session.UserSession r3 = r4.A04
            boolean r0 = X.C64373Lap.A04(r3)
            if (r0 == 0) goto L_0x0026
            X.Lak r0 = r4.A05
            X.4DH r0 = r0.A01
            android.content.Context r2 = r0.requireContext()
            r1 = 0
            java.lang.String r0 = ""
            X.C64373Lap.A01(r2, r3, r1, r0)
        L_0x0026:
            r4.A00()
            r0 = 1
        L_0x002a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002f:
            boolean r0 = X.AnonymousClass7TE.A1a(r15)
            if (r0 == 0) goto L_0x004c
            java.lang.Object r0 = r14.A01
            X.JiF r0 = (X.C60258JiF) r0
            X.Lak r0 = r0.A05
            X.4DH r3 = r0.A01
            android.content.Context r2 = r3.requireContext()
            com.instagram.common.session.UserSession r1 = r0.A02
            r0 = 1809(0x711, float:2.535E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C50143FRa.A00(r2, r3, r3, r1, r0)
        L_0x004c:
            java.lang.Object r0 = r14.A01
            X.JiF r0 = (X.C60258JiF) r0
            goto L_0x0058
        L_0x0051:
            java.lang.Object r0 = r14.A01
            X.JiF r0 = (X.C60258JiF) r0
            r0.A00()
        L_0x0058:
            X.KTX r0 = r0.A06
            X.3Q2 r0 = r0.A02
            boolean r0 = r0.A5T
            goto L_0x002a
        L_0x005f:
            X.Jw8 r9 = (X.C61070Jw8) r9
            r5 = 0
            X.0qQ.A0B(r9, r5)
            java.lang.Object r3 = r9.A02
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r8 = r9.A01
            com.instagram.user.model.User r8 = (com.instagram.user.model.User) r8
            java.lang.Object r0 = r9.A00
            X.EVM r0 = (X.EVM) r0
            int r1 = r0.ordinal()
            r7 = 1
            r0 = 3
            if (r1 == r0) goto L_0x0bed
            r10 = 0
            if (r1 == r7) goto L_0x03fd
            r0 = 2
            if (r1 == r0) goto L_0x0086
            if (r1 == r5) goto L_0x029f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0086:
            java.lang.Object r6 = r14.A01
            X.E7S r6 = (X.E7S) r6
            java.util.Iterator r4 = r3.iterator()
        L_0x008e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x011e
            java.lang.Object r9 = r4.next()
            java.lang.String r2 = X.DbS.A0q(r9)
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r6.A0C()
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = X.DbV.A1Z(r0, r2)
            if (r0 == 0) goto L_0x008e
        L_0x00ac:
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0143
            if (r9 == 0) goto L_0x0143
            int r4 = r3.size()
            android.view.View r1 = r6.requireView()
            r0 = 2131429523(0x7f0b0893, float:1.8480721E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r1, r0)
            android.content.res.Resources r1 = X.DbV.A05(r6)
            r0 = 2131820599(0x7f110037, float:1.9273917E38)
            java.lang.String r0 = X.DbY.A0d(r1, r4, r0)
            r2.setText(r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r8 == 0) goto L_0x00e1
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r8, r7)
            r4.add(r0)
        L_0x00e1:
            boolean r0 = X.0qQ.A0K(r8, r9)
            if (r0 != 0) goto L_0x00ef
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r9, r5)
            r4.add(r0)
        L_0x00ef:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x00f7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.user.model.User r1 = (com.instagram.user.model.User) r1
            java.lang.String r0 = r1.getId()
            boolean r0 = X.DbV.A1Z(r9, r0)
            if (r0 != 0) goto L_0x00f7
            java.lang.String r1 = r1.getId()
            if (r8 == 0) goto L_0x011c
            java.lang.String r0 = r8.getId()
        L_0x0118:
            X.JTR.A1Q(r1, r0, r2, r7)
            goto L_0x00f7
        L_0x011c:
            r0 = r10
            goto L_0x0118
        L_0x011e:
            r9 = r10
            goto L_0x00ac
        L_0x0120:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x0128:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013b
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r1, r5)
            r3.add(r0)
            goto L_0x0128
        L_0x013b:
            r4.addAll(r3)
            r6.A0B(r4)
            goto L_0x0bed
        L_0x0143:
            r6.onBackPressed()
            goto L_0x0bed
        L_0x0148:
            java.util.List r0 = X.JTQ.A0i(r15)
            java.util.Iterator r2 = r0.iterator()
        L_0x0150:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0bed
            int r1 = X.AnonymousClass7TG.A0F(r2)
            java.lang.Object r0 = r14.A01
            X.0sP r0 = (X.0sP) r0
            X.C51967G9n.A0w(r1, r0)
            goto L_0x0150
        L_0x0162:
            X.OID r3 = X.DbV.A0L(r15)
            r0 = 2131626730(0x7f0e0aea, float:1.8880704E38)
            X.DbX.A1N(r3, r0)
            X.72b r2 = new X.72b
            r2.<init>()
            java.lang.Object r0 = r14.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r1 = r0.requireContext()
            android.content.Context r0 = r0.getContext()
            int r0 = X.2Yu.A02(r0)
            int r0 = r1.getColor(r0)
            r2.A00 = r0
            r3.A05 = r2
            goto L_0x0bed
        L_0x018b:
            X.N4R r9 = (X.N4R) r9
            r7 = 0
            X.0qQ.A0B(r9, r7)
            java.lang.Object r4 = r9.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r6 = r9.A00
            X.EVO r6 = (X.EVO) r6
            java.lang.Object r5 = r14.A01
            X.E7Y r5 = (X.E7Y) r5
            java.util.Iterator r3 = r4.iterator()
        L_0x01a1:
            boolean r1 = r3.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0272
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.hallpass.model.HallPassViewModel r1 = (com.instagram.hallpass.model.HallPassViewModel) r1
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x01a1
        L_0x01b3:
            com.instagram.hallpass.model.HallPassViewModel r2 = (com.instagram.hallpass.model.HallPassViewModel) r2
            if (r2 == 0) goto L_0x01b9
            java.lang.String r0 = r2.A04
        L_0x01b9:
            r5.A07 = r0
            int r1 = r6.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x01d1
            r0 = 1
            if (r1 == r0) goto L_0x026e
            r0 = 2
            if (r1 == r0) goto L_0x01ed
            if (r1 != r7) goto L_0x0275
            X.JXP r1 = X.JXP.ERROR
        L_0x01cc:
            X.0sn r0 = X.0sn.A00
            r5.updateUi(r1, r0)
        L_0x01d1:
            boolean r3 = r4.isEmpty()
            android.view.View r1 = r5.requireView()
            r0 = 2131433757(0x7f0b191d, float:1.8489309E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r1, r0)
            if (r3 != 0) goto L_0x01e7
            java.lang.String r1 = r5.A07
            r0 = 1
            if (r1 != 0) goto L_0x01e8
        L_0x01e7:
            r0 = 0
        L_0x01e8:
            r2.setEnabled(r0)
            goto L_0x0bed
        L_0x01ed:
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x0208
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r4)
            X.FXv r0 = new X.FXv
            r0.<init>()
            r1.add(r0)
            r5.A0B(r1)
        L_0x0200:
            android.view.View r2 = r5.A00
            if (r2 != 0) goto L_0x020c
            java.lang.String r1 = "emptyState"
            goto L_0x090f
        L_0x0208:
            r5.A0B(r4)
            goto L_0x0200
        L_0x020c:
            X.G7a r0 = r5.A04
            r3 = 0
            if (r0 == 0) goto L_0x021c
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x021c
            boolean r1 = r5.A0A
            r0 = 0
            if (r1 == 0) goto L_0x021e
        L_0x021c:
            r0 = 8
        L_0x021e:
            r2.setVisibility(r0)
            android.view.View r2 = r5.A01
            if (r2 != 0) goto L_0x0229
            java.lang.String r1 = "settingsEmptyState"
            goto L_0x090f
        L_0x0229:
            X.G7a r0 = r5.A04
            if (r0 != 0) goto L_0x0234
            boolean r1 = r4.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x0236
        L_0x0234:
            r0 = 8
        L_0x0236:
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r2 = r5.A02
            if (r2 != 0) goto L_0x0241
            java.lang.String r1 = "createButton"
            goto L_0x090f
        L_0x0241:
            X.G7a r0 = r5.A04
            if (r0 == 0) goto L_0x0250
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0250
            boolean r1 = r5.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0252
        L_0x0250:
            r0 = 8
        L_0x0252:
            r2.setVisibility(r0)
            com.instagram.igds.components.button.IgdsButton r1 = r5.A06
            if (r1 != 0) goto L_0x025d
            java.lang.String r1 = "shareButton"
            goto L_0x090f
        L_0x025d:
            X.G7a r0 = r5.A04
            if (r0 == 0) goto L_0x0267
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0269
        L_0x0267:
            r3 = 8
        L_0x0269:
            r1.setVisibility(r3)
            goto L_0x01d1
        L_0x026e:
            X.JXP r1 = X.JXP.LOADING
            goto L_0x01cc
        L_0x0272:
            r2 = r0
            goto L_0x01b3
        L_0x0275:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x027a:
            X.Jw8 r9 = (X.C61070Jw8) r9
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.Object r1 = r9.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r9.A00
            X.EVM r0 = (X.EVM) r0
            java.lang.String r7 = r9.A03
            int r2 = r0.ordinal()
            r8 = 1
            r0 = 3
            if (r2 == r0) goto L_0x0bed
            r11 = 0
            if (r2 == r8) goto L_0x03fd
            r0 = 2
            if (r2 == r0) goto L_0x02a7
            if (r2 == r4) goto L_0x029f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x029f:
            java.lang.Object r2 = r14.A01
            X.MYR r2 = (X.MYR) r2
            X.JXP r1 = X.JXP.ERROR
            goto L_0x0403
        L_0x02a7:
            java.lang.Object r5 = r14.A01
            X.E7T r5 = (X.E7T) r5
            java.util.Iterator r6 = r1.iterator()
        L_0x02af:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x031a
            java.lang.Object r9 = r6.next()
            java.lang.String r3 = X.DbS.A0q(r9)
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r0 = r5.A0C()
            com.instagram.user.model.User r0 = r2.A01(r0)
            boolean r0 = X.DbV.A1Z(r0, r3)
            if (r0 == 0) goto L_0x02af
        L_0x02cd:
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x03f8
            if (r9 == 0) goto L_0x03f8
            int r13 = r7.length()
            if (r13 == 0) goto L_0x031d
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r12 = r1.iterator()
        L_0x02e5:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x031c
            java.lang.Object r3 = r12.next()
            r10 = r3
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            java.lang.String r0 = r10.getUsername()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = X.DbT.A12(r2, r0)
            java.lang.String r1 = X.DbT.A12(r2, r7)
            boolean r0 = X.00l.A0d(r0, r1, r4)
            if (r0 != 0) goto L_0x0316
            java.lang.String r0 = r10.getFullName()
            if (r0 == 0) goto L_0x02e5
            java.lang.String r0 = X.DbT.A12(r2, r0)
            boolean r0 = X.00l.A0d(r0, r1, r4)
            if (r0 != r8) goto L_0x02e5
        L_0x0316:
            r6.add(r3)
            goto L_0x02e5
        L_0x031a:
            r9 = r11
            goto L_0x02cd
        L_0x031c:
            r1 = r6
        L_0x031d:
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x0325:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x033b
            java.lang.Object r2 = r3.next()
            java.lang.String r1 = X.DbS.A0q(r2)
            java.lang.String r0 = r9.getId()
            X.DbY.A1T(r1, r0, r2, r6)
            goto L_0x0325
        L_0x033b:
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r6.iterator()
        L_0x0347:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x035c
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            boolean r0 = r0.A2A()
            X.C51970G9q.A1Q(r1, r10, r7, r0)
            goto L_0x0347
        L_0x035c:
            com.instagram.common.ui.base.IgTextView r6 = r5.A01
            if (r6 != 0) goto L_0x0364
            java.lang.String r1 = "followersCount"
            goto L_0x090f
        L_0x0364:
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0383
            android.content.res.Resources r3 = r0.getResources()
            if (r3 == 0) goto L_0x0383
            r2 = 2131820745(0x7f1100c9, float:1.9274214E38)
            int r1 = r10.size()
            int r0 = r10.size()
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r0)
            java.lang.String r11 = r3.getQuantityString(r2, r1, r0)
        L_0x0383:
            r6.setText(r11)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            if (r13 != 0) goto L_0x0394
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r9, r4)
            r6.add(r0)
        L_0x0394:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r10)
            java.util.Iterator r2 = r10.iterator()
        L_0x039c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03af
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r1, r4)
            r3.add(r0)
            goto L_0x039c
        L_0x03af:
            r6.addAll(r3)
            boolean r0 = X.AnonymousClass7TE.A1b(r7)
            if (r0 == 0) goto L_0x03c8
            java.lang.Boolean r0 = r9.A0K()
            boolean r1 = X.AnonymousClass7TF.A1Y(r0, r8)
            X.Jy7 r0 = new X.Jy7
            r0.<init>(r1)
            r6.add(r0)
        L_0x03c8:
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r2 = r7.iterator()
        L_0x03d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x03e3
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.hallpass.model.HallPassMemberViewModel r0 = new com.instagram.hallpass.model.HallPassMemberViewModel
            r0.<init>(r1, r4)
            r3.add(r0)
            goto L_0x03d0
        L_0x03e3:
            r6.addAll(r3)
            r5.A0B(r6)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x0bed
            r5.A05 = r4
            androidx.recyclerview.widget.RecyclerView r0 = r5.getRecyclerView()
            r0.A0o(r4)
            goto L_0x0bed
        L_0x03f8:
            r5.onBackPressed()
            goto L_0x0bed
        L_0x03fd:
            java.lang.Object r2 = r14.A01
            X.MYR r2 = (X.MYR) r2
            X.JXP r1 = X.JXP.LOADING
        L_0x0403:
            X.0sn r0 = X.0sn.A00
            r2.updateUi(r1, r0)
            goto L_0x0bed
        L_0x040a:
            X.N4R r9 = (X.N4R) r9
            r5 = 0
            X.0qQ.A0B(r9, r5)
            java.lang.Object r4 = r9.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r9.A00
            X.EVN r0 = (X.EVN) r0
            int r1 = r0.ordinal()
            r0 = 3
            if (r1 == r0) goto L_0x0bed
            r0 = 1
            if (r1 == r0) goto L_0x04e2
            r0 = 2
            if (r1 == r0) goto L_0x046f
            if (r1 != r5) goto L_0x046a
            java.lang.Object r3 = r14.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            android.view.View r1 = r3.requireView()
            r0 = 2131436533(0x7f0b23f5, float:1.849494E38)
            int r2 = X.Dbb.A03(r1, r0)
            android.view.View r1 = r3.requireView()
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.View r1 = r3.requireView()
            r0 = 2131433754(0x7f0b191a, float:1.8489303E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.View r1 = r3.requireView()
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.View r1 = r3.requireView()
            r0 = 2131431078(0x7f0b0ea6, float:1.8483875E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.View r1 = r3.requireView()
            r0 = 2131432463(0x7f0b140f, float:1.8486684E38)
            X.DbT.A1F(r1, r0, r5)
            goto L_0x0bed
        L_0x046a:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x046f:
            java.lang.Object r3 = r14.A01
            X.E64 r3 = (X.E64) r3
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r1 = r4.iterator()
        L_0x047b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x048d
            java.lang.Object r0 = r1.next()
            X.DtL r0 = (X.C47234DtL) r0
            com.instagram.model.reels.Reel r0 = r0.A00
            r2.add(r0)
            goto L_0x047b
        L_0x048d:
            r3.A09 = r2
            android.view.View r1 = r3.requireView()
            r0 = 2131436533(0x7f0b23f5, float:1.849494E38)
            X.DbT.A1F(r1, r0, r5)
            android.view.View r1 = r3.requireView()
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            int r2 = X.Dbb.A03(r1, r0)
            android.view.View r1 = r3.requireView()
            r0 = 2131432463(0x7f0b140f, float:1.8486684E38)
            X.DbT.A1F(r1, r0, r2)
            android.view.View r1 = r3.requireView()
            r0 = 2131431078(0x7f0b0ea6, float:1.8483875E38)
            X.DbT.A1F(r1, r0, r5)
            boolean r0 = r4.isEmpty()
            android.view.View r1 = r3.requireView()
            if (r0 == 0) goto L_0x04d0
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            X.DbT.A1F(r1, r0, r5)
        L_0x04c8:
            java.lang.Integer r0 = X.C51968G9o.A0t(r4)
            r3.A03 = r0
            goto L_0x0bed
        L_0x04d0:
            r0 = 2131433754(0x7f0b191a, float:1.8489303E38)
            X.DbT.A1F(r1, r0, r5)
            X.2t9 r0 = r3.A01
            if (r0 != 0) goto L_0x04de
            java.lang.String r1 = "adapter"
            goto L_0x090f
        L_0x04de:
            X.JTR.A1L(r0, r4)
            goto L_0x04c8
        L_0x04e2:
            java.lang.Object r4 = r14.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.view.View r3 = r4.requireView()
            android.view.View r1 = r4.requireView()
            r0 = 2131436533(0x7f0b23f5, float:1.849494E38)
            int r2 = X.Dbb.A03(r1, r0)
            r0 = 2131441592(0x7f0b37b8, float:1.85052E38)
            X.DbT.A1F(r3, r0, r5)
            android.view.View r1 = r4.requireView()
            r0 = 2131431078(0x7f0b0ea6, float:1.8483875E38)
            X.DbT.A1F(r1, r0, r5)
            r0 = 2131433754(0x7f0b191a, float:1.8489303E38)
            X.DbT.A1F(r3, r0, r2)
            r0 = 2131432364(0x7f0b13ac, float:1.8486483E38)
            X.DbT.A1F(r3, r0, r2)
            r0 = 2131432463(0x7f0b140f, float:1.8486684E38)
            X.DbT.A1F(r3, r0, r2)
            goto L_0x0bed
        L_0x0519:
            X.LEq r9 = (X.C63948LEq) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r14.A01
            java.util.Iterator r4 = X.C51966G9m.A1H(r0)
        L_0x0525:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0bed
            java.lang.Object r3 = r4.next()
            com.instagram.igsignals.core.IgSignalsFeature r3 = (com.instagram.igsignals.core.IgSignalsFeature) r3
            r1 = 95
            int r0 = r3.A01
            java.lang.String r2 = X.002.A00(r1, r0)
            double r0 = r3.A00
            r9.A00(r2, r0)
            goto L_0x0525
        L_0x053f:
            com.instagram.igsignals.core.IgSignalsModelPrediction r9 = (com.instagram.igsignals.core.IgSignalsModelPrediction) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            double r4 = r9.A03
            java.lang.Object r3 = r14.A01
            X.JU5 r3 = (X.JU5) r3
            X.0eM r0 = r3.A0L
            java.lang.Object r0 = r0.getValue()
            double r1 = X.JTO.A00(r0)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0bed
            java.lang.String r8 = r3.A07
            if (r8 == 0) goto L_0x0bed
            X.1Xj r7 = r3.A04
            if (r7 == 0) goto L_0x0bed
            X.07V r5 = r3.A03
            if (r5 == 0) goto L_0x0bed
            X.LNK r4 = X.LNK.A00
            com.instagram.common.session.UserSession r6 = r3.A0G
            int r9 = r3.A02
            r10 = 300000(0x493e0, double:1.482197E-318)
            r4.A00(r5, r6, r7, r8, r9, r10)
            r0 = 1
            r3.A0E = r0
            goto L_0x0bed
        L_0x0576:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r2 = r14.A01
            X.LSL r2 = (X.LSL) r2
            X.4Cq r4 = r2.A09
            r1 = 0
            r0 = 40
            X.Pfo r3 = new X.Pfo
            r3.<init>(r15, r2, r1, r0)
            goto L_0x0bc1
        L_0x058a:
            X.OID r6 = X.DbV.A0L(r15)
            java.lang.Object r5 = r14.A01
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            android.content.Context r4 = r5.requireContext()
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131492889(0x7f0c0019, float:1.8609243E38)
            int r3 = r1.getInteger(r0)
            r2 = 2
            com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager r1 = new com.instagram.common.ui.widget.recyclerview.FastScrollingGridLayoutManager
            r1.<init>(r4, r2)
            X.Jbj r0 = new X.Jbj
            r0.<init>(r5, r3, r2)
            r1.A01 = r0
            r6.A01 = r1
            goto L_0x0bed
        L_0x05b2:
            X.3sc r9 = (X.C254523sc) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r14.A01
            X.K8M r0 = (X.K8M) r0
            X.0eM r0 = r0.A06
            java.lang.String r0 = X.DbU.A0u(r0)
            r9.A7O = r0
            goto L_0x0bed
        L_0x05c6:
            X.Kn1 r9 = (X.C62825Kn1) r9
            boolean r0 = r9 instanceof X.C61936KSl
            if (r0 != 0) goto L_0x0bed
            boolean r0 = r9 instanceof X.C61935KSk
            if (r0 == 0) goto L_0x0613
            java.lang.Object r5 = r14.A01
            X.K8M r5 = (X.K8M) r5
            X.JXP r4 = X.JXP.LOADING
            X.KSk r9 = (X.C61935KSk) r9
            java.util.List r1 = r9.A00
        L_0x05da:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r1.iterator()
        L_0x05e2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x063d
            java.lang.Object r3 = r6.next()
            X.4gL r3 = (X.C270194gL) r3
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.0eM r0 = r5.A03
            java.lang.Object r0 = r0.getValue()
            X.JhK r0 = (X.C60201JhK) r0
            X.K1d r0 = r0.A07
            X.LsO r2 = new X.LsO
            r2.<init>(r1, r0, r3)
            X.0qQ.A0A(r2)
            java.lang.String r1 = r2.BJX()
            X.Lhx r0 = new X.Lhx
            r0.<init>(r2, r1)
            r7.add(r0)
            goto L_0x05e2
        L_0x0613:
            boolean r0 = r9 instanceof X.C61934KSj
            if (r0 == 0) goto L_0x0647
            X.KSj r9 = (X.C61934KSj) r9
            X.3Ii r1 = r9.A00
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0631
            java.lang.Object r5 = r14.A01
            X.K8M r5 = (X.K8M) r5
            X.JXP r4 = X.JXP.LOADED
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.instagram.model.iglive.broadcast.BroadcastItem>"
            X.0qQ.A0C(r1, r0)
            java.util.List r1 = (java.util.List) r1
            goto L_0x05da
        L_0x0631:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0642
            java.lang.Object r5 = r14.A01
            X.MYR r5 = (X.MYR) r5
            X.JXP r4 = X.JXP.ERROR
            X.0sn r7 = X.0sn.A00
        L_0x063d:
            r5.updateUi(r4, r7)
            goto L_0x0bed
        L_0x0642:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0647:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x064c:
            X.L4e r9 = (X.C63720L4e) r9
            java.lang.Object r2 = r14.A01
            X.K6o r2 = (X.C61417K6o) r2
            X.JlN r1 = r2.A01
            if (r1 == 0) goto L_0x073a
            java.lang.String r0 = r9.A00
            r1.A02 = r0
            r0 = 0
            r1.notifyItemChanged(r0)
            java.lang.String r1 = r9.A01
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0bed
            java.lang.String r0 = r2.A03
            if (r0 != 0) goto L_0x066e
            java.lang.String r0 = "_actionBarTitle"
            goto L_0x0b70
        L_0x066e:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0bed
            r2.A03 = r1
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            boolean r0 = r1 instanceof X.C249453jo
            if (r0 == 0) goto L_0x0bed
            X.3jo r1 = (X.C249453jo) r1
            if (r1 == 0) goto L_0x0bed
            X.2dZ r0 = r1.AYJ()
            if (r0 == 0) goto L_0x0bed
            r0.A0T()
            goto L_0x0bed
        L_0x068d:
            X.Kn2 r9 = (X.C62826Kn2) r9
            boolean r0 = r9 instanceof X.C61937KSm
            java.lang.String r1 = "seriesAdapter"
            if (r0 == 0) goto L_0x06ea
            java.lang.Object r0 = r14.A01
            X.K6o r0 = (X.C61417K6o) r0
            X.JlN r3 = r0.A01
            if (r3 == 0) goto L_0x090f
            X.KSm r9 = (X.C61937KSm) r9
            boolean r1 = r9.A01
            if (r1 == 0) goto L_0x06ab
            java.util.List r0 = r3.A07
            r0.clear()
            r3.notifyDataSetChanged()
        L_0x06ab:
            boolean r0 = r9.A02
            r3.A00(r0)
            if (r1 == 0) goto L_0x06cf
            java.util.List r0 = r9.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x06cf
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x06bc:
            r2 = 0
            java.lang.Integer r0 = r3.A01
            if (r0 == r1) goto L_0x0bed
            r3.A01 = r1
            int r1 = r1.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x06f9
            r0 = 3
            if (r1 == r0) goto L_0x06f9
            goto L_0x0b90
        L_0x06cf:
            java.util.List r2 = r9.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            java.util.List r1 = r3.A07
            int r0 = r1.size()
            r1.addAll(r2)
            int r1 = r0 + 1
            int r0 = r2.size()
            r3.notifyItemRangeInserted(r1, r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x06bc
        L_0x06ea:
            boolean r0 = r9 instanceof X.C61938KSn
            if (r0 == 0) goto L_0x06fe
            java.lang.Object r0 = r14.A01
            X.K6o r0 = (X.C61417K6o) r0
            X.JlN r3 = r0.A01
            if (r3 == 0) goto L_0x090f
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x06bc
        L_0x06f9:
            r3.A00(r2)
            goto L_0x0b90
        L_0x06fe:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0703:
            com.instagram.user.model.User r9 = (com.instagram.user.model.User) r9
            java.lang.Object r0 = r14.A01
            X.K6o r0 = (X.C61417K6o) r0
            X.JlN r5 = r0.A01
            if (r5 == 0) goto L_0x073a
            X.0qQ.A0A(r9)
            r4 = 0
            X.0qQ.A0B(r9, r4)
            r5.A00 = r9
            com.instagram.common.session.UserSession r3 = r5.A06
            X.2f1 r0 = X.AnonymousClass2f1.A00(r3)
            com.instagram.user.model.FollowStatus r1 = r0.A0N(r9)
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            r2 = 1
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.String r0 = r3.A06
            boolean r0 = X.DbV.A1Z(r9, r0)
            if (r0 != 0) goto L_0x0738
            if (r1 != 0) goto L_0x0738
        L_0x0731:
            r5.A04 = r2
            r5.notifyItemChanged(r4)
            goto L_0x0bed
        L_0x0738:
            r2 = 0
            goto L_0x0731
        L_0x073a:
            java.lang.String r0 = "seriesAdapter"
            goto L_0x0b70
        L_0x073e:
            X.Kgr r9 = (X.C62501Kgr) r9
            if (r9 == 0) goto L_0x07eb
            int r1 = r9.ordinal()
            r7 = 0
            if (r1 == r7) goto L_0x0bed
            r5 = 1
            if (r1 == r5) goto L_0x07c1
            r0 = 2
            if (r1 == r0) goto L_0x0773
            r0 = 3
            if (r1 != r0) goto L_0x07eb
            java.lang.Object r2 = r14.A01
            X.K6o r2 = (X.C61417K6o) r2
            X.ERQ r1 = r2.A02
            if (r1 == 0) goto L_0x0763
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0763
            r1.A07()
        L_0x0763:
            androidx.fragment.app.FragmentActivity r2 = r2.getActivity()
            if (r2 == 0) goto L_0x0bed
            java.lang.String r1 = "igtv_delete_series_error"
            r0 = 2131964016(0x7f133070, float:1.9564802E38)
            X.C59689JTv.A01(r2, r1, r0, r7)
            goto L_0x0bed
        L_0x0773:
            java.lang.Object r6 = r14.A01
            X.K6o r6 = (X.C61417K6o) r6
            X.ERQ r1 = r6.A02
            if (r1 == 0) goto L_0x0784
            boolean r0 = r1.isResumed()
            if (r0 == 0) goto L_0x0784
            r1.A07()
        L_0x0784:
            X.JlN r1 = r6.A01
            if (r1 != 0) goto L_0x0792
            java.lang.String r0 = "seriesAdapter"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0792:
            com.instagram.common.session.UserSession r0 = r1.A06
            X.1E8 r4 = X.1E7.A00(r0)
            java.util.List r0 = r1.A07
            java.util.Iterator r3 = r0.iterator()
        L_0x079e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x07bc
            java.lang.Object r0 = r3.next()
            X.LrL r0 = (X.C65322LrL) r0
            java.lang.String r0 = r0.A07
            X.1Xj r2 = r4.A02(r0)
            if (r2 == 0) goto L_0x079e
            r1 = 0
            X.1Xy r0 = r2.A0C
            r0.EZb(r1)
            r4.A01(r2, r5, r7)
            goto L_0x079e
        L_0x07bc:
            X.DbX.A1J(r6)
            goto L_0x0bed
        L_0x07c1:
            java.lang.Object r4 = r14.A01
            X.K6o r4 = (X.C61417K6o) r4
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            if (r0 == 0) goto L_0x0bed
            X.0hq r3 = r0.getSupportFragmentManager()
            if (r3 == 0) goto L_0x0bed
            X.ERQ r2 = new X.ERQ
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "isDeleting"
            r1.putBoolean(r0, r5)
            r2.setArguments(r1)
            java.lang.String r0 = "ProgressDialog"
            r2.A0B(r3, r0)
            r4.A02 = r2
            goto L_0x0bed
        L_0x07eb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x07f0:
            X.LM6 r9 = (X.LM6) r9
            java.lang.Object r0 = r14.A01
            X.K6s r0 = (X.C61421K6s) r0
            com.google.android.material.tabs.TabLayout r1 = r0.A02
            if (r1 != 0) goto L_0x07fe
            java.lang.String r0 = "tabLayout"
            goto L_0x0b70
        L_0x07fe:
            boolean r0 = r9.A00
            int r0 = X.JTQ.A00(r0)
            r1.setVisibility(r0)
            goto L_0x0bed
        L_0x0809:
            boolean r0 = X.AnonymousClass7TE.A1a(r15)
            if (r0 == 0) goto L_0x0bed
            java.lang.Object r1 = r14.A01
            X.K6s r1 = (X.C61421K6s) r1
            X.9Pn r0 = r1.A04
            if (r0 == 0) goto L_0x0849
            r0.EEp()
            X.0eM r0 = r1.A0A
            X.JhP r0 = X.JTT.A0V(r0)
            X.2Fj r1 = r0.A03
            r0 = 0
            X.JTP.A1B(r1, r0)
            goto L_0x0bed
        L_0x0828:
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.Object r1 = r14.A01
            X.K6s r1 = (X.C61421K6s) r1
            X.0eM r0 = r1.A0A
            X.JhP r0 = X.JTT.A0V(r0)
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0bed
            X.9Pn r0 = r1.A04
            if (r0 == 0) goto L_0x0849
            int r1 = X.JTP.A09(r9)
            X.9Pw r0 = r0.A08
            if (r0 == 0) goto L_0x0bed
            r0.A0H(r1)
            goto L_0x0bed
        L_0x0849:
            java.lang.String r0 = "videoPreviewDelegate"
            goto L_0x0b70
        L_0x084d:
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.Object r1 = r14.A01
            X.K7p r1 = (X.C61440K7p) r1
            X.0eM r0 = r1.A02
            X.JhP r0 = X.JTT.A0V(r0)
            boolean r0 = r0.A04
            if (r0 != 0) goto L_0x0bed
            com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView r4 = r1.A00
            if (r4 != 0) goto L_0x0865
            java.lang.String r0 = "filmstripView"
            goto L_0x0b70
        L_0x0865:
            int r0 = X.JTP.A09(r9)
            float r3 = (float) r0
            X.0eM r0 = r1.A04
            X.KTX r0 = X.JTR.A0o(r0)
            long r1 = r0.A00()
            float r0 = (float) r1
            float r3 = r3 / r0
            r4.setSeekPosition(r3)
            goto L_0x0bed
        L_0x087b:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r14.A01
            X.K6n r1 = (X.C61416K6n) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0bed
            X.0eM r0 = r1.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r0)
            r0.ET0(r9)
            goto L_0x0bed
        L_0x0890:
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.Object r0 = r14.A01
            X.K6n r0 = (X.C61416K6n) r0
            X.3Q2 r0 = X.LJ9.A00(r0)
            com.instagram.pendingmedia.model.ClipInfo r1 = r0.A1N
            int r0 = r9.intValue()
            r1.A03 = r0
            goto L_0x0bed
        L_0x08a4:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r1 = r14.A01
            X.K6n r1 = (X.C61416K6n) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0bed
            X.0eM r0 = r1.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            boolean r0 = r9.booleanValue()
            r1.ESz(r0)
            goto L_0x0bed
        L_0x08bd:
            com.google.common.collect.ImmutableList r9 = (com.google.common.collect.ImmutableList) r9
            if (r9 == 0) goto L_0x09b0
            boolean r0 = X.AnonymousClass7TE.A1b(r9)
            if (r0 == 0) goto L_0x09b0
            java.lang.Object r6 = r14.A01
            X.KSo r6 = (X.C61939KSo) r6
            r6.A03 = r9
            int r1 = r9.size()
            int r0 = r6.A02
            if (r1 == r0) goto L_0x08f5
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            int r4 = r9.size()
            r3 = 0
            int r2 = r6.A02
        L_0x08e0:
            if (r3 >= r2) goto L_0x08f4
            int r1 = r4 + -1
            int r1 = r1 * r3
            int r0 = r6.A02
            int r0 = r0 + -1
            int r1 = r1 / r0
            java.lang.Object r0 = r9.get(r1)
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x08e0
        L_0x08f4:
            r9 = r5
        L_0x08f5:
            r6.A02 = r9
            int r1 = r9.size()
            int r0 = r6.A02
            r2 = 0
            if (r1 != r0) goto L_0x09ab
            java.util.List r0 = r6.A02
            int r4 = r0.size()
            r3 = 0
        L_0x0907:
            if (r3 >= r4) goto L_0x0934
            android.widget.LinearLayout r0 = r6.A01
            if (r0 != 0) goto L_0x0917
            java.lang.String r1 = "thumbnailsContainer"
        L_0x090f:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0917:
            android.view.View r1 = r0.getChildAt(r3)
            r0 = 10
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r1, r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            java.util.List r0 = r6.A02
            java.lang.Object r0 = r0.get(r3)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r1.setUrl(r0, r6)
            int r3 = r3 + 1
            goto L_0x0907
        L_0x0934:
            X.0eM r1 = r6.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r1)
            X.Lsu r0 = r0.A0M
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L_0x0984
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r1)
            X.Lsu r0 = r0.A0M
            boolean r0 = r0.A0Y
            if (r0 != 0) goto L_0x0984
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r1)
            X.Lsu r0 = r0.A0M
            int r4 = r0.A01
            android.widget.SeekBar r0 = r6.A05
            if (r0 == 0) goto L_0x09a1
            r0.setProgress(r4)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A06
            if (r3 == 0) goto L_0x099d
            java.util.List r2 = r6.A03
            android.widget.SeekBar r0 = r6.A05
            if (r0 == 0) goto L_0x09a1
            int r1 = r0.getMax()
            java.util.List r0 = r6.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x097b
            r4 = 0
        L_0x0970:
            java.lang.Object r0 = r2.get(r4)
        L_0x0974:
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r3.setUrl(r0, r6)
            goto L_0x0bed
        L_0x097b:
            java.util.List r0 = r6.A03
            int r0 = X.C51966G9m.A06(r0)
            int r4 = r4 * r0
            int r4 = r4 / r1
            goto L_0x0970
        L_0x0984:
            boolean r0 = r6.A08
            if (r0 != 0) goto L_0x0992
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r1)
            X.Lsu r0 = r0.A0M
            java.lang.String r0 = r0.A0J
            if (r0 != 0) goto L_0x0bed
        L_0x0992:
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A06
            if (r3 == 0) goto L_0x099d
            java.util.List r0 = r6.A03
            java.lang.Object r0 = r0.get(r2)
            goto L_0x0974
        L_0x099d:
            java.lang.String r1 = "uploadedCoverPhoto"
            goto L_0x090f
        L_0x09a1:
            java.lang.String r0 = "seekBar"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x09ab:
            java.lang.IllegalStateException r0 = X.DbT.A0m()
            throw r0
        L_0x09b0:
            java.lang.String r2 = "post_live_igtv_cover_picker"
            java.lang.String r1 = "Empty thumbnails from server"
            r0 = 0
            X.0kD.A09(r2, r1, r0)
            goto L_0x0bed
        L_0x09ba:
            X.OID r2 = X.DbV.A0L(r15)
            java.lang.Object r1 = r14.A01
            X.K8A r1 = (X.K8A) r1
            boolean r0 = r1 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x09d9
            r0 = 2131629827(0x7f0e1703, float:1.8886986E38)
        L_0x09c9:
            X.DbX.A1N(r2, r0)
            androidx.fragment.app.FragmentActivity r0 = r1.getActivity()
            boolean r0 = r0 instanceof com.instagram.igtv.uploadflow.IGTVUploadActivity
            r2.A08 = r0
            r0 = 1
            r2.A09 = r0
            goto L_0x0bed
        L_0x09d9:
            r0 = 2131629819(0x7f0e16fb, float:1.888697E38)
            goto L_0x09c9
        L_0x09dd:
            java.lang.String r9 = (java.lang.String) r9
            r10 = 0
            X.0qQ.A0B(r9, r10)
            java.lang.Object r0 = r14.A01
            X.KSr r0 = (X.C61942KSr) r0
            X.2EG r8 = X.2EG.A24
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.0eM r0 = r0.A0W
            com.instagram.common.session.UserSession r7 = X.AnonymousClass7TE.A0l(r0)
            X.SUL r5 = new X.SUL
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.String r0 = "ig_video_sharing_settings"
            r5.A0S = r0
            r5.A0A()
            goto L_0x0bed
        L_0x0a01:
            X.Kn3 r9 = (X.C62827Kn3) r9
            X.KTe r0 = X.C61955KTe.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x0bed
            X.KTd r0 = X.C61954KTd.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x0bed
            X.KTf r0 = X.C61956KTf.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x0a30
            java.lang.Object r4 = r14.A01
            X.K8A r4 = (X.K8A) r4
            r1 = 1
            r4.A03 = r1
            r0 = 0
            r4.A02 = r0
            r4.A02 = r1
        L_0x0a27:
            java.util.ArrayList r0 = r4.A0D()
            r4.A0B(r0)
            goto L_0x0bed
        L_0x0a30:
            boolean r0 = r9 instanceof X.C61951KTa
            if (r0 == 0) goto L_0x0a4f
            java.lang.Object r4 = r14.A01
            X.K8A r4 = (X.K8A) r4
            X.KTa r9 = (X.C61951KTa) r9
            X.LMg r1 = r9.A00
        L_0x0a3c:
            r0 = 1
            r4.A03 = r0
            r0 = 0
            r4.A02 = r0
            if (r1 == 0) goto L_0x0a27
            X.0eM r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.JiN r0 = (X.C60266JiN) r0
            r0.A01 = r1
            goto L_0x0a27
        L_0x0a4f:
            X.KTb r0 = X.C61952KTb.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x0a64
            X.KTc r0 = X.C61953KTc.A00
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 != 0) goto L_0x0a64
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0a64:
            java.lang.Object r4 = r14.A01
            X.K8A r4 = (X.K8A) r4
            android.content.Context r3 = r4.getContext()
            r2 = 1
            if (r3 == 0) goto L_0x0a77
            r1 = 2131964074(0x7f1330aa, float:1.956492E38)
            java.lang.String r0 = "igtv_series_validation_error"
            X.C59689JTv.A01(r3, r0, r1, r2)
        L_0x0a77:
            r1 = 0
            goto L_0x0a3c
        L_0x0a79:
            java.lang.Object r1 = r14.A01
            X.KSr r1 = (X.C61942KSr) r1
            boolean r0 = X.JTT.A1a(r1)
            if (r0 != 0) goto L_0x0bed
            X.LAS r0 = r1.A0H
            if (r0 != 0) goto L_0x0a8b
            java.lang.String r0 = "config"
            goto L_0x0b70
        L_0x0a8b:
            com.instagram.igtv.model.IGTVCreationToolsResponse r0 = r0.A00
            if (r0 == 0) goto L_0x0bed
            com.instagram.model.shopping.video.ShoppingCreationConfig r0 = r0.A00
            if (r0 == 0) goto L_0x0bed
            goto L_0x0aa4
        L_0x0a94:
            com.google.common.collect.ImmutableList r9 = (com.google.common.collect.ImmutableList) r9
            if (r9 == 0) goto L_0x0bed
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0bed
            java.lang.Object r1 = r14.A01
            X.KSr r1 = (X.C61942KSr) r1
            r1.A04 = r9
        L_0x0aa4:
            X.C61942KSr.A0A(r1)
            goto L_0x0bed
        L_0x0aa9:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L_0x0bed
            boolean r0 = X.00l.A0W(r9)
            if (r0 != 0) goto L_0x0bed
            java.lang.Object r1 = r14.A01
            X.KSr r1 = (X.C61942KSr) r1
            r0 = 1
            r1.A0M = r0
            r1.A0E()
            goto L_0x0bed
        L_0x0abf:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
            java.lang.Object r2 = r14.A01
            X.JiF r2 = (X.C60258JiF) r2
            X.KTX r1 = r2.A06
            X.3Q2 r0 = r1.A02
            r0.A5T = r3
            X.MW0 r0 = r1.A01
            r0.EkA(r3)
            X.2Fj r0 = r2.A03
            r0.A0B(r9)
            goto L_0x0bed
        L_0x0adb:
            boolean r0 = r15 instanceof X.C61943KSs
            if (r0 == 0) goto L_0x0aee
            java.lang.Object r1 = r14.A01
            X.L9B r1 = (X.L9B) r1
            X.JiF r0 = r1.A02
            X.KTX r0 = r0.A06
            X.3Q2 r0 = r0.A02
            boolean r0 = r0.A5T
            r1.A00 = r0
            goto L_0x0b0d
        L_0x0aee:
            boolean r0 = r15 instanceof X.C61944KSt
            if (r0 == 0) goto L_0x0b04
            java.lang.Object r0 = r14.A01
            X.L9B r0 = (X.L9B) r0
            X.L1l r2 = r0.A03
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x0bed
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2.A00 = r0
            goto L_0x0bed
        L_0x0b04:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0b09:
            java.lang.Object r1 = r14.A01
            X.L9B r1 = (X.L9B) r1
        L_0x0b0d:
            X.0sa r0 = r1.A04
            r0.invoke()
            goto L_0x0bed
        L_0x0b14:
            X.OID r2 = X.DbV.A0L(r15)
            java.lang.Object r0 = r14.A01
            android.content.Context r1 = X.DbT.A07(r0)
            com.instagram.igtv.uploadflow.series.IGTVUploadSeriesSelectionFragment$getRecyclerConfigBuilder$1$1 r0 = new com.instagram.igtv.uploadflow.series.IGTVUploadSeriesSelectionFragment$getRecyclerConfigBuilder$1$1
            r0.<init>(r1)
            r2.A01 = r0
            r0 = 1
            r2.A08 = r0
            goto L_0x0bed
        L_0x0b2a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            java.lang.Object r2 = r14.A01
            X.R8N r2 = (X.R8N) r2
            if (r9 == 0) goto L_0x0b39
            boolean r1 = r9.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0b3a
        L_0x0b39:
            r0 = 0
        L_0x0b3a:
            X.R8N.A07(r2, r0)
            goto L_0x0bed
        L_0x0b3f:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r14.A01
            X.E4f r0 = (X.C47480E4f) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.JlH r0 = (X.C60424JlH) r0
            X.0qQ.A0A(r9)
            goto L_0x0b5f
        L_0x0b51:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r0 = r14.A01
            X.E4f r0 = (X.C47480E4f) r0
            X.0eM r0 = r0.A0B
            java.lang.Object r0 = r0.getValue()
            X.JlH r0 = (X.C60424JlH) r0
        L_0x0b5f:
            r0.A00(r9)
            goto L_0x0bed
        L_0x0b64:
            X.JwG r9 = (X.C61078JwG) r9
            java.lang.Object r3 = r14.A01
            X.K7T r3 = (X.K7T) r3
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r3.A02
            if (r2 != 0) goto L_0x0b78
            java.lang.String r0 = "loadingSpinner"
        L_0x0b70:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0b78:
            java.lang.Object r1 = r9.A00
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            int r0 = X.DbW.A01(r0)
            r2.setVisibility(r0)
            X.Jkw r3 = r3.A01
            if (r3 != 0) goto L_0x0b8e
            java.lang.String r0 = "promptsAdapter"
            goto L_0x0b70
        L_0x0b8e:
            r3.A00 = r1
        L_0x0b90:
            r3.notifyDataSetChanged()
            goto L_0x0bed
        L_0x0b94:
            X.6Gb r9 = (X.C305006Gb) r9
            r0 = 0
            X.0qQ.A0B(r9, r0)
            java.lang.Object r0 = r14.A01
            X.Gmi r0 = (X.C53358Gmi) r0
            int r2 = r0.A01
            X.0sJ r1 = X.C55342HgA.A00
            r0 = 0
            r9.CfB(r0, r1, r2)
            goto L_0x0bed
        L_0x0ba7:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r14.A01
            X.E5S r0 = (X.E5S) r0
            X.0eM r0 = r0.A02
            X.2YL r2 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r2)
            r1 = 0
            r0 = 39
            X.MH0 r3 = new X.MH0
            r3.<init>((java.lang.Object) r15, (java.lang.Object) r2, (X.AnonymousClass4D7) r1, (int) r0)
        L_0x0bc1:
            X.AnonymousClass7TE.A1Z(r3, r4)
            goto L_0x0bed
        L_0x0bc5:
            java.lang.String r1 = X.C41847B3o.A1E(r15)
            java.lang.Object r0 = r14.A01
            X.E5S r0 = (X.E5S) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.DkJ r0 = (X.C46730DkJ) r0
            r0.A0F(r1)
            goto L_0x0bed
        L_0x0bd9:
            boolean r1 = X.AnonymousClass7TE.A1a(r15)
            java.lang.Object r0 = r14.A01
            X.E5S r0 = (X.E5S) r0
            r0.A00 = r1
            goto L_0x0bed
        L_0x0be4:
            r0 = 0
            X.0qQ.A0B(r15, r0)
            java.lang.Object r0 = r14.A01
            X.C51965G9l.A1W(r0, r15)
        L_0x0bed:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0bf0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MPA.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MPA(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    public static MPA A00(Object obj, int i) {
        return new MPA(obj, i);
    }
}
