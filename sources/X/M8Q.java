package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.arlink.ui.CoachMarkOverlay;

public final /* synthetic */ class M8Q implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C64148LQl A01;
    public final /* synthetic */ Integer A02;

    public /* synthetic */ M8Q(View view, C64148LQl lQl, Integer num) {
        this.A01 = lQl;
        this.A00 = view;
        this.A02 = num;
    }

    public final void run() {
        int height;
        C64148LQl lQl = this.A01;
        View view = this.A00;
        Integer num = this.A02;
        int A03 = JTP.A03(lQl.A08.getResources());
        RectF A0F = 0nA.A0F(view);
        View view2 = lQl.A02;
        view2.getClass();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
        if (num.intValue() != 0) {
            height = ((int) A0F.bottom) + A03;
        } else {
            height = (((int) A0F.top) - lQl.A02.getHeight()) - A03;
        }
        marginLayoutParams.topMargin = height;
        lQl.A02.setLayoutParams(marginLayoutParams);
        lQl.A02.setVisibility(0);
        CoachMarkOverlay coachMarkOverlay = lQl.A06;
        coachMarkOverlay.getClass();
        coachMarkOverlay.setVisibility(0);
    }
}
