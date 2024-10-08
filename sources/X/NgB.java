package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NgB extends C15732Uhd {
    public final UserSession A00;
    public final C17508VYm A01;
    public final boolean A02 = true;
    public final AnonymousClass0iw A03;

    public NgB(AnonymousClass0iw r2, UserSession userSession, C17508VYm vYm, C18020Vjw vjw) {
        super(vjw);
        this.A00 = userSession;
        this.A03 = r2;
        this.A01 = vYm;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.attributes_section, false);
        A09.setTag(new C68054MzL(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.attributes.AttributesSectionViewBinder.Holder");
        return (C249703kE) tag;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x025d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void A00(X.C232262tL r25, X.C249703kE r26) {
        /*
            r24 = this;
            r6 = r26
            r7 = r25
            X.Ou4 r7 = (X.Ou4) r7
            X.MzL r6 = (X.C68054MzL) r6
            boolean r5 = X.AnonymousClass7TG.A1Z(r7, r6)
            r23 = r24
            r0 = r23
            com.instagram.common.session.UserSession r1 = r0.A00
            boolean r0 = r0.A02
            r4 = 0
            X.0qQ.A0B(r1, r4)
            if (r0 == 0) goto L_0x0096
            X.ORF.A00(r6, r7)
            X.0eM r0 = r6.A02
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r9 = 8
            r0.setVisibility(r9)
            X.ORF.A01(r6, r7)
            X.N3O r3 = r7.A00
            java.lang.CharSequence r2 = r3.A05
            if (r2 != 0) goto L_0x0085
            X.0eM r0 = r6.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
        L_0x003a:
            X.0eM r0 = r6.A0B
            X.JTS.A1W(r0, r9)
            X.0eM r8 = r6.A03
            X.JTS.A1W(r8, r9)
            X.0eM r0 = r6.A05
            X.JTS.A1W(r0, r9)
            X.0eM r0 = r6.A0A
            X.JTS.A1W(r0, r9)
        L_0x004e:
            java.lang.CharSequence r0 = r3.A02
            if (r0 == 0) goto L_0x0084
            r0 = r23
            X.VYm r6 = r0.A01
            android.view.View r3 = X.AnonymousClass7TH.A06(r8)
            java.lang.String r2 = r7.A03
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r6.A03
            r1.append(r0)
            r0 = 58
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ":discountsPromoLabel"
            java.lang.String r2 = X.AnonymousClass7TF.A0l(r0, r1)
            X.0qQ.A0B(r3, r4)
            X.0qQ.A0B(r2, r5)
            X.2el r1 = r6.A00
            X.2oe r0 = r6.A01
            X.30Y r0 = r0.A00(r2)
            r1.A05(r3, r0)
        L_0x0084:
            return
        L_0x0085:
            X.0eM r1 = r6.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            r0.setVisibility(r4)
            android.widget.TextView r0 = X.JTQ.A0A(r1)
            r0.setText(r2)
            goto L_0x003a
        L_0x0096:
            X.ORF.A00(r6, r7)
            X.N3O r3 = r7.A00
            java.lang.CharSequence r2 = r3.A01
            if (r2 == 0) goto L_0x02af
            int r0 = r2.length()
            if (r0 == 0) goto L_0x02af
            X.0eM r1 = r6.A02
            X.JTS.A1W(r1, r4)
            android.widget.TextView r0 = X.JTQ.A0A(r1)
            r0.setText(r2)
            android.view.View r1 = X.AnonymousClass7TH.A06(r1)
            r0 = 60
            X.C71396Ojv.A00(r1, r0, r7)
        L_0x00ba:
            X.ORF.A01(r6, r7)
            java.lang.CharSequence r2 = r3.A05
            if (r2 != 0) goto L_0x029d
            X.0eM r0 = r6.A06
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
        L_0x00ca:
            int r0 = X.C70389O4q.A00
            X.0eM r0 = r6.A07
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.JV5 r1 = r3.A00
            X.0qQ.A0B(r2, r4)
            if (r1 == 0) goto L_0x0296
            java.lang.Object r0 = r1.A00
            r21 = r0
            r0 = r21
            java.util.List r0 = (java.util.List) r0
            r21 = r0
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L_0x0296
            r2.setVisibility(r4)
            r2.removeAllViews()
            android.content.Context r20 = r2.getContext()
            X.0qQ.A0A(r20)
            int r19 = X.0nA.A09(r20)
            int r0 = X.AnonymousClass7TG.A02(r20)
            int r0 = r0 * 2
            int r19 = r19 - r0
            int r18 = r21.size()
            r9 = 0
            r8 = 0
        L_0x010a:
            r0 = r18
            if (r9 >= r0) goto L_0x019a
            r0 = r21
            java.lang.String r13 = X.AnonymousClass7TE.A19(r0, r9)
            java.lang.Object r11 = r1.A03
            java.lang.Number r11 = (java.lang.Number) r11
            r17 = 1
            boolean r12 = X.AnonymousClass7TF.A1Q(r9)
            com.instagram.common.ui.base.IgTextView r10 = new com.instagram.common.ui.base.IgTextView
            r0 = r20
            r10.<init>(r0)
            r10.setText(r13)
            r10.setFocusable(r5)
            r10.setContentDescription(r13)
            if (r12 != 0) goto L_0x015d
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r11 == r0) goto L_0x015d
            r0 = -2
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r0, r0)
            boolean r0 = X.0mk.A02(r20)
            if (r0 == 0) goto L_0x0284
            int r0 = r13.leftMargin
            r12 = r0
            int r0 = r13.topMargin
            r22 = r0
            android.content.res.Resources r0 = r10.getResources()
            int r16 = X.JTP.A03(r0)
        L_0x014f:
            int r0 = r13.bottomMargin
            r15 = r0
            r14 = r12
            r12 = r22
            r0 = r16
            r13.setMargins(r14, r12, r0, r15)
            r10.setLayoutParams(r13)
        L_0x015d:
            int r12 = r11.intValue()
            if (r12 == r4) goto L_0x0264
            if (r12 == r5) goto L_0x026e
            r0 = 2
            if (r12 != r0) goto L_0x0264
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r10.setTextAppearance(r0)
            r0 = r20
            X.DbY.A12(r10, r0)
            r0 = 2131239850(0x7f0823aa, float:1.8096019E38)
            r10.setBackgroundResource(r0)
        L_0x0179:
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x025d
            if (r9 != 0) goto L_0x0181
            r17 = 0
        L_0x0181:
            int r0 = X.C70389O4q.A00
            r10.measure(r0, r0)
            int r12 = r10.getMeasuredWidth()
            if (r17 != 0) goto L_0x0195
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r11 == r0) goto L_0x0195
            int r0 = X.AnonymousClass7TG.A03(r20)
            int r12 = r12 + r0
        L_0x0195:
            int r8 = r8 + r12
            r0 = r19
            if (r8 <= r0) goto L_0x025d
        L_0x019a:
            java.lang.CharSequence r8 = r3.A09
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0240
            X.0eM r0 = r6.A0B
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
        L_0x01ab:
            java.lang.CharSequence r2 = r3.A02
            X.0eM r8 = r6.A03
            if (r2 != 0) goto L_0x0225
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r8)
            X.C51969G9p.A1M(r0)
        L_0x01b8:
            java.lang.CharSequence r9 = r3.A04
            if (r9 != 0) goto L_0x0209
            X.0eM r0 = r6.A05
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
        L_0x01c5:
            X.0eM r2 = r6.A08
            X.JTS.A1W(r2, r4)
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r2)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = (com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView) r0
            r0.A05()
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            boolean r0 = r3.A0D
            r1.setSelected(r0)
            boolean r1 = r3.A0C
            android.view.View r0 = X.AnonymousClass7TH.A06(r2)
            if (r1 == 0) goto L_0x01fd
            r0.setClickable(r5)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 32
            X.C71409Ok8.A01(r1, r0, r7, r6)
        L_0x01f0:
            X.0eM r0 = r6.A0A
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 61
            X.C71396Ojv.A00(r1, r0, r7)
            goto L_0x004e
        L_0x01fd:
            r0.setClickable(r4)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 0
            r1.setOnClickListener(r0)
            goto L_0x01f0
        L_0x0209:
            X.0eM r2 = r6.A05
            X.JTS.A1W(r2, r4)
            android.widget.TextView r0 = X.JTQ.A0A(r2)
            X.DbT.A1H(r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 0
            r1.setOnClickListener(r0)
            android.widget.TextView r0 = X.JTQ.A0A(r2)
            r0.setText(r9)
            goto L_0x01c5
        L_0x0225:
            X.JTS.A1W(r8, r4)
            android.widget.TextView r0 = X.JTQ.A0A(r8)
            X.DbT.A1H(r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r8)
            r0 = 0
            r1.setOnClickListener(r0)
            android.widget.TextView r0 = X.JTQ.A0A(r8)
            r0.setText(r2)
            goto L_0x01b8
        L_0x0240:
            X.0eM r2 = r6.A0B
            X.JTS.A1W(r2, r4)
            android.widget.TextView r0 = X.JTQ.A0A(r2)
            X.DbT.A1H(r0)
            android.view.View r1 = X.AnonymousClass7TH.A06(r2)
            r0 = 0
            r1.setOnClickListener(r0)
            android.widget.TextView r0 = X.JTQ.A0A(r2)
            r0.setText(r8)
            goto L_0x01ab
        L_0x025d:
            r2.addView(r10)
            int r9 = r9 + 1
            goto L_0x010a
        L_0x0264:
            r0 = 2132018632(0x7f1405c8, float:1.9675576E38)
            r10.setTextAppearance(r0)
            r12 = 2130970250(0x7f04068a, float:1.7549205E38)
            goto L_0x027d
        L_0x026e:
            r0 = 2132018053(0x7f140385, float:1.9674402E38)
            r10.setTextAppearance(r0)
            r0 = 2131239851(0x7f0823ab, float:1.809602E38)
            r10.setBackgroundResource(r0)
            r12 = 2130970277(0x7f0406a5, float:1.754926E38)
        L_0x027d:
            r0 = r20
            X.JTS.A0u(r0, r10, r12)
            goto L_0x0179
        L_0x0284:
            android.content.res.Resources r0 = r10.getResources()
            int r12 = X.JTP.A03(r0)
            int r0 = r13.topMargin
            r22 = r0
            int r0 = r13.rightMargin
            r16 = r0
            goto L_0x014f
        L_0x0296:
            r0 = 8
            r2.setVisibility(r0)
            goto L_0x019a
        L_0x029d:
            X.0eM r1 = r6.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            r0.setVisibility(r4)
            android.widget.TextView r0 = X.JTQ.A0A(r1)
            r0.setText(r2)
            goto L_0x00ca
        L_0x02af:
            X.0eM r0 = r6.A02
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.C51969G9p.A1M(r0)
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NgB.A00(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return Ou4.class;
    }
}
