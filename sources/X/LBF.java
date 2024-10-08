package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public final class LBF {
    public int A00;
    public View A01;
    public LGg A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final C66027M8m A07;
    public final List A08;
    public final List A09;
    public final List A0A;
    public final List A0B;

    public /* synthetic */ LBF(View view, View view2, View view3, View view4, List list, List list2) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        this.A04 = view;
        this.A05 = view2;
        this.A03 = view3;
        this.A06 = view4;
        this.A09 = list;
        this.A08 = list2;
        this.A0B = A1C;
        this.A0A = A1C2;
        this.A07 = new C66027M8m(view, MP5.A00(this, 33));
        view.setOnDragListener(new LYK(view, this));
    }
}
