package X;

import android.animation.LayoutTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class JZP {
    public static final ViewGroup A00(ViewGroup viewGroup, C247833gz r9, UserSession userSession, C226642hc r11, AnonymousClass6ZZ r12) {
        ViewGroup viewGroup2;
        C51973G9u.A1E(userSession, viewGroup, r12);
        LayoutInflater A0D = DbV.A0D(viewGroup);
        0Tu r2 = 0Tu.A05;
        boolean A06 = 182.A06(r2, userSession, 36323320106593354L);
        boolean A062 = 182.A06(r2, userSession, 36325347331027853L);
        if (!A06) {
            int i = R.layout.layout_iglive_reel_item;
            if (A062) {
                i = R.layout.layout_iglive_reel_item_igds;
            }
            View inflate = A0D.inflate(i, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            C51968G9o.A1D(viewGroup2, -1);
        } else {
            int i2 = R.layout.layout_iglive_reel_item;
            if (A062) {
                i2 = R.layout.layout_iglive_reel_item_igds;
            }
            0qQ.A0A(A0D);
            View A00 = 2Su.A00(A0D, new ViewGroup.LayoutParams(-1, -1), viewGroup, i2);
            0qQ.A0C(A00, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A00;
        }
        C305836Jt r1 = new C305836Jt(viewGroup2, userSession, r12);
        if (r11 != null) {
            r1.A0b.setPostProcessor(r11);
        }
        if (r9 != null) {
            r1.A0b.setProgressiveImageConfig(r9);
        }
        viewGroup2.setTag(r1);
        return viewGroup2;
    }

    public static final void A02(C305836Jt r4) {
        A03(r4, R.color.fds_transparent, false);
        r4.A03(true);
        JZS jzs = r4.A0e;
        jzs.A01.setVisibility(0);
        AnonymousClass7TH.A06(jzs.A05).setVisibility(8);
        JTS.A1W(jzs.A02, 8);
        jzs.A00().A06();
        jzs.A00().setVisibility(0);
        ((L2M) jzs.A07.getValue()).A00.setVisibility(8);
        AnonymousClass0eM r2 = jzs.A04;
        C3019160o.A01(AnonymousClass7TH.A06(r2)).setLayoutTransition((LayoutTransition) null);
        C51969G9p.A1M(AnonymousClass7TE.A14(r2));
        JTS.A1W(jzs.A06, 8);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x003e: MOVE  (r2v6 X.3BQ) = (r25v0 X.3BQ)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02bd  */
    public static final void A01(X.AnonymousClass0iw r20, com.instagram.common.session.UserSession r21, X.C270194gL r22, X.C255773uh r23, X.C250973mM r24, X.AnonymousClass3BQ r25, X.C309426Yf r26, X.C305836Jt r27, X.C317116mk r28) {
        /*
            r4 = r27
            X.6Yf r0 = r4.A04
            r10 = r26
            boolean r0 = X.0qQ.A0K(r0, r10)
            if (r0 != 0) goto L_0x0013
            X.6Yf r0 = r4.A04
            if (r0 == 0) goto L_0x0013
            r0.A04(r4)
        L_0x0013:
            X.3uh r0 = r4.A02
            r11 = r23
            boolean r19 = r11.equals(r0)
            r5 = r24
            r4.A03 = r5
            r4.A02 = r11
            r0 = r22
            r4.A01 = r0
            r4.A04 = r10
            r10.A03(r4)
            X.4gL r12 = r11.A0c
            if (r12 == 0) goto L_0x00ae
            X.4wI r0 = r12.A06
            if (r0 != 0) goto L_0x0034
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x0034:
            boolean r0 = r0.A00()
            r6 = r20
            if (r0 == 0) goto L_0x00af
            X.3BQ r0 = X.AnonymousClass3BQ.PUSH_NOTIFICATION
            r2 = r25
            if (r2 != r0) goto L_0x00af
            android.view.View r1 = r4.A0P
            r0 = 8
            r1.setVisibility(r0)
            X.3Nc r0 = r4.A0g
            android.view.View r0 = r0.A00()
            r5 = 0
            r0.setVisibility(r5)
            X.JZR r9 = r4.A0c
            com.instagram.user.model.User r8 = r12.A03()
            boolean r7 = r2.A00()
            r0 = 16
            X.WBC r3 = new X.WBC
            r3.<init>(r4, r0)
            r0 = 17
            X.WBC r2 = new X.WBC
            r2.<init>(r4, r0)
            X.0qQ.A0B(r9, r5)
            X.0eM r1 = r9.A00
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            X.DbU.A1S(r6, r0, r8)
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            X.AnonymousClass0fU.A00(r3, r0)
            X.0eM r1 = r9.A01
            android.widget.TextView r0 = X.JTQ.A0A(r1)
            X.DbU.A1H(r0, r8)
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            X.AnonymousClass0fU.A00(r2, r0)
            android.widget.TextView r3 = X.JTQ.A0A(r1)
            boolean r0 = r8.isVerified()
            if (r0 == 0) goto L_0x009d
            r2 = 1
            if (r7 != 0) goto L_0x009e
        L_0x009d:
            r2 = 0
        L_0x009e:
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.JTP.A03(r0)
            r0 = -1
            X.C244273av.A09(r3, r5, r1, r0, r2)
        L_0x00ae:
            return
        L_0x00af:
            android.view.View r0 = r4.A0P
            r2 = 0
            r0.setVisibility(r2)
            X.3Nc r1 = r4.A0g
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x00c6
            android.view.View r1 = r1.A00()
            r0 = 8
            r1.setVisibility(r0)
        L_0x00c6:
            if (r19 != 0) goto L_0x011c
            r4.A01()
            androidx.constraintlayout.widget.ConstraintLayout r14 = r4.A0W
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r13 = r4.A0i
            java.util.Set r0 = r12.A06()
            boolean r0 = r0.isEmpty()
            r16 = r0 ^ 1
            if (r14 == 0) goto L_0x011c
            android.content.Context r0 = r14.getContext()
            r9 = 0
            if (r16 == 0) goto L_0x04d1
            int r8 = X.AnonymousClass7TG.A05(r0)
        L_0x00e6:
            int r15 = X.DbY.A01(r0)
            int r7 = X.0nA.A08(r0)
            int r1 = X.0nA.A09(r0)
            int r0 = r8 * 2
            int r1 = r1 - r0
            float r1 = (float) r1
            r0 = 1058013184(0x3f100000, float:0.5625)
            float r1 = r1 / r0
            int r3 = (int) r1
            if (r3 <= r7) goto L_0x00fd
            r3 = r7
        L_0x00fd:
            android.view.ViewGroup$LayoutParams r1 = r14.getLayoutParams()
            boolean r0 = r1 instanceof X.C71492dQ
            if (r0 == 0) goto L_0x010f
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            if (r1 == 0) goto L_0x010f
            r1.setMargins(r8, r2, r8, r2)
            r14.requestLayout()
        L_0x010f:
            if (r13 == 0) goto L_0x011c
            if (r16 != 0) goto L_0x0115
            if (r3 >= r7) goto L_0x0116
        L_0x0115:
            r9 = r15
        L_0x0116:
            r13.setCornerRadius(r9)
            r13.requestLayout()
        L_0x011c:
            X.3v7 r9 = r4.A0a
            X.C256013v5.A03(r9)
            X.6l8 r8 = r4.A0f
            X.0qQ.A0B(r8, r2)
            android.view.View r0 = r8.A00
            X.AnonymousClass7TH.A0R(r0)
            X.0eE r1 = X.AnonymousClass0t1.A01
            r3 = r21
            com.instagram.user.model.User r7 = r1.A01(r3)
            com.instagram.user.model.User r0 = r12.A03()
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x0145
            com.instagram.model.reels.Reel r0 = r5.A0H
            boolean r0 = r0.A1d
            r18 = 1
            if (r0 != 0) goto L_0x0147
        L_0x0145:
            r18 = 0
        L_0x0147:
            boolean r0 = r11.A1N()
            if (r0 == 0) goto L_0x01a8
            X.3uh r0 = r4.A02
            if (r0 == 0) goto L_0x0176
            com.instagram.user.model.User r1 = r0.A0i
            if (r1 == 0) goto L_0x0176
            X.Kco r2 = r4.A0B
            if (r2 == 0) goto L_0x0176
            X.Jhw r0 = r2.A01
            if (r0 != 0) goto L_0x0176
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r2.A0G
            X.DbU.A1S(r6, r0, r1)
            android.widget.TextView r0 = r2.A09
            X.DbU.A1H(r0, r1)
            android.view.View r1 = r2.A04
            com.instagram.common.session.UserSession r0 = r2.A0F
            boolean r0 = X.C278264wZ.A04(r0)
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
        L_0x0176:
            X.LjH r0 = r4.A0L
            if (r0 == 0) goto L_0x017d
            r0.A00(r6, r3, r5)
        L_0x017d:
            X.2eb r2 = r4.A0Z
            X.3kW r0 = X.AnonymousClass1Qz.A00(r3)
            X.1R7 r0 = r0.C82()
            java.lang.String r1 = "ig_zero_rating_data_banner"
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r1)
            int r0 = X.DbW.A01(r0)
            r2.A03(r0)
            X.4gL r0 = r4.A01
            r5 = 1
            if (r0 == 0) goto L_0x04d4
            X.4wI r0 = r0.A06
            if (r0 != 0) goto L_0x01a1
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x01a1:
            boolean r0 = r0.A00()
            if (r0 != r5) goto L_0x04d4
            return
        L_0x01a8:
            boolean r17 = r12.A08()
            r7 = r28
            if (r17 == 0) goto L_0x044b
            r10.A03(r4)
            r10.A0l = r2
            r10.A0x = r2
            r4.A02 = r11
            r4.A01 = r12
            r4.A04 = r10
            r1 = 0
            r0 = -1
            X.3ev r21 = X.C246473ef.A00(r12, r1, r7, r0, r2)
            r0 = 8
            float[] r0 = new float[r0]
            r22 = r9
            r23 = r0
            r24 = r2
            r25 = r2
            r26 = r2
            X.C256013v5.A02(r20, r21, r22, r23, r24, r25, r26)
            r7.DzQ(r11)
            com.instagram.common.typedurl.ImageUrl r9 = r12.A02()
            if (r9 == 0) goto L_0x043f
            com.instagram.feed.widget.IgProgressImageView r8 = r4.A0b
            r1 = 2131435566(0x7f0b202e, float:1.8492978E38)
            X.LrT r0 = new X.LrT
            r0.<init>(r11, r10, r7)
            r8.A0A(r0, r1)
            long r0 = r11.A02()
            r8.setExpiration(r0)
            r8.setUrl(r9, r6)
        L_0x01f4:
            X.4gL r10 = r4.A01
            r16 = 0
            if (r10 == 0) goto L_0x03a9
            X.Kco r9 = r4.A0B
            if (r9 == 0) goto L_0x03a9
            r8 = 1
            X.Jhw r0 = r9.A01
            if (r0 != 0) goto L_0x03a9
            com.instagram.common.ui.widget.imageview.IgImageView r12 = r9.A0G
            com.instagram.user.model.User r0 = r10.A03()
            X.DbU.A1S(r6, r12, r0)
            java.lang.String r0 = r10.A0Y
            if (r0 != 0) goto L_0x0212
            java.lang.String r0 = ""
        L_0x0212:
            int r0 = r0.length()
            r7 = 0
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            r11 = 8
            r0 = 8
            if (r1 == 0) goto L_0x0222
            r0 = 0
        L_0x0222:
            r12.setVisibility(r0)
            java.lang.String r0 = r10.A0Y
            r1 = r0
            if (r0 != 0) goto L_0x022c
            java.lang.String r0 = ""
        L_0x022c:
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            android.widget.TextView r12 = r9.A09
            if (r0 == 0) goto L_0x0423
            if (r1 != 0) goto L_0x023c
            java.lang.String r1 = ""
        L_0x023c:
            r12.setText(r1)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r12)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165220(0x7f070024, float:1.794465E38)
        L_0x024a:
            float r0 = r1.getDimension(r0)
            r12.setTextSize(r2, r0)
            X.3NV r1 = r10.A0A
            if (r1 != 0) goto L_0x0257
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x0257:
            X.3NV r12 = X.AnonymousClass3NV.A0A
            if (r1 == r12) goto L_0x027a
            X.3NV r0 = X.AnonymousClass3NV.A05
            if (r1 == r0) goto L_0x027a
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r1 != r0) goto L_0x040c
            X.6go r13 = X.C313666go.VIEWER
            X.4w0 r0 = r10.A02
            if (r0 == 0) goto L_0x0274
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x0274
            boolean r1 = r0.CVs()
            r0 = 1
            if (r1 == r8) goto L_0x0275
        L_0x0274:
            r0 = 0
        L_0x0275:
            X.0qQ.A0B(r13, r8)
            if (r0 == 0) goto L_0x040c
        L_0x027a:
            X.0eM r1 = r9.A0J
            android.view.View r0 = X.JTR.A0W(r1)
            r0.setVisibility(r2)
            android.view.View r13 = X.JTR.A0W(r1)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            android.view.View r0 = X.JTR.A0W(r1)
            android.content.Context r11 = r0.getContext()
            X.3NV r1 = r10.A0A
            if (r1 == 0) goto L_0x029a
            r0 = 2131238187(0x7f081d2b, float:1.8092646E38)
            if (r1 == r12) goto L_0x029d
        L_0x029a:
            r0 = 2131238512(0x7f081e70, float:1.8093305E38)
        L_0x029d:
            X.DbU.A13(r11, r13, r0)
        L_0x02a0:
            android.widget.TextView r11 = r9.A08
            android.content.res.Resources r1 = r11.getResources()
            X.3NV r0 = r10.A0A
            if (r0 != 0) goto L_0x02ac
            X.3NV r0 = X.AnonymousClass3NV.A08
        L_0x02ac:
            int r0 = X.LKJ.A01(r0)
            X.DbU.A1A(r1, r11, r0)
            androidx.constraintlayout.widget.ConstraintLayout r14 = r9.A0C
            com.instagram.common.session.UserSession r13 = r9.A0F
            X.6go r15 = X.C313666go.VIEWER
            X.3NV r11 = r10.A0A
            if (r11 != 0) goto L_0x02bf
            X.3NV r11 = X.AnonymousClass3NV.A08
        L_0x02bf:
            X.4w0 r0 = r10.A02
            if (r0 == 0) goto L_0x02ce
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x02ce
            boolean r0 = r0.CVs()
            r1 = 1
            if (r0 == r8) goto L_0x02cf
        L_0x02ce:
            r1 = 0
        L_0x02cf:
            r0 = r16
            int r0 = X.LKJ.A00(r13, r15, r11, r0, r1)
            r14.setBackgroundResource(r0)
            java.util.List r0 = r10.A0m
            java.util.List r0 = X.JTQ.A0j(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x02ef
            com.instagram.common.typedurl.ImageUrl r1 = r0.Bh3()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r9.A0H
            r0.setUrl(r1, r6)
        L_0x02ef:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r9.A0H
            X.3NV r0 = r10.A0A
            if (r0 != 0) goto L_0x02f7
            X.3NV r0 = X.AnonymousClass3NV.A08
        L_0x02f7:
            r11 = 0
            if (r0 != r12) goto L_0x0408
            java.util.List r0 = r10.A0m
            java.util.List r0 = X.JTQ.A0j(r0)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0408
            r0.Bh3()
            r0 = 0
        L_0x030c:
            r1.setVisibility(r0)
            android.view.View r14 = r9.A07
            int r12 = r1.getVisibility()
            r0 = 0
            if (r12 != 0) goto L_0x031a
            r0 = 8
        L_0x031a:
            r14.setVisibility(r0)
            int r0 = r10.A00()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            android.widget.TextView r12 = r9.A0B
            android.content.res.Resources r14 = r12.getResources()
            X.0qQ.A07(r14)
            r0 = 10000(0x2710, float:1.4013E-41)
            java.lang.String r0 = X.C253673rC.A04(r14, r15, r0, r2, r2)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0344
            java.lang.String r0 = "+"
            r14.insert(r2, r0)
        L_0x0344:
            java.lang.String r0 = r14.toString()
            r12.setText(r0)
            int r0 = r10.A00()
            int r0 = X.JTQ.A01(r0)
            r12.setVisibility(r0)
            android.view.View r12 = r9.A06
            int r0 = r1.getVisibility()
            if (r0 == 0) goto L_0x0366
            int r0 = r10.A00()
            r1 = 8
            if (r0 <= 0) goto L_0x0367
        L_0x0366:
            r1 = 0
        L_0x0367:
            r12.setVisibility(r1)
            android.view.View r1 = r9.A04
            boolean r0 = X.C278264wZ.A04(r13)
            if (r0 != 0) goto L_0x0374
            r7 = 8
        L_0x0374:
            r1.setVisibility(r7)
            java.util.List r0 = X.C63328KvB.A00(r10)
            java.lang.Object r0 = X.00k.A0J(r0)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = (com.instagram.pendingmedia.model.BrandedContentTag) r0
            if (r0 == 0) goto L_0x0385
            java.lang.String r11 = r0.A02
        L_0x0385:
            X.3Nc r0 = r9.A0I
            android.view.View r7 = r0.A00()
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r11 == 0) goto L_0x03a9
            r7.setSelected(r8)
            android.content.Context r1 = r7.getContext()
            r0 = 2131974136(0x7f1357f8, float:1.9585328E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r1, r0)
            X.6Jl r0 = new X.6Jl
            r0.<init>()
            android.text.SpannableStringBuilder r0 = X.1sx.A01(r0, r11, r1)
            r7.setText(r0)
        L_0x03a9:
            X.LjH r0 = r4.A0L
            if (r0 == 0) goto L_0x03b0
            r0.A00(r6, r3, r5)
        L_0x03b0:
            if (r17 != 0) goto L_0x03b4
            if (r18 == 0) goto L_0x03b5
        L_0x03b4:
            r2 = 1
        L_0x03b5:
            X.3uh r1 = r4.A02
            r7 = 0
            if (r1 == 0) goto L_0x03e0
            com.instagram.common.ui.widget.imageview.IgImageView r8 = r4.A0X
            android.content.Context r0 = r8.getContext()
            com.instagram.common.typedurl.ImageUrl r5 = r1.A08(r0)
            if (r5 == 0) goto L_0x03e0
            boolean r0 = X.C253833rU.A02(r5)
            if (r0 != 0) goto L_0x0404
            X.3uh r0 = r4.A02
            if (r0 == 0) goto L_0x03d6
            long r0 = r0.A02()
            r8.A05 = r0
        L_0x03d6:
            r8.setUrl(r5, r6)
        L_0x03d9:
            if (r19 != 0) goto L_0x03e0
            if (r2 != 0) goto L_0x03e0
            r8.setVisibility(r7)
        L_0x03e0:
            X.4gL r0 = r4.A01
            if (r0 == 0) goto L_0x017d
            X.4wI r0 = r0.A06
            if (r0 != 0) goto L_0x03ea
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x03ea:
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x017d
            android.view.View r1 = r4.A0T
            int r0 = X.DbW.A00(r2)
            r1.setVisibility(r0)
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A0b
            if (r2 != 0) goto L_0x03ff
            r7 = 8
        L_0x03ff:
            r0.setVisibility(r7)
            goto L_0x017d
        L_0x0404:
            r8.A0B()
            goto L_0x03d9
        L_0x0408:
            r0 = 8
            goto L_0x030c
        L_0x040c:
            X.0eM r1 = r9.A0J
            java.lang.Object r0 = r1.getValue()
            X.3Nc r0 = (X.C240913Nc) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02a0
            android.view.View r0 = X.JTR.A0W(r1)
            r0.setVisibility(r11)
            goto L_0x02a0
        L_0x0423:
            com.instagram.user.model.User r1 = r10.A03()
            java.util.Set r0 = r10.A06()
            java.lang.String r0 = X.C63488Kxs.A00(r1, r0)
            r12.setText(r0)
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r12)
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165216(0x7f070020, float:1.7944643E38)
            goto L_0x024a
        L_0x043f:
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A0b
            r0.A04()
            r10.A0l = r2
            r7.DzS(r11, r10, r2)
            goto L_0x01f4
        L_0x044b:
            if (r18 == 0) goto L_0x01f4
            com.instagram.user.model.User r12 = r1.A01(r3)
            com.instagram.feed.widget.IgProgressImageView r0 = r4.A0b
            android.content.Context r11 = r0.getContext()
            com.instagram.model.reels.Reel r0 = r5.A0H
            X.4gL r9 = r0.A0H
            if (r9 == 0) goto L_0x01f4
            r8.A00()
            r12.Bh3()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A04
            if (r0 == 0) goto L_0x0508
            X.DbU.A1S(r6, r0, r12)
            android.widget.TextView r1 = r8.A03
            if (r1 == 0) goto L_0x0503
            java.lang.String r10 = ""
            r13 = r10
            if (r11 == 0) goto L_0x047c
            r0 = 2131971692(0x7f134e6c, float:1.958037E38)
            java.lang.String r0 = X.DbY.A0b(r11, r12, r0)
            if (r0 != 0) goto L_0x047d
        L_0x047c:
            r0 = r10
        L_0x047d:
            r1.setText(r0)
            com.instagram.user.model.User r0 = r9.A03()
            java.lang.String r0 = r0.getUsername()
            java.lang.String r1 = android.text.Html.escapeHtml(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "<b>%s</b>"
            java.lang.String r9 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1)
            r1 = 32
            if (r11 == 0) goto L_0x04a3
            r0 = 2131971678(0x7f134e5e, float:1.9580342E38)
            java.lang.String r0 = r11.getString(r0)
            if (r0 == 0) goto L_0x04a3
            r10 = r0
        L_0x04a3:
            java.lang.String r0 = X.002.A0T(r9, r10, r1)
            android.widget.TextView r1 = r8.A02
            if (r1 == 0) goto L_0x04fe
            if (r0 != 0) goto L_0x04ae
            r0 = r13
        L_0x04ae:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1.setText(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x04f9
            r0 = 2131971677(0x7f134e5d, float:1.958034E38)
            r1.setText(r0)
            android.widget.TextView r1 = r8.A01
            if (r1 == 0) goto L_0x04f4
            r0 = 42
            X.LY7.A00(r1, r0, r7, r5)
            android.view.View r0 = r8.A00
            if (r0 == 0) goto L_0x04ef
            r0.setVisibility(r2)
            goto L_0x01f4
        L_0x04d1:
            r8 = 0
            goto L_0x00e6
        L_0x04d4:
            android.view.ViewGroup r3 = r4.A0V
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            X.GC9 r1 = new X.GC9
            r1.<init>(r2)
            X.UHw r0 = new X.UHw
            r0.<init>(r5, r4, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r2, r0)
            r0 = 26
            X.C64286LYm.A00(r3, r0, r1)
            return
        L_0x04ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04f9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04fe:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0503:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0508:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZP.A01(X.0iw, com.instagram.common.session.UserSession, X.4gL, X.3uh, X.3mM, X.3BQ, X.6Yf, X.6Jt, X.6mk):void");
    }

    public static final void A03(C305836Jt r3, int i, boolean z) {
        int color = r3.A0V.getContext().getColor(i);
        View view = r3.A0e.A01;
        view.setVisibility(0);
        view.setBackgroundColor(color);
        view.setOnTouchListener(new WC3(view, r3, z));
        r3.A00();
    }
}
