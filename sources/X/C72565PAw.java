package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAw  reason: case insensitive filesystem */
public final class C72565PAw implements AnonymousClass7D2 {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final P8B A06;
    public final AnonymousClass7DY A07;
    public final Context A08;

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01ba, code lost:
        if (X.182.A06(X.0Tu.A05, r7.A05, 36328057455262631L) != false) goto L_0x01bc;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.C328667Fr r19, X.C68067MzY r20) {
        /*
            r18 = this;
            r2 = 0
            r5 = r19
            r4 = r20
            boolean r3 = X.AnonymousClass7TF.A1U(r2, r4, r5)
            X.77A r6 = r5.A0H
            if (r6 == 0) goto L_0x01fa
            X.7FE r0 = r5.A0C
            android.view.View r1 = r4.itemView
            X.7L2 r8 = r0.A03
            X.7Fo r11 = X.C328637Fo.NONE
            android.graphics.drawable.Drawable r9 = r4.A01
            boolean r0 = r0.A09
            r10 = 0
            r14 = r2
            r15 = r2
            r16 = r0
            r17 = r2
            r12 = r8
            r13 = r2
            X.AnonymousClass7FB.A06(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1.setBackground(r9)
            X.7Kx r1 = r8.A04
            int r0 = r1.A0I
            r7 = r18
            r7.A02 = r0
            int r0 = r1.A0J
            r7.A01 = r0
            X.7Ky r0 = r8.A03
            int r0 = r0.A04
            r7.A00 = r0
            com.instagram.common.typedurl.ImageUrl r1 = r6.A01
            if (r1 == 0) goto L_0x016c
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r4.A04
            X.0iw r0 = r7.A04
            r8.setUrl(r1, r0)
            int r1 = r7.A03
            int r0 = r7.A00
            r8.A0H(r1, r0)
            r8.A02 = r3
        L_0x004e:
            com.instagram.common.ui.base.IgTextView r1 = r4.A02
            java.lang.String r0 = r6.A02
            r1.setText(r0)
            java.util.List r0 = r4.A06
            java.util.Iterator r17 = r0.iterator()
            r9 = 0
        L_0x005c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0173
            java.lang.Object r8 = r17.next()
            int r16 = r9 + 1
            if (r9 >= 0) goto L_0x0072
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0072:
            X.OFE r8 = (X.OFE) r8
            java.util.List r1 = r6.A04
            int r0 = r1.size()
            if (r9 >= r0) goto L_0x0151
            java.lang.Object r11 = r1.get(r9)
            X.N2g r11 = (X.C68140N2g) r11
            com.instagram.common.ui.base.IgTextView r13 = r8.A02
            r13.setVisibility(r2)
            android.view.View r14 = r8.A01
            r14.setVisibility(r2)
            com.instagram.direct.ui.polls.PollMessageVotersView r10 = r8.A03
            r10.setVisibility(r2)
            java.lang.String r0 = r11.A02
            r13.setText(r0)
            X.MrU r12 = r8.A00
            if (r12 != 0) goto L_0x00e1
            android.content.Context r15 = X.JTQ.A06(r4)
            int r12 = r7.A02
            int r9 = r11.A00
            boolean r1 = X.0mk.A01()
            X.MrU r0 = new X.MrU
            r0.<init>(r15, r12, r9, r1)
            r8.A00 = r0
            r14.setBackground(r0)
        L_0x00b0:
            java.lang.String r0 = r11.A02
            r13.setText(r0)
            long r0 = r11.A01
            r12 = 0
            int r8 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r8 <= 0) goto L_0x0163
            r10.setVisibility(r2)
            java.util.List r8 = r11.A03
            r10.A00(r8, r0)
            int r9 = r7.A00
            java.util.List r0 = r10.A05
            java.util.Iterator r8 = r0.iterator()
        L_0x00cd:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r1 = r8.next()
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = (com.instagram.common.ui.widget.imageview.CircularImageView) r1
            int r0 = r10.A02
            r1.A0H(r0, r9)
            r1.A02 = r3
            goto L_0x00cd
        L_0x00e1:
            int r1 = r7.A02
            int r0 = r12.A00
            if (r1 == r0) goto L_0x00ec
            r12.A00 = r1
            r12.invalidateSelf()
        L_0x00ec:
            int r1 = r11.A00
            int r0 = r12.A01
            if (r1 == r0) goto L_0x00b0
            r12.A01 = r1
            android.graphics.Rect r0 = r12.getBounds()
            int r1 = r0.right
            int r0 = r12.A01
            int r1 = r1 * r0
            double r0 = (double) r1
            r8 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 / r8
            int r14 = (int) r0
            android.graphics.RectF r15 = r12.A02
            boolean r1 = r12.A04
            android.graphics.RectF r0 = r12.A03
            if (r1 == 0) goto L_0x0125
            float r8 = r0.right
            float r1 = (float) r14
            float r9 = r8 - r1
            float r1 = r0.left
            float r9 = java.lang.Math.max(r9, r1)
            float r1 = r0.top
            float r0 = r0.bottom
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r9, r1, r8, r0)
        L_0x011e:
            r15.set(r14)
            r12.invalidateSelf()
            goto L_0x00b0
        L_0x0125:
            float r9 = r0.left
            float r8 = r0.top
            float r1 = (float) r14
            float r0 = r0.bottom
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r9, r8, r1, r0)
            goto L_0x011e
        L_0x0132:
            int r1 = r7.A01
            int r9 = r7.A00
            int r8 = r7.A02
            r10.A01 = r9
            r10.A00 = r8
            com.instagram.common.ui.base.IgTextView r0 = r10.A03
            r0.setTextColor(r1)
            X.MrT r1 = r10.A04
            android.graphics.Paint r0 = r1.A01
            r0.setColor(r9)
            android.graphics.Paint r0 = r1.A00
            r0.setColor(r8)
            r1.invalidateSelf()
            goto L_0x0168
        L_0x0151:
            r1 = 8
            com.instagram.common.ui.base.IgTextView r0 = r8.A02
            r0.setVisibility(r1)
            android.view.View r0 = r8.A01
            r0.setVisibility(r1)
            com.instagram.direct.ui.polls.PollMessageVotersView r0 = r8.A03
            r0.setVisibility(r1)
            goto L_0x0168
        L_0x0163:
            r0 = 8
            r10.setVisibility(r0)
        L_0x0168:
            r9 = r16
            goto L_0x005c
        L_0x016c:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r4.A04
            r0.A09()
            goto L_0x004e
        L_0x0173:
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x01f2
            int r0 = r1.length()
            if (r0 == 0) goto L_0x01f2
            com.instagram.common.ui.base.IgTextView r0 = r4.A03
            r0.setVisibility(r2)
            r0.setText(r1)
        L_0x0185:
            java.util.List r1 = r5.A0b
            if (r1 == 0) goto L_0x01ea
            int r0 = r1.size()
            if (r0 != r3) goto L_0x01ea
            java.lang.Object r0 = X.00k.A0O(r1, r2)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x01bc
            com.instagram.igds.components.button.IgdsButton r6 = r4.A05
            r6.setVisibility(r2)
            java.lang.String r0 = r0.A04
            r6.setText((java.lang.String) r0)
            X.NR7 r0 = new X.NR7
            r0.<init>(r5, r7)
            X.AnonymousClass0fU.A00(r0, r6)
            int r0 = r7.A01
            if (r0 >= 0) goto L_0x01e4
            com.instagram.common.session.UserSession r3 = r7.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328057455262631(0x81102d00003ba7, double:3.037348043829547E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x01e4
        L_0x01bc:
            X.9J6 r3 = r5.A06
            if (r3 == 0) goto L_0x01dc
            android.view.View r2 = X.JTO.A0F(r4)
            java.lang.String r0 = r3.A01
            r2.setContentDescription(r0)
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x01e2
            int r0 = r0.length()
            if (r0 == 0) goto L_0x01e2
            r0 = 3
            X.JfK r1 = new X.JfK
            r1.<init>(r3, r0)
        L_0x01d9:
            X.03v.A0B(r2, r1)
        L_0x01dc:
            X.7DY r0 = r7.A07
            r0.Cy2(r4, r5)
            return
        L_0x01e2:
            r1 = 0
            goto L_0x01d9
        L_0x01e4:
            int r0 = r7.A01
            r6.setTextColor(r0)
            goto L_0x01bc
        L_0x01ea:
            com.instagram.igds.components.button.IgdsButton r1 = r4.A05
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x01bc
        L_0x01f2:
            com.instagram.common.ui.base.IgTextView r1 = r4.A03
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0185
        L_0x01fa:
            java.lang.String r0 = "can't call this content definition without a poll content"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72565PAw.ADp(X.7Fr, X.MzY):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A07.DuS(r2);
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        throw AnonymousClass7TE.A0z("should not be called");
    }

    public C72565PAw(Context context, AnonymousClass0iw r3, UserSession userSession, P8B p8b, AnonymousClass7DY r6) {
        this.A08 = context;
        this.A04 = r3;
        this.A06 = p8b;
        this.A07 = r6;
        this.A05 = userSession;
        this.A01 = C51968G9o.A04(context);
        this.A02 = 2Yu.A01(context);
        this.A00 = 2Yu.A0F(context, R.attr.messageFromOthersGrayBackground);
        context.getColor(R.color.black);
        context.getColor(R.color.grey_6);
        this.A03 = AnonymousClass7TG.A04(context);
    }
}
