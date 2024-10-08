package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public final class NIE extends C240383Kr implements AnonymousClass0iw, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "MessageActionsFragment";
    public float A00;
    public int A01;
    public C71870OsD A02;
    public AnonymousClass0eK A03;
    public int A04;
    public Context A05;
    public UserSession A06;
    public C74501Pvv A07;
    public C254783t2 A08;
    public C254743sy A09;
    public boolean A0A;
    public boolean A0B;
    public final List A0C = AnonymousClass7TE.A1C();
    public final Map A0D = new WeakHashMap();

    public final void A0M(int i) {
        17k.A0F(DbW.A1a(this.A02));
        this.A04 = i;
    }

    public final void A0N(C74501Pvv pvv) {
        17k.A0F(DbW.A1a(this.A02));
        this.A07 = pvv;
    }

    public final String getModuleName() {
        return "direct_message_actions_fragment";
    }

    public final boolean onBackPressed() {
        C71870OsD.A03(this.A02);
        return true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: SimplifyVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x02ce: MOVE  (r8v22 com.instagram.igds.components.bottomsheet.BottomSheetFragment) = 
          (r8v21 com.instagram.igds.components.bottomsheet.BottomSheetFragment)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.SimplifyVisitor.visit(SimplifyVisitor.java:71)
        */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            r39 = this;
            r38 = r39
            r0 = r38
            X.OsD r0 = r0.A02
            r1 = 2131436157(0x7f0b227d, float:1.8494176E38)
            r12 = r40
            android.view.View r1 = r12.requireViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A09 = r1
            r1 = 2131428888(0x7f0b0618, float:1.8479433E38)
            android.view.View r2 = r12.requireViewById(r1)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.A0B = r2
            X.PW2 r1 = new X.PW2
            r1.<init>(r0)
            X.0nA.A0r(r2, r1)
            int r2 = r0.A0M
            if (r2 == 0) goto L_0x002f
            android.widget.LinearLayout r1 = r0.A0B
            r1.setMinimumHeight(r2)
        L_0x002f:
            r1 = 2131439253(0x7f0b2e95, float:1.8500456E38)
            android.view.View r1 = r12.requireViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.A0A = r1
            r0.A04()
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r1 = r0.A0S
            boolean r2 = r1.A0S
            r8 = 1
            if (r2 == 0) goto L_0x0058
            com.instagram.common.session.UserSession r2 = r0.A0P
            r4 = 0
            X.0qQ.A0B(r2, r4)
            X.0xa r3 = X.AnonymousClass7TE.A0q(r2)
            java.lang.String r2 = "direct_reactions_super_react_nux_count"
            int r4 = r3.getInt(r2, r4)
            r3 = 2
            r2 = 1
            if (r4 < r3) goto L_0x0059
        L_0x0058:
            r2 = 0
        L_0x0059:
            r0.A0J = r2
            if (r2 != 0) goto L_0x0082
            boolean r2 = r1.A0Q
            if (r2 == 0) goto L_0x0082
            com.instagram.common.session.UserSession r5 = r0.A0P
            X.0Tu r4 = X.0Tu.A05
            r2 = 36324810460508546(0x810d3900083182, double:3.035294631272465E-306)
            boolean r2 = X.182.A06(r4, r5, r2)
            if (r2 == 0) goto L_0x0082
            r4 = 0
            X.0qQ.A0B(r5, r4)
            X.0xa r3 = X.AnonymousClass7TE.A0q(r5)
            java.lang.String r2 = "direct_reactions_customize_nux_count"
            int r4 = r3.getInt(r2, r4)
            r3 = 3
            r2 = 1
            if (r4 < r3) goto L_0x0083
        L_0x0082:
            r2 = 0
        L_0x0083:
            r0.A0K = r2
            com.instagram.common.session.UserSession r3 = r0.A0P
            r2 = 0
            X.0qQ.A0B(r3, r2)
            X.1Av r7 = X.1Au.A00(r3)
            X.0s0 r6 = r7.A11
            X.0YZ[] r5 = X.1Av.A8a
            r4 = 159(0x9f, float:2.23E-43)
            int r5 = X.DbY.A03(r7, r6, r5, r4)
            r4 = 3
            if (r5 >= r4) goto L_0x01f0
            X.0Tu r6 = X.0Tu.A05
            r4 = 36326657295988636(0x810ee70001379c, double:3.0364625774666836E-306)
            boolean r4 = X.182.A06(r6, r3, r4)
            if (r4 == 0) goto L_0x01f0
        L_0x00a9:
            r0.A0L = r8
            android.widget.FrameLayout r4 = r0.A0A
            android.content.Context r13 = r4.getContext()
            android.content.res.Resources r5 = r13.getResources()
            r4 = 2131165296(0x7f070070, float:1.7944805E38)
            int r6 = r5.getDimensionPixelSize(r4)
            android.widget.FrameLayout r8 = r0.A0A
            if (r8 == 0) goto L_0x0111
            boolean r4 = r0.A0J
            if (r4 != 0) goto L_0x00cc
            boolean r4 = r0.A0K
            if (r4 != 0) goto L_0x00cc
            boolean r4 = r0.A0L
            if (r4 == 0) goto L_0x0111
        L_0x00cc:
            X.0qq r5 = X.AnonymousClass0qo.A00(r13)
            X.0qm r4 = X.0qm.A12
            android.graphics.Typeface r14 = r5.A02(r4)
            int r7 = X.AnonymousClass7TG.A02(r13)
            boolean r5 = r0.A0J
            r4 = 2131960120(0x7f132138, float:1.95569E38)
            if (r5 == 0) goto L_0x00e4
            r4 = 2131960119(0x7f132137, float:1.9556898E38)
        L_0x00e4:
            java.lang.String r15 = r13.getString(r4)
            android.content.res.Resources r5 = r13.getResources()
            r4 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r17 = r5.getDimensionPixelSize(r4)
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            int r5 = r4.width
            int r4 = r7 * 2
            int r5 = r5 - r4
            r14.getClass()
            r16 = 1065353216(0x3f800000, float:1.0)
            r18 = r5
            int r5 = X.0mq.A01(r13, r14, r15, r16, r17, r18)
            android.content.res.Resources r4 = r13.getResources()
            int r4 = X.AnonymousClass7TE.A0H(r4)
            int r5 = r5 + r4
            int r6 = r6 + r5
        L_0x0111:
            r0.A03 = r6
            android.widget.FrameLayout r5 = r0.A09
            r4 = 39
            X.C71397Ojw.A00(r5, r4, r0)
            boolean r7 = r1.A0U
            if (r7 == 0) goto L_0x0217
            android.widget.FrameLayout r4 = r0.A09
            android.content.Context r15 = r4.getContext()
            android.content.res.Resources r6 = r15.getResources()
            android.graphics.Rect r9 = r1.A05
            r9.getClass()
            int r11 = r9.bottom
            r10 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r4 = r6.getDimensionPixelSize(r10)
            int r11 = r11 + r4
            int r13 = r0.A06
            int r4 = X.AnonymousClass7TF.A02(r15, r10)
            int r13 = r13 + r4
            r18 = 1
            if (r11 < r13) goto L_0x0215
            int r8 = r0.A0N
            r4 = 2131165203(0x7f070013, float:1.7944616E38)
            int r4 = r6.getDimensionPixelSize(r4)
            int r5 = r8 - r4
            int r4 = X.AnonymousClass7TE.A0C(r6)
            int r5 = r5 + r4
            java.util.List r4 = r1.A0L
            boolean r13 = r4.isEmpty()
            r6 = 0
            if (r13 != 0) goto L_0x01fb
            android.app.Activity r13 = r0.A0O
            r19 = r13
            X.0qq r14 = X.AnonymousClass0qo.A00(r19)
            X.0qm r13 = X.0qm.A12
            android.graphics.Typeface r20 = r14.A02(r13)
            java.lang.Object r13 = r4.get(r2)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r13 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r13
            java.lang.String r13 = r13.A04
            r16 = r13
            android.content.res.Resources r14 = r19.getResources()
            r13 = 2131165220(0x7f070024, float:1.794465E38)
            int r23 = r14.getDimensionPixelSize(r13)
            android.graphics.Point r13 = X.0nA.A0D(r19)
            int r13 = r13.x
            r20.getClass()
            r22 = 1065353216(0x3f800000, float:1.0)
            r21 = r16
            r24 = r13
            int r17 = X.0mq.A01(r19, r20, r21, r22, r23, r24)
            boolean r16 = X.C61670oa.A08()
            android.content.res.Resources r14 = r19.getResources()
            r13 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r16 == 0) goto L_0x01a1
            r13 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x01a1:
            int r13 = r14.getDimensionPixelOffset(r13)
            int r13 = r13 * 2
            int r17 = r17 + r13
            java.lang.Object r13 = r4.get(r2)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r13 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r13
            java.lang.String r13 = r13.A04
            r16 = r13
            android.content.res.Resources r14 = r19.getResources()
            r13 = 2131165573(0x7f070185, float:1.7945367E38)
            int r23 = r14.getDimensionPixelSize(r13)
            android.graphics.Point r13 = X.0nA.A0D(r19)
            int r13 = r13.x
            r21 = r16
            r24 = r13
            int r14 = X.0mq.A01(r19, r20, r21, r22, r23, r24)
            android.content.res.Resources r13 = r19.getResources()
            int r10 = r13.getDimensionPixelOffset(r10)
            int r10 = r10 * 2
            int r14 = r14 + r10
            java.util.Iterator r13 = r4.iterator()
        L_0x01db:
            boolean r10 = r13.hasNext()
            if (r10 == 0) goto L_0x01f3
            java.lang.Object r10 = r13.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r10 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r10
            X.NkG r10 = r10.A01
            boolean r10 = r10.A02
            if (r10 == 0) goto L_0x01db
            int r6 = r6 + 1
            goto L_0x01db
        L_0x01f0:
            r8 = 0
            goto L_0x00a9
        L_0x01f3:
            int r4 = X.DbT.A02(r4, r6)
            int r4 = r4 * r17
            int r6 = r6 * r14
            int r6 = r6 + r4
        L_0x01fb:
            int r10 = X.0nA.A07(r15)
            android.graphics.Point r4 = X.0nA.A0D(r15)
            int r13 = r4.y
            int r13 = r13 - r10
            if (r11 <= r5) goto L_0x020a
            r18 = 0
        L_0x020a:
            r4 = -1
            if (r8 == r4) goto L_0x0210
            if (r18 != 0) goto L_0x0210
            r11 = r5
        L_0x0210:
            int r4 = r11 + r6
            if (r4 > r13) goto L_0x0322
            r13 = r11
        L_0x0215:
            r0.A02 = r13
        L_0x0217:
            boolean r4 = r1.A0X
            if (r4 == 0) goto L_0x03a2
            X.OJm r4 = new X.OJm
            r4.<init>(r0)
            r0.A0D = r4
            android.widget.FrameLayout r4 = r0.A09
            r4.getClass()
            android.widget.FrameLayout r4 = r0.A0A
            r4.getClass()
            android.widget.FrameLayout r4 = r0.A09
            r37 = r4
            android.content.Context r6 = r37.getContext()
            int r4 = r1.A02
            r25 = r4
            int r4 = r1.A00
            r26 = r4
            X.OJm r4 = r0.A0D
            r20 = r4
            android.widget.FrameLayout r4 = r0.A0A
            r36 = r4
            android.graphics.PointF r4 = r1.A04
            r35 = r4
            java.util.List r4 = r1.A0N
            r23 = r4
            int r4 = r0.A05
            r27 = r4
            boolean r4 = r1.A0S
            r17 = r4
            boolean r4 = r0.A0J
            r16 = r4
            boolean r15 = r0.A0K
            boolean r14 = r0.A0L
            boolean r13 = r1.A0Q
            X.3sy r11 = r0.A0U
            boolean r10 = r1.A0W
            boolean r9 = r1.A0R
            java.util.List r8 = r1.A0M
            X.37D r5 = r0.A0V
            X.Ob8 r4 = new X.Ob8
            r18 = r0
            r19 = r3
            r21 = r11
            r22 = r5
            r24 = r8
            r28 = r17
            r29 = r16
            r30 = r15
            r31 = r14
            r32 = r13
            r33 = r10
            r34 = r9
            r13 = r4
            r14 = r6
            r15 = r35
            r16 = r37
            r17 = r36
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r0.A0F = r4
            android.app.Activity r10 = r0.A0O
            int r4 = X.2db.A01(r10)
            r0.A04 = r4
            android.view.Window r4 = r10.getWindow()
            r4.getClass()
            android.view.View r4 = r4.getDecorView()
            r0.A07 = r4
            int r5 = r0.A04
            int r4 = r0.A03
            int r5 = r5 + r4
            r0.A06 = r5
            X.0Tu r8 = X.0Tu.A05
            r4 = 36327791167486660(0x810fef00033ac4, double:3.037179642367768E-306)
            boolean r4 = X.182.A06(r8, r3, r4)
            if (r4 == 0) goto L_0x02e4
            int r9 = r0.A06
            boolean r4 = r10 instanceof com.instagram.direct.fragment.thread.bottomsheet.activity.DirectThreadBottomSheetModalActivity
            if (r4 == 0) goto L_0x0320
            com.instagram.base.activity.IgFragmentActivity r10 = (com.instagram.base.activity.IgFragmentActivity) r10
            X.37D r4 = r10.getBottomSheetNavigator()
            if (r4 == 0) goto L_0x0320
            androidx.fragment.app.Fragment r8 = r4.A09()
            boolean r4 = r8 instanceof com.instagram.igds.components.bottomsheet.BottomSheetFragment
            if (r4 == 0) goto L_0x0320
            com.instagram.igds.components.bottomsheet.BottomSheetFragment r8 = (com.instagram.igds.components.bottomsheet.BottomSheetFragment) r8
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r4 = r8.contentView
            if (r4 == 0) goto L_0x0320
            int r5 = r4.getTop()
            android.widget.ImageView r4 = r8.dragHandleView
            if (r4 == 0) goto L_0x02e1
            int r4 = r4.getHeight()
            int r5 = r5 + r4
        L_0x02e1:
            int r9 = r9 + r5
            r0.A06 = r9
        L_0x02e4:
            boolean r4 = r0.A0Z
            if (r4 != 0) goto L_0x02f8
            android.view.View r8 = r0.A07
            r5 = 4
            X.Olf r4 = new X.Olf
            r4.<init>(r5, r6, r0)
            X.AnonymousClass03j.A00(r8, r4)
            android.view.View r4 = r0.A07
            r4.requestApplyInsets()
        L_0x02f8:
            X.Ob8 r5 = r0.A0F
            boolean r4 = r1.A0W
            if (r4 == 0) goto L_0x031e
            android.content.res.Resources r4 = r6.getResources()
            int r4 = X.C71870OsD.A01(r4, r0)
            float r4 = (float) r4
            java.lang.Float r10 = java.lang.Float.valueOf(r4)
        L_0x030b:
            int r4 = X.C71870OsD.A00(r6, r0)
            float r9 = (float) r4
            X.OcD r6 = r5.A08
            java.lang.String r4 = "reactionsTrayController"
            if (r6 != 0) goto L_0x0354
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x031e:
            r10 = 0
            goto L_0x030b
        L_0x0320:
            r5 = 0
            goto L_0x02e1
        L_0x0322:
            android.app.Activity r4 = r0.A0O
            boolean r8 = X.C61670oa.A08()
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r8 == 0) goto L_0x0334
            r4 = 2131165213(0x7f07001d, float:1.7944637E38)
        L_0x0334:
            int r4 = r5.getDimensionPixelOffset(r4)
            int r10 = r6 - r4
            int r4 = r9.top
            int r4 = r4 + r10
            if (r13 >= r4) goto L_0x0351
            X.0Tu r8 = X.0Tu.A05
            r4 = 36325708108215457(0x810e0a000134a1, double:3.035862307296853E-306)
            boolean r4 = X.182.A06(r8, r3, r4)
            if (r4 == 0) goto L_0x0351
            int r13 = r9.top
            int r13 = r13 - r10
            goto L_0x0215
        L_0x0351:
            int r13 = r13 - r6
            goto L_0x0215
        L_0x0354:
            android.widget.FrameLayout r4 = r6.A0D
            android.widget.FrameLayout r8 = r5.A0N
            r8.addView(r4)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout r4 = r6.A06
            r5.A05 = r4
            X.C70140Nxu.A00(r4)
            r5.A0A = r10
            r5.A04(r10, r9)
            android.view.ViewGroup r6 = r5.A05
            if (r6 == 0) goto L_0x0374
            android.content.Context r4 = r5.A0I
            int r4 = X.AnonymousClass7TG.A03(r4)
            X.C71085Ob8.A01(r6, r5, r4)
        L_0x0374:
            X.5nL r4 = X.JTP.A0c(r8, r2)
            X.5nL r9 = r4.A0A()
            r9.A04 = r2
            java.lang.Float r4 = r5.A0A
            if (r4 == 0) goto L_0x04a5
            float r4 = r4.floatValue()
        L_0x0386:
            r8 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r9.A0U(r8, r6, r4)
            android.content.Context r4 = r5.A0I
            android.content.res.Resources r5 = r4.getResources()
            r4 = 2131165296(0x7f070070, float:1.7944805E38)
            float r4 = X.AnonymousClass7TE.A01(r5, r4)
            r9.A0V(r8, r6, r4)
            r9.A0M(r8, r6)
            r9.A0H()
        L_0x03a2:
            X.0eK r4 = r0.A0W
            if (r4 == 0) goto L_0x03d6
            if (r7 == 0) goto L_0x03d6
            java.lang.Object r9 = r4.get()
            android.view.View r9 = (android.view.View) r9
            r0.A08 = r9
            if (r9 == 0) goto L_0x03cc
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r8 = r4.topMargin
            r6 = -1
            android.app.Activity r4 = r0.A0O
            int r5 = X.0nA.A05(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r6, r5)
            r4.setMargins(r2, r8, r2, r2)
            r9.setLayoutParams(r4)
        L_0x03cc:
            android.widget.FrameLayout r5 = r0.A09
            X.PVz r4 = new X.PVz
            r4.<init>(r0)
            r5.post(r4)
        L_0x03d6:
            java.util.List r4 = r1.A0L
            boolean r4 = r4.isEmpty()
            r14 = 8
            if (r4 != 0) goto L_0x056f
            if (r7 == 0) goto L_0x04ad
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            r4 = 0
        L_0x03e7:
            java.util.List r8 = r1.A0L
            int r6 = r8.size()
            if (r4 >= r6) goto L_0x051a
            java.lang.Object r7 = r8.get(r4)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r7 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r7
            int r6 = X.C51966G9m.A06(r8)
            r20 = 0
            if (r4 != r6) goto L_0x049b
            r6 = r20
        L_0x03ff:
            java.lang.Integer r8 = r7.A02
            if (r8 != 0) goto L_0x0491
            r17 = r20
        L_0x0405:
            r9 = 5
            X.IVI r10 = new X.IVI
            r10.<init>((int) r9, (java.lang.Object) r0, (java.lang.Object) r7)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r8 = r7.A00
            if (r8 == 0) goto L_0x048e
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r8 = r7.A00
            java.lang.String r13 = r8.A01
            java.lang.String r8 = r7.A04
            int r8 = r8.indexOf(r13)
            if (r8 < 0) goto L_0x048e
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r11 = r7.A00
            int r11 = r11.A00
            int r24 = X.C51966G9m.A05(r13, r8)
            r25 = 17
            X.ULb r18 = new X.ULb
            r21 = r18
            r22 = r11
            r23 = r8
            r26 = r9
            r21.<init>(r22, r23, r24, r25, r26)
        L_0x0432:
            java.lang.String r11 = r7.A04
            r16 = 0
            r25 = 0
            if (r6 == 0) goto L_0x044c
            java.lang.Integer r9 = r7.A03
            java.lang.Integer r8 = X.AnonymousClass05K.A15
            if (r9 == r8) goto L_0x044a
            java.lang.Integer r8 = r6.A03
            java.lang.Integer r6 = X.AnonymousClass05K.A0u
            if (r8 == r6) goto L_0x044a
            java.lang.Integer r6 = X.AnonymousClass05K.A0I
            if (r8 != r6) goto L_0x044c
        L_0x044a:
            r25 = 1
        L_0x044c:
            X.NkG r6 = r7.A01
            java.lang.Integer r6 = r6.A00
            if (r6 == 0) goto L_0x0464
            android.app.Activity r8 = r0.A0O
            X.NkG r6 = r7.A01
            java.lang.Integer r6 = r6.A00
            int r6 = r6.intValue()
            int r6 = X.2Yu.A0H(r8, r6)
            java.lang.Integer r20 = java.lang.Integer.valueOf(r6)
        L_0x0464:
            X.NkG r6 = r7.A01
            boolean r8 = r6.A01
            boolean r7 = r6.A02
            r30 = 1
            boolean r6 = r6.A04
            X.8rI r15 = new X.8rI
            r22 = r2
            r23 = r2
            r24 = r2
            r26 = r2
            r27 = r2
            r28 = r8
            r29 = r7
            r31 = r6
            r19 = r10
            r21 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r5.add(r15)
            int r4 = r4 + 1
            goto L_0x03e7
        L_0x048e:
            r18 = r20
            goto L_0x0432
        L_0x0491:
            android.app.Activity r9 = r0.A0O
            java.lang.Integer r8 = r7.A02
            android.graphics.drawable.Drawable r17 = X.JTP.A0E(r9, r8)
            goto L_0x0405
        L_0x049b:
            int r6 = r4 + 1
            java.lang.Object r6 = r8.get(r6)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r6 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r6
            goto L_0x03ff
        L_0x04a5:
            android.graphics.PointF r4 = r5.A0J
            if (r4 == 0) goto L_0x0582
            float r4 = r4.x
            goto L_0x0386
        L_0x04ad:
            android.widget.LinearLayout r3 = r0.A0B
            r3.getClass()
            java.util.List r3 = r1.A0L
            java.util.Iterator r7 = r3.iterator()
        L_0x04b8:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x04e8
            java.lang.Object r6 = r7.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r6 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r6
            android.widget.FrameLayout r3 = r0.A09
            r3.getClass()
            android.view.LayoutInflater r5 = X.DbV.A0D(r3)
            r4 = 2131627806(0x7f0e0f1e, float:1.8882887E38)
            android.widget.LinearLayout r3 = r0.A0B
            android.view.View r4 = r5.inflate(r4, r3, r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.String r3 = r6.A04
            r4.setText(r3)
            r3 = 34
            X.C71408Ok7.A00(r4, r3, r6, r0)
            android.widget.LinearLayout r3 = r0.A0B
            r3.addView(r4)
            goto L_0x04b8
        L_0x04e8:
            android.widget.LinearLayout r3 = r0.A0B
            X.5nL r3 = X.JTP.A0c(r3, r2)
            X.5nL r5 = r3.A0A()
            android.widget.LinearLayout r3 = r0.A0B
            android.content.Context r3 = r3.getContext()
            int r3 = X.0nA.A05(r3)
            float r4 = (float) r3
            float r3 = r0.A00
            r5.A0T(r4, r3)
            r5.A04 = r2
            r5.A0H()
            X.Pvv r7 = r0.A0E
            if (r7 == 0) goto L_0x0574
            java.lang.String r6 = "bottom_bar"
            X.OMT r5 = r0.A0Q
            X.3sy r4 = r0.A0U
            java.util.List r3 = r1.A0L
            r5.A01(r1, r4, r6, r3)
            r7.Cyt()
            goto L_0x0574
        L_0x051a:
            android.app.Activity r7 = r0.A0O
            boolean r6 = r1.A0T
            r4 = 0
            X.8Ov r7 = X.C66581MXm.A0c(r7, r3, r4, r5, r6)
            r7.setFocusable(r2)
            X.OlE r3 = new X.OlE
            r3.<init>(r0)
            r7.setOnDismissListener(r3)
            r3 = 2132017164(0x7f14000c, float:1.9672599E38)
            r7.setAnimationStyle(r3)
            android.view.View r3 = r7.getContentView()
            if (r3 == 0) goto L_0x056d
            android.content.res.Resources r3 = r3.getResources()
            int r3 = X.C71870OsD.A01(r3, r0)
            r0.A01 = r3
            boolean r3 = r1.A0Y
            if (r3 == 0) goto L_0x054d
            java.lang.String r4 = r1.A0E
            r3 = 1
            if (r4 == 0) goto L_0x054e
        L_0x054d:
            r3 = 0
        L_0x054e:
            boolean r3 = X.C66581MXm.A1a(r3)
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r3 == 0) goto L_0x055a
            r4 = 8388613(0x800005, float:1.175495E-38)
        L_0x055a:
            X.PbJ r3 = new X.PbJ
            r3.<init>(r12, r0, r7, r4)
            r12.post(r3)
            java.lang.String r6 = "context_menu"
            X.OMT r5 = r0.A0Q
            X.3sy r4 = r0.A0U
            java.util.List r3 = r1.A0L
            r5.A01(r1, r4, r6, r3)
        L_0x056d:
            r0.A0C = r7
        L_0x056f:
            android.widget.LinearLayout r1 = r0.A0B
            r1.setVisibility(r14)
        L_0x0574:
            r0.A0G = r2
            r0 = r38
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x0581
            r0 = r38
            r0.A02(r12)
        L_0x0581:
            return
        L_0x0582:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIE.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static NIE A01(UserSession userSession, MessageActionsViewModel messageActionsViewModel, C254783t2 r4, C254743sy r5, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("MESSAGE_ACTIONS_VIEW_MODEL_KEY", messageActionsViewModel);
        A0a.putInt("THEME_OVERRIDE_KEY", i);
        if (r5 != null) {
            C67002Mga.A01(A0a, r5, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        }
        A0a.putBoolean("IS_GROUP", z);
        A0a.putBoolean("IS_MIXED_VANISH_MODE", z2);
        A0a.putBoolean("IS_IN_SHH_MODE", z3);
        A0a.putBoolean("IS_MIXED_VANISH_MODE_ELIGIBLE", z4);
        if (r4 != null) {
            AnonymousClass9H0.A02(A0a, r4, AnonymousClass000.A00(906));
        }
        AnonymousClass0Dg.A00(A0a, userSession);
        NIE nie = new NIE();
        nie.setArguments(A0a);
        return nie;
    }

    private void A02(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != view) {
                    C66580MXl.A1T(childAt, this.A0D, childAt.getImportantForAccessibility());
                    childAt.setImportantForAccessibility(4);
                }
            }
        }
        Fragment fragment = this.mParentFragment;
        if ((fragment == null || parent != fragment.mView) && (parent instanceof View)) {
            A02((View) parent);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        NIE.super.onConfigurationChanged(configuration);
        C71870OsD osD = this.A02;
        FrameLayout frameLayout = osD.A0A;
        if (frameLayout != null) {
            ViewTreeObserver viewTreeObserver = frameLayout.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new C71448Okn(3, osD, viewTreeObserver));
        }
        C71085Ob8 ob8 = osD.A0F;
        if (ob8 != null) {
            0qQ.A0B(configuration, 0);
            C71091OcD ocD = ob8.A08;
            if (ocD == null) {
                0qQ.A0F("reactionsTrayController");
                throw AnonymousClass00P.createAndThrow();
            }
            ViewTreeObserver viewTreeObserver2 = ocD.A0D.getViewTreeObserver();
            viewTreeObserver2.addOnGlobalLayoutListener(new C71448Okn(4, viewTreeObserver2, ocD));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00db, code lost:
        if (r4.isTouchExplorationEnabled() != false) goto L_0x00de;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r34) {
        /*
            r33 = this;
            r0 = -192098782(0xfffffffff48cce22, float:-8.92459E31)
            int r8 = X.AnonymousClass0fD.A02(r0)
            r9 = r33
            r0 = r34
            X.NIE.super.onCreate(r0)
            r1 = 2132017946(0x7f14031a, float:1.9674185E38)
            r0 = 1
            r9.A09(r0, r1)
            android.os.Bundle r2 = r9.requireArguments()
            java.lang.String r0 = "MESSAGE_ACTIONS_VIEW_MODEL_KEY"
            android.os.Parcelable r7 = r2.getParcelable(r0)
            r7.getClass()
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r7 = (com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel) r7
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r9)
            r9.A06 = r0
            java.lang.String r0 = "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY"
            X.3sy r0 = X.C67002Mga.A00(r2, r0)
            r9.A09 = r0
            java.lang.String r0 = "IS_GROUP"
            boolean r0 = r2.getBoolean(r0)
            r9.A0A = r0
            r0 = 906(0x38a, float:1.27E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3t2 r0 = X.AnonymousClass9H0.A00(r2, r0)
            r9.A08 = r0
            java.lang.String r0 = "IS_MIXED_VANISH_MODE"
            boolean r30 = r2.getBoolean(r0)
            java.lang.String r0 = "IS_IN_SHH_MODE"
            boolean r31 = r2.getBoolean(r0)
            java.lang.String r0 = "IS_MIXED_VANISH_MODE_ELIGIBLE"
            boolean r32 = r2.getBoolean(r0)
            r1 = 0
            if (r31 == 0) goto L_0x00ef
            r6 = 2132017528(0x7f140178, float:1.9673337E38)
        L_0x005e:
            android.content.Context r1 = r9.requireContext()
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r1, r6)
        L_0x0067:
            r9.A05 = r0
            androidx.fragment.app.FragmentActivity r16 = r9.requireActivity()
            com.instagram.common.session.UserSession r14 = r9.A06
            X.Pvv r13 = r9.A07
            X.0eK r12 = r9.A03
            float r10 = r9.A00
            int r5 = r9.A04
            X.3sy r4 = r9.A09
            boolean r3 = r9.A0A
            X.3t2 r2 = r9.A08
            int r1 = r9.A01
            androidx.fragment.app.FragmentActivity r11 = r9.getActivity()
            if (r11 == 0) goto L_0x00ec
            boolean r0 = r11 instanceof X.C74317Pst
            if (r0 == 0) goto L_0x00e7
            X.Pst r11 = (X.C74317Pst) r11
            X.37D r23 = r11.AhO()
        L_0x008f:
            X.O7d r0 = new X.O7d
            r0.<init>(r9)
            X.OsD r15 = new X.OsD
            r28 = r1
            r29 = r3
            r25 = r10
            r26 = r5
            r27 = r6
            r22 = r4
            r24 = r12
            r20 = r7
            r21 = r2
            r18 = r0
            r19 = r13
            r17 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r9.A02 = r15
            android.content.Context r1 = r9.requireContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            com.instagram.common.session.UserSession r3 = r9.A06
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311062270181804(0x8100b8000801ac, double:3.0266002203503145E-306)
            boolean r0 = X.DbY.A1Y(r2, r3, r0)
            if (r0 == 0) goto L_0x00dd
            if (r4 == 0) goto L_0x00dd
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x00dd
            boolean r1 = r4.isTouchExplorationEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x00de
        L_0x00dd:
            r0 = 0
        L_0x00de:
            r9.A0B = r0
            r0 = 381926265(0x16c3bb79, float:3.162226E-25)
            X.AnonymousClass0fD.A09(r0, r8)
            return
        L_0x00e7:
            X.37D r23 = X.DbT.A0i(r11)
            goto L_0x008f
        L_0x00ec:
            r23 = 0
            goto L_0x008f
        L_0x00ef:
            java.lang.String r0 = "THEME_OVERRIDE_KEY"
            int r6 = r2.getInt(r0, r1)
            if (r6 != 0) goto L_0x005e
            android.content.Context r0 = r9.requireContext()
            goto L_0x0067
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIE.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(339160014);
        C71870OsD osD = this.A02;
        LayoutInflater from = LayoutInflater.from(this.A05);
        int i = osD.A0S.A01;
        if (i != 0) {
            from = from.cloneInContext(new ContextThemeWrapper(osD.A0O, i));
        }
        View A0C2 = DbT.A0C(from, viewGroup, R.layout.fragment_message_actions);
        AnonymousClass0fD.A09(-1208236154, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1140122601);
        NIE.super.onDestroyView();
        if (this.A0B) {
            Map map = this.A0D;
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                View A0H = JTO.A0H(A16);
                A0H.setImportantForAccessibility(AnonymousClass7TE.A0M(map.get(A0H)));
            }
            map.clear();
        }
        AnonymousClass0fD.A09(-2063344825, A022);
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(-1179150294);
        NIE.super.onDetach();
        C71870OsD osD = this.A02;
        PopupWindow popupWindow = osD.A0C;
        if (popupWindow != null) {
            popupWindow.dismiss();
            osD.A0C = null;
        }
        List<C70442O6t> list = this.A0C;
        for (C70442O6t o6t : list) {
            AnonymousClass9H7.A01(o6t.A00).A0Q();
        }
        list.clear();
        AnonymousClass0fD.A09(539613291, A022);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        NIE.super.onDismiss(dialogInterface);
        C74501Pvv pvv = this.A02.A0E;
        if (pvv != null) {
            pvv.D9d();
        }
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-542306383);
        NIE.super.onPause();
        C71870OsD osD = this.A02;
        View view = osD.A07;
        if (view != null && !osD.A0Z) {
            AnonymousClass03j.A00(view, (AnonymousClass03Q) null);
        }
        osD.A0I = true;
        AnonymousClass0fD.A09(-1927967686, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(537944983);
        NIE.super.onResume();
        this.A02.A0I = false;
        AnonymousClass0fD.A09(-214948047, A022);
    }
}
