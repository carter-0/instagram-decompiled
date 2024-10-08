package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.9pw  reason: invalid class name and case insensitive filesystem */
public final class C389629pw extends C299875vz implements C268714ds {
    public final C19476WaO A00;
    public final C16146UpX A01;
    public final boolean A02;
    public final boolean A03;
    public final List A04;

    public C389629pw(Context context, UserSession userSession, C19476WaO waO, String str, boolean z) {
        0qQ.A0B(context, 2);
        this.A00 = waO;
        C16146UpX upX = new C16146UpX(context, userSession, waO, str, z);
        this.A01 = upX;
        boolean z2 = true;
        this.A04 = 0sr.A1M(new Drawable[]{upX});
        this.A03 = waO.A02;
        this.A02 = waO.A00.A06 != null ? false : z2;
        upX.setCallback(this);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
    }

    public final List A07() {
        return this.A04;
    }

    public final C2802350v BzV() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A01.A06;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        this.A01.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A01.setBounds(i, i2, i3, i4);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C389629pw(Context context, UserSession userSession, C19476WaO waO, String str) {
        this(context, userSession, waO, str, false);
        AnonymousClass7TG.A1U(userSession, context, waO);
    }
}
