package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.JdF  reason: case insensitive filesystem */
public final class C60006JdF extends Drawable implements C321026tS {
    public boolean A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final Context A06;
    public final Paint A07;
    public final Drawable A08;
    public final Drawable A09;
    public final AnonymousClass6M4 A0A;
    public final MusicAssetModel A0B;
    public final GAM A0C;
    public final int A0D;
    public final UserSession A0E;

    public C60006JdF(Context context, UserSession userSession, MusicAssetModel musicAssetModel) {
        Context context2 = context;
        this.A06 = context2;
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        this.A0B = musicAssetModel;
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.album_music_sticker_album_art_size);
        this.A04 = context2.getResources().getDimensionPixelSize(R.dimen.abc_star_medium);
        int A022 = DbS.A02(context2, 6);
        this.A0D = A022;
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context2, A0V, R.color.cds_white_a20);
        this.A07 = A0V;
        this.A03 = 0nA.A00(context2, 10.0f);
        this.A02 = 0nA.A00(context2, 8.0f);
        Drawable A012 = AnonymousClass4Ed.A01(context2, R.drawable.instagram_music_pano_filled_12, 2Yu.A0H(context2, R.attr.igds_color_icon_on_media));
        if (A012 != null) {
            this.A09 = A012;
            Drawable A013 = AnonymousClass4Ed.A01(context2, R.drawable.music_explicit, 2Yu.A0H(context2, R.attr.igds_color_icon_on_media));
            if (A013 != null) {
                this.A08 = A013;
                SpannableStringBuilder A0E2 = C51965G9l.A0E();
                MusicAssetModel musicAssetModel2 = this.A0B;
                A0E2.append(musicAssetModel2.A0I);
                if (musicAssetModel2.A0S) {
                    A0E2.append(" ");
                    C263324Kh.A02(this.A08, A0E2, A0E2.length(), 0, 0);
                }
                A0E2.append(" • ");
                int length = A0E2.length();
                A0E2.append(musicAssetModel2.A0D);
                Context context3 = this.A06;
                A0E2.setSpan(new ForegroundColorSpan(AnonymousClass7TF.A03(context3, R.attr.igds_color_primary_text_on_media)), 0, length, 33);
                A0E2.setSpan(new ForegroundColorSpan(context3.getColor(R.color.bright_foreground_disabled_material_dark)), length, A0E2.length(), 33);
                int A032 = AnonymousClass7TF.A03(context2, R.attr.igds_color_primary_text_on_media);
                Integer num = AnonymousClass05K.A00;
                Typeface typeface = Typeface.SANS_SERIF;
                0qQ.A08(typeface);
                this.A0C = new GAM(context2, 0oh.A03(context2, typeface, num), (Drawable) null, A0E2, userSession2, R.dimen.add_payment_bottom_sheet_row_subtitle_size, A032);
                this.A05 = (dimensionPixelSize - A012.getIntrinsicWidth()) - A022;
                this.A0A = C321156tf.A00(context2, this);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final int getOpacity() {
        return -3;
    }

    public final AnonymousClass6M4 C49() {
        return this.A0A;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A01 = z;
        AnonymousClass6M4 r0 = this.A0A;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A04;
    }

    public final int getIntrinsicWidth() {
        int intrinsicWidth = this.A09.getIntrinsicWidth() + this.A0D;
        C306386Ly r0 = this.A0C.A02;
        if (r0 != null) {
            return intrinsicWidth + Math.min(r0.A0A, this.A05) + (((int) this.A03) * 2);
        }
        0qQ.A0F("textDrawableStart");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setAlpha(int i) {
        this.A09.setAlpha(i);
        this.A0C.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A09.setColorFilter(colorFilter);
        this.A0C.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        if (this.A01) {
            Drawable drawable = this.A09;
            float f = this.A03;
            RectF rectF = new RectF(((float) drawable.getBounds().left) - f, ((float) drawable.getBounds().top) - f, ((float) this.A0C.getBounds().right) + f, ((float) JTO.A06(drawable)) + f);
            float f2 = this.A02;
            canvas.drawRoundRect(rectF, f2, f2, this.A07);
        }
        this.A09.draw(canvas);
        this.A0C.draw(canvas);
        this.A0A.draw(canvas);
        canvas.restore();
        if (this.A00) {
            invalidateSelf();
        }
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i2 + i4)) / 2.0f;
        int intrinsicWidth = (int) ((((float) (i + i3)) / 2.0f) - ((float) (getIntrinsicWidth() / 2)));
        Drawable drawable = this.A09;
        int i5 = (int) this.A03;
        int i6 = i5 + intrinsicWidth;
        drawable.setBounds(i6, (int) (f - ((float) (drawable.getIntrinsicHeight() / 2))), i6 + drawable.getIntrinsicWidth(), (int) (((float) (drawable.getIntrinsicHeight() / 2)) + f));
        GAM gam = this.A0C;
        gam.setBounds(i6 + drawable.getIntrinsicWidth() + this.A0D, (int) (f - ((float) (gam.getIntrinsicHeight() / 2))), (intrinsicWidth + getIntrinsicWidth()) - i5, (int) (f + ((float) (gam.getIntrinsicHeight() / 2))));
        gam.A02(Integer.valueOf(this.A05), (Integer) null);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return true;
    }
}
