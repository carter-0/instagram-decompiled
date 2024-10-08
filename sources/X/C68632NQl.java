package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.NQl  reason: case insensitive filesystem */
public final class C68632NQl extends C268694dq {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Path A08;
    public final Drawable A09;
    public final C306386Ly A0A;
    public final C306386Ly A0B;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        canvas.save();
        canvas.drawPath(this.A08, this.A07);
        canvas.restore();
        this.A0A.draw(canvas);
        C306386Ly r0 = this.A0B;
        if (r0 != null) {
            r0.draw(canvas);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        Path path = this.A08;
        path.reset();
        path.setFillType(Path.FillType.WINDING);
        RectF rectF = new RectF(rect);
        float f = this.A00;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        float exactCenterY = rect.exactCenterY();
        C306386Ly r7 = this.A0A;
        int i = r7.A06;
        int A012 = AnonymousClass1GB.A01(exactCenterY - (((float) i) / 2.0f));
        int i2 = rect.left;
        int i3 = this.A04;
        int i4 = i2 + i3;
        int i5 = i4 + r7.A0A;
        r7.setBounds(i4, A012, i5, i + A012);
        C306386Ly r6 = this.A0B;
        if (r6 != null) {
            int A013 = AnonymousClass1GB.A01(rect.exactCenterY() - (((float) r6.A06) / 2.0f));
            int i6 = r7.getBounds().right;
            int i7 = this.A03;
            i5 = i6 + i7 + r6.A0A;
            r6.setBounds(r7.getBounds().right + i7, A013, i5, r6.A06 + A013);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            float exactCenterY2 = rect.exactCenterY();
            int i8 = this.A01;
            int A014 = AnonymousClass1GB.A01(exactCenterY2 - (((float) i8) / 2.0f));
            drawable.setBounds(i5 + this.A03, A014, rect.right - i3, i8 + A014);
        }
    }

    public final List A07() {
        Drawable[] drawableArr = {this.A0A, this.A0B, this.A09};
        0qQ.A0B(drawableArr, 0);
        return 00k.A0U(03t.A0I(drawableArr));
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A05;
    }

    public /* synthetic */ C68632NQl(Context context, String str, long j, boolean z) {
        C306386Ly r1;
        int i;
        int i2;
        Context context2 = context;
        0qQ.A0B(context2, 0);
        int A022 = AnonymousClass7TF.A02(context2, R.dimen.abc_dialog_padding_top_material);
        float A023 = (float) AnonymousClass7TF.A02(context2, R.dimen.autocomplete_dropdown_header_text_size);
        float A024 = (float) AnonymousClass7TF.A02(context2, R.dimen.abc_button_inset_vertical_material);
        int A025 = AnonymousClass7TF.A02(context2, R.dimen.abc_button_inset_vertical_material);
        int A026 = AnonymousClass7TF.A02(context2, R.dimen.abc_action_bar_elevation_material);
        int A027 = AnonymousClass7TF.A02(context2, R.dimen.group_mention_entrypoint_min_text_size);
        String str2 = str;
        AnonymousClass7TF.A1B(context2, 1, str2);
        this.A06 = context2;
        this.A02 = A022;
        this.A00 = A024;
        this.A04 = A025;
        this.A03 = A026;
        this.A01 = A027;
        long j2 = j;
        boolean A1R = AnonymousClass7TF.A1R((j > 0 ? 1 : (j == 0 ? 0 : -1)));
        int A028 = AnonymousClass7TF.A02(context2, R.dimen.abc_list_item_height_large_material);
        C306386Ly r5 = new C306386Ly(context2, A028);
        Context context3 = r5.A0Z;
        0qQ.A07(context3);
        r5.A0I(AnonymousClass0qo.A00(context3).A02(0qm.A11));
        r5.A0A(A023);
        r5.A0M(str2);
        r5.A0G(1, "…");
        r5.A0F(AnonymousClass7TF.A03(context3, R.attr.igds_color_primary_text));
        this.A0A = r5;
        Drawable drawable = null;
        if (A1R) {
            0eP A062 = C67587MqL.A06(context2, j2);
            String str3 = (String) A062.A00;
            int i3 = AnonymousClass7TE.A1a(A062.A01) ? R.attr.igds_color_active_badge : R.attr.igds_color_secondary_text;
            r1 = new C306386Ly(context2, A028);
            Context context4 = r1.A0Z;
            0qQ.A07(context4);
            r1.A0I(AnonymousClass0qo.A00(context4).A02(0qm.A13));
            r1.A0A(A023);
            r1.A0M(str3);
            r1.A0G(1, "…");
            r1.A0F(AnonymousClass7TF.A03(context4, i3));
        } else {
            r1 = null;
        }
        this.A0B = r1;
        if (z) {
            int A029 = C66581MXm.A02(context2);
            Drawable drawable2 = context2.getDrawable(R.drawable.instagram_eye_off_pano_outline_24);
            if (drawable2 == null || (drawable = drawable2.mutate()) == null) {
                drawable = null;
            } else {
                drawable.setTint(A029);
                drawable.setBounds(new Rect(0, 0, A027, A027));
            }
        }
        this.A09 = drawable;
        int i4 = (A025 * 2) + r5.A0A;
        if (r1 != null) {
            i = r1.A0A + A026;
        } else {
            i = 0;
        }
        int i5 = i4 + i;
        if (drawable != null) {
            i2 = AnonymousClass7TF.A06(drawable) + A026;
        } else {
            i2 = 0;
        }
        this.A05 = i5 + i2;
        this.A08 = C51965G9l.A0C();
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context2, A0V, 2Yu.A0H(context2, R.attr.igds_color_primary_background));
        A0V.setShadowLayer(A024, 0.0f, 0.0f, context2.getColor(R.color.black_30_transparent));
        this.A07 = A0V;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.A07.setAlpha(i);
        this.A0A.setAlpha(i);
        C306386Ly r0 = this.A0B;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        Drawable drawable = this.A09;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        invalidateSelf();
    }
}
