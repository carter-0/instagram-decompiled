package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAx  reason: case insensitive filesystem */
public final class C72566PAx implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final C3256673q A01;
    public final C332487Vf A02;
    public final P8I A03;
    public final AnonymousClass7DZ A04;
    public final AnonymousClass7DY A05;
    public final UserSession A06;
    public final C332857Wq A07;
    public final AnonymousClass7ZN A08;

    public C72566PAx(AnonymousClass0iw r2, UserSession userSession, C3256673q r4, C332857Wq r5, C332487Vf r6, P8I p8i, AnonymousClass7ZN r8, AnonymousClass7DZ r9, AnonymousClass7DY r10) {
        0qQ.A0B(userSession, 1);
        this.A06 = userSession;
        this.A04 = r9;
        this.A01 = r4;
        this.A05 = r10;
        this.A02 = r6;
        this.A07 = r5;
        this.A08 = r8;
        this.A03 = p8i;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
        if (r12.A0A != false) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r1 != false) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0265  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ADp(X.NYM r32, X.C68066MzX r33) {
        /*
            r31 = this;
            r4 = 0
            r6 = r32
            r5 = r33
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r5, r6)
            r7 = r31
            X.7ZN r1 = r7.A08
            r16 = 0
            if (r1 == 0) goto L_0x0020
            X.7Fr r0 = r6.A02
            if (r0 == 0) goto L_0x0372
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r0.A0L
            java.lang.String r0 = r0.A02
        L_0x0019:
            boolean r1 = r1.A02(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r2 = 8
            if (r0 == 0) goto L_0x002b
            android.view.View r0 = r5.itemView
            r0.setVisibility(r2)
        L_0x002a:
            return
        L_0x002b:
            android.view.View r0 = r5.itemView
            r0.setVisibility(r4)
            X.MzZ r8 = r5.A02
            android.view.View r0 = r8.itemView
            android.content.Context r18 = r0.getContext()
            android.content.res.Resources r11 = r0.getResources()
            int r1 = X.2Yu.A0A(r18)
            r0 = r18
            int r9 = r0.getColor(r1)
            int r0 = X.AnonymousClass7TE.A0B(r11)
            float r0 = (float) r0
            r25 = r0
            X.Gdm r10 = new X.Gdm
            r10.<init>(r0)
            int r0 = X.AnonymousClass7TE.A0C(r11)
            float r11 = (float) r0
            X.74v r13 = r6.A00
            if (r13 == 0) goto L_0x006f
            X.NXm r12 = r5.A01
            if (r12 == 0) goto L_0x006f
            X.7DY r1 = r7.A05
            if (r1 == 0) goto L_0x0068
            X.7Fr r0 = r6.A02
            r1.Cy2(r12, r0)
        L_0x0068:
            X.73q r0 = r7.A01
            if (r0 == 0) goto L_0x006f
            r0.bind(r12, r13)
        L_0x006f:
            android.view.View r1 = X.JTO.A0F(r8)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r0 = r0 + r11
            r1.setElevation(r0)
            r1.setOutlineProvider(r10)
            android.view.View r12 = r8.itemView
            X.7FE r0 = r6.A01
            X.7L2 r1 = r0.A03
            android.graphics.drawable.Drawable r0 = r8.A01
            X.AnonymousClass7FB.A07(r0, r1, r4)
            r12.setBackground(r0)
            android.view.View r12 = r8.itemView
            r0 = -1069547520(0xffffffffc0400000, float:-3.0)
            r12.setRotation(r0)
            java.lang.Long r0 = r6.A04
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r13 = r8.A07
            if (r0 == 0) goto L_0x02df
            r13.setVisibility(r4)
            long r21 = r0.longValue()
            long r14 = java.lang.System.currentTimeMillis()
            long r21 = r21 - r14
            r14 = 0
            int r0 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x02da
            r12 = 13
            X.Inz r0 = new X.Inz
            r0.<init>(r12, r6, r7, r8)
            r19 = r13
            r20 = r0
            r23 = r4
            r24 = r4
            r19.A02(r20, r21, r23, r24)
            X.7Kx r0 = r1.A04
            int r0 = r0.A09
            r13.setPillColor(r0)
        L_0x00c4:
            java.lang.String r12 = r6.A07
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r12 == 0) goto L_0x02d5
            r0.setText(r12)
            r0.setVisibility(r4)
        L_0x00d0:
            java.lang.String r0 = r6.A05
            com.instagram.igds.components.button.IgdsButton r13 = r8.A08
            if (r0 == 0) goto L_0x02d0
            r13.setVisibility(r4)
            r13.setText((java.lang.String) r0)
            int r0 = X.C51968G9o.A04(r18)
            r13.setTextColor(r0)
            X.7Fr r0 = r6.A02
            if (r0 == 0) goto L_0x0118
            java.util.List r0 = r0.A0b
            if (r0 == 0) goto L_0x0118
            java.lang.Object r12 = r0.get(r4)
            X.9JN r12 = (X.AnonymousClass9JN) r12
            if (r12 == 0) goto L_0x0118
            java.lang.String r0 = r12.A06
            if (r0 == 0) goto L_0x00fc
            r0 = 20
            X.C71399Ojy.A00(r13, r6, r7, r12, r0)
        L_0x00fc:
            java.lang.Object r0 = r12.A00
            java.lang.Number r0 = (java.lang.Number) r0
            r12 = 6
            if (r0 == 0) goto L_0x02c7
            int r0 = r0.intValue()
            if (r0 != r12) goto L_0x02c7
            int r0 = X.C51972G9s.A08(r18)
            r13.setIconPadding(r0)
            r12 = 2131231566(0x7f08034e, float:1.8079217E38)
            X.4lx r0 = X.C273084lx.START
            r13.A02(r0, r12)
        L_0x0118:
            com.instagram.common.ui.base.IgSimpleImageView r0 = r8.A02
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r8.A04
            r0.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A06
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r8.A03
            r0.setVisibility(r2)
            X.MzZ r8 = r5.A03
            android.view.View r0 = X.JTO.A0F(r8)
            r17 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 + r17
            r0.setElevation(r11)
            r0.setOutlineProvider(r10)
            android.view.View r0 = r8.itemView
            r20 = r0
            android.graphics.drawable.Drawable r10 = r8.A01
            X.0qQ.A0B(r1, r4)
            X.0qQ.A0B(r10, r3)
            X.7Kz r0 = r1.A06
            X.7Ky r12 = r0.A0A
            android.content.Context r0 = r0.A09
            r19 = r0
            X.0qQ.A0B(r0, r4)
            java.util.WeakHashMap r11 = X.C331277Qg.A06
            java.lang.Object r13 = r11.get(r10)
            X.7Qg r13 = (X.C331277Qg) r13
            if (r13 == 0) goto L_0x01a2
            boolean r0 = X.AnonymousClass3HA.A00(r19)
            if (r0 == 0) goto L_0x0169
            boolean r0 = r12.A0A
            r14 = 1
            if (r0 == 0) goto L_0x016a
        L_0x0169:
            r14 = 0
        L_0x016a:
            com.instagram.direct.model.DirectThreadThemeInfo r1 = r12.A09
            if (r1 == 0) goto L_0x02c1
            int[] r0 = X.C329957Kw.A07(r1, r14)
            int r0 = r0.length
            if (r0 == 0) goto L_0x02c1
            java.lang.String r15 = r1.A0o
            java.lang.String r0 = "788274591712841"
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x02c1
            int[] r1 = X.C329957Kw.A07(r1, r14)
            int r0 = r1.length
            int r0 = r0 - r3
            r0 = r1[r0]
        L_0x0187:
            r13.A01(r0)
            android.graphics.drawable.shapes.Shape r13 = r13.A03
            boolean r0 = r13 instanceof X.C308496Um
            if (r0 == 0) goto L_0x01a2
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r13, r0)
            X.6Um r13 = (X.C308496Um) r13
            X.7Fo r1 = X.C328637Fo.NONE
            float r0 = r12.A02
            X.C329977Ky.A01(r13, r1, r12, r0, r0)
        L_0x01a2:
            r0 = r20
            r0.setBackground(r10)
            android.view.View r0 = r8.itemView
            r10 = 1077936128(0x40400000, float:3.0)
            r0.setRotation(r10)
            android.view.View r1 = r8.itemView
            r0 = r18
            float r0 = X.0nA.A00(r0, r10)
            float r0 = -r0
            r1.setTranslationY(r0)
            android.view.View r0 = r8.itemView
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            java.lang.Object r11 = r11.get(r0)
            X.7Qg r11 = (X.C331277Qg) r11
            X.7Fr r12 = r6.A02
            if (r12 == 0) goto L_0x02b6
            X.5FY r10 = r12.A0I
            if (r10 == 0) goto L_0x02b6
            X.7Wq r14 = r7.A07
            if (r14 == 0) goto L_0x02b6
            X.7NT r0 = r14.BeR()
            if (r0 == 0) goto L_0x02b6
            com.instagram.common.session.UserSession r15 = r7.A06
            X.0Tu r13 = X.0Tu.A05
            r0 = 36324312244236256(0x810cc500072fe0, double:3.034979557295713E-306)
            boolean r0 = X.182.A06(r13, r15, r0)
            if (r0 == 0) goto L_0x02b6
            if (r11 == 0) goto L_0x01f2
            X.763 r1 = r11.A04
            if (r1 == 0) goto L_0x01f2
            r0 = 255(0xff, float:3.57E-43)
            r1.setAlpha(r0)
        L_0x01f2:
            X.7NT r0 = r14.BeR()
            if (r0 == 0) goto L_0x01fe
            X.7NZ r1 = r0.A00
            r0 = r25
            r1.A00 = r0
        L_0x01fe:
            X.7NT r19 = r14.BeR()
            if (r19 == 0) goto L_0x0231
            android.view.View r1 = r8.itemView
            r21 = 0
            com.instagram.model.direct.messageid.DirectMessageIdentifier r0 = r12.A0L
            java.lang.String r0 = r0.A01
            boolean r29 = r12.CU2()
            X.5FV r12 = r10.A00
            if (r12 != 0) goto L_0x0216
            X.5FV r12 = X.AnonymousClass5FV.None
        L_0x0216:
            if (r11 == 0) goto L_0x021c
            X.763 r10 = r11.A04
            r16 = r10
        L_0x021c:
            r20 = r18
            r22 = r1
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r16
            r27 = r12
            r28 = r0
            r30 = r4
            r19.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x0231:
            java.lang.Integer r0 = r6.A03
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A02
            if (r0 == 0) goto L_0x02b2
            int r0 = r0.intValue()
            r1.setImageResource(r0)
            r1.setVisibility(r4)
        L_0x0241:
            java.lang.String r1 = r6.A09
            com.instagram.common.ui.base.IgTextView r0 = r8.A04
            if (r1 == 0) goto L_0x02ae
            r0.setTextColor(r9)
            r0.setText(r1)
            r0.setVisibility(r4)
        L_0x0250:
            java.lang.String r1 = r6.A0A
            com.instagram.common.ui.base.IgTextView r0 = r8.A05
            if (r1 == 0) goto L_0x02aa
            r0.setTextColor(r9)
            r0.setText(r1)
            r0.setVisibility(r4)
        L_0x025f:
            java.lang.String r1 = r6.A08
            com.instagram.common.ui.base.IgTextView r0 = r8.A03
            if (r1 == 0) goto L_0x02a6
            r0.setTextColor(r9)
            r0.setText(r1)
            r0.setVisibility(r4)
        L_0x026e:
            java.util.List r13 = r6.A0B
            if (r13 == 0) goto L_0x0334
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x0334
            com.instagram.common.ui.widget.imageview.IgImageView r9 = r8.A06
            r9.setVisibility(r4)
            com.instagram.common.session.UserSession r11 = r7.A06
            X.0Tu r10 = X.0Tu.A05
            r0 = 36324312244170719(0x810cc500062fdf, double:3.034979557254267E-306)
            boolean r0 = X.182.A06(r10, r11, r0)
            if (r0 == 0) goto L_0x02e4
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x0294:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x033a
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r10.add(r0)
            goto L_0x0294
        L_0x02a6:
            r0.setVisibility(r2)
            goto L_0x026e
        L_0x02aa:
            r0.setVisibility(r2)
            goto L_0x025f
        L_0x02ae:
            r0.setVisibility(r2)
            goto L_0x0250
        L_0x02b2:
            r1.setVisibility(r2)
            goto L_0x0241
        L_0x02b6:
            if (r11 == 0) goto L_0x0231
            X.763 r0 = r11.A04
            if (r0 == 0) goto L_0x0231
            r0.setAlpha(r4)
            goto L_0x0231
        L_0x02c1:
            int r0 = X.DbU.A01(r19)
            goto L_0x0187
        L_0x02c7:
            X.4lx r12 = X.C273084lx.END
            r0 = r16
            r13.setIcon(r0, r12)
            goto L_0x0118
        L_0x02d0:
            r13.setVisibility(r2)
            goto L_0x0118
        L_0x02d5:
            r0.setVisibility(r2)
            goto L_0x00d0
        L_0x02da:
            r13.A01()
            goto L_0x00c4
        L_0x02df:
            r13.setVisibility(r2)
            goto L_0x00c4
        L_0x02e4:
            java.util.ArrayList r12 = X.AnonymousClass7TG.A0r(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x02ec:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02fe
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.DbS.A0V(r0)
            r12.add(r0)
            goto L_0x02ec
        L_0x02fe:
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r11 = r1.getDimensionPixelSize(r0)
            X.0iw r0 = r7.A00
            java.lang.String r10 = r0.getModuleName()
            X.ON3 r1 = new X.ON3
            r0 = r18
            r1.<init>(r0, r10, r12, r11)
            r1.A0B = r3
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A07 = r0
            r0 = r17
            r1.A00 = r0
            r1.A01(r4)
            r1.A0G = r3
            r1.A0C = r4
            r0 = 5
            r1.A01 = r0
            X.3b0 r0 = r1.A00()
            r9.setImageDrawable(r0)
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = r8.A09
            goto L_0x035d
        L_0x0334:
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r0 = r8.A09
            r0.setVisibility(r2)
            goto L_0x035b
        L_0x033a:
            com.instagram.igds.components.faceswarm.IgdsFaceSwarm r9 = r8.A09
            r9.setVisibility(r4)
            int r4 = r10.size()
            android.content.res.Resources r1 = r18.getResources()
            r0 = 2131165286(0x7f070066, float:1.7944785E38)
            if (r4 != r3) goto L_0x034f
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
        L_0x034f:
            int r0 = r1.getDimensionPixelSize(r0)
            r9.setCustomSizePx(r0)
            X.0iw r0 = r7.A00
            r9.setImageUrls(r10, r0)
        L_0x035b:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r8.A06
        L_0x035d:
            r0.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r0 = r8.A08
            r0.setVisibility(r2)
            com.instagram.direct.ui.countdowntimer.CountdownTimerPill r0 = r8.A07
            r0.setVisibility(r2)
            X.7DZ r0 = r7.A04
            if (r0 == 0) goto L_0x002a
            r0.A02(r5, r6)
            return
        L_0x0372:
            r0 = r16
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72566PAx.ADp(X.NYM, X.MzX):void");
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        0qQ.A0B(layoutInflater, 1);
        C68066MzX mzX = new C68066MzX(DbU.A09(layoutInflater, viewGroup, R.layout.direct_two_card_xma_message, false));
        AnonymousClass7DZ r0 = this.A04;
        if (r0 != null) {
            r0.A00(mzX);
        }
        return mzX;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass7DZ r0 = this.A04;
        if (r0 != null) {
            r0.A01(r2);
        }
    }
}
