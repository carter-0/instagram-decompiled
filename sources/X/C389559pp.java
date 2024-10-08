package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

/* renamed from: X.9pp  reason: invalid class name and case insensitive filesystem */
public final class C389559pp extends C299875vz implements C268684dp, C41795B1a {
    public C369908vW A00;
    public C306386Ly A01;
    public C306386Ly A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Medium A07;
    public final AnonymousClass6M4 A08;
    public final int A09;
    public final Resources A0A;
    public final Paint A0B;
    public final Paint A0C;
    public final RectF A0D = AnonymousClass7TE.A0Y();
    public final Drawable A0E;
    public final List A0F;

    public final String A09() {
        return "polaroid_sticker_bundle_id";
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A00.A9D(b1v);
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A00.EE1(b1v);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        C369908vW r3 = this.A00;
        if (r3.A01 != null) {
            RectF rectF = this.A0D;
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.A0C);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, this.A0B);
            r3.draw(canvas);
            Drawable drawable = this.A0E;
            if (drawable != null) {
                drawable.draw(canvas);
            }
            C306386Ly r0 = this.A01;
            if (r0 != null) {
                r0.draw(canvas);
            }
            C306386Ly r02 = this.A02;
            if (r02 != null) {
                r02.draw(canvas);
            }
            this.A08.draw(canvas);
        }
    }

    public C389559pp(Context context, Medium medium, String str) {
        C306386Ly r14;
        Context context2 = context;
        this.A06 = context2;
        Medium medium2 = medium;
        this.A07 = medium2;
        Resources resources = context2.getResources();
        this.A0A = resources;
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.browser_error_screen_description_width);
        this.A04 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.ar_effect_picker_background_height);
        this.A09 = dimensionPixelSize2;
        this.A05 = AnonymousClass7TE.A0B(resources);
        this.A03 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int A0B2 = AnonymousClass7TE.A0B(resources);
        int A0A2 = AnonymousClass7TE.A0A(context2);
        Paint paint = new Paint();
        paint.setColor(A0A2);
        this.A0B = paint;
        int color = context2.getColor(R.color.black_15_transparent);
        Paint A0V = AnonymousClass7TE.A0V(1);
        A0V.setColor(A0A2);
        A0V.setAlpha(255);
        A0V.setShadowLayer((float) A0B2, 0.0f, 0.0f, color);
        this.A0C = A0V;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A0F = A1C;
        Drawable drawable = context2.getDrawable(R.drawable.polaroid_sticker_image_shadow);
        this.A0E = drawable;
        AnonymousClass6M3 r11 = new AnonymousClass6M3(context2, this, this.A04 + (this.A05 * 2));
        r11.A01(2131969536);
        r11.A02(R.dimen.abc_text_size_menu_header_material);
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(num, 0);
        r11.A06 = num;
        r11.A03 = 4000;
        this.A08 = r11.A00();
        C306386Ly r12 = null;
        if (medium2.A0D > 0) {
            r14 = AnonymousClass7TE.A0s(context2, dimensionPixelSize);
            long j = this.A07.A0D;
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j);
            AnonymousClass7TF.A1A(r14, 002.A0g(DateFormat.getDateInstance().format(instance.getTime()), " • ", C378999Sa.A01(this.A06, j)));
            Context context3 = r14.A0Z;
            AnonymousClass7TE.A1O(context3, r14, 2Yu.A08(context3));
            r14.A09();
            AnonymousClass7TF.A11(resources, r14, R.dimen.abc_text_size_menu_header_material);
            AnonymousClass7TE.A1X(0qm.A0t, AnonymousClass0qo.A00(context3), r14);
        } else {
            r14 = null;
        }
        this.A02 = r14;
        String str2 = str;
        if (str != null && !00l.A0W(str2)) {
            r12 = AnonymousClass7TE.A0s(context2, dimensionPixelSize);
            AnonymousClass7TF.A1A(r12, str2);
            Context context4 = r12.A0Z;
            AnonymousClass7TG.A0y(context4, r12, R.attr.igds_color_text_on_white);
            r12.A09();
            AnonymousClass7TF.A11(resources, r12, R.dimen.backup_codes_text_size);
            AnonymousClass7TE.A1X(0qm.A0t, AnonymousClass0qo.A00(context4), r12);
            r12.A0K(Layout.Alignment.ALIGN_NORMAL);
        }
        this.A01 = r12;
        C369908vW r122 = new C369908vW(context2, (Bitmap) null, medium2, (ImageUrl) null, C354668Mx.RECTANGLE, (Integer) null, dimensionPixelSize, dimensionPixelSize2, false, false, false, true);
        this.A00 = r122;
        Collections.addAll(A1C, new Drawable[]{this.A02, this.A01, r122, drawable});
    }

    public final List A07() {
        return this.A0F;
    }

    public final void AHg() {
        this.A00.AHg();
    }

    public final Rect BIJ() {
        return AnonymousClass7TE.A0X(this.A00);
    }

    public final int getIntrinsicHeight() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.A09;
        C306386Ly r2 = this.A01;
        if (r2 != null) {
            int i6 = r2.A06;
            if (this.A02 != null) {
                i4 = this.A03;
            } else {
                i4 = 0;
            }
            i = i6 + i4;
        } else {
            i = 0;
        }
        int i7 = i5 + i;
        C306386Ly r1 = this.A02;
        if (r1 != null) {
            i2 = r1.A06;
        } else {
            i2 = 0;
        }
        int i8 = i7 + i2;
        if (r1 == null && r2 == null) {
            i3 = this.A05;
        } else {
            i3 = 0;
        }
        return i8 + i3 + (this.A05 * 3);
    }

    public final int getIntrinsicWidth() {
        return this.A04 + (this.A05 * 2);
    }

    public final boolean isLoading() {
        if (this.A00.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        super.setBounds(i, i2, i3, i4);
        int i7 = (i2 + i4) / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i8 = i7 - intrinsicHeight;
        RectF rectF = this.A0D;
        rectF.left = (float) i;
        rectF.top = (float) i8;
        rectF.right = (float) i3;
        rectF.bottom = (float) (i7 + intrinsicHeight);
        int i9 = this.A05;
        int i10 = i9 + i8;
        int i11 = i + i9;
        int i12 = i3 - i9;
        int i13 = this.A09;
        Rect rect = new Rect(i11, i10, i12, i13 + i10);
        this.A00.setBounds(rect);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        int i14 = i8 + i13 + (i9 * 2);
        C306386Ly r1 = this.A01;
        if (r1 != null) {
            int i15 = r1.A06;
            if (this.A02 != null) {
                i6 = this.A03;
            } else {
                i6 = 0;
            }
            i5 = i15 + i6;
        } else {
            i5 = 0;
        }
        int i16 = i5 + i14;
        if (r1 != null) {
            r1.setBounds(i11, i14, i12, i16);
        }
        C306386Ly r12 = this.A02;
        if (r12 != null) {
            r12.setBounds(i11, i16, i12, getIntrinsicHeight() - i9);
        }
    }
}
