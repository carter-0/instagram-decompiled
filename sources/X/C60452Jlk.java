package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlk  reason: case insensitive filesystem */
public final class C60452Jlk extends AnonymousClass3B3 {
    public final /* synthetic */ C60480JmD A00;

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r16) {
        View view;
        Canvas canvas2 = canvas;
        AnonymousClass7TG.A1N(canvas, recyclerView);
        0qQ.A0B(r16, 2);
        C60480JmD jmD = this.A00;
        View view2 = (View) 00k.A0J(jmD.A0B);
        C249703kE r0 = jmD.A03;
        if (r0 != null) {
            view = r0.itemView;
        } else {
            view = null;
        }
        if (Math.abs(jmD.A02) > 0.0f && view2 != null && view != null) {
            float top = (float) (view.getTop() + view2.getTop() + (view2.getHeight() / 2));
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            float f = (float) iArr[0];
            float abs = Math.abs(jmD.A02);
            C328257Ec r5 = jmD.A09;
            float right = (float) view2.getRight();
            r5.A01(canvas2, C51967G9n.A0l(jmD.A0C ? 1 : 0), AnonymousClass05K.A00, abs, top, f - abs, right);
        }
    }

    public C60452Jlk(C60480JmD jmD) {
        this.A00 = jmD;
    }
}
