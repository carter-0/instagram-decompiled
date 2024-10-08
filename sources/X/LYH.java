package X;

import android.view.DragEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class LYH implements View.OnDragListener {
    public final /* synthetic */ L0S A00;

    public LYH(L0S l0s) {
        this.A00 = l0s;
    }

    public final boolean onDrag(View view, DragEvent dragEvent) {
        int i;
        Object localState = dragEvent.getLocalState();
        if (!(localState instanceof View) || localState == null) {
            return true;
        }
        L0S l0s = this.A00;
        int action = dragEvent.getAction();
        if (!(Integer.valueOf(action) == null || action != 5 || l0s == null)) {
            0qQ.A0A(view);
            0qQ.A0B(view, 1);
            C64711Lgk lgk = l0s.A00;
            int i2 = lgk.A0J.A00;
            if (lgk.A05 != null) {
                int A03 = RecyclerView.A03(view);
                if (!(Integer.valueOf(A03) == null || i2 == A03)) {
                    if (lgk.A02 == -1) {
                        lgk.A02 = i2;
                    }
                    lgk.A01 = A03;
                    if (i2 >= 0) {
                        lgk.A0K.Coh(i2, A03);
                    }
                }
            }
        }
        if (dragEvent.getAction() != 4 || l0s == null) {
            return true;
        }
        C64711Lgk lgk2 = l0s.A00;
        int i3 = lgk2.A02;
        if (i3 == lgk2.A01 || i3 < 0 || i3 >= JTO.A08(lgk2.A03()) || (i = lgk2.A01) < 0 || i >= JTO.A08(lgk2.A03())) {
            JTT.A1L(lgk2.A0Q, false);
        } else {
            lgk2.A0K.DSS(lgk2.A02, lgk2.A01);
        }
        lgk2.A02 = -1;
        lgk2.A01 = -1;
        lgk2.A0M.A04(-1);
        return true;
    }
}
