package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class Tw1 extends C232222tE {
    public final int A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final XC1 A03;
    public final XAH A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public Tw1(AnonymousClass0iw r4, UserSession userSession, XC1 xc1, XAH xah, int i, boolean z, boolean z2) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r4;
        this.A03 = xc1;
        this.A04 = xah;
        this.A05 = z;
        this.A07 = z2;
        this.A00 = i;
        this.A06 = 182.A06(0Tu.A05, userSession, 36323418890579094L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        if (r1 != null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (r0 != r12) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r2 = r23
            X.Nfs r2 = (X.C69169Nfs) r2
            r13 = 0
            r0 = r24
            boolean r12 = X.AnonymousClass7TF.A1U(r13, r2, r0)
            X.Mg0 r11 = r2.A00
            r3 = r22
            com.instagram.common.session.UserSession r14 = r3.A02
            android.content.Context r10 = X.JTQ.A06(r0)
            X.0iw r1 = r3.A01
            X.Nfj r9 = r2.A00
            X.XC1 r8 = r3.A03
            X.XAH r7 = r3.A04
            android.view.View r0 = r0.itemView
            java.lang.Object r6 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.HashtagRowViewBinder.Holder"
            X.0qQ.A0C(r6, r0)
            X.ViQ r6 = (X.C17935ViQ) r6
            boolean r2 = r11.A0F
            boolean r21 = X.AnonymousClass7TF.A1P(r2)
            boolean r15 = r3.A07
            int r0 = r3.A00
            r16 = 0
            boolean r5 = r3.A06
            X.AnonymousClass7TF.A1B(r14, r13, r1)
            r3 = 7
            X.0qQ.A0B(r6, r3)
            com.instagram.model.hashtag.HashtagImpl r4 = r9.A00
            if (r2 != 0) goto L_0x0046
            r3 = 1
            if (r0 == r12) goto L_0x0047
        L_0x0046:
            r3 = 0
        L_0x0047:
            android.widget.ImageView r2 = r6.A04
            java.lang.Boolean r0 = r4.A07
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r0 = r0 ^ 1
            X.C18795W2d.A01(r10, r2, r1, r4, r0)
            X.C18795W2d.A02(r2)
            if (r8 == 0) goto L_0x0060
            android.view.View r1 = r6.A02
            r0 = 49
            X.WB4.A00(r1, r8, r9, r11, r0)
        L_0x0060:
            if (r7 == 0) goto L_0x0067
            android.view.View r0 = r6.A02
            r7.ECK(r0, r9, r11)
        L_0x0067:
            java.lang.String r0 = r4.A0D
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "#%s"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r0)
            X.3qB r0 = X.C253073qA.A00(r14)
            r0.A01(r1)
            if (r3 == 0) goto L_0x008c
            char r7 = r1.charAt(r13)
            r0 = 35
            if (r7 != r0) goto L_0x008c
            r1.delete(r13, r12)
        L_0x008c:
            com.instagram.common.ui.base.IgTextView r0 = r6.A05
            r0.setText(r1)
            X.C18795W2d.A03(r4, r11, r6, r5, r3)
            if (r3 == 0) goto L_0x00e2
            r1 = 8
            r2.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r6.A06
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r6.A00
            if (r1 != 0) goto L_0x00ae
            android.view.ViewStub r0 = r6.A03
            com.instagram.common.ui.base.IgSimpleImageView r1 = X.C13989Tnp.A0U(r0)
            r6.A00 = r1
            if (r1 == 0) goto L_0x00be
        L_0x00ae:
            r0 = 2131238347(0x7f081dcb, float:1.809297E38)
            r1.setImageResource(r0)
            r0 = 2130970006(0x7f040596, float:1.754871E38)
            int r0 = X.2Yu.A0H(r10, r0)
            X.DbX.A12(r10, r1, r0)
        L_0x00be:
            android.view.ViewStub r0 = r6.A03
            r0.setVisibility(r13)
            android.view.View r0 = r6.A02
            X.C67434Mnp.A02(r0)
            com.instagram.common.ui.base.IgTextView r1 = r6.A07
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r1.setTextAppearance(r0)
        L_0x00d0:
            com.instagram.common.ui.base.IgSimpleImageView r17 = r6.A00()
            if (r8 == 0) goto L_0x00e1
            if (r17 == 0) goto L_0x00e1
            r19 = r11
            r20 = r8
            r18 = r9
            X.C67429Mnk.A00(r16, r17, r18, r19, r20, r21)
        L_0x00e1:
            return
        L_0x00e2:
            if (r15 == 0) goto L_0x00d0
            r2.setVisibility(r13)
            android.view.ViewStub r1 = r6.A03
            r0 = 8
            r1.setVisibility(r0)
            android.view.View r0 = r6.A02
            X.C67434Mnp.A01(r0)
            com.instagram.common.ui.base.IgTextView r1 = r6.A06
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r1.setTextAppearance(r0)
            r0 = 67
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.0qQ.A0C(r2, r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = (com.instagram.common.ui.widget.imageview.CircularImageView) r2
            X.C67434Mnp.A04(r2)
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Tw1.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C69169Nfs.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        View A002 = C18795W2d.A00(viewGroup.getContext(), viewGroup);
        Boolean valueOf = Boolean.valueOf(this.A05);
        C249703kE r2 = new C249703kE(A002);
        if (A002.getTag() instanceof C17935ViQ) {
            if (AnonymousClass7TF.A1Y(valueOf, true)) {
                A002.setBackgroundDrawable(A002.getContext().getDrawable(R.drawable.bg_elevated_simple_row));
            }
            return r2;
        }
        throw DbT.A0m();
    }
}
