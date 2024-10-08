package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryJoinChatStatus;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8v8  reason: invalid class name and case insensitive filesystem */
public final class C369668v8 extends C299875vz implements C268714ds, C300645xY {
    public final int A00;
    public final C16142UpT A01;
    public final C389519pl A02;
    public final C19469WaH A03;

    public C369668v8(Context context, UserSession userSession, C19469WaH waH) {
        0qQ.A0B(waH, 3);
        this.A03 = waH;
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.chat_sticker_width);
        this.A01 = new C16142UpT(context, userSession, waH);
        this.A02 = new C389519pl(context, userSession, waH);
    }

    public final void A0B(Context context, StoryJoinChatStatus storyJoinChatStatus, UserSession userSession) {
        0qQ.A0B(context, 1);
        this.A03.A06(storyJoinChatStatus);
        C389519pl r3 = this.A02;
        C306386Ly r2 = r3.A04;
        r2.A0M(r3.A03.A03(context, userSession));
        float centerX = (float) r3.getBounds().centerX();
        Rect bounds = r3.A05.getBounds();
        0qQ.A07(bounds);
        r2.setBounds(C389519pl.A00(bounds, r3, centerX));
        r3.invalidateSelf();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A02.draw(canvas);
    }

    public final List A07() {
        return 0sr.A1P(new C299875vz[]{this.A01, this.A02});
    }

    public final C2802350v BzV() {
        return this.A03;
    }

    public final String C4F() {
        int i;
        if (this.A03.A09()) {
            i = 191;
        } else {
            i = 82;
        }
        return C273654mx.A00(i);
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight() + this.A02.A00;
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
        C16142UpT upT = this.A01;
        int i5 = (int) (f - f3);
        int i6 = (int) intrinsicHeight;
        int i7 = (int) (f + f3);
        int intrinsicHeight2 = (int) (f2 + (((float) getIntrinsicHeight()) / 2.0f));
        C389519pl r2 = this.A02;
        int i8 = intrinsicHeight2 - r2.A00;
        upT.setBounds(new Rect(i5, i6, i7, i8));
        r2.setBounds(new Rect(i5, i8, i7, intrinsicHeight2));
    }
}
