package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.model.fundraiser.NewFundraiserInfo;

/* renamed from: X.8v4  reason: invalid class name and case insensitive filesystem */
public final class C369628v4 extends Drawable {
    public Drawable A00;
    public final AnonymousClass8D5 A01;

    public C369628v4(Context context, UserSession userSession, AnonymousClass8D5 r15) {
        Drawable bitmapDrawable;
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A01 = r15;
        if (!r15.A05 || r15.A04 == null) {
            String str = r15.A02;
            if (str != null) {
                bitmapDrawable = new BitmapDrawable(context.getResources(), 1MF.A02(context, 0cp.A03(str)));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            AE3 ae3 = new AE3("", 0eE.A00(userSession).A00().Bh3().getUrl(), false);
            AnonymousClass8D5 r1 = this.A01;
            AE3 ae32 = new AE3("", r1.A00, false);
            String str2 = r1.A04;
            if (str2 != null) {
                bitmapDrawable = new AnonymousClass9X1(context, userSession, new C3499082j((NewFundraiserInfo) null, ae32, ae3, (String) null, (String) null, r1.A03, "", "", str2, 0));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A00 = bitmapDrawable;
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A00.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return this.A00.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A00.setBounds(i, i2, i3, i4);
    }
}
