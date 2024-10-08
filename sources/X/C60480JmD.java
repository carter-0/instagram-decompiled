package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.JmD  reason: case insensitive filesystem */
public final class C60480JmD extends C64337LaC {
    public float A00;
    public float A01;
    public float A02;
    public C249703kE A03;
    public L1C A04;
    public boolean A05;
    public final float A06;
    public final Context A07;
    public final C60452Jlk A08;
    public final C328257Ec A09;
    public final List A0A;
    public final List A0B = AnonymousClass7TE.A1C();
    public final boolean A0C;

    public static final boolean A00(C60480JmD jmD, float f, float f2) {
        boolean A1S = AnonymousClass7TF.A1S(C51970G9q.A1T((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))) ? 1 : 0, jmD.A0C ? 1 : 0);
        if (!jmD.A05) {
            if (!A1S) {
                return false;
            }
            float abs = Math.abs(f);
            if (abs <= Math.abs(f2) || abs <= ((float) ViewConfiguration.get(jmD.A07).getScaledTouchSlop())) {
                return false;
            }
        }
        return true;
    }

    public final boolean DLA(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1U = AnonymousClass7TF.A1U(0, recyclerView, motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != A1U) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        return false;
                    }
                } else if (!A00(this, motionEvent.getX() - this.A00, motionEvent.getY() - this.A01)) {
                    return false;
                } else {
                    this.A05 = A1U;
                    JTP.A15(recyclerView, A1U);
                    return true;
                }
            }
            this.A05 = false;
            this.A0B.clear();
            this.A03 = null;
            JTP.A15(recyclerView, A1U);
            return false;
        }
        this.A00 = motionEvent.getX();
        this.A01 = motionEvent.getY();
        return false;
    }

    public C60480JmD(Context context, List list) {
        this.A07 = context;
        this.A0A = list;
        this.A0C = 0mk.A02(context);
        C328257Ec r0 = new C328257Ec(context);
        this.A09 = r0;
        this.A06 = r0.A02 + r0.A03;
        this.A08 = new C60452Jlk(this);
    }
}
