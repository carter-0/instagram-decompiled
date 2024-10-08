package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8vQ  reason: invalid class name and case insensitive filesystem */
public final class C369848vQ extends Drawable implements Drawable.Callback, AnonymousClass1MK, C41816B1w, C300645xY {
    public String A00 = "";
    public Drawable A01;
    public final int A02;
    public final AnonymousClass9XA A03;
    public final User A04;
    public final String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final Drawable A0C;
    public final C306386Ly A0D;
    public final C306386Ly A0E;

    public final int BRc() {
        return 1;
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        0qQ.A0B(r7, 1);
        Bitmap bitmap = r7.A01;
        if (bitmap != null) {
            C240563Lj r2 = new C240563Lj(bitmap, false);
            r2.setCallback(this);
            r2.setAlpha(getAlpha());
            r2.setColorFilter(getColorFilter());
            r2.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.A01 = r2;
            invalidateSelf();
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        0qQ.A0B(canvas, 0);
        Rect bounds = getBounds();
        0qQ.A07(bounds);
        float f = (float) (bounds.left + this.A06);
        float f2 = (float) (bounds.top + this.A0A);
        canvas.save();
        canvas.translate(f, f2);
        Drawable drawable = this.A01;
        if (drawable != null) {
            i = canvas.save();
            try {
                float intrinsicWidth = ((float) this.A07) / ((float) drawable.getIntrinsicWidth());
                canvas.scale(intrinsicWidth, intrinsicWidth);
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(i);
            }
        }
        C306386Ly r9 = this.A0D;
        if (r9 != null) {
            i2 = r9.A06;
        } else {
            i2 = 0;
        }
        float f3 = (float) this.A07;
        int i3 = this.A08;
        float f4 = (f3 / 2.0f) - (((float) (i3 + i2)) / 2.0f);
        canvas.translate(f3, f4);
        C306386Ly r7 = this.A0E;
        r7.draw(canvas);
        Drawable drawable2 = this.A0C;
        if (drawable2 != null) {
            i = canvas.save();
            canvas.translate(((float) r7.A0A) - r7.A00, ((float) (drawable2.getIntrinsicHeight() - r7.A06)) / 2.0f);
            drawable2.draw(canvas);
            canvas.restoreToCount(i);
        }
        float f5 = 0.0f;
        if (r9 != null) {
            i = canvas.save();
            canvas.translate(0.0f, ((float) i3) + r9.A0b.getFontMetrics().descent);
            r9.draw(canvas);
            canvas.restoreToCount(i);
        }
        canvas.restore();
        AnonymousClass9XA r1 = this.A03;
        if (r1 != null) {
            float f6 = f + f3 + ((float) r7.A0A);
            if (this.A04.isVerified()) {
                f5 = (float) this.A09;
            }
            r1.A00(canvas, f6 + f5, f2 + f4 + (((float) i2) / 2.0f), 1.0f);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    public C369848vQ(Context context, Drawable drawable, 0qm r21, User user, String str, String str2, int i, int i2, int i3, int i4, int i5, boolean z) {
        float f;
        BitmapDrawable bitmapDrawable;
        int i6;
        int i7 = i;
        User user2 = user;
        this.A04 = user2;
        this.A05 = str2;
        int i8 = i3;
        this.A07 = i8;
        this.A0A = i5;
        this.A06 = i7;
        Context context2 = context;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
        this.A09 = dimensionPixelSize;
        float f2 = (float) i4;
        int A012 = AnonymousClass8XF.A01(context2);
        Drawable drawable2 = drawable;
        if (drawable != null) {
            drawable2.setBounds(0, 0, i8, i8);
            this.A01 = drawable2;
        } else {
            1OO A0J = 1NK.A00().A0J(user2.Bh3(), "ProfileAttributionDrawable");
            A0J.A02(this);
            A0J.A01();
        }
        C306386Ly r6 = new C306386Ly(context2, A012);
        this.A0E = r6;
        r6.setCallback(this);
        r6.A0M(user2.getUsername());
        r6.A0N("…", 1, true);
        int i9 = i2;
        0qm r1 = r21;
        if (r21 != null) {
            f = (float) i9;
            r6.A0I(AnonymousClass0qo.A00(context2).A02(r1));
            AJB.A0B(r6, f2, f, 0.0f);
        } else {
            f = (float) i9;
            AJB.A07(context2, r6, f2, f);
        }
        String str3 = str;
        if (str != null) {
            C306386Ly r12 = new C306386Ly(context2, A012);
            this.A0D = r12;
            r12.setCallback(this);
            r12.A0M(str3);
            r12.A0N("…", 1, true);
            r12.A0A(context2.getResources().getDimension(R.dimen.account_discovery_bottom_gap));
            r12.A0C(f, 0.0f);
        } else {
            this.A0D = null;
        }
        if (z) {
            String string = context2.getString(2131976670);
            0qQ.A07(string);
            AnonymousClass9XA r0 = new AnonymousClass9XA(context2, string, A012);
            this.A03 = r0;
            C306386Ly r5 = r0.A01;
            r5.A0A(f2);
            C306386Ly r2 = r0.A02;
            r2.A0A(f2);
            int color = context2.getColor(2Yu.A0H(context2, R.attr.igds_color_secondary_text_on_media));
            r5.A0F(color);
            r2.A0F(color);
            r5.A0b.setFakeBoldText(true);
            float f3 = (float) i7;
            if (Float.valueOf(f3) != null) {
                r2.A0L(new SpannableString("•"));
                r5.A0C(f3, 0.0f);
            } else {
                r2.A0L(new SpannableString("  •  "));
                r5.A0C(0.0f, 0.0f);
            }
            bitmapDrawable = null;
        } else {
            bitmapDrawable = null;
            this.A03 = null;
        }
        if (user2.isVerified()) {
            bitmapDrawable = C244273av.A00(context2);
            bitmapDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        }
        this.A0C = bitmapDrawable;
        AnonymousClass9XA r02 = this.A03;
        if (r02 != null) {
            i6 = r02.getIntrinsicWidth();
        } else {
            i6 = 0;
        }
        int i10 = ((((A012 - i) - i3) - (i2 * 2)) - i6) - (!user2.isVerified() ? 0 : dimensionPixelSize);
        r6.A0E(i10);
        C306386Ly r03 = this.A0D;
        if (r03 != null) {
            r03.A0E(i10);
        }
        this.A08 = r6.A06;
        this.A0B = i + i3 + r6.A0A + i6;
        this.A02 = i5 + i3 + i5;
    }

    public final List BRk() {
        List singletonList = Collections.singletonList(this.A04);
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final String C4F() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A0B;
    }

    public final void setAlpha(int i) {
        Drawable mutate;
        Drawable drawable = this.A01;
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setAlpha(i);
        }
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable mutate;
        Drawable drawable = this.A01;
        if (!(drawable == null || (mutate = drawable.mutate()) == null)) {
            mutate.setColorFilter(colorFilter);
        }
        invalidateSelf();
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
