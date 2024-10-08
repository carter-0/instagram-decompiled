package X;

import android.content.Context;
import android.graphics.Canvas;
import com.instagram.api.schemas.FanClubStoriesTeaserType;
import java.util.List;

/* renamed from: X.UjM  reason: case insensitive filesystem */
public final class C15836UjM extends C268694dq {
    public final C306386Ly A00;

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final List A07() {
        return AnonymousClass7TE.A1I(this.A00);
    }

    public final int getIntrinsicHeight() {
        return this.A00.A06;
    }

    public final int getIntrinsicWidth() {
        return this.A00.A0A;
    }

    public C15836UjM(Context context, FanClubStoriesTeaserType fanClubStoriesTeaserType) {
        float A04 = 0nA.A04(context, 14);
        C306386Ly r2 = new C306386Ly(context, (int) 0nA.A04(context, 270));
        this.A00 = r2;
        r2.A0I(AnonymousClass7TG.A0N(context));
        r2.A0A(A04);
        r2.A0F(C13988Tno.A08(context));
        r2.A0M(context.getString(fanClubStoriesTeaserType == FanClubStoriesTeaserType.A04 ? 2131974637 : 2131974636));
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = ((float) (i + i3)) / 2.0f;
        float f2 = ((float) (i2 + i4)) / 2.0f;
        C306386Ly r5 = this.A00;
        float f3 = ((float) r5.A0A) / 2.0f;
        float f4 = (float) (r5.A06 / 2);
        r5.setBounds((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
