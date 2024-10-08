package X;

/* renamed from: X.PmD  reason: case insensitive filesystem */
public final class C73933PmD extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73933PmD(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.facebook.msys.mca.MailboxFeature} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: X.632} */
    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x061d: MOVE  (r1v39 com.instagram.base.activity.BaseFragmentActivity) = (r1v38 com.instagram.base.activity.BaseFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    public final java.lang.Object invoke(java.lang.Object r26) {
        /*
            r25 = this;
            r4 = r25
            r3 = r26
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x02b9;
                case 1: goto L_0x02b9;
                case 2: goto L_0x0677;
                case 3: goto L_0x067e;
                case 4: goto L_0x0685;
                case 5: goto L_0x02d2;
                case 6: goto L_0x02b0;
                case 7: goto L_0x0081;
                case 8: goto L_0x02ec;
                case 9: goto L_0x034b;
                case 10: goto L_0x03c1;
                case 11: goto L_0x06b6;
                case 12: goto L_0x03d5;
                case 13: goto L_0x06aa;
                case 14: goto L_0x03e9;
                case 15: goto L_0x045a;
                case 16: goto L_0x06b9;
                case 17: goto L_0x0465;
                case 18: goto L_0x06dc;
                case 19: goto L_0x06e8;
                case 20: goto L_0x01cb;
                case 21: goto L_0x0526;
                case 22: goto L_0x0534;
                case 23: goto L_0x0715;
                case 24: goto L_0x0715;
                case 25: goto L_0x0728;
                case 26: goto L_0x0750;
                case 27: goto L_0x075a;
                case 28: goto L_0x0009;
                case 29: goto L_0x0227;
                case 30: goto L_0x026d;
                case 31: goto L_0x0009;
                case 32: goto L_0x0774;
                case 33: goto L_0x0783;
                case 34: goto L_0x079d;
                case 35: goto L_0x07b9;
                case 36: goto L_0x055d;
                case 37: goto L_0x057a;
                case 38: goto L_0x058a;
                case 39: goto L_0x05c3;
                case 40: goto L_0x05d2;
                case 41: goto L_0x07d0;
                case 42: goto L_0x028c;
                case 43: goto L_0x05e2;
                case 44: goto L_0x0606;
                case 45: goto L_0x0626;
                case 46: goto L_0x0638;
                case 47: goto L_0x064e;
                case 48: goto L_0x0819;
                case 49: goto L_0x082a;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r8 = X.AnonymousClass7TE.A0M(r3)
            java.lang.Object r0 = r4.A01
            X.K6a r0 = (X.C61404K6a) r0
            X.JiT r4 = r0.A02
            if (r4 == 0) goto L_0x0289
            X.2Fj r7 = r4.A01
            java.lang.Object r0 = r7.A02()
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0v()
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 != 0) goto L_0x0057
            java.util.ArrayList r5 = X.C60272JiT.A00(r4)
            java.lang.Object r9 = r5.get(r8)
            X.MXM r9 = (X.MXM) r9
            boolean r3 = r9 instanceof X.C65308Lr6
            X.LEd r0 = r4.A05
            X.0wc r1 = r0.A00
            java.lang.String r0 = "mwb_muted_words_settings_event"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r3 == 0) goto L_0x005a
            r1 = 6
            java.lang.String r0 = "action"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            r2.Cgf()
            X.6oS r5 = X.C318116oQ.A00(r4)
            X.4Cc r3 = r4.A06
            r1 = 0
            r0 = 14
            X.MGs r2 = new X.MGs
            r2.<init>(r4, r1, r0)
        L_0x0054:
            X.1Eo.A05(r3, r2, r5)
        L_0x0057:
            X.0gF r4 = X.C60340gF.A00
        L_0x0059:
            return r4
        L_0x005a:
            r1 = 7
            java.lang.String r0 = "action"
            X.AnonymousClass7TE.A1W(r2, r0, r1)
            r2.Cgf()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.direct.wellbeing.safetyecosystem.mutedwords.dictionary.ui.list.MutedWordItemModel"
            X.0qQ.A0C(r9, r0)
            X.Jz2 r9 = (X.C61209Jz2) r9
            java.lang.String r2 = r9.A00
            java.lang.String r1 = r9.A01
            X.Jz1 r0 = new X.Jz1
            r0.<init>(r2, r1)
            r5.set(r8, r0)
            r4.A00 = r8
            r7.A0A(r6)
            X.2Fj r0 = r4.A03
            r0.A0B(r5)
            goto L_0x0057
        L_0x0081:
            X.68J r3 = (X.AnonymousClass68J) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.632 r12 = new X.632
            r12.<init>(r3)
            java.lang.Object r0 = r4.A01
            com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource r0 = (com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource) r0
            com.instagram.direct.securityalert.data.room.SecurityAlertDatabase r13 = r0.A02
            X.OFP r5 = r13.A00()
            com.instagram.common.session.UserSession r0 = r0.A00
            java.lang.String r3 = r0.A06
            java.lang.String r2 = "\n    SELECT *\n    FROM participant_device_change\n    WHERE user_id = ?\n    ORDER BY device_change_timestamp_ms DESC\n  "
            r1 = 1
            java.util.TreeMap r0 = X.1WY.A08
            X.1WY r4 = X.1Wa.A00(r2, r1)
            r4.ADh(r1, r3)
            X.3oI r0 = r5.A01
            r0.assertNotSuspendingTransaction()
            r10 = 0
            android.database.Cursor r3 = r0.query((X.AnonymousClass1WA) r4, (android.os.CancellationSignal) r10)
            java.lang.String r0 = "id"
            int r9 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "user_id"
            int r8 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "participantUserId"
            int r7 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            r0 = 1273(0x4f9, float:1.784E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0846 }
            int r2 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "device_change_type"
            int r6 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "device_change_timestamp_ms"
            int r5 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "should_display_device_change_admin_message"
            int r1 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.lang.String r0 = "is_interop_participant"
            int r0 = X.1Wd.A01(r3, r0)     // Catch:{ all -> 0x0846 }
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0o(r3)     // Catch:{ all -> 0x0846 }
        L_0x00e8:
            boolean r14 = r3.moveToNext()     // Catch:{ all -> 0x0846 }
            if (r14 == 0) goto L_0x0128
            int r17 = r3.getInt(r9)     // Catch:{ all -> 0x0846 }
            java.lang.String r15 = r3.getString(r8)     // Catch:{ all -> 0x0846 }
            long r19 = r3.getLong(r7)     // Catch:{ all -> 0x0846 }
            boolean r14 = r3.isNull(r2)     // Catch:{ all -> 0x0846 }
            if (r14 == 0) goto L_0x0103
            r16 = r10
            goto L_0x0107
        L_0x0103:
            java.lang.String r16 = r3.getString(r2)     // Catch:{ all -> 0x0846 }
        L_0x0107:
            int r18 = r3.getInt(r6)     // Catch:{ all -> 0x0846 }
            long r21 = r3.getLong(r5)     // Catch:{ all -> 0x0846 }
            int r14 = r3.getInt(r1)     // Catch:{ all -> 0x0846 }
            boolean r23 = X.AnonymousClass7TF.A1P(r14)
            int r14 = r3.getInt(r0)     // Catch:{ all -> 0x0846 }
            boolean r24 = X.AnonymousClass7TF.A1P(r14)
            X.N3X r14 = new X.N3X     // Catch:{ all -> 0x0846 }
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r24)     // Catch:{ all -> 0x0846 }
            r11.add(r14)     // Catch:{ all -> 0x0846 }
            goto L_0x00e8
        L_0x0128:
            r3.close()
            r4.A00()
            java.util.Iterator r8 = r11.iterator()
        L_0x0132:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r4 = r8.next()
            X.N3X r4 = (X.N3X) r4
            long r2 = r4.A03
            java.lang.String r7 = r4.A04
            int r6 = r4.A00
            long r0 = r4.A02
            boolean r5 = r4.A07
            boolean r4 = r4.A06
            X.Opa r15 = X.C71716Opa.A00
            r14 = r12
            r16 = r7
            r17 = r6
            r18 = r2
            r20 = r0
            r22 = r5
            r23 = r4
            r14.A00(r15, r16, r17, r18, r20, r22, r23)
            goto L_0x0132
        L_0x015d:
            X.OFP r2 = r13.A00()
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x0169:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r0 = r1.next()
            X.N3X r0 = (X.N3X) r0
            int r0 = r0.A01
            X.AnonymousClass7TF.A1M(r3, r0)
            goto L_0x0169
        L_0x017b:
            X.3oI r5 = r2.A01
            r5.assertNotSuspendingTransaction()
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "\n"
            r2.append(r1)
            java.lang.String r0 = "    DELETE FROM participant_device_change WHERE id IN ("
            r2.append(r0)
            int r0 = r3.size()
            X.1wO.A00(r2, r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = "  "
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r2)
            X.1WV r4 = r5.compileStatement(r0)
            java.util.Iterator r3 = r3.iterator()
            r2 = 1
        L_0x01ac:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x01bd
            int r0 = X.AnonymousClass7TG.A0F(r3)
            long r0 = (long) r0
            r4.ADa(r2, r0)
            int r2 = r2 + 1
            goto L_0x01ac
        L_0x01bd:
            r5.beginTransaction()
            r4.ATQ()     // Catch:{ all -> 0x0841 }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x0841 }
            r5.endTransaction()
            goto L_0x0057
        L_0x01cb:
            X.OGH r3 = (X.OGH) r3
            r7 = 0
            X.0qQ.A0B(r3, r7)
            java.lang.Object r2 = r4.A01
            X.7Kl r2 = (X.C329847Kl) r2
            r2.A0A = r3
            X.3ts r1 = r3.A01
            X.3tr r0 = X.C255273tr.A07
            if (r1 != r0) goto L_0x0057
            X.OBx r6 = r2.A06
            if (r6 != 0) goto L_0x01e5
            java.lang.String r0 = "previousReplyLogger"
            goto L_0x02a0
        L_0x01e5:
            com.instagram.common.session.UserSession r0 = r2.A0K
            java.lang.String r5 = r0.A06
            java.util.List r0 = r2.A0N
            java.lang.String r4 = X.C51966G9m.A1G(r0, r7)
            java.lang.String r2 = r2.A0D
            X.0wc r1 = r6.A01
            java.lang.String r0 = "smart_suggestion_accept"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            if (r4 == 0) goto L_0x0057
            if (r2 == 0) goto L_0x0057
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0057
            X.91i r1 = r6.A00
            java.lang.String r0 = "suggestion_type"
            r3.A8M(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r5)
            java.lang.String r0 = "page_or_business_id"
            r3.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r4)
            java.lang.String r0 = "consumer_id"
            r3.A9F(r0, r1)
            java.lang.String r0 = "request_id"
            r3.AAJ(r0, r2)
            java.lang.String r1 = "INSTAGRAM"
            java.lang.String r0 = "channel"
            goto L_0x066f
        L_0x0227:
            int r3 = X.AnonymousClass7TE.A0M(r3)
            java.lang.Object r7 = r4.A01
            X.K6a r7 = (X.C61404K6a) r7
            X.JiT r6 = r7.A02
            if (r6 == 0) goto L_0x0289
            r0 = -1
            r6.A00 = r0
            X.2Fj r1 = r6.A01
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            r1.A0A(r0)
            java.util.ArrayList r2 = X.C60272JiT.A00(r6)
            java.lang.Object r5 = r2.remove(r3)
            X.2Fj r0 = r6.A03
            r0.A0B(r2)
            X.LEd r1 = r6.A05
            int r0 = r2.size()
            r1.A00(r0)
            X.6oS r4 = X.C318116oQ.A00(r6)
            X.4Cc r3 = r6.A06
            r2 = 0
            r1 = 42
            X.Pfn r0 = new X.Pfn
            r0.<init>(r5, r6, r2, r1)
            X.1Eo.A05(r3, r0, r4)
            android.view.View r0 = r7.mView
            X.0nA.A0N(r0)
            goto L_0x0057
        L_0x026d:
            java.lang.String r6 = X.C41847B3o.A1E(r3)
            java.lang.Object r0 = r4.A01
            X.K6a r0 = (X.C61404K6a) r0
            X.JiT r4 = r0.A02
            if (r4 == 0) goto L_0x0289
            X.6oS r5 = X.C318116oQ.A00(r4)
            X.4Cc r3 = r4.A06
            r1 = 0
            r0 = 27
            X.MGy r2 = new X.MGy
            r2.<init>(r4, r6, r1, r0)
            goto L_0x0054
        L_0x0289:
            java.lang.String r0 = "viewModel"
            goto L_0x02a0
        L_0x028c:
            java.util.List r2 = X.JTQ.A0i(r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0057
            java.lang.Object r0 = r4.A01
            X.32L r0 = (X.AnonymousClass32L) r0
            X.GWY r0 = r0.A0J
            if (r0 != 0) goto L_0x02a8
            java.lang.String r0 = "viewController"
        L_0x02a0:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x02a8:
            X.GT0 r1 = r0.A09
            r0 = 0
            r1.A01(r2, r0)
            goto L_0x0057
        L_0x02b0:
            if (r26 == 0) goto L_0x0057
            java.lang.String r0 = "_searchResults"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x02b9:
            X.37E r2 = X.AnonymousClass37D.A00
            java.lang.Object r1 = r4.A01
            X.Moq r1 = (X.C67496Moq) r1
            androidx.fragment.app.FragmentActivity r0 = r1.A05
            X.DbX.A10(r0, r2)
            X.Mop r0 = r1.A08
            X.Mkx r1 = r0.A00
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x0057
            r0 = 0
            X.C67263Mkx.A07(r1, r0)
            goto L_0x0057
        L_0x02d2:
            X.5g5 r3 = (X.C290865g5) r3
            if (r3 == 0) goto L_0x0057
            java.lang.Object r2 = r4.A01
            X.OAG r2 = (X.OAG) r2
            if (r2 == 0) goto L_0x0057
            java.util.List r1 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<T of com.instagram.direct.search.provider.RTRSearchDelegateImpl>"
            X.0qQ.A0C(r1, r0)
            X.PPf r0 = r2.A00
            r0.A05 = r1
            X.C72921PPf.A00(r0)
            goto L_0x0057
        L_0x02ec:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
            java.lang.Object r4 = r4.A01
            X.Mtx r4 = (X.C67744Mtx) r4
            com.instagram.common.session.UserSession r0 = r4.A00
            X.0Aj r2 = X.JTU.A09(r0)
            java.lang.String r1 = "toggle_self_alert"
            java.lang.String r0 = "security_alert_action"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "self_alert_enabled"
            r2.A7p(r0, r3)
            java.lang.String r1 = "setting_page"
            java.lang.String r0 = "source"
            X.C66582MXn.A1A(r2, r0, r1)
            X.5Gf r0 = r4.A02
            r0.A00(r8)
            X.05G r4 = r4.A03
        L_0x0316:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JwM r2 = (X.C61084JwM) r2
            java.lang.Object r0 = r2.A00
            X.Jvy r0 = (X.C61060Jvy) r0
            if (r0 == 0) goto L_0x0349
            boolean r9 = r0.A02
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            boolean r10 = r0.A04
            r0 = 2
            X.0qQ.A0B(r6, r0)
            r7 = 4
            X.Jvy r5 = new X.Jvy
            r5.<init>((java.util.List) r6, (int) r7, (boolean) r8, (boolean) r9, (boolean) r10)
        L_0x0335:
            java.lang.Object r1 = r2.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            X.JwM r0 = X.C61084JwM.A00(r5, r1, r0)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0316
            goto L_0x0057
        L_0x0349:
            r5 = 0
            goto L_0x0335
        L_0x034b:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r9 = r3.booleanValue()
            java.lang.Object r4 = r4.A01
            X.Mtx r4 = (X.C67744Mtx) r4
            com.instagram.common.session.UserSession r0 = r4.A00
            X.0Aj r2 = X.JTU.A09(r0)
            java.lang.String r1 = "toggle_contact_alert"
            java.lang.String r0 = "security_alert_action"
            r2.AAJ(r0, r1)
            java.lang.String r0 = "self_alert_enabled"
            r2.A7p(r0, r3)
            java.lang.String r1 = "setting_page"
            java.lang.String r0 = "source"
            X.C66582MXn.A1A(r2, r0, r1)
            X.5Gf r2 = r4.A02
            X.0xa r0 = r2.A01
            X.0xY r1 = r0.AR4()
            java.lang.String r0 = "is_contact_security_alert_enabled"
            r1.E5T(r0, r9)
            r1.apply()
            com.instagram.common.session.UserSession r2 = r2.A00
            r1 = 8
            X.GL4 r0 = new X.GL4
            r0.<init>(r9, r1)
            X.C67572Mq6.A00(r0, r2)
            X.05G r4 = r4.A03
        L_0x038c:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JwM r2 = (X.C61084JwM) r2
            java.lang.Object r0 = r2.A00
            X.Jvy r0 = (X.C61060Jvy) r0
            if (r0 == 0) goto L_0x03bf
            boolean r8 = r0.A03
            java.lang.Object r6 = r0.A01
            java.util.List r6 = (java.util.List) r6
            boolean r10 = r0.A04
            r0 = 2
            X.0qQ.A0B(r6, r0)
            r7 = 4
            X.Jvy r5 = new X.Jvy
            r5.<init>((java.util.List) r6, (int) r7, (boolean) r8, (boolean) r9, (boolean) r10)
        L_0x03ab:
            java.lang.Object r1 = r2.A02
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r2.A01
            java.util.List r0 = (java.util.List) r0
            X.JwM r0 = X.C61084JwM.A00(r5, r1, r0)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x038c
            goto L_0x0057
        L_0x03bf:
            r5 = 0
            goto L_0x03ab
        L_0x03c1:
            X.C51965G9l.A1U(r3)
            java.lang.Object r3 = r4.A01
            X.Mtx r3 = (X.C67744Mtx) r3
            java.lang.String r2 = "https://help.instagram.com/491565145294150"
            r1 = 1
            X.N8m r0 = new X.N8m
            r0.<init>(r2, r1)
            X.C67744Mtx.A00(r0, r3)
            goto L_0x0057
        L_0x03d5:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.4gN r2 = X.C71115Od8.A03(r3)
            java.lang.Object r1 = r4.A01
            X.Pwk r1 = (X.C74551Pwk) r1
            r0 = 0
            r1.DTM(r2, r0)
            goto L_0x0057
        L_0x03e9:
            java.lang.Object r0 = r4.A01
            X.7K0 r0 = (X.AnonymousClass7K0) r0
            X.0sa r0 = r0.A02
            java.lang.Object r5 = r0.invoke()
            X.7Q0 r5 = (X.AnonymousClass7Q0) r5
            if (r5 == 0) goto L_0x0057
            com.instagram.common.session.UserSession r6 = r5.A01
            X.0iw r4 = r5.A00
            X.Nps r0 = r5.A02
            java.lang.String r3 = r0.A01
            X.0qQ.A07(r3)
            java.lang.String r2 = r0.A02
            X.0qQ.A07(r2)
            r1 = 1
            java.lang.String r0 = "thread_highlighted_reply_tap"
            X.0xI r0 = X.C3265677h.A01(r4, r0, r3, r2)
            X.DbU.A1R(r0, r6)
            X.7Pz r0 = r5.A03
            X.7Hl r5 = r0.A00
            X.7Ij r0 = r5.A0b
            X.7Iv r0 = r0.A0Y
            java.lang.String r0 = r0.A00
            java.lang.String r4 = r0.trim()
            int r3 = r4.length()
            int r3 = r3 - r1
            r2 = 0
            r1 = 0
        L_0x0426:
            if (r2 > r3) goto L_0x043e
            r0 = r3
            if (r1 != 0) goto L_0x042c
            r0 = r2
        L_0x042c:
            boolean r0 = X.Dbc.A13(r4, r0)
            if (r1 != 0) goto L_0x0439
            if (r0 != 0) goto L_0x0436
            r1 = 1
            goto L_0x0426
        L_0x0436:
            int r2 = r2 + 1
            goto L_0x0426
        L_0x0439:
            if (r0 == 0) goto L_0x043e
            int r3 = r3 + -1
            goto L_0x0426
        L_0x043e:
            java.lang.String r1 = X.Dba.A0c(r4, r3, r2)
            X.McN r0 = X.C66778McO.A00(r6)
            X.Mq3 r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0057
            java.lang.String r1 = r0.A02
            if (r1 == 0) goto L_0x0057
            r5.A1A()
            X.7Ij r0 = r5.A0b
            r0.A06(r1)
            goto L_0x0057
        L_0x045a:
            java.lang.Object r0 = r4.A01
            X.7KI r0 = (X.AnonymousClass7KI) r0
            X.0sa r0 = r0.A04
            r0.invoke()
            goto L_0x0057
        L_0x0465:
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r4.A01
            X.ONU r5 = (X.ONU) r5
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            if (r3 == 0) goto L_0x0059
            org.json.JSONObject r1 = X.C66580MXl.A17(r3)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "fetch_pending_media"
            org.json.JSONArray r3 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x084e }
            if (r3 == 0) goto L_0x0059
            r2 = 0
            int r1 = r3.length()     // Catch:{ JSONException -> 0x084e }
        L_0x0482:
            if (r2 >= r1) goto L_0x0059
            org.json.JSONObject r6 = r3.optJSONObject(r2)     // Catch:{ JSONException -> 0x084e }
            if (r6 == 0) goto L_0x0522
            r8 = 0
            r7 = 9
            r0 = 3
            java.lang.String r0 = X.AnonymousClass9NF.A02(r8, r7, r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r13 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "device_type"
            int r18 = r6.optInt(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "media_id"
            java.lang.String r14 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "media_type"
            java.lang.String r15 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "duration_ms"
            long r7 = r6.optLong(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.Long r12 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "thumbnail_uri"
            java.lang.String r16 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "is_device_ready"
            boolean r19 = r6.optBoolean(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "media_uri"
            java.lang.String r17 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = "import_status"
            java.lang.String r6 = r6.optString(r0)     // Catch:{ JSONException -> 0x084e }
            kotlin.enums.EnumEntries r0 = X.C69311NjC.A00     // Catch:{ JSONException -> 0x084e }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ JSONException -> 0x084e }
        L_0x04d0:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x084e }
            if (r0 == 0) goto L_0x04f5
            java.lang.Object r11 = r7.next()     // Catch:{ JSONException -> 0x084e }
            r0 = r11
            X.NjC r0 = (X.C69311NjC) r0     // Catch:{ JSONException -> 0x084e }
            java.lang.String r0 = r0.name()     // Catch:{ JSONException -> 0x084e }
            boolean r0 = X.0qQ.A0K(r0, r6)     // Catch:{ JSONException -> 0x084e }
            if (r0 == 0) goto L_0x04d0
        L_0x04e7:
            X.NjC r11 = (X.C69311NjC) r11     // Catch:{ JSONException -> 0x084e }
            r0 = 0
            X.JuN r10 = new X.JuN     // Catch:{ JSONException -> 0x084e }
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x084e }
            java.lang.String r6 = r10.A00     // Catch:{ JSONException -> 0x084e }
            r8 = 0
            if (r6 == 0) goto L_0x051c
            goto L_0x04f7
        L_0x04f5:
            r11 = 0
            goto L_0x04e7
        L_0x04f7:
            X.OOC r9 = new X.OOC     // Catch:{ SecurityException -> 0x0514 }
            r9.<init>()     // Catch:{ SecurityException -> 0x0514 }
            android.content.Context r7 = r5.A00     // Catch:{ SecurityException -> 0x0514 }
            android.net.Uri r6 = X.DbT.A09(r6)     // Catch:{ SecurityException -> 0x0514 }
            r9.A02(r7, r6, r0, r0)     // Catch:{ SecurityException -> 0x0514 }
            X.Ni4 r0 = r9.A00()     // Catch:{ SecurityException -> 0x0514 }
            java.lang.String r6 = "file://"
            java.lang.String r0 = r0.getPath()     // Catch:{ SecurityException -> 0x0514 }
            java.lang.String r8 = X.002.A0R(r6, r0)     // Catch:{ SecurityException -> 0x0514 }
            goto L_0x051c
        L_0x0514:
            r7 = move-exception
            com.instagram.common.session.UserSession r6 = r5.A01     // Catch:{ JSONException -> 0x084e }
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ JSONException -> 0x084e }
            X.C66583MXo.A1I(r6, r0, r7)     // Catch:{ JSONException -> 0x084e }
        L_0x051c:
            r10.A00 = r8     // Catch:{ JSONException -> 0x084e }
            java.util.ArrayList r4 = X.00k.A0T(r10, r4)     // Catch:{ JSONException -> 0x084e }
        L_0x0522:
            int r2 = r2 + 1
            goto L_0x0482
        L_0x0526:
            X.OGH r3 = (X.OGH) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r4.A01
            X.7Kl r0 = (X.C329847Kl) r0
            r0.A0A = r3
            goto L_0x0057
        L_0x0534:
            X.Noz r3 = (X.C69617Noz) r3
            X.NcI r0 = X.C68987NcI.A00
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x054b
            java.lang.Object r2 = r4.A01
            X.MYR r2 = (X.MYR) r2
            X.JXP r1 = X.JXP.LOADING
        L_0x0544:
            X.0sn r0 = X.0sn.A00
        L_0x0546:
            r2.updateUi(r1, r0)
            goto L_0x0057
        L_0x054b:
            boolean r0 = r3 instanceof X.C68986NcH
            java.lang.Object r2 = r4.A01
            X.MYR r2 = (X.MYR) r2
            if (r0 == 0) goto L_0x055a
            X.JXP r1 = X.JXP.LOADED
            X.NcH r3 = (X.C68986NcH) r3
            java.util.List r0 = r3.A00
            goto L_0x0546
        L_0x055a:
            X.JXP r1 = X.JXP.ERROR
            goto L_0x0544
        L_0x055d:
            boolean r0 = X.AnonymousClass7TE.A1a(r3)
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r4.A01
            X.NKA r0 = (X.NKA) r0
            X.0eM r0 = r0.A07
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 0
            X.GPq r1 = new X.GPq
            r1.<init>(r2, r0)
            X.HOt r0 = X.C54688HOt.A0N
            X.C52369GPq.A01(r0, r1)
            goto L_0x0057
        L_0x057a:
            java.lang.String r2 = X.C41847B3o.A1E(r3)
            java.lang.Object r0 = r4.A01
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r0 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r0
            X.5vD r1 = r0.A05
            r0 = 0
            r1.A00(r2, r0, r0)
            goto L_0x0057
        L_0x058a:
            int r10 = X.AnonymousClass7TE.A0M(r3)
            java.lang.Object r0 = r4.A01
            com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel r0 = (com.instagram.feed.tifu.search.ThreadsSearchHcmViewModel) r0
            X.05G r1 = r0.A09
        L_0x0594:
            java.lang.Object r2 = r1.getValue()
            r0 = r2
            X.5vX r0 = (X.AnonymousClass5vX) r0
            java.lang.String r6 = r0.A03
            java.lang.String r7 = r0.A04
            java.lang.Integer r5 = r0.A02
            X.62P r8 = r0.A06
            X.62P r9 = r0.A05
            boolean r11 = r0.A0A
            boolean r12 = r0.A07
            boolean r13 = r0.A08
            boolean r14 = r0.A09
            java.lang.Boolean r4 = r0.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.C51974G9v.A1P(r7, r5, r8, r9)
            X.5vX r3 = new X.5vX
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = r1.AIY(r2, r3)
            if (r0 == 0) goto L_0x0594
            goto L_0x0057
        L_0x05c3:
            java.lang.Object r0 = r4.A01
            X.H77 r0 = (X.H77) r0
            X.JSq r1 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = X.DbT.A0E(r1)
            X.C2604245p.A01(r0, r1)
            goto L_0x0057
        L_0x05d2:
            java.lang.Object r0 = r4.A01
            X.H77 r0 = (X.H77) r0
            X.JSq r0 = r0.A00
            androidx.fragment.app.FragmentActivity r1 = X.DbT.A0E(r0)
            r0 = 0
            X.W38.A06(r1, r0)
            goto L_0x0057
        L_0x05e2:
            java.util.List r6 = X.JTQ.A0i(r3)
            X.Mmf r5 = X.C67363Mmf.A00
            java.lang.Object r4 = r4.A01
            X.32L r4 = (X.AnonymousClass32L) r4
            com.instagram.common.session.UserSession r3 = r4.getSession()
            X.0Tu r2 = X.0Tu.A06
            r0 = 36313544760756311(0x8102fa00000857, double:3.02817015738582E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            r1 = 4
            X.Ivk r0 = new X.Ivk
            r0.<init>(r4, r1)
            r5.A00(r6, r0, r2)
            goto L_0x0057
        L_0x0606:
            X.S62 r3 = (X.S62) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r4.A01
            X.RAl r0 = (X.C8809RAl) r0
            r0.A00 = r3
            X.C66582MXn.A16(r0)
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x0057
            com.instagram.base.activity.BaseFragmentActivity r1 = (com.instagram.base.activity.BaseFragmentActivity) r1
            if (r1 == 0) goto L_0x0057
            r1.A0d()
            goto L_0x0057
        L_0x0626:
            java.lang.String r0 = X.C41847B3o.A1E(r3)
            java.lang.Object r1 = r4.A01
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            r1.append(r0)
            r0 = 10
            r1.append(r0)
            goto L_0x0057
        L_0x0638:
            int r0 = X.AnonymousClass7TE.A0M(r3)
            java.lang.Object r2 = r4.A01
            X.4D7 r2 = (X.AnonymousClass4D7) r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.3Ih r0 = new X.3Ih
            r0.<init>(r1)
            r2.resumeWith(r0)
            goto L_0x0057
        L_0x064e:
            java.lang.Object r0 = r4.A01
            X.DlY r0 = (X.C46797DlY) r0
            X.4lm r1 = r0.A02
            java.lang.Integer r2 = X.C46797DlY.A09
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.0wc r1 = r1.A00
            java.lang.String r0 = "ig_fan_club_exclusive_feed_recommendations_list_impression"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r1 = ""
            java.lang.String r0 = "origin"
            r3.AAJ(r0, r1)
            java.lang.String r1 = X.C63261Ku6.A00(r2)
            java.lang.String r0 = "container_module"
        L_0x066f:
            r3.AAJ(r0, r1)
            r3.Cgf()
            goto L_0x0057
        L_0x0677:
            java.lang.Object r1 = r4.A01
            X.PEn r1 = (X.C72660PEn) r1
            r0 = 45
            goto L_0x068b
        L_0x067e:
            java.lang.Object r1 = r4.A01
            X.PEn r1 = (X.C72660PEn) r1
            r0 = 46
            goto L_0x068b
        L_0x0685:
            java.lang.Object r1 = r4.A01
            X.PEn r1 = (X.C72660PEn) r1
            r0 = 47
        L_0x068b:
            X.J6s r4 = new X.J6s
            r4.<init>(r1, r0)
            android.widget.TextView r0 = r1.A00
            android.text.Editable r3 = r0.getEditableText()
            if (r3 == 0) goto L_0x074d
            int r2 = r0.getSelectionStart()
            int r1 = r0.getSelectionEnd()
            X.2HY r0 = new X.2HY
            r0.<init>(r2, r1)
            r4.invoke(r3, r0)
            goto L_0x074a
        L_0x06aa:
            boolean r0 = r3 instanceof X.C72176Oxl
            if (r0 == 0) goto L_0x06b6
            X.1aU r4 = X.1aU.A00()
            X.0qQ.A0A(r4)
            return r4
        L_0x06b6:
            java.lang.Object r4 = r4.A01
            return r4
        L_0x06b9:
            X.75i r3 = (X.C3260875i) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r2 = r4.A01
            X.7H0 r2 = (X.AnonymousClass7H0) r2
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x06cf
            X.7OS r1 = r3.A01()
            X.7OS r0 = X.AnonymousClass7OS.AI
            if (r1 == r0) goto L_0x074a
        L_0x06cf:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x074d
            X.7OS r1 = r3.A01()
            X.7OS r0 = X.AnonymousClass7OS.IMAGINE
            if (r1 != r0) goto L_0x074d
            goto L_0x074a
        L_0x06dc:
            X.Nkv r3 = (X.C69415Nkv) r3
            java.lang.Object r0 = r4.A01
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            boolean r7 = r3.A00(r0)
            goto L_0x07fd
        L_0x06e8:
            X.48S r3 = (X.AnonymousClass48S) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r4.A01
            X.2En r0 = (X.2En) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            java.lang.Class<X.O7T> r1 = X.O7T.class
            X.PjL r0 = X.C73760PjL.A00
            java.lang.Object r2 = r2.A01(r1, r0)
            X.O7T r2 = (X.O7T) r2
            X.3U9 r0 = r3.A0I
            com.instagram.model.direct.DirectThreadKey r0 = r0.BJz()
            java.lang.String r1 = r0.A00
            java.util.Set r0 = r2.A00
            boolean r0 = X.00k.A0u(r0, r1)
            if (r0 != 0) goto L_0x074d
            X.0sP r0 = X.C370798x5.A00
            boolean r0 = X.C51971G9r.A1a(r3, r0)
            goto L_0x0748
        L_0x0715:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r1 = r4.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r4 = r1.invoke(r0)
            return r4
        L_0x0728:
            X.3t3 r3 = (X.C254793t3) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r1 = r4.A01
            boolean r0 = r3.equals(r1)
            if (r0 != 0) goto L_0x074a
            X.3t0 r0 = X.C300965yF.A02(r3)
            boolean r0 = X.0qQ.A0K(r0, r1)
            if (r0 != 0) goto L_0x074a
            com.instagram.model.direct.threadkey.impl.MsysThreadId r0 = X.C300965yF.A04(r3)
            boolean r0 = X.0qQ.A0K(r0, r1)
        L_0x0748:
            if (r0 == 0) goto L_0x074d
        L_0x074a:
            r7 = 1
            goto L_0x07fd
        L_0x074d:
            r7 = 0
            goto L_0x07fd
        L_0x0750:
            java.lang.Object r0 = r4.A01
            X.9VE r0 = (X.AnonymousClass9VE) r0
            X.Mpk r4 = new X.Mpk
            r4.<init>(r0)
            return r4
        L_0x075a:
            java.lang.Object r0 = r4.A01
            X.Mh1 r0 = (X.C67028Mh1) r0
            X.MYg r0 = r0.A02
            X.MYb r0 = r0.A01
            X.1aU r1 = r0.A09
            X.Mou r0 = new X.Mou
            r0.<init>()
            X.1aU r1 = r1.A0M(r0)
            X.MoG r0 = X.C67461MoG.A00
            X.1aU r4 = r1.A0L(r0)
            return r4
        L_0x0774:
            java.lang.String r0 = "load proactive warning metadata"
            X.4fh r2 = X.AnonymousClass6F9.A00(r0)
            java.lang.Object r1 = r4.A01
            r0 = 21
            X.1aU r4 = X.C72169Oxe.A00(r2, r1, r3, r0)
            return r4
        L_0x0783:
            java.lang.Object r0 = r4.A01
            X.MhR r0 = (X.C67054MhR) r0
            X.0eM r0 = r0.A05
            X.MYb r0 = X.C66581MXm.A0b(r0)
            X.1aU r2 = r0.A09
            r1 = 16
            X.Owd r0 = new X.Owd
            r0.<init>(r1)
            X.1aU r1 = r2.A0M(r0)
            X.Mhb r0 = X.C67060Mhb.A00
            goto L_0x07b4
        L_0x079d:
            java.lang.Object r0 = r4.A01
            X.MhR r0 = (X.C67054MhR) r0
            X.0eM r0 = r0.A05
            X.MYb r0 = X.C66581MXm.A0b(r0)
            X.1aU r1 = r0.A09
            X.Mou r0 = new X.Mou
            r0.<init>()
            X.1aU r1 = r1.A0M(r0)
            X.Mhe r0 = X.C67063Mhe.A00
        L_0x07b4:
            X.1aU r4 = r1.A0L(r0)
            return r4
        L_0x07b9:
            X.Nkv r3 = (X.C69415Nkv) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r4.A01
            X.NOO r0 = (X.NOO) r0
            android.content.Context r1 = r0.A00
            java.lang.Integer r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0A(r0)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            return r4
        L_0x07d0:
            X.1yX r3 = (X.1yX) r3
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r5 = r4.A01
            X.1QU r5 = (X.1QU) r5
            X.0qQ.A0B(r5, r6)
            r4 = 3
            X.1CE r0 = r5.A09
            int r2 = r0.ordinal()
            r7 = 0
            r0 = 1
            r1 = 0
            if (r2 == r4) goto L_0x0804
            if (r2 != r0) goto L_0x07fd
            X.3xX r0 = r5.A0A
            if (r0 == 0) goto L_0x0802
            java.lang.String r2 = r0.A07
        L_0x07f1:
            X.3Vo r0 = r3.A01
            X.3WR r0 = r0.A01
            if (r0 == 0) goto L_0x07f9
            java.lang.String r1 = r0.A0G
        L_0x07f9:
            boolean r7 = X.00p.A0j(r2, r1, r6)
        L_0x07fd:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            return r4
        L_0x0802:
            r2 = r1
            goto L_0x07f1
        L_0x0804:
            X.2iN r0 = r5.A08
            if (r0 == 0) goto L_0x0817
            java.lang.String r2 = r0.A00()
        L_0x080c:
            X.3Vo r0 = r3.A01
            X.2iF r0 = r0.A00
            if (r0 == 0) goto L_0x07f9
            java.lang.String r1 = r0.AjI()
            goto L_0x07f9
        L_0x0817:
            r2 = r1
            goto L_0x080c
        L_0x0819:
            int r1 = X.AnonymousClass7TE.A0M(r3)
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r1)
            X.QP5 r0 = (X.QP5) r0
            java.lang.String r4 = r0.A02
            return r4
        L_0x082a:
            com.instagram.api.schemas.FanClubNextStepsRecommendationsType r3 = (com.instagram.api.schemas.FanClubNextStepsRecommendationsType) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.lang.Object r0 = r4.A01
            X.JhV r0 = (X.C60212JhV) r0
            X.05G r1 = r0.A04
            X.Jz4 r0 = new X.Jz4
            r0.<init>(r3)
            r1.Epw(r0)
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0841:
            r0 = move-exception
            r5.endTransaction()
            throw r0
        L_0x0846:
            r0 = move-exception
            r3.close()
            r4.A00()
            throw r0
        L_0x084e:
            r2 = move-exception
            com.instagram.common.session.UserSession r1 = r5.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C66583MXo.A1I(r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73933PmD.invoke(java.lang.Object):java.lang.Object");
    }
}
