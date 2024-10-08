package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.8vN  reason: invalid class name and case insensitive filesystem */
public final class C369818vN extends C369828vO {
    public AnonymousClass9XA A00;
    public User A01;
    public final float A02;
    public final Context A03;
    public final AnonymousClass6M4 A04;
    public final 1Xj A05;
    public final String A06;
    public final float A07;
    public final float A08 = 0.67f;
    public final float A09;
    public final Drawable A0A;
    public final UserSession A0B;
    public final AnonymousClass82f A0C;
    public final C306386Ly A0D;
    public final boolean A0E;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        int save = canvas.save();
        float f = this.A08;
        float f2 = 1.0f / f;
        canvas.translate((float) bounds.left, (float) bounds.top);
        canvas.scale(f2, f2);
        canvas.save();
        float f3 = this.A09;
        Drawable drawable = this.A0A;
        canvas.translate(f3 - (((float) drawable.getIntrinsicWidth()) / 4.0f), f3 - (((float) drawable.getIntrinsicHeight()) / 4.0f));
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        float f4 = (this.A07 * f) + f3;
        canvas.translate(f3, f4);
        C306386Ly r7 = this.A0D;
        r7.A0M(C394659yT.A00(this.A03, this.A0B, this.A0C));
        r7.draw(canvas);
        canvas.restore();
        canvas.restoreToCount(save);
        AnonymousClass9XA r2 = this.A00;
        if (r2 != null) {
            r2.A00(canvas, (f * ((float) bounds.left)) + f3 + ((float) r7.A0A), (f * ((float) bounds.top)) + f4, f2);
        }
        if (this.A0E) {
            canvas.save();
            this.A04.draw(canvas);
            canvas.restore();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean A00() {
        1Xj r0 = this.A0C.A03;
        if (!(r0 == null || r0.A2w() == null)) {
            if (!182.A06(0Tu.A05, this.A0B, 36319175462951937L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final C2802350v BzV() {
        return this.A0C;
    }

    public final String C4F() {
        return 002.A0R("story-reels-metadata-sticker-", this.A06);
    }

    public final int getIntrinsicHeight() {
        return AnonymousClass1GB.A01(this.A07);
    }

    public final int getIntrinsicWidth() {
        return AnonymousClass1GB.A01(this.A02);
    }

    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        AnonymousClass9XA r0 = this.A00;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        this.A0A.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        AnonymousClass9XA r0 = this.A00;
        if (r0 != null) {
            r0.setColorFilter(colorFilter);
        }
        this.A0A.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C369818vN(Context context, UserSession userSession, AnonymousClass82f r14) {
        int i;
        this.A0B = userSession;
        this.A03 = context;
        this.A0C = r14;
        User user = r14.A0A;
        this.A01 = user == null ? r14.A0B : user;
        this.A05 = r14.A03;
        this.A06 = r14.A0C;
        this.A07 = (float) r14.A01;
        float f = (float) r14.A02;
        this.A02 = f;
        Resources resources = context.getResources();
        float dimensionPixelSize = (float) resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A09 = dimensionPixelSize;
        int color = context.getColor(2Yu.A0A(context));
        int color2 = context.getColor(R.color.canvas_bottom_sheet_description_text_color);
        int color3 = context.getColor(R.color.black_50_transparent);
        this.A0E = 0qQ.A0K(25x.A00(userSession).A01.A00, C299715vi.A00);
        C306386Ly r4 = new C306386Ly(context, (int) f);
        this.A0D = r4;
        r4.A0A(resources.getDimension(R.dimen.action_bar_item_spacing_right));
        r4.A0F(color);
        r4.A0D(5.0f, 0.0f, 0.0f, color3);
        r4.A0N("…", 1, true);
        AnonymousClass6M3 r8 = new AnonymousClass6M3(context, this, -1);
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(num, 0);
        r8.A06 = num;
        r8.A01(2131953493);
        r8.A02(R.dimen.abc_dialog_padding_material);
        r8.A03 = 2000;
        this.A04 = r8.A00();
        if (A00()) {
            Context context2 = this.A03;
            String string = context2.getString(2131976628);
            0qQ.A07(string);
            AnonymousClass9XA r82 = new AnonymousClass9XA(context2, string, (int) this.A02);
            this.A00 = r82;
            int color4 = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text_on_media));
            r82.A01.A0F(color4);
            r82.A02.A0F(color4);
        }
        int i2 = (int) ((0.67f * f) - (2.0f * dimensionPixelSize));
        AnonymousClass9XA r0 = this.A00;
        if (r0 != null) {
            i = r0.getIntrinsicWidth();
        } else {
            i = 0;
        }
        r4.A0E(i2 - i);
        Drawable A052 = AnonymousClass3JT.A05(context, R.drawable.instagram_reels_pano_filled_24, color2);
        this.A0A = A052;
        A052.setBounds(0, 0, A052.getIntrinsicWidth(), A052.getIntrinsicHeight());
    }
}
