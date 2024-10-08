package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.8v9  reason: invalid class name and case insensitive filesystem */
public final class C369678v9 extends C268694dq implements C300645xY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Context A07;
    public final LwN A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final boolean A0F;
    public final int A0G;
    public final int A0H;
    public final String A0I;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        ((Drawable) this.A0A.getValue()).draw(canvas);
        ((Drawable) this.A09.getValue()).draw(canvas);
        ((Drawable) this.A0D.getValue()).draw(canvas);
        Drawable drawable = (Drawable) this.A0E.getValue();
        if (drawable != null) {
            drawable.draw(canvas);
        }
        ((Drawable) this.A0B.getValue()).draw(canvas);
        ((Drawable) this.A0C.getValue()).draw(canvas);
    }

    public final List A07() {
        Drawable[] drawableArr = {(Drawable) this.A0A.getValue(), (Drawable) this.A09.getValue(), (Drawable) this.A0D.getValue(), (Drawable) this.A0E.getValue(), (Drawable) this.A0B.getValue(), (Drawable) this.A0C.getValue()};
        0qQ.A0B(drawableArr, 0);
        return 03t.A0I(drawableArr);
    }

    public final String C4F() {
        return this.A0I;
    }

    public final int getIntrinsicHeight() {
        int i;
        Drawable drawable = (Drawable) this.A0E.getValue();
        if (drawable != null) {
            i = drawable.getIntrinsicHeight() + this.A0H;
        } else {
            i = 0;
        }
        return ((C15839UjP) this.A09.getValue()).A00 + ((Drawable) this.A0D.getValue()).getIntrinsicHeight() + i + ((Drawable) this.A0B.getValue()).getIntrinsicHeight() + ((Drawable) this.A0C.getValue()).getIntrinsicHeight() + (this.A0G * 3);
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }

    public C369678v9(Context context, LwN lwN, boolean z) {
        this.A07 = context;
        this.A08 = lwN;
        this.A0F = z;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(z ? R.dimen.asset_picker_video_sticker_width : R.dimen.challenge_sticker_width);
        this.A06 = dimensionPixelSize;
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A0G = dimensionPixelSize2;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.abc_control_corner_material);
        this.A0H = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A05 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_subtitle_text_size);
        this.A03 = dimensionPixelSize - (dimensionPixelSize2 * 2);
        this.A01 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        0eO r2 = 0eO.A02;
        this.A0A = AnonymousClass0eN.A00(r2, new MJ1(this, 33));
        this.A09 = AnonymousClass0eN.A00(r2, new MJ1(this, 32));
        this.A0D = AnonymousClass0eN.A00(r2, new MJ1(this, 36));
        this.A0E = AnonymousClass0eN.A00(r2, new MJ1(this, 37));
        this.A0B = AnonymousClass0eN.A00(r2, new MJ1(this, 34));
        this.A0C = AnonymousClass0eN.A00(r2, new MJ1(this, 35));
        this.A0I = C273654mx.A00(67);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        AnonymousClass0eM r6 = this.A09;
        ((Drawable) this.A0A.getValue()).setBounds(i, ((C15839UjP) r6.getValue()).A00 + i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        AnonymousClass0eM r1 = this.A0D;
        int intrinsicWidth = (int) (f - (((float) ((Drawable) r1.getValue()).getIntrinsicWidth()) / 2.0f));
        int i5 = ((C15839UjP) r6.getValue()).A00 + i2;
        int intrinsicHeight = ((Drawable) r1.getValue()).getIntrinsicHeight() + i5;
        ((Drawable) r1.getValue()).setBounds(new Rect(intrinsicWidth, i5, ((Drawable) r1.getValue()).getIntrinsicWidth() + intrinsicWidth, intrinsicHeight));
        Drawable drawable = (Drawable) this.A0E.getValue();
        if (drawable != null) {
            int intrinsicWidth2 = (int) (f - (((float) drawable.getIntrinsicWidth()) / 2.0f));
            int i6 = intrinsicHeight + this.A0H;
            int intrinsicHeight2 = drawable.getIntrinsicHeight() + i6;
            drawable.setBounds(intrinsicWidth2, i6, drawable.getIntrinsicWidth() + intrinsicWidth2, intrinsicHeight2);
            intrinsicHeight = intrinsicHeight2;
        }
        int i7 = this.A0G;
        int i8 = intrinsicHeight + i7;
        AnonymousClass0eM r12 = this.A0B;
        int intrinsicHeight3 = ((Drawable) r12.getValue()).getIntrinsicHeight() + i8;
        ((Drawable) r6.getValue()).setBounds(i, i2, i3, i8);
        ((Drawable) r12.getValue()).setBounds(i, i8, i3, intrinsicHeight3);
        AnonymousClass0eM r4 = this.A0C;
        int intrinsicWidth3 = (int) (f - (((float) ((Drawable) r4.getValue()).getIntrinsicWidth()) / 2.0f));
        int i9 = intrinsicHeight3 + i7;
        ((Drawable) r4.getValue()).setBounds(intrinsicWidth3, i9, ((Drawable) r4.getValue()).getIntrinsicWidth() + intrinsicWidth3, ((Drawable) r4.getValue()).getIntrinsicHeight() + i9);
    }
}
