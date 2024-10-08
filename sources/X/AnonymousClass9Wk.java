package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.9Wk  reason: invalid class name */
public final class AnonymousClass9Wk extends Drawable {
    public boolean A00;
    public int A01;
    public C306386Ly A02;
    public C306386Ly A03;
    public boolean A04;
    public final float A05;
    public final long A06 = System.currentTimeMillis();
    public final C321016tR A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final Resources A0D;
    public final Typeface A0E;
    public final GradientDrawable A0F;
    public final SpannableString A0G;
    public final C306386Ly A0H;
    public final String A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final boolean A0M;

    public static final int A00(long j, int i, int i2) {
        float f = (float) j;
        float f2 = (float) i;
        float f3 = 2000.0f - 1600.0f;
        float f4 = ((float) i2) - f2;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f - 1600.0f) / f3;
        }
        return (int) ((f5 * f4) + f2);
    }

    public final void draw(Canvas canvas) {
        C321016tR r4;
        0qQ.A0B(canvas, 0);
        int i = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
        GradientDrawable gradientDrawable = this.A0F;
        gradientDrawable.draw(canvas);
        if (this.A00) {
            long currentTimeMillis = (System.currentTimeMillis() - this.A06) % 2000;
            if (currentTimeMillis < 1600) {
                if (this.A04) {
                    C306386Ly r2 = this.A02;
                    this.A02 = this.A03;
                    this.A03 = r2;
                    List list = this.A0K;
                    int i2 = this.A01 + 1;
                    this.A01 = i2;
                    AnonymousClass7TF.A1A(r2, A01(AnonymousClass7TE.A19(list, AnonymousClass7TG.A0G(list, i2))));
                    this.A04 = false;
                }
                C306386Ly r6 = this.A02;
                int i3 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
                int i4 = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
                int i5 = r6.A0A;
                int i6 = (int) this.A05;
                int i7 = (i5 + i6) / 2;
                int i8 = r6.A06 / 2;
                r6.setBounds((i3 - i7) + i6, i4 - i8, i3 + i7, i8 + i4);
                r4 = this.A07;
                int i9 = i6 / 2;
                r4.setBounds(AnonymousClass7TE.A0J(r6) - r4.getIntrinsicWidth(), i4 - i9, AnonymousClass7TE.A0J(r6), i4 + i9);
                this.A02.draw(canvas);
                C306386Ly r7 = this.A03;
                int i10 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
                int i11 = (canvas.getClipBounds().top + canvas.getClipBounds().bottom) / 2;
                int i12 = (r7.A0A + i6) / 2;
                r7.setBounds((i10 - i12) + i6, (i11 - (r7.A06 / 2)) - canvas.getHeight(), i10 + i12, (i11 + (r7.A06 / 2)) - canvas.getHeight());
            } else {
                A02(canvas, this.A02, A00(currentTimeMillis, this.A02.getBounds().bottom, (this.A02.A06 / 2) + i + canvas.getClipBounds().height()));
                int i13 = this.A03.getBounds().bottom;
                C306386Ly r3 = this.A03;
                A02(canvas, r3, A00(currentTimeMillis, i13, i + (r3.A06 / 2)));
                C321016tR r62 = this.A07;
                r4 = r62;
                int A002 = A00(currentTimeMillis, AnonymousClass7TE.A0J(r62), AnonymousClass7TE.A0J(this.A03) - r62.getIntrinsicWidth());
                r62.setBounds(A002, r62.getBounds().top, r62.getIntrinsicWidth() + A002, r62.getBounds().bottom);
                canvas.save();
                canvas.clipRect(gradientDrawable.getBounds());
                this.A02.draw(canvas);
                this.A03.draw(canvas);
                canvas.restore();
                this.A04 = true;
            }
            r4.draw(canvas);
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public AnonymousClass9Wk(Context context, UserSession userSession, C317876nz r24, boolean z) {
        0qm r1;
        String str;
        this.A0M = z;
        Context context2 = context;
        Resources resources = context2.getResources();
        this.A0D = resources;
        AnonymousClass0qq A002 = AnonymousClass0qo.A00(context2);
        if (z) {
            r1 = 0qm.A0Y;
        } else {
            r1 = 0qm.A0V;
        }
        this.A0E = A002.A02(r1);
        String string = resources.getString(z ? 2131964151 : 2131964150);
        0qQ.A0A(string);
        this.A0I = string;
        List A1P = 0sr.A1P(new String[]{C273654mx.A00(487), "Gamer", "Festival", "Anime", "Dolphin", "Burger"});
        this.A0J = A1P;
        List list = r24.A0R;
        List A1G = 0jo.A1G(list != null ? list : A1P);
        this.A0L = A1G;
        if (!z) {
            ArrayList A0p = AnonymousClass7TF.A0p(A1G);
            Iterator it = A1G.iterator();
            while (it.hasNext()) {
                A0p.add(AnonymousClass7TF.A0k(AnonymousClass7TE.A18(it)));
            }
            A1G = A0p;
        }
        this.A0K = A1G;
        UserSession userSession2 = userSession;
        double A003 = C346897vw.A00(userSession2);
        this.A09 = (int) (((double) AnonymousClass7TE.A0F(this.A0D)) * A003);
        this.A08 = (int) (((double) AnonymousClass7TE.A0G(this.A0D)) * A003);
        this.A0B = (int) (((double) AnonymousClass7TE.A0D(this.A0D)) * A003);
        this.A0C = (int) (((double) AnonymousClass7TE.A0C(this.A0D)) * A003);
        this.A05 = (float) (((double) this.A0D.getDimensionPixelSize(R.dimen.abc_star_medium)) * A003);
        int dimensionPixelSize = (int) (((double) this.A0D.getDimensionPixelSize(R.dimen.contextual_sticker_tray_text_size)) * A003);
        this.A0A = dimensionPixelSize;
        SpannableString spannableString = new SpannableString(this.A0I);
        spannableString.setSpan(new ForegroundColorSpan(-16777216), 0, this.A0I.length(), 33);
        this.A0G = spannableString;
        Spannable spannable = C306386Ly.A0d;
        C306386Ly A0s = AnonymousClass7TE.A0s(context2, AnonymousClass8XF.A01(context2));
        A0s.A0L(spannableString);
        float f = (float) dimensionPixelSize;
        A0s.A0A(f);
        A0s.A0I(this.A0E);
        this.A02 = A0s;
        C306386Ly A0s2 = AnonymousClass7TE.A0s(context2, AnonymousClass8XF.A01(context2));
        A0s2.A0L(A01(AnonymousClass7TE.A19(A1G, this.A01)));
        A0s2.A0A(f);
        A0s2.A0I(this.A0E);
        this.A03 = A0s2;
        ArrayList A0p2 = AnonymousClass7TF.A0p(A1G);
        Iterator it2 = A1G.iterator();
        while (it2.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it2);
            C306386Ly A0s3 = AnonymousClass7TE.A0s(context2, AnonymousClass8XF.A01(context2));
            StringBuilder A1A = AnonymousClass7TE.A1A();
            if (z) {
                A1A.append(A18);
                str = " me";
            } else {
                A1A.append(A18);
                str = " ME";
            }
            A0s3.A0M(AnonymousClass7TF.A0l(str, A1A));
            A0s3.A0A((float) this.A0A);
            A0s3.A0I(this.A0E);
            A0s3.A0F(-16777216);
            A0p2.add(A0s3);
        }
        Iterator it3 = A0p2.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            if (it3.hasNext()) {
                int i = ((C306386Ly) next).A0A;
                do {
                    Object next2 = it3.next();
                    int i2 = ((C306386Ly) next2).A0A;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it3.hasNext());
            }
            this.A0H = (C306386Ly) next;
            String A012 = AnonymousClass2dd.A01(context2.getResources(), R.drawable.fb_feed_answersheet_meta_ai_rotate);
            A012 = A012 == null ? "" : A012;
            String valueOf = String.valueOf(R.drawable.fb_feed_answersheet_meta_ai_rotate);
            int i3 = (int) this.A05;
            this.A07 = new C321016tR(context2, userSession2, new C321076tX(-1, i3, i3), AnonymousClass05K.A01, A012, valueOf, (String) null, 1.0f, context2.getColor(R.color.fds_transparent), context2.getColor(R.color.fds_transparent), false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(-1);
            gradientDrawable.setCornerRadius((float) this.A09);
            this.A0F = gradientDrawable;
            return;
        }
        throw new NoSuchElementException();
    }

    private final SpannableString A01(String str) {
        String str2;
        int parseColor = Color.parseColor("#FF0866FF");
        int parseColor2 = Color.parseColor("#FF0C1014");
        boolean z = this.A0M;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (z) {
            A1A.append(str);
            str2 = " me";
        } else {
            A1A.append(str);
            str2 = " ME";
        }
        String A0l = AnonymousClass7TF.A0l(str2, A1A);
        SpannableString spannableString = new SpannableString(A0l);
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(parseColor);
        int length = str.length();
        spannableString.setSpan(foregroundColorSpan, 0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(parseColor2), length, A0l.length(), 33);
        return spannableString;
    }

    public final int getIntrinsicHeight() {
        return this.A0H.A06 + (this.A0B * 2) + (this.A0C * 2);
    }

    public final int getIntrinsicWidth() {
        return this.A0H.A0A + (this.A08 * 2) + ((int) this.A05);
    }

    public final void setAlpha(int i) {
        this.A0F.setAlpha(i);
        this.A07.setAlpha(i);
        this.A02.setAlpha(i);
        this.A03.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
        this.A07.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    private final void A02(Canvas canvas, C306386Ly r6, int i) {
        int i2 = (canvas.getClipBounds().left + canvas.getClipBounds().right) / 2;
        int i3 = r6.A0A;
        int i4 = (int) this.A05;
        int i5 = (i3 + i4) / 2;
        r6.setBounds((i2 - i5) + i4, i - r6.A06, i2 + i5, i);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        int i6 = (i2 + i4) / 2;
        int intrinsicWidth = getIntrinsicWidth() / 2;
        int intrinsicHeight = getIntrinsicHeight() / 2;
        int i7 = this.A0B;
        int i8 = (i6 + intrinsicHeight) - i7;
        this.A0F.setBounds(i5 - intrinsicWidth, (i6 - intrinsicHeight) + i7, i5 + intrinsicWidth, i8);
    }
}
