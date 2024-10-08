package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponseReshareModel;

/* renamed from: X.9Ws  reason: invalid class name and case insensitive filesystem */
public final class C380119Ws extends Drawable implements Drawable.Callback, B3c {
    public MusicOverlayStickerModel A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final RectF A07;
    public final RectF A08;
    public final AnonymousClass6M4 A09;
    public final C380089Wp A0A;
    public final QuestionResponseReshareModel A0B;
    public final C389759q9 A0C;

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

    public final MusicOverlayStickerModel BUu() {
        return this.A00;
    }

    public final AnonymousClass6KJ BV4() {
        return AnonymousClass6KJ.UNKNOWN;
    }

    public final A7J Bik() {
        return this.A0B.A02;
    }

    public final AnonymousClass6M4 C49() {
        return this.A09;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final int getIntrinsicHeight() {
        return this.A04;
    }

    public final int getIntrinsicWidth() {
        return this.A05;
    }

    public final void setAlpha(int i) {
        AnonymousClass7TG.A14(this.A0C, i);
        AnonymousClass7TG.A14(this.A0A, i);
        this.A06.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A0C);
        AnonymousClass7TG.A10(colorFilter, this.A0A);
        this.A06.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C380119Ws(Context context, QuestionResponseReshareModel questionResponseReshareModel, int i) {
        Resources resources = context.getResources();
        QuestionResponseReshareModel questionResponseReshareModel2 = questionResponseReshareModel;
        this.A0B = questionResponseReshareModel2;
        int i2 = i;
        this.A05 = i2;
        int A0D = AnonymousClass7TE.A0D(resources);
        this.A03 = A0D;
        int A0E = AnonymousClass7TE.A0E(resources);
        this.A02 = A0E;
        int A0F = AnonymousClass7TE.A0F(resources);
        this.A01 = A0F;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A06 = A0V;
        AnonymousClass7TE.A1Q(A0V);
        A0V.setColor(-1);
        C389759q9 r1 = new C389759q9(context, questionResponseReshareModel2.A07, i2);
        this.A0C = r1;
        r1.setCallback(this);
        MusicQuestionResponseModel musicQuestionResponseModel = questionResponseReshareModel2.A01;
        musicQuestionResponseModel.getClass();
        C380089Wp r6 = new C380089Wp(context, MusicAssetModel.A01(musicQuestionResponseModel.A00, false), i - (A0E * 2), -1, false, false, false);
        this.A0A = r6;
        r6.setCallback(this);
        int i3 = r6.A06 + (A0D * 2);
        this.A04 = r1.A01 + i3;
        float f = (float) i2;
        this.A08 = new RectF(0.0f, 0.0f, f, (float) i3);
        this.A07 = new RectF(0.0f, 0.0f, f, (float) (i3 - A0F));
        this.A09 = C321156tf.A00(context, this);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        AnonymousClass7TF.A13(canvas, bounds);
        C389759q9 r0 = this.A0C;
        r0.draw(canvas);
        canvas.translate(0.0f, (float) r0.A01);
        RectF rectF = this.A08;
        float f = (float) this.A01;
        Paint paint = this.A06;
        canvas.drawRoundRect(rectF, f, f, paint);
        canvas.drawRect(this.A07, paint);
        canvas.translate((float) this.A02, (float) this.A03);
        this.A0A.draw(canvas);
        canvas.restore();
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
