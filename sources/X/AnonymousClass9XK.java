package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.List;

/* renamed from: X.9XK  reason: invalid class name */
public abstract class AnonymousClass9XK extends Drawable implements B3d, AnonymousClass5MJ, C300645xY {
    public int A00;
    public MusicOverlayStickerModel A01;
    public String A02;
    public boolean A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final C19498Wak A08;
    public final AnonymousClass6KJ A09;
    public final AnonymousClass6M4 A0A;
    public final int A0B;

    public AnonymousClass9XK(Context context, MusicOverlayStickerModel musicOverlayStickerModel, C19498Wak wak, AnonymousClass6KJ r6, float f) {
        this.A08 = wak;
        this.A01 = musicOverlayStickerModel;
        this.A0B = wak.Byp(wak.BcH() - 1);
        this.A06 = (int) (((float) 0nA.A09(context)) * f);
        this.A09 = r6;
        Paint A0V = AnonymousClass7TE.A0V(1);
        this.A07 = A0V;
        this.A05 = 0nA.A00(context, 5.0f);
        this.A04 = 0nA.A00(context, 10.0f);
        AnonymousClass7TE.A1N(context, A0V, R.color.cds_white_a20);
        this.A0A = C321156tf.A00(context, this);
    }

    public abstract void A01(Canvas canvas, int i);

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return A12.A00(userSession);
    }

    public final /* synthetic */ void Cmx() {
    }

    public void DT8(MusicOverlayStickerModel musicOverlayStickerModel) {
        0qQ.A0B(musicOverlayStickerModel, 0);
        this.A01 = musicOverlayStickerModel;
    }

    public final /* synthetic */ void EqG() {
    }

    public final /* synthetic */ void EvJ() {
    }

    public final void draw(Canvas canvas) {
        double d;
        int i;
        0qQ.A0B(canvas, 0);
        if (this.A03) {
            RectF rectF = new RectF(getBounds());
            AnonymousClass7TG.A12(rectF, rectF.left, this.A05);
            float f = this.A04;
            canvas.drawRoundRect(rectF, f, f, this.A07);
        }
        List list = this.A01.A0o;
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            AudioFilterType audioFilterType = ((AudioFilterInfo) list.get(0)).A00;
            0qQ.A0B(audioFilterType, 0);
            AnonymousClass8IJ[] values = AnonymousClass8IJ.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                AnonymousClass8IJ r1 = values[i3];
                if (r1.A04 == audioFilterType) {
                    d = (double) r1.A01;
                    break;
                }
                i3++;
            }
        }
        d = 1.0d;
        int i4 = this.A00;
        MusicOverlayStickerModel musicOverlayStickerModel = this.A01;
        Integer num = musicOverlayStickerModel.A0K;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = musicOverlayStickerModel.A0O;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        double d2 = (double) i;
        A01(canvas, 0mi.A03((int) ((((double) i4) * d) + d2), i, Math.min((int) (d2 + (((double) i2) * d)), this.A0B)));
        this.A0A.draw(canvas);
    }

    public abstract int getIntrinsicHeight();

    public final int getOpacity() {
        return -3;
    }

    public final MusicOverlayStickerModel BUu() {
        return this.A01;
    }

    public final AnonymousClass6KJ BV4() {
        return this.A09;
    }

    public final AnonymousClass6M4 C49() {
        return this.A0A;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void EXC(int i, int i2) {
        this.A00 = i;
        invalidateSelf();
    }

    public final void FL9(boolean z, boolean z2) {
        this.A03 = z;
        AnonymousClass6M4 r0 = this.A0A;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final int getDurationInMs() {
        return AnonymousClass7TG.A0A(this.A01.A0O);
    }

    public final int getIntrinsicWidth() {
        return this.A06;
    }
}
