package X;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import java.util.List;

/* renamed from: X.SEt  reason: case insensitive filesystem */
public final class C11193SEt {
    public static Integer A03;
    public C11517Sbe A00;
    public final View A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public static int A00(C11193SEt sEt, int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 <= 0) {
            i4 = 0;
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = sEt.A01;
            if (!view.isLayoutRequested() && i2 == -2) {
                Log.isLoggable("ViewTarget", 4);
                Context context = view.getContext();
                Integer num = A03;
                if (num == null) {
                    Object systemService = context.getSystemService("window");
                    C9217RTu.A00(systemService);
                    Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    num = Integer.valueOf(Math.max(point.x, point.y));
                    A03 = num;
                }
                return num.intValue();
            }
        }
        return i4;
    }

    public C11193SEt(View view) {
        this.A01 = view;
    }
}
