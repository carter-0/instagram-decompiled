package X;

import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8cs  reason: invalid class name and case insensitive filesystem */
public final class C359468cs implements View.OnLayoutChangeListener {
    public final Rect A00;
    public final List A01;
    public final /* synthetic */ C359318cb A02;

    public C359468cs(C359318cb r2) {
        this.A02 = r2;
        Rect rect = new Rect();
        this.A00 = rect;
        List singletonList = Collections.singletonList(rect);
        0qQ.A07(singletonList);
        this.A01 = singletonList;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.A02.A0U;
        Display display = view2.getDisplay();
        if (display != null) {
            display.getRectSize(this.A00);
        }
        03v.A0H(view2, this.A01);
    }
}
