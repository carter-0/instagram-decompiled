package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;

/* renamed from: X.9XG  reason: invalid class name */
public class AnonymousClass9XG extends Drawable implements B3d, Drawable.Callback, C300645xY, B3e {
    public MusicOverlayStickerModel A00;
    public boolean A01;
    public boolean A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final C380089Wp A06;
    public final AnonymousClass6M4 A07;
    public final String A08 = C273654mx.A00(829);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002d, code lost:
        if (X.AnonymousClass30D.A0C(r12) == false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9XG(android.content.Context r11, com.instagram.common.session.UserSession r12, com.instagram.music.common.model.MusicOverlayStickerModel r13, int r14, boolean r15) {
        /*
            r10 = this;
            r7 = 1
            r10.<init>()
            r10.A00 = r13
            r0 = 829(0x33d, float:1.162E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r10.A08 = r0
            com.instagram.music.common.model.MusicAssetModel r4 = com.instagram.music.common.model.MusicAssetModel.A03(r13)
            r3 = r11
            android.content.res.Resources r1 = r11.getResources()
            r0 = 2131165657(0x7f0701d9, float:1.7945537E38)
            int r5 = r1.getDimensionPixelSize(r0)
            com.instagram.music.common.model.MusicOverlayStickerModel r0 = r10.A00
            java.lang.Boolean r0 = r0.A0E
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r7)
            if (r0 == 0) goto L_0x002f
            boolean r0 = X.AnonymousClass30D.A0C(r12)
            r8 = 1
            if (r0 != 0) goto L_0x0030
        L_0x002f:
            r8 = 0
        L_0x0030:
            X.9Wp r2 = new X.9Wp
            r6 = r14
            r9 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.A06 = r2
            android.graphics.Paint r1 = X.AnonymousClass7TE.A0V(r7)
            r10.A05 = r1
            r2.setCallback(r10)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = X.0nA.A00(r11, r0)
            r10.A04 = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.0nA.A00(r11, r0)
            r10.A03 = r0
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
            X.AnonymousClass7TE.A1N(r11, r1, r0)
            X.6M4 r0 = X.C321156tf.A00(r11, r10)
            r10.A07 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9XG.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.music.common.model.MusicOverlayStickerModel, int, boolean):void");
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
        return this.A06.A0C.getColor();
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A00;
    }

    public final AnonymousClass6KJ BV4() {
        return AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE;
    }

    public final /* synthetic */ C391369sm Bsf() {
        return C391369sm.MUSIC_SOUNDWAVE;
    }

    public final C381689cA Bxe() {
        C380089Wp r1 = this.A06;
        int i = r1.A04;
        float f = (float) i;
        return new C381689cA(3, (float) (((r1.A09 / 2) - r1.A03) - (i / 2)), 0.0f, f, f);
    }

    public final AnonymousClass6M4 C49() {
        return this.A07;
    }

    public final String C4F() {
        return this.A08;
    }

    public final boolean Cbg() {
        return this.A01;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void Cmx() {
        if (!(this instanceof AnonymousClass5MJ) || this.A01) {
            this.A06.A00 = false;
        }
    }

    public final void ESC(int i) {
        int A082;
        C380089Wp r2 = this.A06;
        r2.A0C.setColor(i);
        if (i == r2.A07) {
            A082 = -1;
        } else {
            A082 = 0nH.A08(i, 1.0f);
        }
        ((C306386Ly) r2.A0F.getValue()).A0F(A082);
        ((C306386Ly) r2.A0D.getValue()).A0F(A082);
        r2.invalidateSelf();
    }

    public final void EvJ() {
        this.A06.A00 = true;
    }

    public final void FL9(boolean z, boolean z2) {
        this.A02 = z;
        AnonymousClass6M4 r0 = this.A07;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getIntrinsicHeight() {
        return this.A06.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A06.A09;
    }

    public final void setAlpha(int i) {
        AnonymousClass7TG.A14(this.A06, i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        AnonymousClass7TG.A10(colorFilter, this.A06);
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
        this.A06.draw(canvas);
        canvas.restore();
        this.A07.draw(canvas);
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
