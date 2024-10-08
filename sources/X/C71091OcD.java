package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout;
import com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OcD  reason: case insensitive filesystem */
public final class C71091OcD {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public View A04;
    public IgTextView A05;
    public TouchInterceptorLinearLayout A06;
    public boolean A07;
    public int A08;
    public int A09;
    public final int A0A;
    public final Context A0B;
    public final ViewGroup A0C;
    public final FrameLayout A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final LNx A0G;
    public final AvatarReactionsRepository A0H;
    public final C74482Pvc A0I;
    public final C70729OHy A0J;
    public final List A0K;
    public final boolean A0L;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void A04() {
        this.A03 = 0;
        List<OFN> list = this.A0K;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (OFN ofn : list) {
            ofn.A02.setAlpha(1.0f);
            A0r.add(C60340gF.A00);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0119, code lost:
        if (r15 == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0275, code lost:
        if (r1 != false) goto L_0x01b8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C71091OcD(android.content.Context r20, android.view.ViewGroup r21, X.AnonymousClass0iw r22, com.instagram.common.session.UserSession r23, X.C74482Pvc r24, X.C70729OHy r25, boolean r26) {
        /*
            r19 = this;
            r3 = r25
            boolean r0 = r3.A04
            r4 = r23
            if (r0 == 0) goto L_0x0153
            X.LNx r2 = new X.LNx
            r2.<init>(r4)
        L_0x000d:
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r1 = X.C331867Sr.A00(r4)
            r0 = 9
            X.0qQ.A0B(r1, r0)
            r11 = r19
            r11.<init>()
            r11.A0F = r4
            r4 = r20
            r11.A0B = r4
            r0 = r24
            r11.A0I = r0
            r11.A0J = r3
            r0 = r21
            r11.A0C = r0
            r0 = r22
            r11.A0E = r0
            r0 = r26
            r11.A0L = r0
            r11.A0G = r2
            r11.A0H = r1
            java.util.List r0 = r3.A01
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.ArrayList r0 = X.C51970G9q.A0m(r0)
            r11.A0K = r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r4)
            int r0 = r0.getScaledTouchSlop()
            r11.A0A = r0
            android.content.Context r13 = r11.A0B
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r13)
            r1 = 2131625340(0x7f0e057c, float:1.8877885E38)
            android.view.ViewGroup r0 = r11.A0C
            r12 = 0
            android.view.View r9 = r10.inflate(r1, r0, r12)
            r0 = 25
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r9, r0)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r0 = 2131432319(0x7f0b137f, float:1.8486392E38)
            android.view.View r0 = r9.findViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout) r0
            r11.A06 = r0
            r0 = 2131432323(0x7f0b1383, float:1.84864E38)
            android.view.View r8 = X.AnonymousClass7TE.A0b(r9, r0)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = 2131432320(0x7f0b1380, float:1.8486394E38)
            android.view.View r7 = X.AnonymousClass7TE.A0b(r9, r0)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6 = 2
            X.C71402Ok1.A00(r7, r6, r11)
            X.OHy r14 = r11.A0J
            java.util.List r0 = r14.A01
            r18 = r0
            java.util.List r0 = X.C51966G9m.A1J(r18)
            int r17 = r0.size()
            r5 = 0
        L_0x0098:
            r0 = r17
            if (r5 >= r0) goto L_0x0156
            java.util.List r0 = X.C51966G9m.A1J(r18)
            java.lang.String r4 = X.AnonymousClass7TE.A19(r0, r5)
            r0 = 2131625337(0x7f0e0579, float:1.887788E38)
            android.view.View r3 = r10.inflate(r0, r8, r12)
            java.lang.String r0 = X.C273654mx.A00(r6)
            X.0qQ.A0C(r3, r0)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r0 = 2131434520(0x7f0b1c18, float:1.8490856E38)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.JTR.A0i(r3, r0)
            X.7fS r0 = X.C317486nL.A04
            com.instagram.common.typedurl.SimpleImageUrl r1 = r0.A04(r4)
            X.0iw r0 = r11.A0E
            r2.setUrl(r1, r0)
            r0 = 2131971320(0x7f134cf8, float:1.9579616E38)
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = X.002.A0R(r4, r0)
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r0 = r11.A0H
            X.JuF r16 = r0.A02(r4)
            boolean r0 = r14.A04
            if (r0 == 0) goto L_0x00f3
            if (r16 == 0) goto L_0x00f3
            android.content.res.Resources r15 = r2.getResources()
            r0 = 2131953492(0x7f130754, float:1.9543457E38)
            java.lang.String r15 = r15.getString(r0)
            r0 = r16
            java.lang.String r0 = r0.A02
            java.lang.String r1 = X.002.A0g(r1, r15, r0)
            X.0qQ.A07(r1)
        L_0x00f3:
            r2.setContentDescription(r1)
            r0 = 1
            X.C71404Ok3.A01(r2, r11, r5, r0)
            r0 = 1072483533(0x3feccccd, float:1.85)
            r11.A00(r10, r2, r7, r0)
            java.util.List r0 = r14.A02
            if (r0 == 0) goto L_0x011b
            java.util.Iterator r1 = r0.iterator()
        L_0x0108:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r15 = r1.next()
            boolean r0 = X.0qQ.A0K(r15, r4)
            if (r0 == 0) goto L_0x0108
            r1 = 1
            if (r15 != 0) goto L_0x011c
        L_0x011b:
            r1 = 0
        L_0x011c:
            boolean r0 = r14.A05
            if (r0 == 0) goto L_0x014a
            X.OkZ r0 = new X.OkZ
            r0.<init>(r5, r12, r2, r11)
            r2.setOnTouchListener(r0)
        L_0x0128:
            if (r1 == 0) goto L_0x0139
            r0 = 2131231732(0x7f0803f4, float:1.8079553E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            r3.setForeground(r0)
            r0 = 81
            r3.setForegroundGravity(r0)
        L_0x0139:
            java.util.List r1 = r11.A0K
            X.OFN r0 = new X.OFN
            r0.<init>(r3, r4)
            r1.add(r0)
            r8.addView(r3)
            int r5 = r5 + 1
            goto L_0x0098
        L_0x014a:
            X.OkQ r0 = new X.OkQ
            r0.<init>((X.C71091OcD) r11, (int) r6)
            r2.setOnLongClickListener(r0)
            goto L_0x0128
        L_0x0153:
            r2 = 0
            goto L_0x000d
        L_0x0156:
            A01(r11)
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x0165
            boolean r0 = r14.A07
            if (r0 != 0) goto L_0x0165
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x0181
        L_0x0165:
            r0 = 2131435730(0x7f0b20d2, float:1.849331E38)
            com.instagram.common.ui.base.IgTextView r1 = X.JTO.A0X(r9, r0)
            r11.A05 = r1
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x0279
            if (r1 == 0) goto L_0x017a
            r0 = 2131960120(0x7f132138, float:1.95569E38)
        L_0x0177:
            X.DbT.A18(r13, r1, r0)
        L_0x017a:
            com.instagram.common.ui.base.IgTextView r0 = r11.A05
            if (r0 == 0) goto L_0x0181
            r0.setVisibility(r12)
        L_0x0181:
            boolean r0 = r14.A03
            if (r0 == 0) goto L_0x0233
            X.Pvc r14 = r11.A0I
            r0 = 2131628667(0x7f0e127b, float:1.8884633E38)
            android.view.View r5 = r10.inflate(r0, r8, r12)
            r0 = 10
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0qQ.A0C(r5, r0)
            r4 = r5
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.instagram.common.session.UserSession r3 = r11.A0F
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326657295923099(0x810ee70000379b, double:3.036462577425238E-306)
            boolean r15 = X.182.A06(r2, r3, r0)
            r0 = 36326657296119710(0x810ee70003379e, double:3.0364625775495754E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            if (r15 == 0) goto L_0x026f
            r0 = 2131238077(0x7f081cbd, float:1.8092423E38)
            X.DbU.A13(r13, r4, r0)
        L_0x01b8:
            android.content.res.Resources r1 = r13.getResources()
            r0 = 2131165295(0x7f07006f, float:1.7944803E38)
            float r1 = X.AnonymousClass7TE.A01(r1, r0)
            r0 = 8
            float[] r15 = new float[r0]
            r15[r12] = r1
            r0 = 1
            r15[r0] = r1
            r15[r6] = r1
            r0 = 3
            r15[r0] = r1
            r0 = 4
            r15[r0] = r1
            r0 = 5
            r15[r0] = r1
            r0 = 6
            r15[r0] = r1
            r0 = 7
            r15[r0] = r1
            r1 = 0
            android.graphics.drawable.shapes.RoundRectShape r0 = new android.graphics.drawable.shapes.RoundRectShape
            r0.<init>(r15, r1, r1)
            android.graphics.drawable.ShapeDrawable r6 = new android.graphics.drawable.ShapeDrawable
            r6.<init>(r0)
            android.graphics.Paint r1 = r6.getPaint()
            r0 = 2130970211(0x7f040663, float:1.7549126E38)
            int r0 = X.2Yu.A0H(r13, r0)
            X.AnonymousClass7TE.A1N(r13, r1, r0)
            r4.setBackground(r6)
        L_0x01f9:
            r0 = 2130970006(0x7f040596, float:1.754871E38)
            int r0 = X.2Yu.A0H(r13, r0)
            X.DbU.A14(r13, r4, r0)
            r0 = 2131959913(0x7f132069, float:1.955648E38)
            X.DbU.A12(r13, r4, r0)
            r0 = 49
            X.C71408Ok7.A00(r4, r0, r11, r14)
            r11.A04 = r5
            r8.addView(r5)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorLinearLayout r4 = r11.A06
            if (r4 == 0) goto L_0x022b
            r0 = 36326657295988636(0x810ee70001379c, double:3.0364625774666836E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x022b
            r1 = 7
            X.Oke r0 = new X.Oke
            r0.<init>((java.lang.Object) r11, (int) r1)
            r4.CNi(r0)
        L_0x022b:
            android.view.View r1 = r11.A04
            r0 = 1069966950(0x3fc66666, float:1.55)
            r11.A00(r10, r1, r7, r0)
        L_0x0233:
            r1 = 3
            X.OkQ r0 = new X.OkQ
            r0.<init>((X.C71091OcD) r11, (int) r1)
            r9.setOnLongClickListener(r0)
            X.LNx r8 = r11.A0G
            if (r8 == 0) goto L_0x0287
            java.util.List r0 = r11.A0K
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r6 = r0.iterator()
        L_0x024a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0284
            java.lang.Object r5 = r6.next()
            X.OFN r5 = (X.OFN) r5
            com.instagram.direct.avatar.reactions.repository.AvatarReactionsRepository r1 = r11.A0H
            java.lang.String r0 = r5.A00
            X.JuF r4 = r1.A02(r0)
            if (r4 == 0) goto L_0x024a
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r3 = r5.A02
            com.instagram.common.ui.widget.imageview.ConstrainedImageView r2 = r5.A03
            java.lang.String r1 = r5.A00
            X.JvU r0 = new X.JvU
            r0.<init>(r3, r2, r4, r1)
            r7.add(r0)
            goto L_0x024a
        L_0x026f:
            r0 = 2131237848(0x7f081bd8, float:1.8091958E38)
            X.DbU.A13(r13, r4, r0)
            if (r1 == 0) goto L_0x01f9
            goto L_0x01b8
        L_0x0279:
            boolean r0 = r14.A08
            if (r0 == 0) goto L_0x017a
            if (r1 == 0) goto L_0x017a
            r0 = 2131960121(0x7f132139, float:1.9556902E38)
            goto L_0x0177
        L_0x0284:
            r8.A01(r7)
        L_0x0287:
            r11.A0D = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71091OcD.<init>(android.content.Context, android.view.ViewGroup, X.0iw, com.instagram.common.session.UserSession, X.Pvc, X.OHy, boolean):void");
    }

    private final void A00(LayoutInflater layoutInflater, View view, LinearLayout linearLayout, float f) {
        if (view == null || !this.A0L) {
            linearLayout.setVisibility(8);
            return;
        }
        View A0C2 = DbT.A0C(layoutInflater, linearLayout, R.layout.reactions_creation_drag_overlay);
        0qQ.A0C(A0C2, AnonymousClass000.A00(0));
        A0C2.setOnDragListener(new C71410Ok9(this.A0B, view, this.A0F, f));
        linearLayout.addView(A0C2);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A01(C71091OcD ocD) {
        Context context = ocD.A0B;
        int A012 = AnonymousClass0nB.A01(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
        Resources resources = context.getResources();
        int i = R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size;
        if (A012 < dimensionPixelSize) {
            i = R.dimen.abc_dropdownitem_icon_width;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i);
        List list = ocD.A0K;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((OFN) list.get(i2)).A02.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2, 17));
        }
    }

    public static final void A02(C71091OcD ocD, String str, int i) {
        OFN ofn = (OFN) ocD.A0K.get(i);
        0qQ.A0B(str, 0);
        ofn.A00 = str;
        ofn.A02.setUrl(C317486nL.A04.A04(str), ocD.A0E);
        List list = ocD.A0J.A02;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (0qQ.A0K(next, str)) {
                    if (next != null) {
                        FrameLayout frameLayout = ofn.A01;
                        frameLayout.setForeground(ocD.A0B.getDrawable(R.drawable.emoji_reaction_dot_indicator));
                        frameLayout.setForegroundGravity(81);
                        return;
                    }
                }
            }
        }
        ofn.A01.setForeground((Drawable) null);
    }

    public final List A03() {
        List<OFN> list = this.A0K;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (OFN ofn : list) {
            A0r.add(ofn.A00);
        }
        return A0r;
    }

    public final void A05(float f) {
        int i = this.A08;
        if (i == 0) {
            i = this.A0D.getWidth();
            this.A08 = i;
            this.A09 = (int) (((float) i) * 0.85714287f);
        }
        float f2 = (float) (i - this.A09);
        FrameLayout frameLayout = this.A0D;
        frameLayout.getLayoutParams().width = this.A09 + ((int) (f2 * f));
        View view = this.A04;
        if (view != null) {
            int i2 = this.A01;
            if (i2 == 0) {
                i2 = view.getWidth();
                this.A01 = i2;
            }
            float f3 = ((float) i2) * f;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (int) f3;
            }
        }
        frameLayout.requestLayout();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public final void A06(int i) {
        this.A03 = i;
        List list = this.A0K;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ? r1 = ((OFN) list.get(i2)).A02;
            float f = 0.3f;
            if (i2 == i) {
                f = 1.0f;
            }
            r1.setAlpha(f);
        }
    }
}
