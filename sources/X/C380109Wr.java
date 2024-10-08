package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.9Wr  reason: invalid class name and case insensitive filesystem */
public final class C380109Wr extends Drawable implements Drawable.Callback, B3c {
    public MusicOverlayStickerModel A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Paint A05;
    public final RectF A06;
    public final RectF A07;
    public final AnonymousClass6M4 A08;
    public final C380139Wu A09;
    public final QuestionResponseReshareModel A0A;
    public final C389759q9 A0B;

    public final int Aox() {
        return 0;
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return A12.A00(userSession);
    }

    public final /* synthetic */ void Cmx() {
    }

    public final /* synthetic */ void DT8(MusicOverlayStickerModel musicOverlayStickerModel) {
    }

    public final void ESC(int i) {
    }

    public final /* synthetic */ void EvJ() {
    }

    public final /* synthetic */ void FL9(boolean z, boolean z2) {
    }

    public final int getOpacity() {
        return -3;
    }

    public C380109Wr(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        Context context2 = context;
        Resources resources = context2.getResources();
        QuestionResponseReshareModel questionResponseReshareModel2 = questionResponseReshareModel;
        this.A0A = questionResponseReshareModel2;
        int i2 = i;
        this.A04 = i2;
        int A0D = AnonymousClass7TE.A0D(resources);
        this.A02 = A0D;
        int A0F = AnonymousClass7TE.A0F(resources);
        this.A01 = A0F;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A05 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        A0V.setColor(-1);
        C389759q9 r1 = new C389759q9(context2, questionResponseReshareModel2.A07, i2);
        this.A0B = r1;
        r1.setCallback(this);
        MusicQuestionResponseModel musicQuestionResponseModel = questionResponseReshareModel2.A01;
        musicQuestionResponseModel.getClass();
        MusicAssetModel A012 = MusicAssetModel.A01(musicQuestionResponseModel.A00, false);
        int color = context2.getColor(R.color.grey_9);
        ImageUrl imageUrl = A012.A02;
        String str = A012.A0I;
        String str2 = A012.A0D;
        AnonymousClass7TG.A0w(2, imageUrl, str, str2);
        C380139Wu r7 = new C380139Wu(context2, imageUrl, str2, str, R.dimen.album_music_sticker_album_art_size, color, 2, R.dimen.album_music_sticker_album_art_size, R.dimen.action_bar_item_spacing_right, color, false, false, false);
        this.A09 = r7;
        r7.setCallback(this);
        int i3 = r7.A05 + A0D;
        this.A03 = r1.A01 + i3;
        float f = (float) i2;
        this.A07 = new RectF(0.0f, 0.0f, f, (float) i3);
        this.A06 = new RectF(0.0f, 0.0f, f, (float) (i3 - A0F));
        this.A08 = C321156tf.A00(context2, this);
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A00;
    }

    public final AnonymousClass6KJ BV4() {
        return AnonymousClass6KJ.UNKNOWN;
    }

    public final A7J Bik() {
        return this.A0A.A02;
    }

    public final AnonymousClass6M4 C49() {
        return this.A08;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final int getIntrinsicHeight() {
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        return this.A04;
    }

    public final void setAlpha(int i) {
        AnonymousClass7TG.A14(this.A0B, i);
        AnonymousClass7TG.A14(this.A09, i);
        this.A05.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A0B);
        AnonymousClass7TG.A10(colorFilter, this.A09);
        this.A05.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        AnonymousClass7TF.A13(canvas, bounds);
        C389759q9 r0 = this.A0B;
        r0.draw(canvas);
        canvas.translate(0.0f, (float) r0.A01);
        RectF rectF = this.A07;
        float f = (float) this.A01;
        Paint paint = this.A05;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A06, paint);
        int i = this.A04;
        C380139Wu r2 = this.A09;
        AnonymousClass7TF.A15(canvas, r2, (float) ((i - r2.A08) / 2), (float) this.A02);
    }

    public final void Edm(MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A00 = musicOverlayStickerModel;
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
