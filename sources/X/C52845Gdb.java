package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: X.Gdb  reason: case insensitive filesystem */
public final class C52845Gdb extends View {
    public final C56003Hr9 A00;

    public C52845Gdb(Context context) {
        super(context, (AttributeSet) null, 0);
        this.A00 = new C56003Hr9(context);
    }

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        this.A00.A00(canvas, getWidth(), getHeight());
    }

    public final void setBorderColor(int i) {
        this.A00.A00 = i;
    }

    public final void setBorderEnabled(boolean z) {
        this.A00.A02 = z;
    }

    public final void setInfoText(String str) {
        this.A00.A01 = str;
    }
}
