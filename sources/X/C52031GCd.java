package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.user.model.User;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: X.GCd  reason: case insensitive filesystem */
public final class C52031GCd {
    public JR4 A00;
    public C270594gz A01;
    public 1Xl A02;
    public AnonymousClass3W1 A03;
    public C309426Yf A04;
    public String A05;
    public final Activity A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final C228232l0 A09;
    public final JRB A0A;
    public final C52212GJd A0B;
    public final String A0C;
    public final C52032GCe A0D;

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0053: MOVE  (r1v57 X.3OA) = (r1v1 X.3OA)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A0K(X.C270594gz r24, X.1Xl r25, X.AnonymousClass3W1 r26, X.C309426Yf r27, X.C55894HpF r28, java.lang.String r29, java.lang.String r30) {
        /*
            r23 = this;
            r9 = 0
            r4 = r25
            X.0qQ.A0B(r4, r9)
            r5 = 1
            r1 = 2
            r2 = r23
            r2.A02 = r4
            r8 = r26
            r2.A03 = r8
            r0 = r30
            r2.A05 = r0
            r0 = r24
            r2.A01 = r0
            r3 = r27
            r2.A04 = r3
            X.GJd r7 = r2.A0B
            int r0 = r7.ordinal()
            r10 = 0
            if (r0 == r9) goto L_0x013e
            if (r0 == r5) goto L_0x013e
            if (r0 == r1) goto L_0x013e
        L_0x0029:
            r2.A00 = r10
            if (r10 == 0) goto L_0x0031
            r0 = r29
            r10.A01 = r0
        L_0x0031:
            if (r27 == 0) goto L_0x0041
            X.GJd r0 = X.C52212GJd.A0B
            if (r7 != r0) goto L_0x0041
            if (r10 == 0) goto L_0x0041
            int r0 = r3.A0I
            java.lang.Long r0 = X.DbS.A0j(r0)
            r10.A00 = r0
        L_0x0041:
            X.1Xl r1 = r2.A02
            if (r1 != 0) goto L_0x004f
            java.lang.String r6 = "model"
        L_0x0047:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004f:
            boolean r0 = r1 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x005c
            X.3OA r1 = (X.AnonymousClass3OA) r1
            if (r1 == 0) goto L_0x005c
            boolean r0 = r1.A0x
            r10 = 1
            if (r0 == r5) goto L_0x005d
        L_0x005c:
            r10 = 0
        L_0x005d:
            boolean r0 = r2.A0H()
            r4 = r28
            if (r0 == 0) goto L_0x0074
            com.instagram.common.session.UserSession r6 = r2.A07
            X.0Tu r3 = X.0Tu.A05
            r0 = 36315829687094876(0x81050e00390e5c, double:3.0296151540029883E-306)
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0155
        L_0x0074:
            if (r10 != 0) goto L_0x0155
            X.GJd r12 = X.C52212GJd.A07
            if (r7 == r12) goto L_0x0082
            X.GJd r0 = X.C52212GJd.A0B
            if (r7 == r0) goto L_0x0082
            X.GJd r0 = X.C52212GJd.A05
            if (r7 != r0) goto L_0x0155
        L_0x0082:
            com.instagram.common.session.UserSession r3 = r2.A07
            X.Hto r15 = new X.Hto
            r15.<init>(r3)
            X.IUV r0 = new X.IUV
            r0.<init>(r2)
            r15.A01 = r0
            boolean r0 = r2.A0H()
            if (r0 == 0) goto L_0x00b7
            X.0Tu r6 = X.0Tu.A05
            r0 = 36315829687094876(0x81050e00390e5c, double:3.0296151540029883E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r6 = r4.A01
            if (r6 == 0) goto L_0x00b7
            java.lang.String r0 = r4.A02
            android.text.SpannableStringBuilder r1 = X.DbS.A0C(r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r5)
            X.AnonymousClass7AV.A03(r1, r0, r6)
            r15.A00 = r1
        L_0x00b7:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            X.1Xl r0 = r2.A02
            java.lang.String r6 = "model"
            if (r0 == 0) goto L_0x0047
            X.1Xj r0 = r0.BPf()
            boolean r0 = r0.A4M()
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x00e6
            X.2f5 r1 = X.C225892f5.A00(r3)
            X.1Xl r0 = r2.A02
            if (r0 == 0) goto L_0x0047
            X.1Xj r0 = r0.BPf()
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x013b
            X.HNR r0 = X.HNR.A2R
        L_0x00e3:
            r5.add(r0)
        L_0x00e6:
            java.util.Iterator r14 = r5.iterator()
        L_0x00ea:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0256
            java.lang.Object r11 = r14.next()
            X.HNR r11 = (X.HNR) r11
            android.app.Activity r6 = r2.A06
            X.4DU r0 = r2.A08
            java.lang.String r18 = r0.getModuleName()
            android.content.res.Resources r13 = r6.getResources()
            r10 = 0
            int r1 = X.DbU.A02(r11, r9)
            r0 = 99
            if (r1 == r0) goto L_0x0137
            r0 = 100
            if (r1 == r0) goto L_0x0133
            X.0wj r5 = X.0wj.A01
            r1 = 817903201(0x30c03661, float:1.3985294E-9)
            java.lang.String r0 = "Unsupported text row for Clips Viewer Ads Overflow menu."
            X.DbT.A1Q(r5, r0, r1)
        L_0x0119:
            java.lang.String r19 = X.AnonymousClass7TF.A0d(r13, r10)
            int r5 = r11.A00
            r20 = 1065353216(0x3f800000, float:1.0)
            r1 = 4
            X.H7f r0 = new X.H7f
            r0.<init>(r2, r1)
            r21 = r5
            r22 = r9
            r16 = r6
            r17 = r0
            r15.A04(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00ea
        L_0x0133:
            r10 = 2131972593(0x7f1351f1, float:1.9582198E38)
            goto L_0x0119
        L_0x0137:
            r10 = 2131972502(0x7f135196, float:1.9582013E38)
            goto L_0x0119
        L_0x013b:
            X.HNR r0 = X.HNR.A1e
            goto L_0x00e3
        L_0x013e:
            com.instagram.common.session.UserSession r12 = r2.A07
            java.lang.String r15 = r2.A0C
            if (r15 != 0) goto L_0x0146
            java.lang.String r15 = ""
        L_0x0146:
            X.4DU r11 = r2.A08
            X.1Xj r13 = r4.BPf()
            X.2l0 r14 = r2.A09
            X.GyG r10 = new X.GyG
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0029
        L_0x0155:
            android.app.Activity r5 = r2.A06
            com.instagram.common.session.UserSession r9 = r2.A07
            X.Dg1 r3 = new X.Dg1
            r3.<init>(r5, r9)
            r1 = 6
            X.IVE r0 = new X.IVE
            r0.<init>(r2, r1)
            r3.A03 = r0
            java.lang.String r1 = r4.A02
            if (r1 == 0) goto L_0x0173
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x0173
            r3.A09(r1)
        L_0x0173:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0184
            r1 = 2131972171(0x7f13504b, float:1.9581342E38)
            r0 = 8
            X.ID1.A02(r3, r2, r0, r1)
        L_0x017f:
            X.C51969G9p.A11(r5, r3)
            goto L_0x027c
        L_0x0184:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0251
            java.lang.Integer r1 = r2.A01()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6 = 2131972995(0x7f135383, float:1.9583013E38)
            if (r1 != r0) goto L_0x019c
            r6 = 2131968512(0x7f134200, float:1.957392E38)
        L_0x019c:
            r1 = 52
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r3.A02(r0, r6)
        L_0x01a6:
            boolean r6 = r4.A06
            if (r6 == 0) goto L_0x01c7
            r1 = 2131964880(0x7f1333d0, float:1.9566554E38)
            r0 = 13
            X.ID1.A02(r3, r2, r0, r1)
            r1 = 2131973918(0x7f13571e, float:1.9584885E38)
            r0 = 14
            X.ID1.A02(r3, r2, r0, r1)
            r7 = 2131972174(0x7f13504e, float:1.9581348E38)
            r1 = 53
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r3.A04(r0, r7)
        L_0x01c7:
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x01d8
            r7 = 2131972172(0x7f13504c, float:1.9581344E38)
            r1 = 54
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r3.A02(r0, r7)
        L_0x01d8:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x01e8
            r1 = 2131972023(0x7f134fb7, float:1.9581042E38)
            r0 = 15
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r3.A02(r0, r1)
        L_0x01e8:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x0201
            X.0Tu r7 = X.0Tu.A05
            r0 = 36313093789189864(0x810291000006e8, double:3.027884961151282E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x0201
            r1 = 2131976735(0x7f13621f, float:1.9590599E38)
            r0 = 16
            X.ID1.A02(r3, r2, r0, r1)
        L_0x0201:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x020d
            r1 = 2131951988(0x7f130174, float:1.9540406E38)
            r0 = 17
            X.ID1.A02(r3, r2, r0, r1)
        L_0x020d:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0219
            r1 = 2131972103(0x7f135007, float:1.9581204E38)
            r0 = 18
            X.ID1.A02(r3, r2, r0, r1)
        L_0x0219:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0225
            r1 = 2131957536(0x7f131720, float:1.9551659E38)
            r0 = 9
            X.ID1.A02(r3, r2, r0, r1)
        L_0x0225:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0231
            r1 = 2131974135(0x7f1357f7, float:1.9585325E38)
            r0 = 10
            X.ID1.A02(r3, r2, r0, r1)
        L_0x0231:
            if (r6 != 0) goto L_0x023b
            r1 = 2131951987(0x7f130173, float:1.9540404E38)
            r0 = 11
            X.ID1.A02(r3, r2, r0, r1)
        L_0x023b:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x017f
            r0 = 2131963582(0x7f132ebe, float:1.9563921E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 12
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r3.A0C(r1, r0)
            goto L_0x017f
        L_0x0251:
            r6 = 2131963366(0x7f132de6, float:1.9563483E38)
            goto L_0x019c
        L_0x0256:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x028b
            android.app.Activity r4 = r2.A06
            r0 = 2131972171(0x7f13504b, float:1.9581342E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r0)
            X.HNR r0 = X.HNR.A1Z
            int r1 = r2.A00(r0)
            r0 = 20
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r4, r0, r3, r1)
        L_0x0272:
            X.Vho r1 = new X.Vho
            r1.<init>(r15)
            android.app.Activity r0 = r2.A06
            r1.A00(r0)
        L_0x027c:
            X.JRB r0 = r2.A0A
            r0.Cue()
            r0 = 258(0x102, float:3.62E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            A07(r8, r2, r0)
            return
        L_0x028b:
            boolean r6 = r4.A06
            if (r6 == 0) goto L_0x02e6
            android.app.Activity r10 = r2.A06
            r0 = 2131964880(0x7f1333d0, float:1.9566554E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A03
            int r1 = r2.A00(r0)
            r0 = 31
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
            r0 = 2131973917(0x7f13571d, float:1.9584883E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A0p
            int r1 = r2.A00(r0)
            r0 = 33
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
            r0 = 2131972174(0x7f13504e, float:1.9581348E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A1a
            int r5 = r2.A00(r0)
            r1 = 58
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r15.A01(r10, r0, r11, r5)
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A0L
            int r1 = r2.A00(r0)
            X.ICu r0 = X.C56797ICu.A00
            r15.A01(r10, r0, r5, r1)
        L_0x02e6:
            boolean r11 = r4.A03
            if (r11 == 0) goto L_0x035c
            if (r6 != 0) goto L_0x035c
            X.0Tu r5 = X.0Tu.A05
            r0 = 36319390211644613(0x81084b00061cc5, double:3.0318668440653236E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            java.lang.Integer r1 = X.C51967G9n.A0l(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x035c
            android.app.Activity r10 = r2.A06
            java.lang.Integer r1 = r2.A01()
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            r0 = 2131973003(0x7f13538b, float:1.958303E38)
            if (r1 != r13) goto L_0x030f
            r0 = 2131964435(0x7f133213, float:1.9565652E38)
        L_0x030f:
            java.lang.String r14 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A1k
            int r1 = r2.A00(r0)
            r0 = 34
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r14, r1)
            r0 = 36319390212103372(0x81084b000d1ccc, double:3.0318668443554446E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0350
            java.lang.Integer r1 = r2.A01()
            r0 = 2131972995(0x7f135383, float:1.9583013E38)
            if (r1 != r13) goto L_0x0339
            r0 = 2131968512(0x7f134200, float:1.957392E38)
        L_0x0339:
            java.lang.String r13 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A1i
            int r5 = r2.A00(r0)
            r1 = 59
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r15.A01(r10, r0, r13, r5)
            r15.A06(r9)
        L_0x0350:
            X.JR4 r1 = r2.A00
            if (r1 == 0) goto L_0x062b
            X.GJT r0 = new X.GJT
            r0.<init>(r1, r3)
            r1.Cis()
        L_0x035c:
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x0378
            android.app.Activity r10 = r2.A06
            r0 = 2131951988(0x7f130174, float:1.9540406E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A06
            int r1 = r2.A00(r0)
            r0 = 35
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
        L_0x0378:
            if (r6 != 0) goto L_0x0392
            android.app.Activity r10 = r2.A06
            r0 = 2131951987(0x7f130173, float:1.9540404E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A03
            int r1 = r2.A00(r0)
            r0 = 36
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
        L_0x0392:
            boolean r0 = r4.A0A
            if (r0 == 0) goto L_0x03af
            android.app.Activity r13 = r2.A06
            r0 = 2131965851(0x7f13379b, float:1.9568524E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r13, r0)
            X.HNR r0 = X.HNR.A1v
            int r5 = r2.A00(r0)
            r1 = 23
            X.FP4 r0 = new X.FP4
            r0.<init>(r2, r1)
            r15.A01(r13, r0, r10, r5)
        L_0x03af:
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x03cb
            android.app.Activity r10 = r2.A06
            r0 = 2131963582(0x7f132ebe, float:1.9563921E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A0w
            int r1 = r2.A00(r0)
            r0 = 21
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
        L_0x03cb:
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x03f4
            X.0Tu r5 = X.0Tu.A05
            r0 = 36313093789189864(0x810291000006e8, double:3.027884961151282E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x03f4
            android.app.Activity r10 = r2.A06
            r0 = 2131976735(0x7f13621f, float:1.9590599E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r10, r0)
            X.HNR r0 = X.HNR.A2a
            int r1 = r2.A00(r0)
            r0 = 22
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r10, r0, r5, r1)
        L_0x03f4:
            java.lang.String r10 = r4.A00
            if (r10 == 0) goto L_0x040f
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x040f
            android.app.Activity r5 = r2.A06
            X.HNR r0 = X.HNR.A0n
            int r1 = r2.A00(r0)
            r0 = 23
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r5, r0, r10, r1)
        L_0x040f:
            X.0Tu r5 = X.0Tu.A05
            r0 = 36325489064817645(0x810dd7000033ed, double:3.0357237833700596E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x044d
            r10 = 2131965854(0x7f13379e, float:1.956853E38)
            r0 = 36325489065538552(0x810dd7000b33f8, double:3.035723783825964E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0438
            r0 = 36325489065604089(0x810dd7000c33f9, double:3.03572378386741E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0616
            r10 = 2131976071(0x7f135f87, float:1.9589252E38)
        L_0x0438:
            android.app.Activity r13 = r2.A06
            java.lang.String r10 = X.AnonymousClass7TE.A16(r13, r10)
            X.HNR r0 = X.HNR.A12
            int r1 = r2.A00(r0)
            r0 = 24
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r13, r0, r10, r1)
        L_0x044d:
            boolean r0 = r4.A0D
            if (r0 == 0) goto L_0x0469
            android.app.Activity r13 = r2.A06
            r0 = 2131972103(0x7f135007, float:1.9581204E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r13, r0)
            X.HNR r0 = X.HNR.A1Y
            int r1 = r2.A00(r0)
            r0 = 25
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r13, r0, r10, r1)
        L_0x0469:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x0485
            android.app.Activity r13 = r2.A06
            r0 = 2131957536(0x7f131720, float:1.9551659E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r13, r0)
            X.HNR r0 = X.HNR.A0Y
            int r1 = r2.A00(r0)
            r0 = 26
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r13, r0, r10, r1)
        L_0x0485:
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x04a1
            android.app.Activity r13 = r2.A06
            r0 = 2131974135(0x7f1357f7, float:1.9585325E38)
            java.lang.String r10 = X.AnonymousClass7TE.A16(r13, r0)
            X.HNR r0 = X.HNR.A05
            int r1 = r2.A00(r0)
            r0 = 27
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r13, r0, r10, r1)
        L_0x04a1:
            if (r11 == 0) goto L_0x0526
            if (r6 != 0) goto L_0x0526
            r0 = 36319390211644613(0x81084b00061cc5, double:3.0318668440653236E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            java.lang.Integer r0 = X.C51967G9n.A0l(r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            if (r0 != r6) goto L_0x0526
            r0 = 36319390212299983(0x81084b00101ccf, double:3.031866844479782E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x04c4
            r15.A06(r9)
        L_0x04c4:
            android.app.Activity r9 = r2.A06
            java.lang.Integer r1 = r2.A01()
            r0 = 2131973003(0x7f13538b, float:1.958303E38)
            if (r1 != r6) goto L_0x04d2
            r0 = 2131964435(0x7f133213, float:1.9565652E38)
        L_0x04d2:
            java.lang.String r10 = X.AnonymousClass7TE.A16(r9, r0)
            X.HNR r0 = X.HNR.A1k
            int r1 = r2.A00(r0)
            r0 = 28
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r9, r0, r10, r1)
            r0 = 36319390212103372(0x81084b000d1ccc, double:3.0318668443554446E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x051a
            r0 = 36319390212365520(0x81084b00111cd0, double:3.031866844521228E-306)
            boolean r10 = X.182.A06(r5, r3, r0)
            java.lang.Integer r1 = r2.A01()
            r0 = 2131972995(0x7f135383, float:1.9583013E38)
            if (r1 != r6) goto L_0x0505
            r0 = 2131968512(0x7f134200, float:1.957392E38)
        L_0x0505:
            java.lang.String r6 = X.AnonymousClass7TE.A16(r9, r0)
            X.HNR r0 = X.HNR.A1i
            int r1 = r2.A00(r0)
            if (r10 == 0) goto L_0x060b
            r0 = 29
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A01(r9, r0, r6, r1)
        L_0x051a:
            X.JR4 r1 = r2.A00
            if (r1 == 0) goto L_0x0626
            X.GJT r0 = new X.GJT
            r0.<init>(r1, r3)
            r1.Cis()
        L_0x0526:
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x05a0
            if (r11 == 0) goto L_0x05db
            r0 = 2342162399425273028(0x2081084b00051cc4, double:4.065068831383338E-152)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x05a0
            android.app.Activity r6 = r2.A06
            if (r7 != r12) goto L_0x0546
            r0 = 36319390211316929(0x81084b00011cc1, double:3.031866843858095E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0561
        L_0x0546:
            X.GJd r0 = X.C52212GJd.A0B
            if (r7 != r0) goto L_0x0555
            r0 = 36319390211448003(0x81084b00031cc3, double:3.0318668439409866E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0561
        L_0x0555:
            X.GJd r0 = X.C52212GJd.A05
            if (r7 != r0) goto L_0x0561
            r0 = 36319390211382466(0x81084b00021cc2, double:3.031866843899541E-306)
            X.182.A06(r5, r3, r0)
        L_0x0561:
            r0 = 2131963366(0x7f132de6, float:1.9563483E38)
            java.lang.String r9 = X.AnonymousClass7TE.A16(r6, r0)
            if (r7 != r12) goto L_0x0575
            r0 = 36319390211316929(0x81084b00011cc1, double:3.031866843858095E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0590
        L_0x0575:
            X.GJd r0 = X.C52212GJd.A0B
            if (r7 != r0) goto L_0x0584
            r0 = 36319390211448003(0x81084b00031cc3, double:3.0318668439409866E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 != 0) goto L_0x0590
        L_0x0584:
            X.GJd r0 = X.C52212GJd.A05
            if (r7 != r0) goto L_0x0590
            r0 = 36319390211382466(0x81084b00021cc2, double:3.031866843899541E-306)
            X.182.A06(r5, r3, r0)
        L_0x0590:
            X.HNR r0 = X.HNR.A0p
            int r3 = r2.A00(r0)
            r1 = 55
        L_0x0598:
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r15.A00(r6, r0, r9, r3)
        L_0x05a0:
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x05bd
            android.app.Activity r6 = r2.A06
            r0 = 2131972172(0x7f13504c, float:1.9581344E38)
            java.lang.String r5 = X.AnonymousClass7TE.A16(r6, r0)
            X.HNR r0 = X.HNR.A1a
            int r3 = r2.A00(r0)
            r1 = 57
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            r15.A00(r6, r0, r5, r3)
        L_0x05bd:
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0272
            android.app.Activity r4 = r2.A06
            r0 = 2131972023(0x7f134fb7, float:1.9581042E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r4, r0)
            X.HNR r0 = X.HNR.A1M
            int r1 = r2.A00(r0)
            r0 = 32
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A00(r4, r0, r3, r1)
            goto L_0x0272
        L_0x05db:
            android.app.Activity r6 = r2.A06
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0607
            java.lang.Integer r3 = r2.A01()
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 2131972995(0x7f135383, float:1.9583013E38)
            if (r3 != r1) goto L_0x05f1
            r0 = 2131968512(0x7f134200, float:1.957392E38)
        L_0x05f1:
            java.lang.String r9 = X.AnonymousClass7TE.A16(r6, r0)
            boolean r0 = r2.A0I()
            if (r0 == 0) goto L_0x0604
            X.HNR r0 = X.HNR.A1i
        L_0x05fd:
            int r3 = r2.A00(r0)
            r1 = 56
            goto L_0x0598
        L_0x0604:
            X.HNR r0 = X.HNR.A0p
            goto L_0x05fd
        L_0x0607:
            r0 = 2131963366(0x7f132de6, float:1.9563483E38)
            goto L_0x05f1
        L_0x060b:
            r0 = 30
            X.ID1 r0 = X.ID1.A00(r2, r0)
            r15.A00(r9, r0, r6, r1)
            goto L_0x051a
        L_0x0616:
            r0 = 36325489065669626(0x810dd7000d33fa, double:3.035723783908856E-306)
            boolean r0 = X.182.A06(r5, r3, r0)
            if (r0 == 0) goto L_0x0438
            r10 = 2131965853(0x7f13379d, float:1.9568528E38)
            goto L_0x0438
        L_0x0626:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x062b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52031GCd.A0K(X.4gz, X.1Xl, X.3W1, X.6Yf, X.HpF, java.lang.String, java.lang.String):void");
    }

    public final void A0L(C270594gz r9, 1Xl r10, C55894HpF hpF) {
        A0K(r9, r10, (AnonymousClass3W1) null, (C309426Yf) null, hpF, (String) null, (String) null);
    }

    private final int A00(HNR hnr) {
        if (!182.A06(0Tu.A05, this.A07, 36312183256777665L)) {
            return -1;
        }
        return hnr.A00;
    }

    private final Integer A01() {
        String A042 = 182.A04(0Tu.A05, this.A07, 36882340164927932L);
        try {
            Locale locale = Locale.ROOT;
            0qQ.A08(locale);
            String upperCase = A042.toUpperCase(locale);
            0qQ.A07(upperCase);
            if (upperCase.equals("MORE_LESS")) {
                return AnonymousClass05K.A00;
            }
            if (upperCase.equals("I9")) {
                return AnonymousClass05K.A01;
            }
            throw AnonymousClass7TE.A0w(upperCase);
        } catch (IllegalArgumentException e) {
            0KC.A0G("AdsOverflowMenuHelper", 002.A0R("Invalid AFI button variation passed: ", A042), e);
            return AnonymousClass05K.A00;
        }
    }

    private final void A02(C254523sc r8, AnonymousClass3W1 r9) {
        0jB A0k;
        0j9 r4;
        double d;
        C309426Yf r2;
        int ordinal = this.A0B.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1 && (r2 = this.A04) != null) {
                A0k = C51965G9l.A0k();
                C51967G9n.A1J(C271774jZ.A23, A0k, r2.A0r);
                C51967G9n.A1J(C271774jZ.A22, A0k, AnonymousClass7TF.A1R(r2.A0K));
                r4 = C271774jZ.A24;
                d = (double) r2.A0K;
            } else {
                return;
            }
        } else if (r9 != null) {
            A0k = C51965G9l.A0k();
            C51967G9n.A1J(C271774jZ.A23, A0k, r9.A2r);
            C51967G9n.A1J(C271774jZ.A22, A0k, AnonymousClass7TF.A1R((r9.A0b > 0 ? 1 : (r9.A0b == 0 ? 0 : -1))));
            r4 = C271774jZ.A24;
            d = (double) r9.A0b;
        } else {
            return;
        }
        A0k.A04(r4, Double.valueOf(d));
        r8.A0k = A0k;
    }

    public static final void A03(1Xj r5, C52031GCd gCd) {
        UserSession userSession = gCd.A07;
        Activity activity = gCd.A06;
        1Xl r0 = gCd.A02;
        if (r0 != null) {
            int A0o = r0.BPf().A0o();
            1Xl r02 = gCd.A02;
            if (r02 != null) {
                new AnonymousClass3W1(A0o, r02.BPf().A4o());
                boolean A1Y = C51970G9q.A1Y(r5);
                C54127Gzw gzw = new C54127Gzw();
                C331127Pr A0W = DbS.A0W(userSession);
                A0W.A1J = A1Y;
                DbU.A0y(activity, gzw, A0W);
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(AnonymousClass3W1 r3, C52031GCd gCd) {
        gCd.A09(r3, C16666Uz2.HIDE_AD_BUTTON, "hide_button", AnonymousClass7TE.A16(gCd.A06, 2131963366));
    }

    public static final void A05(AnonymousClass3W1 r11, C52031GCd gCd) {
        String str = gCd.A05;
        Activity activity = gCd.A06;
        if (str != null) {
            String A16 = AnonymousClass7TE.A16(activity, 2131972172);
            C16666Uz2 uz2 = C16666Uz2.REPORT_AD_BUTTON;
            String str2 = gCd.A05;
            A07((AnonymousClass3W1) null, gCd, "report_button");
            C71093OcF A012 = ORV.A01(activity, gCd.A08, gCd.A07, gCd.A0B.A00, C16677UzD.AD, str2);
            A012.A0A = A16;
            0qQ.A0B(uz2, 0);
            A012.A02 = uz2;
            A012.A07(new HH3(2, r11, uz2, gCd));
            C71093OcF.A00((C331157Pu) null, A012);
            return;
        }
        gCd.A09(r11, C16666Uz2.REPORT_AD_BUTTON, "report_button", AnonymousClass7TE.A16(activity, 2131972172));
    }

    public static final void A06(AnonymousClass3W1 r5, C52031GCd gCd) {
        UserSession userSession = gCd.A07;
        if (!182.A06(0Tu.A05, userSession, 2342162399425273028L)) {
            A04(r5, gCd);
            return;
        }
        JR4 jr4 = gCd.A00;
        if (jr4 != null) {
            GJT gjt = new GJT(jr4, userSession);
            Activity activity = gCd.A06;
            C310336ap A0Z = C51975G9x.A0Z();
            DbS.A19(activity, A0Z, 2131972994);
            A0Z.A02();
            A0Z.A0L = true;
            A0Z.A0R = true;
            DbW.A0q(activity, A0Z, 2131975851);
            A0Z.A0A(new IVU(0, activity, gjt, jr4));
            Drawable drawable = activity.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
            if (drawable != null) {
                C51975G9x.A0y(activity, drawable, A0Z);
                Dbb.A1Q(A0Z);
                jr4.Ck7("see_less");
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r2 = r2.A01();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A07(X.AnonymousClass3W1 r6, X.C52031GCd r7, java.lang.String r8) {
        /*
            X.4DU r5 = r7.A08
            X.1Xl r1 = r7.A02
            java.lang.String r4 = "model"
            r3 = 0
            if (r1 == 0) goto L_0x000f
            X.4gz r0 = r7.A01
            if (r0 != 0) goto L_0x0017
            java.lang.String r4 = "insightsProcessor"
        L_0x000f:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0017:
            X.3sc r2 = X.C233822wX.A01(r0, r1, r5, r8)
            com.instagram.common.session.UserSession r1 = r7.A07
            X.1Xl r0 = r7.A02
            if (r0 == 0) goto L_0x000f
            r2.A0J(r1, r0)
            r7.A02(r2, r6)
            java.lang.String r0 = "waist_button"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00f4
            X.GCe r1 = r7.A0D
            com.instagram.common.session.UserSession r0 = r1.A00
            X.4DU r5 = r1.A01
            X.0wc r1 = X.AnonymousClass0kN.A01(r5, r0)
            java.lang.String r0 = "instagram_ad_waist_button"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x00f1
            X.0jB r2 = r2.A01()
            X.0j9 r0 = X.C271774jZ.A0C
            java.lang.Long r3 = X.C51966G9m.A13(r0, r2)
            if (r3 == 0) goto L_0x00f1
            X.0j9 r0 = X.C271774jZ.A0Z
            java.io.Serializable r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = r0.toString()
            if (r1 == 0) goto L_0x00f1
            X.C51965G9l.A1D(r4, r3)
            X.0j9 r0 = X.C271774jZ.A9L
            java.lang.String r0 = X.C51966G9m.A1C(r0, r2)
            X.C51965G9l.A1L(r4, r0)
            X.0j9 r0 = X.C271774jZ.A5I
            java.lang.String r0 = X.C51966G9m.A1C(r0, r2)
            X.C51965G9l.A1I(r4, r0)
            java.lang.String r0 = "a_pk"
            r4.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A10
            java.lang.String r1 = X.C51966G9m.A1C(r0, r2)
            java.lang.String r0 = "carousel_media_id"
            r4.AAJ(r0, r1)
            X.C51969G9p.A19(r4, r5)
            X.0j9 r0 = X.C271774jZ.A3q
            java.lang.String r1 = X.C51966G9m.A1C(r0, r2)
            java.lang.String r0 = "inventory_source"
            r4.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A5K
            java.lang.Long r0 = X.C51966G9m.A13(r0, r2)
            X.C51965G9l.A1E(r4, r0)
            X.0j9 r0 = X.C271774jZ.A5E
            java.lang.Long r0 = X.C51966G9m.A13(r0, r2)
            X.C51965G9l.A1H(r4, r0)
            X.0j9 r0 = X.C271774jZ.A26
            java.lang.String r1 = X.C51966G9m.A1C(r0, r2)
            java.lang.String r0 = "delivery_flags"
            r4.AAJ(r0, r1)
            X.0j9 r0 = X.C271774jZ.A20
            java.io.Serializable r3 = r2.A01(r0)
            X.0jB r3 = (X.0jB) r3
            if (r3 == 0) goto L_0x00f2
            X.Gk0 r2 = new X.Gk0
            r2.<init>()
            X.0j9 r0 = X.C271774jZ.A23
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "is_delayed_skip_ad"
            r2.A03(r0, r1)
            X.0j9 r0 = X.C271774jZ.A22
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r0 = "is_action_on_unskippable"
            r2.A03(r0, r1)
            X.0j9 r0 = X.C271774jZ.A24
            java.io.Serializable r1 = r3.A01(r0)
            java.lang.Double r1 = (java.lang.Double) r1
            java.lang.String r0 = "remaining_time"
            r2.A04(r0, r1)
        L_0x00e5:
            r0 = 279(0x117, float:3.91E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAK(r2, r0)
            r4.Cgf()
        L_0x00f1:
            return
        L_0x00f2:
            r2 = 0
            goto L_0x00e5
        L_0x00f4:
            X.1Xl r0 = r7.A02
            if (r0 == 0) goto L_0x000f
            X.C233822wX.A0C(r1, r2, r0, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52031GCd.A07(X.3W1, X.GCd, java.lang.String):void");
    }

    public static final void A08(AnonymousClass3W1 r7, C52031GCd gCd, String str, String str2) {
        AnonymousClass3OA r2;
        UserSession userSession;
        AnonymousClass3OA r22 = gCd.A02;
        String str3 = "model";
        if (r22 != null) {
            if (r22 instanceof AnonymousClass3OA) {
                r2 = r22;
            } else {
                r2 = null;
            }
            if (r2 == null || !r2.A0x) {
                userSession = gCd.A07;
                1se A002 = 1sd.A00(userSession);
                1Xl r0 = gCd.A02;
                if (r0 != null) {
                    A002.A02(r0.BPf(), true);
                }
            } else {
                userSession = gCd.A07;
                GJ1 gj1 = (GJ1) userSession.A01(GJ1.class, new C45999DId(userSession, 5));
                AnonymousClass3OA r02 = gCd.A02;
                if (r02 != null) {
                    String str4 = r02.A0S;
                    0qQ.A0B(str4, 0);
                    DbX.A1V(gj1.A00, str4, true);
                }
            }
            gCd.A0A.Ctt(str, str2);
            if (str2 != null) {
                AnonymousClass4DU r4 = gCd.A08;
                1Xl r3 = gCd.A02;
                if (r3 != null) {
                    C270594gz r1 = gCd.A01;
                    if (r1 == null) {
                        str3 = "insightsProcessor";
                    } else {
                        C254523sc A012 = C233822wX.A01(r1, r3, r4, "hide_response");
                        A012.A6o = str2;
                        A012.A6z = str;
                        C51972G9s.A1A(A012);
                        1Xl r03 = gCd.A02;
                        if (r03 != null) {
                            A012.A0J(userSession, r03);
                            gCd.A02(A012, r7);
                            1Xl r04 = gCd.A02;
                            if (r04 != null) {
                                C233822wX.A0C(userSession, A012, r04, r4, (Integer) null);
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0A(C52031GCd gCd) {
        String A072;
        C52031GCd gCd2 = gCd;
        AnonymousClass3OA r3 = gCd2.A02;
        if (r3 != null) {
            if (r3 instanceof AnonymousClass3OA) {
                A072 = r3.A0S;
            } else {
                A072 = C231122qu.A07(gCd2.A07, r3.BPf());
            }
            if (A072 != null) {
                1Xl r0 = gCd2.A02;
                if (r0 != null) {
                    1Xj BPf = r0.BPf();
                    UserSession userSession = gCd2.A07;
                    C55532HjE hjE = new C55532HjE(gCd2);
                    0qQ.A0B(BPf, 2);
                    Long A10 = AnonymousClass7TE.A10(A072);
                    if (A10 != null) {
                        0xG A0O = DbS.A0O("remove_from_ad_activity_helper");
                        HOF hof = HOF.DELETE_CLICK_CLIENT;
                        0bb r32 = new 0bb();
                        r32.A05("timestamp", Long.valueOf(AnonymousClass7TG.A0I()));
                        r32.A05("ad_id", A10);
                        C55086Hbv.A00(hof, A0O, userSession, "remove_from_ad_activity_helper", "remove", AnonymousClass7TE.A1I(r32));
                    }
                    IWM iwm = new IWM(userSession, BPf, hjE, A072);
                    2IS A042 = C41845B3m.A04();
                    1vm.A01(userSession).A06(new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, A072, "ad_id"), A042, "input"), "AdActivityRemoveMutation", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), BmO.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "xfb_delete_recent_ad_activity", AnonymousClass7TE.A1C()), new C47691EDa(iwm, 16));
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0B(C52031GCd gCd) {
        1Xl r0 = gCd.A02;
        if (r0 == null) {
            0qQ.A0F("model");
            throw AnonymousClass00P.createAndThrow();
        }
        1Xj BPf = r0.BPf();
        UserSession userSession = gCd.A07;
        User A2A = BPf.A2A(userSession);
        if (A2A != null) {
            I3C.A01(gCd.A06, userSession, A2A.getId(), gCd.A0B.A01);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0C(C52031GCd gCd) {
        UserSession userSession = gCd.A07;
        Activity activity = gCd.A06;
        AnonymousClass4DU r3 = gCd.A08;
        1Xl r0 = gCd.A02;
        if (r0 != null) {
            C71093OcF A012 = ORV.A01(activity, r3, userSession, gCd.A0B.A00, C16677UzD.MEDIA, r0.BPf().getId());
            1Xl r02 = gCd.A02;
            if (r02 != null) {
                A012.A01 = r02.BPf().A2A(userSession);
                A012.A07(new C48057EUb(gCd, 9));
                C71093OcF.A00((C331157Pu) null, A012);
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0D(C52031GCd gCd) {
        Activity activity = gCd.A06;
        UserSession userSession = gCd.A07;
        1Xl r0 = gCd.A02;
        if (r0 == null) {
            0qQ.A0F("model");
            throw AnonymousClass00P.createAndThrow();
        }
        C49946FGa.A05(activity, userSession, r0.BPf(), C52031GCd.class, gCd.A08.getModuleName());
    }

    public static final void A0E(C52031GCd gCd) {
        JR4 jr4 = gCd.A00;
        if (jr4 != null) {
            GJT gjt = new GJT(jr4, gCd.A07);
            Activity activity = gCd.A06;
            C310336ap A0Z = C51975G9x.A0Z();
            DbS.A19(activity, A0Z, 2131973001);
            A0Z.A02();
            A0Z.A0L = true;
            A0Z.A0R = true;
            DbW.A0q(activity, A0Z, 2131975851);
            A0Z.A0A(new IVU(1, activity, gjt, jr4));
            Drawable drawable = activity.getDrawable(R.drawable.instagram_circle_check_pano_outline_24);
            if (drawable != null) {
                C51975G9x.A0y(activity, drawable, A0Z);
                Dbb.A1Q(A0Z);
                jr4.Ck7("see_more");
                gCd.A0A.Cuf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0F(C52031GCd gCd) {
        1Xl r0 = gCd.A02;
        if (r0 != null) {
            String id = r0.getId();
            if (id != null) {
                1Xl r02 = gCd.A02;
                if (r02 != null) {
                    UserSession userSession = gCd.A07;
                    String ByO = r02.ByO(userSession);
                    if (ByO != null) {
                        String A0R = 002.A0R("instagram_ad_", AnonymousClass000.A00(1410));
                        AnonymousClass4DU r1 = gCd.A08;
                        C254523sc A0n = C51965G9l.A0n(r1, A0R);
                        A0n.A78 = id;
                        A0n.A7J = ByO;
                        C233822wX.A0H(userSession, A0n, r1);
                    }
                }
            }
            Activity activity = gCd.A06;
            Drawable drawable = activity.getDrawable(R.drawable.instagram_eye_off_pano_outline_24);
            if (drawable != null) {
                C310336ap A0a = DbS.A0a();
                DbS.A19(activity, A0a, 2131954112);
                A0a.A02();
                A0a.A08(drawable, AnonymousClass7TF.A03(activity, R.attr.igds_color_creation_tools_grey_03));
                DbY.A1N(A0a);
            }
            AnonymousClass7TF.A0D().postDelayed(C57992Ijl.A00, 2000);
            return;
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A0G(C52031GCd gCd) {
        String A072;
        AnonymousClass3OA r3 = gCd.A02;
        if (r3 != null) {
            if (r3 instanceof AnonymousClass3OA) {
                A072 = r3.A0S;
            } else {
                A072 = C231122qu.A07(gCd.A07, r3.BPf());
            }
            UserSession userSession = gCd.A07;
            1Xl r0 = gCd.A02;
            if (r0 != null) {
                String A0F = C231122qu.A0F(userSession, r0.BPf());
                A07(gCd.A03, gCd, "waist_button");
                I3C.A00(gCd.A06, userSession, new C55533HjF(gCd), A072, A0F, gCd.A0B.A02);
                return;
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x001e: MOVE  (r1v2 X.3OA) = (r1v1 X.3OA)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    private final boolean A0H() {
        /*
            r3 = this;
            com.instagram.common.session.UserSession r1 = r3.A07
            X.1Xl r0 = r3.A02
            java.lang.String r2 = "model"
            if (r0 == 0) goto L_0x002a
            X.1Xj r0 = r0.BPf()
            java.lang.String r0 = r0.getId()
            java.lang.String r0 = X.C231122qu.A0H(r1, r0)
            if (r0 != 0) goto L_0x0026
            X.1Xl r1 = r3.A02
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof X.AnonymousClass3OA
            if (r0 == 0) goto L_0x0028
            X.3OA r1 = (X.AnonymousClass3OA) r1
            if (r1 == 0) goto L_0x0028
            java.lang.String r0 = r1.A0c
            if (r0 == 0) goto L_0x0028
        L_0x0026:
            r0 = 1
            return r0
        L_0x0028:
            r0 = 0
            return r0
        L_0x002a:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52031GCd.A0H():boolean");
    }

    private final boolean A0I() {
        1Xl r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("model");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean A5n = r0.BPf().A5n();
        UserSession userSession = this.A07;
        boolean A072 = C228342lQ.A07(userSession, 1Au.A00(userSession));
        0Tu r3 = 0Tu.A05;
        boolean A062 = 182.A06(r3, userSession, 36319390211775687L);
        boolean A063 = 182.A06(r3, userSession, 36319390211841224L);
        if ((!A5n || A063) && ((!A072 || A062) && 182.A06(r3, userSession, 36319390211710150L))) {
            return true;
        }
        return false;
    }

    public final void A0J() {
        Activity activity = this.A06;
        IgdsHeadline igdsHeadline = new IgdsHeadline(activity, (AttributeSet) null, 0, 0);
        igdsHeadline.A02 = true;
        igdsHeadline.setHeadline((CharSequence) activity.getString(2131976844));
        igdsHeadline.setBody((CharSequence) activity.getString(2131976845));
        igdsHeadline.EZe(R.drawable.lift_products_igbrandsurveysicon, false);
        igdsHeadline.ENc(ID1.A00(this, 19), 2131954116);
        C46498Dg1 dg1 = new C46498Dg1(activity, this.A07);
        dg1.A03 = new IVD(2);
        dg1.A01 = igdsHeadline;
        dg1.A04(C56796ICt.A00, 2131976846);
        C51969G9p.A11(activity, dg1);
    }

    public C52031GCd(Activity activity, UserSession userSession, AnonymousClass4DU r4, C228232l0 r5, JRB jrb, C52212GJd gJd, String str) {
        AnonymousClass7TG.A1O(activity, userSession);
        this.A06 = activity;
        this.A07 = userSession;
        this.A08 = r4;
        this.A0B = gJd;
        this.A0A = jrb;
        this.A0C = str;
        this.A09 = r5;
        this.A0D = new C52032GCe(userSession, r4);
    }

    private final void A09(AnonymousClass3W1 r11, C16666Uz2 uz2, String str, String str2) {
        String A072;
        A07(r11, this, str);
        UserSession userSession = this.A07;
        1Xl r0 = this.A02;
        String str3 = null;
        if (r0 != null) {
            Integer A052 = C231122qu.A05(userSession, r0.BPf());
            JSONObject A11 = DbS.A11();
            if (A052 != null) {
                str3 = A052.toString();
            }
            A11.put(C273654mx.A00(231), str3);
            AnonymousClass3OA r2 = this.A02;
            if (r2 != null) {
                if (r2 instanceof AnonymousClass3OA) {
                    A072 = r2.A0S;
                } else {
                    A072 = C231122qu.A07(userSession, r2.BPf());
                }
                if (A072 != null) {
                    C71093OcF A012 = ORV.A01(this.A06, this.A08, userSession, this.A0B.A00, C16677UzD.AD, A072);
                    A012.A0A = str2;
                    1Xl r02 = this.A02;
                    if (r02 != null) {
                        A012.A01 = r02.BPf().A2A(userSession);
                        A012.A02 = uz2;
                        A012.A08(C66579MXk.A00(944), A11.toString());
                        A012.A03 = new HH2(r11, this, uz2, str);
                        C71093OcF.A00((C331157Pu) null, A012);
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("model");
        throw AnonymousClass00P.createAndThrow();
    }
}
