package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.FXq  reason: case insensitive filesystem */
public final class C50311FXq implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ 1P0 A02;
    public final /* synthetic */ G7Y A03;
    public final /* synthetic */ FGL A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public C50311FXq(Activity activity, FragmentActivity fragmentActivity, 1P0 r4, G7Y g7y, FGL fgl, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A04 = fgl;
        this.A07 = str;
        this.A09 = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A05 = str2;
        this.A02 = r4;
        this.A01 = fragmentActivity;
        this.A0C = z4;
        this.A0E = z5;
        this.A03 = g7y;
        this.A0F = z6;
        this.A08 = z7;
        this.A00 = activity;
        this.A0D = z8;
        this.A06 = str3;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [X.1qK, java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0087: MOVE  (r8v8 X.E2z) = (r8v6 X.E2z)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x039b  */
    public final void DWm(java.util.Map r35) {
        /*
            r34 = this;
            r2 = 0
            r1 = r35
            X.0qQ.A0B(r1, r2)
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            java.lang.Object r0 = r1.get(r0)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r8 = r0.ordinal()
            java.lang.String r15 = "Required value was null."
            r1 = 1
            r3 = r34
            if (r8 == r2) goto L_0x0262
            r0 = 2
            if (r8 == r0) goto L_0x0056
            X.FGL r0 = r3.A04
            X.FGL.A02(r0, r2)
            X.6cm r7 = r0.A03
            java.lang.String r6 = r3.A07
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            boolean r4 = r3.A0B
            r7.A04(r5, r6, r4)
            boolean r4 = r0.A06
            if (r8 == r1) goto L_0x003e
            if (r4 == 0) goto L_0x038a
            X.G8t r1 = r0.A04
            if (r1 != 0) goto L_0x0253
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x003e:
            if (r4 == 0) goto L_0x038a
            boolean r3 = r3.A0A
            if (r3 == 0) goto L_0x004d
            com.instagram.common.session.UserSession r3 = r0.A02
            X.1Av r3 = X.1Au.A00(r3)
            r3.A1N(r1)
        L_0x004d:
            X.G8t r1 = r0.A04
            if (r1 != 0) goto L_0x0253
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0056:
            X.FGL r0 = r3.A04
            X.FGL.A02(r0, r2)
            com.instagram.common.session.UserSession r6 = r0.A02
            X.0Tu r7 = X.0Tu.A05
            r4 = 36324191984693117(0x810ca900002f7d, double:3.0349035046763856E-306)
            boolean r4 = X.182.A06(r7, r6, r4)
            r27 = 0
            if (r4 != 0) goto L_0x024a
            r4 = 36324191984758654(0x810ca900012f7e, double:3.0349035047178315E-306)
            boolean r4 = X.182.A06(r7, r6, r4)
            if (r4 != 0) goto L_0x024a
            r9 = r27
        L_0x0079:
            boolean r7 = r3.A0F
            if (r7 != 0) goto L_0x0207
            boolean r4 = r3.A08
            if (r4 != 0) goto L_0x0207
            androidx.fragment.app.Fragment r8 = r0.A00
            boolean r4 = r8 instanceof X.C47453E2z
            if (r4 == 0) goto L_0x0093
            X.E2z r8 = (X.C47453E2z) r8
            android.widget.TextView r4 = r8.A01
            if (r4 == 0) goto L_0x01c4
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L_0x01c4
        L_0x0093:
            java.lang.String r8 = r3.A05
            boolean r14 = r3.A0B
            boolean r13 = r3.A0C
            java.lang.String r12 = r3.A06
            X.G7Y r10 = r3.A03
            boolean r11 = r3.A0D
            boolean r5 = r3.A0E
            java.lang.String r4 = r3.A07
            X.Fg4 r16 = new X.Fg4
            r24 = r13
            r25 = r11
            r26 = r5
            r21 = r12
            r22 = r4
            r23 = r14
            r20 = r8
            r19 = r9
            r18 = r0
            r17 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = 36323040933456647(0x810b9d00002b07, double:3.034175575239531E-306)
            X.1AA r12 = X.182.A02(r6, r4)
            if (r12 == 0) goto L_0x01a0
            X.0Tu r10 = X.0Tu.A04
            boolean r4 = r12.Ah0(r10, r4)
            if (r4 != r1) goto L_0x01a0
            r4 = 36885990886933168(0x830b9d000102b0, double:3.390187392635597E-306)
            X.1AA r11 = X.182.A02(r6, r4)
            if (r11 == 0) goto L_0x00e7
            java.lang.String r5 = r11.C1v(r10, r4)
            if (r5 == 0) goto L_0x00e7
            int r4 = r5.hashCode()
            switch(r4) {
                case -873453351: goto L_0x018f;
                case -873453350: goto L_0x0183;
                case -873453349: goto L_0x0177;
                case -873453348: goto L_0x016b;
                case -873453347: goto L_0x015f;
                case -873453346: goto L_0x0153;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            android.app.Activity r4 = r3.A00
            r5 = 2131956595(0x7f131373, float:1.954975E38)
            java.lang.Integer r28 = java.lang.Integer.valueOf(r5)
            r5 = 2131974919(0x7f135b07, float:1.9586916E38)
            java.lang.Integer r29 = java.lang.Integer.valueOf(r5)
            android.content.Context r10 = r4.getBaseContext()
            r5 = 2131237571(0x7f081ac3, float:1.8091396E38)
            android.graphics.drawable.Drawable r25 = r10.getDrawable(r5)
            r31 = 2131956594(0x7f131372, float:1.9549748E38)
            r24 = r4
            r26 = r16
            r30 = r9
            r32 = r1
            r33 = r2
            X.W38.A04(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0112:
            X.6cm r4 = r0.A03
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r14)
            X.0qQ.A0B(r8, r2)
            X.0wc r5 = r4.A02
            java.lang.String r4 = "ci_settings_modal_impression"
            X.0Aj r5 = X.AnonymousClass7TE.A0e(r5, r4)
            X.DbS.A1N(r5, r8)
            java.lang.String r4 = "is_partial_ci"
            r5.A7p(r4, r9)
            r5.Cgf()
        L_0x012e:
            X.6cm r9 = r0.A03
            java.lang.String r8 = r3.A07
            java.lang.Integer r5 = X.AnonymousClass05K.A0j
            boolean r4 = r3.A0B
            r9.A04(r5, r8, r4)
            boolean r4 = r0.A06
            if (r4 == 0) goto L_0x0258
            if (r7 == 0) goto L_0x03a2
            boolean r3 = r3.A0A
            if (r3 == 0) goto L_0x014a
            X.1Av r3 = X.1Au.A00(r6)
            r3.A1N(r1)
        L_0x014a:
            X.G8t r1 = r0.A04
            if (r1 != 0) goto L_0x0253
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        L_0x0153:
            java.lang.String r4 = "title6"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956599(0x7f131377, float:1.9549758E38)
            goto L_0x019a
        L_0x015f:
            java.lang.String r4 = "title5"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956596(0x7f131374, float:1.9549752E38)
            goto L_0x019a
        L_0x016b:
            java.lang.String r4 = "title4"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956597(0x7f131375, float:1.9549754E38)
            goto L_0x019a
        L_0x0177:
            java.lang.String r4 = "title3"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956600(0x7f131378, float:1.954976E38)
            goto L_0x019a
        L_0x0183:
            java.lang.String r4 = "title2"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956601(0x7f131379, float:1.9549762E38)
            goto L_0x019a
        L_0x018f:
            java.lang.String r4 = "title1"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00e7
            r4 = 2131956598(0x7f131376, float:1.9549756E38)
        L_0x019a:
            java.lang.Integer r27 = java.lang.Integer.valueOf(r4)
            goto L_0x00e7
        L_0x01a0:
            android.app.Activity r5 = r3.A00
            boolean r4 = r0.A06
            if (r4 != 0) goto L_0x01aa
            r25 = 0
            if (r11 == 0) goto L_0x01ac
        L_0x01aa:
            r25 = 1
        L_0x01ac:
            r24 = 2131956594(0x7f131372, float:1.9549748E38)
            r17 = r5
            r18 = r27
            r19 = r16
            r20 = r27
            r21 = r27
            r22 = r27
            r23 = r9
            r26 = r11
            X.W38.A04(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0112
        L_0x01c4:
            android.widget.TextView r4 = r8.A01
            if (r4 == 0) goto L_0x01cb
            r4.setVisibility(r2)
        L_0x01cb:
            boolean r4 = r8.A09
            if (r4 == 0) goto L_0x01de
            java.lang.String r5 = r8.A06
            java.lang.String r4 = "A"
            boolean r4 = X.0qQ.A0K(r5, r4)
            if (r4 != 0) goto L_0x01de
            android.widget.TextView r4 = r8.A00
            X.AnonymousClass7TH.A0R(r4)
        L_0x01de:
            android.widget.TextView r5 = r8.A01
            if (r5 == 0) goto L_0x01e7
            r4 = 40
            X.FP0.A00(r5, r4, r8)
        L_0x01e7:
            com.instagram.ui.widget.progressbutton.ProgressButton r4 = r8.A05
            if (r4 == 0) goto L_0x0205
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
        L_0x01ef:
            r4 = 3
            java.lang.String r4 = X.C273654mx.A00(r4)
            X.0qQ.A0C(r5, r4)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.Context r4 = r8.requireContext()
            int r4 = X.AnonymousClass7TH.A01(r4)
            r5.bottomMargin = r4
            goto L_0x0093
        L_0x0205:
            r5 = 0
            goto L_0x01ef
        L_0x0207:
            boolean r4 = r3.A08
            if (r4 == 0) goto L_0x012e
            if (r7 != 0) goto L_0x012e
            if (r9 == 0) goto L_0x0243
            X.0iw r4 = r0.A01
            androidx.fragment.app.Fragment r10 = r0.A00
            X.G8t r8 = r0.A04
            X.Ewd r5 = r0.A05
            X.Et4.A02 = r4
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r10)
            X.Et4.A07 = r4
            X.Et4.A04 = r8
            X.Et4.A05 = r5
            boolean r11 = r3.A0C
            java.lang.String r10 = r3.A05
            java.lang.String r8 = r3.A06
            X.G7Y r5 = r3.A03
            boolean r4 = r3.A0D
            X.0qQ.A0B(r10, r1)
            X.Et4.A08 = r11
            X.Et4.A00 = r10
            X.Et4.A06 = r8
            X.Et4.A03 = r5
            X.Et4.A09 = r4
            boolean r5 = r3.A0E
            java.lang.String r4 = r3.A07
            X.Et4.A0A = r5
            X.Et4.A01 = r4
        L_0x0243:
            android.app.Activity r4 = r3.A00
            X.W38.A06(r4, r9)
            goto L_0x012e
        L_0x024a:
            r4 = 11228576(0xab55a0, float:1.5734586E-38)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            goto L_0x0079
        L_0x0253:
            r1.Cm0(r2)
            goto L_0x03a2
        L_0x0258:
            if (r7 == 0) goto L_0x03a2
            X.Ewd r2 = r0.A05
            if (r2 == 0) goto L_0x03a2
            androidx.fragment.app.Fragment r2 = r0.A00
            goto L_0x0392
        L_0x0262:
            X.FGL r0 = r3.A04
            X.6cm r5 = r0.A03
            java.lang.String r10 = r3.A07
            boolean r4 = r3.A09
            if (r4 == 0) goto L_0x02a7
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
        L_0x026e:
            boolean r7 = r3.A0B
            r5.A04(r4, r10, r7)
            boolean r4 = r3.A0A
            if (r4 == 0) goto L_0x028e
            com.instagram.common.session.UserSession r4 = r0.A02
            X.1Av r4 = X.1Au.A00(r4)
            r4.A1N(r2)
            X.G8t r4 = r0.A04
            if (r4 == 0) goto L_0x03a8
            r4.Cm0(r1)
        L_0x0287:
            if (r7 == 0) goto L_0x02aa
            X.FGL.A03(r0, r2)
            goto L_0x03a2
        L_0x028e:
            X.Ewd r4 = r0.A05
            if (r4 == 0) goto L_0x0287
            androidx.fragment.app.Fragment r6 = r0.A00
            com.instagram.common.session.UserSession r5 = r0.A02
            X.0qQ.A0B(r5, r1)
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()
            if (r4 == 0) goto L_0x0287
            X.6Yo r4 = X.DbW.A0H(r6, r5)
            r4.A06()
            goto L_0x0287
        L_0x02a7:
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            goto L_0x026e
        L_0x02aa:
            androidx.fragment.app.Fragment r7 = r0.A00
            android.content.Context r6 = r7.getContext()
            if (r6 == 0) goto L_0x037f
            com.instagram.common.session.UserSession r9 = r0.A02
            r4 = 0
            X.1AA r11 = X.182.A02(r9, r4)
            r4 = 36327524879514100(0x810fb1000339f4, double:3.0370112407816655E-306)
            if (r11 == 0) goto L_0x02ca
            X.0Tu r8 = X.0Tu.A04
            boolean r5 = r11.Ah0(r8, r4)
            r4 = 1
            if (r5 != 0) goto L_0x02cb
        L_0x02ca:
            r4 = 0
        L_0x02cb:
            java.lang.String r8 = r3.A05
            X.1P0 r5 = r3.A02
            java.util.LinkedHashMap r11 = X.FFE.A02(r6, r9, r1, r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            java.lang.String r14 = X.FFE.A01(r4, r11)
            X.0qQ.A07(r14)
            boolean r4 = r11.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x02f2
            int r4 = r14.length()
            if (r4 != 0) goto L_0x02f2
            r4 = 1001141803(0x3bac362b, float:0.0052554808)
            X.FFE.A03(r4)
        L_0x02f2:
            r4 = 1001139330(0x3bac2c82, float:0.005254329)
            X.FFE.A03(r4)
            X.EX9 r11 = X.EX9.SERP_USERS_CI_UPSELL
            boolean r17 = X.Dba.A1X(r11, r8)
            java.lang.String r15 = "find_friends_contacts"
            r16 = r10
            r18 = r1
            r13 = r9
            r12 = r6
            X.1OC r12 = X.FGQ.A00(r12, r13, r14, r15, r16, r17, r18)
            r12.A00 = r5
            r10 = 116323878(0x6eef626, float:8.988733E-35)
            boolean r5 = r0.A06
            r4 = 2
            if (r5 == 0) goto L_0x0315
            r4 = 1
        L_0x0315:
            X.1ES.A05(r12, r10, r4, r1, r2)
            boolean r2 = X.Dba.A1X(r11, r8)
            if (r2 == 0) goto L_0x033c
            androidx.fragment.app.FragmentActivity r4 = r3.A01
            X.1pQ r2 = X.C66571pQ.A02
            boolean r2 = X.AnonymousClass7TF.A1V(r2)
            if (r2 == 0) goto L_0x033c
            X.6Yo r5 = X.DbS.A0M(r4, r9)
            X.1pQ r2 = X.FC6.A00()
            X.Ebd r2 = r2.A00()
            r4 = 0
            X.E3O r2 = r2.A01(r8, r4)
            X.Dba.A0w(r4, r2, r5)
        L_0x033c:
            X.EX9 r2 = X.EX9.QP
            boolean r2 = X.Dba.A1X(r2, r8)
            if (r2 == 0) goto L_0x0371
            X.6ap r5 = X.DbS.A0a()
            android.content.Context r4 = r7.requireContext()
            r2 = 2131964174(0x7f13310e, float:1.9565122E38)
            X.DbS.A19(r4, r5, r2)
            r5.A06()
            X.DbY.A1N(r5)
        L_0x0358:
            X.FGL.A02(r0, r1)
            com.instagram.common.session.UserSession r1 = r0.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r1)
            X.36d r1 = new X.36d
            r1.<init>()
            r2.A00(r1)
            X.G7Y r1 = r3.A03
            if (r1 == 0) goto L_0x03a2
            r1.D60()
            goto L_0x03a2
        L_0x0371:
            boolean r4 = r3.A0C
            r2 = 2131964172(0x7f13310c, float:1.9565118E38)
            if (r4 == 0) goto L_0x037b
            r2 = 2131964173(0x7f13310d, float:1.956512E38)
        L_0x037b:
            X.C59689JTv.A07(r6, r2)
            goto L_0x0358
        L_0x037f:
            boolean r2 = r3.A0E
            if (r2 == 0) goto L_0x0358
            X.FGL.A02(r0, r1)
            X.FGL.A03(r0, r1)
            goto L_0x0358
        L_0x038a:
            X.Ewd r2 = r0.A05
            if (r2 == 0) goto L_0x03a2
            androidx.fragment.app.Fragment r2 = r0.A00
            com.instagram.common.session.UserSession r6 = r0.A02
        L_0x0392:
            X.0qQ.A0B(r6, r1)
            androidx.fragment.app.FragmentActivity r1 = r2.getActivity()
            if (r1 == 0) goto L_0x03a2
            X.6Yo r1 = X.DbW.A0H(r2, r6)
            r1.A06()
        L_0x03a2:
            com.instagram.common.session.UserSession r0 = r0.A02
            X.C50277FWi.A00(r0)
            return
        L_0x03a8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50311FXq.DWm(java.util.Map):void");
    }
}
