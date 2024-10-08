package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.9Wu  reason: invalid class name and case insensitive filesystem */
public final class C380139Wu extends Drawable implements C268684dp, Drawable.Callback, AnonymousClass1MK {
    public static final CharSequence A0N = "…";
    public C59985Jcu A00;
    public boolean A01;
    public int A02;
    public C321106ta A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final AnonymousClass6KL A09;
    public final C306386Ly A0A;
    public final C306386Ly A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H = SystemClock.elapsedRealtime();
    public final Context A0I;
    public final Paint A0J = AnonymousClass7TE.A0V(1);
    public final RectF A0K = AnonymousClass7TE.A0Y();
    public final CopyOnWriteArraySet A0L;
    public final boolean A0M;

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0L.add(b1v);
    }

    public final void CyF(C226952iF r2, AnonymousClass3LX r3) {
        0qQ.A0B(r3, 1);
        Bitmap bitmap = r3.A01;
        if (bitmap != null) {
            A01(bitmap);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0L.remove(b1v);
    }

    public final int getOpacity() {
        return -3;
    }

    private final void A00() {
        Context context = this.A0I;
        this.A02 = AnonymousClass7TE.A08(context);
        Drawable drawable = context.getDrawable(R.drawable.default_album_art_icon);
        0qQ.A0C(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        if (bitmap != null) {
            A01(bitmap);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    private final void A01(Bitmap bitmap) {
        int i;
        float f;
        Integer num;
        boolean z = this.A0M;
        if (z) {
            C14123TqI A002 = new C14120TqF(bitmap).A00();
            int A082 = AnonymousClass7TE.A08(this.A0I);
            int A003 = A002.A00(A082);
            if (A003 == A082) {
                C14122TqH tqH = A002.A01;
                if (tqH != null) {
                    A082 = tqH.A05;
                }
                A003 = A082;
            }
            this.A02 = A003;
            i = this.A0E;
        } else {
            i = this.A04;
        }
        if (z) {
            f = (float) i;
            num = Integer.valueOf(this.A0D);
        } else {
            f = (float) this.A0C;
            num = null;
        }
        C59985Jcu A004 = A13.A00(bitmap, num, f, i, i);
        this.A00 = A004;
        0qQ.A0A(A004);
        A004.setCallback(this);
        Iterator A1G = AnonymousClass7TE.A1G(this.A0L);
        while (A1G.hasNext()) {
            ((C41815B1v) A1G.next()).DOX();
        }
        invalidateSelf();
    }

    public final void AHg() {
        this.A0L.clear();
    }

    public final int getIntrinsicHeight() {
        return this.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A08;
    }

    public final boolean isLoading() {
        if (this.A00 == null) {
            return true;
        }
        return false;
    }

    public final void setAlpha(int i) {
        Drawable drawable;
        C59985Jcu jcu = this.A00;
        if (jcu != null) {
            drawable = jcu.mutate();
        } else {
            drawable = null;
        }
        0qQ.A0A(drawable);
        drawable.setAlpha(i);
        AnonymousClass7TG.A14(this.A0B, i);
        AnonymousClass7TG.A14(this.A0A, i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable;
        C59985Jcu jcu = this.A00;
        if (jcu != null) {
            drawable = jcu.mutate();
        } else {
            drawable = null;
        }
        0qQ.A0A(drawable);
        drawable.setColorFilter(colorFilter);
        AnonymousClass7TG.A10(colorFilter, this.A0B);
        AnonymousClass7TG.A10(colorFilter, this.A0A);
        invalidateSelf();
    }

    public C380139Wu(Context context, ImageUrl imageUrl, String str, String str2, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3) {
        this.A0I = context;
        this.A01 = z3;
        this.A0M = z2;
        this.A0L = new CopyOnWriteArraySet();
        this.A02 = -1;
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        this.A04 = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A0E = dimensionPixelSize2;
        this.A0D = dimensionPixelSize - dimensionPixelSize2;
        int A072 = AnonymousClass7TG.A07(context);
        this.A0C = A072;
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.album_music_sticker_text_vertical_padding);
        this.A0G = dimensionPixelSize3;
        int A0H2 = AnonymousClass7TE.A0H(resources);
        this.A0F = A0H2;
        if (C253833rU.A02(imageUrl)) {
            this.A03 = null;
            A00();
        } else if (z) {
            this.A03 = null;
            Bitmap A0G2 = 1NK.A00().A0G(imageUrl);
            if (A0G2 != null) {
                A01(A0G2);
            }
            A00();
        } else {
            C321106ta A002 = C394019xP.A00(context, 0.3f);
            this.A03 = A002;
            0qQ.A0A(A002);
            A002.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            C321106ta r0 = this.A03;
            0qQ.A0A(r0);
            r0.setCallback(this);
            1OO A0J2 = 1NK.A00().A0J(imageUrl, (String) null);
            A0J2.A02(this);
            A0J2.A01();
        }
        int dimensionPixelSize4 = resources.getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A07 = dimensionPixelSize4;
        this.A06 = AnonymousClass7TE.A0E(resources);
        AnonymousClass6KL A003 = AnonymousClass6KK.A00(0.75f, resources.getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material), false);
        this.A09 = A003;
        A003.setBounds(0, 0, dimensionPixelSize4, dimensionPixelSize4);
        int color = context.getColor(R.color.black_20_transparent);
        A003.A01 = A072;
        A003.A09.setColor(color);
        A003.invalidateSelf();
        int dimensionPixelSize5 = resources.getDimensionPixelSize(i4);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, dimensionPixelSize5);
        this.A0B = A0s;
        A0s.setCallback(this);
        A0s.A0M(str2);
        int i7 = i5;
        AnonymousClass7TF.A11(resources, A0s, i7);
        A0s.A0F(i6);
        Typeface typeface = Typeface.SANS_SERIF;
        A0s.A0J(typeface, 1);
        int i8 = i3;
        A0s.A0G(i8, "…");
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context, dimensionPixelSize5);
        this.A0A = A0s2;
        A0s2.setCallback(this);
        A0s2.A0M(str);
        AnonymousClass7TF.A11(resources, A0s2, i7);
        A0s2.A0F(i2);
        A0s2.A0J(typeface, 0);
        A0s2.A0G(i8, "…");
        this.A08 = Math.max(dimensionPixelSize, dimensionPixelSize5);
        this.A05 = dimensionPixelSize + dimensionPixelSize3 + A0s.A06 + A0H2 + A0s2.A06 + dimensionPixelSize3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: X.Jcu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: X.6ta} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.Jcu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: X.Jcu} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            X.AnonymousClass7TF.A12(r11)
            android.graphics.Rect r7 = X.AnonymousClass7TE.A0X(r10)
            int r0 = r7.left
            float r1 = (float) r0
            int r6 = r10.A08
            int r5 = r10.A04
            int r0 = r6 - r5
            float r0 = (float) r0
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r9
            float r1 = r1 + r0
            int r0 = r7.top
            float r0 = (float) r0
            r11.translate(r1, r0)
            X.Jcu r1 = r10.A00
            r0 = 0
            if (r1 != 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            java.lang.String r8 = "Required value was null."
            r4 = 0
            if (r0 == 0) goto L_0x009e
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r10.A0H
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.min(r1, r0)
            X.6ta r0 = r10.A03
            if (r0 == 0) goto L_0x00d1
            r0.A00(r1)
        L_0x003e:
            r0.draw(r11)
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x005c
            r11.save()
            int r0 = r10.A06
            float r2 = (float) r0
            int r1 = r5 - r0
            int r0 = r10.A07
            int r1 = r1 - r0
            float r0 = (float) r1
            r11.translate(r2, r0)
            X.6KL r0 = r10.A09
            r0.draw(r11)
            r11.restore()
        L_0x005c:
            r11.restore()
            r11.save()
            X.AnonymousClass7TF.A13(r11, r7)
            r11.save()
            int r0 = r10.A0G
            int r5 = r5 + r0
            float r0 = (float) r5
            r11.translate(r4, r0)
            r11.save()
            X.6Ly r1 = r10.A0B
            int r0 = r1.A0A
            int r0 = r6 - r0
            float r0 = (float) r0
            float r0 = r0 / r9
            X.AnonymousClass7TF.A15(r11, r1, r0, r4)
            r11.save()
            X.6Ly r3 = r10.A0A
            int r0 = r3.A0A
            int r6 = r6 - r0
            float r2 = (float) r6
            float r2 = r2 / r9
            int r1 = r1.A06
            int r0 = r10.A0F
            int r1 = r1 + r0
            float r0 = (float) r1
            X.AnonymousClass7TF.A15(r11, r3, r2, r0)
            r11.restore()
            r11.restore()
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x009d
            r10.invalidateSelf()
        L_0x009d:
            return
        L_0x009e:
            int r1 = r10.A02
            r0 = -1
            if (r1 == r0) goto L_0x00c8
            android.graphics.Paint r3 = r10.A0J
            r3.setColor(r1)
            boolean r0 = r10.A0M
            if (r0 == 0) goto L_0x00bc
            android.content.Context r0 = r10.A0I
            int r2 = X.AnonymousClass7TE.A08(r0)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.DARKEN
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r2, r1)
            r3.setColorFilter(r0)
        L_0x00bc:
            android.graphics.RectF r1 = r10.A0K
            float r0 = (float) r5
            r1.set(r4, r4, r0, r0)
            int r0 = r10.A0C
            float r0 = (float) r0
            r11.drawRoundRect(r1, r0, r0, r3)
        L_0x00c8:
            X.Jcu r0 = r10.A00
            if (r0 != 0) goto L_0x003e
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        L_0x00d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380139Wu.draw(android.graphics.Canvas):void");
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
        A00();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
