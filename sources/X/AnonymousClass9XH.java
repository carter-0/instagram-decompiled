package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9XH  reason: invalid class name */
public class AnonymousClass9XH extends Drawable implements B3d, Drawable.Callback, C300645xY, B3e {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final AnonymousClass6M4 A06;
    public final AnonymousClass6KJ A07 = AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART;
    public final C380139Wu A08;
    public final String A09 = C273654mx.A00(823);

    public AnonymousClass9XH(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z, boolean z2) {
        this.A00 = musicOverlayStickerModel;
        Context context2 = context;
        this.A06 = C321156tf.A00(context2, this);
        boolean z3 = true;
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context2, A0V, R.color.cds_white_a20);
        this.A05 = A0V;
        this.A04 = 0nA.A00(context2, 5.0f);
        this.A03 = 0nA.A00(context2, 10.0f);
        MusicAssetModel A032 = MusicAssetModel.A03(this.A00);
        ImageUrl imageUrl = A032.A02;
        0qQ.A07(imageUrl);
        String str = A032.A0I;
        0qQ.A07(str);
        String str2 = A032.A0D;
        0qQ.A07(str2);
        int i2 = i;
        C380139Wu r1 = new C380139Wu(context2, imageUrl, str2, str, R.dimen.album_music_sticker_album_art_size, i2, 2, R.dimen.album_music_sticker_album_art_size, R.dimen.action_bar_item_spacing_right, i2, z, (!A032.A0U || !AnonymousClass30D.A0C(userSession)) ? false : z3, z2);
        this.A08 = r1;
        r1.setCallback(this);
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return A12.A00(userSession);
    }

    public final void DT8(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A00 = musicOverlayStickerModel;
    }

    public final void Ejy(boolean z) {
        this.A01 = true;
    }

    public final int getOpacity() {
        return -3;
    }

    public final int Aox() {
        return this.A08.A0B.A0b.getColor();
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A00;
    }

    public final AnonymousClass6KJ BV4() {
        return this.A07;
    }

    public final /* synthetic */ C391369sm Bsf() {
        return C391369sm.MUSIC_SOUNDWAVE;
    }

    public final C381689cA Bxe() {
        C380139Wu r6 = this.A08;
        int i = r6.A06;
        int i2 = r6.A07;
        int i3 = i2 / 2;
        int i4 = r6.A05;
        float f = (float) i2;
        return new C381689cA(3, (float) (((r6.A08 / 2) - i) - i3), (float) ((((i4 / 2) - (i4 - r6.A04)) - i) - i3), f, f);
    }

    public final AnonymousClass6M4 C49() {
        return this.A06;
    }

    public final String C4F() {
        return this.A09;
    }

    public final boolean Cbg() {
        return this.A01;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void Cmx() {
        if (!(this instanceof AnonymousClass5MJ) || this.A01) {
            this.A08.A01 = false;
        }
    }

    public final void ESC(int i) {
        C380139Wu r1 = this.A08;
        r1.A0B.A0F(i);
        r1.A0A.A0F(i);
    }

    public final void EvJ() {
        this.A08.A01 = true;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A02 = z;
        AnonymousClass6M4 r0 = this.A06;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A08.A05;
    }

    public final int getIntrinsicWidth() {
        return this.A08.A08;
    }

    public final void setAlpha(int i) {
        AnonymousClass7TG.A14(this.A08, i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A08);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        if (this.A02) {
            RectF rectF = new RectF(getBounds());
            AnonymousClass7TG.A12(rectF, rectF.left, this.A04);
            float f = this.A03;
            canvas.drawRoundRect(rectF, f, f, this.A05);
        }
        AnonymousClass7TG.A0z(canvas, this);
        this.A08.draw(canvas);
        canvas.restore();
        this.A06.draw(canvas);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
