package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class U3C extends View {
    public long A00;
    public 0sP A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final Runnable A06 = new C19960WiX(this);
    public final List A07 = new ArrayList();
    public final C18730Vz9 A08;

    public U3C(Context context) {
        super(context, (AttributeSet) null, 0);
        Resources A0B = C66580MXl.A0B(this);
        this.A05 = (float) C18092VlM.A01(A0B, 4.0f);
        this.A04 = (float) C18092VlM.A01(A0B, 15.0f);
        this.A03 = (float) C18092VlM.A01(A0B, -200.0f);
        this.A02 = (float) C18092VlM.A01(A0B, 800.0f);
        this.A08 = C18730Vz9.A00(this, 8);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        for (C17477VXe vXe : this.A07) {
            int save = canvas.save();
            try {
                vXe.A03.A01(canvas);
                vXe.A01.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    public final void onVisibilityChanged(View view, int i) {
        0qQ.A0B(view, 0);
        super.onVisibilityChanged(view, i);
        C18730Vz9.A01(this.A08);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        List<C17477VXe> list = this.A07;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C17477VXe vXe : list) {
                if (0qQ.A0K(vXe.A01, drawable)) {
                    return true;
                }
            }
        }
        if (!super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public final void setOnFinishListener(0sP r1) {
        this.A01 = r1;
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(1778916225);
        super.onWindowVisibilityChanged(i);
        C18730Vz9 vz9 = this.A08;
        vz9.A00 = i;
        C18730Vz9.A01(vz9);
        AnonymousClass0fD.A0D(-582269067, A062);
    }
}
