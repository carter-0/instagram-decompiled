package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.UpT  reason: case insensitive filesystem */
public final class C16142UpT extends C299875vz {
    public final int A00;
    public final C59988Jcx A01;
    public final C19469WaH A02;
    public final C15839UjP A03;
    public final C306386Ly A04;
    public final int A05;
    public final int A06;

    public C16142UpT(Context context, UserSession userSession, C19469WaH waH) {
        Drawable drawable;
        C19469WaH waH2 = waH;
        this.A02 = waH2;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        this.A00 = dimensionPixelSize;
        int A022 = AnonymousClass7TG.A02(context);
        int A042 = AnonymousClass7TG.A04(context);
        this.A05 = JTR.A05(context);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_button_text_size);
        int i = dimensionPixelSize - (A022 * 2);
        this.A06 = AnonymousClass7TG.A02(context);
        int A08 = C51972G9s.A08(context);
        C15839UjP ujP = new C15839UjP(context);
        int A09 = AnonymousClass7TE.A09(context);
        ujP.A0B(A09);
        float[] fArr = new float[8];
        float f = (float) A08;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = 0.0f;
        C51975G9x.A1L(fArr, 0.0f);
        ujP.A0A.setCornerRadii(fArr);
        ujP.A09(A09);
        ujP.A0A(A042);
        ujP.A0B.A00(new SimpleImageUrl(waH2.A00.A0G));
        if ((waH2.A09() || waH2.A08()) && (drawable = context.getDrawable(R.drawable.subscriptions_crown_badge_drawable)) != null) {
            Drawable drawable2 = ujP.A04;
            if (drawable2 != null) {
                ujP.A0C.remove(drawable2);
            }
            ujP.A04 = drawable;
            ujP.A01 = ujP.A09.getResources().getDimensionPixelSize(R.dimen.ai_agent_share_profile_sticker_padding);
            ujP.A0C.add(ujP.A04);
        }
        this.A03 = ujP;
        String str = waH2.A00.A0M;
        this.A01 = new C59988Jcx(context, dimensionPixelSize, 0, str == null ? "" : str);
        C306386Ly r1 = new C306386Ly(context, i);
        r1.A0J(Typeface.SANS_SERIF, 0);
        r1.A0F(context.getColor(R.color.challenge_sticker_subtitle_text_color));
        r1.A0M(waH2.A04(context, userSession));
        r1.A0A((float) dimensionPixelSize2);
        this.A04 = r1;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A03.draw(canvas);
        this.A01.draw(canvas);
        this.A04.draw(canvas);
    }

    public static final Rect A00(Rect rect, C16142UpT upT, float f) {
        int i = rect.bottom + upT.A05;
        C306386Ly r4 = upT.A04;
        return new Rect((int) (f - (((float) r4.A0A) / 2.0f)), i, (int) (f + (((float) upT.A01.getIntrinsicWidth()) / 2.0f)), r4.A06 + i);
    }

    public final List A07() {
        return 0sr.A1P(new Drawable[]{this.A03, this.A01, this.A04});
    }

    public final int getIntrinsicHeight() {
        int intrinsicHeight = this.A01.getIntrinsicHeight() + this.A05;
        return this.A03.A00 + intrinsicHeight + this.A04.A06 + this.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        float f3 = ((float) this.A00) / 2.0f;
        float intrinsicHeight = f2 - (((float) getIntrinsicHeight()) / 2.0f);
        C15839UjP ujP = this.A03;
        ujP.setBounds(new Rect((int) (f - f3), (int) intrinsicHeight, (int) (f3 + f), (int) (f2 + (((float) getIntrinsicHeight()) / 2.0f))));
        C59988Jcx jcx = this.A01;
        float f4 = intrinsicHeight + ((float) ujP.A00);
        jcx.setBounds(new Rect((int) (f - (((float) jcx.getIntrinsicWidth()) / 2.0f)), (int) f4, (int) ((((float) jcx.getIntrinsicWidth()) / 2.0f) + f), (int) (f4 + ((float) jcx.getIntrinsicHeight()))));
        this.A04.setBounds(A00(AnonymousClass7TE.A0X(jcx), this, f));
    }
}
