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

/* renamed from: X.9XJ  reason: invalid class name */
public final class AnonymousClass9XJ extends Drawable implements B3d, AnonymousClass5MJ, Drawable.Callback, C300645xY {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public final float A02;
    public final float A03;
    public final Paint A04;
    public final AnonymousClass6M4 A05;
    public final AnonymousClass6KJ A06 = AnonymousClass6KJ.MUSIC_VINYL;
    public final AnonymousClass9Wo A07;
    public final String A08 = C273654mx.A00(830);

    public AnonymousClass9XJ(Context context, UserSession userSession, MusicOverlayStickerModel musicOverlayStickerModel, int i, boolean z) {
        this.A00 = musicOverlayStickerModel;
        Paint A0V = AnonymousClass7TE.A0V(1);
        AnonymousClass7TE.A1N(context, A0V, R.color.cds_white_a20);
        this.A04 = A0V;
        this.A03 = (float) AnonymousClass7TG.A07(context);
        this.A02 = (float) AnonymousClass7TG.A05(context);
        MusicAssetModel A032 = MusicAssetModel.A03(this.A00);
        ImageUrl imageUrl = A032.A03;
        0qQ.A07(imageUrl);
        String str = A032.A0I;
        0qQ.A07(str);
        String str2 = A032.A0D;
        0qQ.A07(str2);
        AnonymousClass9Wo r1 = new AnonymousClass9Wo(context, userSession, imageUrl, AnonymousClass05K.A00, str, str2, 0.0f, i, z, true);
        r1.setCallback(this);
        this.A07 = r1;
        this.A05 = C321156tf.A00(context, this);
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return A12.A00(userSession);
    }

    public final /* synthetic */ void Cmx() {
    }

    public final void DT8(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A00 = musicOverlayStickerModel;
    }

    public final /* synthetic */ void EqG() {
    }

    public final /* synthetic */ void EvJ() {
    }

    public final int getOpacity() {
        return -3;
    }

    public final int Aox() {
        return this.A07.A0E.A0b.getColor();
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A00;
    }

    public final AnonymousClass6KJ BV4() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ C2802350v BzV() {
        return new Af0(this.A00, (C40599Aen) null, this.A06, this.A07.A0E.A0b.getColor());
    }

    public final AnonymousClass6M4 C49() {
        return this.A05;
    }

    public final String C4F() {
        return this.A08;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void ESC(int i) {
        AnonymousClass9Wo r1 = this.A07;
        r1.A0E.A0F(i);
        r1.A0D.A0F(i);
    }

    public final void EXC(int i, int i2) {
        this.A07.A00 = i;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A01 = z;
        AnonymousClass6M4 r0 = this.A05;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return AnonymousClass7TG.A0A(this.A00.A0O);
    }

    public final int getIntrinsicHeight() {
        return this.A07.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A07.A0A;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        if (this.A01) {
            RectF rectF = new RectF(getBounds());
            AnonymousClass7TG.A12(rectF, rectF.left, this.A03);
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A04);
        }
        AnonymousClass7TG.A0z(canvas, this);
        this.A07.draw(canvas);
        canvas.restore();
        this.A05.draw(canvas);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AnonymousClass7TH.A0L(this, runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AnonymousClass7TH.A0M(this, runnable, j);
    }
}
