package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.UjP  reason: case insensitive filesystem */
public final class C15839UjP extends C268694dq implements Drawable.Callback {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Drawable A04;
    public GradientDrawable A05;
    public int A06;
    public LayerDrawable A07;
    public LayerDrawable A08;
    public final Context A09;
    public final GradientDrawable A0A;
    public final U1N A0B;
    public final List A0C;

    public final List A07() {
        return this.A0C;
    }

    public final void A08() {
        U1N u1n = this.A0B;
        u1n.A03 = null;
        u1n.A02 = null;
        u1n.invalidateSelf();
    }

    public final void A09(int i) {
        U1N u1n = this.A0B;
        u1n.A05.setColor(i);
        u1n.invalidateSelf();
    }

    public final void A0A(int i) {
        U1N u1n = this.A0B;
        u1n.A01 = (float) i;
        u1n.invalidateSelf();
    }

    public final void A0B(int i) {
        GradientDrawable gradientDrawable = this.A0A;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC;
        C51969G9p.A12(mode, gradientDrawable, i);
        GradientDrawable gradientDrawable2 = this.A05;
        if (gradientDrawable2 != null) {
            C51969G9p.A12(mode, gradientDrawable2, i);
        }
    }

    public final void A0C(Drawable drawable) {
        U1N u1n = this.A0B;
        u1n.A02 = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), u1n.A02.getIntrinsicHeight());
    }

    public final void A0D(Drawable drawable, Drawable drawable2, int i) {
        LayerDrawable layerDrawable = this.A07;
        if (layerDrawable != null) {
            this.A0C.remove(layerDrawable);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{drawable2, drawable});
        this.A07 = layerDrawable2;
        layerDrawable2.setLayerInset(1, i, i, i, i);
        this.A0C.add(this.A07);
    }

    public final void A0E(Drawable drawable, boolean z) {
        LayerDrawable layerDrawable = this.A08;
        if (layerDrawable != null) {
            this.A0C.remove(layerDrawable);
        }
        Context context = this.A09;
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A05 = gradientDrawable;
        gradientDrawable.setCornerRadius((float) this.A03);
        this.A05.setOrientation(this.A0A.getOrientation());
        int i = -1;
        if (z) {
            i = -16777216;
        }
        AnonymousClass7TE.A1R(drawable, i);
        this.A08 = new LayerDrawable(new Drawable[]{this.A05, context.getDrawable(R.drawable.circle_outline_white_2).mutate(), drawable});
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.album_music_sticker_text_vertical_padding);
        this.A08.setLayerInset(2, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        this.A0C.add(1, this.A08);
    }

    public final void A0F(GradientDrawable.Orientation orientation) {
        this.A0A.setOrientation(orientation);
        GradientDrawable gradientDrawable = this.A05;
        if (gradientDrawable != null) {
            gradientDrawable.setOrientation(orientation);
        }
    }

    public final void draw(Canvas canvas) {
        for (Drawable draw : this.A0C) {
            draw.draw(canvas);
        }
    }

    public final int getIntrinsicHeight() {
        return (this.A00 + this.A0A.getIntrinsicHeight()) - this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public C15839UjP(Context context) {
        this.A09 = context;
        Resources resources = context.getResources();
        this.A03 = resources.getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.asset_picker_cell_margin);
        this.A06 = dimensionPixelSize;
        this.A02 = dimensionPixelSize;
        this.A00 = resources.getDimensionPixelSize(R.dimen.audience_selector_pill_layout_height);
        GradientDrawable gradientDrawable = (GradientDrawable) context.getDrawable(R.drawable.interactive_sticker_background).mutate();
        this.A0A = gradientDrawable;
        U1N u1n = new U1N(context);
        this.A0B = u1n;
        u1n.setCallback(this);
        u1n.A01 = (float) resources.getDimensionPixelSize(R.dimen.ads_disclosure_footer_top_divider_height);
        u1n.invalidateSelf();
        ArrayList arrayList = new ArrayList();
        this.A0C = arrayList;
        Collections.addAll(arrayList, new Drawable[]{gradientDrawable, u1n});
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setBounds(int r9, int r10, int r11, int r12) {
        /*
            r8 = this;
            super.setBounds(r9, r10, r11, r12)
            int r0 = r9 + r11
            int r4 = r0 / 2
            android.graphics.drawable.LayerDrawable r7 = r8.A08
            r6 = 0
            if (r7 == 0) goto L_0x0056
            int r5 = r8.A06
            double r0 = (double) r5
            r2 = 4606011482896901079(0x3febd70a3d70a3d7, double:0.87)
            double r0 = r0 * r2
            int r2 = (int) r0
        L_0x0016:
            int r1 = r4 - r5
            int r1 = r1 + r2
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r0 = r8.A00
            int r0 = r0 + r10
            r7.setBounds(r1, r10, r5, r0)
        L_0x0021:
            int r1 = r11 - r9
            int r0 = r8.A03
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r1, r6)
            float r0 = X.C13988Tno.A01(r0)
            int r0 = (int) r0
            int r9 = r9 + r0
            int r11 = r11 - r0
            android.graphics.drawable.GradientDrawable r1 = r8.A0A
            int r0 = r8.A02
            int r0 = r0 + r10
            r1.setBounds(r9, r0, r11, r12)
            int r5 = r8.A00
            int r5 = r5 + r10
            int r1 = r8.A06
            int r3 = r4 + r1
            int r3 = r3 - r2
            X.U1N r0 = r8.A0B
            int r4 = r4 - r1
            int r4 = r4 - r2
            r0.setBounds(r4, r10, r3, r5)
            android.graphics.drawable.Drawable r2 = r8.A04
            if (r2 == 0) goto L_0x0055
            int r0 = r8.A01
            int r1 = r3 - r0
            int r0 = r5 - r0
            r2.setBounds(r1, r0, r3, r5)
        L_0x0055:
            return
        L_0x0056:
            android.graphics.drawable.LayerDrawable r7 = r8.A07
            if (r7 == 0) goto L_0x0063
            int r5 = r8.A06
            double r0 = (double) r5
            r2 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r0 = r0 * r2
            int r2 = (int) r0
            int r2 = -r2
            goto L_0x0016
        L_0x0063:
            r2 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15839UjP.setBounds(int, int, int, int):void");
    }
}
