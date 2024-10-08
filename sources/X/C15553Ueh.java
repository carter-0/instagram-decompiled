package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Ueh  reason: case insensitive filesystem */
public final class C15553Ueh extends C231632rz {
    public final int A00 = 3;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final JPQ A04;
    public final X4A A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public C15553Ueh(Context context, AnonymousClass0iw r4, UserSession userSession, JPQ jpq, X4A x4a, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A05 = x4a;
        this.A07 = z;
        this.A08 = z2;
        this.A04 = jpq;
        this.A02 = r4;
        this.A06 = z3;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0172, code lost:
        if (r18 != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x018e, code lost:
        if ((!r18) != false) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01b9, code lost:
        r0 = 128;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bindView(int r35, android.view.View r36, java.lang.Object r37, java.lang.Object r38) {
        /*
            r34 = this;
            r2 = r37
            r5 = r38
            r0 = 859439001(0x3339ff99, float:4.3306134E-8)
            int r20 = X.AnonymousClass0fD.A03(r0)
            r1 = r36
            X.AnonymousClass7TG.A1O(r1, r2)
            r6 = 3
            X.0qQ.A0B(r5, r6)
            X.6u8 r5 = (X.AnonymousClass6u8) r5
            r4 = r34
            com.instagram.common.session.UserSession r0 = r4.A03
            r24 = r0
            java.lang.Object r1 = r1.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.ui.rows.editablemediagrid.EditableMediaGridRowViewBinder.Holder"
            X.0qQ.A0C(r1, r0)
            X.VaY r1 = (X.C17580VaY) r1
            X.71g r2 = (X.C3251571g) r2
            X.X4A r0 = r4.A05
            r33 = r0
            boolean r7 = r5.A04
            boolean r0 = r5.A03
            r19 = r0
            boolean r0 = r4.A07
            r18 = r0
            boolean r0 = r4.A08
            r30 = r0
            X.JPQ r3 = r4.A04
            int r0 = r5.A00
            r28 = r0
            X.0iw r0 = r4.A02
            r23 = r0
            boolean r0 = r4.A06
            r17 = r0
            r5 = 0
            r0 = r24
            boolean r4 = X.AnonymousClass7TF.A1U(r5, r0, r1)
            r9 = 2
            X.0qQ.A0B(r2, r9)
            r0 = r33
            X.0qQ.A0B(r0, r6)
            r6 = 8
            r0 = r23
            X.C51969G9p.A1N(r3, r6, r0)
            android.view.View r8 = r1.A00
            if (r8 == 0) goto L_0x01f5
            int r0 = X.C13990Tnq.A08(r8, r7)
            X.0nA.A0X(r8, r0)
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x01f5
            r0.setImportantForAccessibility(r9)
            java.util.List r0 = r1.A01
            r32 = r0
            int r16 = r32.size()
            r7 = 0
        L_0x007b:
            r0 = r16
            if (r7 >= r0) goto L_0x01ec
            r0 = r32
            java.lang.Object r9 = r0.get(r7)
            com.instagram.igds.components.imagebutton.IgImageButton r9 = (com.instagram.igds.components.imagebutton.IgImageButton) r9
            int r0 = r2.A01()
            if (r7 < r0) goto L_0x00e8
            X.C321466uD.A04(r9)
            java.util.List r0 = r1.A02
            java.lang.Object r8 = X.00k.A0O(r0, r7)
            android.view.View r8 = (android.view.View) r8
            r10 = 0
            r9 = 4
            if (r8 == 0) goto L_0x00aa
            r8.setVisibility(r9)
            r8.setClickable(r5)
            r8.setOnClickListener(r10)
            r0 = 85
            X.0nA.A0W(r8, r0)
        L_0x00aa:
            java.util.List r0 = r1.A03
            java.lang.Object r8 = X.00k.A0O(r0, r7)
            X.3oV r8 = (X.C252063oV) r8
            if (r8 == 0) goto L_0x00c5
            r8.setVisibility(r9)
            android.view.View r0 = r8.getView()
            r0.setClickable(r5)
            android.view.View r0 = r8.getView()
            r0.setOnClickListener(r10)
        L_0x00c5:
            java.util.List r0 = r1.A04
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00d8
            r0.setVisibility(r9)
            r0.setClickable(r5)
            r0.setOnClickListener(r10)
        L_0x00d8:
            java.util.List r0 = r1.A05
            java.lang.Object r0 = X.00k.A0O(r0, r7)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00e5
            r0.setVisibility(r9)
        L_0x00e5:
            int r7 = r7 + 1
            goto L_0x007b
        L_0x00e8:
            java.lang.Object r11 = r2.A02(r7)
            X.1Xj r11 = (X.1Xj) r11
            java.util.List r0 = r1.A02
            java.lang.Object r8 = r0.get(r7)
            android.widget.CompoundButton r8 = (android.widget.CompoundButton) r8
            r0 = 85
            X.0nA.A0W(r8, r0)
            r22 = 0
            r10 = 25
            X.ID2 r0 = new X.ID2
            r0.<init>((int) r10, (java.lang.Object) r3, (java.lang.Object) r11)
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            r21 = r0
            r25 = r11
            r26 = r9
            r29 = r7
            r31 = r5
            X.C321466uD.A03(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r0 = r19 ^ 1
            r9.setEnableTouchOverlay(r0)
            if (r19 == 0) goto L_0x01e2
            java.util.List r0 = r1.A03
            java.lang.Object r10 = r0.get(r7)
            X.3oV r10 = (X.C252063oV) r10
            java.util.List r0 = r1.A04
            java.lang.Object r14 = r0.get(r7)
            android.view.View r14 = (android.view.View) r14
            java.util.List r0 = r1.A05
            java.lang.Object r13 = r0.get(r7)
            android.view.View r13 = (android.view.View) r13
            r0 = r33
            X.V2M r12 = r0.Bs0(r11)
            if (r17 == 0) goto L_0x01df
            r0 = 13
            X.Inq r15 = new X.Inq
            r15.<init>(r0, r3, r11)
        L_0x0141:
            r8.setVisibility(r5)
            if (r15 == 0) goto L_0x0151
            r14.setVisibility(r5)
            r0 = 21
            X.WB9.A00(r14, r0, r15)
            r14.setClickable(r4)
        L_0x0151:
            r13.setVisibility(r5)
            X.GIa r14 = com.instagram.igds.components.gradient.IGGradientView.A00
            android.graphics.drawable.GradientDrawable$Orientation r11 = android.graphics.drawable.GradientDrawable.Orientation.TR_BL
            r0 = 38
            android.graphics.drawable.GradientDrawable r0 = r14.A01(r11, r0)
            r13.setBackground(r0)
            X.Ulo r0 = X.C15972Ulo.A00
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 == 0) goto L_0x017b
            r10.setVisibility(r6)
            r8.setVisibility(r5)
            r8.setChecked(r5)
        L_0x0172:
            if (r18 == 0) goto L_0x01b9
        L_0x0174:
            r0 = 255(0xff, float:3.57E-43)
        L_0x0176:
            r9.setImageAlpha(r0)
            goto L_0x00e5
        L_0x017b:
            X.Ulq r0 = X.C15974Ulq.A00
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 == 0) goto L_0x0191
            r10.setVisibility(r6)
            r8.setVisibility(r5)
            r8.setChecked(r4)
        L_0x018c:
            r0 = r18 ^ 1
            if (r0 == 0) goto L_0x01b9
            goto L_0x0174
        L_0x0191:
            boolean r0 = r12 instanceof X.C15971Uln
            java.lang.String r11 = "null cannot be cast to non-null type com.instagram.common.ui.drawables.NumberedCircleDrawable"
            if (r0 == 0) goto L_0x01bc
            r10.setVisibility(r5)
            android.view.View r0 = r10.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r10 = r0.getDrawable()
            X.0qQ.A0C(r10, r11)
            X.6uG r10 = (X.C321486uG) r10
            X.Uln r12 = (X.C15971Uln) r12
            int r0 = r12.A00
            r10.A00(r0)
            r10.A04 = r4
            r10.invalidateSelf()
            r8.setVisibility(r6)
            goto L_0x018c
        L_0x01b9:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0176
        L_0x01bc:
            X.Ulp r0 = X.C15973Ulp.A00
            boolean r0 = X.0qQ.A0K(r12, r0)
            if (r0 == 0) goto L_0x01e6
            r10.setVisibility(r5)
            android.view.View r0 = r10.getView()
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            X.0qQ.A0C(r0, r11)
            X.6uG r0 = (X.C321486uG) r0
            r0.A04 = r5
            r0.invalidateSelf()
            r8.setVisibility(r6)
            goto L_0x0172
        L_0x01df:
            r15 = 0
            goto L_0x0141
        L_0x01e2:
            r8.setVisibility(r6)
            goto L_0x0174
        L_0x01e6:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01ec:
            r1 = -649451057(0xffffffffd94a29cf, float:-3.55649465E15)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x01f5:
            java.lang.String r0 = "view"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15553Ueh.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-593301092);
        Context context = this.A01;
        int i2 = this.A00;
        0qQ.A0B(context, 0);
        LinearLayout linearLayout = new LinearLayout(context);
        C17580VaY vaY = new C17580VaY(i2);
        vaY.A00 = linearLayout;
        linearLayout.setId(R.id.media_set_row_content_identifier);
        for (int i3 = 0; i3 < i2; i3++) {
            View A09 = DbW.A09(LayoutInflater.from(context), linearLayout, R.layout.selectable_grid_item, false);
            vaY.A01.add(AnonymousClass7TE.A0b(A09, R.id.image_button));
            vaY.A02.add(AnonymousClass7TE.A0b(A09, R.id.media_toggle));
            List list = vaY.A03;
            C252063oV A0Y = DbU.A0Y(A09, R.id.selection_indicator_stub);
            A0Y.EeU(new C64885Ljl(context, 6));
            list.add(A0Y);
            vaY.A04.add(AnonymousClass7TE.A0b(A09, R.id.selection_click_overlay));
            vaY.A05.add(AnonymousClass7TE.A0b(A09, R.id.gradient_background));
            if (i3 < i2 - 1) {
                DbX.A0H(A09).rightMargin = C13989Tnp.A0B(context);
            }
            linearLayout.addView(A09);
        }
        linearLayout.setTag(vaY);
        AnonymousClass0fD.A0A(-165906181, A032);
        return linearLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
