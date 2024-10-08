package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class Q8c extends View {
    public List A00;
    public final HashMap A01 = AnonymousClass7TE.A1E();
    public final HashMap A02 = AnonymousClass7TE.A1E();
    public final Paint A03;
    public final Paint A04;

    public final void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.onDraw(canvas);
        Iterator A0t = AnonymousClass7TF.A0t(this.A02);
        while (A0t.hasNext()) {
            C10555Ru9 ru9 = (C10555Ru9) A0t.next();
            Paint paint = this.A04;
            paint.setColor(ru9.A00);
            canvas.drawRect(ru9.A02, paint);
            int i = ru9.A01;
            TGA tga = new TGA(this, i);
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(i);
            if (!hashMap.containsKey(valueOf)) {
                hashMap.put(valueOf, tga);
                C18773W0w.A00().postDelayed(tga, 2000);
            }
        }
        for (RectF drawRect : this.A00) {
            canvas.drawRect(drawRect, this.A03);
        }
    }

    public final void setHighlightedElementsRectangles(List list) {
        0qQ.A0B(list, 0);
        this.A00 = list;
        invalidate();
    }

    public final void setTraceUpdates(List list) {
        0qQ.A0B(list, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10555Ru9 ru9 = (C10555Ru9) it.next();
            int i = ru9.A01;
            HashMap hashMap = this.A01;
            Integer valueOf = Integer.valueOf(i);
            if (hashMap.containsKey(valueOf)) {
                C18773W0w.A00().removeCallbacks((Runnable) hashMap.get(valueOf));
                hashMap.remove(valueOf);
            }
            this.A02.put(valueOf, ru9);
        }
        invalidate();
    }

    public Q8c(Context context) {
        super(context);
        Paint paint = new Paint();
        this.A04 = paint;
        Paint paint2 = new Paint();
        this.A03 = paint2;
        this.A00 = AnonymousClass7TE.A1C();
        JTO.A1N(paint);
        paint.setStrokeWidth(6.0f);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-859248897);
    }
}
