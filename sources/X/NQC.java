package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NQC extends C232232tF {
    public final UserSession A00;
    public final C72369P3i A01;
    public final NJF A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68053MzK(DbT.A0D(layoutInflater, viewGroup, R.layout.friend_map_floaty_cluster_item, false), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0155, code lost:
        if (r7.length() == 0) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0210, code lost:
        if (X.0mp.A00(r7) <= 3) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r20, X.C249703kE r21) {
        /*
            r19 = this;
            r3 = r21
            r9 = r20
            X.N5o r9 = (X.C68199N5o) r9
            X.MzK r3 = (X.C68053MzK) r3
            r2 = 0
            boolean r10 = X.AnonymousClass7TF.A1U(r2, r9, r3)
            android.view.View r0 = r3.itemView
            r0.setTag(r3)
            androidx.constraintlayout.widget.ConstraintLayout r8 = r3.A03
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            if (r4 == 0) goto L_0x023e
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r1 = r9.A00
            int r0 = r9.A01
            r4.setMargins(r1, r0, r2, r2)
            r8.setLayoutParams(r4)
            float r11 = r3.A01
            android.view.ViewPropertyAnimator r12 = r8.animate()
            r6 = 2000(0x7d0, double:9.88E-321)
            X.2SQ r13 = X.2SP.A00
            r0 = 1000(0x3e8, double:4.94E-321)
            X.5F4 r14 = new X.5F4
            r14.<init>(r0, r6)
            X.0qQ.A0B(r13, r2)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0233
            long r4 = r14.A01
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r17 = 1
            int r15 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            long r0 = r14.A00
            if (r15 >= 0) goto L_0x0083
            long r4 = r4 + r17
            long r0 = r13.A09(r0, r4)
        L_0x0055:
            android.view.ViewPropertyAnimator r1 = r12.setStartDelay(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r11 / r0
            android.view.ViewPropertyAnimator r0 = r1.translationX(r0)
            android.view.ViewPropertyAnimator r1 = r0.setDuration(r6)
            X.PZR r0 = new X.PZR
            r0.<init>(r3, r11)
            r1.withEndAction(r0)
            X.NQC r1 = r3.A08
            X.NJF r0 = r1.A02
            android.view.View r13 = X.JTO.A0F(r3)
            X.OHU r12 = r0.A05
            if (r12 != 0) goto L_0x0097
            java.lang.String r0 = "floatyClusterViewpointHelper"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            r15 = -9223372036854775808
            int r14 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0092
            long r0 = r0 - r17
            long r0 = r13.A09(r0, r4)
            long r0 = r0 + r17
            goto L_0x0055
        L_0x0092:
            long r0 = r13.A07()
            goto L_0x0055
        L_0x0097:
            java.util.HashSet r0 = r12.A05
            r0.add(r13)
            X.2el r11 = r12.A01
            X.0gF r5 = X.C60340gF.A00
            X.N4t r0 = r9.A02
            java.lang.String r4 = r0.A0B
            X.30a r7 = X.AnonymousClass30Y.A00(r9, r5, r4)
            X.Ikd r6 = r12.A04
            androidx.recyclerview.widget.RecyclerView r5 = r12.A00
            X.Ozh r4 = new X.Ozh
            r4.<init>(r5, r6)
            r7.A00(r4)
            X.Ozb r4 = new X.Ozb
            r4.<init>(r12)
            r7.A00(r4)
            X.C51967G9n.A0z(r13, r7, r11)
            X.MqP r11 = r3.A00
            if (r11 != 0) goto L_0x00df
            android.content.Context r12 = X.JTQ.A06(r3)
            com.instagram.common.session.UserSession r13 = r1.A00
            X.MqO r14 = X.C67589MqN.A00(r0)
            X.Nd3 r15 = X.Nd3.A00
            r5 = 40
            X.Inj r4 = new X.Inj
            r4.<init>(r3, r5)
            X.MqP r11 = new X.MqP
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A00 = r11
        L_0x00df:
            com.instagram.common.ui.base.IgSimpleImageView r6 = r3.A06
            r6.setImageDrawable(r11)
            android.view.ViewGroup$LayoutParams r5 = r6.getLayoutParams()
            if (r5 == 0) goto L_0x022c
            int r4 = r11.A02
            r5.width = r4
            int r4 = r11.A01
            r5.height = r4
            r6.setLayoutParams(r5)
            X.Oke r4 = new X.Oke
            r4.<init>(r0, r3, r1)
            r8.setOnTouchListener(r4)
            X.4AB r8 = r0.A05
            r9 = 0
            if (r8 == 0) goto L_0x021b
            java.util.List r4 = r8.A0J
            if (r4 == 0) goto L_0x021b
            java.util.Iterator r7 = r4.iterator()
        L_0x010a:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0218
            java.lang.Object r5 = r7.next()
            r4 = r5
            X.913 r4 = (X.AnonymousClass913) r4
            X.4zZ r4 = r4.BWY()
            java.lang.String r4 = r4.A0J
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x010a
        L_0x0123:
            X.913 r5 = (X.AnonymousClass913) r5
            if (r5 == 0) goto L_0x021b
            X.4zZ r4 = r5.BWY()
        L_0x012b:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            java.lang.Integer r11 = r0.A07
            if (r11 != r13) goto L_0x0203
            android.content.Context r5 = X.DbS.A07(r3)
            r4 = 2131962728(0x7f132b68, float:1.956219E38)
            java.lang.String r7 = r5.getString(r4)
        L_0x013c:
            r12 = 1
        L_0x013d:
            if (r11 == r13) goto L_0x0143
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r11 != r4) goto L_0x014c
        L_0x0143:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r5 = r3.A07
            if (r8 == 0) goto L_0x0200
            com.instagram.api.schemas.NoteCustomTheme r4 = r8.A06
        L_0x0149:
            r5.setCustomTheme(r4)
        L_0x014c:
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r11 = r3.A07
            if (r7 == 0) goto L_0x0157
            int r5 = r7.length()
            r4 = 0
            if (r5 != 0) goto L_0x0159
        L_0x0157:
            r4 = 8
        L_0x0159:
            r11.setVisibility(r4)
            if (r7 != 0) goto L_0x0160
            java.lang.String r7 = ""
        L_0x0160:
            r4 = 41
            X.Inj r5 = new X.Inj
            r5.<init>(r3, r4)
            java.lang.String r4 = ""
            r11.setText(r7, r12, r4, r5)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentLayout$default(r11, r2, r10, r9)
            android.view.View r4 = r3.itemView
            r4.invalidate()
            android.content.Context r9 = X.JTQ.A06(r3)
            com.instagram.user.model.User r5 = r0.A02()
            android.content.Context r4 = X.JTQ.A06(r3)
            java.lang.String r10 = X.C67587MqL.A04(r4, r5)
            boolean r13 = r0.A0I
            if (r13 == 0) goto L_0x01fd
            boolean r4 = r0.A0J
            if (r4 == 0) goto L_0x01fd
            if (r8 != 0) goto L_0x01fd
            r11 = 0
        L_0x0190:
            X.NQl r8 = new X.NQl
            r8.<init>(r9, r10, r11, r13)
            int r5 = r8.A05
            int r4 = r8.A02
            r8.setBounds(r2, r2, r5, r4)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r3.A05
            r5.setImageDrawable(r8)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            if (r4 == 0) goto L_0x0225
            int r2 = X.AnonymousClass7TF.A06(r8)
            r4.width = r2
            int r2 = X.JTP.A06(r8)
            r4.height = r2
            r5.setLayoutParams(r4)
            com.instagram.common.ui.base.IgSimpleImageView r4 = r3.A04
            boolean r1 = r1.A03
            int r1 = X.DbW.A01(r1)
            r4.setVisibility(r1)
            boolean r2 = r0.A0F
            r1 = 0
            if (r2 == 0) goto L_0x01c8
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x01c8:
            r4.setAlpha(r1)
            android.graphics.drawable.Drawable r2 = r3.A02
            X.AnonymousClass7TG.A13(r2)
            r4.setImageDrawable(r2)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            if (r1 == 0) goto L_0x021e
            X.2dQ r1 = (X.C71492dQ) r1
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x01ed
            int r0 = r6.getId()
            r1.A0u = r0
            int r0 = r6.getId()
            r1.A0M = r0
        L_0x01ed:
            int r0 = X.AnonymousClass7TF.A06(r2)
            r1.width = r0
            int r0 = X.JTP.A06(r2)
            r1.height = r0
            r4.setLayoutParams(r1)
            return
        L_0x01fd:
            long r11 = r0.A02
            goto L_0x0190
        L_0x0200:
            r4 = r9
            goto L_0x0149
        L_0x0203:
            if (r4 == 0) goto L_0x0214
            java.lang.String r7 = r4.A0J
            boolean r4 = r4.A0Q
            if (r4 != r10) goto L_0x0215
            int r5 = X.0mp.A00(r7)
            r4 = 3
            if (r5 > r4) goto L_0x0215
            goto L_0x013c
        L_0x0214:
            r7 = r9
        L_0x0215:
            r12 = 0
            goto L_0x013d
        L_0x0218:
            r5 = r9
            goto L_0x0123
        L_0x021b:
            r4 = r9
            goto L_0x012b
        L_0x021e:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0225:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x022c:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x0233:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Cannot get random in empty range: "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r14, r0, r1)
            throw r0
        L_0x023e:
            r0 = 1
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NQC.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68199N5o.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r4) {
        C68053MzK mzK = (C68053MzK) r4;
        0qQ.A0B(mzK, 0);
        mzK.A00 = null;
        mzK.A03.clearAnimation();
        NJF njf = mzK.A08.A02;
        View A0F = JTO.A0F(mzK);
        OHU ohu = njf.A05;
        if (ohu == null) {
            0qQ.A0F("floatyClusterViewpointHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        ohu.A01.A04(A0F);
        ohu.A05.remove(A0F);
    }

    public NQC(UserSession userSession, C72369P3i p3i, NJF njf) {
        AnonymousClass7TG.A1O(userSession, p3i);
        this.A00 = userSession;
        this.A01 = p3i;
        this.A02 = njf;
        this.A03 = 182.A06(0Tu.A05, userSession, 2342164778840303354L);
    }
}
