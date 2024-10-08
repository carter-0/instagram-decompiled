package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.PAq  reason: case insensitive filesystem */
public final class C72559PAq implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C72491P8a A02;
    public final AnonymousClass7DZ A03;
    public final AnonymousClass7XR A04;
    public final AnonymousClass9HC A05;

    public C72559PAq(AnonymousClass0iw r10, UserSession userSession, AnonymousClass7XR r12, AnonymousClass9HC r13, C72491P8a p8a) {
        0qQ.A0B(p8a, 5);
        this.A04 = r12;
        this.A05 = r13;
        this.A00 = r10;
        this.A01 = userSession;
        this.A02 = p8a;
        P8C p8c = new P8C(userSession, (AnonymousClass7Wt) r12);
        AnonymousClass7DT r3 = new AnonymousClass7DT(r12);
        AnonymousClass7DV r4 = new AnonymousClass7DV((AnonymousClass7XX) r12, r13.A1X);
        AnonymousClass7DX r1 = new AnonymousClass7DX((AnonymousClass7XN) r12);
        this.A03 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(new C3266077l(r1, p8c, r3, r4, (C333107Xr) r12, r13, (C3266177m) null, false)));
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBV pbv = new PBV(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_portrait_video_share_message, false));
        this.A03.A00(pbv);
        return pbv;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r6) {
        0qQ.A0B(r6, 0);
        C72491P8a p8a = this.A02;
        if (!182.A06(0Tu.A05, p8a.A00, 2342159139545288697L)) {
            ((C388979oh) p8a.A01).A00.A03("scroll");
        }
        this.A03.A01(r6);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0126, code lost:
        if (r12 != null) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0190, code lost:
        if (r0.length() != 0) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r24, X.AnonymousClass7FW r25) {
        /*
            r23 = this;
            r7 = r25
            r8 = r24
            X.PBV r8 = (X.PBV) r8
            X.NYb r7 = (X.C68817NYb) r7
            r9 = 0
            boolean r12 = X.AnonymousClass7TF.A1U(r9, r8, r7)
            r22 = r23
            r0 = r22
            X.P8a r0 = r0.A02
            r18 = r0
            r0 = r22
            X.0iw r10 = r0.A00
            com.instagram.common.session.UserSession r11 = r0.A01
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A08
            r21 = r0
            r21.A04()
            android.widget.ImageView r0 = r8.A01
            r20 = r0
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r5 = r8.A03
            r5.setVisibility(r1)
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r8.A06
            r19 = r0
            r0.setVisibility(r1)
            android.widget.TextView r6 = r8.A04
            r6.setVisibility(r1)
            X.52z r0 = r8.A09
            android.view.ViewGroup r0 = r0.A01
            if (r0 == 0) goto L_0x0045
            r0.setVisibility(r1)
        L_0x0045:
            X.3oV r0 = r8.A07
            r17 = r0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.A02
            r0.setVisibility(r1)
            X.7Fr r4 = r7.A03
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r21.getIgImageView()
            X.7FE r3 = r4.A0C
            X.77D r16 = X.C3265577g.A05(r0, r3)
            X.774 r13 = r4.A0E
            if (r13 == 0) goto L_0x0083
            java.util.List r14 = r13.A0A
            if (r14 == 0) goto L_0x0083
            boolean r0 = X.AnonymousClass7TE.A1b(r14)
            if (r0 == 0) goto L_0x0076
            java.lang.Object r2 = X.00k.A0I(r14)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r0 = r19
            r0.setUrl(r2, r10)
        L_0x0076:
            int r0 = r14.size()
            if (r0 <= r12) goto L_0x0083
            java.lang.String r2 = "PortraitVideoShareContentDefinition"
            java.lang.String r0 = "Header icons size was larger than expected"
            X.0wb.A03(r2, r0)
        L_0x0083:
            r2 = 0
            r14 = 8
            if (r13 == 0) goto L_0x0089
            r14 = 0
        L_0x0089:
            r0 = r19
            r0.setVisibility(r14)
            if (r13 == 0) goto L_0x02f0
            java.lang.CharSequence r0 = r13.A03
        L_0x0092:
            r6.setText(r0)
            java.lang.CharSequence r0 = r6.getText()
            if (r0 == 0) goto L_0x00bb
            android.content.res.Resources r0 = r6.getResources()
            int r15 = X.JTP.A03(r0)
            int r0 = r4.A02
            r14 = 1
            if (r0 == r12) goto L_0x00ac
            r12 = 3
            if (r0 == r12) goto L_0x00ac
            r14 = 0
        L_0x00ac:
            android.content.Context r12 = r5.getContext()
            int r0 = X.2Yu.A05(r12)
            int r0 = r12.getColor(r0)
            X.C244273av.A09(r6, r9, r15, r0, r14)
        L_0x00bb:
            if (r13 == 0) goto L_0x00be
            r1 = 0
        L_0x00be:
            r6.setVisibility(r1)
            X.777 r12 = r4.A0F
            if (r12 == 0) goto L_0x02ed
            boolean r0 = r12 instanceof X.AnonymousClass776
            if (r0 == 0) goto L_0x02f8
            X.776 r12 = (X.AnonymousClass776) r12
        L_0x00cb:
            X.2FW r1 = r7.Aqm()
            X.2FW r0 = X.2FW.A0W
            if (r1 != r0) goto L_0x02dd
            X.N4R r14 = r7.A01
            java.lang.Object r0 = r14.A00
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.model.mediasize.SpritesheetInfo r0 = r0.A1q()
            if (r0 == 0) goto L_0x02dd
            X.0Tu r13 = X.0Tu.A06
            r0 = 36316130331267062(0x81055400030ff6, double:3.0298052825880757E-306)
            boolean r0 = X.182.A06(r13, r11, r0)
            if (r0 == 0) goto L_0x02dd
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r21.getIgImageView()
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x00ff
            if (r12 == 0) goto L_0x00ff
            com.instagram.common.typedurl.ImageUrl r1 = r12.A00
            if (r1 == 0) goto L_0x00ff
            r0 = r21
            r0.setUrl(r1, r10)
        L_0x00ff:
            java.lang.Object r0 = r14.A00
            X.1Xj r0 = (X.1Xj) r0
            com.instagram.model.mediasize.SpritesheetInfo r15 = r0.A1q()
            if (r15 == 0) goto L_0x02f3
            android.content.res.Resources r1 = r21.getResources()
            r0 = 2131165207(0x7f070017, float:1.7944625E38)
            float r14 = X.AnonymousClass7TE.A01(r1, r0)
            r0 = 36597605308042083(0x82055400040b63, double:3.2078111913093565E-306)
            X.182.A01(r13, r11, r0)
            X.PQ8 r1 = new X.PQ8
            r1.<init>(r11, r8)
            X.U1Z r0 = new X.U1Z
            r0.<init>(r15, r1, r14)
            if (r12 == 0) goto L_0x02ea
        L_0x0128:
            java.lang.Integer r0 = r12.A03
            if (r0 == 0) goto L_0x02ea
            int r1 = r0.intValue()
        L_0x0130:
            r0 = r20
            r0.setImageResource(r1)
            if (r12 == 0) goto L_0x02d9
            java.lang.Integer r0 = r12.A03
            if (r0 == 0) goto L_0x02d9
        L_0x013b:
            r0 = r20
            r0.setVisibility(r2)
            X.9Iu r2 = r4.A03
            if (r2 == 0) goto L_0x02cc
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.A05
            android.content.Context r1 = X.AnonymousClass7TE.A0S(r0)
            X.0eM r12 = r8.A0B
            java.lang.Object r0 = r12.getValue()
            X.77G r0 = (X.AnonymousClass77G) r0
            X.AnonymousClass77H.A02(r2, r10, r11, r0)
            java.lang.Object r0 = r12.getValue()
            X.77G r0 = (X.AnonymousClass77G) r0
            X.3Us r3 = X.C3265577g.A01(r1, r3)
            X.0qQ.A07(r3)
            X.0qQ.A0B(r0, r9)
            X.3v7 r2 = r0.A00
            r1 = 0
            r0 = r16
            X.C256013v5.A01(r3, r0, r2, r1, r9)
            java.lang.Object r0 = r12.getValue()
            X.77G r0 = (X.AnonymousClass77G) r0
            X.0qQ.A0B(r0, r9)
            X.3v7 r0 = r0.A00
            X.C256013v5.A04(r0)
        L_0x017b:
            X.74T r1 = r4.A0D
            r0 = 0
            if (r1 == 0) goto L_0x0182
            java.lang.CharSequence r0 = r1.A09
        L_0x0182:
            r5.setText(r0)
            if (r1 == 0) goto L_0x0192
            java.lang.CharSequence r0 = r1.A09
            r1 = 0
            if (r0 == 0) goto L_0x0192
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0194
        L_0x0192:
            r1 = 8
        L_0x0194:
            r5.setVisibility(r1)
            androidx.constraintlayout.widget.ConstraintLayout r11 = r8.A05
            android.content.Context r0 = r11.getContext()
            X.7FE r5 = r7.A02
            X.3Us r0 = X.C3265577g.A01(r0, r5)
            X.0qQ.A07(r0)
            float[] r14 = r0.A01
            X.0qQ.A07(r14)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r4 = r8.A0A
            r13 = r14[r9]
            r0 = 2
            r12 = r14[r0]
            r3 = 4
            r1 = r14[r3]
            r2 = 6
            r0 = r14[r2]
            r4.A01(r13, r12, r1, r0)
            X.N4R r0 = r7.A01
            java.lang.Object r13 = r0.A02
            com.instagram.model.direct.messageid.DirectMessageIdentifier r13 = (com.instagram.model.direct.messageid.DirectMessageIdentifier) r13
            java.lang.Object r0 = r0.A00
            X.1Xj r0 = (X.1Xj) r0
            X.PFJ r12 = new X.PFJ
            r12.<init>(r8, r0, r13)
            r0 = r18
            X.7GO r0 = r0.A02
            r0.A02(r13, r12)
            r0 = r18
            com.instagram.common.session.UserSession r15 = r0.A00
            X.0Tu r14 = X.0Tu.A05
            r0 = 2342159139545419770(0x20810554000a0ffa, double:4.062304729795623E-152)
            boolean r0 = X.182.A06(r14, r15, r0)
            if (r0 != 0) goto L_0x01ed
            r0 = r18
            X.9u1 r0 = r0.A01
            X.9oh r0 = (X.C388979oh) r0
            X.7L3 r0 = r0.A00
            r0.A02(r12, r13)
        L_0x01ed:
            X.O7h r12 = r7.A04
            boolean r13 = r7.CU2()
            if (r12 == 0) goto L_0x023e
            r0 = r17
            r0.setVisibility(r9)
            android.view.View r1 = r17.getView()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            com.instagram.common.typedurl.ImageUrl r0 = r12.A00
            r1.setUrl(r0, r10)
            android.view.View r12 = r17.getView()
            X.4gb r10 = new X.4gb
            r10.<init>()
            r10.A0I(r11)
            int r0 = r12.getId()
            r10.A09(r0, r2)
            int r1 = r12.getId()
            r0 = 7
            r10.A09(r1, r0)
            android.content.res.Resources r1 = X.DbU.A05(r12)
            r0 = 2131165405(0x7f0700dd, float:1.7945026E38)
            int r18 = X.DbS.A03(r1, r0)
            int r14 = r12.getId()
            r15 = 6
            if (r13 == 0) goto L_0x0233
            r15 = 7
        L_0x0233:
            r13 = r10
            r16 = r9
            r17 = r15
            r13.A0E(r14, r15, r16, r17, r18)
            r10.A0G(r11)
        L_0x023e:
            X.Nos r0 = r7.A05
            boolean r0 = r0 instanceof X.Na7
            if (r0 == 0) goto L_0x028e
            X.4gb r1 = new X.4gb
            r1.<init>()
            r1.A0I(r11)
            int r0 = r20.getId()
            r1.A09(r0, r2)
            int r0 = r20.getId()
            r2 = 7
            r1.A0C(r0, r2, r9, r2)
            r1.A0G(r11)
            X.4gb r9 = new X.4gb
            r9.<init>()
            r9.A0I(r11)
            int r1 = r19.getId()
            r0 = 3
            r9.A09(r1, r0)
            int r0 = r6.getId()
            r9.A09(r0, r2)
            int r1 = r19.getId()
            int r0 = r21.getId()
            r9.A0C(r1, r3, r0, r3)
            int r1 = r6.getId()
            int r0 = r21.getId()
            r9.A0C(r1, r2, r0, r2)
            r9.A0G(r11)
        L_0x028e:
            android.view.ViewGroup$LayoutParams r0 = r21.getLayoutParams()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            X.0qQ.A0C(r0, r2)
            X.2dQ r0 = (X.C71492dQ) r0
            java.lang.String r1 = r7.A06
            r0.A0z = r1
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            X.0qQ.A0C(r0, r2)
            X.2dQ r0 = (X.C71492dQ) r0
            r0.A0z = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4.A00 = r0
            int r1 = r7.A00
            r0 = r21
            X.0nA.A0f(r0, r1)
            X.0nA.A0f(r11, r1)
            X.0nA.A0f(r4, r1)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r21.getIgImageView()
            X.77D r0 = X.C3265577g.A05(r1, r5)
            r1.setImageRendererAndReset(r0)
            r0 = r22
            X.7DZ r0 = r0.A03
            r0.A02(r8, r7)
            return
        L_0x02cc:
            X.0eM r0 = r8.A0B
            java.lang.Object r0 = r0.getValue()
            X.77G r0 = (X.AnonymousClass77G) r0
            X.AnonymousClass77H.A03(r0)
            goto L_0x017b
        L_0x02d9:
            r2 = 8
            goto L_0x013b
        L_0x02dd:
            if (r12 == 0) goto L_0x02ea
            com.instagram.common.typedurl.ImageUrl r1 = r12.A00
            if (r1 == 0) goto L_0x0128
            r0 = r21
            r0.setUrl(r1, r10)
            goto L_0x0128
        L_0x02ea:
            r1 = -1
            goto L_0x0130
        L_0x02ed:
            r12 = 0
            goto L_0x00cb
        L_0x02f0:
            r0 = 0
            goto L_0x0092
        L_0x02f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02f8:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid media: "
            java.lang.IllegalStateException r0 = X.C66582MXn.A0k(r12, r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72559PAq.ADp(X.7Db, X.7FW):void");
    }
}
