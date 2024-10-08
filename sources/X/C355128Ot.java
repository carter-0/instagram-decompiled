package X;

import android.view.View;
import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.8Ot  reason: invalid class name and case insensitive filesystem */
public final class C355128Ot extends C232922uf {
    public final /* synthetic */ ColourWheelView A00;

    public final void DmC(2cs r7) {
        0qQ.A0B(r7, 0);
        if (r7.A01 == 0.0d) {
            ColourWheelView colourWheelView = this.A00;
            ColourWheelView.A03(colourWheelView, AnonymousClass05K.A0N);
            colourWheelView.A0M.A00();
            View view = colourWheelView.A09;
            if (view == null) {
                0qQ.A0F("childButtonView");
                throw AnonymousClass00P.createAndThrow();
            }
            view.setVisibility(0);
            colourWheelView.A0A = false;
        }
    }

    public final void DmD(2cs r8) {
        0qQ.A0B(r8, 0);
        if (r8.A01 == 0.0d) {
            r8.A06 = true;
            ColourWheelView colourWheelView = this.A00;
            ColourWheelView.A03(colourWheelView, AnonymousClass05K.A0C);
            if (r8.A09.A00 == 0.0d) {
                ColourWheelView.A03(colourWheelView, AnonymousClass05K.A0N);
                colourWheelView.A0M.A00();
                View view = colourWheelView.A09;
                if (view == null) {
                    0qQ.A0F("childButtonView");
                    throw AnonymousClass00P.createAndThrow();
                }
                view.setVisibility(0);
                colourWheelView.A0A = false;
                return;
            }
            return;
        }
        r8.A06 = false;
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        ColourWheelView colourWheelView = this.A00;
        colourWheelView.A00 = (float) r5.A09.A00;
        colourWheelView.invalidate();
    }

    public C355128Ot(ColourWheelView colourWheelView) {
        this.A00 = colourWheelView;
    }
}
