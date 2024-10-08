package X;

import android.view.View;
import android.widget.PopupWindow;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.ui.Modifier;

public final class J8Q extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public J8Q(Object obj, Object obj2, int i, int i2, int i3, int i4) {
        super(2);
        this.A00 = i4;
        this.A05 = obj;
        this.A03 = i;
        this.A04 = obj2;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                int i = this.A03;
                AnonymousClass6CY.A04(C51966G9m.A0R(obj, obj2), (Modifier) this.A04, (C62320sa) this.A05, i, C51966G9m.A01(this.A01), this.A02);
                break;
            case 1:
                C52381GQg.A01((LazyListState) this.A05, C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 2:
                C52381GQg.A03((LazyGridState) this.A05, C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            case 3:
                C52381GQg.A04((LazyStaggeredGridState) this.A05, C51966G9m.A0R(obj, obj2), (C62320sa) this.A04, this.A03, C51966G9m.A01(this.A01), this.A02);
                break;
            default:
                View view = (View) obj;
                0qQ.A0B(view, 0);
                View findViewWithTag = view.findViewWithTag(((C56091Hse) this.A04).A01);
                if (findViewWithTag != null) {
                    view = findViewWithTag;
                }
                ((PopupWindow) this.A05).showAsDropDown(view, this.A02, this.A03, this.A01);
                break;
        }
        return C60340gF.A00;
    }
}
