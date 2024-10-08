package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.HrG  reason: case insensitive filesystem */
public final class C56008HrG {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public final View A03;
    public final LinearLayout A04;
    public final LinearLayout A05;
    public final IgTextView A06;
    public final TouchInterceptorFrameLayout A07;
    public final C253993rl A08;
    public final AnonymousClass4EA A09;
    public final RoundedCornerConstraintLayout A0A;
    public final C52874Ge8[] A0B;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.Ge8[]} */
    /* JADX WARNING: type inference failed for: r5v2, types: [android.widget.LinearLayout, android.view.View, X.Ge8, android.view.ViewGroup] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C56008HrG(android.content.Context r43, android.view.View r44, X.C231672s5 r45) {
        /*
            r42 = this;
            r4 = r42
            r4.<init>()
            r0 = 0
            r4.A02 = r0
            r4.A00 = r0
            r4.A01 = r0
            r9 = r44
            r0 = r9
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r4.A07 = r0
            r0 = 2131437546(0x7f0b27ea, float:1.8496994E38)
            android.view.View r0 = r9.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.A05 = r0
            r0 = 2131435895(0x7f0b2177, float:1.8493645E38)
            android.view.View r0 = r9.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout) r0
            r4.A0A = r0
            r0 = 2131427594(0x7f0b010a, float:1.8476809E38)
            android.view.View r0 = r9.requireViewById(r0)
            r4.A03 = r0
            r0 = 2131442370(0x7f0b3ac2, float:1.8506778E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r9, r0)
            r4.A06 = r0
            r0 = 2131435928(0x7f0b2198, float:1.8493712E38)
            android.view.View r2 = r9.requireViewById(r0)
            android.content.Context r1 = r2.getContext()
            r3 = r43
            int r0 = X.2Yu.A0C(r3)
            X.DbT.A16(r1, r2, r0)
            X.3rl r0 = X.AnonymousClass476.A00(r2)
            r4.A08 = r0
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 2131435926(0x7f0b2196, float:1.8493708E38)
            android.view.View r7 = r9.requireViewById(r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r7 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r7
            r0 = 2131440201(0x7f0b3249, float:1.8502379E38)
            android.view.View r6 = r9.requireViewById(r0)
            com.instagram.feed.widget.IgProgressImageView r6 = (com.instagram.feed.widget.IgProgressImageView) r6
            r0 = 2131435432(0x7f0b1fa8, float:1.8492706E38)
            android.view.View r5 = r9.requireViewById(r0)
            com.instagram.ui.mediaactions.LikeActionView r5 = (com.instagram.ui.mediaactions.LikeActionView) r5
            r0 = 2131440180(0x7f0b3234, float:1.8502336E38)
            android.view.View r1 = r9.requireViewById(r0)
            com.instagram.ui.mediaactions.MediaActionsView r1 = (com.instagram.ui.mediaactions.MediaActionsView) r1
            r0 = 2131428271(0x7f0b03af, float:1.8478182E38)
            android.view.ViewStub r0 = X.DbU.A0D(r9, r0)
            X.3TS r12 = new X.3TS
            r12.<init>((android.view.ViewStub) r0)
            r0 = 2131436016(0x7f0b21f0, float:1.849389E38)
            android.view.ViewStub r0 = X.DbS.A0F(r9, r0)
            r2 = 0
            X.3v4 r15 = new X.3v4
            r15.<init>(r0, r2)
            r0 = 2131435899(0x7f0b217b, float:1.8493653E38)
            android.view.ViewStub r0 = X.DbS.A0F(r9, r0)
            X.3v7 r29 = X.C256013v5.A00(r0)
            r10 = 0
            r0 = 3
            X.C51974G9v.A0d(r0, r7, r6, r5, r1)
            X.4EA r8 = new X.4EA
            r11 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r19 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r10
            r24 = r10
            r25 = r10
            r26 = r10
            r27 = r10
            r28 = r10
            r30 = r6
            r31 = r10
            r32 = r10
            r33 = r10
            r34 = r10
            r35 = r10
            r36 = r10
            r37 = r10
            r38 = r10
            r39 = r5
            r40 = r1
            r41 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r4.A09 = r8
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r8.A0T
            r0.setTag(r4)
            com.instagram.feed.widget.IgProgressImageView r1 = r8.A0N
            r0 = r45
            r1.setPostProcessor(r0)
            r1.A05()
            X.3gz r0 = new X.3gz
            r0.<init>()
            r1.setProgressiveImageConfig(r0)
            r0 = 2131427593(0x7f0b0109, float:1.8476807E38)
            android.view.View r0 = r9.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.A04 = r0
            r0 = 4
            X.Ge8[] r0 = new X.C52874Ge8[r0]
            r4.A0B = r0
            r7 = 0
        L_0x0108:
            X.Ge8[] r6 = r4.A0B
            int r0 = r6.length
            if (r7 >= r0) goto L_0x0137
            r0 = 1
            X.0qQ.A0B(r3, r0)
            X.Ge8 r5 = new X.Ge8
            r5.<init>(r3, r10, r2)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r3)
            r0 = 2131625929(0x7f0e07c9, float:1.887908E38)
            r1.inflate(r0, r5)
            r0 = 2131429312(0x7f0b07c0, float:1.8480293E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r5, r0)
            r5.A00 = r0
            r6[r7] = r5
            android.widget.LinearLayout r1 = r4.A04
            X.Ge8[] r0 = r4.A0B
            r0 = r0[r7]
            r1.addView(r0)
            int r7 = r7 + 1
            goto L_0x0108
        L_0x0137:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56008HrG.<init>(android.content.Context, android.view.View, X.2s5):void");
    }

    public final float A00() {
        float f = this.A01;
        if (f != 0.0f) {
            return f;
        }
        LinearLayout linearLayout = this.A04;
        float A032 = AnonymousClass7TE.A03(linearLayout.getChildAt(1)) * 2.5f;
        float f2 = this.A00;
        if (f2 == 0.0f) {
            View childAt = linearLayout.getChildAt(0);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.getClass();
            f2 = AnonymousClass7TE.A03(childAt) + ((float) ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
            this.A00 = f2;
        }
        float f3 = A032 + f2;
        this.A01 = f3;
        return f3;
    }
}
