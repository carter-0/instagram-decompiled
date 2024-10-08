package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.U1a  reason: case insensitive filesystem */
public final class C14679U1a extends Drawable implements C369948va, C41816B1w {
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final Drawable A05;
    public final C39717A6i A06;
    public final Drawable A07;
    public final C244303ay A08;
    public final WJl A09;
    public final AnonymousClass6M4 A0A;
    public final C306386Ly A0B;

    public final void APn() {
        this.A04 = true;
        invalidateSelf();
    }

    public final void CLg() {
        this.A04 = false;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        float f;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        WJl wJl = this.A09;
        if (wJl.A01) {
            Paint paint = wJl.A03;
            paint.setAlpha((int) AnonymousClass37Q.A01((double) ((float) wJl.A07.A09.A00), 128.0d));
            canvas2.save();
            canvas2.setMatrix(wJl.A02);
            canvas2.drawRect(0.0f, 0.0f, (float) canvas2.getWidth(), (float) canvas2.getHeight(), paint);
            canvas2.restore();
        }
        this.A05.draw(canvas2);
        C244303ay r6 = this.A08;
        if (r6 != null) {
            float f2 = 1.0f / this.A00;
            Rect A0X = AnonymousClass7TE.A0X(r6);
            canvas2.save();
            canvas2.scale(f2, f2, (float) A0X.left, (float) A0X.top);
            r6.draw(canvas2);
            canvas2.restore();
        }
        C306386Ly r3 = this.A0B;
        if (r3 != null && r3.A0b.getAlpha() > 0) {
            r3.draw(canvas2);
        }
        if (!wJl.A01) {
            this.A0A.draw(canvas2);
        }
        if (wJl.A01) {
            Rect A0X2 = AnonymousClass7TE.A0X(wJl.A04);
            2cs r7 = wJl.A07;
            double d = (double) ((float) r7.A09.A00);
            int A002 = (int) AnonymousClass37Q.A00(d);
            if (r7.A01 == 1.0d) {
                f = (float) AnonymousClass37Q.A03(d, 0.5d, 1.0d);
            } else {
                f = 1.0f;
            }
            canvas2.save();
            canvas2.translate(0.0f, ((float) wJl.A00) * f);
            C306386Ly r8 = wJl.A09;
            r8.setBounds(A0X2.centerX() - (r8.A0A / 2), A0X2.bottom, A0X2.centerX() + (r8.A0A / 2), A0X2.bottom + r8.A06);
            r8.setAlpha(A002);
            r8.draw(canvas2);
            canvas2.restore();
        }
        if (this.A04 && (drawable = this.A07) != null) {
            drawable.draw(canvas2);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        this.A05.setBounds(rect);
        Drawable drawable = this.A07;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        A00(rect, this.A00);
        AnonymousClass6M4 r0 = this.A0A;
        r0.A05.A0E(rect.width());
        WJl wJl = this.A09;
        wJl.A09.A0E(rect.width());
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    private final void A00(Rect rect, float f) {
        C244303ay r3 = this.A08;
        if (r3 != null && f != 0.0f) {
            float f2 = 1.0f / f;
            int i = (int) (((float) this.A01) * f2);
            int i2 = rect.left + i;
            int i3 = rect.top + i;
            int i4 = (int) (((float) r3.A01) * f2);
            int i5 = i4 + i2;
            int i6 = i4 + i3;
            r3.setBounds(i2, i3, i5, i6);
            C306386Ly r4 = this.A0B;
            if (r4 != null) {
                int i7 = i5 + i;
                int i8 = rect.right - i;
                int i9 = (i3 + i6) / 2;
                r4.A0A(((float) this.A03) * f2);
                r4.A0E(i8 - i7);
                int i10 = r4.A06 / 2;
                r4.setBounds(i7, i9 - i10, i8, i9 + i10);
            }
        }
    }

    public final void APm() {
        WJl wJl = this.A09;
        if (!C51971G9r.A1b(wJl.A08.A02)) {
            this.A0A.A01();
            invalidateSelf();
            return;
        }
        wJl.A01 = true;
        2cs r2 = wJl.A06;
        r2.A09(WJl.A0A);
        wJl.A07.A09(WJl.A0C);
        r2.A03();
    }

    public final Drawable Aco() {
        return this.A05;
    }

    public final int AeE() {
        C244303ay r0 = this.A08;
        if (r0 != null) {
            return r0.A02.getAlpha();
        }
        return 0;
    }

    public final float ArT() {
        Drawable drawable = this.A05;
        if (drawable instanceof AnonymousClass8DV) {
            return ((AnonymousClass8DV) drawable).A00;
        }
        if (drawable instanceof B2I) {
            return ((B2I) drawable).ArT();
        }
        return 0.0f;
    }

    public final Bitmap BPm() {
        Drawable drawable = this.A05;
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof AnonymousClass8DV) {
            return ((AnonymousClass8DV) drawable).A07;
        }
        if (drawable instanceof AnonymousClass9X8) {
            return C39908AIz.A01(((AnonymousClass9X8) drawable).A0B.A0X, 0);
        }
        return null;
    }

    public final int BRc() {
        return AnonymousClass7TF.A1V(this.A06) ? 1 : 0;
    }

    public final List BRk() {
        User user;
        C39717A6i a6i = this.A06;
        if (a6i != null) {
            user = a6i.A02;
        } else {
            user = null;
        }
        List singletonList = Collections.singletonList(user);
        ArrayList A15 = DbV.A15(singletonList);
        for (Object next : singletonList) {
            if (next != null) {
                A15.add(next);
            }
        }
        return A15;
    }

    public final C39717A6i Bla() {
        return this.A06;
    }

    public final int CD2() {
        C306386Ly r0 = this.A0B;
        if (r0 != null) {
            return r0.A0b.getAlpha();
        }
        return 0;
    }

    public final void CLf(boolean z) {
        WJl wJl = this.A09;
        C14086Tpc.A01.A01(wJl.A05);
        2cs r4 = wJl.A06;
        C71392co r0 = WJl.A0B;
        r4.A09(r0);
        2cs r3 = wJl.A07;
        r3.A09(r0);
        if (z) {
            r4.A06(0.0d);
            r3.A06(0.0d);
        } else {
            r4.A08(0.0d, true);
            r3.A08(0.0d, true);
        }
        this.A0A.A00();
        invalidateSelf();
    }

    public final void DdD(AnonymousClass804 r2, float f) {
        this.A00 = f;
        A00(AnonymousClass7TE.A0X(this), f);
    }

    public final void EPO(int i) {
        C244303ay r0 = this.A08;
        if (r0 != null) {
            r0.setAlpha(i);
        }
    }

    public final void ESw(float f) {
        Drawable drawable = this.A05;
        if (drawable instanceof AnonymousClass8DV) {
            ((AnonymousClass8DV) drawable).A02(f);
        } else if (drawable instanceof B2I) {
            ((B2I) drawable).ESw(f);
        }
        Drawable drawable2 = this.A07;
        if (drawable2 instanceof B2I) {
            ((B2I) drawable2).ESw(f);
        }
    }

    public final void Eps(int i) {
        C306386Ly r0 = this.A0B;
        if (r0 != null) {
            r0.setAlpha(i);
        }
    }

    public final int getIntrinsicHeight() {
        return this.A05.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A05.getIntrinsicWidth();
    }

    public C14679U1a(Context context, Drawable drawable, Drawable drawable2, UserSession userSession, C39717A6i a6i, String str) {
        boolean A1Y = DbW.A1Y(drawable);
        this.A05 = drawable;
        this.A07 = drawable2;
        this.A06 = a6i;
        Resources resources = context.getResources();
        this.A05.setCallback(this);
        this.A09 = new WJl(context, this, this, new VVV(new MMQ(userSession, 7), AnonymousClass7TF.A0d(resources, 2131974218), this.A05.getIntrinsicWidth()));
        AnonymousClass6M3 r1 = new AnonymousClass6M3(context, this, -1);
        r1.A01(2131974218);
        r1.A00 = this.A05.getIntrinsicWidth();
        this.A0A = r1.A00();
        int color = context.getColor(R.color.fds_transparent);
        C39717A6i a6i2 = this.A06;
        if (a6i2 != null) {
            User user = a6i2.A02;
            this.A02 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            this.A01 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            C244303ay r6 = new C244303ay(user.Bh3(), str, this.A02, 0, color, color);
            this.A08 = r6;
            r6.setCallback(this);
            this.A03 = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
            Spannable spannable = C306386Ly.A0d;
            int intrinsicWidth = this.A05.getIntrinsicWidth();
            int i = this.A01;
            C306386Ly r2 = new C306386Ly(context, intrinsicWidth - (((this.A02 + i) + i) + i));
            this.A0B = r2;
            r2.A0M(user.getUsername());
            r2.A0G(A1Y ? 1 : 0, "…");
            r2.setAlpha(0);
            AnonymousClass7TE.A1X(0qm.A0z, AnonymousClass0qo.A00(context), r2);
            r2.setCallback(this);
            return;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = 0;
        this.A0B = null;
        this.A08 = null;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }
}
