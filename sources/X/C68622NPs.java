package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NPs  reason: case insensitive filesystem */
public final class C68622NPs extends C232232tF {
    public final UserSession A00;
    public final O92 A01;

    public C68622NPs(UserSession userSession, O92 o92) {
        0qQ.A0B(userSession, 2);
        this.A01 = o92;
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C68037Mz4(DbU.A09(layoutInflater, viewGroup, R.layout.friend_map_note_update_item, false), this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0055, code lost:
        if (r0.length() == 0) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r19, X.C249703kE r20) {
        /*
            r18 = this;
            r5 = r20
            r6 = r19
            X.N5r r6 = (X.C68202N5r) r6
            X.Mz4 r5 = (X.C68037Mz4) r5
            boolean r0 = X.AnonymousClass7TG.A1Z(r6, r5)
            r1 = r18
            X.O92 r4 = r1.A01
            X.0qQ.A0B(r4, r0)
            com.instagram.common.ui.base.IgTextView r2 = r5.A06
            X.N4t r7 = r6.A01
            com.instagram.user.model.User r0 = r7.A02()
            java.lang.String r0 = r0.B8Q()
            r2.setText(r0)
            android.content.Context r1 = X.DbS.A07(r5)
            r0 = 2131100377(0x7f0602d9, float:1.7813134E38)
            X.DbT.A17(r1, r2, r0)
            com.instagram.common.ui.base.IgTextView r3 = r5.A05
            android.content.Context r2 = X.JTQ.A06(r5)
            long r0 = r7.A02
            java.lang.String r2 = X.1G0.A08(r2, r0)
            java.lang.String r1 = " • "
            java.lang.String r0 = r7.A09
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            r3.setText(r0)
            com.instagram.common.ui.base.IgTextView r8 = r5.A03
            X.0qQ.A06(r8)
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = r6.A03
            if (r0 == 0) goto L_0x0057
            int r0 = r0.length()
            r1 = 0
            if (r0 != 0) goto L_0x0058
        L_0x0057:
            r1 = 1
        L_0x0058:
            r3 = 8
            r0 = 0
            if (r1 == 0) goto L_0x005f
            r0 = 8
        L_0x005f:
            r8.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r5.A01
            X.0qQ.A06(r2)
            java.lang.Float r1 = r6.A02
            r0 = 8
            if (r1 == 0) goto L_0x006e
            r0 = 0
        L_0x006e:
            r2.setVisibility(r0)
            java.lang.String r0 = r6.A03
            r8.setText(r0)
            if (r1 == 0) goto L_0x011e
            float r0 = r1.floatValue()
        L_0x007c:
            r2.setRotation(r0)
            X.4AB r15 = r7.A05
            com.instagram.user.model.User r9 = r7.A06
            android.content.Context r7 = X.JTQ.A06(r5)
            com.instagram.common.session.UserSession r14 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321769624250079(0x810a75001126df, double:3.033371594178146E-306)
            boolean r8 = X.182.A06(r2, r14, r0)
            android.content.Context r13 = X.JTQ.A06(r5)
            if (r8 == 0) goto L_0x0110
            X.Nd9 r16 = X.Nd9.A00
            X.MrS r12 = new X.MrS
            r17 = r9
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x00a3:
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            com.instagram.common.ui.base.IgSimpleImageView r10 = r5.A02
            r10.setImageDrawable(r12)
            r8 = 2131165190(0x7f070006, float:1.794459E38)
            int r11 = X.AnonymousClass7TF.A02(r7, r8)
            r10.setPadding(r11, r11, r11, r11)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r10.setScaleType(r7)
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            if (r9 == 0) goto L_0x0121
            boolean r7 = X.182.A06(r2, r14, r0)
            int r8 = X.AnonymousClass7TF.A06(r12)
            if (r7 == 0) goto L_0x00cc
            int r7 = r11 * 2
            int r8 = r8 + r7
        L_0x00cc:
            r9.width = r8
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x010b
            int r0 = X.JTP.A06(r12)
            int r0 = r0 + r11
        L_0x00d9:
            r9.height = r0
            r10.setLayoutParams(r9)
            com.instagram.common.ui.base.IgTextView r7 = r5.A04
            X.0qQ.A06(r7)
            boolean r0 = X.AnonymousClass3HF.A01(r14)
            if (r0 == 0) goto L_0x00ee
            int r0 = r6.A00
            if (r0 <= 0) goto L_0x00ee
            r3 = 0
        L_0x00ee:
            r7.setVisibility(r3)
            android.view.View r0 = r5.itemView
            android.content.res.Resources r2 = X.DbU.A05(r0)
            r1 = 2131820723(0x7f1100b3, float:1.927417E38)
            int r0 = r6.A00
            java.lang.String r0 = X.DbY.A0d(r2, r0, r1)
            r7.setText(r0)
            android.view.View r1 = r5.itemView
            r0 = 14
            X.C71409Ok8.A01(r1, r0, r6, r4)
            return
        L_0x010b:
            int r0 = X.JTP.A06(r12)
            goto L_0x00d9
        L_0x0110:
            X.MqO r15 = X.C67589MqN.A01(r9)
            X.Nd9 r16 = X.Nd9.A00
            X.PkP r17 = X.C73826PkP.A00
            X.MqP r12 = new X.MqP
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00a3
        L_0x011e:
            r0 = 0
            goto L_0x007c
        L_0x0121:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68622NPs.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C68202N5r.class;
    }
}
