package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAu  reason: case insensitive filesystem */
public final class C72563PAu implements AnonymousClass7D2 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final C3256673q A07;
    public final AnonymousClass7X0 A08;
    public final OZK A09;
    public final P8E A0A;
    public final AnonymousClass7ZF A0B;
    public final AnonymousClass7DZ A0C;
    public final AnonymousClass7DY A0D;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        UserSession userSession = this.A06;
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.direct_prompt_xma_legacy;
        if (A012) {
            i = R.layout.direct_prompt_xma_message;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        inflate.getLayoutParams().width = -1;
        C68070Mzb mzb = new C68070Mzb(inflate, userSession);
        this.A0C.A00(mzb);
        return mzb;
    }

    public C72563PAu(Context context, AnonymousClass0iw r12, UserSession userSession, C3256673q r14, AnonymousClass7X0 r15, P8E p8e, AnonymousClass7ZF r17, AnonymousClass7DZ r18, AnonymousClass7DY r19) {
        AnonymousClass7ZF r1 = r17;
        boolean A1Z = DbW.A1Z(r1);
        this.A04 = context;
        this.A0C = r18;
        this.A0B = r1;
        this.A0A = p8e;
        this.A05 = r12;
        this.A07 = r14;
        this.A0D = r19;
        this.A08 = r15;
        this.A06 = userSession;
        this.A09 = new OZK(r12, userSession, r15, 0, 472, false, A1Z, false, false);
        this.A03 = C51968G9o.A04(context);
        this.A02 = context.getColor(2Yu.A0C(context));
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
        this.A00 = AnonymousClass7TG.A04(context);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int, boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x021c, code lost:
        if (r0 != null) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r14, X.AnonymousClass7FW r15) {
        /*
            r13 = this;
            X.Mzb r14 = (X.C68070Mzb) r14
            X.7Ft r15 = (X.C328687Ft) r15
            r12 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r12, r14, r15)
            X.74v r5 = r15.A01
            if (r5 == 0) goto L_0x002b
            X.7DY r4 = r13.A0D
            X.0eM r3 = r14.A05
            java.lang.Object r1 = r3.getValue()
            java.util.List r0 = r15.A04
            X.7Fr r0 = X.C68821NYf.A01(r0, r12)
            r4.Cy2(r1, r0)
            X.73q r1 = r13.A07
            if (r1 == 0) goto L_0x002b
            java.lang.Object r0 = r3.getValue()
            X.73s r0 = (X.C3256873s) r0
            r1.bind(r0, r5)
        L_0x002b:
            java.util.List r0 = r14.A04
            java.util.Iterator r1 = r0.iterator()
        L_0x0031:
            boolean r0 = r1.hasNext()
            r5 = 8
            if (r0 == 0) goto L_0x0045
            java.lang.Object r0 = r1.next()
            X.OWC r0 = (X.OWC) r0
            android.view.View r0 = r0.A00
            r0.setVisibility(r5)
            goto L_0x0031
        L_0x0045:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r15.A02
            java.lang.String r3 = r0.A02
            r4 = 0
            if (r3 == 0) goto L_0x022e
            X.7ZF r0 = r13.A0B
            boolean r1 = r0.A03(r3)
        L_0x0052:
            X.7ZF r0 = r13.A0B
            boolean r0 = r0.A02(r3)
            if (r0 == 0) goto L_0x020e
            if (r1 != 0) goto L_0x020e
            com.instagram.common.session.UserSession r0 = r13.A06
            boolean r0 = X.C70867OPg.A01(r0)
            r3 = 4
            if (r0 == 0) goto L_0x0202
            boolean r1 = r15.A08
            X.3oV r0 = r14.A03
            if (r1 == 0) goto L_0x01fd
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x0074
            r0.setVisibility(r3)
        L_0x0074:
            java.util.List r7 = r15.A04
            X.7Fr r3 = X.C68821NYf.A01(r7, r12)
            X.0eM r6 = r14.A06
            java.lang.Object r8 = r6.getValue()
            X.MzZ r8 = (X.C68068MzZ) r8
            android.view.View r4 = r8.itemView
            X.7Fr r0 = X.C68821NYf.A01(r7, r12)
            X.7FE r0 = r0.A0C
            X.7L2 r1 = r0.A03
            android.graphics.drawable.Drawable r0 = r8.A01
            X.AnonymousClass7FB.A07(r0, r1, r12)
            r4.setBackground(r0)
            android.view.View r0 = r8.itemView
            android.content.res.Resources r5 = r0.getResources()
            int r0 = X.AnonymousClass7TE.A0B(r5)
            float r0 = (float) r0
            X.Gdm r4 = new X.Gdm
            r4.<init>(r0)
            android.view.View r1 = X.JTO.A0F(r8)
            int r0 = X.AnonymousClass7TE.A0C(r5)
            float r0 = (float) r0
            r1.setElevation(r0)
            r1.setOutlineProvider(r4)
            int r0 = r7.size()
            if (r0 <= r2) goto L_0x01d0
            X.OZK r0 = r13.A09
            r0.A02(r14, r15)
        L_0x00be:
            java.lang.Object r4 = r6.getValue()
            X.MzZ r4 = (X.C68068MzZ) r4
            com.instagram.common.ui.base.IgTextView r1 = r4.A05
            java.lang.String r0 = r3.A0a
            r1.setText(r0)
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r3.A0L
            java.lang.String r0 = r0.A02
            boolean r11 = X.DbW.A1a(r0)
            java.lang.Long r0 = r3.A0R
            if (r0 == 0) goto L_0x01c7
            long r9 = r0.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r0
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r7 = r4.A07
            r7.setVisibility(r12)
            r5 = 0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c2
            r0 = 11
            X.Inz r8 = new X.Inz
            r8.<init>(r0, r3, r13, r4)
            r7.A02(r8, r9, r11, r12)
            X.7FE r0 = r3.A0C
            X.7L2 r0 = r0.A03
            X.7Kx r0 = r0.A04
            int r0 = r0.A09
            r7.setPillColor(r0)
        L_0x0100:
            java.util.List r10 = r3.A0c
            if (r10 == 0) goto L_0x01ba
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01ba
            int r1 = r3.A01
            int r0 = r10.size()
            r8 = 3
            if (r1 <= r0) goto L_0x01b7
            int r0 = r10.size()
            int r0 = java.lang.Math.min(r0, r8)
            int r1 = r1 - r0
        L_0x011c:
            com.instagram.common.ui.widget.imageview.IgImageView r5 = r4.A06
            android.content.Context r7 = r13.A04
            int r9 = r13.A01
            X.0iw r0 = r13.A05
            java.lang.String r0 = r0.getModuleName()
            X.ON3 r6 = new X.ON3
            r6.<init>(r7, r0, r10, r9)
            r6.A0B = r2
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r6.A07 = r0
            r0 = 1050253722(0x3e99999a, float:0.3)
            r6.A00 = r0
            int r0 = r13.A00
            r6.A01(r0)
            r6.A0G = r2
            r6.A02 = r1
            int r0 = r13.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A05 = r0
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A06 = r0
            r6.A0C = r2
            X.7FE r0 = r3.A0C
            X.7L2 r0 = r0.A03
            X.7Ky r0 = r0.A03
            int r1 = r0.A04
            r0 = 2130970662(0x7f040826, float:1.755004E38)
            int r0 = X.2Yu.A0F(r7, r0)
            if (r1 != r0) goto L_0x016c
            boolean r0 = X.AnonymousClass3HA.A00(r7)
            if (r0 != 0) goto L_0x016c
            int r1 = r13.A02
        L_0x016c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A08 = r0
            r6.A01 = r8
            int r0 = X.2Yu.A04(r7)
            java.lang.Integer r0 = X.DbV.A0n(r7, r0)
            r6.A04 = r0
            r6.A0E = r2
            r6.A0A = r12
            X.3b0 r0 = r6.A00()
            r5.setImageDrawable(r0)
            r5.setVisibility(r12)
        L_0x018c:
            java.util.List r0 = r3.A0b
            if (r0 == 0) goto L_0x01af
            com.instagram.igds.components.button.IgdsButton r1 = r4.A08
            r1.setVisibility(r12)
            java.lang.Object r0 = X.00k.A0O(r0, r12)
            X.9JN r0 = (X.AnonymousClass9JN) r0
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = r0.A04
        L_0x019f:
            r1.setText((java.lang.String) r0)
            X.NR7 r0 = new X.NR7
            r0.<init>(r3, r13, r2)
            X.AnonymousClass0fU.A00(r0, r1)
            int r0 = r13.A03
            r1.setTextColor(r0)
        L_0x01af:
            X.7DZ r0 = r13.A0C
            r0.A02(r14, r15)
            return
        L_0x01b5:
            r0 = 0
            goto L_0x019f
        L_0x01b7:
            r1 = 0
            goto L_0x011c
        L_0x01ba:
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r4.A06
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x018c
        L_0x01c2:
            r7.A01()
            goto L_0x0100
        L_0x01c7:
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r1 = r4.A07
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0100
        L_0x01d0:
            java.lang.Object r0 = r6.getValue()
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r1 = X.JTO.A0F(r0)
            android.content.Context r5 = r13.A04
            android.content.res.Resources r0 = r5.getResources()
            r4 = 2131165207(0x7f070017, float:1.7944625E38)
            int r0 = r0.getDimensionPixelSize(r4)
            X.0nA.A0e(r1, r0)
            java.lang.Object r0 = r6.getValue()
            X.3kE r0 = (X.C249703kE) r0
            android.view.View r1 = X.JTO.A0F(r0)
            int r0 = X.AnonymousClass7TF.A02(r5, r4)
            X.0nA.A0T(r1, r0)
            goto L_0x00be
        L_0x01fd:
            X.C66580MXl.A1Q(r0, r12)
            goto L_0x0074
        L_0x0202:
            X.3oV r1 = r14.A03
            boolean r0 = r15.A08
            if (r0 == 0) goto L_0x0209
            r4 = 4
        L_0x0209:
            r1.setVisibility(r4)
            goto L_0x0074
        L_0x020e:
            com.instagram.common.session.UserSession r0 = r13.A06
            boolean r1 = X.C70867OPg.A01(r0)
            X.3oV r0 = r14.A03
            if (r1 == 0) goto L_0x0229
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x0221
        L_0x021e:
            r0.setVisibility(r5)
        L_0x0221:
            android.view.View r0 = X.JTO.A0F(r14)
            X.0nA.A0T(r0, r12)
            goto L_0x01af
        L_0x0229:
            android.view.View r0 = r0.getView()
            goto L_0x021e
        L_0x022e:
            r1 = 0
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72563PAu.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        C68070Mzb mzb = (C68070Mzb) r4;
        0qQ.A0B(mzb, 0);
        this.A0C.A01(mzb);
        OZK ozk = this.A09;
        for (OWC A012 : mzb.A04) {
            A012.A01();
        }
        ozk.A03.A03(mzb);
    }
}
