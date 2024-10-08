package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mmb  reason: case insensitive filesystem */
public final class C67359Mmb extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C231672s5 A03;
    public final WW4 A04;
    public final XBt A05;
    public final X41 A06;
    public final X9Q A07;
    public final boolean A08 = true;
    public final boolean A09;
    public final boolean A0A;

    public C67359Mmb(Context context, AnonymousClass0iw r4, UserSession userSession, C231672s5 r6, WW4 ww4, XBt xBt, X41 x41, X9Q x9q, boolean z, boolean z2) {
        DbW.A1O(x9q, 4, userSession);
        this.A01 = r4;
        this.A00 = context;
        this.A04 = ww4;
        this.A07 = x9q;
        this.A06 = x41;
        this.A02 = userSession;
        this.A03 = r6;
        this.A05 = xBt;
        this.A09 = z;
        this.A0A = z2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.instagram.common.ui.widget.imageview.IgImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: com.instagram.igds.components.imagebutton.IgImageButton} */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013d, code lost:
        if (r11 == 0) goto L_0x013f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r29, X.C249703kE r30) {
        /*
            r28 = this;
            r8 = r30
            r9 = r29
            X.5qs r9 = (X.C296925qs) r9
            X.Mme r8 = (X.C67362Mme) r8
            r12 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r12, r9, r8)
            X.5qq r15 = r9.A02
            r1 = r28
            X.XBt r0 = r1.A05
            X.5qz r6 = r0.B9n(r9)
            X.X41 r0 = r1.A06
            com.instagram.discovery.ui.FixedAspectRatioVideoLayout r5 = r8.A06
            r18 = r6
            r19 = r15
            r20 = r9
            r21 = r7
            r16 = r0
            r17 = r5
            r16.ECL(r17, r18, r19, r20, r21)
            X.WW4 r0 = r1.A04
            r22 = r0
            android.content.Context r10 = r1.A00
            com.instagram.common.session.UserSession r0 = r1.A02
            r27 = r0
            X.0iw r11 = r1.A01
            X.X9Q r0 = r1.A07
            r26 = r0
            X.2s5 r14 = r1.A03
            boolean r13 = r1.A09
            boolean r0 = r1.A0A
            r19 = r0
            boolean r0 = r1.A08
            r18 = r0
            r0 = r22
            X.0qQ.A0B(r0, r12)
            X.0qQ.A0B(r10, r7)
            r4 = 2
            r1 = r27
            r0 = r26
            X.C51973G9u.A0s(r4, r1, r11, r0)
            r0 = 9
            X.0qQ.A0B(r14, r0)
            X.5oy r3 = r9.A01
            X.4bN r0 = r3.A00()
            X.1Xj r2 = r0.A02
            if (r2 == 0) goto L_0x0109
            r5.setVideoSource(r2, r11)
            int r0 = r15.A02
            if (r0 != r7) goto L_0x012d
            int r1 = r15.A04
            if (r1 != r4) goto L_0x012d
            r1 = 1056796836(0x3efd70a4, float:0.495)
        L_0x0073:
            r5.setAspectRatio(r1)
            r16 = 1056796836(0x3efd70a4, float:0.495)
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0082
            r1 = r22
            r1.A0C(r5)
        L_0x0082:
            r1 = r26
            boolean r17 = r1.CcR(r2)
            com.instagram.igds.components.imagebutton.IgImageButton r1 = r8.A07
            if (r0 != r7) goto L_0x0129
            int r0 = r15.A04
            if (r0 != r4) goto L_0x0129
            r0 = 1056796836(0x3efd70a4, float:0.495)
        L_0x0093:
            r1.A00 = r0
            X.TuN r0 = new X.TuN
            r20 = r0
            r21 = r12
            r23 = r9
            r24 = r2
            r25 = r6
            r20.<init>(r21, r22, r23, r24, r25)
            r1.A0E = r0
            r1.A0I = r14
            boolean r0 = r2.A4o()
            if (r0 == 0) goto L_0x0124
            android.net.Uri r14 = r2.A05
            if (r14 == 0) goto L_0x0122
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r14 = X.C253833rU.A00(r14, r0, r0)
        L_0x00b7:
            r16 = 0
            if (r14 == 0) goto L_0x010a
            r1.A0F(r11, r14, r13)
        L_0x00be:
            if (r17 != 0) goto L_0x00c2
            if (r14 != 0) goto L_0x00c4
        L_0x00c2:
            r16 = 8
        L_0x00c4:
            r0 = r16
            r1.setVisibility(r0)
            boolean r14 = X.C321536uL.A02(r27)
            X.1se r0 = X.1sd.A00(r27)
            boolean r0 = r0.A05(r2)
            if (r0 == 0) goto L_0x0131
            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.A05
            r7 = 8
            r0.setVisibility(r7)
            r0 = 0
            r5.setOnClickListener(r0)
            r1.setOnClickListener(r0)
            r1.setOnTouchListener(r0)
            r3 = 17
            X.ID2 r4 = new X.ID2
            r0 = r22
            r4.<init>((int) r3, (java.lang.Object) r0, (java.lang.Object) r2)
            if (r14 == 0) goto L_0x00f8
            X.2eb r0 = r8.A00
            r0.A03(r7)
        L_0x00f8:
            r26.ECU()
            int r3 = r6.A01
            int r0 = r6.A00
            r13 = r12
            r7 = r4
            r8 = r11
            r9 = r2
            r10 = r1
            r11 = r3
            r12 = r0
            X.OSK.A00(r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0109:
            return
        L_0x010a:
            X.0wj r15 = X.0wj.A01
            r13 = 817901795(0x30c030e3, float:1.3983733E-9)
            java.lang.String r0 = "Null image url for clips grid image preview binding"
            X.0f9 r15 = r15.AEf(r0, r13)
            boolean r13 = r2.A4o()
            java.lang.String r0 = "hasLocalBitmap"
            r15.ABR(r0, r13)
            r15.report()
            goto L_0x00be
        L_0x0122:
            r14 = 0
            goto L_0x00b7
        L_0x0124:
            com.instagram.model.mediasize.ExtendedImageUrl r14 = r2.A1n(r10)
            goto L_0x00b7
        L_0x0129:
            float r0 = r15.A00
            goto L_0x0093
        L_0x012d:
            float r1 = r15.A00
            goto L_0x0073
        L_0x0131:
            r1.A0H()
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x013f
            int r11 = r0.length()
            r0 = 0
            if (r11 != 0) goto L_0x0140
        L_0x013f:
            r0 = 1
        L_0x0140:
            r13 = r0 ^ 1
            r11 = 8
            if (r14 == 0) goto L_0x01a8
            X.2eb r0 = r8.A00
            r0.A03(r11)
            X.Mmc r12 = X.C67361Mmd.A08
            X.5j6 r11 = X.C292525j6.TOP_RIGHT_CIRCLE
            X.5j7 r0 = r3.A01()
            X.Mmd r10 = r12.A00(r10, r11, r0, r13)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A05
            int r0 = r10.A02
            r3.setVisibility(r0)
            android.widget.ImageView r3 = r8.A01
            int r0 = r10.A01
            r3.setVisibility(r0)
            int r0 = r10.A00
            r3.setImageResource(r0)
            X.2dQ r0 = r10.A04
            r3.setLayoutParams(r0)
        L_0x016f:
            r11 = 12
            X.Ojz r3 = new X.Ojz
            r10 = r3
            r12 = r6
            r13 = r9
            r14 = r8
            r15 = r22
            r10.<init>((int) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (java.lang.Object) r15)
            X.AnonymousClass0fU.A00(r3, r5)
            X.Oka r0 = new X.Oka
            r10 = r0
            r11 = r7
            r12 = r15
            r13 = r27
            r14 = r6
            r15 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            r5.setOnTouchListener(r0)
            X.AnonymousClass0fU.A00(r3, r1)
            X.Oka r0 = new X.Oka
            r10 = r0
            r11 = r4
            r10.<init>(r11, r12, r13, r14, r15)
            r1.setOnTouchListener(r0)
            r0 = r26
            r0.E6t(r8, r2)
            int r4 = r6.A01
            int r3 = r6.A00
            X.C246673ez.A05(r1, r13, r2, r4, r3)
            return
        L_0x01a8:
            X.5j7 r14 = r3.A01()
            X.5j7 r0 = X.C292535j7.MINOR
            if (r14 != r0) goto L_0x0223
            X.5j6 r14 = r3.A06
            if (r14 == 0) goto L_0x02ee
            X.5j6 r0 = X.C292525j6.BOTTOM_WITH_TOP_RIGHT_ICON
            if (r14 == r0) goto L_0x0223
            X.5j6 r0 = X.C292525j6.TOP_RIGHT_ICON
            if (r14 == r0) goto L_0x0223
            X.5j6 r0 = X.C292525j6.BOTTOM
            if (r14 == r0) goto L_0x0223
            X.Mmc r15 = X.C67361Mmd.A08
            X.5j6 r14 = X.C292525j6.NO_DESIGN
            X.5j7 r0 = r3.A01()
            X.Mmd r0 = r15.A00(r10, r14, r0, r13)
            androidx.constraintlayout.widget.ConstraintLayout r3 = r8.A05
            int r0 = r0.A02
            r3.setVisibility(r0)
            if (r19 == 0) goto L_0x020e
            X.1Xy r0 = r2.A0C
            java.lang.Integer r14 = r0.Bd0()
            if (r14 != 0) goto L_0x01e3
            X.1Xy r0 = r2.A0C
            java.lang.Integer r14 = r0.CEg()
        L_0x01e3:
            X.0w6 r3 = r8.A09
            X.0YZ[] r15 = X.C67362Mme.A0B
            r0 = r15[r12]
            java.lang.Object r13 = r3.CDM(r8, r0)
            android.view.View r13 = (android.view.View) r13
            X.2eb r10 = r8.A00
            if (r14 == 0) goto L_0x0217
            X.0w6 r3 = r8.A08
            r0 = r15[r7]
            java.lang.Object r3 = r3.CDM(r8, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            android.content.res.Resources r0 = r13.getResources()
            java.lang.String r0 = X.C14066TpE.A01(r0, r14, r12)
            r3.setText(r0)
            r13.setVisibility(r12)
            r10.A03(r11)
        L_0x020e:
            X.2eb r0 = r8.A00
            if (r18 == 0) goto L_0x021e
            r0.A03(r11)
            goto L_0x016f
        L_0x0217:
            r13.setVisibility(r11)
            r10.A03(r12)
            goto L_0x020e
        L_0x021e:
            r0.A03(r12)
            goto L_0x016f
        L_0x0223:
            X.Mmc r14 = X.C67361Mmd.A08
            X.5j6 r12 = r3.A06
            if (r12 == 0) goto L_0x02ee
            X.5j7 r0 = r3.A01()
            X.Mmd r13 = r14.A00(r10, r12, r0, r13)
            androidx.constraintlayout.widget.ConstraintLayout r12 = r8.A05
            int r0 = r13.A02
            r12.setVisibility(r0)
            android.widget.ImageView r12 = r8.A01
            if (r18 == 0) goto L_0x02dd
            r12.setVisibility(r11)
        L_0x023f:
            java.lang.String r0 = r3.A0B
            r16 = r0
            r14 = 8
            if (r0 == 0) goto L_0x024f
            int r15 = r3.A01
            if (r15 <= 0) goto L_0x02b1
            int r0 = r3.A00
            if (r0 < r15) goto L_0x02b1
        L_0x024f:
            android.widget.TextView r0 = r8.A03
            r0.setVisibility(r11)
        L_0x0254:
            java.lang.String r0 = r3.A08
            r15 = 8
            if (r0 == 0) goto L_0x02ab
            android.widget.ImageView r14 = r8.A02
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0263
            r15 = 0
        L_0x0263:
            r14.setVisibility(r15)
            int r0 = X.2Yu.A0A(r10)
            X.DbU.A14(r10, r14, r0)
            X.2dQ r0 = r13.A07
            r14.setLayoutParams(r0)
        L_0x0272:
            java.lang.String r0 = r3.A08
            r14 = 8
            android.widget.TextView r10 = r8.A04
            if (r0 == 0) goto L_0x02a7
            r10.setText(r0)
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x0288
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0288
            r14 = 0
        L_0x0288:
            r10.setVisibility(r14)
            android.graphics.Typeface r0 = android.graphics.Typeface.defaultFromStyle(r7)
            r10.setTypeface(r0)
            X.2dQ r0 = r13.A06
            r10.setLayoutParams(r0)
        L_0x0297:
            X.2eb r0 = r8.A00
            r0.A03(r11)
            X.5oz r3 = r3.A05
            X.5oz r0 = X.C295835oz.CREATOR_INSPIRATION
            if (r3 != r0) goto L_0x016f
            r12.setVisibility(r11)
            goto L_0x016f
        L_0x02a7:
            r10.setVisibility(r11)
            goto L_0x0297
        L_0x02ab:
            android.widget.ImageView r0 = r8.A02
            r0.setVisibility(r11)
            goto L_0x0272
        L_0x02b1:
            android.widget.TextView r15 = r8.A03
            r0 = r16
            r15.setText(r0)
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x02c3
            int r0 = r0.length()
            if (r0 == 0) goto L_0x02c3
            r14 = 0
        L_0x02c3:
            r15.setVisibility(r14)
            int r0 = r13.A03
            r15.setTextAppearance(r0)
            android.content.Context r14 = X.AnonymousClass7TE.A0S(r15)
            int r0 = X.2Yu.A0A(r14)
            X.DbT.A17(r14, r15, r0)
            X.2dQ r0 = r13.A05
            r15.setLayoutParams(r0)
            goto L_0x0254
        L_0x02dd:
            int r0 = r13.A01
            r12.setVisibility(r0)
            int r0 = r13.A00
            r12.setImageResource(r0)
            X.2dQ r0 = r13.A04
            r12.setLayoutParams(r0)
            goto L_0x023f
        L_0x02ee:
            java.lang.String r0 = "design"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67359Mmb.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C296925qs.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        AnonymousClass0YZ[] r0 = C67362Mme.A0B;
        return new C67362Mme(2Su.A00(layoutInflater, (ViewGroup.LayoutParams) null, viewGroup, R.layout.layout_grid_item_clips));
    }
}
