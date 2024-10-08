package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

public final class MA9 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ GridLinesView A05;
    public final /* synthetic */ C59962JcV A06;

    public MA9(View view, View view2, View view3, GridLinesView gridLinesView, C59962JcV jcV, int i, int i2) {
        this.A05 = gridLinesView;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = view;
        this.A06 = jcV;
        this.A04 = view2;
        this.A02 = view3;
    }

    public final void run() {
        int i;
        GridLinesView gridLinesView = this.A05;
        gridLinesView.A02 = false;
        int i2 = this.A00;
        int i3 = this.A01;
        0nA.A0j(gridLinesView, i2, i3, i2, i3);
        View view = this.A03;
        if (view != null) {
            0nA.A0j(view, i2, i3, i2, i3);
        }
        C59962JcV jcV = this.A06;
        UserSession A0l = AnonymousClass7TE.A0l(jcV.A0i);
        if (182.A06(DbS.A0J(A0l, 0), A0l, 36315473202449645L)) {
            View view2 = this.A04;
            View view3 = this.A02;
            if (i2 > 0 || i3 > 0) {
                view2.setVisibility(0);
                view3.setVisibility(0);
                if (i2 > 0) {
                    0nA.A0f(view2, i2);
                    0nA.A0V(view2, -1);
                    0nA.A0W(view2, 8388611);
                    0nA.A0f(view3, i2);
                    0nA.A0V(view3, -1);
                    i = 8388613;
                } else {
                    0nA.A0f(view2, -1);
                    0nA.A0V(view2, i3);
                    0nA.A0W(view2, 48);
                    0nA.A0f(view3, -1);
                    0nA.A0V(view3, i3);
                    i = 80;
                }
                0nA.A0W(view3, i);
            } else {
                view2.setVisibility(8);
                view3.setVisibility(8);
            }
        }
        InteractiveDrawableContainer interactiveDrawableContainer = jcV.A0T;
        if (interactiveDrawableContainer != null) {
            0nA.A0j(interactiveDrawableContainer, i2, i3, i2, i3);
        }
    }
}
