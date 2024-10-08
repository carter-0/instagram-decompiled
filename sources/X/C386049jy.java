package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9jy  reason: invalid class name and case insensitive filesystem */
public final class C386049jy extends C268694dq implements C268684dp, C41816B1w, C369878vT {
    public C369848vQ A00;
    public final C369908vW A01;
    public final User A02;
    public final List A03;

    public C386049jy(Context context, Medium medium, User user, String str, int i, int i2, boolean z) {
        Context context2 = context;
        0qQ.A0B(context2, 1);
        User user2 = user;
        this.A02 = user2;
        C369908vW r5 = new C369908vW(context2, (Bitmap) null, medium, (ImageUrl) null, C354668Mx.RECTANGLE, (Integer) null, i, i2, false, false, false, false);
        this.A01 = r5;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A03 = A1C;
        A1C.add(r5);
        if (z) {
            Resources resources = context2.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
            int A0F = AnonymousClass7TE.A0F(resources);
            C369848vQ r15 = new C369848vQ(context2, (Drawable) null, (0qm) null, user2, (String) null, str, A0F, A0F, dimensionPixelSize, dimensionPixelSize2, A0F, false);
            this.A00 = r15;
            A1C.add(r15);
            return;
        }
        this.A00 = null;
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A01.A9D(b1v);
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A01.EE1(b1v);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        C369848vQ r0 = this.A00;
        if (r0 != null) {
            r0.draw(canvas);
        }
    }

    public final List A07() {
        return this.A03;
    }

    public final void AHg() {
        this.A01.AHg();
    }

    public final int BRc() {
        return AnonymousClass7TF.A1V(this.A00) ? 1 : 0;
    }

    public final List BRk() {
        if (this.A00 != null) {
            return AnonymousClass7TE.A1I(this.A02);
        }
        return 0sn.A00;
    }

    public final C369848vQ Bgf() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public final boolean isLoading() {
        if (this.A01.A01 == null) {
            return true;
        }
        return false;
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5;
        super.setBounds(i, i2, i3, i4);
        int i6 = (i + i3) / 2;
        C369848vQ r4 = this.A00;
        if (r4 != null) {
            i5 = r4.A02;
        } else {
            i5 = 0;
        }
        C369908vW r6 = this.A01;
        r6.setBounds(i6 - (r6.getIntrinsicWidth() / 2), i2, (r6.getIntrinsicWidth() / 2) + i6, r6.getIntrinsicHeight() + i2);
        if (r4 != null) {
            r4.setBounds(i6 - (r6.getIntrinsicWidth() / 2), i2, i6 + (r6.getIntrinsicWidth() / 2), i5 + i2);
        }
    }
}
