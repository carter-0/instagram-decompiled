package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9XF  reason: invalid class name */
public final class AnonymousClass9XF extends Drawable implements B3d {
    public int A00 = -1;
    public MusicOverlayStickerModel A01;
    public final AnonymousClass6M4 A02;
    public final C306386Ly A03;

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
        this.A01 = musicOverlayStickerModel;
    }

    public final /* synthetic */ void EvJ() {
    }

    public final /* synthetic */ void FL9(boolean z, boolean z2) {
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int Aox() {
        return this.A00;
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A01;
    }

    public final AnonymousClass6KJ BV4() {
        return AnonymousClass6KJ.MUSIC_ONLY;
    }

    public final AnonymousClass6M4 C49() {
        return this.A02;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final int getIntrinsicHeight() {
        return this.A03.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A03.A0A;
    }

    public AnonymousClass9XF(Context context, MusicOverlayStickerModel musicOverlayStickerModel) {
        this.A01 = musicOverlayStickerModel;
        this.A02 = C321156tf.A00(context, this);
        C306386Ly A0s = AnonymousClass7TE.A0s(context, context.getResources().getDimensionPixelSize(R.dimen.music_sticker_max_width));
        AnonymousClass7TF.A11(context.getResources(), A0s, R.dimen.clips_template_landing_page_template_preview_clip_index_text_size);
        AnonymousClass7TE.A1O(context, A0s, 2Yu.A0A(context));
        AnonymousClass7TE.A1P(context.getResources(), A0s, 2131967884);
        this.A03 = A0s;
    }

    public final void draw(Canvas canvas) {
        AnonymousClass7TF.A12(canvas);
        C306386Ly r4 = this.A03;
        Rect rect = new Rect((int) (((float) AnonymousClass7TF.A04(this)) - (((float) r4.A0A) / 2.0f)), (int) (((float) AnonymousClass7TF.A05(this)) - (((float) r4.A06) / 2.0f)), (int) (((float) AnonymousClass7TF.A04(this)) + (((float) r4.A0A) / 2.0f)), (int) (((float) AnonymousClass7TF.A05(this)) + (((float) r4.A06) / 2.0f)));
        AnonymousClass7TF.A15(canvas, r4, (float) rect.left, (float) rect.top);
    }

    public final void ESC(int i) {
        this.A00 = i;
    }
}
