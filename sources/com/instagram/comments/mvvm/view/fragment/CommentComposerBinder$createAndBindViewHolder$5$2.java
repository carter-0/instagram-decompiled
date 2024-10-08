package com.instagram.comments.mvvm.view.fragment;

import X.0lr;
import X.0r1;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.AnonymousClass4DU;
import X.C249763kK;
import X.C317746nl;
import X.C334347b7;
import X.C334397bC;
import X.C52971GgO;
import X.C53335GmL;
import X.C60340gF;
import X.C62320sa;
import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$2", f = "CommentComposerBinder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommentComposerBinder$createAndBindViewHolder$5$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ C334397bC A03;
    public final /* synthetic */ C53335GmL A04;
    public final /* synthetic */ C334347b7 A05;
    public final /* synthetic */ C52971GgO A06;
    public final /* synthetic */ UserSession A07;
    public final /* synthetic */ 0lr A08;
    public final /* synthetic */ AnonymousClass4DU A09;
    public final /* synthetic */ C317746nl A0A;
    public final /* synthetic */ C249763kK A0B;
    public final /* synthetic */ C62320sa A0C;
    public final /* synthetic */ 0r1 A0D;
    public final /* synthetic */ 0r1 A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommentComposerBinder$createAndBindViewHolder$5$2(Context context, AnonymousClass4DH r3, C334397bC r4, C53335GmL gmL, C334347b7 r6, C52971GgO ggO, UserSession userSession, 0lr r9, AnonymousClass4DU r10, C317746nl r11, C249763kK r12, AnonymousClass4D7 r13, C62320sa r14, 0r1 r15, 0r1 r16) {
        super(2, r13);
        this.A05 = r6;
        this.A02 = r3;
        this.A01 = context;
        this.A0A = r11;
        this.A06 = ggO;
        this.A07 = userSession;
        this.A09 = r10;
        this.A08 = r9;
        this.A03 = r4;
        this.A0E = r15;
        this.A0B = r12;
        this.A0C = r14;
        this.A04 = gmL;
        this.A0D = r16;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r19) {
        C334347b7 r6 = this.A05;
        AnonymousClass4DH r3 = this.A02;
        Context context = this.A01;
        C317746nl r11 = this.A0A;
        C52971GgO ggO = this.A06;
        UserSession userSession = this.A07;
        AnonymousClass4DU r10 = this.A09;
        0lr r9 = this.A08;
        C334397bC r4 = this.A03;
        0r1 r15 = this.A0E;
        ? commentComposerBinder$createAndBindViewHolder$5$2 = new CommentComposerBinder$createAndBindViewHolder$5$2(context, r3, r4, this.A04, r6, ggO, userSession, r9, r10, r11, this.A0B, r19, this.A0C, r15, this.A0D);
        commentComposerBinder$createAndBindViewHolder$5$2.A00 = obj;
        return commentComposerBinder$createAndBindViewHolder$5$2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommentComposerBinder$createAndBindViewHolder$5$2) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r10v20, types: [java.lang.Object, X.7eT] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0165, code lost:
        if (X.182.A06(r34, r4, 36320356579418462L) != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01a8, code lost:
        if (r42.A02() == false) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b1, code lost:
        if (r1 == false) goto L_0x024a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0256  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r50) {
        /*
            r49 = this;
            X.0eS.A00(r50)
            r5 = r49
            java.lang.Object r7 = r5.A00
            X.7ac r7 = (X.C334067ac) r7
            boolean r0 = r7 instanceof X.C334057ab
            if (r0 != 0) goto L_0x0304
            boolean r0 = r7 instanceof X.C335407cu
            r6 = 8
            if (r0 != 0) goto L_0x06de
            boolean r0 = r7 instanceof X.C335417cv
            if (r0 == 0) goto L_0x0689
            X.4DH r2 = r5.A02
            androidx.fragment.app.FragmentActivity r12 = r2.getActivity()
            android.content.Context r13 = r5.A01
            X.0qQ.A0A(r13)
            X.6nl r0 = r5.A0A
            r42 = r0
            X.0qQ.A0A(r13)
            X.0gy r3 = X.AnonymousClass07i.A00(r2)
            r23 = 0
            X.2lw r24 = new X.2lw
            r1 = r24
            r0 = r23
            r1.<init>(r13, r3, r0)
            X.7b7 r8 = r5.A05
            X.7cv r7 = (X.C335417cv) r7
            X.GgO r0 = r5.A06
            r48 = r0
            com.instagram.common.session.UserSession r4 = r5.A07
            X.4DU r0 = r5.A09
            r41 = r0
            X.0lr r9 = r5.A08
            X.7bC r0 = r5.A03
            r40 = r0
            X.0r1 r0 = r5.A0E
            r47 = r0
            boolean r3 = r0.A00
            android.view.View r2 = r2.mView
            X.3kK r0 = r5.A0B
            r39 = r0
            X.0sa r0 = r5.A0C
            r38 = r0
            X.GmL r0 = r5.A04
            r37 = r0
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r17 = r0.A01(r4)
            boolean r1 = r7.A0H
            r11 = 0
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r8.A05
            r46 = r0
            if (r1 == 0) goto L_0x0675
            r1 = 4
            r0.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r8.A0A
            r10.setVisibility(r11)
            X.0Tu r14 = X.0Tu.A05
            r0 = 36330256478519846(0x81122d00004226, double:3.0387387149921656E-306)
            boolean r1 = X.182.A06(r14, r4, r0)
            r0 = 2131238039(0x7f081c97, float:1.8092345E38)
            if (r1 == 0) goto L_0x008b
            r0 = 2131238689(0x7f081f21, float:1.8093664E38)
        L_0x008b:
            r10.setImageResource(r0)
        L_0x008e:
            X.7e7 r1 = new X.7e7
            r0 = r48
            r1.<init>(r0)
            X.AnonymousClass0fU.A00(r1, r10)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r0 = r8.A0B
            r45 = r0
            boolean r18 = r45.isFocused()
            r14 = r37
            r15 = r7
            r16 = r4
            java.lang.CharSequence r1 = X.C334337b6.A02(r13, r14, r15, r16, r17, r18)
            r0.setHint(r1)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r8.A04
            r44 = r0
            boolean r10 = r7.A0D
            r0.setEnabled(r10)
            X.7e8 r1 = new X.7e8
            r14 = r1
            r15 = r40
            r16 = r37
            r17 = r8
            r18 = r48
            r19 = r7
            r20 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r1, r0)
            X.1Xl r0 = r7.A03
            r25 = r0
            r33 = 0
            if (r0 == 0) goto L_0x0671
            X.1Xj r32 = r25.BPf()
        L_0x00d6:
            if (r3 != 0) goto L_0x00e3
            if (r32 == 0) goto L_0x00e3
            if (r2 == 0) goto L_0x00e3
            r1 = r32
            r0 = r41
            X.C267154b3.A01(r2, r4, r1, r0, r11)
        L_0x00e3:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A07
            r36 = r0
            X.7e9 r1 = new X.7e9
            r0 = r48
            r1.<init>(r0, r7, r4)
            r0 = r36
            X.AnonymousClass0fU.A00(r1, r0)
            if (r32 == 0) goto L_0x0109
            java.lang.String r0 = r32.getId()
            if (r0 == 0) goto L_0x0109
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r8.A09
            X.7eA r2 = new X.7eA
            r1 = r32
            r0 = r48
            r2.<init>(r0, r1)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x0109:
            X.0Tu r34 = X.0Tu.A05
            r0 = 36330157694271976(0x811216000041e8, double:3.0386762434360404E-306)
            r2 = r34
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x012e
            android.view.View r3 = r8.A02
            r0 = 8
            if (r10 == 0) goto L_0x011f
            r0 = 0
        L_0x011f:
            r3.setVisibility(r0)
            X.Oiv r2 = new X.Oiv
            r1 = r48
            r0 = r41
            r2.<init>(r13, r1, r4, r0)
            X.AnonymousClass0fU.A00(r2, r3)
        L_0x012e:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r0 = r36
            X.2eS.A04(r0, r2)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r8.A08
            X.7eB r3 = new X.7eB
            r0 = r48
            r3.<init>(r0)
            X.AnonymousClass0fU.A00(r3, r1)
            X.2eS.A04(r1, r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r9 = r8.A06
            X.2eS.A04(r9, r2)
            if (r10 != 0) goto L_0x034f
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x065c
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x017b
            X.7cr r0 = r7.A00
            if (r0 == 0) goto L_0x0167
            X.0qQ.A0B(r4, r11)
            r0 = 36320356579418462(0x81092c0008215e, double:3.0324779789367564E-306)
            r2 = r34
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x017b
        L_0x0167:
            r1 = 2131238851(0x7f081fc3, float:1.8093992E38)
            r0 = r36
            r0.setImageResource(r1)
            r0 = 2131974208(0x7f135840, float:1.9585474E38)
            java.lang.String r1 = r13.getString(r0)
            r0 = r36
            r0.setContentDescription(r1)
        L_0x017b:
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0184
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A09
            r0.setVisibility(r11)
        L_0x0184:
            r0 = r36
            r0.setVisibility(r11)
            r0 = r44
            r0.setVisibility(r6)
            r9.setVisibility(r6)
        L_0x0191:
            r0 = r37
            boolean r2 = r0.A0d
            if (r2 == 0) goto L_0x01b3
            if (r32 == 0) goto L_0x019d
            X.3QO r33 = r32.A1t()
        L_0x019d:
            X.3QO r1 = X.AnonymousClass3QO.HALLPASS
            r0 = r33
            if (r0 != r1) goto L_0x01aa
            boolean r0 = r42.A02()
            r1 = 1
            if (r0 != 0) goto L_0x01ab
        L_0x01aa:
            r1 = 0
        L_0x01ab:
            boolean r0 = r42.A01()
            if (r0 != 0) goto L_0x01b3
            if (r1 == 0) goto L_0x024a
        L_0x01b3:
            java.lang.String r9 = "comments"
            r3 = 0
            if (r2 == 0) goto L_0x0310
            if (r32 == 0) goto L_0x030d
            X.3QO r1 = r32.A1t()
        L_0x01be:
            X.3QO r0 = X.AnonymousClass3QO.HALLPASS
            if (r1 == r0) goto L_0x0310
            r0 = r42
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 36318247752439865(0x81074100261839, double:3.031144348263927E-306)
            r6 = r34
            boolean r0 = X.182.A06(r6, r10, r0)
            if (r0 == 0) goto L_0x0310
            r7 = 1
            X.0qQ.A0B(r4, r7)
            X.7eC r6 = new X.7eC
            r6.<init>(r12, r4, r9)
            if (r25 == 0) goto L_0x01e2
            X.1Xj r3 = r25.BPf()
        L_0x01e2:
            X.Aq3 r1 = new X.Aq3
            r9 = r38
            r0 = r37
            r1.<init>(r12, r0, r8, r9)
            java.lang.String r9 = "comment_composer_page"
            if (r3 == 0) goto L_0x0309
            X.AfF r12 = new X.AfF
            r12.<init>(r4, r3)
            X.7eJ r10 = new X.7eJ
            r0 = r24
            r10.<init>((X.AnonymousClass4D6) r0, (X.C336227eH) r12, (boolean) r7)
            X.Af5 r36 = new X.Af5
            r36.<init>()
            X.7eO r34 = new X.7eO
            r35 = r0
            r37 = r10
            r38 = r7
            r39 = r7
            r34.<init>(r35, r36, r37, r38, r39)
        L_0x020d:
            r0 = r24
            X.7eO r33 = X.C336317eQ.A00(r4, r0, r9)
            X.7eT r10 = new X.7eT
            r10.<init>()
            X.7eU r0 = new X.7eU
            r0.<init>(r4, r10)
            X.7eF r10 = new X.7eF
            r26 = r10
            r27 = r13
            r28 = r40
            r29 = r41
            r30 = r4
            r31 = r23
            r32 = r3
            r35 = r23
            r36 = r23
            r37 = r0
            r38 = r6
            r39 = r1
            r40 = r9
            r41 = r11
            r42 = r7
            r43 = r11
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
        L_0x0242:
            X.0qQ.A0A(r10)
            r0 = r45
            r0.setAdapter(r10)
        L_0x024a:
            android.view.View r3 = r8.A00
            r3.setVisibility(r11)
            X.0r1 r4 = r5.A0D
            boolean r0 = r4.A00
            r1 = 1
            if (r0 != 0) goto L_0x02d0
            android.view.View r0 = r8.A01
            if (r2 == 0) goto L_0x02ce
            r0.setVisibility(r11)
            android.content.Context r0 = r3.getContext()
            android.content.res.Resources r2 = r0.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r2 = X.0nA.A0B(r46)
            int r2 = r2 + r0
            r0 = r46
            X.0nA.A0d(r0, r2)
            android.content.Context r6 = r44.getContext()
            r0 = 2131100457(0x7f060329, float:1.7813296E38)
            android.content.res.ColorStateList r0 = X.02K.A02(r6, r0)
            if (r0 == 0) goto L_0x029c
            android.graphics.drawable.Drawable r3 = r44.getBackground()
            int r2 = r0.getDefaultColor()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r3.setColorFilter(r2, r0)
            r0 = 2131100791(0x7f060477, float:1.7813973E38)
            android.content.res.ColorStateList r2 = X.02K.A02(r6, r0)
            r0 = r44
            r0.setImageTintList(r2)
        L_0x029c:
            android.view.ViewGroup$LayoutParams r5 = r44.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.0qQ.A0C(r5, r0)
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r2.getDimensionPixelSize(r0)
            r5.setMarginEnd(r0)
            float r3 = r44.getY()
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131165278(0x7f07005e, float:1.7944769E38)
            int r0 = r2.getDimensionPixelSize(r0)
            float r0 = (float) r0
            float r3 = r3 + r0
            r0 = r44
            r0.setY(r3)
            r0.setLayoutParams(r5)
        L_0x02ce:
            r4.A00 = r1
        L_0x02d0:
            r0 = r47
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x02de
            if (r25 == 0) goto L_0x0307
            X.1Xj r0 = r25.BPf()
            if (r0 == 0) goto L_0x0307
        L_0x02de:
            r0 = r47
            r0.A00 = r1
            if (r25 == 0) goto L_0x0304
            X.1Xj r0 = r25.BPf()
            if (r0 == 0) goto L_0x0304
            r0 = r48
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0304
            X.1Xj r2 = r0.BPf()
            if (r2 == 0) goto L_0x0304
            r0 = r48
            X.05G r1 = r0.A0P
            X.7cn r0 = new X.7cn
            r0.<init>(r2)
            r1.Epw(r0)
        L_0x0304:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0307:
            r1 = 0
            goto L_0x02de
        L_0x0309:
            r34 = 0
            goto L_0x020d
        L_0x030d:
            r1 = r3
            goto L_0x01be
        L_0x0310:
            java.util.List r10 = r7.A08
            r7 = 1
            X.0qQ.A0B(r4, r7)
            X.7eC r6 = new X.7eC
            r6.<init>(r12, r4, r9)
            if (r25 == 0) goto L_0x034c
            X.1Xj r32 = r25.BPf()
        L_0x0321:
            X.7eE r3 = new X.7eE
            r1 = r38
            r0 = r37
            r3.<init>(r12, r0, r8, r1)
            java.lang.String r35 = "comment_composer_page"
            r26 = r13
            r27 = r40
            r28 = r41
            r29 = r24
            r30 = r4
            r31 = r23
            r33 = r6
            r34 = r3
            r36 = r10
            r37 = r7
            r38 = r7
            r39 = r2
            r40 = r11
            X.7eF r10 = X.C336207eF.A00(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x0242
        L_0x034c:
            r32 = r3
            goto L_0x0321
        L_0x034f:
            X.6o8 r0 = r7.A02
            r31 = r0
            if (r0 == 0) goto L_0x0594
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0594
            java.lang.Integer r1 = r31.A04()
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0586
            boolean r1 = X.C63282KuR.A00(r4)
            r0 = r31
            android.graphics.drawable.Drawable r0 = X.C320996tP.A00(r13, r4, r0, r11, r1)
            r9.setImageDrawable(r0)
        L_0x036e:
            if (r12 == 0) goto L_0x04d1
            r0 = 30
            X.9Kp r14 = new X.9Kp
            r14.<init>(r4, r0)
            java.lang.Class<X.7cR> r0 = X.C335127cR.class
            X.0Yh r10 = new X.0Yh
            r10.<init>(r0)
            r0 = 31
            X.9Kp r3 = new X.9Kp
            r3.<init>(r12, r0)
            r2 = 45
            X.9M0 r1 = new X.9M0
            r0 = r23
            r1.<init>(r2, r0, r12)
            X.2kA r30 = new X.2kA
            r0 = r30
            r0.<init>(r3, r14, r1, r10)
            java.lang.Object r29 = r30.getValue()
            r0 = r29
            X.7cR r0 = (X.C335127cR) r0
            r29 = r0
            java.lang.String r28 = r39.getSessionId()
            android.text.Editable r0 = r45.getText()
            java.lang.String r27 = r0.toString()
            r0 = r28
            X.0qQ.A0B(r0, r11)
            r1 = 2
            r0 = r27
            X.0qQ.A0B(r0, r1)
            r0 = r29
            X.7cT r14 = r0.A01
            X.7cU r0 = r14.A02
            X.26t r0 = r0.A01
            java.lang.String r10 = "COMMENTS"
            X.0xa r0 = r0.A00
            r35 = r0
            r0 = 682(0x2aa, float:9.56E-43)
            java.lang.String r26 = X.AnonymousClass000.A00(r0)
            r0 = r26
            java.lang.String r1 = X.002.A0R(r0, r10)
            r2 = 0
            r0 = r35
            long r17 = r0.getLong(r1, r2)
            long r0 = r14.A01
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x04fb
            r0 = r26
            java.lang.String r1 = X.002.A0R(r0, r10)
            r0 = r35
            long r0 = r0.getLong(r1, r2)
            X.0xY r14 = r35.AR4()
            r15 = r26
            java.lang.String r10 = X.002.A0R(r15, r10)
            r15 = 1
            long r0 = r0 + r15
            r14.E5c(r10, r0)
        L_0x03fa:
            r14.apply()
            r0 = r29
            X.7cV r1 = r0.A00
            r0 = r31
            java.lang.String r10 = r0.A0a
            X.0qQ.A07(r10)
            r0 = 10
            java.lang.Long r0 = X.00y.A0n(r0, r10)
            if (r0 == 0) goto L_0x04f7
            long r17 = r0.longValue()
        L_0x0414:
            r0 = r31
            java.lang.String r0 = r0.A0b
            r19 = r0
            java.lang.Integer r0 = r31.A04()
            java.lang.String r10 = X.C394159xd.A00(r0)
            java.lang.String r0 = "animation"
            boolean r0 = X.0qQ.A0K(r10, r0)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r0)
            java.lang.String r16 = "comment"
            X.0wc r10 = r1.A00
            r0 = 1515(0x5eb, float:2.123E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.0kJ r0 = r10.A00
            X.0Aj r10 = r10.A00(r0, r1)
            boolean r0 = r10.isSampled()
            if (r0 == 0) goto L_0x04bd
            X.9ZH r1 = new X.9ZH
            r1.<init>()
            java.lang.Long r15 = java.lang.Long.valueOf(r17)
            r0 = 346(0x15a, float:4.85E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A05(r0, r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0 = 3365(0xd25, float:4.715E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A05(r0, r2)
            r0 = 3434(0xd6a, float:4.812E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.A05(r0, r2)
            java.lang.String r0 = "result_size"
            r1.A05(r0, r2)
            r0 = 184(0xb8, float:2.58E-43)
            java.lang.String r2 = X.C273654mx.A00(r0)
            r0 = r16
            r1.A06(r2, r0)
            java.lang.String r2 = "composer_session_id"
            r0 = r28
            r1.A06(r2, r0)
            r0 = 193(0xc1, float:2.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A05(r0, r15)
            java.lang.String r2 = "sticker_template_name"
            r0 = r19
            r1.A06(r2, r0)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x04e8
            r0 = 539(0x21b, float:7.55E-43)
            java.lang.String r2 = X.C273654mx.A00(r0)
        L_0x04a2:
            java.lang.String r0 = "sticker_type"
            r1.A06(r0, r2)
            java.lang.String r2 = "input_text"
            r0 = r27
            r1.A06(r2, r0)
            java.lang.String r0 = "event_data"
            r10.AAK(r1, r0)
            java.lang.String r1 = "typeahead"
            java.lang.String r0 = "product"
            r10.AAJ(r0, r1)
            r10.Cgf()
        L_0x04bd:
            X.AOP r0 = new X.AOP
            r14 = r0
            r15 = r12
            r16 = r8
            r17 = r4
            r18 = r31
            r19 = r39
            r20 = r30
            r14.<init>(r15, r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r0, r9)
        L_0x04d1:
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            java.lang.String r0 = r13.getString(r0)
            r9.setContentDescription(r0)
            r9.setVisibility(r11)
            X.C334337b6.A03(r44)
            r0 = r36
            r0.setVisibility(r6)
            goto L_0x0191
        L_0x04e8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            boolean r0 = X.0qQ.A0K(r14, r0)
            if (r0 == 0) goto L_0x04f5
            java.lang.String r2 = "static"
            goto L_0x04a2
        L_0x04f5:
            r2 = 0
            goto L_0x04a2
        L_0x04f7:
            r17 = 0
            goto L_0x0414
        L_0x04fb:
            r0 = 1538(0x602, float:2.155E-42)
            java.lang.String r22 = X.AnonymousClass000.A00(r0)
            r0 = r22
            java.lang.String r1 = X.002.A0R(r0, r10)
            r0 = r35
            long r15 = r0.getLong(r1, r2)
            r20 = 1
            int r0 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0575
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.DAYS
            r0 = r20
            long r16 = r14.toMillis(r0)
        L_0x051b:
            long r18 = java.lang.System.currentTimeMillis()
            long r18 = r18 + r16
            X.0xY r15 = r35.AR4()
            r0 = r22
            java.lang.String r0 = X.002.A0R(r0, r10)
            r14 = r0
            r0 = r18
            r15.E5c(r14, r0)
            r15.apply()
            X.0xY r15 = r35.AR4()
            java.lang.String r0 = "key_suggested_sticker_cool_down_length"
            java.lang.String r14 = X.002.A0R(r0, r10)
            r0 = r16
            r15.E5c(r14, r0)
            r15.apply()
            X.0xY r1 = r35.AR4()
            r0 = r26
            java.lang.String r0 = X.002.A0R(r0, r10)
            r1.E5c(r0, r2)
            r1.apply()
            r0 = 681(0x2a9, float:9.54E-43)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r15, r10)
            r0 = r35
            long r0 = r0.getLong(r1, r2)
            long r0 = r0 + r20
            X.0xY r14 = r35.AR4()
            java.lang.String r10 = X.002.A0R(r15, r10)
            r14.E5c(r10, r0)
            goto L_0x03fa
        L_0x0575:
            java.lang.String r0 = "key_suggested_sticker_cool_down_length"
            java.lang.String r1 = X.002.A0R(r0, r10)
            r0 = r35
            long r16 = r0.getLong(r1, r2)
            long r0 = r14.A00
            long r16 = r16 * r0
            goto L_0x051b
        L_0x0586:
            r0 = r31
            com.instagram.common.typedurl.ImageUrl r1 = r0.A0H
            X.0qQ.A07(r1)
            r0 = r41
            r9.setUrl(r1, r0)
            goto L_0x036e
        L_0x0594:
            r16 = 1
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x065c
            r0 = 2131231608(0x7f080378, float:1.8079302E38)
            android.graphics.drawable.Drawable r2 = r13.getDrawable(r0)
            if (r2 == 0) goto L_0x05b5
            r0 = 2130970128(0x7f040610, float:1.7548957E38)
            int r0 = X.2Yu.A0H(r13, r0)
            int r0 = r13.getColor(r0)
            android.graphics.ColorFilter r0 = X.AnonymousClass37O.A00(r0)
            r2.setColorFilter(r0)
        L_0x05b5:
            r9.setImageDrawable(r2)
            if (r12 == 0) goto L_0x0645
            r0 = 23
            X.Ivp r14 = new X.Ivp
            r14.<init>(r4, r0)
            java.lang.Class<X.7cR> r0 = X.C335127cR.class
            X.0Yh r10 = new X.0Yh
            r10.<init>(r0)
            r0 = 24
            X.Ivp r3 = new X.Ivp
            r3.<init>(r12, r0)
            r15 = 22
            X.Ins r2 = new X.Ins
            r0 = r23
            r2.<init>(r15, r0, r12)
            X.2kA r17 = new X.2kA
            r0 = r17
            r0.<init>(r3, r14, r2, r10)
            r17.getValue()
            java.lang.String r2 = r39.getSessionId()
            X.0qQ.A0B(r4, r11)
            r0 = r16
            X.0qQ.A0B(r2, r0)
            X.7cV r0 = new X.7cV
            r0.<init>(r4)
            java.lang.String r16 = "comment"
            java.lang.String r15 = "surface"
            X.0wc r10 = r0.A00
            java.lang.String r3 = "contextual_recommendations_hint_impression"
            X.0kJ r0 = r10.A00
            X.0Aj r3 = r10.A00(r0, r3)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x062e
            java.lang.String r10 = "sticker_type"
            java.lang.String r0 = "GIPHY"
            X.0eP r14 = new X.0eP
            r14.<init>(r10, r0)
            java.lang.String r0 = "composer_session_id"
            X.0eP r10 = new X.0eP
            r10.<init>(r0, r2)
            X.0eP r2 = new X.0eP
            r0 = r16
            r2.<init>(r15, r0)
            X.0eP[] r0 = new X.0eP[]{r14, r10, r2}
            java.util.LinkedHashMap r2 = X.0Yt.A06(r0)
            java.lang.String r0 = "extra_client_data"
            r3.A9H(r0, r2)
            r3.Cgf()
        L_0x062e:
            r1.setVisibility(r6)
            X.AOM r0 = new X.AOM
            r26 = r0
            r27 = r12
            r28 = r8
            r29 = r4
            r30 = r39
            r31 = r17
            r26.<init>(r27, r28, r29, r30, r31)
            X.AnonymousClass0fU.A00(r0, r9)
        L_0x0645:
            r0 = 2131974725(0x7f135a45, float:1.9586522E38)
            java.lang.String r0 = r13.getString(r0)
            r9.setContentDescription(r0)
            r9.setVisibility(r11)
            X.C334337b6.A03(r44)
            r0 = r36
            r0.setVisibility(r6)
            goto L_0x0191
        L_0x065c:
            X.C334337b6.A03(r44)
            r0 = r36
            r0.setVisibility(r6)
            r1.setVisibility(r6)
            r9.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A09
            r0.setVisibility(r6)
            goto L_0x0191
        L_0x0671:
            r32 = r23
            goto L_0x00d6
        L_0x0675:
            com.instagram.common.typedurl.ImageUrl r10 = r17.Bh3()
            r1 = r0
            r0 = r41
            r1.setUrl(r10, r0)
            r1.setVisibility(r11)
            com.instagram.common.ui.widget.imageview.IgImageView r10 = r8.A0A
            r10.setVisibility(r6)
            goto L_0x008e
        L_0x0689:
            boolean r0 = r7 instanceof X.C381889ck
            if (r0 == 0) goto L_0x06d4
            android.content.Context r8 = r5.A01
            X.0qQ.A0A(r8)
            X.7b7 r4 = r5.A05
            X.9ck r7 = (X.C381889ck) r7
            int r3 = r7.A00
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A05
            r0.setVisibility(r6)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r4.A04
            r2 = 0
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A0A
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A07
            r0.setVisibility(r6)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.A09
            r0.setVisibility(r6)
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r4.A0B
            java.lang.String r0 = r8.getString(r3)
            r1.setHint(r0)
            r0 = 4
            r1.setTextAlignment(r0)
            r0 = 1
            r1.setGravity(r0)
            r1.setFocusable(r2)
            r1.setEnabled(r2)
            r0 = 0
            r1.setKeyListener(r0)
            android.view.View r0 = r4.A00
            r0.setVisibility(r2)
            goto L_0x0304
        L_0x06d4:
            boolean r0 = r7 instanceof X.C53497GpT
            if (r0 != 0) goto L_0x06de
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x06de:
            X.7b7 r0 = r5.A05
            android.view.View r0 = r0.A00
            X.0nA.A0N(r0)
            r0.setVisibility(r6)
            goto L_0x0304
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.view.fragment.CommentComposerBinder$createAndBindViewHolder$5$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
