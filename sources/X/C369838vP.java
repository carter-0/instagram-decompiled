package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;

/* renamed from: X.8vP  reason: invalid class name and case insensitive filesystem */
public final class C369838vP extends Drawable implements AnonymousClass5MJ, C300645xY, C369788vK, B1L {
    public final Drawable A00;
    public final C388329ne A01;
    public final 1sw A02;
    public final ProductType A03 = ProductType.CLIPS;
    public final String A04;

    public C369838vP(Context context, Drawable drawable, UserSession userSession, AnonymousClass82f r5, 1sw r6) {
        0qQ.A0B(r6, 5);
        this.A00 = drawable;
        this.A02 = r6;
        C388329ne r0 = new C388329ne(context, userSession, r5);
        this.A01 = r0;
        this.A04 = r0.C4F();
    }

    public final /* synthetic */ void EqG() {
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A00.draw(canvas);
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A01.setBounds(rect);
        this.A00.setBounds(rect);
        invalidateSelf();
    }

    public final Drawable Aco() {
        return this.A00;
    }

    public final 1sw BRP() {
        return this.A02;
    }

    public final ProductType BgY() {
        return this.A03;
    }

    public final C2802350v BzV() {
        return this.A01.A09;
    }

    public final String C4F() {
        return this.A04;
    }

    public final void EXC(int i, int i2) {
        this.A01.A01 = i;
    }

    public final int getDurationInMs() {
        return this.A01.getDurationInMs();
    }

    public final int getIntrinsicHeight() {
        return this.A01.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A01.getIntrinsicWidth();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }
}
