package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;

public final class QEg extends AnonymousClass3B3 {
    public final Calendar A00 = Pxj.A0u();
    public final Calendar A01 = Pxj.A0u();
    public final /* synthetic */ QCH A02;

    public QEg(QCH qch) {
        this.A02 = qch;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r26) {
        Object obj;
        int i;
        int width;
        RecyclerView recyclerView2 = recyclerView;
        QEX qex = recyclerView2.A0A;
        if (qex instanceof QEX) {
            C252553pI r6 = recyclerView2.A0D;
            if (r6 instanceof GridLayoutManager) {
                QEX qex2 = qex;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) r6;
                QCH qch = this.A02;
                Iterator it = qch.A06.Brq().iterator();
                while (it.hasNext()) {
                    AnonymousClass34S r1 = (AnonymousClass34S) it.next();
                    Object obj2 = r1.A00;
                    if (!(obj2 == null || (obj = r1.A01) == null)) {
                        Calendar calendar = this.A01;
                        calendar.setTimeInMillis(AnonymousClass7TE.A0R(obj2));
                        Calendar calendar2 = this.A00;
                        calendar2.setTimeInMillis(AnonymousClass7TE.A0R(obj));
                        int i2 = calendar.get(1);
                        QCH qch2 = qex2.A00;
                        int i3 = i2 - qch2.A04.A05.A04;
                        int i4 = calendar2.get(1) - qch2.A04.A05.A04;
                        View A1D = gridLayoutManager.A1D(i3);
                        View A1D2 = gridLayoutManager.A1D(i4);
                        int i5 = gridLayoutManager.A00;
                        int i6 = i3 / i5;
                        int i7 = i4 / i5;
                        for (int i8 = i6; i8 <= i7; i8++) {
                            View A1D3 = gridLayoutManager.A1D(gridLayoutManager.A00 * i8);
                            if (A1D3 != null) {
                                int top = A1D3.getTop() + qch.A05.A07.A00.top;
                                int bottom = A1D3.getBottom() - qch.A05.A07.A00.bottom;
                                if (i8 == i6) {
                                    i = A1D.getLeft() + (A1D.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i8 == i7) {
                                    width = A1D2.getLeft() + (A1D2.getWidth() / 2);
                                } else {
                                    width = recyclerView2.getWidth();
                                }
                                float f = (float) i;
                                float f2 = f;
                                canvas.drawRect(f2, (float) top, (float) width, (float) bottom, qch.A05.A00);
                            }
                        }
                    }
                }
            }
        }
    }
}
