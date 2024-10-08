package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class Tz8 implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean A00;
    public final int A01;
    public final View A02;
    public final List A03 = Collections.synchronizedList(new LinkedList());

    public final void onGlobalLayout() {
        int i;
        Rect rect = new Rect();
        View view = this.A02;
        view.getWindowVisibleDisplayFrame(rect);
        Display defaultDisplay = ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (view.getRootWindowInsets() != null) {
            defaultDisplay.getRealSize(point);
            i = point.y - view.getRootWindowInsets().getStableInsetBottom();
        } else {
            defaultDisplay.getSize(point);
            i = point.y;
        }
        int i2 = i - rect.bottom;
        boolean z = this.A00;
        int i3 = this.A01;
        if (!z) {
            if (i2 > i3) {
                this.A00 = true;
                List<X7M> list = this.A03;
                synchronized (list) {
                    for (X7M x7m : list) {
                        if (x7m != null) {
                            x7m.Dlk(i2);
                        }
                    }
                }
            }
        } else if (i2 > i3) {
            List<X7M> list2 = this.A03;
            synchronized (list2) {
                for (X7M x7m2 : list2) {
                    if (x7m2 != null) {
                        x7m2.Dlj(i2);
                    }
                }
            }
        } else if (i2 < i3) {
            this.A00 = false;
            List<X7M> list3 = this.A03;
            synchronized (list3) {
                for (X7M x7m3 : list3) {
                    if (x7m3 != null) {
                        x7m3.Dli();
                    }
                }
            }
        }
    }

    public Tz8(View view, boolean z) {
        float f;
        this.A02 = view;
        this.A00 = z;
        float A032 = 100.0f * C13989Tnp.A03(view.getContext());
        if (A032 >= 0.0f) {
            f = A032 + 0.5f;
        } else {
            f = A032 - 0.5f;
        }
        this.A01 = (int) f;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }
}
