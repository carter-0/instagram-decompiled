package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class U3F extends View {
    public final U1L A00;
    public final C17416VUv A01;
    public final C18730Vz9 A02 = C18730Vz9.A00(this, 6);

    public U3F(Context context, U1F u1f) {
        super(context, (AttributeSet) null, 0);
        this.A01 = new C17416VUv(this, u1f);
        U1L u1l = new U1L(context);
        u1l.setCallback(this);
        this.A00 = u1l;
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A01.A02.draw(canvas);
        this.A00.draw(canvas);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A02);
    }

    public final void setTargetId(String str) {
        0qQ.A0B(str, 0);
        U1L u1l = this.A00;
        if (!0qQ.A0K(u1l.A04, str)) {
            u1l.A04 = str;
            U1L.A00(u1l);
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable.equals(this.A00) || drawable == this.A01.A02 || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public final int getCornerRadiusPx() {
        return this.A01.A02.A00;
    }

    public final AnonymousClass7NA getFlareDrawableFactory() {
        return this.A00.A03;
    }

    public final String getTargetId() {
        return this.A00.A04;
    }

    public final void setCornerRadiusPx(int i) {
        U1F u1f = this.A01.A02;
        if (u1f.A00 != i) {
            u1f.A00 = i;
            u1f.A01 = true;
            u1f.invalidateSelf();
        }
        U1L u1l = this.A00;
        if (u1l.A00 != i) {
            u1l.A00 = i;
            if (u1l.A01 != null) {
                u1l.A05 = true;
                u1l.invalidateSelf();
            }
        }
    }

    public final void setFlareDrawableFactory(AnonymousClass7NA r2) {
        this.A00.A03 = r2;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C17416VUv vUv = this.A01;
        U1F u1f = vUv.A02;
        View view = vUv.A01;
        u1f.setBounds(view.getPaddingLeft(), view.getPaddingTop(), C13989Tnp.A0G(view), C13989Tnp.A0F(view));
        u1f.A01(C51970G9q.A1W(JTP.A06(u1f), C18092VlM.A00(AnonymousClass7TE.A0S(view), 50.0f)));
        this.A00.setBounds(getPaddingLeft(), getPaddingTop(), C13989Tnp.A0G(this), C13989Tnp.A0F(this));
    }

    public final void onWindowVisibilityChanged(int i) {
        int A06 = AnonymousClass0fD.A06(-63257743);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A02;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(965453132, A06);
    }
}
