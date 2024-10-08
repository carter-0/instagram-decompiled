package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

public final class U3D extends View {
    public final U1F A00;
    public final C18730Vz9 A01 = C18730Vz9.A00(this, 5);

    public U3D(Context context, U1F u1f) {
        super(context, (AttributeSet) null, 0);
        this.A00 = u1f;
        u1f.setCallback(this);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A00.draw(canvas);
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A01);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        if (drawable.equals(this.A00) || super.verifyDrawable(drawable)) {
            return true;
        }
        return false;
    }

    public final int getCornerRadiusPx() {
        return this.A00.A00;
    }

    public final void setCornerRadiusPx(int i) {
        U1F u1f = this.A00;
        if (u1f.A00 != i) {
            u1f.A00 = i;
            u1f.A01 = true;
            u1f.invalidateSelf();
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        U1F u1f = this.A00;
        u1f.setBounds(getPaddingLeft(), getPaddingTop(), C13989Tnp.A0G(this), C13989Tnp.A0F(this));
        u1f.A01(Pxg.A1T(JTP.A06(u1f), C18092VlM.A00(AnonymousClass7TE.A0S(this), 50.0f)));
    }

    public final void onWindowVisibilityChanged(int i) {
        int A06 = AnonymousClass0fD.A06(1408776365);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A01;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(-1712521601, A06);
    }
}
