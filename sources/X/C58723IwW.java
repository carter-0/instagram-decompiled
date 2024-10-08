package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.IwW  reason: case insensitive filesystem */
public final class C58723IwW extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58723IwW(int i, int i2) {
        super(1);
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        C70722Uo r6 = (C70722Uo) obj;
        0qQ.A0B(r6, 0);
        Object obj2 = r6.A00;
        if ((obj2 instanceof View) && (view = (View) obj2) != null) {
            int i = this.A01;
            int i2 = this.A00;
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ID8(i, i2));
            } else {
                C51976G9y.A0P(new Rect(0, 0, i, i2), view, i, i2);
            }
        }
        return C60340gF.A00;
    }
}
