package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.List;

/* renamed from: X.Jdg  reason: case insensitive filesystem */
public final class C60030Jdg extends GestureDetector.SimpleOnGestureListener {
    public final Context A00;
    public final OU0 A01;
    public final 2MD A02;

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent == null || motionEvent2 == null) {
            0wb.A03("InAppNotificationViewBinder", "MotionEvent null");
            return false;
        } else if (Math.abs(f2) <= Math.abs(f) || motionEvent2.getRawY() >= motionEvent.getRawY()) {
            return false;
        } else {
            2MD r2 = this.A02;
            OU0 ou0 = this.A01;
            2MD.A05(r2, true);
            C66491MTu mTu = ou0.A08;
            if (mTu != null) {
                mTu.onDismiss();
            }
            return true;
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        2MD r5 = this.A02;
        Context context = this.A00;
        OU0 ou0 = this.A01;
        List A022 = r5.A05.A02(context);
        C66491MTu mTu = ou0.A08;
        if (mTu != null) {
            2MD.A05(r5, false);
            mTu.D1x(context);
        } else {
            2MD.A05(r5, true);
        }
        r5.A02.D3O(ou0, A022);
        return true;
    }

    public C60030Jdg(Context context, OU0 ou0, 2MD r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = ou0;
    }
}
