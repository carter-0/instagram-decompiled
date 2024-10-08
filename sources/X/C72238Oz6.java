package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.Oz6  reason: case insensitive filesystem */
public final class C72238Oz6 implements C301525zS {
    public final /* synthetic */ C71139Odj A00;

    public final void D1n(MotionEvent motionEvent, View view) {
    }

    public final void DKQ(ReboundHorizontalScrollView reboundHorizontalScrollView, int i, int i2) {
        0qQ.A0B(reboundHorizontalScrollView, 0);
        if (i >= 0) {
            C71139Odj odj = this.A00;
            if (i < C71139Odj.A02(odj).size()) {
                C301495zP r1 = reboundHorizontalScrollView.A07;
                if (r1 != C301495zP.SETTLING) {
                    if (r1 == C301495zP.DRAGGING) {
                        2cs r0 = reboundHorizontalScrollView.A0I;
                        if (Math.abs(r0.A01 - r0.A03) > 50.0d) {
                            return;
                        }
                    }
                    if (i2 != i) {
                        C71139Odj.A06(odj, i2, i, true);
                        C71139Odj.A03(odj);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        0wb.A03("RtcArEffectPickerTabController", "tab index out of bound.");
    }

    public final void DhW(C301495zP r1, C301495zP r2, ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public final void Dqc(View view, int i) {
        view.setSelected(true);
    }

    public final void DsU(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public final void Dse(ReboundHorizontalScrollView reboundHorizontalScrollView) {
    }

    public C72238Oz6(C71139Odj odj) {
        this.A00 = odj;
    }

    public final void DhI(ReboundHorizontalScrollView reboundHorizontalScrollView, float f, int i, int i2) {
        if (reboundHorizontalScrollView.A07 == C301495zP.SETTLING && Math.abs(reboundHorizontalScrollView.getVelocity()) < 1000.0f) {
            C71139Odj odj = this.A00;
            int indexOf = C71139Odj.A02(odj).indexOf(odj.A02);
            int currentChildIndex = reboundHorizontalScrollView.getCurrentChildIndex();
            if (indexOf != currentChildIndex) {
                C71139Odj.A06(odj, indexOf, currentChildIndex, true);
                C71139Odj.A03(odj);
            }
        }
    }
}
