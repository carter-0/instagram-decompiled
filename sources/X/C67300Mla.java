package X;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mla  reason: case insensitive filesystem */
public abstract class C67300Mla {
    public static Animator.AnimatorListener A00;
    public static C226462gr A01;

    public static final View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, UserSession userSession) {
        View inflate;
        AnonymousClass7TF.A1B(layoutInflater, 0, userSession);
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36328285088791744L)) {
            inflate = 2Su.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.search_row_redesign);
        } else {
            inflate = layoutInflater.inflate(R.layout.search_row_redesign, viewGroup, false);
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        C67301Mlb mlb = new C67301Mlb(inflate);
        inflate.setTag(mlb);
        Resources A05 = DbU.A05(mlb.A05);
        0qQ.A07(A05);
        C67302Mlc.A00(A05, C66582MXn.A05(r4, userSession, 36330088974860737L));
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r13 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0064, code lost:
        if (r13 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r13 = r3.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(com.instagram.common.session.UserSession r13, X.C273634mu r14, X.C67301Mlb r15, X.C66890MeV r16) {
        /*
            r11 = 0
            r9 = r15
            X.AnonymousClass7TF.A1H(r15, r14)
            r5 = 2
            r4 = 3
            r3 = r16
            X.0qQ.A0B(r3, r5)
            r8 = r13
            X.0qQ.A0B(r13, r4)
            boolean r0 = r3.A08
            r7 = 8
            if (r0 == 0) goto L_0x00fb
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x00e3
            android.widget.ImageView r1 = r15.A05
            r0 = 66
            X.C71396Ojv.A00(r1, r0, r14)
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            r1.setImageResource(r0)
            r0 = 1062668861(0x3f570a3d, float:0.84)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
            boolean r12 = r3.A07
            if (r12 != 0) goto L_0x0038
            boolean r13 = r3.A09
            if (r13 == 0) goto L_0x003f
        L_0x0038:
            boolean r13 = r3.A09
            int r10 = r3.A02
            A02(r8, r9, r10, r11, r12, r13)
        L_0x003f:
            android.content.Context r2 = r1.getContext()
            r0 = 2131966398(0x7f1339be, float:1.9569633E38)
            X.DbU.A12(r2, r1, r0)
            android.content.res.Resources r2 = r1.getResources()
            if (r12 != 0) goto L_0x0054
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r13 == 0) goto L_0x0056
        L_0x0054:
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x0056:
            int r0 = X.DbS.A03(r2, r0)
            X.0nA.A0d(r1, r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = r15.A07
            if (r12 != 0) goto L_0x0066
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            if (r13 == 0) goto L_0x0069
        L_0x0066:
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
        L_0x0069:
            int r0 = X.DbS.A03(r2, r0)
            X.0nA.A0d(r1, r0)
            boolean r0 = r3.A0A
            if (r0 == 0) goto L_0x00a8
            android.widget.ImageView r2 = r15.A04
            int r0 = r2.getVisibility()
            if (r0 == 0) goto L_0x007f
            r14.DS0()
        L_0x007f:
            r2.setVisibility(r11)
            r0 = 65
            X.C71396Ojv.A00(r2, r0, r14)
            r0 = 2131237939(0x7f081c33, float:1.8092143E38)
            r2.setImageResource(r0)
            android.content.Context r6 = r2.getContext()
            boolean r0 = X.AnonymousClass3HA.A00(r6)
            if (r0 != 0) goto L_0x00d8
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C66581MXm.A1C(r2, r0)
        L_0x009c:
            r1 = 24
            r0 = 4
            r2.setPadding(r0, r0, r1, r0)
            r0 = 2131966409(0x7f1339c9, float:1.9569655E38)
        L_0x00a5:
            X.DbU.A12(r6, r2, r0)
        L_0x00a8:
            java.util.List r1 = r3.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0101
            java.util.ArrayList r8 = X.C51970G9q.A0m(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x00b8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0113
            java.lang.Object r1 = r2.next()
            X.HsR r1 = (X.C56078HsR) r1
            android.widget.EditText r0 = r15.A02
            android.content.res.Resources r0 = r0.getResources()
            X.0qQ.A07(r0)
            X.0qQ.A0A(r1)
            java.lang.String r0 = X.C56259HvT.A00(r0, r1)
            r8.add(r0)
            goto L_0x00b8
        L_0x00d8:
            r0 = 2130970271(0x7f04069f, float:1.7549247E38)
            int r0 = X.2Yu.A0H(r6, r0)
            X.DbU.A14(r6, r2, r0)
            goto L_0x009c
        L_0x00e3:
            android.widget.ImageView r2 = r15.A04
            r2.setVisibility(r11)
            r0 = 67
            X.C71396Ojv.A00(r2, r0, r14)
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            r2.setImageResource(r0)
            android.content.Context r6 = r2.getContext()
            r0 = 2131966398(0x7f1339be, float:1.9569633E38)
            goto L_0x00a5
        L_0x00fb:
            android.widget.ImageView r0 = r15.A04
            r0.setVisibility(r7)
            goto L_0x00a8
        L_0x0101:
            android.widget.EditText r6 = r15.A02
            int r0 = r3.A01
            r6.setHint(r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r1 = r15.A07
            X.0sn r0 = X.0sn.A00
            r1.setHints(r0)
            r1.A04()
            goto L_0x0122
        L_0x0113:
            android.widget.EditText r6 = r15.A02
            r0 = 0
            r6.setHint(r0)
            com.instagram.ui.widget.edittext.AnimatedHintsTextLayout r2 = r15.A07
            r2.setHints(r8)
            r0 = 3000(0xbb8, double:1.482E-320)
            r2.A03 = r0
        L_0x0122:
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.2eS.A04(r6, r2)
            android.view.View r6 = r15.A00
            r0 = 68
            X.C71396Ojv.A00(r6, r0, r14)
            java.lang.Integer r1 = r3.A03
            if (r1 != r2) goto L_0x0184
            android.widget.ImageView r0 = r15.A03
            r0.setVisibility(r7)
            android.widget.TextView r2 = r15.A06
            r2.setVisibility(r11)
            android.content.Context r1 = r2.getContext()
            int r0 = r3.A00
            X.DbT.A18(r1, r2, r0)
            r0 = 33
            X.C71409Ok8.A01(r2, r0, r3, r14)
            r14.DFX(r2)
        L_0x014d:
            java.lang.Integer r1 = r3.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0166
            android.content.Context r2 = r6.getContext()
            int r0 = X.2Yu.A02(r2)
            X.DbT.A16(r2, r6, r0)
            android.view.View r1 = r15.A01
            r0 = 2131231726(0x7f0803ee, float:1.8079541E38)
            X.DbU.A11(r2, r1, r0)
        L_0x0166:
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x0180
            android.view.View r2 = r15.A01
            android.content.Context r1 = r6.getContext()
            r0 = 2130970376(0x7f040708, float:1.754946E38)
            int r0 = X.2Yu.A0G(r1, r0)
            X.0nA.A0V(r2, r0)
            r0 = 2131231724(0x7f0803ec, float:1.8079537E38)
            X.DbU.A11(r1, r2, r0)
        L_0x0180:
            r14.Dhs(r6, r15)
            return
        L_0x0184:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            android.widget.ImageView r2 = r15.A03
            if (r1 == r0) goto L_0x01cc
            r2.setVisibility(r11)
            r0 = 34
            X.C71409Ok8.A01(r2, r0, r3, r14)
            int r0 = r1.intValue()
            if (r0 == r11) goto L_0x01be
            if (r0 == r4) goto L_0x01b0
            if (r0 != r5) goto L_0x014d
            r14.DFX(r2)
            r0 = 2131238798(0x7f081f8e, float:1.8093885E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131962420(0x7f132a34, float:1.9561565E38)
        L_0x01ac:
            X.DbU.A12(r1, r2, r0)
            goto L_0x014d
        L_0x01b0:
            r0 = 2131238590(0x7f081ebe, float:1.8093463E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131952258(0x7f130282, float:1.9540954E38)
            goto L_0x01ac
        L_0x01be:
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            r2.setImageResource(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131954541(0x7f130b6d, float:1.9545584E38)
            goto L_0x01ac
        L_0x01cc:
            r2.setVisibility(r7)
            goto L_0x014d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67300Mla.A01(com.instagram.common.session.UserSession, X.4mu, X.Mlb, X.MeV):void");
    }

    public static final void A02(UserSession userSession, C67301Mlb mlb, int i, boolean z, boolean z2, boolean z3) {
        ImageView imageView;
        C226472gs r5;
        0qQ.A0B(userSession, 5);
        if (mlb != null && (imageView = mlb.A05) != null) {
            imageView.setScaleX(2.0f);
            imageView.setScaleY(2.0f);
            C226462gr r1 = A01;
            if (r1 != null && r1.isPlaying()) {
                r1.stop();
            }
            if (z2 && (A01 == null || z)) {
                Context context = imageView.getContext();
                0Tu r4 = 0Tu.A05;
                boolean A06 = 182.A06(r4, userSession, 36330088974860737L);
                int i2 = R.drawable.meta_ai_animations_conversion_kf_mai_24dp_flip_28px;
                if (A06) {
                    i2 = R.drawable.gen_ai_assets_meta_ai_fast_wink_fade_twist_fade_twist_thick_kf_28dp;
                }
                C226462gr r2 = (C226462gr) context.getDrawable(i2);
                A01 = r2;
                imageView.setImageDrawable(r2);
                if (z3) {
                    C226462gr r22 = (C226462gr) context.getDrawable(C66582MXn.A05(r4, userSession, 36330088974860737L));
                    0qQ.A07(r22);
                    r22.setVisible(true, true);
                    C226462gr r12 = A01;
                    if (r12 != null) {
                        Animator.AnimatorListener animatorListener = A00;
                        if (animatorListener == null) {
                            animatorListener = new C66984MgI(r22, mlb, i);
                            A00 = animatorListener;
                        }
                        r12.A8s(animatorListener);
                    }
                }
                r5 = A01;
                if (r5 == null) {
                    return;
                }
            } else if (z3) {
                r5 = (C226472gs) imageView.getContext().getDrawable(C66582MXn.A05(0Tu.A05, userSession, 36330088974860737L));
                0qQ.A07(r5);
                long j = (long) i;
                imageView.setImageDrawable(r5);
                if (j > 0) {
                    r5.EFJ((int) j);
                } else {
                    r5.EFK();
                }
            } else {
                return;
            }
            r5.E2p();
        }
    }
}
