package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.LYa  reason: case insensitive filesystem */
public final class C64274LYa implements View.OnTouchListener {
    public final /* synthetic */ LBQ A00;

    public C64274LYa(LBQ lbq) {
        this.A00 = lbq;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        LBQ lbq = this.A00;
        MotionEvent motionEvent2 = motionEvent;
        boolean onTouchEvent = lbq.A0C.onTouchEvent(motionEvent2);
        float rawX = lbq.A00 - motionEvent2.getRawX();
        float rawY = lbq.A01 - motionEvent2.getRawY();
        if (!lbq.A08 && !lbq.A07) {
            boolean z = false;
            boolean A1R = AnonymousClass7TF.A1R((JTR.A00(rawX, rawY) > ((double) lbq.A0B) ? 1 : (JTR.A00(rawX, rawY) == ((double) lbq.A0B) ? 0 : -1)));
            double A002 = JTS.A00(rawY, rawX);
            if (A1R) {
                if (A002 < 45.0d) {
                    lbq.A07 = true;
                } else {
                    if (lbq.A01 > ((float) lbq.A0A)) {
                        z = true;
                    }
                    lbq.A08 = z;
                }
            }
        }
        int actionMasked = motionEvent2.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return onTouchEvent;
        }
        int i = 0;
        while (true) {
            List list = lbq.A0G;
            if (i < list.size()) {
                boolean z2 = lbq.A07;
                boolean z3 = lbq.A08;
                ((AnonymousClass88I) list.get(i)).DHo(lbq.A03, lbq.A04, lbq.A00, lbq.A01, lbq.A02, z2, z3);
                i++;
            } else {
                lbq.A02 = 0.0f;
                lbq.A03 = 0.0f;
                lbq.A04 = 0.0f;
                return onTouchEvent;
            }
        }
    }
}
