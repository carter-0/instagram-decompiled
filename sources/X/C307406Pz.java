package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Pz  reason: invalid class name and case insensitive filesystem */
public abstract class C307406Pz {
    public static final void A00(UserSession userSession, C255773uh r7, C309746Zl r8, C307086Ot r9) {
        0qQ.A0B(r9, 1);
        C252063oV r2 = r9.A07;
        Context context = r2.getView().getContext();
        A01(r9);
        float A01 = (float) 182.A01(0Tu.A05, userSession, 36599529453391440L);
        0qQ.A0A(context);
        String A07 = AnonymousClass4EQ.A07(context, userSession, r7);
        if (r9.A04 != null) {
            if (A07 != null) {
                r9.A01().setText(A07);
            }
            if (A01 > 0.0f) {
                r9.A01().setTextSize(A01);
            }
        }
        if (r9.A03 != null) {
            r9.A00().setOnTouchListener((View.OnTouchListener) null);
            r9.A00().setClickable(true);
            r9.A00().setOnTouchListener(new AnonymousClass6LS(r7, r8, r9));
        }
        if (r9.A04 != null) {
            r9.A01().setOnTouchListener((View.OnTouchListener) null);
            r9.A01().setClickable(true);
            r9.A01().setOnTouchListener(new AP7(r7, r8, r9));
        }
        if (r2.CVM()) {
            r2.setVisibility(0);
        }
    }

    public static final void A01(C307086Ot r2) {
        0qQ.A0B(r2, 0);
        C252063oV r1 = r2.A07;
        if (r1.CVM()) {
            r1.setVisibility(8);
        }
        r2.A02();
        if (r2.A04 != null) {
            r2.A01().setText("");
        }
    }

    public static final boolean A02(MotionEvent motionEvent, View view, float[] fArr, int[] iArr) {
        int action = motionEvent.getAction();
        if (action == 0 || action != 1) {
            return false;
        }
        float rawX = motionEvent.getRawX() - ((float) iArr[0]);
        float rawY = motionEvent.getRawY() - ((float) iArr[1]);
        if (0.0f > rawX || rawX > ((float) view.getWidth()) || 0.0f > rawY || rawY > ((float) view.getHeight())) {
            return false;
        }
        fArr[0] = motionEvent.getRawX();
        fArr[1] = motionEvent.getRawY();
        return true;
    }
}
