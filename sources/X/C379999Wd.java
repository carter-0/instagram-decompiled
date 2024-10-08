package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

/* renamed from: X.9Wd  reason: invalid class name and case insensitive filesystem */
public final class C379999Wd extends Drawable {
    public final Context A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final C306386Ly A04;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        this.A04.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getIntrinsicHeight() {
        return this.A01;
    }

    public final int getIntrinsicWidth() {
        return this.A01;
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        Drawable drawable2 = this.A03;
        if (drawable2 != null) {
            drawable2.setAlpha(i);
        }
        this.A04.setAlpha(i);
    }

    public C379999Wd(Context context) {
        this.A00 = context;
        this.A02 = context.getDrawable(R.drawable.pics_please_sticker_contribution_button_background);
        this.A03 = context.getDrawable(R.drawable.instagram_circle_add_pano_outline_24);
        int A022 = AnonymousClass7TF.A02(this.A00, R.dimen.pics_please_editor_contribution_button_size);
        this.A01 = A022;
        C306386Ly A0s = AnonymousClass7TE.A0s(context, A022);
        AnonymousClass7TF.A11(this.A00.getResources(), A0s, R.dimen.abc_text_size_menu_header_material);
        Context context2 = A0s.A0Z;
        AnonymousClass7TE.A1O(context2, A0s, R.color.clips_remix_camera_outer_container_default_background);
        AnonymousClass7TE.A1X(0qm.A13, AnonymousClass0qo.A00(context2), A0s);
        A0s.A0M(context2.getString(2131969454));
        this.A04 = A0s;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = this.A01 / 2;
        int i7 = (int) (((float) (i + i3)) / 2.0f);
        int i8 = (int) (((float) (i2 + i4)) / 2.0f);
        int i9 = i7 - i6;
        int i10 = i8 - i6;
        int i11 = i7 + i6;
        int i12 = i6 + i8;
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setBounds(i9, i10, i11, i12);
        }
        Drawable drawable2 = this.A03;
        int i13 = 0;
        if (drawable2 != null) {
            i5 = drawable2.getIntrinsicWidth();
            i13 = drawable2.getIntrinsicHeight();
        } else {
            i5 = 0;
        }
        int A022 = AnonymousClass7TF.A02(this.A00, R.dimen.abc_button_padding_horizontal_material) / 2;
        if (drawable2 != null) {
            int i14 = i5 / 2;
            int i15 = i8 - A022;
            drawable2.setBounds(i7 - i14, i15 - i13, i14 + i7, i15);
        }
        C306386Ly r2 = this.A04;
        int i16 = (int) (((float) r2.A0A) / 2.0f);
        int i17 = i8 + A022;
        r2.setBounds(i7 - i16, i17, i7 + i16, r2.A06 + i17);
    }
}
