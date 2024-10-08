package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewParent;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.9Yu  reason: invalid class name and case insensitive filesystem */
public abstract class C380599Yu extends C249703kE {
    public Bitmap A00;
    public C380599Yu A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Drawable A07;
    public final 2cs A08;
    public final 2cs A09;
    public final RoundedCornerImageView A0A;
    public final C252063oV A0B;
    public final C355448Qa A0C;
    public final C355568Qm A0D;

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public C380599Yu(View view, C355568Qm r8, C355448Qa r9) {
        super(view);
        ? r3 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.thumbnail_image);
        this.A0A = r3;
        r3.setBitmapShaderScaleType(AnonymousClass3MJ.CENTER_CROP);
        View findViewById = view.findViewById(R.id.duplicate_thumbnail_stub);
        this.A0B = 2b1.A00(findViewById == null ? view.findViewById(R.id.thumbnail_image) : findViewById);
        Context context = view.getContext();
        Drawable drawable = context.getDrawable(R.drawable.item_placeholder);
        if (drawable != null) {
            this.A07 = drawable;
            2cs A0J = AnonymousClass7TF.A0J();
            A0J.A06 = true;
            this.A08 = A0J;
            A0J.A0A(new C383679fy(this, view.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material)));
            2cs A0J2 = AnonymousClass7TF.A0J();
            A0J2.A06 = true;
            A0J2.A08(1.2000000476837158d, true);
            this.A09 = A0J2;
            A0J2.A0A(new C383699g0(view, 1));
            this.A0C = r9;
            this.A0D = r8;
            if (r8 != null) {
                r3.setOnTouchListener(new AP3(new GestureDetector(context, new C380299Xl(0, r9, this)), 5));
                03v.A0B(r3, new U7B(2));
                return;
            }
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(r3);
            A0m.A0C = true;
            A0m.A07 = true;
            A0m.A02 = 0.95f;
            A0m.A04 = new AZD(r9, this);
            A0m.A00();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v11, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.Bitmap r14, X.AnonymousClass0iw r15, java.lang.Object r16, boolean r17) {
        /*
            r13 = this;
            r5 = r16
            r13.A02 = r5
            r13.A00 = r14
            android.view.View r0 = r13.itemView
            r2 = 0
            r0.setVisibility(r2)
            X.8Qm r0 = r13.A0D
            if (r0 != 0) goto L_0x001f
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = r13.A0A
            android.graphics.drawable.Drawable r0 = r13.A07
            r1.setImageDrawable(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.setScaleX(r0)
            r1.setScaleY(r0)
        L_0x001f:
            r0 = r17
            r13.A06 = r0
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3 = r13.A0A
            r3.setStrokeEnabled(r0)
            if (r14 != 0) goto L_0x0121
            r6 = r13
            boolean r0 = r13 instanceof X.C388739oJ
            if (r0 == 0) goto L_0x0064
            X.9oJ r6 = (X.C388739oJ) r6
            com.instagram.common.gallery.Medium r5 = (com.instagram.common.gallery.Medium) r5
            X.0qQ.A0B(r5, r2)
            r6.A01 = r5
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3 = r6.A0A
            int r0 = r5.A07
            r3.A01 = r0
            android.content.res.Resources r2 = r3.getResources()
            boolean r1 = r5.CeS()
            r0 = 2131969421(0x7f13458d, float:1.9575764E38)
            if (r1 == 0) goto L_0x004e
            r0 = 2131976521(0x7f136149, float:1.9590165E38)
        L_0x004e:
            java.lang.String r0 = r2.getString(r0)
            r3.setContentDescription(r0)
            X.8Qr r2 = r6.A02
            X.7yA r4 = r6.A00
            r3 = 0
            r7 = r3
            r8 = r3
            r9 = r3
            X.7yA r0 = r2.AGH(r3, r4, r5, r6, r7, r8, r9)
            r6.A00 = r0
            return
        L_0x0064:
            boolean r0 = r13 instanceof X.C388729oI
            if (r0 == 0) goto L_0x00d5
            X.9oI r6 = (X.C388729oI) r6
            X.7zv r5 = (X.C349307zv) r5
            X.0qQ.A0B(r5, r2)
            r6.A00 = r5
            X.8Qs r12 = r6.A01
            java.lang.String r4 = r5.A07()
            java.util.concurrent.ConcurrentMap r0 = r12.A06
            r0.put(r4, r6)
            java.util.Map r1 = r12.A04
            boolean r0 = r1.containsKey(r4)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r2 = r1.get(r4)
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            X.1NK r1 = X.1NK.A00()
            r0 = 0
            X.1OO r0 = r1.A0J(r2, r0)
            r0.A08 = r5
            r0.A02(r12)
            r0.A01()
        L_0x009b:
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3 = r6.A0A
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131976521(0x7f136149, float:1.9590165E38)
        L_0x00a4:
            java.lang.String r0 = r1.getString(r0)
            r3.setContentDescription(r0)
            return
        L_0x00ac:
            java.util.Set r3 = r12.A05
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L_0x009b
            r0 = 484(0x1e4, float:6.78E-43)
            com.instagram.common.session.UserSession r9 = r12.A03
            android.content.Context r8 = r12.A02
            X.Ash r7 = new X.Ash
            r10 = r6
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            X.5g0 r2 = new X.5g0
            r2.<init>(r7, r0)
            r1 = 1
            X.9jj r0 = new X.9jj
            r0.<init>(r12, r5, r4, r1)
            r2.A00 = r0
            r3.add(r4)
            X.1ES.A03(r2)
            goto L_0x009b
        L_0x00d5:
            boolean r0 = r13 instanceof X.C388719oH
            if (r0 == 0) goto L_0x0111
            X.9oH r6 = (X.C388719oH) r6
            X.8Cl r5 = (X.C352218Cl) r5
            X.0qQ.A0B(r5, r2)
            int r4 = r5.A09
            int r3 = r5.A06
            r2 = 1
        L_0x00e5:
            int r1 = r4 / r2
            int r0 = r6.A01
            if (r1 <= r0) goto L_0x00f4
            int r1 = r3 / r2
            int r0 = r6.A00
            if (r1 <= r0) goto L_0x00f4
            int r2 = r2 * 2
            goto L_0x00e5
        L_0x00f4:
            java.io.File r0 = r5.A03()
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A01(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r3 = r6.A0A
            int r0 = r5.A07
            r3.A01 = r0
            boolean r0 = r5.A13
            r3.A05 = r0
            r3.A0E(r15, r1, r2)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131969421(0x7f13458d, float:1.9575764E38)
            goto L_0x00a4
        L_0x0111:
            com.instagram.common.typedurl.ImageUrl r5 = (com.instagram.common.typedurl.ImageUrl) r5
            X.0qQ.A0B(r5, r2)
            r3.setUrl(r5, r15)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131965980(0x7f13381c, float:1.9568785E38)
            goto L_0x00a4
        L_0x0121:
            r3.setImageBitmap(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380599Yu.A00(android.graphics.Bitmap, X.0iw, java.lang.Object, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void A01(boolean z) {
        C294975nL A012;
        float f;
        this.A03 = z;
        if (z) {
            AnonymousClass2S0.A01.A05(20);
            A012 = C294975nL.A01(this.itemView, 1);
            0qQ.A07(A012);
            A012.A0I(0.7f);
            A012.A0P(1.2f, -1.0f);
            A012.A0Q(1.2f, -1.0f);
            ViewParent parent = this.A0A.getParent();
            0qQ.A0C(parent, AnonymousClass000.A00(0));
            f = ((float) (-((View) parent).getHeight())) * 0.3333f;
        } else {
            A012 = C294975nL.A01(this.itemView, 1);
            0qQ.A07(A012);
            A012.A0I(1.0f);
            A012.A0P(1.0f, -1.0f);
            A012.A0Q(1.0f, -1.0f);
            f = 0.0f;
        }
        A012.A0K(f);
        A012.A0C(200).A0H();
    }
}
