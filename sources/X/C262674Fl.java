package X;

import android.text.Layout;
import com.instagram.ui.widget.textview.IgTextLayoutView;

/* renamed from: X.4Fl  reason: invalid class name and case insensitive filesystem */
public final class C262674Fl implements AnonymousClass2WK {
    public final Layout A00;

    public C262674Fl(Layout layout) {
        0qQ.A0B(layout, 1);
        this.A00 = layout;
    }

    public final /* bridge */ /* synthetic */ boolean CSo(Object obj) {
        0qQ.A0B(obj, 1);
        return C245173cR.A03(this, obj);
    }

    public final 2WL Cfk(2WI r5, long j) {
        0qQ.A0B(r5, 0);
        IgTextLayoutView igTextLayoutView = new IgTextLayoutView(r5.A00.A04);
        igTextLayoutView.setTextLayout(this.A00);
        igTextLayoutView.measure(C245063cG.A01(j), C245063cG.A00(j));
        return new 2WL(C245133cN.A00(Math.max(C245073cH.A03(j), igTextLayoutView.getMeasuredWidth()), Math.max(C245073cH.A02(j), igTextLayoutView.getMeasuredHeight())), (Object) null);
    }
}
