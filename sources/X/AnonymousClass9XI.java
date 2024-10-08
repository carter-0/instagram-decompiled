package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9XI  reason: invalid class name */
public final class AnonymousClass9XI extends Drawable implements B3d, C300645xY {
    public int A00;
    public MusicOverlayStickerModel A01;
    public final AnonymousClass6M4 A02;
    public final String A03 = AnonymousClass000.A00(1607);

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

    public final void draw(Canvas canvas) {
    }

    public final int getIntrinsicHeight() {
        return 0;
    }

    public final int getIntrinsicWidth() {
        return 0;
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

    public final String C4F() {
        return this.A03;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public AnonymousClass9XI(Context context, MusicOverlayStickerModel musicOverlayStickerModel, int i) {
        this.A00 = i;
        this.A01 = musicOverlayStickerModel;
        this.A02 = C321156tf.A00(context, this);
    }

    public final void ESC(int i) {
        this.A00 = i;
    }
}
