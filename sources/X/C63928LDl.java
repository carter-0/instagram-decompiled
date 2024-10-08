package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.creation.base.ui.grid.GridLinesView;

/* renamed from: X.LDl  reason: case insensitive filesystem */
public final class C63928LDl {
    public final /* synthetic */ View A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ GridLinesView A03;
    public final /* synthetic */ C59962JcV A04;

    public C63928LDl(View view, View view2, View view3, GridLinesView gridLinesView, C59962JcV jcV) {
        this.A04 = jcV;
        this.A03 = gridLinesView;
        this.A01 = view;
        this.A02 = view2;
        this.A00 = view3;
    }

    public final void A00(int i, int i2) {
        C59962JcV jcV = this.A04;
        Integer num = jcV.A0U;
        if (num != null) {
            GridLinesView gridLinesView = this.A03;
            View view = this.A01;
            View view2 = this.A02;
            View view3 = this.A00;
            int intValue = num.intValue();
            int i3 = (intValue - i) / 2;
            int i4 = (intValue - i2) / 2;
            if (2Ht.A02(AnonymousClass7TE.A0l(jcV.A0i))) {
                11Z.A03(new MA9(view, view2, view3, gridLinesView, jcV, i3, i4));
                return;
            }
            Rect rect = new Rect(0, 0, intValue, intValue);
            if (i < intValue) {
                rect.left = i3;
                rect.right -= i3;
            }
            if (i2 < intValue) {
                rect.top = i4;
                rect.bottom -= i4;
            }
            gridLinesView.setGridlinesRect(rect);
            gridLinesView.invalidate();
            11Z.A02(new M9U(view, jcV, i3, i4));
        }
    }
}
