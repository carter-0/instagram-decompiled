package X;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7Ng  reason: invalid class name and case insensitive filesystem */
public final class C330547Ng extends AnonymousClass3B3 {
    public final /* synthetic */ C330537Nf A00;

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r7) {
        Integer num;
        0qQ.A0B(canvas, 0);
        0qQ.A0B(recyclerView, 1);
        0qQ.A0B(r7, 2);
        C330537Nf r3 = this.A00;
        AnonymousClass7PM r2 = r3.A05;
        if (r2 != null) {
            float f = r3.A00;
            if (r3.A07 || !r3.A06) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            r2.DAn(canvas, num, f);
        }
    }

    public C330547Ng(C330537Nf r1) {
        this.A00 = r1;
    }
}
